from flask import Flask, jsonify, abort, make_response, request
from app.accommodation import Accommodation

app = Flask(__name__)

accommodations = {'1': Accommodation(2, 234, 780000, 3490),
                  '2': Accommodation(45, 7896, 4565, 23)}


@app.route('/accommodation/<id>', methods=['GET'])
def get_accommodation(id):
    if id in accommodations:
        return accommodations[id].__dict__.__str__()
    else:
        abort(404)


@app.route('/accommodation', methods=['POST'])
def post_accommodation():
    post_data = request.get_json()
    id = post_data['id']
    number_of_rooms = post_data['number_of_rooms']
    price = post_data['price']
    area = post_data['area']
    latitude = post_data['latitude']
    new_accommodation = Accommodation(number_of_rooms, price, area, latitude)
    accommodations[id] = new_accommodation
    return 'Posted  ' + str(accommodations.get(id).number_of_rooms)


@app.route('/accommodation', methods=['PUT'])
def put_accommodation():
    post_data = request.get_json()
    id = post_data['id']
    number_of_rooms = post_data['number_of_rooms']
    price = post_data['price']
    area = post_data['area']
    latitude = post_data['latitude']
    new_accommodation = Accommodation(number_of_rooms, price, area, latitude)
    accommodations[id] = new_accommodation
    return 'Put'


@app.route('/accommodation/<id>', methods=['DELETE'])
def delete_accommodation(id):
    accommodations.pop(id)
    return 'Deleted'


@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({'error': 'Not found'}), 404)


if __name__ == '__main__':
    app.run(debug=True)
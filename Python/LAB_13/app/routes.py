from flask import Flask, jsonify, abort, make_response, request
from app.insurance import Insurance

app = Flask(__name__)

insurances = {'1': Insurance("Name", 18, 60, 14000, "personal")}


@app.route('/insurance/<id>', methods=['GET'])
def get_insurance(id):
    if id in insurances:
        return insurances[id].__dict__.__str__()
    else:
        abort(404)


@app.route('/insurance', methods=['POST'])
def post_insurance():
    post_data = request.get_json()
    id = post_data['id']
    name = post_data['name']
    risk = post_data['risk']
    cost = post_data['cost']
    duration = post_data['duration']
    type = post_data['type']
    new_insurance = Insurance(name, risk, cost, duration, type)
    insurances[id] = new_insurance
    return 'Posted'

@app.route('/insurance', methods=['PUT'])
def put_insurance():
    post_data = request.get_json()
    id = post_data['id']
    name = post_data['name']
    risk = post_data['risk']
    cost = post_data['cost']
    duration = post_data['duration']
    type = post_data['type']
    new_insurance = Insurance(name, risk, cost, duration, type)
    insurances[id] = new_insurance
    return 'Put'


@app.route('/insurance/<id>', methods=['DELETE'])
def delete_insurance(id):
    insurances.pop(id)
    return 'Deleted'


if __name__ == '__main__':
    app.run(debug=True)

from flask import request, Flask
from app import app
from app import db
from insurances import Insurances

from app import ma


class InsuranceStructure(ma.Schema):
    class Meta:
        fields = ('id', 'name', 'risk', 'cost','duration')


@app.route('/')
def index():
    return '<h1> Ok! </h1>'


@app.route('/insurances')
def view():
    insurances = Insurances.query.first()#query-запит
    if insurances is not None:
        return str('First member name \n' + insurances.__str__())
    else:
        return "Id does not exist"


@app.route('/insurances/<id>', methods=['GET'])
def get_insurances(id):
    decoration = Insurances.query.get(id)
    if decoration is not None:
        return decoration.__str__()
    else:
        return "Insurances not found"


@app.route('/insurances', methods=['POST'])
def add_insurances():
    id = request.json['id']
    name = request.json['name']
    risk = request.json['risk']
    cost = request.json['cost']
    duration = request.json['duration']

    new_insurances = Insurances()
    new_insurances.id = id
    new_insurances.name = name
    new_insurances.risk = risk
    new_insurances.cost = cost
    new_insurances.duration = duration

    db.session.add(new_insurances)#session-на даний момент(та база даних яка зараз підключення)
    db.session.commit()#commit-додавання після add

    return 'Ok'


@app.route('/insurances/<id>', methods=['PUT'])
def update_insurances(id):
    name = request.json['name']
    risk = request.json['risk']
    cost = request.json['cost']
    duration=request.json['duration']

    new_insurances = Insurances.query.get(id)#запит по id
    new_insurances.id = id
    new_insurances.name = name
    new_insurances.risk = risk
    new_insurances.cost = cost
    new_insurances.duration=duration

    db.session.commit()

    return "Ok"


@app.route('/insurances/<id>', methods=['DELETE'])
def delete_insurances(id):
    insurances = Insurances.query.get(id)
    db.session.delete(insurances)
    db.session.commit()

    return str("Deleted")

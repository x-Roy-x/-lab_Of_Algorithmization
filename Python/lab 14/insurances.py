from app import db


class Insurances(db.Model):
    __tablename__ = "table-lab-roj"
    id = db.Column('id', db.Integer, primary_key=True)
    name = db.Column('name', db.String)
    risk = db.Column('risk', db.Integer)
    cost = db.Column('cost', db.Integer)
    duration=db.Column('duration',db.Integer)

    def __str__(self):
        return str("insurance id: " + str(self.id) + "\nname: " +
                   str(self.name) + "\nrisk: " + str(self.risk) + "\ncost: " + str(self.cost))

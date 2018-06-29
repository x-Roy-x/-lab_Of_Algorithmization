from app.insurance import *
from enums.insurance_name import *

class Car(Insurance):
    insurance_name = InsuranceName.CAR

    def __init__(self, name, guarantee, risk, cost, duration, type):
        self.guarantee = guarantee
        Insurance.__init__(self, name, risk, cost, duration, type)

    def __str__(self):
        return "Name : " + str(self.name) + " risk: " + str(self.risk) + " the guarantee " + str(self.guarantee)

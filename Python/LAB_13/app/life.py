from app.insurance import *
from enums.insurance_name import *


class Life(Insurance):
    insurance_name = InsuranceName.LIFE

    def __init__(self, name, age, risk, cost, duration, type):
        self.age = age
        Insurance.__init__(self, name, risk, cost, duration, type)

    def __str__(self):
        return "Name : " + str(self.name) + " risk: " + str(self.risk) + " the age is " + str(self.age)

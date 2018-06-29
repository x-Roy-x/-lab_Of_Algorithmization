from insurances.Insurance import *
from enums.InsuranceName import *


class Health(Insurance):
    insurance_name = InsuranceName.HEALTH

    def __init__(self, name, status, risk, cost, duration, type):
        self.status = status
        Insurance.__init__(self, name, risk, cost, duration, type)

    def __str__(self):
        return "Name : " + str(self.name) + " risk: " + str(self.risk) + " the status is " + str(self.status)

from app.insurance import *
from enums.insurance_name import *


class House(Insurance):
    insurance_name = InsuranceName.HOUSE

    def __init__(self, name, privacy, risk, cost, duration, type):
        self.privacy = privacy
        Insurance.__init__(self, name, risk, cost, duration, type)

    def __str__(self):
        return "Name : " + str(self.name) + " risk: " + str(self.risk) + " the privacy " + str(self.privacy)

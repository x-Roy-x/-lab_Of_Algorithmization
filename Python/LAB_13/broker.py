class Broker:
    insurances = []

    def __init__(self):
        pass

    def sort_by_risk(self):
        self.insurances.sort(key=lambda insurance: insurance.risk,reverse=True)


    def find_by_risk(self, risk):
        found_insurances = []

        for insurance in self.insurances:
            if insurance.risk == risk:
                found_insurances.append(insurance)

        return found_insurances

    def add_insurance(self, insurance):
        self.insurances += insurance
        print(insurance)

    def print_list(self):
        for insurance in self.insurances:
            print(insurance)
        print("\n")

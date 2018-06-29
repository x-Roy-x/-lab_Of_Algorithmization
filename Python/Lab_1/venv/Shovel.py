class Shovel:
    totalPrice=0
    def __init__(self,price=0,width=0,height=0,type="",weight=0):
        self.width=width
        self.height=height
        self.type=type
        self.weight=weight
        self.price=price
        Shovel.totalPrice+=price

    def toString(self):
        print( "Width: ",self.width,"Height :",self.height,"Type :",self.type,"Weight :",self.weight)

    def printSum(self):
        print("Price :",self.price)

    @staticmethod
    def printStaticSum():
        print("Total price :",Shovel.totalPrice)

if __name__ == "__main__":
    simple = Shovel()
    building = Shovel(10,34,"Building",34)
    winter = Shovel(14,45,"Winter",33,4)

    building.toString()
    building.printSum()

    winter.toString()
    winter.printSum()

    Shovel.printStaticSum()
    

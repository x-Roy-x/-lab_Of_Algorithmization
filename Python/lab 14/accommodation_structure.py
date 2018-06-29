from app import ma


class DeviceStructure(ma.Schema):
    class Meta:
        fields = ('id', 'number_of_rooms', 'price', 'area', 'duration')

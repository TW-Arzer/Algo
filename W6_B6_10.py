import math

class Point3D:
    def __init__(self, x, y, z):
        self.__x = x
        self.__y = y
        self.__z = z

    def get_x(self):
        return self.__x

    def get_y(self):
        return self.__y

    def get_z(self):
        return self.__z

    def set_x(self, x):
        self.__x = x

    def set_y(self, y):
        self.__y = y

    def set_z(self, z):
        self.__z = z

    def vector_representation(self):
        return [self.__x, self.__y, self.__z]

    def distance_euclidean(self, p2):
        other_x = p2.get_x()
        other_y = p2.get_y()
        other_z = p2.get_z()
        return math.sqrt((self.__x - other_x)**2 + (self.__y - other_y)**2 + (self.__z - other_z)**2)

    def distance_manhattan(self, p2):
        other_x = p2.get_x()
        other_y = p2.get_y()
        other_z = p2.get_z()
        return abs(self.__x - other_x) + abs(self.__y - other_y) + abs(self.__z - other_z)

    def distance_minkowski(self, p2, order=3):
        other_x = p2.get_x()
        other_y = p2.get_y()
        other_z = p2.get_z()
        return ((abs(self.__x - other_x)**order) + (abs(self.__y - other_y)**order) + (abs(self.__z - other_z)**order))**(1/order)

    def milieu(self, p2):
        other_x = p2.get_x()
        other_y = p2.get_y()
        other_z = p2.get_z()

        x_M = (self.__x + other_x)/2
        y_M = (self.__y + other_y)/2
        z_M = (self.__z + other_z)/2
        return Point3D(x_M, y_M, z_M)

    def __str__(self):
        return f'The coordinates of the center are: x = {self.get_x()}, y = {self.get_y()}, z = {self.get_z()}.'

point1 = Point3D(1,2,3)
point2 = Point3D(3,4,5)

print("\U0001F612")
print("Point 1 is: ", point1.vector_representation())
print("Point 2 is: ", point2.vector_representation())
print(" ")
print("\U0001F612")
print("The Euclidean distance is: ", point1.distance_euclidean(point2))
print("The Manhattan distance is: ", point1.distance_manhattan(point2))
print("The Minkowski distance is: ", point1.distance_minkowski(point2))
print(point1.milieu(point2))
print("\U0001F612")
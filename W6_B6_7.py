import math


class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def get_x(self):
        return self.x

    def get_y(self):
        return self.y

    def set_x(self, x):
        self.x = x

    def set_y(self, y):
        self.y = y

    def distance(self, p2):
        return math.sqrt((self.x - p2.get_x()) ** 2 + (self.y - p2.get_y()) ** 2)

    def milieu(self, p2):
        x_m = (self.x + p2.get_x()) / 2
        y_m = (self.y + p2.get_y()) / 2
        xym = Point(x_m, y_m)
        return xym

    def __str__(self):
        return f'Les coordonnées du Point milieu sont: x = {self.get_x()}, y = {self.get_y()}.'


if __name__ == '__main__':
    p = Point(3, 2)
    p2 = Point(5, 4)
    print("Le distance est ", str(p.distance(p2)))
    print(str(p.milieu(p2)))
    
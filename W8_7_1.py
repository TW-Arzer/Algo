class Fraction:
    def __init__(self, num, denom=1):
        self.__num = num
        self.__denom = denom
        self.simplification()

    def get_num(self):
        return self.__num

    def get_denom(self):
        return self.__denom

    def set_num(self, num):
        self.__num = num

    def set_denom(self, denom):
        self.__denom = denom

    def __str__(self):
        return f'Votre fraction a pour valeur {self.get_num()} / {self.get_denom()}'

    def simplification(self):
        a = self.__num
        b = self.__denom
        while a != b and a != 1 and b != 1:
            a, b = min(a, b), abs(a-b)
        if a == b:
            self.__num = self.__num//a
            self.__denom = self.__denom//a

    def add(self, bruch2):
        b1_num = self.__num
        b1_denom = self.__denom
        b2_num = bruch2.get_num()
        b2_denom = bruch2.get_denom()
        nenner = (b1_denom * b2_denom)
        zahler = (b1_num * b2_denom) + (b2_num * b1_denom)
        a = zahler
        b = nenner
        while a != b and a != 1 and b != 1:
            a, b = min(a, b), abs(a-b)
        if a == b:
            zahler = zahler//a
            nenner = nenner//a
        return f'{zahler} / {nenner}'

    def multi(self, bruch2):
        b1_num = self.__num
        b1_denom = self.__denom
        b2_num = bruch2.get_num()
        b2_denom = bruch2.get_denom()
        nenner = (b1_denom * b2_denom)
        zahler = (b1_num * b2_num)
        a = zahler
        b = nenner
        while a != b and a != 1 and b != 1:
            a, b = min(a, b), abs(a-b)
        if a == b:
            zahler = zahler//a
            nenner = nenner//a
        return f'{zahler} / {nenner}'

    def eq(self, bruch2):
        b1_num = self.__num
        b1_denom = self.__denom
        b2_num = bruch2.get_num()
        b2_denom = bruch2.get_denom()
        return b1_num == b2_num, b1_denom == b2_denom


x1 = int(input("Zähler 1: "))
y1 = int(input("Nenner 1: "))
x2 = int(input("Zähler 2: "))
y2 = int(input("Nenner 2: "))

bruch1 = Fraction(x1, y1)
bruch2 = Fraction(x2, y2)
print(bruch1)
print(bruch2)
print(bruch1.add(bruch2))
print(bruch1.multi(bruch2))
print(bruch1.eq(bruch2))

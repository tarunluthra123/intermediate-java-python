from functools import cmp_to_key


def square(x):
    return x * x


def mySquareComparator(a, b):
    x = square(a)
    y = square(b)

    return x - y


def main():
    A = [-2, 4, 6, 9, -3, -10, 5]
    A.sort(key=cmp_to_key(mySquareComparator))

    print(A)


main()


class Student:
    marks = 20
    _name = "tarun"

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, value):
        self._name = value


s = Student()
print(s.name)

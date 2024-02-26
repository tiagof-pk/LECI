# isLeapYear(year) deve devolver True se year é um ano bissexto
# e False se é um ano comum.  Corrija-a.
# (See: https://en.wikipedia.org/wiki/Leap_year)
def isLeapYear(year):
    if year % 100 == 0 and year % 400 != 0:
        year = False
    elif year % 4 == 0:
        year = True
    else:
        year = False
    return year
# monthDays deve devolver o número de dias de um dado mês num dado ano.
# Por exemplo, monthDays(2004, 2) deve devolver 29.
# Corrija-a.
days=0
MONTHDAYS = (29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
def monthDays(year, month):
    if month == 2 and isLeapYear(year) == True:
        month = 0
    days = MONTHDAYS[month]
    return days
# nextDay deve devolver o dia a seguir a uma dada data.
# Por exemplo, nextDay(2017, 1, 31) deve devolver (2017, 2, 1)
def nextDay(year, month, day):
    if month == 12 and day == 31:
        year += 1
        month = 1
        day = 1
    elif day == monthDays(year, month) and isLeapYear(year) == False :
        month += 1
        day = 1
    elif day == monthDays(year, month) and isLeapYear(year) == True:
        month +=1
        day = 1
    else:
        day += 1

    nextday = (year, month, day)
    return nextday
# Defina uma função dateIsValid que deve
# devolver True se os seus argumentos formarem uma data válida
# e devolver False no caso contrário.
# Por exemplo, dateIsValid(1980, 2, 29) deve devolver True,
# dateIsValid(1980, 2, 30) deve devolver False.
def dateIsValid(year, month, day):
    date_is_valid = True
    if year < 0:
        date_is_valid = False
    elif 1 > month or month > 12:
        date_is_valid = False
    elif isLeapYear(year) == True and day > monthDays(year, month):
        date_is_valid = False
    elif day < 1 or monthDays(year, month) < day and isLeapYear(year) == False:
        date_is_valid = False
    else:
        date_is_valid = True
    return date_is_valid
# Defina uma função previousDay que devolva o dia anterior a uma dada data.
# Por exemplo, previousDay(1980, 3, 1) deve devolver (1980, 2, 29)
def previousDay(year, month, day):
    if month == 1 and day == 1:
        year -= 1
        month = 12
        day = 31
    elif day == 1:
        month -= 1
        day = monthDays(year, month)
    elif isLeapYear(year) == True and month == 2 and day == 29 :
        day = 28
    else:
        day -= 1

    previousday = (year, month, day)
    return previousday
# No Codecheck, não chame nenhuma função: o sistema trata disso.
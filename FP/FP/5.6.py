def shorten(str):

    abv = ""
    for char in str:
        if char.isupper():
            abv += char
        else:
            continue
    return abv

str = input("Nome? ")
shorten(str)
print(shorten(str))


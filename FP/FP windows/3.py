# coding: utf-8

# This function computes the body mass index (BMI),
# given the height (in meter) and weight (in kg) of a person.
def bodyMassIndex(altura, peso):
    # Complete the function definition...
    bmi =peso/(altura*altura)
    return bmi

# This function returns the BMI category acording to this table:
# BMI:        <18.5         [18.5, 25[      [25, 30[      30 or greater
# Category:   Underweight   Normal weight   Overweight    Obesity
def bmiCategory(bmi):
    assert bmi > 0
    # Complete the function definition...
    bmic=0
    if bmi >= 30:
        bmi = "Obesity"
    elif bmi >= 25:
        bmi = "Overweigth"
    elif bmi >= 18.5:
        bmi = "Normal weight"
    else:
        bmi = "Underweight"
    return bmi

# This is the main function
def main():
    print("Índice de Massa Corporal")

    altura = float(input("Altura (m)? "))
    if altura < 0:
        print("ERRO: altura inválida!")
        exit(1)

    peso = float(input("Peso (kg)? "))
    if peso < 0:
        print("ERRO: peso inválido!")
        exit(1)

    # Complete the function calls...
    bmi= peso/(altura*altura)
    imc = bodyMassIndex(altura,peso)
    cat = bmiCategory(bmi)

    print("BMI:", imc, "kg/m2")
    print("BMI category:", cat)


# Program starts executing here
main()

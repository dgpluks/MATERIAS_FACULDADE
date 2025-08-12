def Maiuscula(linha, i):
    if i == len(linha):
        return 0;
    elif linha[i] >='A' and linha[i] <='Z':
        return 1 + Maiuscula(linha, i +1)
    else:
        return Maiuscula(linha, i +1)
linha = ""
while(linha != "FIM"):
    linha = input()
    if(linha != "FIM"):
        print(Maiuscula(linha, 0))


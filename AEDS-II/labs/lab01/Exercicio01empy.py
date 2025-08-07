def Maiuscula(linha):
    qn = 0; 
    for i in range (len(linha)):
        if(linha[i]>='A' and linha[i]<='Z'):
            qn+=1
    return qn
linha = ""
qn = 0
while(linha != "FIM"):
    linha = input()
    if(linha != "FIM"):
        print(Maiuscula(linha))

nome = ""
qn = 0
while(nome != "FIM"):
    nome = input()
    i = 0
    for i in range (len(nome)):
        if(nome[i]>='A' and nome[i]<='Z'):
            qn+=1
    if(nome != "FIM"):
        print(qn)

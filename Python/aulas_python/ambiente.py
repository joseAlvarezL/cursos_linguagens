from datetime import datetime, timedelta

# Função para verificar a data e enviar aviso
def verificar_vencimento(data_vencimento):
    # Obtém a data de hoje
    hoje = datetime.now().date()

    # Calcula a diferença em dias
    dias_restantes = (data_vencimento - hoje).days

    # Verifica se falta apenas um dia
    if dias_restantes == 1:
        print(f"Aviso: Falta 1 dia para a data limite {data_vencimento}!")
    else:
        print(f"Faltam {dias_restantes} dias para a data limite {data_vencimento}.")

# Data limite para o exemplo
data_limite = datetime.strptime("29/03/2024", "%d/%m/%Y").date()

# Função que pode ser chamada diariamente
verificar_vencimento(data_limite)

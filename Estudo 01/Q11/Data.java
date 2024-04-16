import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida!");
        }
    }
    
    public Data() {
        LocalDate dataAtual = LocalDate.now();
        this.dia = dataAtual.getDayOfMonth();
        this.mes = dataAtual.getMonthValue();
        this.ano = dataAtual.getYear();
    }
    
    public int getDia() {
        return dia;
    }
    
    public void setDia(int dia) {
        if (dataValida(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido!");
        }
    }
    
      public void setMes(int mes) {
        if (dataValida(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido!");
        }
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        if (dataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido!");
        }
    }
    
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    
    public void avancarDia() {
        if (dia < diasNoMes(mes, ano)) {
            dia++;
        } else {
            dia = 1;
            if (mes == 12) {
                mes = 1;
                ano++;
            } else {
                mes++;
            }
        }
    }
    
    private boolean dataValida(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        } else {
            return true;
        }
    }
    
    private int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    
}

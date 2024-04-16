public class Triangulo
{
    private double ladoA,ladoB,ladoC;
    
    public Triangulo(){
    
    }
    
    public Triangulo(double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public void setLadoA(double ladoA){
        this.ladoA = ladoA;
    }
    
    public void setLadoB(double ladoB){
        this.ladoB = ladoB;
    }
    
    public void setLadoC(double ladoC){
        this.ladoC = ladoC;
    }
    
    public double getLadoA(){
        return ladoA;
    }
    
    public double getLadoB(){
        return ladoB;
    }
    
    public double getLadoC(){
        return ladoC;
    }
    
    public double perimetro(){
        double soma = 0;
        soma = ladoA + ladoB + ladoC;
        return soma;
    }
    
    public String tipo(){
        String tipo = "";
        if(ladoA == ladoB && ladoB == ladoC){
            tipo = "Equilatero";
        }else if(ladoA == ladoB && ladoC != ladoA && ladoC != ladoB 
        || ladoB == ladoA && ladoC != ladoB && ladoC != ladoA 
        || ladoC == ladoA && ladoB != ladoA && ladoB != ladoC
        || ladoC == ladoB && ladoA != ladoB && ladoA != ladoC
        ){
            tipo = "Isóceles";
        }else{
            tipo = "Escaleno";
        }
        return tipo;
    }
    
    public double area(){
        double h = 0;
        if (tipo() == "Equilatero"){
            return (Math.pow(ladoA,2) * Math.sqrt(3))/4 ;
        }else if(tipo() == "Isóceles"){
            double base;
            if(ladoA == ladoB){
                base = ladoC;
                h =  Math.sqrt(((Math.pow(ladoA,2)) - (Math.pow(base/2,2))));
                return (base * h)/2;
            }else if(ladoA == ladoC){
                base = ladoB;
                h =  Math.sqrt(((Math.pow(ladoA,2)) - (Math.pow(base/2,2))));
                return (base * h)/2;
            }else{
                base = ladoA;
                h =  Math.sqrt(((Math.pow(ladoB,2)) - (Math.pow(base/2,2))));
                return (base * h)/2;
            }
        }else{
             return Math.sqrt((perimetro()/2) * ((perimetro()/2) - ladoA) * 
             ((perimetro()/2) - ladoB) * ((perimetro()/2) - ladoC));
        }
    }
}

public class Testezin {
    public static void main(String args[]){
        int n1 = 7;
        int n2 = 9;
        int somaDividida=0;
        if((n1%2 ==0)&&(n2%2==0)){
            n1 = n1/2;
            n2 = n2/2;
            somaDividida = n1 + n2;
        }else if((n1%2 ==1)&&(n2%2==1)){
            n1 = (n1 -1)/2;
            n2 = (n2 -1)/2;
            somaDividida = n1+n2+1;
        }else{
            System.out.println("A soma dividida vai ser um double...");
        }
        System.out.println("Aqui: " + somaDividida);
    }
}

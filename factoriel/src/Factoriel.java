
import java.util.*;

class Util{
    public static  long fac(long n){
        if(n> 1)
            return(fac(n-1)* n);
        else
            return 1;
    }
}

public class TestFac {
    public static void main(String[] args){
        int n=0;
        System.out.println("Donner un nombre positf: ");
        n.clavier.lireInt();
        System.out.println("Voici sa factorielle: " +Util.fac(n));
    }
}

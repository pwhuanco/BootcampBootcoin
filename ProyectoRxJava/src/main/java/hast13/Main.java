package hast13;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Main {
    /**
     * el obs 1 se imprime desde el incio.
     * luego del 2do segundo se ejecutara 3 segundos mas
     * en el 3r segundo se imprimira el obs1 y obs2 (aletoriamente: a veces 1y2 o 2y1)
     * y asi se imprimen ambos hasta completar el 5to segundo
     * @param ars
     */
    public static void main (String[] ars){

        //Observable obs = Observable.just(getNumber());
        Observable obs = Observable.interval(300, TimeUnit.MILLISECONDS );
        obs.subscribe(var-> System.out.println("observador1:"+var));
        pause(5000);

        //obs.subscribe(var-> System.out.println("observador2:"+var));
        //pause(4000);

    }
    public static Integer getNumber(){
        System.out.println("en getNumber");
        Integer var = 3*5;
        imprimir(var);
        return var;
    }
    public static void imprimir(Integer n){
        System.out.println("en getNumber hay:"+n);
    }

    public static void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

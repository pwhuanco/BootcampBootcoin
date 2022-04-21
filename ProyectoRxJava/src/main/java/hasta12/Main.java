package hasta12;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRange;

public class Main {

    private static int start = 4;
    private static int count = 2;

    public static void main (String[] ars){
//        getObservableRange(start,count).forEach(System.out::println);
        Observable<Integer> obs = Observable.defer(()->{
            System.out.println("dentro del lambda");
            return getObservableRange(start,count);
        });
        obs.subscribe((a)->System.out.println(a));
        start = 5;
        obs.subscribe((a)->System.out.println(a));
        obs.subscribe((a)->System.out.println(a));

        //Observable<Integer> obs2 = Observable.just(getNumber());
        Observable<Integer> obs2 = Observable.fromCallable(()->{
            System.out.println("dentro del lambda callable");
                return getNumber();
        });
        obs2.subscribe(System.out::println, error -> System.out.println("error?"+ error.getLocalizedMessage()));
        //obs2.subscribe(System.out::println);
    }

    public static Observable<Integer> getObservableRange(int start, int count){
        System.out.println("getObservableRange!");
        return new ObservableRange(start,count);
    }

    public static Integer getNumber(){
        System.out.println("en getNumber");
        return 3/0;
    }

}

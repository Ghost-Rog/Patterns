package BehavioralPatterns.Memento;

public class Originator {

    private String s1;
    private String s2;

    public Memento save(){
       return new Memento(s1, s2);
    }

    public void restore(Memento m){

        s1 = m.s1;
        s2 = m.s2;
    }


    class Memento{
        private String s1;
        private String s2;

        private Memento(String s1, String s2){
            this.s1 = s1;
            this.s2 = s2;
        }

        private String getS1() {
            return s1;
        }

        private String getS2() {
            return s2;
        }
    }

}

package org_task2;

public class RSpeed implements Observer{
    private String name;

    public RSpeed(String name, Observable o){
        this.name = name;
        o.addObserver(this);
    }

    @Override
    public void alarm(String str) {
        System.out.println(name + " sensor detected that value out of range: " + str + ", should be 2999 - 3001");
    }
}

package com.jackie.designpattern.demo.caretaker;

import com.jackie.designpattern.demo.originator.MementoProvider;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/7 - 17:55
 * @history 2018/8/7 - 17:55 ting.he4@pactera.com  create.
 */
public class PlayerCaretaker {

    private MementoProvider memento;

    public void saveMemento(MementoProvider memento) {
        this.memento = memento;
    }

    public MementoProvider retrieveMemento() {
        return memento;
    }

}

package com.jackie.designpattern.demo.originator;

/**
 *
 *
 * @author ting.he4@pactera.com
 * @date 2018/8/7 - 17:50
 * @history 2018/8/7 - 17:50 ting.he4@pactera.com  create.
 */
public class Player {

    private String stash;

    public String getStash() {
        return stash;
    }

    public void setStash(String stash) {
        this.stash = stash;
        System.out.println("设置的存储点：" + stash);
    }

    /**
     * 创建备忘录对象
     * @return
     */
    public MementoProvider createMemento() {
        return new PlayerMemento(stash);
    }

    /**
     * 恢复储存点
     * @param memento
     */
    public void restoreMemento(MementoProvider memento) {
        this.stash = ((PlayerMemento)memento).getStash();
    }

    private class PlayerMemento implements MementoProvider {
        private String stash;

        public PlayerMemento(String stash) {
            this.stash = stash;
        }

        public String getStash() {
            return stash;
        }

        public void setStash(String stash) {
            this.stash = stash;
        }
    }
}

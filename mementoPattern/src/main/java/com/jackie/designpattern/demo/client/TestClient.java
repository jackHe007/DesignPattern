package com.jackie.designpattern.demo.client;

import com.jackie.designpattern.demo.caretaker.PlayerCaretaker;
import com.jackie.designpattern.demo.originator.Player;

/**
 * @author ting.he4@pactera.com
 * @date 2018/8/7 - 17:35
 * @history 2018/8/7 - 17:35 ting.he4@pactera.com  create.
 */
public class TestClient {

    public static void main(String[] args) {
        Player player = new Player();
        PlayerCaretaker caretaker = new PlayerCaretaker();
        player.setStash("No.120");
        caretaker.saveMemento(player.createMemento());
        player.setStash("No.110");
        player.restoreMemento(caretaker.retrieveMemento());
        System.out.println("恢复到恢复点：" + player.getStash());
    }

}

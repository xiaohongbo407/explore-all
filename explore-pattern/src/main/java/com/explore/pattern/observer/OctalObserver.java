package com.explore.pattern.observer;

import com.explore.pattern.observer.Observer;
import com.explore.pattern.observer.Subject;

/**
 * Description {@link }
 *
 * @author XiaoHB
 * @version 1.0
 * @date 2020/6/8 0:05
 **/
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}

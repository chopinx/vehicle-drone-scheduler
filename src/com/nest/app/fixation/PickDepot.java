package com.nest.app.fixation;

import com.nest.geometry.Point;

/**
 * Created by qiu on 18-3-16.
 */
public class PickDepot extends Point {
    private char id;//标识符号，用字母标识区别与客户节点的数字id,唯一标识
    PickDepot(){
        super();
    }

    PickDepot(char id, int x, int y) {
        super(x, y);
        this.id = id;
    }

    public char getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PickDepot other = (PickDepot) obj;
        return this.id == other.getId();
    }
}

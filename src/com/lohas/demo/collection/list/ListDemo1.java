package com.lohas.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/6.
 */
class Dept{
    private int deptno;
    private String name;
    private String loc;

    public Dept(int deptno, String name, String loc) {
        this.deptno = deptno;
        this.name = name;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
    //自动生成
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Dept dept = (Dept) o;
//
//        if (deptno != dept.deptno) return false;
//        if (name != null ? !name.equals(dept.name) : dept.name != null) return false;
//        return loc != null ? loc.equals(dept.loc) : dept.loc == null;
//    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null ) {
            return false;
        }
        if (!(obj instanceof Dept)){
            return false;
        }

        Dept dept = (Dept) obj;

        return (this.deptno == dept.deptno && this.name.equals(dept.name) && this.loc.equals(dept.loc));
    }

}
public class ListDemo1 {
    public static void main(String[] args) {
        List<Dept> list = new ArrayList<Dept>();
        list.add(new Dept(1,"财务部","北京"));
        list.add(new Dept(2,"技术部","广州"));
        list.add(new Dept(3,"运维部","深圳"));
        //删除数据，如果没有覆写equals，会删除不了
        list.remove(new Dept(3,"运维部","深圳"));
        for (int i = 0; i < list.size(); i++) {
            Dept dept = list.get(i);
            System.out.println(dept);
        }
    }
}

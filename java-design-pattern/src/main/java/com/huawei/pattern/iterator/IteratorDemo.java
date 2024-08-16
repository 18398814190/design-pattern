package com.huawei.pattern.iterator;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 18:42
 * @description 迭代器模式
 */
public class IteratorDemo {
    public static void main(String[] args) {
        MyListImpl myList = new MyListImpl();
        MyIterator iterator = myList.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

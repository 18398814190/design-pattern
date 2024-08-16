package com.huawei.pattern.iterator;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 18:38
 * @description
 */
public class MyListImpl implements MyList {

    private String[] name = {"wjp","zz", "hhc", "sx"};

    @Override
    public MyIterator getIterator() {
        return new MyIteratorImpl();
    }

    private class MyIteratorImpl implements MyIterator {
        int index = 0;

        @Override
        public Boolean hasNext() {
            if (index < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return name[index++];
            }
            return null;
        }
    }
}

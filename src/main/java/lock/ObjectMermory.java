package lock;

import org.openjdk.jol.info.ClassLayout;

/**
 * <p>
 *
 * </p>
 *
 * @author goinhn
 * @version 1.0.0
 * @date 2020/7/28 22:57
 */
public class ObjectMermory {

    public static void main(String[] args) {
        Object object = new Object();
        System.out.println(ClassLayout.parseInstance(object).toPrintable());

        synchronized(object){
            System.out.println(ClassLayout.parseInstance(object).toPrintable());
        }
    }

}

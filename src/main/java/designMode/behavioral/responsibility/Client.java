package designMode.behavioral.responsibility;

import designMode.behavioral.responsibility.chain.Director;
import designMode.behavioral.responsibility.chain.Handle;
import designMode.behavioral.responsibility.chain.SchoolHandle;
import designMode.behavioral.responsibility.chain.TeacherHandle;

/**
 * @author YJ Lan
 * @create 2020-05-26-23:28
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request(3000);

        Handle teacherHandle = new TeacherHandle("老师");
        Handle director = new Director("主任");
        Handle schoolHandle = new SchoolHandle("校长");
        teacherHandle.setHandle(director);
        director.setHandle(schoolHandle);
        schoolHandle.setHandle(teacherHandle);

        System.out.println("从老师开始....3000");
        teacherHandle.process(request);
        System.out.println("从主任开始....3000");
        director.process(request);
        System.out.println("从校长开始...3000");
        schoolHandle.process(request);

    }
}

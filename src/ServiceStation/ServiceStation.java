package ServiceStation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import Transport.Transport;

public interface ServiceStation {
//    public Queue queue;

    static void createServiceStation(List<Transport> transport, Queue queue){
//       Queue <Transport> queue = new LinkedList<Transport>();
        if (transport.size() != 0) {
            for (int i = 0; i != transport.size(); i++) {
                System.out.println(transport.get(i).toString());
                queue.add(transport.get(i));
            }
        }
    }

//    public Queue getQueue() {
//        return queue;
//    }

    static void addAuto(Transport newAdd, Queue queue)
    {
//        if (queue.offer(newAdd) == true)
//            System.out.println(newAdd.getBrand() + " " + newAdd.getModel() + "добавлен в очередь на техобслудивание");
//        else
//            System.out.println("Нет возможности добавить в очередь на техобслуживание");
        queue.offer(newAdd);
    }

    static void getService(Queue queue) {

        Object car;
        while ((car = queue.poll()) != null) {
            System.out.println(car + " прошел техосмотр!");
        }
    }
}

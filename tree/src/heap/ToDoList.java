package heap;

import java.util.PriorityQueue;

/**
 * FileName: ToDoList
 * author: gxs
 * Date: 2022/3/7  23:02
 */
public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
    static class ToDoItem implements Comparable<ToDoItem> {
        private char primary;
        private int secondary;
        private String item;

        public ToDoItem(char pri, int sec, String td) {
            this.primary = pri;
            this.secondary = sec;
            this.item = td;
        }

        @Override
        public int compareTo(ToDoItem arg) {
            if (primary > arg.primary) return -1;
            if (primary == arg.primary)
                if (secondary > arg.secondary) return -1;
                else if (secondary == arg.secondary) return 0;
            return +1;
        }

        @Override
        public String toString() {
            return "ToDoItem{" +
                    "primary=" + primary +
                    ", secondary=" + secondary +
                    ", item='" + item + '\'' +
                    '}';
        }
    }
    public void add(char pri, int sec, String td ) {
        super.add(new ToDoItem(pri, sec, td));
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.add('C',4,"Empty trash");
        toDoList.add('A',4,"Feed dog");
        toDoList.add('B',7,"Feed bird");
        toDoList.add('B',1,"Feed cat");
        while (!toDoList.isEmpty()) {
            System.out.println(toDoList.remove());
        }
    }
}

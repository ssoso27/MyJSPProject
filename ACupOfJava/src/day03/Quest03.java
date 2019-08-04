package day03;

class Stack extends LinkedList {
    void push(int num) {
        super.add(num);
    }

    int pop() {
        int num = 0;

        if (head.next == tail) { // node가 하나뿐이면
            // 데이터를 빼고, head 와 tail이 같은 가상노드를 가리키게 함
            num = tail.data;
            tail = head;
        } else { // node가 여러 개면
            for (Node n = head.next; n != null; n = n.next) { // 연결리스트 처음부터 끝까지 돌면서
                if (n.next.next == null) { // tail 바로 전 노드면
                    // tail이 이 노드를 가리키게 한 후,
                    tail = n;

                    // 맨 뒤 노드 값을 빼고, 지워버림.
                    num = tail.next.data;
                    tail.next = null;
                    break;
                }
            }
        }

        return num;
    }
}

class Queue extends LinkedList {
    void offer(int num) {
        super.add(num);
    }

    int poll() {
        head = head.next;
        return head.data;
    }
}

public class Quest03 {
    public static void main(String[] args) {
        System.out.println("[Stack]");
        Stack stack = new Stack();

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("[Queue]");
        Queue queue = new Queue();

        queue.offer(2);
        queue.offer(4);
        queue.offer(6);
        queue.offer(8);
        queue.offer(10);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

//package praktek_java.week_5.queue;
import java.util.Scanner;

class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = item;
            nItems++;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int temp = queueArray[front];
            front = (front + 1) % maxSize;
            nItems--;
            return temp;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue = ");
        int count = nItems;
        int index = front;
        while (count > 0) {
            System.out.print(queueArray[index] + " ");
            index = (index + 1) % maxSize;
            count--;
        }
        System.out.println();
    }
}

public class QueueImplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue(5);

        while (true) {
            System.out.println("\nQueue Operations");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");
            System.out.print("Your Choice? ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    queue.insert(value);
                    queue.displayQueue();  // Selalu tampilkan queue setelah insert
                    break;
                case 2:
                    int removedValue = queue.remove();
                    if (removedValue != -1) {
                        System.out.println("Removed: " + removedValue);
                    }
                    queue.displayQueue();  // Selalu tampilkan queue setelah remove
                    break;
                case 3:
                    int frontValue = queue.peek();
                    if (frontValue != -1) {
                        System.out.println("Front: " + frontValue);
                    }
                    break;
                case 4:
                    System.out.println("Is Empty? " + queue.isEmpty());
                    break;
                case 5:
                    System.out.println("Is Full? " + queue.isFull());
                    break;
                case 6:
                    System.out.println("Size = " + queue.size());
                    queue.displayQueue();
                    break;
                default:
                    System.out.println("Pilihan tidak tepat, coba lagi!.");
            }

            System.out.print("\n Mau lanjutkan? (y/n): ");
            char cont = scanner.next().charAt(0);
            if (cont == 'n' || cont == 'N') {
                break;
            }
        }
        scanner.close();
    }
}

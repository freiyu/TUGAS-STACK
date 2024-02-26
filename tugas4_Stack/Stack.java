package tugas4_Stack;
//JAWABAN MILIK
//RAKASYAEL HIZKIA KOLONDAM
//2023105490 - SISTEM INFORMASI
public class Stack {
    Node top;
    int height;

    public Stack() {
        top = null;
        height = 0;
    }

    public Stack(int value)
    {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack()
    {
        Node currentNode = top;
        while(currentNode != null)
        {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Fungsi untuk menambah Node di posisi teratas Stack
    public void push(int value)
    {
        Node newNode = new Node(value);
        if(top == null){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    // Fungsi untuk menghapus dan mengambil Node teratas dari Stack
    // menggunakan fungsi int karena mengembalikan value
    public int pop()
    {
        if(top == null){
            System.err.println("Empty list");
            return -1;
        }
        else{
            Node current = top;
            top = top.next;
            current.next = null;
            height--;
            return current.value;
        }
    }
}

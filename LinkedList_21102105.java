import java.util.Scanner;
public class doubly_linked_list {
    static class Node{
        String data;
        Node next;
        Node prev;
        // To initialize these values we have to create a construcutor
        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void creation(){
        String data;
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            do{
            System.out.println("Enter the names of your family members along with their age (FORMAT: FirstName_Age): ");
            data=sc.next();
            Node new_node=new Node(data);
            if (head==null){
                head=new_node;
                tail=new_node;
            }
            else{
                head.prev=new_node;
                new_node.next=head;
                head=new_node;
            }
            System.out.println("Do you want to add more names. If yes press 1, else press any other number: ");
            n=sc.nextInt();
        }
        while(n==1);
        }
    }

    public void traverser(){
        Node temp=head;
        if (head==null){
            System.out.println("LL does not exist");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        doubly_linked_list dll=new doubly_linked_list();
        dll.creation();
        dll.traverser();
    }
}

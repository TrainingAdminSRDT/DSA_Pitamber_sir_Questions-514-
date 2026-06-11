public class InsertAtLinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){       //constructor
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

 public void addfirst1(int data){
         // step 1->create  new node 
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
    
        //step 2--> newnodenext=head
        newNode.next=head;

        //step 3
        head=newNode;
    }





    public void add(int indx,int data){
         if(indx==0){
            addfirst1(data);
            return;
         }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i < indx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }



    public void addlast1(int data){
         // step 1->create  new node 
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
    
        //step 2--> newnodenext=head
        tail.next=newNode;

        //step 3
        tail=newNode;
    }


public void print(){ //t.c->O(n)->(linear t.c)
    if(head==null){
        System.out.println("ll is empty");
        return;
    }

    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ->");
        temp = temp.next;
    }
     System.out.println("null");
}
    public static void main(String[]args){
      MiddleAdd  ll=new MiddleAdd();
        
       ll.addfirst1(2);
        ll.addfirst1(1);
        ll.addlast1(3);
        ll.addlast1(4);
        ll.add(2,9); 
         ll.print();
    }
}

//tc->O(1)

//Creating a node
     class Node{
    	 int data;
    	 Node next;
    	 Node(int data){
    		 this.data = data;
    		 this.next = null;
    	 }
     }
     
     public class practise{
    	 static Node head= null;
    	 public static void main(String[] args) {
    		 Node node1 = new Node(2);
    		 Node node2 = new Node(26);
    		 Node node3 = new Node(72);
    		 Node node4 = new Node(27);
    		 Node node5 = new Node(29);
    		 node1.next = node2;
    		 node2.next = node3;
    		 node3.next = node4;
    		 node4.next = node5;
    		 
    		 head = node1;
    		 display();
    		 insertAtBegin(45);
    		 display();
    		 
    		 insertAtEnd(56);
    		 display();
    		 
    		 insertAtPosition(65,3);
    		 display();
    		 
    		 deleteAtBegin();
    		 display();
    		 
    		 deleteAtEnd();
    		 display();
    		 
    		 deleteAtPosition(3);
    		 display();
    		 
    		 search();
    		
    		 update(65,54);
    		 display();
    		 
    		 count();
    		 
    		 reverse();
    		 display();
    		 
    	 }
     static void display() {
    	 Node temp = head;
    	 while(temp!=null) {
    		 System.out.print(temp.data+"->");
    		 temp=temp.next;
    	 }
    	 System.out.println("null");
    	 
     }
     static void insertAtBegin(int data) {
    	 //Node temp  = head;
    	 Node newNode = new Node(data);
    	 newNode.next = head;
    	 head = newNode;
    	 }
     static void insertAtEnd(int data) {
    	 Node temp = head;
    	 Node newNode = new Node(data);
    	 if(head==null) {
    		 head=newNode;
    		 return;
    		 
    	 }
    	 if(head.next==null) {
    	 head.next=newNode;
    	 }
    	 while(temp.next!=null) {
    		 temp=temp.next;
    	 }
    	 temp.next=newNode;
     }
     
     
     static void insertAtPosition(int data,int pos) {
    	 Node temp = head;
    	 Node newNode = new Node(data);
    	 if(pos==1) {
    		 newNode.next = head;
    		 head=newNode;
    	 }
    	 for(int i=0;i<(pos-1)&&(temp!=null);i++) {
    		 temp=temp.next;
    	 }
    	 if(temp==null) {
    		 return;
    	 }
    	 newNode.next=temp.next;
    	 temp.next=newNode;
    	 
     
     }
     static void deleteAtBegin() {
    	 if(head == null) {
    		 return;
    	 }
    	 head=head.next;
    }
     static void deleteAtEnd() {
    	 Node temp=head;
    	// Node newNode = new Node(data);
    	 if(head==null) {
    		 return;
    	 }
    	 if(head.next==null) {
    		 head=null;
    		 return;
    	 }
    	 while(temp.next.next!=null) {
    		 temp=temp.next;
    	 }
    	 temp.next=null;
     }
     
     static void deleteAtPosition(int pos) {
    	 Node temp = head;
    	 if(head==null) {
    		 return;
    	 }
    	 if(head.next==null) {
    		 head=null;
    		 return;
    	 }
    	 if(pos==1) {
    		 head=head.next;
    		 return;
    	 }
    	 for(int i=0;i<(pos-1)&&(temp.next!=null);i++) {
    		 temp=temp.next;
    	 }
    	 if(temp.next==null) {
    		 return;
    	 }
    	 temp.next=temp.next.next;
    	 
     }
     
     static void search() {
    	 int key=27;
    	 int index=0;
    	 Node temp=head;
    	 while(temp!=null) {
    		 if(temp.data==key) {
    			 System.out.println("Element found: "+index);
    			 return;
    		 }
    		 temp=temp.next;
    		 index++;
    		 
    	 }
    	 System.out.println(key +" not found");
    	 
    	 
     }
     
     static void update(int oldvalue,int newvalue) {
    	 Node temp=head;
    	 while(temp!=null) {
    		 if(temp.data==oldvalue) {
    			 temp.data=newvalue;
    			 return;
    		 }
    		 temp=temp.next;
    		 
    	 }
     }
     
     static void count() {
    	 int count=0;
    	 Node temp=head;
    	 while(temp!=null) {
    		 count++;
    		 temp=temp.next;
    	 }
    	 System.out.println("Count : "+count);
     }
     static void reverse() {
    	 Node prev = null;
    	 Node next = null;
    	 Node current  =head;
    	 while(current!=null) {
    		 next=current.next;
    		 current.next=prev;
    		 prev=current;
    		 current=next;
    		 
    	 }
    	 head=prev;
     }
     
 }
   
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
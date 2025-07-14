
package wuwamart.shop;

public class Ticket {
    private int ticketId;
    private String ticketCreatorName;
    private int ticketCreatorId;
    
    public Ticket(int ticketId,String ticketCreatorName,int ticketCreatorId){
        this.ticketId=ticketId;
        this.ticketCreatorName=ticketCreatorName;
        this.ticketCreatorId=ticketCreatorId;
                
    }
    
    public void displayDetails(){
        System.out.println("Ticket Id: "+ticketId);
        System.out.println("Creator: "+ticketCreatorName);
        System.out.println("Cterator Id: "+ticketCreatorId);
        
    }
    
    public void close(){
        System.out.println("Ticket closed.");
    }
    
    public void claim(){
        System.out.println("Ticket claimed by moderator.");
        
    }
}

package ge.edu.btu;

public class Passenger {
    private String name;
    private boolean ticket;

    public Passenger(String _name, boolean _ticket){
        name = _name;
        ticket = _ticket;
    }

    public String getName(){return name;}
    public boolean hasTicket(){return ticket;}

}

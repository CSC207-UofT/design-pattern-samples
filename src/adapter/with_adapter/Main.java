package adapter.with_adapter;

import java.time.*;

public class Main {

    public static void main(String[] args) {

        /*
         * @author: Mahsa Sadi
         * @since 2020 - 08 - 31
         *
         *
         * Design Pattern: Adapter
         *
         * There are two types of adapter: (1) Object Adapter, (2) Class Adapter.
         * In the following we create and use adapters of each type for a simple ticket selling program.
         *
         *
         * --> Analyze the pros and cons of each kind of adapter.
         *
         */


        ZoneId zoneId = ZoneId.of("America/Toronto");
        LocalDateTime today = LocalDateTime.now(zoneId);
        /*
         * A ticket class with a limited set of functionalities.
         * With this class, we can not sell and buy a ticket.
         */
        Ticket ticket1 = new Ticket("1", "Martian", today, "A11");
        ticket1.setOwner("Jane Doe");
        System.out.println(ticket1);

        /*
         * Type 1: An object adapter that allows the ticket to be sold to other customers
         * via wrapping the ticket class.
         */
        Tradable ticket2 = new ObjectTicketAdapter(ticket1);
        ticket2.trade("Julia James");
        System.out.println(ticket2);
        System.out.println(ticket2.getTradeHistory());
        ticket2.tradeUndo();
        System.out.println(ticket2);


        /*
         * Type 2: A class adapter that allows the ticket to be sold to other customers
         * via extending the ticket class and implementing the Tradable interface.
         */
        /*
         * Class Ticket Adapter as a Ticket
         */
        Ticket ticket3 = new ClassTicketAdapter("2", "Interstellar", today, "B44");
        ticket3.setOwner("John Joe");
        System.out.println(ticket3);
        /*
         * Class Ticket Adapter as a Tradable.
         */
        ((Tradable) ticket3).trade("Peter Paul");
        System.out.println(ticket3);
        System.out.println(((Tradable) ticket3).getTradeHistory());
        ((Tradable) ticket3).tradeUndo();
        System.out.println(ticket3);

    }

}

package ParkingLot.controllers;

import ParkingLot.dtos.IssueTicketRequest;
import ParkingLot.dtos.IssueTicketResponse;
import ParkingLot.model.Ticket;
import ParkingLot.services.TicketService;


public class TicketController {
    private TicketService ticketService;

    public IssueTicketResponse issueTicket(IssueTicketRequest request) {
        Ticket ticket = ticketService.issueTicket(request);
        return new IssueTicketResponse(ticket, "SUCCESS", "Ticket Generated");
    }

}


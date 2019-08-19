package com.wzl.user.service;

import com.wzl.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void hello(){
        String tickets = ticketService.getTickets();
        System.out.println("买到票了" + tickets);
    }
}

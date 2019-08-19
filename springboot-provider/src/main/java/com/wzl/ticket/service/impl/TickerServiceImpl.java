package com.wzl.ticket.service.impl;

import com.wzl.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component//将服务发布出去
@Service
public class TickerServiceImpl implements TicketService {
    @Override
    public String getTickets() {
        System.out.println("有人来买票");
        return "<<银河补习班>>";
    }
}

package com.lambda.orders.services;

import com.lambda.orders.models.Agents;
import com.lambda.orders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "agentServices")
public class AgentsServicesImpl implements AgentServices
{
    @Autowired
    AgentRepository agentrepos;

    @Override
    public Agents save(Agents agent){
        return agentrepos.save(agent);
    }
}

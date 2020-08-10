package com.lambda.orders.repositories;

import com.lambda.orders.models.Agents;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agents, Long>
{
}

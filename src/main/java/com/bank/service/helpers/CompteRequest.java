package com.bank.service.helpers;

import com.bank.model.Agent;
import com.bank.model.Client;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class CompteRequest {

    private final Long id;
    private final boolean enable = false;
    private final Client client_id;
    private final String type;
    private final Long amount;
    private final Agent agent_id;

}

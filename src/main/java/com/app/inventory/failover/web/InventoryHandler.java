package com.app.inventory.failover.web;

import com.app.inventory.failover.model.BeerInventoryDto;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;

/**
 * @author t0k02w6 on 16/06/21
 * @project mssc-inventory-failover
 */
@Component
public class InventoryHandler {
    public Mono<ServerResponse> listInventory(ServerRequest request) {
        BeerInventoryDto beerInventoryDto = new BeerInventoryDto();
        beerInventoryDto.setId(UUID.randomUUID());
        beerInventoryDto.setBeerId(UUID.fromString("00000000-0000-0000-0000-000000000000"));
        beerInventoryDto.setQuantityOnHand(999);
        beerInventoryDto.setCreatedDate(OffsetDateTime.now());
        beerInventoryDto.setLastModifiedDate(OffsetDateTime.now());

        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(Arrays.asList(beerInventoryDto)),BeerInventoryDto.class);
    }
}

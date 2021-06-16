package com.app.inventory.failover.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author t0k02w6 on 16/06/21
 * @project mssc-inventory-failover
 */
@EnableDiscoveryClient
@Profile("local-discovery")
@Configuration
public class LocalDiscoveryConfig {
}

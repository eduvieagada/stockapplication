package com.payconiq.data.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.payconiq.data.repositories")
@EntityScan("com.payconiq.data.models")
public class DataConfig {
}

package io.baselogic.integration;

import io.baselogic.integration.routing.aggregator.config.IntegrationConfig;
import io.baselogic.integration.routing.aggregator.config.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration(classes = {TestConfig.class, IntegrationConfig.class})

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {
        Application.main(new String[0]);
    }

} // The End...

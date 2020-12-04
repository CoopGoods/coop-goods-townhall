package org.coopgoods.boot;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info =
        @Info(
            version = "",
            title = "Town Hall",
            description = "Town Hall application using Coop Goods infrastructure",
            contact = @Contact(name = "Abdelhamid Bakhta", email = "abdelhamid.bakhta@gmail.com"),
            license =
                @License(name = "Apache-2.0", url = "http://www.apache.org/licenses/LICENSE-2.0")),
    servers = {@Server(url = "http://localhost:8080")})
public class OpenAPIConfiguration {}

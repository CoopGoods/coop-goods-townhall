package org.coopgoods.api;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.coopgoods.model.user.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "User API", description = "User Web API documentation")
public interface UserAPI {

  @Operation(summary = "Find all users")
  @GetMapping
  @ResponseBody
  List<User> findAll();
}

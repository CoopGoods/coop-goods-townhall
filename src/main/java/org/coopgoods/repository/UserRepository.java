package org.coopgoods.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.coopgoods.model.user.User;

public interface UserRepository {

  void save(User user);

  Optional<User> findByID(UUID taskID);

  List<User> findAll();
}

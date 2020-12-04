package org.coopgoods.repository.inmem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.coopgoods.model.user.User;
import org.coopgoods.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InMemUserRepository implements UserRepository {
  private final Map<UUID, User> users;

  public InMemUserRepository() {
    users = new HashMap<>();
  }

  @Override
  public void save(final User user) {
    if (user.getUuid() == null) {
      user.setUuid(UUID.randomUUID());
    }
    users.put(user.getUuid(), user);
  }

  @Override
  public Optional<User> findByID(final UUID userID) {
    if (!users.containsKey(userID)) {
      return Optional.empty();
    }
    return Optional.of(users.get(userID));
  }

  @Override
  public List<User> findAll() {
    return new ArrayList<>(users.values());
  }
}

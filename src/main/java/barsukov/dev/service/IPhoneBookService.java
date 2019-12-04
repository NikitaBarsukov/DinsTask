package barsukov.dev.service;

import barsukov.dev.model.User;
import org.sk.PrettyTable;

import java.util.List;

public interface IPhoneBookService {

    String getAllUsers();

    Long createUser(User user);
}

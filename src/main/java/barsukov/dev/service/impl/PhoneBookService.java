package barsukov.dev.service.impl;

import barsukov.dev.model.User;
import barsukov.dev.service.IPhoneBookService;
import org.sk.PrettyTable;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.TreeMap;

@Service
public class PhoneBookService implements IPhoneBookService {

    Map<Long, User> users = new TreeMap();

    @Override
    public Long createUser(User user) {
        long id = (long) users.size() + 1;
        users.put(id, user);
        return id;
    }

    @Override
    public String getAllUsers() {
        PrettyTable table = new PrettyTable("id", "Full name");
        users.forEach((id, node) ->
                table.addRow(String.valueOf(id), node.getFullName()));
        return table.toString();
    }
}

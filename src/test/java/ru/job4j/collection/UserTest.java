package ru.job4j.collection;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        MatcherAssert.assertThat(it.next(), is(new User("Ivan", 31)));
        MatcherAssert.assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        MatcherAssert.assertThat(rsl, greaterThan(0));
    }
}
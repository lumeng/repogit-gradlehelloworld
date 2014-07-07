package net.meng6.gradlehelloworld;

/**
 * Author: XXX XXX <XXX@gmail.com>
 * Date: 7/3/14 9:55 AM
 */
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void testRepeat() {
        assertThat(Main.repeat("Foo", 3), equalTo("FooFooFoo"));
    }
}

package domein;
import java.util.ArrayList;
import java.util.List;


public class LijstEmails {


    public static List<String> lijstGoedeEmails() {
        List<String> lijstGoedeEmails = new ArrayList<>();
        lijstGoedeEmails.add("foo@baz.com");
        lijstGoedeEmails.add("foo.bar@baz.com");
        lijstGoedeEmails.add("foo@bar.baz.com");
        lijstGoedeEmails.add("foo+bar@baz.com");
        lijstGoedeEmails.add("foo@123.456.789.123");
        lijstGoedeEmails.add("foo@[123.456.789.123]");
        lijstGoedeEmails.add("123456789@baz.com");
        lijstGoedeEmails.add("foo@baz-quz.com");
        lijstGoedeEmails.add("_@baz.com");
        lijstGoedeEmails.add("________@baz.com");
        lijstGoedeEmails.add("foo@baz.name");
        lijstGoedeEmails.add("foo@baz.co.uk");
        lijstGoedeEmails.add("foo-bar@baz.com");
        lijstGoedeEmails.add("baz.com@baz.com");
        lijstGoedeEmails.add("foo.bar+qux@baz.com");
        lijstGoedeEmails.add("foo.bar-qux@baz.com");
        lijstGoedeEmails.add("foo.bar@baz.com.");
        lijstGoedeEmails.add("f@baz.com");
        lijstGoedeEmails.add("_foo@baz.com");
        lijstGoedeEmails.add("foo/bar=qux@baz.com");
        lijstGoedeEmails.add("foo@bar--baz.com");
        lijstGoedeEmails.add("foob*ar@baz.com");
        lijstGoedeEmails.add("guust.ysebie@live.be");
        lijstGoedeEmails.add("guust.ysebie@gmail.be");
        lijstGoedeEmails.add("guust.ysebie@telenet.be");

        return lijstGoedeEmails;

    }


}

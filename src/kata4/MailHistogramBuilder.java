package kata4;

import java.util.ArrayList;

public class MailHistogramBuilder {
    public static Histogram<String> build(ArrayList<String> mail) {
         Histogram<String> histo = new Histogram<>();
         for (String maill : mail) {
            histo.increment(new Mail(maill).getDomain());
        }
        return histo;
    }
}

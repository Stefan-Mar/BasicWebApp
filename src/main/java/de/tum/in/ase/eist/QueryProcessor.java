package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else if (query.contains("what is")) {
            query = query.substring(8);
            int n = query.indexOf('+');
            if (n == -1) return "";
            String a = query.substring(0, n);
            String b = query.substring(n+1);
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            return "" + (x + y);
        } else if (query.contains("which")) {
            query = query.substring(8);
            int n = query.indexOf('+');
            if (n == -1) return "";
            String a = query.substring(0, n);
            String b = query.substring(n+1);
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            return "" + (x + y);
        }
        return "";
    }
}

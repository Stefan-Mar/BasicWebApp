package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
            String[] split = query.split(" ");
            int i = 0;
            while (i < split.length) {
                if (split[i++].equals("plus")) {
                    break;
                }
            }
            int x = Integer.parseInt(split[i-2]);
            int y = Integer.parseInt(split[i]);
            return "" + (x + y);
        } else if (query.contains("which")) {
            String[] split = query.split(" ");
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < split.length; i++) {
                try {
                    int j = Integer.parseInt(split[i].substring(0, split[i].length()-1));
                    max = Math.max(max, j);
                } catch (Exception e) {}
            }
            return "" + max;
        }
        return "";
    }
}

import java.util.HashMap;
import java.util.Map;

public class 输出Url {
    public static void main(String[] args) {
        String[] urlList ={"http://www.bitedu.vip/thread-809.htm",

                "https://www.bitedu.vip:8080/thread-809.htm?query=peixinchen",
               
                };

        for(String str : urlList){
            parseUrl(str);
            System.out.println("___________________");
        }
    }
    private static Map<String, Integer> st = new HashMap<>();

    static {
        st.put("ssh", 22);
        st.put("http", 80);
        st.put("https", 443);
        st.put("jdbc:masql", 3306);
    }

    private static void parseUrl(String str) {
        System.out.println(str);
        System.out.println();

        int i = str.indexOf("://");
        String schema = str.substring(0,i);
        System.out.println(schema);

        String rest = str.substring(i+3);

        i = rest.indexOf("/");

        String host = rest.substring(0,i);
        rest = rest.substring(i+1);

        String[] fr = host.split(":");
        String domain;
        int port;
        if(fr.length == 1){
            domain = host;
            port = st.get(schema);
        }else{
            domain = fr[0];
            port = Integer.parseInt(fr[1]);
        }
        System.out.println(domain);
        System.out.println(port);

        String path;
        String queryString;
        /*
        fragments = rest.split("\\?");  // 记得对 ? 进行转义，传入的正则表达式，而 ? 正则表达式中有特殊含义，所以需要转义
        if (fragments.length == 1) {
            path = rest;
            queryString = "";
        } else {
            path = fragments[0];
            queryString = fragments[1];
        }
        //*/

        //*
        i = rest.indexOf("?");
        if (i == -1) {
            path = rest;
            queryString = "";
        } else {
            path = rest.substring(0, i);
            queryString = rest.substring(i + 1);
        }
        //*/

        System.out.println(path);
        System.out.println(queryString);

    }

}

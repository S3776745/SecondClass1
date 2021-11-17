package listMap;

import extends1.*;

public class array {

    public static void main(String[] args) {
        child2[] child2s = new child2[4];
        child2s[0] = new child2();
        child2s[0].id = 1;
        child2s[0].name = "a";
        child2s[0].enroll = true;

        child2s[1] = new child2();
        child2s[1].id = 2;
        child2s[1].name = "b";
        child2s[1].enroll = false;

        child2s[2] = new child2();
        child2s[2].id = 3;
        child2s[2].name = "c";
        child2s[2].enroll = false;

        child2s[3] = new child2();
        child2s[3].id = 4;
        child2s[3].name = "d";
        child2s[3].enroll = true;

        child2s[0].p13();

        for (int i = 0; i < child2s.length; i++) {
            System.out.println(child2s[i].id + " " + child2s[i].name + " " + child2s[i].enroll);
        }
    }

}

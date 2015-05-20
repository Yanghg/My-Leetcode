//fewer logic & lines version
public class Solution {
    public int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        int n1, n2;
        for (int i = 0; i < Math.max(v1.length,v2.length); i ++){
            n1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            n2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (n1 > n2)
                return 1;
            if (n1 < n2)
                return -1;
        }
        return 0;
    }
}
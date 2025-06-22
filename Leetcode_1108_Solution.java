class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        sb.append(address);
        String s = sb.toString();
        s = s.replace(".", "[.]");
        return s;
    }
}
class Solution {

    public String encode(List<String> strs) {
       StringBuilder sb= new StringBuilder();
        for ( int i =0 ;i<strs.size();i++){
            sb.append(strs.get(i).length()).append("#").append(strs.get(i));
        }
        return sb.toString();


    }

    public List<String> decode(String str) {
        List<String> res= new ArrayList();
        
        int i = 0;
        while (i < str.length()) {
            int slashIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, slashIndex));
            int j = slashIndex + 1;
            int q = j + length;
            res.add(str.substring(j, q));
            i = q;

        }
        return res;

    }
}

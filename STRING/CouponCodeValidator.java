class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> electronics =new ArrayList<>();
        List<String> grocery = new ArrayList<>();
        List<String> pharmacy = new ArrayList<>();
        List<String> restaurant =new ArrayList<>();
        for(int i=0;i<code.length;i++)
        {
            if(!isActive[i])
            {
                continue;
            }
            if(code[i].length()==0)
            {
                continue;
            }
            if(!code[i].matches("[a-zA-Z0-9_]+"))
            {
                continue;
            }
            if(businessLine[i].equals("electronics"))
            {
                electronics.add(code[i]);
            }
             else if(businessLine[i].equals("grocery"))
            {
            grocery.add(code[i]);
            }
            else if(businessLine[i].equals("pharmacy"))
            {
            pharmacy.add(code[i]);
            }
            else if(businessLine[i].equals("restaurant"))
            {
            restaurant.add(code[i]);
            }
       }
        Collections.sort(electronics);
          Collections.sort(grocery);
            Collections.sort(pharmacy);
              Collections.sort(restaurant);
      List<String> res=new ArrayList<>();
      res.addAll(electronics);
      res.addAll(grocery);
      res.addAll(pharmacy);
      res.addAll(restaurant);
      return res;
    }
}
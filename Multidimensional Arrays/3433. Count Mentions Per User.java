class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        
        events.sort((list1, list2) -> {
            int compareSecondColumn = Integer.compare(
				Integer.parseInt(list1.get(1)), 
				Integer.parseInt(list2.get(1))
				);
            if (compareSecondColumn == 0) {
                return list1.get(0).equals("OFFLINE") ? -1 : 1; 
            }
            return compareSecondColumn; 
        });
        Set<Integer> offline = new HashSet<>();
        List<Integer[]> offlineTime = new ArrayList<> ();
        int[] mentions = new int[numberOfUsers];
        int here = 0, all = 0;

        for(List<String> row: events){
            //Remvove offlines
            int currentTime = Integer.parseInt(row.get(1));
            while(offlineTime.size()>0 && ( (currentTime-(offlineTime.get(0)[1])) >= 60 ) ){
                offline.remove(offlineTime.get(0)[0]);
                offlineTime.remove(0);
            }
            //System.out.print(row);
            //System.out.print(Arrays.toString(offline.toArray()));
            if(row.get(0).equals("MESSAGE")){
                if(row.get(2).equals("ALL"))
                    all++;
                else if(row.get(2).equals("HERE")){
                    here++;
                    for(Integer i: offline)
                        mentions[i]--;
                }
                else{
                    String[] users = row.get(2).split(" ");
                    for(String s: users){
                        int user = Integer.parseInt(s.substring(2));
                        mentions[user]++;
                    }
                }
            }
            else{
                String[] offlineUsers = row.get(2).split(" ");
                for(String s: offlineUsers){
                    int user = Integer.parseInt(s);
                    offline.add(user);
                    int time = Integer.parseInt(row.get(1));
                    offlineTime.add(new Integer[] {user,time});
                }
            }
            //System.out.print(Arrays.toString(mentions));
            //System.out.println(Arrays.toString(offline.toArray()));
        }
        //System.out.println(here + " "+ all);
        for(int i=0; i<mentions.length; i++){
            mentions[i] += (here+all);
        }
        return mentions;
    }
}
/*
Time complexity - O(n * m)
    n - number of events
    m - number of offline users
Space compleixty - (n + u)
    n - number of events
    u - number of users
*/
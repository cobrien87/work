4


for (int i = 0; i<names.size(); i++):
   MemberInfo member = new MemberInfo(names.get(i), gradYear, true)
   memberList.add(member)



   arrayList<MemberInfo> removed = new ArrayList<MemberInfo>;
   for (int i = memberList.size() - 1; i>=0; i--){
     MemberInfo member = memberList.get(i);
     if member.getGradYear() <= year and member.inGoodStanding(){
       removed.add(member)
       memberList.remove(i)
     }
    return removed;

   }

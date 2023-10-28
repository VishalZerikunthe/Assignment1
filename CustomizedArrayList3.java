package CollectionFramework;

class Labour{
    int count, size=0;
    Object[] obj=new Object[count];
    public void add(Object o){
        obj[size]=o;
        size++;
        if(size== obj.length){
            Object[]newObj=new Object[count*2];
            for (int i = 0; i < newObj.length ; i++) {
                newObj[i]=obj[i];
            }
            newObj=obj;
        }
    }

}
public class CustomizedArrayList3 {
}

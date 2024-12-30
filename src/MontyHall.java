import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MontyHall {
    public int pickDoor (){
        Map<Integer, MontyHallDoorEnum> doors = new HashMap<>();

        int carIndex = (int) (Math.random() *10);
        int userChoiceIndex = (int) (Math.random() *10);
        System.out.println("UserChoiceIndex="+userChoiceIndex);

        for (int i=0; i<10; i++){
            if (carIndex==i){
                doors.put(i, MontyHallDoorEnum.CAR);
            }else{
                doors.put(i, MontyHallDoorEnum.GOAT);
            }
        }

        MontyHallDoorEnum car = doors.get(carIndex);

        MontyHallDoorEnum userChoice = doors.get(userChoiceIndex);


        System.out.println(doors);

        while (doors.size()>2){
            Integer removeKey = (int) (Math.random() *10);


            if (!removeKey.equals(userChoiceIndex) && !removeKey.equals(carIndex)) {
                System.out.println(removeKey);
                doors.remove(removeKey);
                System.out.println(doors);
            }
        }






        System.out.println("UserChoiceIndex="+userChoiceIndex);



        return 1;
    }
}

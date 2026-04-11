public enum Direction {
    // 1. 定義 Enum 常數，參數要同 Constructor 對應
    EAST(1, "East."), 
    SOUTH(2, "South"), 
    WEST(3, "West"), 
    NORTH(4, "North"); // 最後一個常數後面用分號

    // Attribute
    private int value;
    private String desc;


    //Presentation
    //Direction.North.opposite(){}
    public Direction opposite(){
      for(Direction d : Direction.values()){
        if (this.value * -1 == d.getValue()){
          return d;
        }
      }
    }

    // 2. Private Constructor: 必須接收 int 同 String
    private Direction(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    // Getter for value
    public int getValue() {
        return this.value;
    }

    // 3. 補返個 Getter for desc
    public String getDesc() {
        return this.desc;
    }

    public static void main(String[] args) {
        Direction d1 = Direction.SOUTH;
        System.out.println(d1.getValue());      // 輸出: 2
        System.out.println(d1.getDesc());       // 輸出: South
        
        System.out.println(Direction.EAST.getDesc()); // 輸出: East.
    }   

    for(Direction d : Direction.values()){
        System.out.println(d.getDesc());
      }


}






public class Card5 extends Card
{
    //A card with a L pattern.
    public Card5(){
    
        type="L";
        front=new char[][]{ {'■','■','■','■','■','■','■'},
                            {'■',' ','L',' ',' ',' ','■'},
                            {'■',' ','L',' ',' ',' ','■'},
                            {'■',' ','L','L','L',' ','■'},
                            {'■','■','■','■','■','■','■'}};
        back=new char[][]{ {'■','■','■','■','■','■','■'},
                            {'■',' ',' ',' ',' ',' ','■'},
                            {'■',' ',' ',' ',' ',' ','■'},
                            {'■',' ',' ',' ',' ',' ','■'},
                            {'■','■','■','■','■','■','■'}};                    
    }
}

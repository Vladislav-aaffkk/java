package lr5;

import java.util.ArrayList;
import java.util.List;

abstract class Decks {
   List<Table> tables;

   public Decks() {
       this.tables = new ArrayList<>();
   }
}
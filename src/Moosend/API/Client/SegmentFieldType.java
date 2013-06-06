
package Moosend.API.Client;


public enum SegmentFieldType
{
    Text {        
        public int valueOf() {
            return 0;
        }
    },
    
    Integer {        
        public int valueOf() {
            return 1;
        }
    },
    
    DateTime {        
        public int valueOf() {
            return 2;
        }
    },
    
    List {        
        public int valueOf() {
            return 3;
        }
    },
    
    Decimal {        
        public int valueOf() {
            return 4;
        }
    },
    
    Boolean {        
        public int valueOf() {
            return 5;
        }
    },
    
    Hash {        
        public int valueOf() {
            return 98;
        }
    },
    
    CustomField {        
        public int valueOf() {
            return 99;
        }
    }
}


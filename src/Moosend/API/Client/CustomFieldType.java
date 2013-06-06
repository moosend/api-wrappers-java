
package Moosend.API.Client;


public enum CustomFieldType
{
    Text {        
        public int valueOf() {
            return 0;
        }
    },
    
    Number {        
        public int valueOf() {
            return 1;
        }
    },
    
    DateTime {        
        public int valueOf() {
            return 2;
        }
    },
    
    SingleSelectDropdown {        
        public int valueOf() {
            return 3;
        }
    },
    
    CheckBox {        
        public int valueOf() {
            return 5;
        }
    }
        
}


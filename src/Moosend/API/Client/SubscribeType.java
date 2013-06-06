
package Moosend.API.Client;


public enum SubscribeType
{  
    Subscribed {
        public String getDescription() {
            return "Active";
        }
        public int valueOf() {
            return 1;
        }
    },
    
    Unsubscribed {
        public String getDescription() {
            return "Unsubscribed";
        }
        public int valueOf() {
            return 2;
        }
    },
    
    Bounced {
        public String getDescription() {
            return "Bounced";
        }
        public int valueOf() {
            return 3;
        }
    },
    
    Removed {
        public String getDescription() {
            return "Removed";
        }
        public int valueOf() {
            return 4;
        }
    }
}


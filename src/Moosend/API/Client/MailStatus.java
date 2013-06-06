
package Moosend.API.Client;


public enum MailStatus
{
    Sent {
        public String getDescription() {
            return "Sent";
        }
        public int valueOf() {
            return 0;
        }
    },
    
    Opened {
        public String getDescription() {
            return "Opened";
        }
        public int valueOf() {
            return 1;
        }
    },
    
    Bounced {
        public String getDescription() {
            return "Bounced";
        }
        public int valueOf() {
            return 2;
        }
    },
    
    NotOpened {
        public String getDescription() {
            return "Not Opened";
        }
        public int valueOf() {
            return 5;
        }
    },
    
    LinkClicked {
        public String getDescription() {
            return "Link Clicked";
        }
        public int valueOf() {
            return 3;
        }
    },
    
    ReadyToSend {
        public String getDescription() {
            return "Awaiting delivery";
        }
        public int valueOf() {
            return 4;
        }
    },
    
    Error {
        public String getDescription() {
            return "Error";
        }
        public int valueOf() {
            return 6;
        }
    },
    
    Forward {
        public String getDescription() {
            return "Forward";
        }
        public int valueOf() {
            return 7;
        }
    },
    
    Unsubscribed {
        public String getDescription() {
            return "Unsubscribed";
        }
        public int valueOf() {
            return 8;
        }
    },
    
    Complained {
        public String getDescription() {
            return "Complained";
        }
        public int valueOf() {
            return 9;
        }
    },
    
}


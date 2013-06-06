
package Moosend.API.Client;


public enum CampaignStatus
{
    Draft {
        public int valueOf() {
            return 0;
        }
    },
    
    ReadyToSend {
        public int valueOf() {
            return 1;
        }
    },
    
    Sent {
        public int valueOf() {
            return 3;
        }
    },
    
    SMTPReadyToSend {
        public int valueOf() {
            return 5;
        }
    },
    
    NotEnoughCredits {
        public int valueOf() {
            return 4;
        }
    },
    
    Sending {
        public int valueOf() {
            return 6;
        }
    },
    
    SelectingWinner {
        public int valueOf() {
            return 11;
        }
    },
    
    Archived {
        public int valueOf() {
            return 12;
        }
    }
}


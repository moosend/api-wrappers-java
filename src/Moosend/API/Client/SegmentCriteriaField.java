
package Moosend.API.Client;


public enum SegmentCriteriaField
{
    /**
    * Filters members by the date they where added in the mailing list
    */    
    DateAdded {
        public String getDescription() {
            return "Date Added";
        }
        public int valueOf() {
            return 1;
        }
    },
    
    /**
    * Filters members by the recipient name
    */
    RecipientName {
        public String getDescription() {
            return "Recipient Name";
        }
        public int valueOf() {
            return 2;
        }
    },
    
    /**
    * Filters members by their email address
    */
    RecipientEmail {
        public String getDescription() {
            return "Recipient Email";
        }
        public int valueOf() {
            return 3;
        }
    },
    
    /**
    * Filters members according to how many campaigns they have opened (within the past 60 days maximum)
    */
    CampaignsOpened {
        public String getDescription() {
            return "Campaigns Opened";
        }
        public int valueOf() {
            return 4;
        }
    },
    
    /**
    * Filters members according to how many links they have clicked from previous campaigns sent to them (within the past 60 days maximum)
    */
    LinksClicked {
        public String getDescription() {
            return "Links Clicked";
        }
        public int valueOf() {
            return 5;
        }
    },
    
    /**
    * Filters members according to which campaigns they have opened, based on their names
    */
    CampaignName {
        public String getDescription() {
            return "Campaign Name";
        }
        public int valueOf() {
            return 6;
        }
    },
    
    /**
    * Filters members according to which links they have clicked, based on their urls
    */
    LinkURL {
        public String getDescription() {
            return "Link URL";
        }
        public int valueOf() {
            return 7;
        }
    },
    
    /**
    * Filters members according to the type of the devices they use
    */
    Platform {
        public String getDescription() {
            return "Mobile vs Desktop";
        }
        public int valueOf() {
            return 8;
        }
    },
    
    /**
    * Filters members according to the operating systems they use
    */
    OperatingSystems {
        public String getDescription() {
            return "Operating System";
        }
        public int valueOf() {
            return 9;
        }
    },
    
    /**
    * Filters members according to the email clients they use
    */
    EmailClient {
        public String getDescription() {
            return "Email Client";
        }
        public int valueOf() {
            return 10;
        }
    },
    
    /**
    * Filters members according to the desktop web browsers they use
    */
    WebBrowser {
        public String getDescription() {
            return "Web Browser";
        }
        public int valueOf() {
            return 11;
        }
    },
    
    /**
    * Filters members according to the mobile browsers they use
    */
    MobileBrowser {
        public String getDescription() {
            return "Mobile Browser";
        }
        public int valueOf() {
            return 12;
        }
    },
    
    /**
    * Filters members according to the custom field specified by the CustomFieldID property
    */
    CustomField {
        public String getDescription() {
            return "Custom Field";
        }
        public int valueOf() {
            return 99;
        }
    },
    
//    private final int mask;
//    
//    private SegmentCriteriaField(int mask)
//    {
//        this.mask = mask;
//    }
//
//    public int getMask()
//    {
//        return mask;
//    }
}


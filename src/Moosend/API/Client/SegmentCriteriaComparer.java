
package Moosend.API.Client;


public enum SegmentCriteriaComparer
{
    Is {
        public String getDescription() {
            return "Is";
        }
        public int valueOf() {
            return 0;
        }
    },
    
    IsNot {
        public String getDescription() {
            return "is not";
        }
        public int valueOf() {
            return 1;
        }
    },
    
    Contains {
        public String getDescription() {
            return "contains";
        }
        public int valueOf() {
            return 2;
        }
    },
    
    DoesNotContain {
        public String getDescription() {
            return "does not contain";
        }
        public int valueOf() {
            return 3;
        }
    },
    
    StartsWith {
        public String getDescription() {
            return "starts with";
        }
        public int valueOf() {
            return 4;
        }
    },
    
    DoesNotStartWith {
        public String getDescription() {
            return "does not start with";
        }
        public int valueOf() {
            return 5;
        }
    },
    
    EndsWith {
        public String getDescription() {
            return "ends with";
        }
        public int valueOf() {
            return 6;
        }
    },
    
    DoesNotEndWith {
        public String getDescription() {
            return "does not end with";
        }
        public int valueOf() {
            return 7;
        }
    },
    
    IsGreaterThan {
        public String getDescription() {
            return "is greater than";
        }
        public int valueOf() {
            return 8;
        }
    },
    
    IsGreaterThanOrEqualTo {
        public String getDescription() {
            return "is greater than or equal to";
        }
        public int valueOf() {
            return 9;
        }
    },
    
    IsLessThan {
        public String getDescription() {
            return "is less than";
        }
        public int valueOf() {
            return 10;
        }
    },
    
    IsLessThanOrEqualTo {
        public String getDescription() {
            return "is less than or equal to";
        }
        public int valueOf() {
            return 11;
        }
    },
    
    IsBefore {
        public String getDescription() {
            return "is before";
        }
        public int valueOf() {
            return 12;
        }
    },
    
    IsAfter {
        public String getDescription() {
            return "is after";
        }
        public int valueOf() {
            return 13;
        }
    },
    
    IsEmpty {
        public String getDescription() {
            return "is empty";
        }
        public int valueOf() {
            return 14;
        }
    },
    
    IsNotEmpty {
        public String getDescription() {
            return "is not empty";
        }
        public int valueOf() {
            return 15;
        }
    },
    
    IsTrue {
        public String getDescription() {
            return "is true";
        }
        public int valueOf() {
            return 16;
        }
    },
    
    IsFalse {
        public String getDescription() {
            return "is false";
        }
        public int valueOf() {
            return 17;
        }
    }
}



package Moosend.API.Client;


public enum SegmentMatchType
{
    /**
    * Used in a segment to return the members in a mailing list that match all the given criteria
    */
    All {        
        public int valueOf() {
            return 0;
        }
    },
    
    /**
    * Used in a segment to return the members in a mailing list that match any of the given criteria
    */
    Any {        
        public int valueOf() {
            return 1;
        }
    },
}


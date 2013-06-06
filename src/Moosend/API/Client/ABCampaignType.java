
package Moosend.API.Client;


public enum ABCampaignType
{
    /**
    * Test two different versions of the sender name and send the final campaign to the one performing better
    */
    Sender,
    /**
    * Test two different versions of the campaign content and send the final campaign to the one performing better
    */
    Content,
    /**
    * Test two different versions of the subject line and send the final campaign to the one performing better
    */
    SubjectLine
}


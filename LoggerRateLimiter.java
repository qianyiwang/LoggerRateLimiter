public class LoggerRateLimiter {

    LinkedList<String> msgList;
    LinkedList<Integer> timeList;

    /** Initialize your data structure here. */
    public Logger() {
        this.msgList = new LinkedList();
        this.timeList = new LinkedList();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!msgList.contains(message)){
            msgList.offer(message);
            timeList.offer(timestamp);
            return true;
        }
        else{
            int idx = msgList.indexOf(message);
            int start_time = timeList.get(idx);
            
            if(timestamp-start_time>=10){
                timeList.set(idx,timestamp);
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static void main(String args[]){
        LoggerRateLimiter logger = new LoggerRateLimiter();
        logger.shouldPrintMessage([100,"bug"]);
        LinkedList stringList = new 
    }
}

["Logger","shouldPrintMessage","shouldPrintMessage"]
[[],[100,"bug"],[100,"bug"]]

package Prelim;


public class arithmetic {
    
    
}


select t2.event_name as "Name of Event",
t2.category as "Event Category", 
 t1.fullname as "Name of Facilitator" 
 from tbl_facilitator t1 inner join tbl_event t2 on t1.assigned_event_id = t2.event_id;
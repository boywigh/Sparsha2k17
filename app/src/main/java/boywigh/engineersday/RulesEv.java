package boywigh.engineersday;
/**
 * Created by boywigh on 2/9/17.
 */

public class RulesEv {
    public String r0,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14;
    public String events(int ch){
        r4="(a) 3 in a team\n"+
                "(b) Audition will held on 14th Sep 2017 Time:-2.00 pm\n"+
                "(c) Event will held 15th Sep 2017 on Stage\n"+
                "(d) Winner up & Runner up only\n"+
                "Faculty Coordinators:-Ms Brunda & Ms Anupama*\n";
        r0="(a) 3 + 1 min Karaoke\n"+
                "(b) Music has to Submitted before audition\n"+
                "(c) Audition will held on 14th Sep 2017 Time: -2.00 pm\n"+
                "(d) Event will held 15th Sep 2017 on Stage\n"+
                "(e) Winner up & Runner up only\n"+
                "Faculty Coordinators:-Ms Brunda\n";
        r1="(a) 3 + 1 min Karaoke\n"+
                "(b) Music has to Submitted before audition\n"+
                "(c) Audition will held on 14th Sep 2017 Time:-2.30 pm\n"+
                "(d) Event will held 15th Sep 2017 on Stage\n"+
                "(e) Winner up & Runner up only\n"+
                "Faculty Coordinators:-Mrs Shrungashree\n";
        r2="(a) 3 + 1 min Karaoke\n"+
                "(b) Music has to Submitted before audition\n"+
                "(c) Audition will held on 14th Sep 2017 Time:-2.30 pm\n"+
                "(d) Event will held 15th Sep 2017 on Stage\n"+
                "(e) Winner up & Runner up only\n"+
                "Faculty Coordinators:-Ms Brunda\n";
        r3="(a) 3 + 1 min\n"+
                "(b) Music has to Submitted before audition\n"+
                "(c) Audition will held on 14th Sep 2017 Time:-2.30 pm\n"+
                "(d) Event will held 15th Sep 2017 on Stage\n"+
                "(e) Winner up & Runner up only\n"+
                "Faculty Coordinators:-Mrs Shrungashree\n";
       r5="(a) Register has to done on or before 13th\n"+
"(b) Prequalifying round on 14th Sep 2017 Time:-2.00pm onwards\n"+
"(c) Final round on 15thSep 2017 on stage\n"+
"(d) Winner up & Runner up\n"+
"Faculty Coordinators:-Mr Karthik & Ms Pooja R H\n";
r6="(a) 3 in a team\n"+
"(b) Event will be held on 14th Sep 2017 Time:-12.15pm\n"+
"(c) Winner up & Runner up\n"+
"Faculty Coordinators:-Mrs Vani & Mrs Nandini\n"; 
r7="(a) Individual participant\n"+
"(b) Application will be provided (No hack version)\n"+
"(c) Event will held 14th Sep 2017 Time:-11.15am\n"+ 
"(d) Winner up & Runner up only\n"+
"Faculty Coordinators:-Mr Naveen\n"; 

r8="(a) 3 in a team(each from each semester)\n"+
"(b) Prequalifying round on 14th Sep 2017 Time:-9.30am-10.00am\n"+
"(c) Final round on 14th Sep 2017 Time:-2.15pm\n"+
"(d) Winner up & Runner up only\n"+
"Faculty Coordinators:-Mr Vasantha D & Mr Santhosh\n";
r9="(a) 3 in a team\n"+
"(b) Prequalifying round on 14th Sep 2017 Time:-10.00am-10.30am\n"+
"(c) Final round on 15thSep 2017 on stage\n"+
"(d) Winner up & Runner up only\n"+
"Faculty Coordinators:-Mrs Suman & Ms Chaya\n"; 
r10="(a) 1or 2 in a team\n"+
"(b) Topics has to be  given on or before 13th\n"+ 
"(c) Audition will be held on 14th Sep 2017 Time:-11.15am\n"+
"(d) Finalized topic will be presented on 15th Sep 2017 on Stage\n"+
"(e) Winner up & Runner up only\n"+
"Faculty Coordinators:-Mr Ravikiran & Mr Kiran\n"; 
r11="(a) 3 or 4 in a team\n"+
"(b) Time limit 90mins\n"+
"(c) Waste materials will not be provided\n"+ 
"(d) Event will held on 14th Sep 2017 Time:-10.00am-12.00pm\n"+
"(e) Winner up & Runner up only\n"+
"Faculty Coordinators:-Ms Pooja & Ms Anusha\n";

r12="(a)  Individual participant\n"+
"(b) Materials will not be provided\n"+
"(c)  Event will held 14th Sep 2017 Time:-11.15am to 12.15pm\n"+
"(d) Winner up & Runner up only\n"+
"Faculty Coordinators:-Mrs Keerthi & Mr Naveen\n"; 
r13="(a)  2 in a team\n"+
"(b) Materials will not be provided\n"+ 
"(c)  Event will held 14th Sep 2017 Time:-11.15am to 12.15pm\n"+
"(d) Winner up & Runner up only\n"+
"Faculty Coordinators:-Mrs Roopa & Mr Shilpa B R\n";
r14="(a)  2 or 3 in a team\n"+ 
"(b) Materials will not be provided\n"+
"(c)  Event will held 14th Sep 2017 Time:-2pm-3pm\n"+
"(d) Time limit of 60 mins\n"+
"(e)  Winner up & Runner up only\n"+
"Faculty Coordinators:-Mrs Shrungashree & Mrs Preethi\n";
        if(ch==0)
                return r0;
                else if(ch==1)
                return r1;
                else if(ch==2)
                    return r2;
                else if(ch==3)
                    return r3;
                else if(ch==4)
        return r4;
        else if(ch==5)
        return r5;
        else if(ch==6)
        return r6;
        else if(ch==7)
        return r7;
        else if(ch==8)
        return r8;
        else if(ch==9)
        return r9;
        else if(ch==10)
            return r10;
        else if(ch==11)
        return r11;
        else if(ch==12)
        return r12;
        else if(ch==13)
        return r13;
        else if(ch==14)
        return r14;
        return r1;



    }
}

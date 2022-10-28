package oct28Assg;

/*Movie Theatre Management System, where you can create two classes 
 * one is main another one is movie, 
movie class can have two methods setMovie,getMovie where
 you can create movieName,movieStartTime,movieEndTime,
MovieTicketPrice as instance variables
*/

class movie{
	String movieName,starttime,endtime;
	void setMovie(String name,String strttime,String endtime){
		movieName=name;
		starttime=strttime;
		this.endtime=endtime;
	}
	void getMovie(){
		System.out.println("MovieName="+movieName+" \nStart time="+starttime+" \nEndtime="+endtime);
	}
}
public class Theatre {

	public static void main(String[] args) {
		movie movie=new movie();
		movie.setMovie("barfi", "12:15pm", "05:00pm");
		movie.getMovie();
	}

}


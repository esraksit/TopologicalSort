import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main (String[] args) {
	
	
		
	
	Queue q = new LinkedList();
	int count = 0 ;	
	
	int [][] graph ={{0,1,0,0,0,1,0,0,0,0},    {0,0,0,0,0,0,0,1,0,0}    ,{0,0,0,0,0,0,0,0,0,0}    ,{0,0,1,0,1,0,0,1,1,0}   ,  {0,0,0,0,0,0,0,0,1,0}, 
			{0,0,0,0,0,0,0,0,0,0},   {1,1,1,0,0,0,0,0,0,0} ,   {0,0,0,0,0,0,0,0,0,0}   , {0,0,0,0,0,0,0,1,0,0}  ,  {0,0,0,0,1,0,0,0,0,0}};
	
	for(int n=0; n<10;n++) {
	
	for (int i =0; i<10; i++) {
		
		for(int j =0; j<10; j++) {
			
			if(graph[i][j]== 1 ) {
			count= count+1;}
		}
		
		int vertex = i +1;
		System.out.println("Vertex " + vertex + "  Count:" + count );
		
		if(count==0) {
			q.add(vertex);	
		}
		
		count=0;
	
	}
	
	System.out.println("");
	System.out.println(q);
	System.out.println("");
	
	
	 
	while (q.size()!=0){
		
		int num=(int) q.element();		
		System.out.println(num);
		
		for (int l = 0 ; l<10; l++) {
			graph[l][num-1]=0;
		}
		
		q.remove(num);
		System.out.println(q); 
		
    }
	
	
	}
	
			
       }
}

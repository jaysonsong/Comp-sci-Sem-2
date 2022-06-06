import pkg.*;


public int countElectronicsByMaker(String maker){
	int total = 0;
	for(int i;i<purchases.size();i++){
		if(i.getmaker().equals(maker)&&g.isElectronic){
			total++;
		}
	}
	return total;
}
public boolean hasAdjacentEqualPair(){
	int gt = purchase.get(0);
	for(int i = 1;i<purchases.size();i++){
		int gy = purchases.get(i);
		if(gt.equals(gy)){
			return true;
		}
	}
	return false;
}

public class GizmoRunner
{
   public static void main(String args[])
	{
		Gizmo gz = new Gizmo( "sony", true );
		System.out.println( gz.getMaker() );
		System.out.println( gz.isElectronic() );
		System.out.println( gz.getMaker() );
		System.out.println( gz );	
			
		Gizmo et = new Gizmo( "aplus", false );	
		System.out.println( et );
										
		System.out.println( et.equals( gz ) );	
			
		Gizmo at = new Gizmo( "sony", true );
		System.out.println( at );
			
		System.out.println( at.equals( gz ) );																															
	} 
}
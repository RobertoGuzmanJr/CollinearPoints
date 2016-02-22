import java.lang.*;
import java.util.*;

public class BruteCollinearPoints {
	private LineSegment[] segments;
	
	// finds all line segments containing 4 points
	public BruteCollinearPoints(Point[] points)
	{
		//check corner cases
		if(points == null)
		{
			throw new NullPointerException();
		}
		for(int i = 0; i < points.length-1; i++)
		{
			if(points[i] == null)
			{
				throw new NullPointerException();
			}
			else
			{
				for(int j = i+1; j < points.length; j++)
				{
					if(points[j] == null)
					{
						throw new NullPointerException();
					}
					if(AreEqual(points[i],points[j]))
					{
						throw new IllegalArgumentException();
					}
				}
			}
		}
		
		for(int i = 0; i < points.length; i++)
		{
			
		}	
	}
	
	//determines if the two points are the same
	public boolean AreEqual(Point A, Point B)
	{
		if(A.compareTo(B) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// the number of line segments
	public int numberOfSegments()
	{
		return segments.length;
	}
	
	// the line segments
	public LineSegment[] segments()
	{
		return segments;
	}
}



public abstract class Player 
{
	private int id_;
	private int score_;
	
	/**
	 * Initializing constructor.
	 * 
	 * @param[in]		id		Player's Unique ID
	 */
	public Player(int id)
	{
		id_    = id;
		score_ = 0;
	}
	
	/**
	 * Returns a given players unique ID.
	 * 
	 * @return		id_
	 */
	public int getID()
	{
		return id_;
	}
	
	/**
	 * Sets the players unique ID to an integer passed in.
	 * 
	 * @param[id]		Players ID
	 */
	public void setID(int id)
	{
		id_ = id;
	}
	
	/**
	 * Returns a given players score.
	 * 
	 * @return		id_
	 */
	public int getScore()
	{
		return score_;
	}
	
	/**
	 * Sets the players score to an integer passed in.
	 * 
	 * @param[id]		Players ID
	 */
	public void setScore(int score)
	{
		score_ = score;
	}
	
	/**
	 * The Is_Collision() method enables users to determine if two bodies
	 * have positions in similar locations.
	 * 
	 * @return		True/False Collides
	 */
	public boolean Is_Collision() 
	{
		
		return false;
	}
	
	/**
	 * The Collides_With() method describes the type of object that a player
	 * has collided with.  This can be used to determine how a given player
	 * should react to a specific collision.
	 * 
	 * @return		Object Type
	 */
	public String Collides_With()
	{
		return "";
	}
	
	 /**
	  * Allows a Player the ability to move on screen. The Move() method is
	  * abstracted to allow each child-class the ability to customize
	  * its movement behavior, without allowing the Player class to be
	  * instantiated.
	  * 
	  */
	abstract void Move();
	
}

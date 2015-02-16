import java.util.ArrayList;

public class Country 
{
	private String countryName;
	private ArrayList<Player> players;
	
	public Country(String name)
	{
		this.countryName = countryName;
		this.players = new ArrayList<Player>();
	}
	
	public void addPlayer(Player p)
	{
		this.players.add(p);
	}
	
	public Player getPlayer(int index)
	{
		return this.players.get(index);
	}

	public String getCountryName() 
	{
		return countryName;
	}

	public void setCountryName(String countryName) 
	{
		this.countryName = countryName;
	}

}

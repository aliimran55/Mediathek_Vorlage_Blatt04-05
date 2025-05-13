
public abstract class AbstractMedium implements Medium {

	protected String _titel;
	protected String _kommentar;
	
	
	
	public AbstractMedium(String titel, String kommentar)
	{
		assert titel != null : "Vorbedingung verletzt: titel != null";
		assert kommentar != null: "Vorbedingung verletzt: kommentar != null";
		this._titel = titel;
		this._kommentar = kommentar;
	}
	
	@Override
	public String getTitel()
	{
		return _titel;
	}
	
	@Override 
	public void setTitel(String titel)
	{
		assert titel != null: "Vorbedingung verletzt: titel != null";
		this._titel = titel;
	}
	
	@Override
	public void setKommentar(String kommentar)
	{
		assert kommentar != null: "Vorbedigung verletzt: kommenar != null";
		this._kommentar = kommentar;
	}
	
	@Override
	public String getKommentar()
	{
		return _kommentar;
	}
	
	@Override 
	public String getFormatiertenString()
	{
		 return getMedienBezeichnung() + ":\n" + "    " + "Titel: " + _titel
	                + "\n" + "    " + "Kommentar: " + _kommentar + "\n";
	    
	}
	
	@Override
	public abstract String getMedienBezeichnung();

	
}

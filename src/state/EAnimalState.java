package state;

public enum EAnimalState
{
	DEAD("Mort", null),
	BAD_HEALTH("Etat critique", DEAD),
	MEDIUM_HEALTH("Malade", BAD_HEALTH),
    GOOD_HEALTH("Bonne sante", MEDIUM_HEALTH);   
    
    private EAnimalState         nextStepState;
    
    private String             state;
    
    private EAnimalState(String state, EAnimalState nextStepState)
    {
        this.state             = state;
        this.nextStepState    = nextStepState;
    }

    public String getState()                    {return state;}

    public EAnimalState getNextStepState()        {return nextStepState;}
    
}

package state;

public enum EAnimalState
{
	DEAD("mort", null),
	BAD_HEALTH("en etat critique", DEAD),
	MEDIUM_HEALTH("malade", BAD_HEALTH),
    GOOD_HEALTH("en bonne sante", MEDIUM_HEALTH);
    
    private EAnimalState         nextStepState;
    
    private String             state;
    
    private EAnimalState(String state, EAnimalState nextStepState)
    {
        this.state            = state;
        this.nextStepState    = nextStepState;
    }

    public String getState()                    {return state;}

    public EAnimalState getNextStepState()        {return nextStepState;}
    
}

import universe.emotions.EmotionAngry

public final class EmotionsHandler extends HumanFunction {

    

    @Override
    public void angerManager(EmotionAngry){
    if(anger.getCause == EmotionCause.sibling){
       anger.isUnderstood(true);
       anger.setCooldownTime(Integer.MAX_VALUE);
       }
    }
}

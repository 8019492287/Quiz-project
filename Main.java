import java.util.*;
class Question{
  private String text;
  private String[] options;
  private int correctAnswer;
  public Question(String text,String[] options,int correctAnswer){
    this.text=text;
    this.options=options;
    this.correctAnswer=correctAnswer;
  }
  public String getText(){
    return text;
  }
  public String[] getOptions(){
    return options;
  
  }
  public int getCorrectAnswer(){
    return correctAnswer;
  }
}
  class Quiz{
    private ArrayList<Question>questions;
    public Quiz(){
      questions = new ArrayList<>();
    }
    public void addQuestion(Question question){
      questions.add(question);
    }
    public void takeQuiz(){
      Scanner scanner = new Scanner(System.in);
      int score=0;
      for(Question question:questions){
        System.out.println(question.getText());
        for(int i=0;i<question.getOptions().length;i++){ 
        System.out.println((i+1)+"."+question.getOptions()[i]);
      }
      System.out.println("Enter your answer");
      int userAnswer = scanner.nextInt();
      if(userAnswer == question.getCorrectAnswer()){
        score++;
      }
    }
    
     System.out.println("your score is:"+score+"/"+questions.size());
} 
  }
public class Main{
  public static void main(String[] args){
    Quiz quiz=new Quiz();
    quiz.addQuestion(new Question("what is the capital of india?",new String[]{"Delhi","Gujarat","Andhra pradhesh","Karnataka"},1));
    quiz.addQuestion(new Question("which ocean is the largest?",new String[]{"Indian Ocean","Pacific Ocean","Atlantic Ocean","Sutheren Ocean"},2));
    quiz.addQuestion(new Question("what is the largest country?",new String[]{"Canada","China","India","Russia"},41
  ));
    quiz.takeQuiz();
  }

}
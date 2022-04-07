package _04_class_object_java.exercise.class_stop_watch;

public class StopWatch {
   private double startTime;
   private double endTime;
   public StopWatch(){
   }

   public double getStartTime() {
       return this.startTime;
   }

   public double getEndTime() {
       return this.endTime;
   }

   public double start() {
      return this.startTime=System.currentTimeMillis();
   }

   public double end() {
      return this.endTime=System.currentTimeMillis();
   }

   public double getElapsedTime() {
       return this.endTime - this.startTime;
   }


}

public class RunForYourLife implements Runnable {
    private Thread t;
    private String threadName;
    private String name;
    private int checkpoint;
    private double weight;

    public RunForYourLife(String name, Double weight)
    {
        this.name = name;
        this.threadName = name + "Thread";
        this.weight = weight;
        this.checkpoint = 0;
    }


    public void run() {
    //first time thread running
        System.out.println(name + " , go!!!" );

        //start running
        while (getCheckpoint() != 20){
            //delay running
            int randNumber = (int) Math.round(LetsGO.getRandomNumber()*weight);
            try {
                Thread.sleep(randNumber);
            }
            catch (InterruptedException e){
                System.out.println(name+"interrupted.");
            }
            System.out.println(name + " has passed checkpoint" + checkpoint);
            checkpoint++;
        }
        //finished running
        System.out.println(name + "has finished!");
    }
    public void start(){
        if (t==null) {
            //creating thread
            t = new Thread(this, threadName);
            System.out.println(name+" ,Ready..");
            //starting thread
            System.out.println(name+" ,Set....");
            t.start();

        }
    }
    public String getName(){
        return name;
    }

    public int getCheckpoint() {
        return checkpoint;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setCheckpoint(int checkpoint){
        this.checkpoint=checkpoint;
    }
}

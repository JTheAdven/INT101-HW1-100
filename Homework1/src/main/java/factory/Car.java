package factory;

public class Car {
    //attribute
        //model
        //year
        //color
        private String model;
        private int year;
        private String color;
        boolean isEngineStart = false;
        
    public Car(String model, int year, String color)
    {
        this.model = model;
        this.year = year;
        this.color = color;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        
    //method
        public void startEngine()
        {
            isEngineStart = true;
            System.out.println("Start Engine");
        }
        
        public void run()
        {
            if(isEngineStart != true)
            {
                System.out.println("Engine hasn't started yet! Please start your engine");
            }
            
            else
            {
                System.out.println("The car is running.");
            }
        }
}

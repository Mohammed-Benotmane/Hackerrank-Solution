

class Student extends Person{
	private int[] testScores;

    public Student(String firstName,String lastName,int id,int[] testScores){
        super(firstName,lastName,id);
        this.testScores = testScores;
    } 

    public char calculate(){
        int sum = 0;
        for(int i=0;i<testScores.length;i++){
            sum += testScores[i];
        }
        sum /= testScores.length;
        if(sum < 40){
            return 'T';
        }else if(sum < 55){
            return 'D';
        }else if(sum < 70){
            return 'P';
        }else if(sum < 80){
            return 'A';
        }else if(sum < 90){
            return 'E';
        }else{
            return 'O';
        }
    }

}


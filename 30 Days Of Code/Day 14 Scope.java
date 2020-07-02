    public Difference(int[] elements){
        this.elements = elements;
    }

    void computeDifference(){
        int diffTemp;
        for(int i=0;i<elements.length;i++){
            for(int j=i;j<elements.length;j++){
                diffTemp= elements[i] - elements[j];
                if(diffTemp<0){
                    diffTemp = -diffTemp;
                }
                if(diffTemp>maximumDifference){
                    maximumDifference=diffTemp;
                }
            }
        }
    
    }  
    
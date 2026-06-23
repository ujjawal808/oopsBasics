Studen(Studen s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        // in shallow constructors we make a new array of marks and insert each marks so that after copy changes will not reflect.
        for(int i=0;i<marks.length;i++){
        this.marks[i]=s1.marks[i];
        }
    }
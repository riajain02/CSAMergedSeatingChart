# CSAMergedSeatingChart

Step 1: Modify your student subclass - go to the code for StudentName.java.
  A - Modify the default constructor by adding another argument:
      public StudentName(String f, String l, int r, int s, int p) {}
  B - Add a line of code inside the constructor code:
      public StudentName(String f, String l, int r, int s, int p) {
          firstName=f;
          lastName=l;
          myRow=r;
          mySeat=s;
          period=p; // ADD THIS LINE
          (etc)
      }
Step 2: Modify the Classroom class - go to the code for Classroom.java.
  A - Only go to the prepare() method. This is the only method to modify.
  B - Add the following lines of code inside the method:
      public void prepare()
      {
         StudentName objectname = new StudentName("FirstName", "LastName", xcor, ycor, period#);
         // Most of the line above^ should be there. Only add the additional argument as an integer.
         listo.add(objectname); // adds the object to the ArrayList
Step 3: Make sure the code compiles locally before committing.

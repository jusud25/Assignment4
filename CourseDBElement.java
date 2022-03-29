
/**
 * In this class, five attributes are created, and with constructor which has 
 * has one parameter constructor that contains five variables with one 
 * default constructor. And other implementation.
 * @author djusu
 */
public class CourseDBElement implements Comparable<Object>{
        private String ID;
        private int CRN;
        private int numOfCredits;
        private String numOfRoom;
        private String instructorName;
        /**
         *constructor with parameter variables
         * @param i To initialize parameter variable i to ID
         * @param c To initialize parameter variable c
         * @param n To initialize parameter variable n
         * @param roomNum to initialize parameter variable room
         * @param instructor To initialize parameter variable in to instructorName
         */
        public CourseDBElement(String i, int c, int n, String room, String in) {
                ID = i;
                CRN = c;
                numOfCredits = n;
                numOfRoom = room;
                instructorName = in;
        }
        /**
         * Create a default constructor
         */
        public CourseDBElement() {
                ID = "";
                CRN = 0;
                numOfCredits = 0;
                numOfRoom = "";
                instructorName = "";
        }
        /**
         * 
         * @param a parameter variable CourseDBElement with the variable element
         * @return crn - element.cr
         */
        public int compareTo(CourseDBElement element) {
                return CRN - element.CRN;
        }
        /**
         * @return return CRN
         */
        public int getCRN() {
                return CRN;
        }
        /**
         * @param crn sets crn to CRN
         */
        public void setCRN(int crn) {
                CRN = crn;
        }
        /**
         * Gets CRN and converts it into string, which return the hashcode of the string 
         * @return str.hashCode()
         */
        @Override
        public int hashCode() {
                String str = CRN + "";
                return str.hashCode();
        }
       /**
        * @param uses stoll to make comparison
        * @return return true if the object is equal to the object argument
        */
        @Override
        public boolean equals(Object stoll) {
                if (this ==stoll)
                        return true;
                if (stoll == null)
                        return false;
                if (getClass() != stoll.getClass())
                        return true;
                CourseDBElement keep = (CourseDBElement) stoll;
                if (CRN != keep.CRN)
                	return false;
                return true;
        }
        /**
         * @return to return the string of all the object
         */
        @Override
        public String toString() {
               return "\nCourse:" + ID + " CRN:" + CRN + " Credits:" + numOfCredits + " Instructor:" + instructorName + " Room:" + numOfRoom;
               
        }
        /**
         * @return to return numOfRoom
         */
		public Object getRoomNum() {
			// TODO Auto-generated method stub
			return numOfRoom;
		}
		/**
		 * 
		 * @return return ID
		 */
		public Object getID() {
			// TODO Auto-generated method stub
			return ID;
		}
		/**
		 * @return return 0
		 */
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
        
}
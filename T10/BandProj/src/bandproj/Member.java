package bandproj;

/**
 *
 * @author Mohamed SERHIR
 */
public class Member {
        //Private attributes
        private String name;
        private String instrument;
        
        //Constructor
        public Member(String _name, String _instrument){
            name = _name;
            instrument = _instrument;
        }
        
        //public Methods
        public String getName(){
            return name;
        }
        public String getInstrument(){
            return instrument;
        }
        
        public void setName(String _name){
            name = _name;
        }
        public void setInstrument(String _instrument){
            instrument = _instrument;
        }
        
}

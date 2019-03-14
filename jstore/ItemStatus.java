
/**
 * Enumeration class ItemStatus 
 *
 * @author GemmaRetalAnanda
 * @version 1.3
 */
public enum ItemStatus {

    New {
        public String toString() {
            return "New";
        }
    }
    ,
    Second {
        public String toString() {
            return "Second";
        }
    }
    ,
    Refurbished {
        public String toString() {
            return "Refurbished";
        }
    }
    ,
    Sold {
        public String toString() {
            return "Sold";
        }
    }
}
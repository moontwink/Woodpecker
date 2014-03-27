
package model;

/**
 *
 * @author Nancy
 */
public class TMDrillModel {
    private int level;
    private String tablename;

    public TMDrillModel() {
        level = 0;
    }
    
    public TMDrillModel(int level, String tablename) {
        this.level = level;
        this.tablename = tablename;
    }
    
    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the tablename
     */
    public String getTablename() {
        return tablename;
    }

    /**
     * @param tablename the tablename to set
     */
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }
}

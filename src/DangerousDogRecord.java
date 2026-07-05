/**
 * Represents a single Dangerous Dog Order record extracted from the CSV dataset.
 *
 * <p>Each record stores:
 * <ul>
 *   <li>The year in which the order was issued</li>
 *   <li>The type or severity of the order</li>
 * </ul>
 *
 * <p>This class acts as a simple data container to support filtering
 * and aggregation operations in the Controller.
 */
public class DangerousDogRecord {
    String year;
    String orderType;

    /**
     * Constructs a new {@code DangerousDogRecord}.
     *
     * @param year the year the dangerous dog order was issued
     * @param orderType the severity or category of the order
     */
    public DangerousDogRecord(String year, String orderType){
        this.year = year;
        this.orderType = orderType;
    }

    /**
     * Returns the year associated with this dangerous dog order.
     *
     * @return the year the order was issued
     */
    public String getYear() {
        return year;
    }

    /**
     * Returns the year associated with this dangerous dog order.
     *
     * @return the year the order was issued
     */
    public String getOrderType(){
        return orderType;
    }
}


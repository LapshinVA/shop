package Entity;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Map;

public class Order {
    Map<StatusOrder, Date> history;
    private int idOrder;
    private String nameClient;
    private String addressOfClient;
    private Data dataOrder;
    private StatusOrder statusOrder;

    public Order(String nameClient, String addressOfClient, Data dataOrder, StatusOrder statusOrder) {
        this.idOrder++;
        this.nameClient = nameClient;
        this.addressOfClient = addressOfClient;
        this.dataOrder = dataOrder;
        this.statusOrder = statusOrder;
    }

    public Map<StatusOrder, Date> getHistory() {
        return history;
    }

    public void setHistory(Map<StatusOrder, Date> history) {
        this.history = history;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getAddressOfClient() {
        return addressOfClient;
    }

    public void setAddressOfClient(String addressOfClient) {
        this.addressOfClient = addressOfClient;
    }

    public Data getDataOrder() {
        return dataOrder;
    }

    public void setDataOrder(Data dataOrder) {
        this.dataOrder = dataOrder;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "history=" + history +
                ", idOrder=" + idOrder +
                ", nameClient='" + nameClient + '\'' +
                ", addressOfClient='" + addressOfClient + '\'' +
                ", dataOrder=" + dataOrder +
                ", statusOrder=" + statusOrder +
                '}';
    }
}

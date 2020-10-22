package rentalService;

public class InstallScheduled extends AbstractEvent {

    private Long id;
    private Long installId;
    private Integer qty;
    private String status;

    public InstallScheduled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getInstallId() {
        return installId;
    }

    public void setInstallId(Long installId) {
        this.installId = installId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

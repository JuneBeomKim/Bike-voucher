package BikeRental;

public class VoucherUpdate extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long voucherCnt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getVoucherCnt() {
        return voucherCnt;
    }

    public void setVoucherCnt(Long voucherCnt) {
        //0보다 작은 경우는 0 return
        if (voucherCnt < 0) voucherCnt = 0L;

        this.voucherCnt = voucherCnt;
    }
}
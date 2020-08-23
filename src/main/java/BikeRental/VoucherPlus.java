package BikeRental;

public class VoucherPlus extends AbstractEvent {
//--> VoucherMinus, VoucherPlus가 함께 호출되어 VoucherUpdate에서 처리하도록 변경 (20.08.23)
//--> 사용하지 않음

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
        //Voucher 개수 1만큼 증가
        voucherCnt++;
        return voucherCnt;
    }

    public void setVoucherCnt(Long voucherCnt) {
        this.voucherCnt = voucherCnt;
    }
}
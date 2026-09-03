package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.PayOrder;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0oo extends OooOOO0<PayOrder> {
    public oO0Oo0oo(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR IGNORE INTO `PayOrderTable` (`user_id`,`order_id`,`sku`,`amount`,`type`,`purchase_token`,`huaWeiAccountFlag`,`isConsume`,`purchaseState`,`isAcknowledged`,`isSubscription`,`subscriptionState`,`subscriptionId`,`subscriptionOrderId`,`createTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, PayOrder payOrder) {
        PayOrder payOrder2 = payOrder;
        supportSQLiteStatement.bindLong(1, payOrder2.getUserId());
        if (payOrder2.getOrderId() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, payOrder2.getOrderId());
        }
        if (payOrder2.getSku() == null) {
            supportSQLiteStatement.bindNull(3);
        } else {
            supportSQLiteStatement.bindString(3, payOrder2.getSku());
        }
        if (payOrder2.getAmount() == null) {
            supportSQLiteStatement.bindNull(4);
        } else {
            supportSQLiteStatement.bindDouble(4, payOrder2.getAmount().doubleValue());
        }
        supportSQLiteStatement.bindLong(5, payOrder2.getType());
        if (payOrder2.getPurchaseToken() == null) {
            supportSQLiteStatement.bindNull(6);
        } else {
            supportSQLiteStatement.bindString(6, payOrder2.getPurchaseToken());
        }
        supportSQLiteStatement.bindLong(7, payOrder2.getHuaWeiAccountFlag());
        supportSQLiteStatement.bindLong(8, payOrder2.getIsConsume() ? 1L : 0L);
        supportSQLiteStatement.bindLong(9, payOrder2.getPurchaseState());
        supportSQLiteStatement.bindLong(10, payOrder2.getIsAcknowledged() ? 1L : 0L);
        supportSQLiteStatement.bindLong(11, payOrder2.getIsSubscription() ? 1L : 0L);
        supportSQLiteStatement.bindLong(12, payOrder2.getSubscriptionState());
        if (payOrder2.getSubscriptionId() == null) {
            supportSQLiteStatement.bindNull(13);
        } else {
            supportSQLiteStatement.bindString(13, payOrder2.getSubscriptionId());
        }
        if (payOrder2.getSubscriptionOrderId() == null) {
            supportSQLiteStatement.bindNull(14);
        } else {
            supportSQLiteStatement.bindString(14, payOrder2.getSubscriptionOrderId());
        }
        supportSQLiteStatement.bindLong(15, payOrder2.getCreateTime());
    }
}

package p490o0o00O0;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.AccessToken;
import com.yalla.yalla.common.db.table.PayOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;
import p091o000o00o.o0Oo0oo;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f41091OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<PayOrder> f41092OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f41093OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f41094OooO0Oo;

    public class OooO implements Callable<Unit> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ List f41095OooO00o;

        public OooO(List list) {
            this.f41095OooO00o = list;
        }

        @Override // java.util.concurrent.Callable
        public final Unit call() throws Exception {
            oo000o.this.f41091OooO00o.OooO0OO();
            try {
                oo000o.this.f41092OooO0O0.OooO0o(this.f41095OooO00o);
                oo000o.this.f41091OooO00o.OooOOOO();
                return Unit.INSTANCE;
            } finally {
                oo000o.this.f41091OooO00o.OooOO0O();
            }
        }
    }

    public class OooO00o extends o000OOo<PayOrder> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR IGNORE INTO `PayOrderTable` (`user_id`,`order_id`,`sku`,`amount`,`type`,`purchase_token`,`huaWeiAccountFlag`,`isConsume`,`purchaseState`,`isAcknowledged`,`isSubscription`,`subscriptionState`,`subscriptionId`,`subscriptionOrderId`,`createTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, PayOrder payOrder) {
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

    public class OooO0O0 extends o0000OO0 {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "delete from PayOrderTable where order_id =?";
        }
    }

    public class OooO0OO extends o0000OO0 {
        public OooO0OO(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "update PayOrderTable set isConsume=? where order_id=?";
        }
    }

    public class OooO0o implements Callable<Unit> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ PayOrder f41097OooO00o;

        public OooO0o(PayOrder payOrder) {
            this.f41097OooO00o = payOrder;
        }

        @Override // java.util.concurrent.Callable
        public final Unit call() throws Exception {
            oo000o.this.f41091OooO00o.OooO0OO();
            try {
                oo000o.this.f41092OooO0O0.OooO0oO(this.f41097OooO00o);
                oo000o.this.f41091OooO00o.OooOOOO();
                return Unit.INSTANCE;
            } finally {
                oo000o.this.f41091OooO00o.OooOO0O();
            }
        }
    }

    public class OooOO0 implements Callable<Unit> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f41099OooO00o;

        public OooOO0(String str) {
            this.f41099OooO00o = str;
        }

        @Override // java.util.concurrent.Callable
        public final Unit call() throws Exception {
            SupportSQLiteStatement supportSQLiteStatementOooO00o = oo000o.this.f41093OooO0OO.OooO00o();
            String str = this.f41099OooO00o;
            if (str == null) {
                supportSQLiteStatementOooO00o.bindNull(1);
            } else {
                supportSQLiteStatementOooO00o.bindString(1, str);
            }
            oo000o.this.f41091OooO00o.OooO0OO();
            try {
                supportSQLiteStatementOooO00o.executeUpdateDelete();
                oo000o.this.f41091OooO00o.OooOOOO();
                return Unit.INSTANCE;
            } finally {
                oo000o.this.f41091OooO00o.OooOO0O();
                oo000o.this.f41093OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
            }
        }
    }

    public class OooOO0O implements Callable<Unit> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f41101OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ String f41102OooO0O0;

        public OooOO0O(boolean z, String str) {
            this.f41101OooO00o = z;
            this.f41102OooO0O0 = str;
        }

        @Override // java.util.concurrent.Callable
        public final Unit call() throws Exception {
            SupportSQLiteStatement supportSQLiteStatementOooO00o = oo000o.this.f41094OooO0Oo.OooO00o();
            supportSQLiteStatementOooO00o.bindLong(1, this.f41101OooO00o ? 1L : 0L);
            String str = this.f41102OooO0O0;
            if (str == null) {
                supportSQLiteStatementOooO00o.bindNull(2);
            } else {
                supportSQLiteStatementOooO00o.bindString(2, str);
            }
            oo000o.this.f41091OooO00o.OooO0OO();
            try {
                supportSQLiteStatementOooO00o.executeUpdateDelete();
                oo000o.this.f41091OooO00o.OooOOOO();
                return Unit.INSTANCE;
            } finally {
                oo000o.this.f41091OooO00o.OooOO0O();
                oo000o.this.f41094OooO0Oo.OooO0Oo(supportSQLiteStatementOooO00o);
            }
        }
    }

    public class OooOOO0 implements Callable<List<PayOrder>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f41104OooO00o;

        public OooOOO0(o0000O0 o0000o1) {
            this.f41104OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final List<PayOrder> call() throws Exception {
            OooOOO0 oooOOO0;
            Cursor cursorOooOOO = oo000o.this.f41091OooO00o.OooOOO(this.f41104OooO00o);
            try {
                int iOooO00o = o00O0O.OooO00o(cursorOooOOO, AccessToken.USER_ID_KEY);
                int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "order_id");
                int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "sku");
                int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "amount");
                int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "type");
                int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "purchase_token");
                int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "huaWeiAccountFlag");
                int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "isConsume");
                int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "purchaseState");
                int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "isAcknowledged");
                int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "isSubscription");
                int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "subscriptionState");
                int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "subscriptionId");
                int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "subscriptionOrderId");
                try {
                    int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "createTime");
                    int i = iOooO00o14;
                    ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                    while (cursorOooOOO.moveToNext()) {
                        PayOrder payOrder = new PayOrder();
                        int i2 = iOooO00o12;
                        int i3 = iOooO00o13;
                        payOrder.setUserId(cursorOooOOO.getLong(iOooO00o));
                        payOrder.setOrderId(cursorOooOOO.isNull(iOooO00o2) ? null : cursorOooOOO.getString(iOooO00o2));
                        payOrder.setSku(cursorOooOOO.isNull(iOooO00o3) ? null : cursorOooOOO.getString(iOooO00o3));
                        payOrder.setAmount(cursorOooOOO.isNull(iOooO00o4) ? null : Double.valueOf(cursorOooOOO.getDouble(iOooO00o4)));
                        payOrder.setType(cursorOooOOO.getInt(iOooO00o5));
                        payOrder.setPurchaseToken(cursorOooOOO.isNull(iOooO00o6) ? null : cursorOooOOO.getString(iOooO00o6));
                        payOrder.setHuaWeiAccountFlag(cursorOooOOO.getInt(iOooO00o7));
                        payOrder.setConsume(cursorOooOOO.getInt(iOooO00o8) != 0);
                        payOrder.setPurchaseState(cursorOooOOO.getInt(iOooO00o9));
                        payOrder.setAcknowledged(cursorOooOOO.getInt(iOooO00o10) != 0);
                        payOrder.setSubscription(cursorOooOOO.getInt(iOooO00o11) != 0);
                        iOooO00o12 = i2;
                        payOrder.setSubscriptionState(cursorOooOOO.getInt(iOooO00o12));
                        iOooO00o13 = i3;
                        payOrder.setSubscriptionId(cursorOooOOO.isNull(iOooO00o13) ? null : cursorOooOOO.getString(iOooO00o13));
                        int i4 = i;
                        payOrder.setSubscriptionOrderId(cursorOooOOO.isNull(i4) ? null : cursorOooOOO.getString(i4));
                        int i5 = iOooO00o3;
                        int i6 = iOooO00o15;
                        int i7 = iOooO00o2;
                        payOrder.setCreateTime(cursorOooOOO.getLong(i6));
                        arrayList.add(payOrder);
                        iOooO00o2 = i7;
                        iOooO00o3 = i5;
                        i = i4;
                        iOooO00o15 = i6;
                        iOooO00o = iOooO00o;
                    }
                    cursorOooOOO.close();
                    this.f41104OooO00o.release();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    oooOOO0 = this;
                    cursorOooOOO.close();
                    oooOOO0.f41104OooO00o.release();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                oooOOO0 = this;
            }
        }
    }

    public oo000o(RoomDatabase roomDatabase) {
        this.f41091OooO00o = roomDatabase;
        this.f41092OooO0O0 = new OooO00o(roomDatabase);
        this.f41093OooO0OO = new OooO0O0(roomDatabase);
        this.f41094OooO0Oo = new OooO0OO(roomDatabase);
    }

    @Override // p490o0o00O0.o00Ooo
    public final Object OooO00o(PayOrder payOrder, Continuation<? super Unit> continuation) {
        return o0Oo0oo.OooO0OO(this.f41091OooO00o, new OooO0o(payOrder), continuation);
    }

    @Override // p490o0o00O0.o00Ooo
    public final Object OooO0O0(List<PayOrder> list, Continuation<? super Unit> continuation) {
        return o0Oo0oo.OooO0OO(this.f41091OooO00o, new OooO(list), continuation);
    }

    @Override // p490o0o00O0.o00Ooo
    public final Object OooO0OO(String str, Continuation<? super Unit> continuation) {
        return o0Oo0oo.OooO0OO(this.f41091OooO00o, new OooOO0(str), continuation);
    }

    @Override // p490o0o00O0.o00Ooo
    public final Object OooO0Oo(Continuation<? super List<PayOrder>> continuation) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("select * from PayOrderTable", 0);
        return o0Oo0oo.OooO0O0(this.f41091OooO00o, new CancellationSignal(), new OooOOO0(o0000o0OooO0o), continuation);
    }

    @Override // p490o0o00O0.o00Ooo
    public final Object OooO0o0(String str, boolean z, Continuation<? super Unit> continuation) {
        return o0Oo0oo.OooO0OO(this.f41091OooO00o, new OooOO0O(z, str), continuation);
    }
}

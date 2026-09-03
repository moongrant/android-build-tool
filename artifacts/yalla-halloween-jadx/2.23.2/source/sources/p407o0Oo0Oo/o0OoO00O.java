package p407o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.AccessToken;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.PayOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import o00.OooO00o;
import o00.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f45861OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O000Oo f45862OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O000o0 f45863OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O00 f45864OooO0Oo;

    public o0OoO00O(YlAppDataBase ylAppDataBase) {
        this.f45861OooO00o = ylAppDataBase;
        this.f45862OooO0O0 = new o0O000Oo(ylAppDataBase);
        this.f45863OooO0OO = new o0O000o0(ylAppDataBase);
        this.f45864OooO0Oo = new o0O00(ylAppDataBase);
    }

    @Override // p407o0Oo0Oo.o0OoOoOo
    public final void OooO00o(String str) {
        RoomDatabase roomDatabase = this.f45861OooO00o;
        roomDatabase.OooO0O0();
        o0O000o0 o0o000o1 = this.f45863OooO0OO;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o000o1.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0o000o1.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o0OoOoOo
    public final void OooO0O0(PayOrder payOrder) {
        RoomDatabase roomDatabase = this.f45861OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f45862OooO0O0.OooO0oO(payOrder);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p407o0Oo0Oo.o0OoOoOo
    public final void OooO0OO(String str, boolean z) {
        RoomDatabase roomDatabase = this.f45861OooO00o;
        roomDatabase.OooO0O0();
        o0O00 o0o01 = this.f45864OooO0Oo;
        SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o01.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, z ? 1L : 0L);
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(2);
        } else {
            supportSQLiteStatementOooO00o.bindString(2, str);
        }
        roomDatabase.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
            o0o01.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p407o0Oo0Oo.o0OoOoOo
    public final void OooO0Oo(List<PayOrder> list) {
        RoomDatabase roomDatabase = this.f45861OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f45862OooO0O0.OooO0o(list);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p407o0Oo0Oo.o0OoOoOo
    public final ArrayList OooO0o0() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(0, "select * from PayOrderTable");
        RoomDatabase roomDatabase = this.f45861OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, AccessToken.USER_ID_KEY);
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "order_id");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "sku");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "amount");
            int iOooO00o5 = OooO00o.OooO00o(cursorOooO0O0, "type");
            int iOooO00o6 = OooO00o.OooO00o(cursorOooO0O0, "purchase_token");
            int iOooO00o7 = OooO00o.OooO00o(cursorOooO0O0, "huaWeiAccountFlag");
            int iOooO00o8 = OooO00o.OooO00o(cursorOooO0O0, "isConsume");
            int iOooO00o9 = OooO00o.OooO00o(cursorOooO0O0, "purchaseState");
            int iOooO00o10 = OooO00o.OooO00o(cursorOooO0O0, "isAcknowledged");
            int iOooO00o11 = OooO00o.OooO00o(cursorOooO0O0, "isSubscription");
            int iOooO00o12 = OooO00o.OooO00o(cursorOooO0O0, "subscriptionState");
            int iOooO00o13 = OooO00o.OooO00o(cursorOooO0O0, "subscriptionId");
            int iOooO00o14 = OooO00o.OooO00o(cursorOooO0O0, "subscriptionOrderId");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = OooO00o.OooO00o(cursorOooO0O0, "createTime");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    PayOrder payOrder = new PayOrder();
                    int i2 = iOooO00o13;
                    ArrayList arrayList2 = arrayList;
                    payOrder.setUserId(cursorOooO0O0.getLong(iOooO00o));
                    payOrder.setOrderId(cursorOooO0O0.isNull(iOooO00o2) ? null : cursorOooO0O0.getString(iOooO00o2));
                    payOrder.setSku(cursorOooO0O0.isNull(iOooO00o3) ? null : cursorOooO0O0.getString(iOooO00o3));
                    payOrder.setAmount(cursorOooO0O0.isNull(iOooO00o4) ? null : Double.valueOf(cursorOooO0O0.getDouble(iOooO00o4)));
                    payOrder.setType(cursorOooO0O0.getInt(iOooO00o5));
                    payOrder.setPurchaseToken(cursorOooO0O0.isNull(iOooO00o6) ? null : cursorOooO0O0.getString(iOooO00o6));
                    payOrder.setHuaWeiAccountFlag(cursorOooO0O0.getInt(iOooO00o7));
                    payOrder.setConsume(cursorOooO0O0.getInt(iOooO00o8) != 0);
                    payOrder.setPurchaseState(cursorOooO0O0.getInt(iOooO00o9));
                    payOrder.setAcknowledged(cursorOooO0O0.getInt(iOooO00o10) != 0);
                    payOrder.setSubscription(cursorOooO0O0.getInt(iOooO00o11) != 0);
                    payOrder.setSubscriptionState(cursorOooO0O0.getInt(iOooO00o12));
                    payOrder.setSubscriptionId(cursorOooO0O0.isNull(i2) ? null : cursorOooO0O0.getString(i2));
                    int i3 = i;
                    payOrder.setSubscriptionOrderId(cursorOooO0O0.isNull(i3) ? null : cursorOooO0O0.getString(i3));
                    i = i3;
                    int i4 = iOooO00o15;
                    payOrder.setCreateTime(cursorOooO0O0.getLong(i4));
                    arrayList2.add(payOrder);
                    arrayList = arrayList2;
                    iOooO00o13 = i2;
                    iOooO00o15 = i4;
                    iOooO00o = iOooO00o;
                }
                ArrayList arrayList3 = arrayList;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return arrayList3;
            } catch (Throwable th) {
                th = th;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
        }
    }
}

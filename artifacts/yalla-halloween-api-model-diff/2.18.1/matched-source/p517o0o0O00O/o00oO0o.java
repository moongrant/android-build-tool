package p517o0o0O00O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.facebook.AccessToken;
import com.umeng.analytics.pro.ak;
import com.yalla.yalla.data.db.model.BuriedPoint;
import java.util.ArrayList;
import java.util.List;
import p091o000o00o.o0000O0;
import p091o000o00o.o0000OO0;
import p091o000o00o.o000OOo;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o implements oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f42153OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<BuriedPoint> f42154OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f42155OooO0OO;

    public class OooO00o extends o000OOo<BuriedPoint> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `BuriedPointTable` (`id`,`device_brand`,`os_version`,`carrier`,`device_model`,`app_version`,`app_channel`,`ip`,`device_id`,`session_id`,`os`,`user_id`,`event_id`,`event_type`,`url`,`event_time`,`room_id`,`ext_info`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, BuriedPoint buriedPoint) {
            BuriedPoint buriedPoint2 = buriedPoint;
            if (buriedPoint2.getId() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, buriedPoint2.getId().intValue());
            }
            if (buriedPoint2.getDeviceBrand() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, buriedPoint2.getDeviceBrand());
            }
            if (buriedPoint2.getOsVersion() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, buriedPoint2.getOsVersion());
            }
            if (buriedPoint2.getCarrier() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, buriedPoint2.getCarrier());
            }
            if (buriedPoint2.getDeviceModel() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, buriedPoint2.getDeviceModel());
            }
            if (buriedPoint2.getAppVersion() == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, buriedPoint2.getAppVersion());
            }
            if (buriedPoint2.getAppChannel() == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, buriedPoint2.getAppChannel());
            }
            if (buriedPoint2.getIp() == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, buriedPoint2.getIp());
            }
            if (buriedPoint2.getDeviceId() == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, buriedPoint2.getDeviceId());
            }
            if (buriedPoint2.getSessionId() == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, buriedPoint2.getSessionId());
            }
            supportSQLiteStatement.bindLong(11, buriedPoint2.getOs());
            if (buriedPoint2.getUserId() == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, buriedPoint2.getUserId());
            }
            if (buriedPoint2.getEventId() == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, buriedPoint2.getEventId());
            }
            supportSQLiteStatement.bindLong(14, buriedPoint2.getEventType());
            if (buriedPoint2.getUrl() == null) {
                supportSQLiteStatement.bindNull(15);
            } else {
                supportSQLiteStatement.bindString(15, buriedPoint2.getUrl());
            }
            supportSQLiteStatement.bindLong(16, buriedPoint2.getEventTime());
            if (buriedPoint2.getRoomId() == null) {
                supportSQLiteStatement.bindNull(17);
            } else {
                supportSQLiteStatement.bindLong(17, buriedPoint2.getRoomId().longValue());
            }
            if (buriedPoint2.getExtInfoString() == null) {
                supportSQLiteStatement.bindNull(18);
            } else {
                supportSQLiteStatement.bindString(18, buriedPoint2.getExtInfoString());
            }
        }
    }

    public class OooO0O0 extends o0000OO0 {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "delete from BuriedPointTable where id <= ?";
        }
    }

    public o00oO0o(RoomDatabase roomDatabase) {
        this.f42153OooO00o = roomDatabase;
        this.f42154OooO0O0 = new OooO00o(roomDatabase);
        this.f42155OooO0OO = new OooO0O0(roomDatabase);
    }

    @Override // p517o0o0O00O.oo000o
    public final int OooO00o() {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select count(*) from BuriedPointTable", 0);
        this.f42153OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42153OooO00o.OooOOO(o0000o0OooO0o);
        try {
            return cursorOooOOO.moveToFirst() ? cursorOooOOO.getInt(0) : 0;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }

    @Override // p517o0o0O00O.oo000o
    public final void OooO0O0(BuriedPoint buriedPoint) {
        this.f42153OooO00o.OooO0O0();
        this.f42153OooO00o.OooO0OO();
        try {
            this.f42154OooO0O0.OooO0oO(buriedPoint);
            this.f42153OooO00o.OooOOOO();
        } finally {
            this.f42153OooO00o.OooOO0O();
        }
    }

    @Override // p517o0o0O00O.oo000o
    public final void OooO0OO(int i) {
        this.f42153OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f42155OooO0OO.OooO00o();
        supportSQLiteStatementOooO00o.bindLong(1, i);
        this.f42153OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f42153OooO00o.OooOOOO();
        } finally {
            this.f42153OooO00o.OooOO0O();
            this.f42155OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    @Override // p517o0o0O00O.oo000o
    public final List<BuriedPoint> OooO0Oo() throws Throwable {
        o0000O0 o0000o1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from BuriedPointTable", 0);
        this.f42153OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42153OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, ak.F);
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "os_version");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, ak.P);
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "device_model");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "app_version");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "app_channel");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "ip");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "device_id");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "session_id");
            int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, ak.x);
            int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, AccessToken.USER_ID_KEY);
            int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "event_id");
            int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "event_type");
            o0000o1 = o0000o0OooO0o;
            try {
                int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "url");
                int iOooO00o16 = o00O0O.OooO00o(cursorOooOOO, "event_time");
                int iOooO00o17 = o00O0O.OooO00o(cursorOooOOO, "room_id");
                int iOooO00o18 = o00O0O.OooO00o(cursorOooOOO, "ext_info");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    BuriedPoint buriedPoint = new BuriedPoint();
                    buriedPoint.setId(cursorOooOOO.isNull(iOooO00o) ? null : Integer.valueOf(cursorOooOOO.getInt(iOooO00o)));
                    buriedPoint.setDeviceBrand(cursorOooOOO.isNull(iOooO00o2) ? null : cursorOooOOO.getString(iOooO00o2));
                    buriedPoint.setOsVersion(cursorOooOOO.isNull(iOooO00o3) ? null : cursorOooOOO.getString(iOooO00o3));
                    buriedPoint.setCarrier(cursorOooOOO.isNull(iOooO00o4) ? null : cursorOooOOO.getString(iOooO00o4));
                    buriedPoint.setDeviceModel(cursorOooOOO.isNull(iOooO00o5) ? null : cursorOooOOO.getString(iOooO00o5));
                    buriedPoint.setAppVersion(cursorOooOOO.isNull(iOooO00o6) ? null : cursorOooOOO.getString(iOooO00o6));
                    buriedPoint.setAppChannel(cursorOooOOO.isNull(iOooO00o7) ? null : cursorOooOOO.getString(iOooO00o7));
                    buriedPoint.setIp(cursorOooOOO.isNull(iOooO00o8) ? null : cursorOooOOO.getString(iOooO00o8));
                    buriedPoint.setDeviceId(cursorOooOOO.isNull(iOooO00o9) ? null : cursorOooOOO.getString(iOooO00o9));
                    buriedPoint.setSessionId(cursorOooOOO.isNull(iOooO00o10) ? null : cursorOooOOO.getString(iOooO00o10));
                    buriedPoint.setOs(cursorOooOOO.getInt(iOooO00o11));
                    buriedPoint.setUserId(cursorOooOOO.isNull(iOooO00o12) ? null : cursorOooOOO.getString(iOooO00o12));
                    buriedPoint.setEventId(cursorOooOOO.isNull(iOooO00o13) ? null : cursorOooOOO.getString(iOooO00o13));
                    int i2 = i;
                    int i3 = iOooO00o2;
                    buriedPoint.setEventType(cursorOooOOO.getInt(i2));
                    int i4 = iOooO00o15;
                    buriedPoint.setUrl(cursorOooOOO.isNull(i4) ? null : cursorOooOOO.getString(i4));
                    int i5 = iOooO00o3;
                    int i6 = iOooO00o16;
                    buriedPoint.setEventTime(cursorOooOOO.getLong(i6));
                    int i7 = iOooO00o17;
                    buriedPoint.setRoomId(cursorOooOOO.isNull(i7) ? null : Long.valueOf(cursorOooOOO.getLong(i7)));
                    int i8 = iOooO00o18;
                    buriedPoint.setExtInfoString(cursorOooOOO.isNull(i8) ? null : cursorOooOOO.getString(i8));
                    arrayList.add(buriedPoint);
                    iOooO00o18 = i8;
                    iOooO00o3 = i5;
                    iOooO00o15 = i4;
                    iOooO00o16 = i6;
                    iOooO00o = iOooO00o;
                    iOooO00o17 = i7;
                    iOooO00o2 = i3;
                    i = i2;
                }
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorOooOOO.close();
                o0000o1.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0000o1 = o0000o0OooO0o;
        }
    }
}

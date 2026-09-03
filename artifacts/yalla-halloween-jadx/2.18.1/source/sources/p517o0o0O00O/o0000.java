package p517o0o0O00O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.RoomJoinHistory;
import p091o000o00o.o0000O0;
import p091o000o00o.o000OOo;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 implements o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f42127OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<RoomJoinHistory> f42128OooO0O0;

    public class OooO00o extends o000OOo<RoomJoinHistory> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `RoomJoinHistory` (`id`,`repeat`,`barid`,`uid`) VALUES (?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, RoomJoinHistory roomJoinHistory) {
            RoomJoinHistory roomJoinHistory2 = roomJoinHistory;
            Integer num = roomJoinHistory2.id;
            if (num == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, num.intValue());
            }
            String str = roomJoinHistory2.repeat;
            if (str == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str);
            }
            String str2 = roomJoinHistory2.barid;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            String str3 = roomJoinHistory2.uid;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
        }
    }

    public o0000(RoomDatabase roomDatabase) {
        this.f42127OooO00o = roomDatabase;
        this.f42128OooO0O0 = new OooO00o(roomDatabase);
    }

    @Override // p517o0o0O00O.o0000Ooo
    public final void OooO00o(RoomJoinHistory roomJoinHistory) {
        this.f42127OooO00o.OooO0O0();
        this.f42127OooO00o.OooO0OO();
        try {
            this.f42128OooO0O0.OooO0oO(roomJoinHistory);
            this.f42127OooO00o.OooOOOO();
        } finally {
            this.f42127OooO00o.OooOO0O();
        }
    }

    @Override // p517o0o0O00O.o0000Ooo
    public final RoomJoinHistory OooO0O0(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from RoomJoinHistory Where repeat = ?", 1);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        this.f42127OooO00o.OooO0O0();
        RoomJoinHistory roomJoinHistory = null;
        Cursor cursorOooOOO = this.f42127OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "repeat");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "barid");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "uid");
            if (cursorOooOOO.moveToFirst()) {
                RoomJoinHistory roomJoinHistory2 = new RoomJoinHistory();
                if (cursorOooOOO.isNull(iOooO00o)) {
                    roomJoinHistory2.id = null;
                } else {
                    roomJoinHistory2.id = Integer.valueOf(cursorOooOOO.getInt(iOooO00o));
                }
                if (cursorOooOOO.isNull(iOooO00o2)) {
                    roomJoinHistory2.repeat = null;
                } else {
                    roomJoinHistory2.repeat = cursorOooOOO.getString(iOooO00o2);
                }
                if (cursorOooOOO.isNull(iOooO00o3)) {
                    roomJoinHistory2.barid = null;
                } else {
                    roomJoinHistory2.barid = cursorOooOOO.getString(iOooO00o3);
                }
                if (cursorOooOOO.isNull(iOooO00o4)) {
                    roomJoinHistory2.uid = null;
                } else {
                    roomJoinHistory2.uid = cursorOooOOO.getString(iOooO00o4);
                }
                roomJoinHistory = roomJoinHistory2;
            }
            return roomJoinHistory;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }
}

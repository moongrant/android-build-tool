package p519o0o0O00O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.app.base.fragment.ContributionFragment;
import com.yalla.yalla.data.db.model.RoomTheme;
import p091o000o00o.o0000O0;
import p091o000o00o.o000OOo;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 implements o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f42157OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<RoomTheme> f42158OooO0O0;

    public class OooO00o extends o000OOo<RoomTheme> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `RoomTheme` (`id`,`roomId`,`roomTheme`) VALUES (?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, RoomTheme roomTheme) {
            RoomTheme roomTheme2 = roomTheme;
            Integer num = roomTheme2.id;
            if (num == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, num.intValue());
            }
            supportSQLiteStatement.bindLong(2, roomTheme2.roomId);
            String str = roomTheme2.roomTheme;
            if (str == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str);
            }
        }
    }

    public o0000O00(RoomDatabase roomDatabase) {
        this.f42157OooO00o = roomDatabase;
        this.f42158OooO0O0 = new OooO00o(roomDatabase);
    }

    @Override // p519o0o0O00O.o0000
    public final void OooO00o(RoomTheme roomTheme) {
        this.f42157OooO00o.OooO0O0();
        this.f42157OooO00o.OooO0OO();
        try {
            this.f42158OooO0O0.OooO0oO(roomTheme);
            this.f42157OooO00o.OooOOOO();
        } finally {
            this.f42157OooO00o.OooOO0O();
        }
    }

    @Override // p519o0o0O00O.o0000
    public final RoomTheme OooO0O0(long j) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from RoomTheme Where roomId = ?", 1);
        o0000o0OooO0o.bindLong(1, j);
        this.f42157OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42157OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, ContributionFragment.ARG_1);
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "roomTheme");
            RoomTheme roomTheme = null;
            if (cursorOooOOO.moveToFirst()) {
                RoomTheme roomTheme2 = new RoomTheme();
                if (cursorOooOOO.isNull(iOooO00o)) {
                    roomTheme2.id = null;
                } else {
                    roomTheme2.id = Integer.valueOf(cursorOooOOO.getInt(iOooO00o));
                }
                roomTheme2.roomId = cursorOooOOO.getLong(iOooO00o2);
                if (cursorOooOOO.isNull(iOooO00o3)) {
                    roomTheme2.roomTheme = null;
                } else {
                    roomTheme2.roomTheme = cursorOooOOO.getString(iOooO00o3);
                }
                roomTheme = roomTheme2;
            }
            return roomTheme;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }
}

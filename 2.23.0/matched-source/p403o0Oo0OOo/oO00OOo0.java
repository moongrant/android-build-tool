package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.RoomTheme;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOo0 extends OooOOO0<RoomTheme> {
    public oO00OOo0(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `RoomTheme` (`id`,`roomId`,`roomTheme`) VALUES (?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, RoomTheme roomTheme) {
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

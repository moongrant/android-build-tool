package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.RoomTheme;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0o0 extends o0OO00O<RoomTheme> {
    public o0O0O0o0(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `RoomTheme` (`id`,`roomId`,`roomTheme`) VALUES (?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
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

package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.RoomHistory;
import o000O0O0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0o extends OooOO0O<RoomHistory> {
    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "DELETE FROM `RoomHistory` WHERE `id` = ?";
    }

    @Override // o000O0O0.OooOO0O
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, RoomHistory roomHistory) {
        Integer num = roomHistory.id;
        if (num == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindLong(1, num.intValue());
        }
    }
}

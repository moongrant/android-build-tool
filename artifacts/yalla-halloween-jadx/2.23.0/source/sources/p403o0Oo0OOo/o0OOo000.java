package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.table.MomentMessage;
import o000O0O0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOo000 extends OooOO0O<MomentMessage> {
    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "DELETE FROM `MomentMessageTable` WHERE `uid` = ? AND `mid` = ?";
    }

    @Override // o000O0O0.OooOO0O
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, MomentMessage momentMessage) {
        MomentMessage momentMessage2 = momentMessage;
        supportSQLiteStatement.bindLong(1, momentMessage2.getUid());
        if (momentMessage2.getMid() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, momentMessage2.getMid());
        }
    }
}

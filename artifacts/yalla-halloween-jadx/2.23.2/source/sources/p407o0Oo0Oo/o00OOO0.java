package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.MomentMessage;
import p110o000ooo0.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 extends o0Oo0oo<MomentMessage> {
    public o00OOO0(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "DELETE FROM `MomentMessageTable` WHERE `uid` = ? AND `mid` = ?";
    }

    @Override // p110o000ooo0.o0Oo0oo
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, MomentMessage momentMessage) {
        MomentMessage momentMessage2 = momentMessage;
        supportSQLiteStatement.bindLong(1, momentMessage2.getUid());
        if (momentMessage2.getMid() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, momentMessage2.getMid());
        }
    }
}

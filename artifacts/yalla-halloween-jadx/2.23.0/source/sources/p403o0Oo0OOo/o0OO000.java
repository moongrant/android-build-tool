package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.FriendsTableOld;
import o000O0O0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000 extends OooOO0O<FriendsTableOld> {
    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "DELETE FROM `FriendsTable` WHERE `id` = ? AND `uid` = ?";
    }

    @Override // o000O0O0.OooOO0O
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, FriendsTableOld friendsTableOld) {
        FriendsTableOld friendsTableOld2 = friendsTableOld;
        String str = friendsTableOld2.userid;
        if (str == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindString(1, str);
        }
        String str2 = friendsTableOld2.standbytwo;
        if (str2 == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, str2);
        }
    }
}

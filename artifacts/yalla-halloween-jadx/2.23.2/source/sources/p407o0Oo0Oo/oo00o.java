package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.FriendsTableOld;
import p110o000ooo0.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends o0Oo0oo<FriendsTableOld> {
    public oo00o(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "DELETE FROM `FriendsTable` WHERE `id` = ? AND `uid` = ?";
    }

    @Override // p110o000ooo0.o0Oo0oo
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, FriendsTableOld friendsTableOld) {
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

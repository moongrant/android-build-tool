package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.HideContent;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 extends o0OO00O<HideContent> {
    public oo0o0O0(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR IGNORE INTO `HideContentTable` (`userId`,`contentId`,`type`) VALUES (?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, HideContent hideContent) {
        HideContent hideContent2 = hideContent;
        supportSQLiteStatement.bindLong(1, hideContent2.getUserId());
        if (hideContent2.getContentId() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, hideContent2.getContentId());
        }
        supportSQLiteStatement.bindLong(3, hideContent2.getType());
    }
}

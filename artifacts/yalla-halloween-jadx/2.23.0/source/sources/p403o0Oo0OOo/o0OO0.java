package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.HideContent;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0 extends OooOOO0<HideContent> {
    public o0OO0(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR IGNORE INTO `HideContentTable` (`userId`,`contentId`,`type`) VALUES (?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, HideContent hideContent) {
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

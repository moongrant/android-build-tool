package androidx.appcompat.widget;

import androidx.sqlite.db.SupportSQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o {
    public static int OooO00o(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static void OooO0O0(SupportSQLiteStatement supportSQLiteStatement, int i, int i2, int i3, int i4) {
        supportSQLiteStatement.bindNull(i);
        supportSQLiteStatement.bindNull(i2);
        supportSQLiteStatement.bindNull(i3);
        supportSQLiteStatement.bindNull(i4);
    }
}

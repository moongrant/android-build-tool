package androidx.compose.runtime;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO {
    public static void OooO00o(Applier applier, String str, SlotWriter slotWriter, String str2, RememberManager rememberManager, String str3) {
        Intrinsics.checkNotNullParameter(applier, str);
        Intrinsics.checkNotNullParameter(slotWriter, str2);
        Intrinsics.checkNotNullParameter(rememberManager, str3);
    }

    public static void OooO0O0(SupportSQLiteStatement supportSQLiteStatement, int i, int i2, int i3, int i4) {
        supportSQLiteStatement.bindNull(i);
        supportSQLiteStatement.bindNull(i2);
        supportSQLiteStatement.bindNull(i3);
        supportSQLiteStatement.bindNull(i4);
    }
}

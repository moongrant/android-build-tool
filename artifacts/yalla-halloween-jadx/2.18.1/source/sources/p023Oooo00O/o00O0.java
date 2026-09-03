package p023Oooo00O;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0 {
    public static boolean OooO00o(oo00o.OooO0O0 oooO0O0, Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, oooO0O0.OooO00o()) && Intrinsics.areEqual(obj2, oooO0O0.OooO0OO());
    }

    public static void OooO0O0(SupportSQLiteStatement supportSQLiteStatement, int i, int i2, int i3, int i4) {
        supportSQLiteStatement.bindNull(i);
        supportSQLiteStatement.bindNull(i2);
        supportSQLiteStatement.bindNull(i3);
        supportSQLiteStatement.bindNull(i4);
    }

    public static void OooO0OO(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }
}

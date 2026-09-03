package o0000O0O;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import p475o0Ooooo0.oO0O000o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO {
    public static /* bridge */ /* synthetic */ void OooO00o(int i, int i2, Class cls) {
        throw null;
    }

    public static void OooO0O0(SupportSQLiteDatabase supportSQLiteDatabase, String str, String str2, String str3, String str4) {
        supportSQLiteDatabase.execSQL(str);
        supportSQLiteDatabase.execSQL(str2);
        supportSQLiteDatabase.execSQL(str3);
        supportSQLiteDatabase.execSQL(str4);
    }

    public static void OooO0OO(oO0O000o oo0o000o, String str, String str2, CancellableContinuation cancellableContinuation) {
        oo0o000o.getClass();
        cancellableContinuation.resumeWith(Result.m4215constructorimpl(oO0O000o.OooO00o(str, str2)));
    }
}

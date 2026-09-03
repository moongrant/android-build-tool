package p433o0OoOO0o;

import Oooo000.o00O0O;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.internal.security.CertificateUtil;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0O extends ContextWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f39944OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f39945OooO0O0;

    public o0O0O0O(Context context, String str, String str2) {
        super(context);
        this.f39945OooO0O0 = str;
        this.f39944OooO00o = str2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCacheDir() {
        return new File(super.getCacheDir(), this.f39944OooO00o);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.f39944OooO00o);
        file.mkdirs();
        return new File(file, str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.f39944OooO00o);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.f39944OooO00o);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getFilesDir() {
        return new File(super.getFilesDir(), this.f39944OooO00o);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SharedPreferences getSharedPreferences(String str, int i) {
        return super.getSharedPreferences(o00O0O.OooO0O0(new StringBuilder(), this.f39945OooO0O0, CertificateUtil.DELIMITER, str), i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }
}

package p097o000o0o0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 implements SupportSQLiteOpenHelper {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f29301Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Context f29302Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final String f29303Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final SupportSQLiteOpenHelper.OooO00o f29304Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooO00o f29305OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Object f29306OoooO00 = new Object();

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f29307OoooO0O;

    public static class OooO00o extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o000OO0O[] f29308Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final SupportSQLiteOpenHelper.OooO00o f29309Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f29310Oooo0oo;

        /* JADX INFO: renamed from: o000o0o0.o000O0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0322OooO00o implements DatabaseErrorHandler {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ SupportSQLiteOpenHelper.OooO00o f29311OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ o000OO0O[] f29312OooO0O0;

            public C0322OooO00o(SupportSQLiteOpenHelper.OooO00o oooO00o, o000OO0O[] o000oo0oArr) {
                this.f29311OooO00o = oooO00o;
                this.f29312OooO0O0 = o000oo0oArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                SupportSQLiteOpenHelper.OooO00o oooO00o = this.f29311OooO00o;
                o000OO0O o000oo0oOooO0O0 = OooO00o.OooO0O0(this.f29312OooO0O0, sQLiteDatabase);
                Objects.requireNonNull(oooO00o);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + o000oo0oOooO0O0.OooO0O0());
                if (!o000oo0oOooO0O0.isOpen()) {
                    oooO00o.OooO00o(o000oo0oOooO0O0.OooO0O0());
                    return;
                }
                List<Pair<String, String>> listOooO00o = null;
                try {
                    try {
                        listOooO00o = o000oo0oOooO0O0.OooO00o();
                    } finally {
                        if (listOooO00o != null) {
                            Iterator<Pair<String, String>> it = listOooO00o.iterator();
                            while (it.hasNext()) {
                                oooO00o.OooO00o((String) it.next().second);
                            }
                        } else {
                            oooO00o.OooO00o(o000oo0oOooO0O0.OooO0O0());
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    o000oo0oOooO0O0.close();
                } catch (IOException unused2) {
                }
            }
        }

        public OooO00o(Context context, String str, o000OO0O[] o000oo0oArr, SupportSQLiteOpenHelper.OooO00o oooO00o) {
            super(context, str, null, oooO00o.f9353OooO00o, new C0322OooO00o(oooO00o, o000oo0oArr));
            this.f29309Oooo0oO = oooO00o;
            this.f29308Oooo0o = o000oo0oArr;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x000e  */
        public static o000OO0O OooO0O0(o000OO0O[] o000oo0oArr, SQLiteDatabase sQLiteDatabase) {
            o000OO0O o000oo0o2 = o000oo0oArr[0];
            if (o000oo0o2 == null) {
                o000oo0oArr[0] = new o000OO0O(sQLiteDatabase);
            } else {
                if (!(o000oo0o2.f29315Oooo0o == sQLiteDatabase)) {
                    o000oo0oArr[0] = new o000OO0O(sQLiteDatabase);
                }
            }
            return o000oo0oArr[0];
        }

        public final o000OO0O OooO00o(SQLiteDatabase sQLiteDatabase) {
            return OooO0O0(this.f29308Oooo0o, sQLiteDatabase);
        }

        public final synchronized SupportSQLiteDatabase OooO0Oo() {
            this.f29310Oooo0oo = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!this.f29310Oooo0oo) {
                return OooO00o(writableDatabase);
            }
            close();
            return OooO0Oo();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final synchronized void close() {
            super.close();
            this.f29308Oooo0o[0] = null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            SupportSQLiteOpenHelper.OooO00o oooO00o = this.f29309Oooo0oO;
            OooO00o(sQLiteDatabase);
            oooO00o.OooO0O0();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f29309Oooo0oO.OooO0OO(OooO00o(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f29310Oooo0oo = true;
            this.f29309Oooo0oO.OooO0Oo(OooO00o(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f29310Oooo0oo) {
                return;
            }
            this.f29309Oooo0oO.OooO0o0(OooO00o(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f29310Oooo0oo = true;
            this.f29309Oooo0oO.OooO0o(OooO00o(sQLiteDatabase), i, i2);
        }
    }

    public o000O0O0(Context context, String str, SupportSQLiteOpenHelper.OooO00o oooO00o, boolean z) {
        this.f29302Oooo0o = context;
        this.f29303Oooo0oO = str;
        this.f29304Oooo0oo = oooO00o;
        this.f29301Oooo = z;
    }

    public final OooO00o OooO00o() {
        OooO00o oooO00o;
        synchronized (this.f29306OoooO00) {
            if (this.f29305OoooO0 == null) {
                o000OO0O[] o000oo0oArr = new o000OO0O[1];
                if (Build.VERSION.SDK_INT < 23 || this.f29303Oooo0oO == null || !this.f29301Oooo) {
                    this.f29305OoooO0 = new OooO00o(this.f29302Oooo0o, this.f29303Oooo0oO, o000oo0oArr, this.f29304Oooo0oo);
                } else {
                    this.f29305OoooO0 = new OooO00o(this.f29302Oooo0o, new File(this.f29302Oooo0o.getNoBackupFilesDir(), this.f29303Oooo0oO).getAbsolutePath(), o000oo0oArr, this.f29304Oooo0oo);
                }
                this.f29305OoooO0.setWriteAheadLoggingEnabled(this.f29307OoooO0O);
            }
            oooO00o = this.f29305OoooO0;
        }
        return oooO00o;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OooO00o().close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        return this.f29303Oooo0oO;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        return OooO00o().OooO0Oo();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f29306OoooO00) {
            OooO00o oooO00o = this.f29305OoooO0;
            if (oooO00o != null) {
                oooO00o.setWriteAheadLoggingEnabled(z);
            }
            this.f29307OoooO0O = z;
        }
    }
}

package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p235o00oOoo.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy<OpenHelper> f11084OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f11085OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteOpenHelper.OooO00o f11086OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f11087OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f11088OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f11089OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f11090OooOO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o0000OO0 f11091OooO00o = null;
    }

    public static final class OooO0O0 extends Lambda implements Function0<OpenHelper> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenHelper invoke() {
            OpenHelper sQLiteOpenHelper;
            FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = FrameworkSQLiteOpenHelper.this;
            if (frameworkSQLiteOpenHelper.f11087OooO0o0 == null || !frameworkSQLiteOpenHelper.f11088OooO0oO) {
                sQLiteOpenHelper = new OpenHelper(frameworkSQLiteOpenHelper.f11085OooO0Oo, frameworkSQLiteOpenHelper.f11087OooO0o0, new OooO00o(), frameworkSQLiteOpenHelper.f11086OooO0o, frameworkSQLiteOpenHelper.f11089OooO0oo);
            } else {
                Context context = frameworkSQLiteOpenHelper.f11085OooO0Oo;
                Intrinsics.checkNotNullParameter(context, "context");
                File noBackupFilesDir = context.getNoBackupFilesDir();
                Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
                sQLiteOpenHelper = new OpenHelper(frameworkSQLiteOpenHelper.f11085OooO0Oo, new File(noBackupFilesDir, frameworkSQLiteOpenHelper.f11087OooO0o0).getAbsolutePath(), new OooO00o(), frameworkSQLiteOpenHelper.f11086OooO0o, frameworkSQLiteOpenHelper.f11089OooO0oo);
            }
            boolean z = frameworkSQLiteOpenHelper.f11090OooOO0;
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
            return sQLiteOpenHelper;
        }
    }

    public static final class OpenHelper extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final /* synthetic */ int f11093OooOO0O = 0;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NotNull
        public final o00O000.OooO00o f11094OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final Context f11095OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final SupportSQLiteOpenHelper.OooO00o f11096OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final OooO00o f11097OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f11098OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f11099OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f11100OooOO0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        public static final class OooO00o extends RuntimeException {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            @NotNull
            public final CallbackName f11101OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            @NotNull
            public final Throwable f11102OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(@NotNull CallbackName callbackName, @NotNull Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f11101OooO0Oo = callbackName;
                this.f11102OooO0o0 = cause;
            }

            @Override // java.lang.Throwable
            @NotNull
            public final Throwable getCause() {
                return this.f11102OooO0o0;
            }
        }

        public static final class OooO0O0 {
            @NotNull
            public static o0000OO0 OooO00o(@NotNull OooO00o refHolder, @NotNull SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                o0000OO0 o0000oo1 = refHolder.f11091OooO00o;
                if (o0000oo1 != null) {
                    Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                    if (Intrinsics.areEqual(o0000oo1.f39929OooO0Oo, sqLiteDatabase)) {
                        return o0000oo1;
                    }
                }
                o0000OO0 o0000oo2 = new o0000OO0(sqLiteDatabase);
                refHolder.f11091OooO00o = o0000oo2;
                return o0000oo2;
            }
        }

        public /* synthetic */ class OooO0OO {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(@NotNull Context context, @Nullable String str, @NotNull final OooO00o dbRef, @NotNull final SupportSQLiteOpenHelper.OooO00o callback, boolean z) {
            super(context, str, null, callback.f11083OooO00o, new DatabaseErrorHandler() { // from class: o00oOoo.o000
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase dbObj) {
                    SupportSQLiteOpenHelper.OooO00o callback2 = callback;
                    Intrinsics.checkNotNullParameter(callback2, "$callback");
                    FrameworkSQLiteOpenHelper.OooO00o dbRef2 = dbRef;
                    Intrinsics.checkNotNullParameter(dbRef2, "$dbRef");
                    int i = FrameworkSQLiteOpenHelper.OpenHelper.f11093OooOO0O;
                    Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
                    o0000OO0 db = FrameworkSQLiteOpenHelper.OpenHelper.OooO0O0.OooO00o(dbRef2, dbObj);
                    callback2.getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
                    if (!db.isOpen()) {
                        String strOooO0OO = db.OooO0OO();
                        if (strOooO0OO != null) {
                            SupportSQLiteOpenHelper.OooO00o.OooO00o(strOooO0OO);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> listOooO00o = null;
                    try {
                        try {
                            listOooO00o = db.OooO00o();
                        } finally {
                            if (listOooO00o != null) {
                                Iterator<T> it = listOooO00o.iterator();
                                while (it.hasNext()) {
                                    Object obj = ((Pair) it.next()).second;
                                    Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                                    SupportSQLiteOpenHelper.OooO00o.OooO00o((String) obj);
                                }
                            } else {
                                String strOooO0OO2 = db.OooO0OO();
                                if (strOooO0OO2 != null) {
                                    SupportSQLiteOpenHelper.OooO00o.OooO00o(strOooO0OO2);
                                }
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        db.close();
                    } catch (IOException unused2) {
                    }
                    if (listOooO00o != null) {
                        return;
                    }
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f11095OooO0Oo = context;
            this.f11097OooO0o0 = dbRef;
            this.f11096OooO0o = callback;
            this.f11098OooO0oO = z;
            if (str == null) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this.f11094OooO = new o00O000.OooO00o(str, context.getCacheDir(), false);
        }

        @NotNull
        public final SupportSQLiteDatabase OooO00o(boolean z) {
            o00O000.OooO00o oooO00o = this.f11094OooO;
            try {
                oooO00o.OooO00o((this.f11100OooOO0 || getDatabaseName() == null) ? false : true);
                this.f11099OooO0oo = false;
                SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo(z);
                if (!this.f11099OooO0oo) {
                    return OooO0OO(sQLiteDatabaseOooOOo);
                }
                close();
                return OooO00o(z);
            } finally {
                oooO00o.OooO0O0();
            }
        }

        @NotNull
        public final o0000OO0 OooO0OO(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return OooO0O0.OooO00o(this.f11097OooO0o0, sqLiteDatabase);
        }

        public final SQLiteDatabase OooO0oO(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final SQLiteDatabase OooOOo(boolean z) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.f11100OooOO0;
            Context context = this.f11095OooO0Oo;
            if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return OooO0oO(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return OooO0oO(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof OooO00o) {
                        OooO00o oooO00o = th;
                        int i = OooO0OO.$EnumSwitchMapping$0[oooO00o.f11101OooO0Oo.ordinal()];
                        Throwable th2 = oooO00o.f11102OooO0o0;
                        if (i == 1 || i == 2 || i == 3 || i == 4 || !(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f11098OooO0oO) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return OooO0oO(z);
                    } catch (OooO00o e) {
                        throw e.f11102OooO0o0;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            o00O000.OooO00o oooO00o = this.f11094OooO;
            try {
                oooO00o.OooO00o(oooO00o.f36009OooO00o);
                super.close();
                this.f11097OooO0o0.f11091OooO00o = null;
                this.f11100OooOO0 = false;
            } finally {
                oooO00o.OooO0O0();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(@NotNull SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            boolean z = this.f11099OooO0oo;
            SupportSQLiteOpenHelper.OooO00o oooO00o = this.f11096OooO0o;
            if (!z && oooO00o.f11083OooO00o != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                oooO00o.OooO0O0(OooO0OO(db));
            } catch (Throwable th) {
                throw new OooO00o(CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f11096OooO0o.OooO0OO(OooO0OO(sqLiteDatabase));
            } catch (Throwable th) {
                throw new OooO00o(CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(@NotNull SQLiteDatabase db, int i, int i2) {
            Intrinsics.checkNotNullParameter(db, "db");
            this.f11099OooO0oo = true;
            try {
                this.f11096OooO0o.OooO0Oo(OooO0OO(db), i, i2);
            } catch (Throwable th) {
                throw new OooO00o(CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(@NotNull SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.f11099OooO0oo) {
                try {
                    this.f11096OooO0o.OooO0o0(OooO0OO(db));
                } catch (Throwable th) {
                    throw new OooO00o(CallbackName.ON_OPEN, th);
                }
            }
            this.f11100OooOO0 = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int i, int i2) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f11099OooO0oo = true;
            try {
                this.f11096OooO0o.OooO0o(OooO0OO(sqLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new OooO00o(CallbackName.ON_UPGRADE, th);
            }
        }
    }

    @JvmOverloads
    public FrameworkSQLiteOpenHelper(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.OooO00o callback, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f11085OooO0Oo = context;
        this.f11087OooO0o0 = str;
        this.f11086OooO0o = callback;
        this.f11088OooO0oO = z;
        this.f11089OooO0oo = z2;
        this.f11084OooO = LazyKt.lazy(new OooO0O0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Lazy<OpenHelper> lazy = this.f11084OooO;
        if (lazy.isInitialized()) {
            lazy.getValue().close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    public final String getDatabaseName() {
        return this.f11087OooO0o0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public final SupportSQLiteDatabase getWritableDatabase() {
        return this.f11084OooO.getValue().OooO00o(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public final void setWriteAheadLoggingEnabled(boolean z) {
        Lazy<OpenHelper> lazy = this.f11084OooO;
        if (lazy.isInitialized()) {
            OpenHelper sQLiteOpenHelper = lazy.getValue();
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
        this.f11090OooOO0 = z;
    }
}

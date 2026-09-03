package androidx.sqlite.db;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ljava/io/Closeable;", "OooO00o", "Configuration", "OooO0O0", "sqlite_release"}, k = 1, mv = {1, 7, 1})
public interface SupportSQLiteOpenHelper extends Closeable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "", "sqlite_release"}, k = 1, mv = {1, 7, 1})
    public static final class Configuration {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        @NotNull
        public final Context f11078OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @JvmField
        @Nullable
        public final String f11079OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @JvmField
        @NotNull
        public final OooO00o f11080OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @JvmField
        public final boolean f11081OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @JvmField
        public final boolean f11082OooO0o0;

        public Configuration(@NotNull Context context, @Nullable String str, @NotNull OooO00o callback, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f11078OooO00o = context;
            this.f11079OooO0O0 = str;
            this.f11080OooO0OO = callback;
            this.f11081OooO0Oo = z;
            this.f11082OooO0o0 = z2;
        }
    }

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        public final int f11083OooO00o;

        public OooO00o(int i) {
            this.f11083OooO00o = i;
        }

        public static void OooO00o(String str) {
            if (StringsKt__StringsJVMKt.equals(str, SQLiteDatabase.MEMORY, true)) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                File file = new File(str);
                Intrinsics.checkNotNullParameter(file, "file");
                android.database.sqlite.SQLiteDatabase.deleteDatabase(file);
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        public abstract void OooO0O0(@NotNull SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0OO(@NotNull SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0Oo(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        public abstract void OooO0o(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        public abstract void OooO0o0(@NotNull SupportSQLiteDatabase supportSQLiteDatabase);
    }

    public interface OooO0O0 {
        @NotNull
        SupportSQLiteOpenHelper create(@NotNull Configuration configuration);
    }

    @Nullable
    String getDatabaseName();

    @NotNull
    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);
}

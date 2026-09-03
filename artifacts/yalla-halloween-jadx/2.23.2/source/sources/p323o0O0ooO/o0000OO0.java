package p323o0O0ooO;

import android.annotation.SuppressLint;
import androidx.sqlite.db.SupportSQLiteQuery;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 implements SupportSQLiteQuery {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f42039OooO0Oo;

    public static final class OooO00o {
        @JvmStatic
        @SuppressLint({"SyntheticAccessor"})
        public static void OooO00o(@NotNull o000 statement, @Nullable Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    statement.bindNull(i);
                } else if (obj instanceof byte[]) {
                    statement.bindBlob(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    statement.bindDouble(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    statement.bindDouble(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    statement.bindLong(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    statement.bindLong(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    statement.bindLong(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    statement.bindLong(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    statement.bindString(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    statement.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            }
        }
    }

    public o0000OO0(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f42039OooO0Oo = query;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final int OooO00o() {
        return 0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void OooO0OO(@NotNull o000 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        OooO00o.OooO00o(statement, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @NotNull
    public final String OooO0oO() {
        return this.f42039OooO0Oo;
    }
}

package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p422o0OoO0o.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class RoomSQLiteQuery implements SupportSQLiteQuery, OooOo00 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final TreeMap<Integer, RoomSQLiteQuery> f7913OooOO0o = new TreeMap<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final byte[][] f7914OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @VisibleForTesting
    public final int f7915OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final long[] f7916OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public volatile String f7917OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final double[] f7918OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final String[] f7919OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final int[] f7920OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f7921OooOO0O;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Binding;", "", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Binding {
    }

    public static final class OooO00o {
        @JvmStatic
        @NotNull
        public static RoomSQLiteQuery OooO00o(int i, @NotNull String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
            synchronized (treeMap) {
                Map.Entry<Integer, RoomSQLiteQuery> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    Unit unit = Unit.INSTANCE;
                    RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i);
                    Intrinsics.checkNotNullParameter(query, "query");
                    roomSQLiteQuery.f7917OooO0o0 = query;
                    roomSQLiteQuery.f7921OooOO0O = i;
                    return roomSQLiteQuery;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                RoomSQLiteQuery sqliteQuery = entryCeilingEntry.getValue();
                sqliteQuery.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                sqliteQuery.f7917OooO0o0 = query;
                sqliteQuery.f7921OooOO0O = i;
                Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }
    }

    public RoomSQLiteQuery(int i) {
        this.f7915OooO0Oo = i;
        int i2 = i + 1;
        this.f7920OooOO0 = new int[i2];
        this.f7916OooO0o = new long[i2];
        this.f7918OooO0oO = new double[i2];
        this.f7919OooO0oo = new String[i2];
        this.f7914OooO = new byte[i2][];
    }

    @JvmStatic
    @NotNull
    public static final RoomSQLiteQuery OooOOo0(int i, @NotNull String str) {
        return OooO00o.OooO00o(i, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void OooO00o(@NotNull OooOo00 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int i = this.f7921OooOO0O;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f7920OooOO0[i2];
            if (i3 == 1) {
                statement.bindNull(i2);
            } else if (i3 == 2) {
                statement.bindLong(i2, this.f7916OooO0o[i2]);
            } else if (i3 == 3) {
                statement.bindDouble(i2, this.f7918OooO0oO[i2]);
            } else if (i3 == 4) {
                String str = this.f7919OooO0oo[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.bindString(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.f7914OooO[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.bindBlob(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final int OooO0OO() {
        return this.f7921OooOO0O;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @NotNull
    public final String OooO0oO() {
        String str = this.f7917OooO0o0;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void OooOOo(@NotNull RoomSQLiteQuery other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = other.f7921OooOO0O + 1;
        System.arraycopy(other.f7920OooOO0, 0, this.f7920OooOO0, 0, i);
        System.arraycopy(other.f7916OooO0o, 0, this.f7916OooO0o, 0, i);
        System.arraycopy(other.f7919OooO0oo, 0, this.f7919OooO0oo, 0, i);
        System.arraycopy(other.f7914OooO, 0, this.f7914OooO, 0, i);
        System.arraycopy(other.f7918OooO0oO, 0, this.f7918OooO0oO, 0, i);
    }

    @Override // p422o0OoO0o.OooOo00
    public final void bindBlob(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7920OooOO0[i] = 5;
        this.f7914OooO[i] = value;
    }

    @Override // p422o0OoO0o.OooOo00
    public final void bindDouble(int i, double d) {
        this.f7920OooOO0[i] = 3;
        this.f7918OooO0oO[i] = d;
    }

    @Override // p422o0OoO0o.OooOo00
    public final void bindLong(int i, long j) {
        this.f7920OooOO0[i] = 2;
        this.f7916OooO0o[i] = j;
    }

    @Override // p422o0OoO0o.OooOo00
    public final void bindNull(int i) {
        this.f7920OooOO0[i] = 1;
    }

    @Override // p422o0OoO0o.OooOo00
    public final void bindString(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7920OooOO0[i] = 4;
        this.f7919OooO0oo[i] = value;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = f7913OooOO0o;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f7915OooO0Oo), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}

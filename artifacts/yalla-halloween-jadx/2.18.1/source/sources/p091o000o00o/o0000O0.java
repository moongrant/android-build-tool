package p091o000o00o;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p095o000o0Oo.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0000O0 implements SupportSQLiteQuery, o00oO0o {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @VisibleForTesting
    public static final TreeMap<Integer, o0000O0> f29162OoooOO0 = new TreeMap<>();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @VisibleForTesting
    public final String[] f29163Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public volatile String f29164Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @VisibleForTesting
    public final long[] f29165Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @VisibleForTesting
    public final double[] f29166Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @VisibleForTesting
    public int f29167OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int[] f29168OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @VisibleForTesting
    public final byte[][] f29169OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @VisibleForTesting
    public final int f29170OoooO0O;

    public o0000O0(int i) {
        this.f29170OoooO0O = i;
        int i2 = i + 1;
        this.f29168OoooO0 = new int[i2];
        this.f29165Oooo0oO = new long[i2];
        this.f29166Oooo0oo = new double[i2];
        this.f29163Oooo = new String[i2];
        this.f29169OoooO00 = new byte[i2][];
    }

    public static o0000O0 OooO0o(String str, int i) {
        TreeMap<Integer, o0000O0> treeMap = f29162OoooOO0;
        synchronized (treeMap) {
            Map.Entry<Integer, o0000O0> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                o0000O0 o0000o1 = new o0000O0(i);
                o0000o1.f29164Oooo0o = str;
                o0000o1.f29167OoooO = i;
                return o0000o1;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            o0000O0 value = entryCeilingEntry.getValue();
            value.f29164Oooo0o = str;
            value.f29167OoooO = i;
            return value;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void OooO00o(o00oO0o o00oo0o2) {
        for (int i = 1; i <= this.f29167OoooO; i++) {
            int i2 = this.f29168OoooO0[i];
            if (i2 == 1) {
                o00oo0o2.bindNull(i);
            } else if (i2 == 2) {
                o00oo0o2.bindLong(i, this.f29165Oooo0oO[i]);
            } else if (i2 == 3) {
                o00oo0o2.bindDouble(i, this.f29166Oooo0oo[i]);
            } else if (i2 == 4) {
                o00oo0o2.bindString(i, this.f29163Oooo[i]);
            } else if (i2 == 5) {
                o00oo0o2.bindBlob(i, this.f29169OoooO00[i]);
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final int OooO0O0() {
        return this.f29167OoooO;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final String OooO0Oo() {
        return this.f29164Oooo0o;
    }

    public final void OooO0oo(o0000O0 o0000o1) {
        int i = o0000o1.f29167OoooO + 1;
        System.arraycopy(o0000o1.f29168OoooO0, 0, this.f29168OoooO0, 0, i);
        System.arraycopy(o0000o1.f29165Oooo0oO, 0, this.f29165Oooo0oO, 0, i);
        System.arraycopy(o0000o1.f29163Oooo, 0, this.f29163Oooo, 0, i);
        System.arraycopy(o0000o1.f29169OoooO00, 0, this.f29169OoooO00, 0, i);
        System.arraycopy(o0000o1.f29166Oooo0oo, 0, this.f29166Oooo0oo, 0, i);
    }

    @Override // p095o000o0Oo.o00oO0o
    public final void bindBlob(int i, byte[] bArr) {
        this.f29168OoooO0[i] = 5;
        this.f29169OoooO00[i] = bArr;
    }

    @Override // p095o000o0Oo.o00oO0o
    public final void bindDouble(int i, double d) {
        this.f29168OoooO0[i] = 3;
        this.f29166Oooo0oo[i] = d;
    }

    @Override // p095o000o0Oo.o00oO0o
    public final void bindLong(int i, long j) {
        this.f29168OoooO0[i] = 2;
        this.f29165Oooo0oO[i] = j;
    }

    @Override // p095o000o0Oo.o00oO0o
    public final void bindNull(int i) {
        this.f29168OoooO0[i] = 1;
    }

    @Override // p095o000o0Oo.o00oO0o
    public final void bindString(int i, String str) {
        this.f29168OoooO0[i] = 4;
        this.f29163Oooo[i] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void release() {
        TreeMap<Integer, o0000O0> treeMap = f29162OoooOO0;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f29170OoooO0O), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
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
        }
    }
}

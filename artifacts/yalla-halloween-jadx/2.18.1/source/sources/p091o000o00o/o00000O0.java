package p091o000o00o;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p016OooOoO0.OooOo00;
import p095o000o0Oo.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0 {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String[] f29126OooOOO0 = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00000 f29127OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String[] f29129OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public Map<String, Set<String>> f29130OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RoomDatabase f29131OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile SupportSQLiteStatement f29134OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0O0 f29135OooO0oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AtomicBoolean f29133OooO0o0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f29132OooO0o = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @SuppressLint({"RestrictedApi"})
    @VisibleForTesting
    public final SafeIterableMap<OooO0OO, OooO0o> f29136OooOO0 = new SafeIterableMap<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Object f29137OooOO0O = new Object();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @VisibleForTesting
    public OooO00o f29138OooOO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final HashMap<String, Integer> f29128OooO00o = new HashMap<>();

    public static class OooO extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00000O0 f29139OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final WeakReference<OooO0OO> f29140OooO0OO;

        public OooO(o00000O0 o00000o1, OooO0OO oooO0OO) {
            super(oooO0OO.f29146OooO00o);
            this.f29139OooO0O0 = o00000o1;
            this.f29140OooO0OO = new WeakReference<>(oooO0OO);
        }

        @Override // o000o00o.o00000O0.OooO0OO
        public final void OooO00o(@NonNull Set<String> set) {
            OooO0OO oooO0OO = this.f29140OooO0OO.get();
            if (oooO0OO == null) {
                this.f29139OooO0O0.OooO0o0(this);
            } else {
                oooO0OO.OooO00o(set);
            }
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public final Set<Integer> OooO00o() {
            HashSet hashSet = new HashSet();
            Cursor cursorOooOOO = o00000O0.this.f29131OooO0Oo.OooOOO(new oo000o("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorOooOOO.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorOooOOO.getInt(0)));
                } catch (Throwable th) {
                    cursorOooOOO.close();
                    throw th;
                }
            }
            cursorOooOOO.close();
            if (!hashSet.isEmpty()) {
                o00000O0.this.f29134OooO0oO.executeUpdateDelete();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Set<Integer> setOooO00o;
            ReentrantReadWriteLock.ReadLock lock = o00000O0.this.f29131OooO0Oo.f9289OooO.readLock();
            lock.lock();
            try {
                try {
                    if (!o00000O0.this.OooO0Oo()) {
                        lock.unlock();
                        Objects.requireNonNull(o00000O0.this);
                        return;
                    }
                    if (!o00000O0.this.f29133OooO0o0.compareAndSet(true, false)) {
                        lock.unlock();
                        Objects.requireNonNull(o00000O0.this);
                        return;
                    }
                    if (o00000O0.this.f29131OooO0Oo.OooO()) {
                        lock.unlock();
                        Objects.requireNonNull(o00000O0.this);
                        return;
                    }
                    try {
                        SupportSQLiteDatabase writableDatabase = o00000O0.this.f29131OooO0Oo.f9293OooO0Oo.getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        try {
                            setOooO00o = OooO00o();
                            try {
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                            } catch (Throwable th) {
                                th = th;
                                writableDatabase.endTransaction();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    } catch (IllegalStateException e2) {
                        e = e2;
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    }
                    lock.unlock();
                    Objects.requireNonNull(o00000O0.this);
                    if (setOooO00o != null || setOooO00o.isEmpty()) {
                    }
                    synchronized (o00000O0.this.f29136OooOO0) {
                        Iterator<Map.Entry<OooO0OO, OooO0o>> it = o00000O0.this.f29136OooOO0.iterator();
                        while (it.hasNext()) {
                            OooO0o value = it.next().getValue();
                            int length = value.f29147OooO00o.length;
                            Set<String> hashSet = null;
                            for (int i = 0; i < length; i++) {
                                if (setOooO00o.contains(Integer.valueOf(value.f29147OooO00o[i]))) {
                                    if (length == 1) {
                                        hashSet = value.f29150OooO0Oo;
                                    } else {
                                        if (hashSet == null) {
                                            hashSet = new HashSet<>(length);
                                        }
                                        hashSet.add(value.f29148OooO0O0[i]);
                                    }
                                }
                            }
                            if (hashSet != null) {
                                value.f29149OooO0OO.OooO00o(hashSet);
                            }
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    lock.unlock();
                    Objects.requireNonNull(o00000O0.this);
                    throw th3;
                }
            } catch (SQLiteException | IllegalStateException e3) {
                e = e3;
                setOooO00o = null;
            }
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            lock.unlock();
            Objects.requireNonNull(o00000O0.this);
            if (setOooO00o != null) {
            }
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long[] f29142OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean[] f29143OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int[] f29144OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f29145OooO0Oo;

        public OooO0O0(int i) {
            long[] jArr = new long[i];
            this.f29142OooO00o = jArr;
            boolean[] zArr = new boolean[i];
            this.f29143OooO0O0 = zArr;
            this.f29144OooO0OO = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        @Nullable
        public final int[] OooO00o() {
            synchronized (this) {
                if (!this.f29145OooO0Oo) {
                    return null;
                }
                int length = this.f29142OooO00o.length;
                for (int i = 0; i < length; i++) {
                    int i2 = 1;
                    boolean z = this.f29142OooO00o[i] > 0;
                    boolean[] zArr = this.f29143OooO0O0;
                    if (z != zArr[i]) {
                        int[] iArr = this.f29144OooO0OO;
                        if (!z) {
                            i2 = 2;
                        }
                        iArr[i] = i2;
                    } else {
                        this.f29144OooO0OO[i] = 0;
                    }
                    zArr[i] = z;
                }
                this.f29145OooO0Oo = false;
                return (int[]) this.f29144OooO0OO.clone();
            }
        }
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f29146OooO00o;

        public OooO0OO(@NonNull String[] strArr) {
            this.f29146OooO00o = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract void OooO00o(@NonNull Set<String> set);
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int[] f29147OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String[] f29148OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0OO f29149OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Set<String> f29150OooO0Oo;

        public OooO0o(OooO0OO oooO0OO, int[] iArr, String[] strArr) {
            this.f29149OooO0OO = oooO0OO;
            this.f29147OooO00o = iArr;
            this.f29148OooO0O0 = strArr;
            if (iArr.length != 1) {
                this.f29150OooO0Oo = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f29150OooO0Oo = Collections.unmodifiableSet(hashSet);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public o00000O0(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f29131OooO0Oo = roomDatabase;
        this.f29135OooO0oo = new OooO0O0(strArr.length);
        this.f29130OooO0OO = map2;
        this.f29127OooO = new o00000(roomDatabase);
        int length = strArr.length;
        this.f29129OooO0O0 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f29128OooO00o.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f29129OooO0O0[i] = str2.toLowerCase(locale);
            } else {
                this.f29129OooO0O0[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f29128OooO00o.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f29128OooO00o;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public static void OooO0O0(StringBuilder sb, String str, String str2) {
        OooO0O0.OooO0O0.OooO00o(sb, "`", "room_table_modification_trigger_", str, "_");
        sb.append(str2);
        sb.append("`");
    }

    public final void OooO(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f29131OooO0Oo.f9289OooO.readLock();
            lock.lock();
            try {
                synchronized (this.f29137OooOO0O) {
                    int[] iArrOooO00o = this.f29135OooO0oo.OooO00o();
                    if (iArrOooO00o == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrOooO00o.length;
                    if (supportSQLiteDatabase.isWriteAheadLoggingEnabled()) {
                        supportSQLiteDatabase.beginTransactionNonExclusive();
                    } else {
                        supportSQLiteDatabase.beginTransaction();
                    }
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = iArrOooO00o[i];
                            if (i2 == 1) {
                                OooO0oO(supportSQLiteDatabase, i);
                            } else if (i2 == 2) {
                                String str = this.f29129OooO0O0[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f29126OooOOO0;
                                for (int i3 = 0; i3 < 3; i3++) {
                                    String str2 = strArr[i3];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    OooO0O0(sb, str, str2);
                                    supportSQLiteDatabase.execSQL(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            supportSQLiteDatabase.endTransaction();
                            throw th;
                        }
                    }
                    supportSQLiteDatabase.setTransactionSuccessful();
                    supportSQLiteDatabase.endTransaction();
                    lock.unlock();
                }
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        } catch (SQLiteException | IllegalStateException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        }
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public final void OooO00o(@NonNull OooO0OO oooO0OO) {
        OooO0o oooO0oPutIfAbsent;
        boolean z;
        String[] strArrOooO0o = OooO0o(oooO0OO.f29146OooO00o);
        int length = strArrOooO0o.length;
        int[] iArr = new int[length];
        int length2 = strArrOooO0o.length;
        for (int i = 0; i < length2; i++) {
            Integer num = this.f29128OooO00o.get(strArrOooO0o[i].toLowerCase(Locale.US));
            if (num == null) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("There is no table with name ");
                sbOooO0o0.append(strArrOooO0o[i]);
                throw new IllegalArgumentException(sbOooO0o0.toString());
            }
            iArr[i] = num.intValue();
        }
        OooO0o oooO0o = new OooO0o(oooO0OO, iArr, strArrOooO0o);
        synchronized (this.f29136OooOO0) {
            oooO0oPutIfAbsent = this.f29136OooOO0.putIfAbsent(oooO0OO, oooO0o);
        }
        if (oooO0oPutIfAbsent == null) {
            OooO0O0 oooO0O0 = this.f29135OooO0oo;
            synchronized (oooO0O0) {
                z = false;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr[i2];
                    long[] jArr = oooO0O0.f29142OooO00o;
                    long j = jArr[i3];
                    jArr[i3] = 1 + j;
                    if (j == 0) {
                        oooO0O0.f29145OooO0Oo = true;
                        z = true;
                    }
                }
            }
            if (z) {
                OooO0oo();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final LiveData OooO0OO(String[] strArr, Callable callable) {
        o00000 o00000Var = this.f29127OooO;
        String[] strArrOooO0o = OooO0o(strArr);
        for (String str : strArrOooO0o) {
            if (!this.f29128OooO00o.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException(OooOo00.OooO0Oo("There is no table with name ", str));
            }
        }
        Objects.requireNonNull(o00000Var);
        return new o0000O0O(o00000Var.f29119OooO0O0, o00000Var, callable, strArrOooO0o);
    }

    public final boolean OooO0Oo() {
        if (!this.f29131OooO0Oo.OooOOO0()) {
            return false;
        }
        if (!this.f29132OooO0o) {
            this.f29131OooO0Oo.f9293OooO0Oo.getWritableDatabase();
        }
        if (this.f29132OooO0o) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final String[] OooO0o(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f29130OooO0OO.containsKey(lowerCase)) {
                hashSet.addAll(this.f29130OooO0OO.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public final void OooO0o0(@NonNull OooO0OO oooO0OO) {
        OooO0o oooO0oRemove;
        boolean z;
        synchronized (this.f29136OooOO0) {
            oooO0oRemove = this.f29136OooOO0.remove(oooO0OO);
        }
        if (oooO0oRemove != null) {
            OooO0O0 oooO0O0 = this.f29135OooO0oo;
            int[] iArr = oooO0oRemove.f29147OooO00o;
            synchronized (oooO0O0) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = oooO0O0.f29142OooO00o;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        oooO0O0.f29145OooO0Oo = true;
                        z = true;
                    }
                }
            }
            if (z) {
                OooO0oo();
            }
        }
    }

    public final void OooO0oO(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f29129OooO0O0[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f29126OooOOO0;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            OooO0O0(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            OooO0O0.OooO0O0.OooO00o(sb, str, "` BEGIN UPDATE ", "room_table_modification_log", " SET ");
            OooO0O0.OooO0O0.OooO00o(sb, "invalidated", " = 1", " WHERE ", "table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            supportSQLiteDatabase.execSQL(sb.toString());
        }
    }

    public final void OooO0oo() {
        if (this.f29131OooO0Oo.OooOOO0()) {
            OooO(this.f29131OooO0Oo.f9293OooO0Oo.getWritableDatabase());
        }
    }
}

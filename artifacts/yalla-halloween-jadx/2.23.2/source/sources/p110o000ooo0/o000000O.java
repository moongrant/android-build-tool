package p110o000ooo0;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.firebase.perf.FirebasePerformance;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public static final String[] f35834OooOOOO = {"UPDATE", FirebasePerformance.HttpMethod.DELETE, "INSERT"};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f35835OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f35836OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f35837OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Map<String, Set<String>> f35838OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f35839OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final AtomicBoolean f35840OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String[] f35841OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile boolean f35842OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public volatile SupportSQLiteStatement f35843OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o000OOo f35844OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("observerMap")
    @NotNull
    public final SafeIterableMap<OooO0OO, OooO0o> f35845OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Object f35846OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final o00000 f35847OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Object f35848OooOOO0;

    public static final class OooO extends OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o000000O f35849OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final WeakReference<OooO0OO> f35850OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(@NotNull o000000O tracker, @NotNull OooO0OO delegate) {
            super(delegate.f35855OooO00o);
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f35849OooO0O0 = tracker;
            this.f35850OooO0OO = new WeakReference<>(delegate);
        }

        @Override // o000ooo0.o000000O.OooO0OO
        public final void OooO00o(@NotNull Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            OooO0OO oooO0OO = this.f35850OooO0OO.get();
            if (oooO0OO == null) {
                this.f35849OooO0O0.OooO0Oo(this);
            } else {
                oooO0OO.OooO00o(tables);
            }
        }
    }

    public static final class OooO00o {
        @NotNull
        public static String OooO00o(@NotNull String tableName, @NotNull String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final long[] f35851OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final boolean[] f35852OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final int[] f35853OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f35854OooO0Oo;

        public OooO0O0(int i) {
            this.f35851OooO00o = new long[i];
            this.f35852OooO0O0 = new boolean[i];
            this.f35853OooO0OO = new int[i];
        }

        @VisibleForTesting
        @JvmName(name = "getTablesToSync")
        @Nullable
        public final int[] OooO00o() {
            synchronized (this) {
                if (!this.f35854OooO0Oo) {
                    return null;
                }
                long[] jArr = this.f35851OooO00o;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = this.f35852OooO0O0;
                    if (z != zArr[i2]) {
                        int[] iArr = this.f35853OooO0OO;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        this.f35853OooO0OO[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.f35854OooO0Oo = false;
                return (int[]) this.f35853OooO0OO.clone();
            }
        }

        public final boolean OooO0O0(@NotNull int... tableIds) {
            boolean z;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : tableIds) {
                    long[] jArr = this.f35851OooO00o;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        z = true;
                        this.f35854OooO0Oo = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            return z;
        }

        public final boolean OooO0OO(@NotNull int... tableIds) {
            boolean z;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                z = false;
                for (int i : tableIds) {
                    long[] jArr = this.f35851OooO00o;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        z = true;
                        this.f35854OooO0Oo = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            return z;
        }

        public final void OooO0Oo() {
            synchronized (this) {
                Arrays.fill(this.f35852OooO0O0, false);
                this.f35854OooO0Oo = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String[] f35855OooO00o;

        public OooO0OO(@NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.f35855OooO00o = tables;
        }

        public abstract void OooO00o(@NotNull Set<String> set);
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final OooO0OO f35856OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final int[] f35857OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final String[] f35858OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final Set<String> f35859OooO0Oo;

        public OooO0o(@NotNull OooO0OO observer, @NotNull int[] tableIds, @NotNull String[] tableNames) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.f35856OooO00o = observer;
            this.f35857OooO0O0 = tableIds;
            this.f35858OooO0OO = tableNames;
            this.f35859OooO0Oo = (tableNames.length == 0) ^ true ? SetsKt.setOf(tableNames[0]) : SetsKt.emptySet();
            if (!(tableIds.length == tableNames.length)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        public final void OooO00o(@NotNull Set<Integer> invalidatedTablesIds) {
            Set<String> setEmptySet;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f35857OooO0O0;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    Set setCreateSetBuilder = SetsKt.createSetBuilder();
                    int length2 = iArr.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i]))) {
                            setCreateSetBuilder.add(this.f35858OooO0OO[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    setEmptySet = SetsKt.build(setCreateSetBuilder);
                } else {
                    setEmptySet = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f35859OooO0Oo : SetsKt.emptySet();
                }
            } else {
                setEmptySet = SetsKt.emptySet();
            }
            if (!setEmptySet.isEmpty()) {
                this.f35856OooO00o.OooO00o(setEmptySet);
            }
        }

        public final void OooO0O0(@NotNull String[] tables) {
            Set<String> setEmptySet;
            Intrinsics.checkNotNullParameter(tables, "tables");
            String[] strArr = this.f35858OooO0OO;
            int length = strArr.length;
            if (length != 0) {
                boolean z = false;
                if (length != 1) {
                    Set setCreateSetBuilder = SetsKt.createSetBuilder();
                    for (String str : tables) {
                        for (String str2 : strArr) {
                            if (StringsKt__StringsJVMKt.equals(str2, str, true)) {
                                setCreateSetBuilder.add(str2);
                            }
                        }
                    }
                    setEmptySet = SetsKt.build(setCreateSetBuilder);
                } else {
                    for (String str3 : tables) {
                        if (StringsKt__StringsJVMKt.equals(str3, strArr[0], true)) {
                            z = true;
                            break;
                        }
                    }
                    setEmptySet = z ? this.f35859OooO0Oo : SetsKt.emptySet();
                }
            } else {
                setEmptySet = SetsKt.emptySet();
            }
            if (!setEmptySet.isEmpty()) {
                this.f35856OooO00o.OooO00o(setEmptySet);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public o000000O(@NotNull RoomDatabase database, @NotNull HashMap shadowTablesMap, @NotNull HashMap viewTables, @NotNull String... tableNames) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f35836OooO00o = database;
        this.f35837OooO0O0 = shadowTablesMap;
        this.f35838OooO0OO = viewTables;
        this.f35840OooO0o = new AtomicBoolean(false);
        this.f35835OooO = new OooO0O0(tableNames.length);
        this.f35844OooOO0 = new o000OOo(database);
        this.f35845OooOO0O = new SafeIterableMap<>();
        this.f35846OooOO0o = new Object();
        this.f35848OooOOO0 = new Object();
        this.f35839OooO0Oo = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String str = tableNames[i];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f35839OooO0Oo.put(lowerCase2, Integer.valueOf(i));
            String str2 = this.f35837OooO0O0.get(tableNames[i]);
            if (str2 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i] = lowerCase2;
        }
        this.f35841OooO0o0 = strArr;
        for (Map.Entry<String, String> entry : this.f35837OooO0O0.entrySet()) {
            String value = entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase3 = value.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f35839OooO0Oo.containsKey(lowerCase3)) {
                String key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase4 = key.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f35839OooO0Oo;
                linkedHashMap.put(lowerCase4, MapsKt.getValue(linkedHashMap, lowerCase3));
            }
        }
        this.f35847OooOOO = new o00000(this);
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public final void OooO00o(@NotNull OooO0OO observer) {
        OooO0o oooO0oPutIfAbsent;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] strArrOooO0o0 = OooO0o0(observer.f35855OooO00o);
        ArrayList arrayList = new ArrayList(strArrOooO0o0.length);
        for (String str : strArrOooO0o0) {
            LinkedHashMap linkedHashMap = this.f35839OooO0Oo;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        int[] intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        OooO0o oooO0o = new OooO0o(observer, intArray, strArrOooO0o0);
        synchronized (this.f35845OooOO0O) {
            oooO0oPutIfAbsent = this.f35845OooOO0O.putIfAbsent(observer, oooO0o);
        }
        if (oooO0oPutIfAbsent == null && this.f35835OooO.OooO0O0(Arrays.copyOf(intArray, intArray.length))) {
            OooO0oO();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public final o000O000 OooO0O0(@NotNull String[] tableNames, @NotNull Callable computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        String[] tableNames2 = OooO0o0(tableNames);
        for (String str : tableNames2) {
            LinkedHashMap linkedHashMap = this.f35839OooO0Oo;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!linkedHashMap.containsKey(lowerCase)) {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        o000OOo o000ooo2 = this.f35844OooOO0;
        o000ooo2.getClass();
        Intrinsics.checkNotNullParameter(tableNames2, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return new o000O000(o000ooo2.f35923OooO00o, o000ooo2, computeFunction, tableNames2);
    }

    public final boolean OooO0OO() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.f35836OooO00o.f10978OooO00o;
        if (!(supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen())) {
            return false;
        }
        if (!this.f35842OooO0oO) {
            this.f35836OooO00o.OooO0oO().getWritableDatabase();
        }
        if (this.f35842OooO0oO) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public final void OooO0Oo(@NotNull OooO0OO observer) {
        OooO0o oooO0oRemove;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f35845OooOO0O) {
            oooO0oRemove = this.f35845OooOO0O.remove(observer);
        }
        if (oooO0oRemove != null) {
            OooO0O0 oooO0O0 = this.f35835OooO;
            int[] iArr = oooO0oRemove.f35857OooO0O0;
            if (oooO0O0.OooO0OO(Arrays.copyOf(iArr, iArr.length))) {
                OooO0oO();
            }
        }
    }

    public final void OooO0o(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f35841OooO0o0[i];
        String[] strArr = f35834OooOOOO;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + OooO00o.OooO00o(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    public final String[] OooO0o0(String[] strArr) {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (String str : strArr) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Map<String, Set<String>> map = this.f35838OooO0OO;
            if (map.containsKey(lowerCase)) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map.get(lowerCase2);
                Intrinsics.checkNotNull(set);
                setCreateSetBuilder.addAll(set);
            } else {
                setCreateSetBuilder.add(str);
            }
        }
        Object[] array = SetsKt.build(setCreateSetBuilder).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public final void OooO0oO() {
        boolean z;
        RoomDatabase roomDatabase = this.f35836OooO00o;
        SupportSQLiteDatabase supportSQLiteDatabase = roomDatabase.f10978OooO00o;
        if (supportSQLiteDatabase != null) {
            z = supportSQLiteDatabase.isOpen();
        }
        if (z) {
            OooO0oo(roomDatabase.OooO0oO().getWritableDatabase());
        }
    }

    public final void OooO0oo(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.inTransaction()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.f35836OooO00o.f10977OooO.readLock();
            Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.f35846OooOO0o) {
                    int[] iArrOooO00o = this.f35835OooO.OooO00o();
                    if (iArrOooO00o == null) {
                        lock.unlock();
                        return;
                    }
                    Intrinsics.checkNotNullParameter(database, "database");
                    if (database.isWriteAheadLoggingEnabled()) {
                        database.beginTransactionNonExclusive();
                    } else {
                        database.beginTransaction();
                    }
                    try {
                        int length = iArrOooO00o.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = iArrOooO00o[i];
                            int i4 = i2 + 1;
                            if (i3 == 1) {
                                OooO0o(database, i2);
                            } else if (i3 == 2) {
                                String str = this.f35841OooO0o0[i2];
                                String[] strArr = f35834OooOOOO;
                                for (int i5 = 0; i5 < 3; i5++) {
                                    String str2 = "DROP TRIGGER IF EXISTS " + OooO00o.OooO00o(str, strArr[i5]);
                                    Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().apply(builderAction).toString()");
                                    database.execSQL(str2);
                                }
                            }
                            i++;
                            i2 = i4;
                        }
                        database.setTransactionSuccessful();
                        database.endTransaction();
                        Unit unit = Unit.INSTANCE;
                        lock.unlock();
                    } catch (Throwable th) {
                        database.endTransaction();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }
}

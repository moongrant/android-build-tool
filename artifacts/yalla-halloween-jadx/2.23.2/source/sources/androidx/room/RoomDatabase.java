package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p109o000ooo.o00O0OO0;
import p110o000ooo0.o000000O;
import p110o000ooo0.o00000O;
import p110o000ooo0.o000O0;
import p110o000ooo0.o000O0o;
import p110o000ooo0.o00Oo0;
import p110o000ooo0.o0OOO0o;
import p110o000ooo0.o0ooOOo;
import p235o00oOoo.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RoomDatabase {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @Nullable
    public volatile SupportSQLiteDatabase f10978OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Executor f10979OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000O0 f10980OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public SupportSQLiteOpenHelper f10981OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f10982OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    public List<? extends OooO0O0> f10984OooO0oO;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f10987OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f10988OooOO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o000000O f10983OooO0o0 = OooO0Oo();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final LinkedHashMap f10985OooO0oo = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ReentrantReadWriteLock f10977OooO = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ThreadLocal<Integer> f10986OooOO0 = new ThreadLocal<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    public static class OooO00o<T extends RoomDatabase> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public SupportSQLiteOpenHelper.OooO0O0 f10989OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f10990OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Class<T> f10991OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final String f10992OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final ArrayList f10993OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final ArrayList f10994OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final ArrayList f10995OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public Executor f10996OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public Executor f10997OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f10998OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @NotNull
        public final JournalMode f10999OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f11000OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final long f11001OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f11002OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @NotNull
        public final OooO0OO f11003OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @NotNull
        public final LinkedHashSet f11004OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @Nullable
        public HashSet f11005OooOOo0;

        public OooO00o(@NotNull Context context, @NotNull Class<T> klass, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.f10990OooO00o = context;
            this.f10991OooO0O0 = klass;
            this.f10992OooO0OO = str;
            this.f10993OooO0Oo = new ArrayList();
            this.f10995OooO0o0 = new ArrayList();
            this.f10994OooO0o = new ArrayList();
            this.f10999OooOO0O = JournalMode.AUTOMATIC;
            this.f11000OooOO0o = true;
            this.f11001OooOOO = -1L;
            this.f11003OooOOOO = new OooO0OO();
            this.f11004OooOOOo = new LinkedHashSet();
        }

        @NotNull
        public final void OooO00o(@NotNull o00O0OO0... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.f11005OooOOo0 == null) {
                this.f11005OooOOo0 = new HashSet();
            }
            for (o00O0OO0 o00o0oo1 : migrations) {
                HashSet hashSet = this.f11005OooOOo0;
                Intrinsics.checkNotNull(hashSet);
                hashSet.add(Integer.valueOf(o00o0oo1.f35825OooO00o));
                HashSet hashSet2 = this.f11005OooOOo0;
                Intrinsics.checkNotNull(hashSet2);
                hashSet2.add(Integer.valueOf(o00o0oo1.f35826OooO0O0));
            }
            this.f11003OooOOOO.OooO00o((o00O0OO0[]) Arrays.copyOf(migrations, migrations.length));
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
        @NotNull
        public final T OooO0O0() {
            boolean zContainsKey;
            Executor executor = this.f10996OooO0oO;
            if (executor == null && this.f10997OooO0oo == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.f10997OooO0oo = iOThreadExecutor;
                this.f10996OooO0oO = iOThreadExecutor;
            } else if (executor != null && this.f10997OooO0oo == null) {
                this.f10997OooO0oo = executor;
            } else if (executor == null) {
                this.f10996OooO0oO = this.f10997OooO0oo;
            }
            HashSet hashSet = this.f11005OooOOo0;
            LinkedHashSet linkedHashSet = this.f11004OooOOOo;
            if (hashSet != null) {
                Intrinsics.checkNotNull(hashSet);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!(!linkedHashSet.contains(Integer.valueOf(iIntValue)))) {
                        throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", iIntValue).toString());
                    }
                }
            }
            SupportSQLiteOpenHelper.OooO0O0 o000o001 = this.f10989OooO;
            if (o000o001 == null) {
                o000o001 = new o000O000();
            }
            SupportSQLiteOpenHelper.OooO0O0 oooO0O0 = o000o001;
            if (this.f11001OooOOO > 0) {
                if (this.f10992OooO0OO != null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
            }
            Context context = this.f10990OooO00o;
            String str = this.f10992OooO0OO;
            OooO0OO oooO0OO = this.f11003OooOOOO;
            ArrayList arrayList = this.f10993OooO0Oo;
            boolean z = this.f10998OooOO0;
            JournalMode journalMode = this.f10999OooOO0O;
            journalMode.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            if (journalMode == JournalMode.AUTOMATIC) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                if (activityManager != null) {
                    Intrinsics.checkNotNullParameter(activityManager, "activityManager");
                    if (activityManager.isLowRamDevice()) {
                        journalMode = JournalMode.TRUNCATE;
                    } else {
                        journalMode = JournalMode.WRITE_AHEAD_LOGGING;
                    }
                } else {
                    journalMode = JournalMode.TRUNCATE;
                }
            }
            JournalMode journalMode2 = journalMode;
            Executor executor2 = this.f10996OooO0oO;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Executor executor3 = this.f10997OooO0oo;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            o0ooOOo databaseConfiguration = new o0ooOOo(context, str, oooO0O0, oooO0OO, arrayList, z, journalMode2, executor2, executor3, this.f11000OooOO0o, this.f11002OooOOO0, linkedHashSet, this.f10995OooO0o0, this.f10994OooO0o);
            Class<T> klass = this.f10991OooO0O0;
            Intrinsics.checkNotNullParameter(klass, "klass");
            Intrinsics.checkNotNullParameter("_Impl", "suffix");
            Package r6 = klass.getPackage();
            Intrinsics.checkNotNull(r6);
            String fullPackage = r6.getName();
            String canonicalName = klass.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName);
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (!(fullPackage.length() == 0)) {
                canonicalName = canonicalName.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            String str2 = StringsKt__StringsJVMKt.replace$default(canonicalName, '.', '_', false, 4, (Object) null) + "_Impl";
            try {
                Class<?> cls = Class.forName(fullPackage.length() == 0 ? str2 : fullPackage + '.' + str2, true, klass.getClassLoader());
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                T t = (T) cls.newInstance();
                t.getClass();
                Intrinsics.checkNotNullParameter(databaseConfiguration, "configuration");
                t.f10981OooO0Oo = t.OooO0o0(databaseConfiguration);
                Set<Class<? extends oo00o.OooO0O0>> setOooO0oo = t.OooO0oo();
                BitSet bitSet = new BitSet();
                Iterator<Class<? extends oo00o.OooO0O0>> it2 = setOooO0oo.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    LinkedHashMap linkedHashMap = t.f10985OooO0oo;
                    int i = -1;
                    List<oo00o.OooO0O0> list = databaseConfiguration.f35967OooOOOo;
                    if (zHasNext) {
                        Class<? extends oo00o.OooO0O0> next = it2.next();
                        int size = list.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i2 = size - 1;
                                if (next.isAssignableFrom(list.get(size).getClass())) {
                                    bitSet.set(size);
                                    i = size;
                                    break;
                                }
                                if (i2 < 0) {
                                    break;
                                }
                                size = i2;
                            }
                        }
                        if (!(i >= 0)) {
                            throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                        }
                        linkedHashMap.put(next, list.get(i));
                    } else {
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i3 = size2 - 1;
                                if (!bitSet.get(size2)) {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                                }
                                if (i3 < 0) {
                                    break;
                                }
                                size2 = i3;
                            }
                        }
                        for (o00O0OO0 o00o0oo1 : t.OooO0o(linkedHashMap)) {
                            int i4 = o00o0oo1.f35825OooO00o;
                            OooO0OO oooO0OO2 = databaseConfiguration.f35956OooO0Oo;
                            LinkedHashMap linkedHashMap2 = oooO0OO2.f11006OooO00o;
                            if (linkedHashMap2.containsKey(Integer.valueOf(i4))) {
                                Map mapEmptyMap = (Map) linkedHashMap2.get(Integer.valueOf(i4));
                                if (mapEmptyMap == null) {
                                    mapEmptyMap = MapsKt.emptyMap();
                                }
                                zContainsKey = mapEmptyMap.containsKey(Integer.valueOf(o00o0oo1.f35826OooO0O0));
                            } else {
                                zContainsKey = false;
                            }
                            if (!zContainsKey) {
                                oooO0OO2.OooO00o(o00o0oo1);
                            }
                        }
                        o000O0o o000o0o2 = (o000O0o) RoomDatabase.OooOOOO(o000O0o.class, t.OooO0oO());
                        if (o000o0o2 != null) {
                            Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
                            o000o0o2.f35912OooO0Oo = databaseConfiguration;
                        }
                        o00Oo0 o00oo1 = (o00Oo0) RoomDatabase.OooOOOO(o00Oo0.class, t.OooO0oO());
                        o000000O o000000o2 = t.f10983OooO0o0;
                        if (o00oo1 != null) {
                            o000000o2.getClass();
                            Intrinsics.checkNotNullParameter(null, "autoCloser");
                            throw null;
                        }
                        t.OooO0oO().setWriteAheadLoggingEnabled(databaseConfiguration.f35959OooO0oO == JournalMode.WRITE_AHEAD_LOGGING);
                        t.f10984OooO0oO = databaseConfiguration.f35958OooO0o0;
                        t.f10979OooO0O0 = databaseConfiguration.f35960OooO0oo;
                        t.f10980OooO0OO = new o000O0(databaseConfiguration.f35952OooO);
                        t.f10982OooO0o = databaseConfiguration.f35957OooO0o;
                        Intent serviceIntent = databaseConfiguration.f35961OooOO0;
                        if (serviceIntent != null) {
                            String name = databaseConfiguration.f35954OooO0O0;
                            if (name == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            Context context2 = databaseConfiguration.f35953OooO00o;
                            o000000o2.getClass();
                            Intrinsics.checkNotNullParameter(context2, "context");
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
                            Executor executor4 = o000000o2.f35836OooO00o.f10979OooO0O0;
                            if (executor4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                                executor4 = null;
                            }
                            new o00000O(context2, name, serviceIntent, o000000o2, executor4);
                        }
                        Map<Class<?>, List<Class<?>>> mapOooO = t.OooO();
                        BitSet bitSet2 = new BitSet();
                        Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = mapOooO.entrySet().iterator();
                        while (true) {
                            boolean zHasNext2 = it3.hasNext();
                            List<Object> list2 = databaseConfiguration.f35966OooOOOO;
                            if (!zHasNext2) {
                                int size3 = list2.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i5 = size3 - 1;
                                        if (!bitSet2.get(size3)) {
                                            throw new IllegalArgumentException("Unexpected type converter " + list2.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                        }
                                        if (i5 >= 0) {
                                            size3 = i5;
                                        }
                                    }
                                }
                                return t;
                            }
                            Map.Entry<Class<?>, List<Class<?>>> next2 = it3.next();
                            Class<?> key = next2.getKey();
                            for (Class<?> cls2 : next2.getValue()) {
                                int size4 = list2.size() - 1;
                                if (size4 < 0) {
                                    size4 = -1;
                                    break;
                                }
                                while (true) {
                                    int i6 = size4 - 1;
                                    if (cls2.isAssignableFrom(list2.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    }
                                    if (i6 < 0) {
                                        size4 = -1;
                                        break;
                                    }
                                    size4 = i6;
                                }
                                if (!(size4 >= 0)) {
                                    throw new IllegalArgumentException(("A required type converter (" + cls2 + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                                }
                                t.f10988OooOO0o.put(cls2, list2.get(size4));
                            }
                        }
                    }
                }
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + klass + ".canonicalName");
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + klass + ".canonicalName");
            }
        }
    }

    public static abstract class OooO0O0 {
        public void OooO00o(@NotNull SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final LinkedHashMap f11006OooO00o = new LinkedHashMap();

        public final void OooO00o(@NotNull o00O0OO0... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (o00O0OO0 o00o0oo1 : migrations) {
                int i = o00o0oo1.f35825OooO00o;
                LinkedHashMap linkedHashMap = this.f11006OooO00o;
                Integer numValueOf = Integer.valueOf(i);
                Object treeMap = linkedHashMap.get(numValueOf);
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    linkedHashMap.put(numValueOf, treeMap);
                }
                TreeMap treeMap2 = (TreeMap) treeMap;
                int i2 = o00o0oo1.f35826OooO0O0;
                if (treeMap2.containsKey(Integer.valueOf(i2))) {
                    Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + o00o0oo1);
                }
                treeMap2.put(Integer.valueOf(i2), o00o0oo1);
            }
        }
    }

    public RoomDatabase() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f10987OooOO0O = mapSynchronizedMap;
        this.f10988OooOO0o = new LinkedHashMap();
    }

    public static Object OooOOOO(Class cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof o0OOO0o) {
            return OooOOOO(cls, ((o0OOO0o) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public Map<Class<?>, List<Class<?>>> OooO() {
        return MapsKt.emptyMap();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO00o() {
        if (this.f10982OooO0o) {
            return;
        }
        if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0O0() {
        if (!(OooO0oO().getWritableDatabase().inTransaction() || this.f10986OooOO0.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    @Deprecated(message = "beginTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public final void OooO0OO() {
        OooO00o();
        OooO00o();
        SupportSQLiteDatabase writableDatabase = OooO0oO().getWritableDatabase();
        this.f10983OooO0o0.OooO0oo(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    @NotNull
    public abstract o000000O OooO0Oo();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @JvmSuppressWildcards
    @NotNull
    public List OooO0o(@NotNull LinkedHashMap autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.emptyList();
    }

    @NotNull
    public abstract SupportSQLiteOpenHelper OooO0o0(@NotNull o0ooOOo o0ooooo);

    @NotNull
    public final SupportSQLiteOpenHelper OooO0oO() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f10981OooO0Oo;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public Set<Class<? extends oo00o.OooO0O0>> OooO0oo() {
        return SetsKt.emptySet();
    }

    public final void OooOO0() {
        OooO0oO().getWritableDatabase().endTransaction();
        if (OooO0oO().getWritableDatabase().inTransaction()) {
            return;
        }
        o000000O o000000o2 = this.f10983OooO0o0;
        if (o000000o2.f35840OooO0o.compareAndSet(false, true)) {
            Executor executor = o000000o2.f35836OooO00o.f10979OooO0O0;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executor = null;
            }
            executor.execute(o000000o2.f35847OooOOO);
        }
    }

    public final void OooOO0O(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "db");
        o000000O o000000o2 = this.f10983OooO0o0;
        o000000o2.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (o000000o2.f35848OooOOO0) {
            if (o000000o2.f35842OooO0oO) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.execSQL("PRAGMA temp_store = MEMORY;");
            database.execSQL("PRAGMA recursive_triggers='ON';");
            database.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            o000000o2.OooO0oo(database);
            o000000o2.f35843OooO0oo = database.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            o000000o2.f35842OooO0oO = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmOverloads
    @NotNull
    public final Cursor OooOO0o(@NotNull SupportSQLiteQuery query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        OooO00o();
        OooO0O0();
        return cancellationSignal != null ? OooO0oO().getWritableDatabase().query(query, cancellationSignal) : OooO0oO().getWritableDatabase().query(query);
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public final void OooOOO() {
        OooO0oO().getWritableDatabase().setTransactionSuccessful();
    }

    public final <V> V OooOOO0(@NotNull Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        OooO0OO();
        try {
            V vCall = body.call();
            OooOOO();
            return vCall;
        } finally {
            OooOO0();
        }
    }
}

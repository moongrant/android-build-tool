package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p091o000o00o.o00000O0;
import p091o000o00o.o0000O;
import p091o000o00o.o000O000;
import p091o000o00o.o00Oo0;
import p091o000o00o.o00Ooo;
import p091o000o00o.oo0o0Oo;
import p097o000o0o0.o000O;
import p713oooo00o.o0O000Oo;
import p713oooo00o.o0O000o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class RoomDatabase {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Deprecated
    public volatile SupportSQLiteDatabase f9290OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Executor f9291OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000O000 f9292OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public SupportSQLiteOpenHelper f9293OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f9294OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public List<OooO0O0> f9296OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o00Oo0 f9298OooOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ReentrantReadWriteLock f9289OooO = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ThreadLocal<Integer> f9299OooOO0O = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Map<String, Object> f9300OooOO0o = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00000O0 f9295OooO0o0 = OooO0Oo();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Map<Class<?>, Object> f9301OooOOO0 = new HashMap();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Map<Class<? extends o0O000Oo>, o0O000Oo> f9297OooO0oo = new HashMap();

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    public static class OooO00o<T extends RoomDatabase> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<T> f9303OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f9304OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Context f9305OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ArrayList<OooO0O0> f9306OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Executor f9307OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Executor f9308OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public SupportSQLiteOpenHelper.OooO0O0 f9309OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f9310OooO0oo;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f9312OooOO0O;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Set<Integer> f9314OooOOO0;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public JournalMode f9302OooO = JournalMode.AUTOMATIC;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f9311OooOO0 = true;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final OooO0OO f9313OooOO0o = new OooO0OO();

        public OooO00o(@NonNull Context context, @NonNull Class<T> cls, @Nullable String str) {
            this.f9305OooO0OO = context;
            this.f9303OooO00o = cls;
            this.f9304OooO0O0 = str;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
        @NonNull
        public final OooO00o<T> OooO00o(@NonNull o0O000o0... o0o000o0Arr) {
            if (this.f9314OooOOO0 == null) {
                this.f9314OooOOO0 = new HashSet();
            }
            for (o0O000o0 o0o000o1 : o0o000o0Arr) {
                this.f9314OooOOO0.add(Integer.valueOf(o0o000o1.f53609OooO00o));
                this.f9314OooOOO0.add(Integer.valueOf(o0o000o1.f53610OooO0O0));
            }
            this.f9313OooOO0o.OooO00o(o0o000o0Arr);
            return this;
        }

        /* JADX WARN: Type inference failed for: r7v12, types: [java.util.HashMap, java.util.Map<java.lang.Class<? extends oooo00o.o0O000Oo>, oooo00o.o0O000Oo>] */
        /* JADX WARN: Type inference failed for: r9v1, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Object>] */
        @NonNull
        @SuppressLint({"RestrictedApi"})
        public final T OooO0O0() {
            Executor executor;
            if (this.f9305OooO0OO == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f9303OooO00o == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f9308OooO0o0;
            if (executor2 == null && this.f9307OooO0o == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.f9307OooO0o = iOThreadExecutor;
                this.f9308OooO0o0 = iOThreadExecutor;
            } else if (executor2 != null && this.f9307OooO0o == null) {
                this.f9307OooO0o = executor2;
            } else if (executor2 == null && (executor = this.f9307OooO0o) != null) {
                this.f9308OooO0o0 = executor;
            }
            SupportSQLiteOpenHelper.OooO0O0 o000o = this.f9309OooO0oO;
            if (o000o == null) {
                o000o = new o000O();
            }
            SupportSQLiteOpenHelper.OooO0O0 oooO0O0 = o000o;
            Context context = this.f9305OooO0OO;
            String str = this.f9304OooO0O0;
            OooO0OO oooO0OO = this.f9313OooOO0o;
            ArrayList<OooO0O0> arrayList = this.f9306OooO0Oo;
            boolean z = this.f9310OooO0oo;
            JournalMode journalMode = this.f9302OooO;
            Objects.requireNonNull(journalMode);
            if (journalMode == JournalMode.AUTOMATIC) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                journalMode = (activityManager == null || activityManager.isLowRamDevice()) ? JournalMode.TRUNCATE : JournalMode.WRITE_AHEAD_LOGGING;
            }
            androidx.room.OooO00o oooO00o = new androidx.room.OooO00o(context, str, oooO0O0, oooO0OO, arrayList, z, journalMode, this.f9308OooO0o0, this.f9307OooO0o, this.f9311OooOO0, this.f9312OooOO0O);
            Class<T> cls = this.f9303OooO00o;
            String name = cls.getPackage().getName();
            String canonicalName = cls.getCanonicalName();
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String str2 = canonicalName.replace('.', '_') + "_Impl";
            try {
                T t = (T) Class.forName(name.isEmpty() ? str2 : name + "." + str2, true, cls.getClassLoader()).newInstance();
                t.f9293OooO0Oo = t.OooO0o0(oooO00o);
                Set<Class<? extends o0O000Oo>> setOooO0oO = t.OooO0oO();
                BitSet bitSet = new BitSet();
                Iterator<Class<? extends o0O000Oo>> it = setOooO0oO.iterator();
                while (true) {
                    int i = -1;
                    if (!it.hasNext()) {
                        for (int size = oooO00o.f9280OooO0oO.size() - 1; size >= 0; size--) {
                            if (!bitSet.get(size)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                        }
                        Iterator it2 = t.OooO0o().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            o0O000o0 o0o000o1 = (o0O000o0) it2.next();
                            if (!Collections.unmodifiableMap(oooO00o.f9277OooO0Oo.f9315OooO00o).containsKey(Integer.valueOf(o0o000o1.f53609OooO00o))) {
                                oooO00o.f9277OooO0Oo.OooO00o(o0o000o1);
                            }
                        }
                        o0000O o0000o2 = (o0000O) t.OooOOOo(o0000O.class, t.f9293OooO0Oo);
                        if (o0000o2 != null) {
                            o0000o2.f29161OoooO0O = oooO00o;
                        }
                        if (((o00Ooo) t.OooOOOo(o00Ooo.class, t.f9293OooO0Oo)) != null) {
                            Objects.requireNonNull(t.f9295OooO0o0);
                            throw null;
                        }
                        t.f9293OooO0Oo.setWriteAheadLoggingEnabled(oooO00o.f9273OooO == JournalMode.WRITE_AHEAD_LOGGING);
                        t.f9296OooO0oO = oooO00o.f9279OooO0o0;
                        t.f9291OooO0O0 = oooO00o.f9282OooOO0;
                        t.f9292OooO0OO = new o000O000(oooO00o.f9283OooOO0O);
                        t.f9294OooO0o = oooO00o.f9281OooO0oo;
                        Map<Class<?>, List<Class<?>>> mapOooO0oo = t.OooO0oo();
                        BitSet bitSet2 = new BitSet();
                        for (Map.Entry<Class<?>, List<Class<?>>> entry : mapOooO0oo.entrySet()) {
                            Class<?> key = entry.getKey();
                            for (Class<?> cls2 : entry.getValue()) {
                                int size2 = oooO00o.f9278OooO0o.size() - 1;
                                while (true) {
                                    if (size2 < 0) {
                                        size2 = -1;
                                        break;
                                    }
                                    if (cls2.isAssignableFrom(oooO00o.f9278OooO0o.get(size2).getClass())) {
                                        bitSet2.set(size2);
                                        break;
                                    }
                                    size2--;
                                }
                                if (size2 < 0) {
                                    throw new IllegalArgumentException("A required type converter (" + cls2 + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                                }
                                t.f9301OooOOO0.put(cls2, oooO00o.f9278OooO0o.get(size2));
                            }
                        }
                        for (int size3 = oooO00o.f9278OooO0o.size() - 1; size3 >= 0; size3--) {
                            if (!bitSet2.get(size3)) {
                                throw new IllegalArgumentException("Unexpected type converter " + oooO00o.f9278OooO0o.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                        }
                        return t;
                    }
                    Class<? extends o0O000Oo> next = it.next();
                    for (int size4 = oooO00o.f9280OooO0oO.size() - 1; size4 >= 0; size4--) {
                        if (next.isAssignableFrom(oooO00o.f9280OooO0oO.get(size4).getClass())) {
                            bitSet.set(size4);
                            i = size4;
                            break;
                        }
                    }
                    if (i < 0) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("A required auto migration spec (");
                        sbOooO0o0.append(next.getCanonicalName());
                        sbOooO0o0.append(") is missing in the database configuration.");
                        throw new IllegalArgumentException(sbOooO0o0.toString());
                    }
                    t.f9297OooO0oo.put(next, oooO00o.f9280OooO0oO.get(i));
                }
            } catch (ClassNotFoundException unused) {
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("cannot find implementation for ");
                sbOooO0o1.append(cls.getCanonicalName());
                sbOooO0o1.append(". ");
                sbOooO0o1.append(str2);
                sbOooO0o1.append(" does not exist");
                throw new RuntimeException(sbOooO0o1.toString());
            } catch (IllegalAccessException unused2) {
                StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("Cannot access the constructor");
                sbOooO0o2.append(cls.getCanonicalName());
                throw new RuntimeException(sbOooO0o2.toString());
            } catch (InstantiationException unused3) {
                StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0("Failed to create an instance of ");
                sbOooO0o3.append(cls.getCanonicalName());
                throw new RuntimeException(sbOooO0o3.toString());
            }
        }
    }

    public static abstract class OooO0O0 {
        public void OooO00o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public HashMap<Integer, TreeMap<Integer, o0O000o0>> f9315OooO00o = new HashMap<>();

        public final void OooO00o(@NonNull o0O000o0... o0o000o0Arr) {
            for (o0O000o0 o0o000o1 : o0o000o0Arr) {
                int i = o0o000o1.f53609OooO00o;
                int i2 = o0o000o1.f53610OooO0O0;
                TreeMap<Integer, o0O000o0> treeMap = this.f9315OooO00o.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    this.f9315OooO00o.put(Integer.valueOf(i), treeMap);
                }
                o0O000o0 o0o000o2 = treeMap.get(Integer.valueOf(i2));
                if (o0o000o2 != null) {
                    Log.w("ROOM", "Overriding migration " + o0o000o2 + " with " + o0o000o1);
                }
                treeMap.put(Integer.valueOf(i2), o0o000o1);
            }
        }
    }

    public interface OooO0o {
        void OooO00o();
    }

    public final boolean OooO() {
        return this.f9293OooO0Oo.getWritableDatabase().inTransaction();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO00o() {
        if (this.f9294OooO0o) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO0O0() {
        if (!OooO() && this.f9299OooOO0O.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void OooO0OO() {
        OooO00o();
        OooOO0();
    }

    @NonNull
    public abstract o00000O0 OooO0Oo();

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List OooO0o() {
        return Collections.emptyList();
    }

    @NonNull
    public abstract SupportSQLiteOpenHelper OooO0o0(androidx.room.OooO00o oooO00o);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Class<? extends o0O000Oo>> OooO0oO() {
        return Collections.emptySet();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Map<Class<?>, List<Class<?>>> OooO0oo() {
        return Collections.emptyMap();
    }

    public final void OooOO0() {
        OooO00o();
        SupportSQLiteDatabase writableDatabase = this.f9293OooO0Oo.getWritableDatabase();
        this.f9295OooO0o0.OooO(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    public final void OooOO0O() {
        this.f9293OooO0Oo.getWritableDatabase().endTransaction();
        if (OooO()) {
            return;
        }
        o00000O0 o00000o1 = this.f9295OooO0o0;
        if (o00000o1.f29133OooO0o0.compareAndSet(false, true)) {
            o00000o1.f29131OooO0Oo.f9291OooO0O0.execute(o00000o1.f29138OooOO0o);
        }
    }

    public final void OooOO0o(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        o00000O0 o00000o1 = this.f9295OooO0o0;
        synchronized (o00000o1) {
            if (o00000o1.f29132OooO0o) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            supportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
            supportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
            supportSQLiteDatabase.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            o00000o1.OooO(supportSQLiteDatabase);
            o00000o1.f29134OooO0oO = supportSQLiteDatabase.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            o00000o1.f29132OooO0o = true;
        }
    }

    @NonNull
    public final Cursor OooOOO(@NonNull SupportSQLiteQuery supportSQLiteQuery) {
        OooO00o();
        OooO0O0();
        return this.f9293OooO0Oo.getWritableDatabase().query(supportSQLiteQuery);
    }

    public final boolean OooOOO0() {
        o00Oo0 o00oo1 = this.f9298OooOO0;
        if (o00oo1 != null) {
            return !o00oo1.f29212OooO00o;
        }
        SupportSQLiteDatabase supportSQLiteDatabase = this.f9290OooO00o;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    @Deprecated
    public final void OooOOOO() {
        this.f9293OooO0Oo.getWritableDatabase().setTransactionSuccessful();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final <T> T OooOOOo(Class<T> cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof oo0o0Oo) {
            return (T) OooOOOo(cls, ((oo0o0Oo) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }
}

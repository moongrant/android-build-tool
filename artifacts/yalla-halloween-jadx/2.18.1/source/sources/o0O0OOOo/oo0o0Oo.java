package o0O0OOOo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.facebook.bolts.AppLinks;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import p255o00ooO0o.oo00o;
import p289o0O0OOoO.o0000Ooo;
import p290o0O0OOoo.o000OO;

/* JADX INFO: loaded from: classes2.dex */
@Singleton
@WorkerThread
public final class oo0o0Oo implements OooO0o, p288o0O0OOo.o00Oo0, OooO0OO {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final o0O0O0Oo.OooO0O0 f35695OoooO0 = new o0O0O0Oo.OooO0O0("proto");

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO f35696Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00000O f35697Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0000Ooo f35698Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0000Ooo f35699Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final p629o0ooO.Oooo0<String> f35700OoooO00;

    public interface OooO00o<T, U> {
        U apply(T t);
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f35701OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f35702OooO0O0;

        public OooO0O0(String str, String str2) {
            this.f35701OooO00o = str;
            this.f35702OooO0O0 = str2;
        }
    }

    @Inject
    public oo0o0Oo(@WallTime o0000Ooo o0000ooo, @Monotonic o0000Ooo o0000ooo2, OooO oooO, o00000O o00000o, @Named("PACKAGE_NAME") p629o0ooO.Oooo0<String> oooo0) {
        this.f35697Oooo0o = o00000o;
        this.f35698Oooo0oO = o0000ooo;
        this.f35699Oooo0oo = o0000ooo2;
        this.f35696Oooo = oooO;
        this.f35700OoooO00 = oooo0;
    }

    public static String OooOOoo(Iterable<OooOo00> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<OooOo00> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().OooO0O0());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @VisibleForTesting
    public static <T> T OooOo0O(Cursor cursor, OooO00o<Cursor, T> oooO00o) {
        try {
            return oooO00o.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // o0O0OOOo.OooO0OO
    public final void OooO00o() {
        OooOOo(new Oooo0(this));
    }

    @Override // p288o0O0OOo.o00Oo0
    public final <T> T OooO0O0(o0O0OOo.o00Oo0.OooO00o<T> oooO00o) {
        SQLiteDatabase sQLiteDatabaseOooO0oo = OooO0oo();
        long time = this.f35699Oooo0oo.getTime();
        while (true) {
            try {
                sQLiteDatabaseOooO0oo.beginTransaction();
                try {
                    T tOooO0O0 = oooO00o.OooO0O0();
                    sQLiteDatabaseOooO0oo.setTransactionSuccessful();
                    return tOooO0O0;
                } finally {
                    sQLiteDatabaseOooO0oo.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f35699Oooo0oo.getTime() >= ((long) this.f35696Oooo.OooO00o()) + time) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // o0O0OOOo.OooO0OO
    public final o0O0OO0O.OooO00o OooO0Oo() {
        int i = o0O0OO0O.OooO00o.f35540OooO0o0;
        final o0O0OO0O.OooO00o.C0366OooO00o c0366OooO00o = new o0O0OO0O.OooO00o.C0366OooO00o();
        final HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseOooO0oo = OooO0oo();
        sQLiteDatabaseOooO0oo.beginTransaction();
        try {
            o0O0OO0O.OooO00o oooO00o = (o0O0OO0O.OooO00o) OooOo0O(sQLiteDatabaseOooO0oo.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new OooO00o() { // from class: o0O0OOOo.o00oO0o
                /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r6
                  0x002c: PHI (r6v9 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason) = 
                  (r6v2 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r6v3 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r6v4 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r6v5 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r6v6 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r6v7 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                 binds: [B:9:0x002a, B:12:0x0034, B:15:0x003d, B:18:0x0046, B:21:0x004f, B:24:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Type inference failed for: r1v16, types: [java.util.ArrayList, java.util.List<o0O0OO0O.OooO0OO>] */
                @Override // o0O0OOOo.oo0o0Oo.OooO00o
                public final Object apply(Object obj) {
                    oo0o0Oo oo0o0oo = this.f35675OooO0Oo;
                    Map map2 = map;
                    o0O0OO0O.OooO00o.C0366OooO00o c0366OooO00o2 = c0366OooO00o;
                    Cursor cursor = (Cursor) obj;
                    Objects.requireNonNull(oo0o0oo);
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        int i2 = cursor.getInt(1);
                        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
                        if (i2 != reason.getNumber()) {
                            LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                            if (i2 == reason2.getNumber()) {
                                reason = reason2;
                            } else {
                                reason2 = LogEventDropped.Reason.CACHE_FULL;
                                if (i2 == reason2.getNumber()) {
                                    reason = reason2;
                                } else {
                                    reason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                                    if (i2 == reason2.getNumber()) {
                                        reason = reason2;
                                    } else {
                                        reason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                                        if (i2 == reason2.getNumber()) {
                                            reason = reason2;
                                        } else {
                                            reason2 = LogEventDropped.Reason.INVALID_PAYLOD;
                                            if (i2 == reason2.getNumber()) {
                                                reason = reason2;
                                            } else {
                                                reason2 = LogEventDropped.Reason.SERVER_ERROR;
                                                if (i2 == reason2.getNumber()) {
                                                    reason = reason2;
                                                } else {
                                                    o0O0OO.OooO00o.OooO00o("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i2));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        long j = cursor.getLong(2);
                        if (!map2.containsKey(string)) {
                            map2.put(string, new ArrayList());
                        }
                        ((List) map2.get(string)).add(new LogEventDropped(j, reason));
                    }
                    for (Map.Entry entry : map2.entrySet()) {
                        int i3 = o0O0OO0O.OooO0OO.f35550OooO0OO;
                        new ArrayList();
                        c0366OooO00o2.f35546OooO0O0.add(new o0O0OO0O.OooO0OO((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                    }
                    final long time = oo0o0oo.f35698Oooo0oO.getTime();
                    SQLiteDatabase sQLiteDatabaseOooO0oo2 = oo0o0oo.OooO0oo();
                    sQLiteDatabaseOooO0oo2.beginTransaction();
                    try {
                        o0O0OO0O.OooO oooO = (o0O0OO0O.OooO) oo0o0Oo.OooOo0O(sQLiteDatabaseOooO0oo2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new oo0o0Oo.OooO00o() { // from class: o0O0OOOo.OooOo
                            @Override // o0O0OOOo.oo0o0Oo.OooO00o
                            public final Object apply(Object obj2) {
                                long j2 = time;
                                Cursor cursor2 = (Cursor) obj2;
                                cursor2.moveToNext();
                                return new o0O0OO0O.OooO(cursor2.getLong(0), j2);
                            }
                        });
                        sQLiteDatabaseOooO0oo2.setTransactionSuccessful();
                        sQLiteDatabaseOooO0oo2.endTransaction();
                        c0366OooO00o2.f35545OooO00o = oooO;
                        c0366OooO00o2.f35547OooO0OO = new o0O0OO0O.OooO0O0(new o0O0OO0O.OooO0o(oo0o0oo.OooO0oo().compileStatement("PRAGMA page_size").simpleQueryForLong() * oo0o0oo.OooO0oo().compileStatement("PRAGMA page_count").simpleQueryForLong(), OooO.f35633OooO00o.f35634OooO0O0));
                        c0366OooO00o2.f35548OooO0Oo = oo0o0oo.f35700OoooO00.get();
                        return new o0O0OO0O.OooO00o(c0366OooO00o2.f35545OooO00o, Collections.unmodifiableList(c0366OooO00o2.f35546OooO0O0), c0366OooO00o2.f35547OooO0OO, c0366OooO00o2.f35548OooO0Oo);
                    } catch (Throwable th) {
                        sQLiteDatabaseOooO0oo2.endTransaction();
                        throw th;
                    }
                }
            });
            sQLiteDatabaseOooO0oo.setTransactionSuccessful();
            return oooO00o;
        } finally {
            sQLiteDatabaseOooO0oo.endTransaction();
        }
    }

    @Override // o0O0OOOo.OooO0OO
    public final void OooO0o(final long j, final LogEventDropped.Reason reason, final String str) {
        OooOOo(new OooO00o() { // from class: o0O0OOOo.o00Oo0
            @Override // o0O0OOOo.oo0o0Oo.OooO00o
            public final Object apply(Object obj) {
                String str2 = str;
                LogEventDropped.Reason reason2 = reason;
                long j2 = j;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (((Boolean) oo0o0Oo.OooOo0O(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.getNumber())}), com.facebook.appevents.internal.OooO00o.f12748OooO0o0)).booleanValue()) {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.getNumber())});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(reason2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j2));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    @VisibleForTesting
    public final SQLiteDatabase OooO0oo() {
        o00000O o00000o = this.f35697Oooo0o;
        Objects.requireNonNull(o00000o);
        long time = this.f35699Oooo0oo.getTime();
        while (true) {
            try {
                return o00000o.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f35699Oooo0oo.getTime() >= ((long) this.f35696Oooo.OooO00o()) + time) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // o0O0OOOo.OooO0o
    public final int OooOO0o() {
        final long time = this.f35698Oooo0oO.getTime() - this.f35696Oooo.OooO0O0();
        return ((Integer) OooOOo(new OooO00o() { // from class: o0O0OOOo.o00Ooo
            @Override // o0O0OOOo.oo0o0Oo.OooO00o
            public final Object apply(Object obj) {
                oo0o0Oo oo0o0oo = this.f35673OooO0Oo;
                long j = time;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Objects.requireNonNull(oo0o0oo);
                String[] strArr = {String.valueOf(j)};
                oo0o0Oo.OooOo0O(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new Oooo000(oo0o0oo));
                return Integer.valueOf(sQLiteDatabase.delete(d.ar, "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    @Nullable
    public final Long OooOOO(SQLiteDatabase sQLiteDatabase, p286o0O0O0oO.o0OO00O o0oo00o2) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(o0oo00o2.OooO0O0(), String.valueOf(o000OO.OooO00o(o0oo00o2.OooO0Oo()))));
        if (o0oo00o2.OooO0OO() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(o0oo00o2.OooO0OO(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{ao.d}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    @Override // o0O0OOOo.OooO0o
    public final void OooOOOO(Iterable<OooOo00> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DELETE FROM events WHERE _id in ");
            sbOooO0o0.append(OooOOoo(iterable));
            OooO0oo().compileStatement(sbOooO0o0.toString()).execute();
        }
    }

    @VisibleForTesting
    public final <T> T OooOOo(OooO00o<SQLiteDatabase, T> oooO00o) {
        SQLiteDatabase sQLiteDatabaseOooO0oo = OooO0oo();
        sQLiteDatabaseOooO0oo.beginTransaction();
        try {
            T tApply = oooO00o.apply(sQLiteDatabaseOooO0oo);
            sQLiteDatabaseOooO0oo.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseOooO0oo.endTransaction();
        }
    }

    @Override // o0O0OOOo.OooO0o
    public final boolean OooOOo0(final p286o0O0O0oO.o0OO00O o0oo00o2) {
        return ((Boolean) OooOOo(new OooO00o() { // from class: o0O0OOOo.o0OOO0o
            @Override // o0O0OOOo.oo0o0Oo.OooO00o
            public final Object apply(Object obj) {
                oo0o0Oo oo0o0oo = this.f35684OooO0Oo;
                Long lOooOOO = oo0o0oo.OooOOO((SQLiteDatabase) obj, o0oo00o2);
                return lOooOOO == null ? Boolean.FALSE : (Boolean) oo0o0Oo.OooOo0O(oo0o0oo.OooO0oo().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lOooOOO.toString()}), new oo0o0Oo.OooO00o() { // from class: o0O0OOOo.o0Oo0oo
                    @Override // o0O0OOOo.oo0o0Oo.OooO00o
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(((Cursor) obj2).moveToNext());
                    }
                });
            }
        })).booleanValue();
    }

    @Override // o0O0OOOo.OooO0o
    public final Iterable<p286o0O0O0oO.o0OO00O> Oooo0o0() {
        SQLiteDatabase sQLiteDatabaseOooO0oo = OooO0oo();
        sQLiteDatabaseOooO0oo.beginTransaction();
        try {
            List list = (List) OooOo0O(sQLiteDatabaseOooO0oo.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), o0OO00O.f35683OooO0Oo);
            sQLiteDatabaseOooO0oo.setTransactionSuccessful();
            return list;
        } finally {
            sQLiteDatabaseOooO0oo.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35697Oooo0o.close();
    }

    @Override // o0O0OOOo.OooO0o
    public final void o00000Oo(final p286o0O0O0oO.o0OO00O o0oo00o2, final long j) {
        OooOOo(new OooO00o() { // from class: o0O0OOOo.o00O0O
            @Override // o0O0OOOo.oo0o0Oo.OooO00o
            public final Object apply(Object obj) {
                long j2 = j;
                p286o0O0O0oO.o0OO00O o0oo00o3 = o0oo00o2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j2));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{o0oo00o3.OooO0O0(), String.valueOf(o000OO.OooO00o(o0oo00o3.OooO0Oo()))}) < 1) {
                    contentValues.put("backend_name", o0oo00o3.OooO0O0());
                    contentValues.put("priority", Integer.valueOf(o000OO.OooO00o(o0oo00o3.OooO0Oo())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // o0O0OOOo.OooO0o
    public final void o00000o0(Iterable<OooOo00> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            sbOooO0o0.append(OooOOoo(iterable));
            String string = sbOooO0o0.toString();
            SQLiteDatabase sQLiteDatabaseOooO0oo = OooO0oo();
            sQLiteDatabaseOooO0oo.beginTransaction();
            try {
                sQLiteDatabaseOooO0oo.compileStatement(string).execute();
                Cursor cursorRawQuery = sQLiteDatabaseOooO0oo.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Objects.requireNonNull(this);
                    while (cursorRawQuery.moveToNext()) {
                        OooO0o(cursorRawQuery.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    }
                    cursorRawQuery.close();
                    sQLiteDatabaseOooO0oo.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseOooO0oo.setTransactionSuccessful();
                    sQLiteDatabaseOooO0oo.endTransaction();
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                sQLiteDatabaseOooO0oo.endTransaction();
                throw th2;
            }
        }
    }

    @Override // o0O0OOOo.OooO0o
    public final Iterable<OooOo00> o00O0O(p286o0O0O0oO.o0OO00O o0oo00o2) {
        return (Iterable) OooOOo(new oo00o(this, o0oo00o2));
    }

    @Override // o0O0OOOo.OooO0o
    public final long o00o0O(p286o0O0O0oO.o0OO00O o0oo00o2) {
        Cursor cursorRawQuery = OooO0oo().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{o0oo00o2.OooO0O0(), String.valueOf(o000OO.OooO00o(o0oo00o2.OooO0Oo()))});
        try {
            return (cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L).longValue();
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // o0O0OOOo.OooO0o
    @Nullable
    public final OooOo00 o0OOO0o(final p286o0O0O0oO.o0OO00O o0oo00o2, final p286o0O0O0oO.oo000o oo000oVar) {
        o0O0OO.OooO00o.OooO0O0("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", o0oo00o2.OooO0Oo(), oo000oVar.OooO0oo(), o0oo00o2.OooO0O0());
        long jLongValue = ((Long) OooOOo(new OooO00o() { // from class: o0O0OOOo.o0ooOOo
            @Override // o0O0OOOo.oo0o0Oo.OooO00o
            public final Object apply(Object obj) {
                long jInsert;
                oo0o0Oo oo0o0oo = this.f35689OooO0Oo;
                p286o0O0O0oO.oo000o oo000oVar2 = oo000oVar;
                p286o0O0O0oO.o0OO00O o0oo00o3 = o0oo00o2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (oo0o0oo.OooO0oo().compileStatement("PRAGMA page_size").simpleQueryForLong() * oo0o0oo.OooO0oo().compileStatement("PRAGMA page_count").simpleQueryForLong() >= oo0o0oo.f35696Oooo.OooO0o0()) {
                    oo0o0oo.OooO0o(1L, LogEventDropped.Reason.CACHE_FULL, oo000oVar2.OooO0oo());
                    return -1L;
                }
                Long lOooOOO = oo0o0oo.OooOOO(sQLiteDatabase, o0oo00o3);
                if (lOooOOO != null) {
                    jInsert = lOooOOO.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", o0oo00o3.OooO0O0());
                    contentValues.put("priority", Integer.valueOf(o000OO.OooO00o(o0oo00o3.OooO0Oo())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (o0oo00o3.OooO0OO() != null) {
                        contentValues.put(AppLinks.KEY_NAME_EXTRAS, Base64.encodeToString(o0oo00o3.OooO0OO(), 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iOooO0Oo = oo0o0oo.f35696Oooo.OooO0Oo();
                byte[] bArr = oo000oVar2.OooO0o0().f35496OooO0O0;
                boolean z = bArr.length <= iOooO0Oo;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", oo000oVar2.OooO0oo());
                contentValues2.put("timestamp_ms", Long.valueOf(oo000oVar2.OooO0o()));
                contentValues2.put("uptime_ms", Long.valueOf(oo000oVar2.OooO()));
                contentValues2.put("payload_encoding", oo000oVar2.OooO0o0().f35495OooO00o.f35382OooO00o);
                contentValues2.put("code", oo000oVar2.OooO0Oo());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert(d.ar, null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr.length) / ((double) iOooO0Oo));
                    for (int i = 1; i <= iCeil; i++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (i - 1) * iOooO0Oo, Math.min(i * iOooO0Oo, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(oo000oVar2.OooO0OO()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new o0O0OOOo.OooO0O0(jLongValue, o0oo00o2, oo000oVar);
    }
}

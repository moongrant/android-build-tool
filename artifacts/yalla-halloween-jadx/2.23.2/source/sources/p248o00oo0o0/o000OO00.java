package p248o00oo0o0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.core.impl.o00OOO0O;
import androidx.compose.animation.OooO00o;
import androidx.media3.session.o000Oo0;
import com.facebook.bolts.AppLinks;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import o000O00O.o00000;
import o000O00O.o000O000;
import o000O00O.o0OO00O;
import o000O00O.oo0o0Oo;
import p233o00oOoOO.o0OoOoOo;
import p238o00oOooo.o0O0OOOo;
import p238o00oOooo.o0O0oo00;
import p238o00oOooo.o0OO00OO;
import p244o00oo0O0.o00000OO;
import p245o00oo0OO.o000000O;
import p245o00oo0OO.o00000O;
import p247o00oo0o.o000O00;
import p249o00oo0oO.o000O0Oo;
import p629o0ooO00O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
@WorkerThread
public final class o000OO00 implements o0000oo, o000O00, o0000O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final o0OoOoOo f40194OooO = new o0OoOoOo("proto");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O000o f40195OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O0Oo f40196OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O0Oo f40197OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0000O0 f40198OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000O0<String> f40199OooO0oo;

    public interface OooO00o<T, U> {
        U apply(T t);
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f40200OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f40201OooO0O0;

        public OooO0O0(String str, String str2) {
            this.f40200OooO00o = str;
            this.f40201OooO0O0 = str2;
        }
    }

    @Inject
    public o000OO00(@WallTime o000O0Oo o000o0oo2, @Monotonic o000O0Oo o000o0oo3, o0000O0 o0000o1, o00O000o o00o000o2, @Named("PACKAGE_NAME") o00000O0<String> o00000o1) {
        this.f40195OooO0Oo = o00o000o2;
        this.f40197OooO0o0 = o000o0oo2;
        this.f40196OooO0o = o000o0oo3;
        this.f40198OooO0oO = o0000o1;
        this.f40199OooO0oo = o00000o1;
    }

    @Nullable
    public static Long OooOo0(SQLiteDatabase sQLiteDatabase, o0OO00OO o0oo00oo2) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(o0oo00oo2.OooO0O0(), String.valueOf(o0O0o.OooO00o.OooO00o(o0oo00oo2.OooO0Oo()))));
        if (o0oo00oo2.OooO0OO() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(o0oo00oo2.OooO0OO(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) Oooo0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new o00000());
    }

    @VisibleForTesting
    public static <T> T Oooo0(Cursor cursor, OooO00o<Cursor, T> oooO00o) {
        try {
            return oooO00o.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static String Oooo00o(Iterable<o000O000> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<o000O000> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().OooO0O0());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // p248o00oo0o0.o0000oo
    public final int OooO() {
        final long time = this.f40197OooO0o0.getTime() - this.f40198OooO0oO.OooO0O0();
        return ((Integer) OooOo(new OooO00o() { // from class: o00oo0o0.o000O00
            @Override // o00oo0o0.o000OO00.OooO00o
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                o000OO00 o000oo01 = this.f40184OooO0Oo;
                o000oo01.getClass();
                String[] strArr = {String.valueOf(time)};
                o000OO00.Oooo0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new o0OO00O(o000oo01, 2));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    @Override // p248o00oo0o0.o0000O00
    public final void OooO00o() {
        OooOo(new o000O000(this, 2));
    }

    @Override // p247o00oo0o.o000O00
    public final <T> T OooO0OO(o000O00.OooO00o<T> oooO00o) {
        SQLiteDatabase sQLiteDatabaseOooOo00 = OooOo00();
        o000O0Oo o000o0oo2 = this.f40196OooO0o;
        long time = o000o0oo2.getTime();
        while (true) {
            try {
                sQLiteDatabaseOooOo00.beginTransaction();
                try {
                    T tOooO0OO = oooO00o.OooO0OO();
                    sQLiteDatabaseOooOo00.setTransactionSuccessful();
                    return tOooO0OO;
                } finally {
                    sQLiteDatabaseOooOo00.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (o000o0oo2.getTime() >= ((long) this.f40198OooO0oO.OooO00o()) + time) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // p248o00oo0o0.o0000O00
    public final o000000O OooO0oO() {
        int i = o000000O.f40099OooO0o0;
        final o000000O.OooO00o oooO00o = new o000000O.OooO00o();
        final HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseOooOo00 = OooOo00();
        sQLiteDatabaseOooOo00.beginTransaction();
        try {
            o000000O o000000o2 = (o000000O) Oooo0(sQLiteDatabaseOooOo00.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new OooO00o() { // from class: o00oo0o0.o000O
                /* JADX WARN: Code duplicated, block: B:10:0x002a A[PHI: r5
                  0x002a: PHI (r5v10 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason) = 
                  (r5v3 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r5v4 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r5v5 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r5v6 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r5v7 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                  (r5v8 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
                 binds: [B:9:0x0028, B:12:0x0032, B:15:0x003b, B:18:0x0044, B:21:0x004d, B:24:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // o00oo0o0.o000OO00.OooO00o
                public final Object apply(Object obj) {
                    Map map2;
                    Cursor cursor = (Cursor) obj;
                    o000OO00 o000oo01 = this.f40178OooO0Oo;
                    o000oo01.getClass();
                    while (true) {
                        boolean zMoveToNext = cursor.moveToNext();
                        map2 = map;
                        if (!zMoveToNext) {
                            break;
                        }
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
                                                    o00000OO.OooO00o(Integer.valueOf(i2), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
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
                    Iterator it = map2.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        o000000O.OooO00o oooO00o2 = oooO00o;
                        if (!zHasNext) {
                            final long time = o000oo01.f40197OooO0o0.getTime();
                            SQLiteDatabase sQLiteDatabaseOooOo01 = o000oo01.OooOo00();
                            sQLiteDatabaseOooOo01.beginTransaction();
                            try {
                                p245o00oo0OO.o00000OO o00000oo2 = (p245o00oo0OO.o00000OO) o000OO00.Oooo0(sQLiteDatabaseOooOo01.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new o000OO00.OooO00o() { // from class: o00oo0o0.o000Oo0
                                    @Override // o00oo0o0.o000OO00.OooO00o
                                    public final Object apply(Object obj2) {
                                        Cursor cursor2 = (Cursor) obj2;
                                        cursor2.moveToNext();
                                        return new p245o00oo0OO.o00000OO(cursor2.getLong(0), time);
                                    }
                                });
                                sQLiteDatabaseOooOo01.setTransactionSuccessful();
                                sQLiteDatabaseOooOo01.endTransaction();
                                oooO00o2.f40104OooO00o = o00000oo2;
                                oooO00o2.f40106OooO0OO = new p245o00oo0OO.o00000(new o00000O(o000oo01.OooOo00().compileStatement("PRAGMA page_size").simpleQueryForLong() * o000oo01.OooOo00().compileStatement("PRAGMA page_count").simpleQueryForLong(), o0000O0.f40171OooO00o.f40173OooO0O0));
                                oooO00o2.f40107OooO0Oo = o000oo01.f40199OooO0oo.get();
                                return new o000000O(oooO00o2.f40104OooO00o, Collections.unmodifiableList(oooO00o2.f40105OooO0O0), oooO00o2.f40106OooO0OO, oooO00o2.f40107OooO0Oo);
                            } catch (Throwable th) {
                                sQLiteDatabaseOooOo01.endTransaction();
                                throw th;
                            }
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        int i3 = p245o00oo0OO.o00000O0.f40110OooO0OO;
                        new ArrayList();
                        oooO00o2.f40105OooO0O0.add(new p245o00oo0OO.o00000O0((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                    }
                }
            });
            sQLiteDatabaseOooOo00.setTransactionSuccessful();
            return o000000o2;
        } finally {
            sQLiteDatabaseOooOo00.endTransaction();
        }
    }

    @Override // p248o00oo0o0.o0000oo
    public final void OooOO0(Iterable<o000O000> iterable) {
        if (iterable.iterator().hasNext()) {
            OooOo00().compileStatement("DELETE FROM events WHERE _id in " + Oooo00o(iterable)).execute();
        }
    }

    @Override // p248o00oo0o0.o0000oo
    public final boolean OooOO0o(final o0OO00OO o0oo00oo2) {
        return ((Boolean) OooOo(new OooO00o() { // from class: o00oo0o0.o000O00O
            @Override // o00oo0o0.o000OO00.OooO00o
            public final Object apply(Object obj) {
                o000OO00 o000oo01 = this.f40186OooO0Oo;
                o000oo01.getClass();
                Long lOooOo0 = o000OO00.OooOo0((SQLiteDatabase) obj, o0oo00oo2);
                if (lOooOo0 == null) {
                    return Boolean.FALSE;
                }
                Cursor cursorRawQuery = o000oo01.OooOo00().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lOooOo0.toString()});
                try {
                    return Boolean.valueOf(cursorRawQuery.moveToNext());
                } finally {
                    cursorRawQuery.close();
                }
            }
        })).booleanValue();
    }

    @Override // p248o00oo0o0.o0000O00
    public final void OooOOo(final long j, final LogEventDropped.Reason reason, final String str) {
        OooOo(new OooO00o() { // from class: o00oo0o0.o000O0Oo
            @Override // o00oo0o0.o000OO00.OooO00o
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                LogEventDropped.Reason reason2 = reason;
                String string = Integer.toString(reason2.getNumber());
                String str2 = str;
                boolean zBooleanValue = ((Boolean) o000OO00.Oooo0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string}), new OooO00o())).booleanValue();
                long j2 = j;
                if (zBooleanValue) {
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
    public final <T> T OooOo(OooO00o<SQLiteDatabase, T> oooO00o) {
        SQLiteDatabase sQLiteDatabaseOooOo00 = OooOo00();
        sQLiteDatabaseOooOo00.beginTransaction();
        try {
            T tApply = oooO00o.apply(sQLiteDatabaseOooOo00);
            sQLiteDatabaseOooOo00.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseOooOo00.endTransaction();
        }
    }

    @VisibleForTesting
    public final SQLiteDatabase OooOo00() {
        o00O000o o00o000o2 = this.f40195OooO0Oo;
        Objects.requireNonNull(o00o000o2);
        o000O0Oo o000o0oo2 = this.f40196OooO0o;
        long time = o000o0oo2.getTime();
        while (true) {
            try {
                return o00o000o2.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (o000o0oo2.getTime() >= ((long) this.f40198OooO0oO.OooO00o()) + time) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // p248o00oo0o0.o0000oo
    public final List OooOo0O() {
        SQLiteDatabase sQLiteDatabaseOooOo00 = OooOo00();
        sQLiteDatabaseOooOo00.beginTransaction();
        try {
            List list = (List) Oooo0(sQLiteDatabaseOooOo00.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new o00OOO0O());
            sQLiteDatabaseOooOo00.setTransactionSuccessful();
            return list;
        } finally {
            sQLiteDatabaseOooOo00.endTransaction();
        }
    }

    @Override // p248o00oo0o0.o0000oo
    public final long OooOoOO(o0OO00OO o0oo00oo2) {
        Cursor cursorRawQuery = OooOo00().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{o0oo00oo2.OooO0O0(), String.valueOf(o0O0o.OooO00o.OooO00o(o0oo00oo2.OooO0Oo()))});
        try {
            return (cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L).longValue();
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // p248o00oo0o0.o0000oo
    public final void OooOoo0(final long j, final o0OO00OO o0oo00oo2) {
        OooOo(new OooO00o() { // from class: o00oo0o0.o000OO0O
            @Override // o00oo0o0.o000OO00.OooO00o
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                o0OO00OO o0oo00oo3 = o0oo00oo2;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{o0oo00oo3.OooO0O0(), String.valueOf(o0O0o.OooO00o.OooO00o(o0oo00oo3.OooO0Oo()))}) < 1) {
                    contentValues.put("backend_name", o0oo00oo3.OooO0O0());
                    contentValues.put("priority", Integer.valueOf(o0O0o.OooO00o.OooO00o(o0oo00oo3.OooO0Oo())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    public final ArrayList OooOooo(SQLiteDatabase sQLiteDatabase, o0OO00OO o0oo00oo2, int i) {
        ArrayList arrayList = new ArrayList();
        Long lOooOo0 = OooOo0(sQLiteDatabase, o0oo00oo2);
        if (lOooOo0 == null) {
            return arrayList;
        }
        Oooo0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lOooOo0.toString()}, null, null, null, String.valueOf(i)), new o000Oo0(this, arrayList, o0oo00oo2));
        return arrayList;
    }

    @Override // p248o00oo0o0.o0000oo
    public final void OoooOOo(Iterable<o000O000> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + Oooo00o(iterable);
            SQLiteDatabase sQLiteDatabaseOooOo00 = OooOo00();
            sQLiteDatabaseOooOo00.beginTransaction();
            try {
                sQLiteDatabaseOooOo00.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseOooOo00.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        OooOOo(cursorRawQuery.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseOooOo00.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseOooOo00.setTransactionSuccessful();
                sQLiteDatabaseOooOo00.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseOooOo00.endTransaction();
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40195OooO0Oo.close();
    }

    @Override // p248o00oo0o0.o0000oo
    public final Iterable<o000O000> o00000O0(final o0OO00OO o0oo00oo2) {
        return (Iterable) OooOo(new OooO00o() { // from class: o00oo0o0.o000O0O0
            @Override // o00oo0o0.o000OO00.OooO00o
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                o000OO00 o000oo01 = this.f40188OooO0Oo;
                o0000O0 o0000o1 = o000oo01.f40198OooO0oO;
                int iOooO0OO = o0000o1.OooO0OO();
                o0OO00OO o0oo00oo3 = o0oo00oo2;
                ArrayList arrayListOooOooo = o000oo01.OooOooo(sQLiteDatabase, o0oo00oo3, iOooO0OO);
                for (Priority priority : Priority.values()) {
                    if (priority != o0oo00oo3.OooO0Oo()) {
                        int iOooO0OO2 = o0000o1.OooO0OO() - arrayListOooOooo.size();
                        if (iOooO0OO2 <= 0) {
                            break;
                        }
                        arrayListOooOooo.addAll(o000oo01.OooOooo(sQLiteDatabase, o0oo00oo3.OooO0o0(priority), iOooO0OO2));
                    }
                }
                HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i = 0; i < arrayListOooOooo.size(); i++) {
                    sb.append(((o000O000) arrayListOooOooo.get(i)).OooO0O0());
                    if (i < arrayListOooOooo.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                o000OO00.Oooo0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new oo0o0Oo(map));
                ListIterator listIterator = arrayListOooOooo.listIterator();
                while (listIterator.hasNext()) {
                    o000O000 o000o001 = (o000O000) listIterator.next();
                    if (map.containsKey(Long.valueOf(o000o001.OooO0O0()))) {
                        o0O0OOOo.OooO00o oooO00oOooO = o000o001.OooO00o().OooO();
                        for (o000OO00.OooO0O0 oooO0O0 : (Set) map.get(Long.valueOf(o000o001.OooO0O0()))) {
                            oooO00oOooO.OooO00o(oooO0O0.f40200OooO00o, oooO0O0.f40201OooO0O0);
                        }
                        listIterator.set(new o0000(o000o001.OooO0O0(), o000o001.OooO0OO(), oooO00oOooO.OooO0O0()));
                    }
                }
                return arrayListOooOooo;
            }
        });
    }

    @Override // p248o00oo0o0.o0000oo
    @Nullable
    public final o0000 o0ooOOo(final o0OO00OO o0oo00oo2, final o0O0oo00 o0o0oo00) {
        Object[] objArr = {o0oo00oo2.OooO0Oo(), o0o0oo00.OooO0oO(), o0oo00oo2.OooO0O0()};
        String strOooO0OO = o00000OO.OooO0OO("SQLiteEventStore");
        if (Log.isLoggable(strOooO0OO, 3)) {
            Log.d(strOooO0OO, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        long jLongValue = ((Long) OooOo(new OooO00o() { // from class: o00oo0o0.o000O0
            @Override // o00oo0o0.o000OO00.OooO00o
            public final Object apply(Object obj) {
                long jInsert;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                o000OO00 o000oo01 = this.f40181OooO0Oo;
                long jSimpleQueryForLong = o000oo01.OooOo00().compileStatement("PRAGMA page_size").simpleQueryForLong() * o000oo01.OooOo00().compileStatement("PRAGMA page_count").simpleQueryForLong();
                o0000O0 o0000o1 = o000oo01.f40198OooO0oO;
                boolean z = jSimpleQueryForLong >= o0000o1.OooO0o0();
                o0O0oo00 o0o0oo01 = o0o0oo00;
                if (z) {
                    o000oo01.OooOOo(1L, LogEventDropped.Reason.CACHE_FULL, o0o0oo01.OooO0oO());
                    return -1L;
                }
                o0OO00OO o0oo00oo3 = o0oo00oo2;
                Long lOooOo0 = o000OO00.OooOo0(sQLiteDatabase, o0oo00oo3);
                if (lOooOo0 != null) {
                    jInsert = lOooOo0.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", o0oo00oo3.OooO0O0());
                    contentValues.put("priority", Integer.valueOf(o0O0o.OooO00o.OooO00o(o0oo00oo3.OooO0Oo())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (o0oo00oo3.OooO0OO() != null) {
                        contentValues.put(AppLinks.KEY_NAME_EXTRAS, Base64.encodeToString(o0oo00oo3.OooO0OO(), 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iOooO0Oo = o0000o1.OooO0Oo();
                byte[] bArr = o0o0oo01.OooO0Oo().f40043OooO0O0;
                boolean z2 = bArr.length <= iOooO0Oo;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", o0o0oo01.OooO0oO());
                contentValues2.put("timestamp_ms", Long.valueOf(o0o0oo01.OooO0o0()));
                contentValues2.put("uptime_ms", Long.valueOf(o0o0oo01.OooO0oo()));
                contentValues2.put("payload_encoding", o0o0oo01.OooO0Oo().f40042OooO00o.f39905OooO00o);
                contentValues2.put("code", o0o0oo01.OooO0OO());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                contentValues2.put("payload", z2 ? bArr : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
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
                for (Map.Entry entry : Collections.unmodifiableMap(o0o0oo01.OooO0O0()).entrySet()) {
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
        return new o0000(jLongValue, o0oo00oo2, o0o0oo00);
    }
}

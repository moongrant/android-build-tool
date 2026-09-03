package p198o00o0OoO;

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
import p176o00o0.OooOo;
import p191o00o0O0O.o00Oo0;
import p191o00o0O0O.o0Oo0oo;
import p194o00o0OOO.o000O00;
import p195o00o0OOo.o000O0O0;
import p199o00o0Ooo.o00OOOO0;
import p201o00o0o00.OooOOO0;
import p202o00o0o0O.o00000O0;
import p437o0OoOo0.OooOOO;
import p437o0OoOo0.Oooo0;
import p625o0ooO000.o000;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
@WorkerThread
public final class o00OO00O implements o00, o00OOOO0, o000OOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooOo f39091OooO = new OooOo("proto");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OOO0O f39092OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOOO0 f39093OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO0 f39094OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00O0000 f39095OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000<String> f39096OooO0oo;

    public interface OooO00o<T, U> {
        U apply(T t);
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f39097OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f39098OooO0O0;

        public OooO0O0(String str, String str2) {
            this.f39097OooO00o = str;
            this.f39098OooO0O0 = str2;
        }
    }

    @Inject
    public o00OO00O(@WallTime OooOOO0 oooOOO0, @Monotonic OooOOO0 oooOOO1, o00O0000 o00o0001, o00OOO0O o00ooo0o, @Named("PACKAGE_NAME") o000<String> o000Var) {
        this.f39092OooO0Oo = o00ooo0o;
        this.f39094OooO0o0 = oooOOO0;
        this.f39093OooO0o = oooOOO1;
        this.f39095OooO0oO = o00o0001;
        this.f39096OooO0oo = o000Var;
    }

    @Nullable
    public static Long OooOo00(SQLiteDatabase sQLiteDatabase, o0Oo0oo o0oo0oo2) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(o0oo0oo2.OooO0O0(), String.valueOf(o00000O0.OooO00o(o0oo0oo2.OooO0Oo()))));
        if (o0oo0oo2.OooO0OO() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(o0oo0oo2.OooO0OO(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) Oooo00o(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new o00O0());
    }

    public static String OooOooO(Iterable<o00O00O> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<o00O00O> it = iterable.iterator();
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
    public static <T> T Oooo00o(Cursor cursor, OooO00o<Cursor, T> oooO00o) {
        try {
            return oooO00o.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // p198o00o0OoO.o00
    public final boolean OooO(o0Oo0oo o0oo0oo2) {
        return ((Boolean) OooOo0(new oo0o0O0(this, o0oo0oo2))).booleanValue();
    }

    @Override // p198o00o0OoO.o000OOo0
    public final void OooO00o() {
        OooOo0(new o00O(this));
    }

    @Override // p199o00o0Ooo.o00OOOO0
    public final <T> T OooO0OO(o00OOOO0.OooO00o<T> oooO00o) {
        SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
        OooOOO0 oooOOO0 = this.f39093OooO0o;
        long time = oooOOO0.getTime();
        while (true) {
            try {
                sQLiteDatabaseOooOOo.beginTransaction();
                try {
                    T tOooO0OO = oooO00o.OooO0OO();
                    sQLiteDatabaseOooOOo.setTransactionSuccessful();
                    return tOooO0OO;
                } finally {
                    sQLiteDatabaseOooOOo.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (oooOOO0.getTime() >= ((long) this.f39095OooO0oO.OooO00o()) + time) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // p198o00o0OoO.o000OOo0
    public final o000O00 OooO0oO() {
        int i = o000O00.f38974OooO0o0;
        o000O00.OooO00o oooO00o = new o000O00.OooO00o();
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
        sQLiteDatabaseOooOOo.beginTransaction();
        try {
            o000O00 o000o01 = (o000O00) Oooo00o(sQLiteDatabaseOooOOo.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new Oooo0(this, map, oooO00o));
            sQLiteDatabaseOooOOo.setTransactionSuccessful();
            return o000o01;
        } finally {
            sQLiteDatabaseOooOOo.endTransaction();
        }
    }

    @Override // p198o00o0OoO.o00
    public final int OooOO0() {
        final long time = this.f39094OooO0o0.getTime() - this.f39095OooO0oO.OooO0O0();
        return ((Integer) OooOo0(new OooO00o() { // from class: o00o0OoO.o00O0O0O
            @Override // o00o0OoO.o00OO00O.OooO00o
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                o00OO00O o00oo00o = this.f39081OooO0Oo;
                o00oo00o.getClass();
                String[] strArr = {String.valueOf(time)};
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        o00oo00o.OooOOo0(cursorRawQuery.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    @Override // p198o00o0OoO.o00
    public final void OooOO0O(Iterable<o00O00O> iterable) {
        if (iterable.iterator().hasNext()) {
            OooOOo().compileStatement("DELETE FROM events WHERE _id in " + OooOooO(iterable)).execute();
        }
    }

    @VisibleForTesting
    public final SQLiteDatabase OooOOo() {
        o00OOO0O o00ooo0o = this.f39092OooO0Oo;
        Objects.requireNonNull(o00ooo0o);
        OooOOO0 oooOOO0 = this.f39093OooO0o;
        long time = oooOOO0.getTime();
        while (true) {
            try {
                return o00ooo0o.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (oooOOO0.getTime() >= ((long) this.f39095OooO0oO.OooO00o()) + time) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // p198o00o0OoO.o000OOo0
    public final void OooOOo0(final long j, final LogEventDropped.Reason reason, final String str) {
        OooOo0(new OooO00o() { // from class: o00o0OoO.o00O0OOO
            @Override // o00o0OoO.o00OO00O.OooO00o
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                LogEventDropped.Reason reason2 = reason;
                String string = Integer.toString(reason2.getNumber());
                String str2 = str;
                boolean zBooleanValue = ((Boolean) o00OO00O.Oooo00o(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string}), new o00O00o0())).booleanValue();
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

    public final ArrayList OooOo(SQLiteDatabase sQLiteDatabase, o0Oo0oo o0oo0oo2, int i) {
        ArrayList arrayList = new ArrayList();
        Long lOooOo00 = OooOo00(sQLiteDatabase, o0oo0oo2);
        if (lOooOo00 == null) {
            return arrayList;
        }
        Oooo00o(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lOooOo00.toString()}, null, null, null, String.valueOf(i)), new OooOOO(this, arrayList, o0oo0oo2));
        return arrayList;
    }

    @VisibleForTesting
    public final <T> T OooOo0(OooO00o<SQLiteDatabase, T> oooO00o) {
        SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
        sQLiteDatabaseOooOOo.beginTransaction();
        try {
            T tApply = oooO00o.apply(sQLiteDatabaseOooOOo);
            sQLiteDatabaseOooOOo.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseOooOOo.endTransaction();
        }
    }

    @Override // p198o00o0OoO.o00
    public final List OooOo0O() {
        SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
        sQLiteDatabaseOooOOo.beginTransaction();
        try {
            List list = (List) Oooo00o(sQLiteDatabaseOooOOo.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new o00O0OO0());
            sQLiteDatabaseOooOOo.setTransactionSuccessful();
            return list;
        } finally {
            sQLiteDatabaseOooOOo.endTransaction();
        }
    }

    @Override // p198o00o0OoO.o00
    public final void OoooO(final long j, final o0Oo0oo o0oo0oo2) {
        OooOo0(new OooO00o() { // from class: o00o0OoO.oo0oOO0
            @Override // o00o0OoO.o00OO00O.OooO00o
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                o0Oo0oo o0oo0oo3 = o0oo0oo2;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{o0oo0oo3.OooO0O0(), String.valueOf(o00000O0.OooO00o(o0oo0oo3.OooO0Oo()))}) < 1) {
                    contentValues.put("backend_name", o0oo0oo3.OooO0O0());
                    contentValues.put("priority", Integer.valueOf(o00000O0.OooO00o(o0oo0oo3.OooO0Oo())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // p198o00o0OoO.o00
    public final void OoooOOo(Iterable<o00O00O> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + OooOooO(iterable);
            SQLiteDatabase sQLiteDatabaseOooOOo = OooOOo();
            sQLiteDatabaseOooOOo.beginTransaction();
            try {
                sQLiteDatabaseOooOOo.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseOooOOo.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        OooOOo0(cursorRawQuery.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseOooOOo.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseOooOOo.setTransactionSuccessful();
                sQLiteDatabaseOooOOo.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseOooOOo.endTransaction();
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39092OooO0Oo.close();
    }

    @Override // p198o00o0OoO.o00
    public final Iterable<o00O00O> o000000o(final o0Oo0oo o0oo0oo2) {
        return (Iterable) OooOo0(new OooO00o() { // from class: o00o0OoO.o00OO000
            @Override // o00o0OoO.o00OO00O.OooO00o
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                o00OO00O o00oo00o = this.f39089OooO0Oo;
                o00O0000 o00o0001 = o00oo00o.f39095OooO0oO;
                int iOooO0OO = o00o0001.OooO0OO();
                o0Oo0oo o0oo0oo3 = o0oo0oo2;
                ArrayList arrayListOooOo = o00oo00o.OooOo(sQLiteDatabase, o0oo0oo3, iOooO0OO);
                for (Priority priority : Priority.values()) {
                    if (priority != o0oo0oo3.OooO0Oo()) {
                        int iOooO0OO2 = o00o0001.OooO0OO() - arrayListOooOo.size();
                        if (iOooO0OO2 <= 0) {
                            break;
                        }
                        arrayListOooOo.addAll(o00oo00o.OooOo(sQLiteDatabase, o0oo0oo3.OooO0o0(priority), iOooO0OO2));
                    }
                }
                HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i = 0; i < arrayListOooOo.size(); i++) {
                    sb.append(((o00O00O) arrayListOooOo.get(i)).OooO0O0());
                    if (i < arrayListOooOo.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                o00OO00O.Oooo00o(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new o00O00OO(map));
                ListIterator listIterator = arrayListOooOo.listIterator();
                while (listIterator.hasNext()) {
                    o00O00O o00o00o2 = (o00O00O) listIterator.next();
                    if (map.containsKey(Long.valueOf(o00o00o2.OooO0O0()))) {
                        o00o0O0O.OooOo.OooO00o oooO00oOooO = o00o00o2.OooO00o().OooO();
                        for (o00OO00O.OooO0O0 oooO0O0 : (Set) map.get(Long.valueOf(o00o00o2.OooO0O0()))) {
                            oooO00oOooO.OooO00o(oooO0O0.f39097OooO00o, oooO0O0.f39098OooO0O0);
                        }
                        listIterator.set(new o000OO00(o00o00o2.OooO0O0(), o00o00o2.OooO0OO(), oooO00oOooO.OooO0O0()));
                    }
                }
                return arrayListOooOo;
            }
        });
    }

    @Override // p198o00o0OoO.o00
    public final long o00000oO(o0Oo0oo o0oo0oo2) {
        Cursor cursorRawQuery = OooOOo().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{o0oo0oo2.OooO0O0(), String.valueOf(o00000O0.OooO00o(o0oo0oo2.OooO0Oo()))});
        try {
            return (cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L).longValue();
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // p198o00o0OoO.o00
    @Nullable
    public final o000OO00 o0OO00O(final o0Oo0oo o0oo0oo2, final o00Oo0 o00oo1) {
        Object[] objArr = {o0oo0oo2.OooO0Oo(), o00oo1.OooO0oO(), o0oo0oo2.OooO0O0()};
        String strOooO0OO = o000O0O0.OooO0OO("SQLiteEventStore");
        if (Log.isLoggable(strOooO0OO, 3)) {
            Log.d(strOooO0OO, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        long jLongValue = ((Long) OooOo0(new OooO00o() { // from class: o00o0OoO.o00O0OO
            @Override // o00o0OoO.o00OO00O.OooO00o
            public final Object apply(Object obj) {
                long jInsert;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                o00OO00O o00oo00o = this.f39083OooO0Oo;
                long jSimpleQueryForLong = o00oo00o.OooOOo().compileStatement("PRAGMA page_size").simpleQueryForLong() * o00oo00o.OooOOo().compileStatement("PRAGMA page_count").simpleQueryForLong();
                o00O0000 o00o0001 = o00oo00o.f39095OooO0oO;
                boolean z = jSimpleQueryForLong >= o00o0001.OooO0o0();
                o00Oo0 o00oo2 = o00oo1;
                if (z) {
                    o00oo00o.OooOOo0(1L, LogEventDropped.Reason.CACHE_FULL, o00oo2.OooO0oO());
                    return -1L;
                }
                o0Oo0oo o0oo0oo3 = o0oo0oo2;
                Long lOooOo00 = o00OO00O.OooOo00(sQLiteDatabase, o0oo0oo3);
                if (lOooOo00 != null) {
                    jInsert = lOooOo00.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", o0oo0oo3.OooO0O0());
                    contentValues.put("priority", Integer.valueOf(o00000O0.OooO00o(o0oo0oo3.OooO0Oo())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (o0oo0oo3.OooO0OO() != null) {
                        contentValues.put(AppLinks.KEY_NAME_EXTRAS, Base64.encodeToString(o0oo0oo3.OooO0OO(), 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iOooO0Oo = o00o0001.OooO0Oo();
                byte[] bArr = o00oo2.OooO0Oo().f38935OooO0O0;
                boolean z2 = bArr.length <= iOooO0Oo;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", o00oo2.OooO0oO());
                contentValues2.put("timestamp_ms", Long.valueOf(o00oo2.OooO0o0()));
                contentValues2.put("uptime_ms", Long.valueOf(o00oo2.OooO0oo()));
                contentValues2.put("payload_encoding", o00oo2.OooO0Oo().f38934OooO00o.f38564OooO00o);
                contentValues2.put("code", o00oo2.OooO0OO());
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
                for (Map.Entry entry : Collections.unmodifiableMap(o00oo2.OooO0O0()).entrySet()) {
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
        return new o000OO00(jLongValue, o0oo0oo2, o00oo1);
    }
}

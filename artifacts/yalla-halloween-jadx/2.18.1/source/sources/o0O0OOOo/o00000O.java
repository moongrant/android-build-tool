package o0O0OOOo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static int f35652Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final String f35653Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final o00000 f35654OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final o000000 f35655OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final o000OOo f35656OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final o000000O f35657OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final o00000O0 f35658OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final List<OooO00o> f35659o000oOoO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f35660Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f35661Oooo0oO;

    public interface OooO00o {
        void OooO00o(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("INSERT INTO global_log_event_state VALUES (");
        sbOooO0o0.append(System.currentTimeMillis());
        sbOooO0o0.append(")");
        f35653Oooo0oo = sbOooO0o0.toString();
        f35652Oooo = 5;
        o000OOo o000ooo2 = new OooO00o() { // from class: o0O0OOOo.o000OOo
            @Override // o0O0OOOo.o00000O.OooO00o
            public final void OooO00o(SQLiteDatabase sQLiteDatabase) {
                String str = o00000O.f35653Oooo0oo;
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
            }
        };
        f35656OoooO00 = o000ooo2;
        o000000 o000000Var = new OooO00o() { // from class: o0O0OOOo.o000000
            @Override // o0O0OOOo.o00000O.OooO00o
            public final void OooO00o(SQLiteDatabase sQLiteDatabase) {
                String str = o00000O.f35653Oooo0oo;
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
            }
        };
        f35655OoooO0 = o000000Var;
        o000000O o000000o2 = new OooO00o() { // from class: o0O0OOOo.o000000O
            @Override // o0O0OOOo.o00000O.OooO00o
            public final void OooO00o(SQLiteDatabase sQLiteDatabase) {
                String str = o00000O.f35653Oooo0oo;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f35657OoooO0O = o000000o2;
        o00000 o00000Var = new OooO00o() { // from class: o0O0OOOo.o00000
            @Override // o0O0OOOo.o00000O.OooO00o
            public final void OooO00o(SQLiteDatabase sQLiteDatabase) {
                String str = o00000O.f35653Oooo0oo;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
            }
        };
        f35654OoooO = o00000Var;
        o00000O0 o00000o1 = new OooO00o() { // from class: o0O0OOOo.o00000O0
            @Override // o0O0OOOo.o00000O.OooO00o
            public final void OooO00o(SQLiteDatabase sQLiteDatabase) {
                String str = o00000O.f35653Oooo0oo;
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                sQLiteDatabase.execSQL(o00000O.f35653Oooo0oo);
            }
        };
        f35658OoooOO0 = o00000o1;
        f35659o000oOoO = Arrays.asList(o000ooo2, o000000Var, o000000o2, o00000Var, o00000o1);
    }

    @Inject
    public o00000O(Context context, @Named("SQLITE_DB_NAME") String str, @Named("SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f35661Oooo0oO = false;
        this.f35660Oooo0o = i;
    }

    public final void OooO00o(SQLiteDatabase sQLiteDatabase) {
        if (this.f35661Oooo0oO) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    public final void OooO0O0(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<OooO00o> list = f35659o000oOoO;
        if (i2 <= list.size()) {
            while (i < i2) {
                f35659o000oOoO.get(i).OooO00o(sQLiteDatabase);
                i++;
            }
        } else {
            StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
            sbOooO0O0.append(list.size());
            sbOooO0O0.append(" migrations are provided");
            throw new IllegalArgumentException(sbOooO0O0.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f35661Oooo0oO = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.f35660Oooo0o;
        OooO00o(sQLiteDatabase);
        OooO0O0(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        OooO00o(sQLiteDatabase);
        OooO0O0(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        OooO00o(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        OooO00o(sQLiteDatabase);
        OooO0O0(sQLiteDatabase, i, i2);
    }
}

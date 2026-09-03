package p198o00o0OoO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO0O extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f39104OooO0o = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int f39105OooO0oO = 5;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final List<OooO00o> f39106OooO0oo = Arrays.asList(new o00OO0OO(), new oo0O(), new o00OO(), new o00OOO00(), new o00OOO0());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f39107OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f39108OooO0o0;

    public interface OooO00o {
        void OooO00o(SQLiteDatabase sQLiteDatabase);
    }

    @Inject
    public o00OOO0O(Context context, @Named("SQLITE_DB_NAME") String str, @Named("SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f39108OooO0o0 = false;
        this.f39107OooO0Oo = i;
    }

    public static void OooO00o(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<OooO00o> list = f39106OooO0oo;
        if (i2 <= list.size()) {
            while (i < i2) {
                list.get(i).OooO00o(sQLiteDatabase);
                i++;
            }
        } else {
            StringBuilder sbOooO00o = o00000.OooO00o("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
            sbOooO00o.append(list.size());
            sbOooO00o.append(" migrations are provided");
            throw new IllegalArgumentException(sbOooO00o.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f39108OooO0o0 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f39108OooO0o0) {
            onConfigure(sQLiteDatabase);
        }
        OooO00o(sQLiteDatabase, 0, this.f39107OooO0Oo);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f39108OooO0o0) {
            onConfigure(sQLiteDatabase);
        }
        OooO00o(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f39108OooO0o0) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.f39108OooO0o0) {
            onConfigure(sQLiteDatabase);
        }
        OooO00o(sQLiteDatabase, i, i2);
    }
}

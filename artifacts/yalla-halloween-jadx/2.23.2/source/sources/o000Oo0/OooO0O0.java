package o000Oo0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import androidx.media3.database.DatabaseIOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p083o000Ooo.o00O000;
import p083o000Ooo.o00oOoo;
import p083o000Ooo.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f34792OooO0OO = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0ooO f34793OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f34794OooO0O0;

    public OooO0O0(o00oOoo o00oooo2) {
        this.f34793OooO00o = o00oooo2;
    }

    @WorkerThread
    public final HashMap OooO00o() throws DatabaseIOException {
        try {
            this.f34794OooO0O0.getClass();
            Cursor cursorQuery = this.f34793OooO00o.getReadableDatabase().query(this.f34794OooO0O0, f34792OooO0OO, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new OooO00o(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public final void OooO0O0(long j) throws DatabaseIOException {
        o0O0ooO o0o0ooo = this.f34793OooO00o;
        try {
            String hexString = Long.toHexString(j);
            this.f34794OooO0O0 = "ExoPlayerCacheFileMetadata" + hexString;
            if (o00O000.OooO00o(o0o0ooo.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = o0o0ooo.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o00O000.OooO0O0(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f34794OooO0O0);
                    writableDatabase.execSQL("CREATE TABLE " + this.f34794OooO0O0 + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public final void OooO0OO(Set<String> set) throws DatabaseIOException {
        this.f34794OooO0O0.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f34793OooO00o.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f34794OooO0O0, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public final void OooO0Oo(long j, long j2, String str) throws DatabaseIOException {
        this.f34794OooO0O0.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f34793OooO00o.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f34794OooO0O0, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}

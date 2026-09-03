package p246o00oo0o0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.database.DatabaseIOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p204o00o0oO.o00O00O;
import p204o00o0oO.o00O00OO;
import p204o00o0oO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O00O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f40686OooO0OO = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O00O f40687OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f40688OooO0O0;

    public o000O00O(oOO00O ooo00o) {
        this.f40687OooO00o = ooo00o;
    }

    @WorkerThread
    public final HashMap OooO00o() throws DatabaseIOException {
        try {
            this.f40688OooO0O0.getClass();
            Cursor cursorQuery = this.f40687OooO00o.getReadableDatabase().query(this.f40688OooO0O0, f40686OooO0OO, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new o000O00(cursorQuery.getLong(1), cursorQuery.getLong(2)));
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
        o00O00O o00o00o2 = this.f40687OooO00o;
        try {
            String hexString = Long.toHexString(j);
            this.f40688OooO0O0 = "ExoPlayerCacheFileMetadata" + hexString;
            if (o00O00OO.OooO00o(o00o00o2.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = o00o00o2.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o00O00OO.OooO0O0(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f40688OooO0O0);
                    writableDatabase.execSQL("CREATE TABLE " + this.f40688OooO0O0 + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
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
        this.f40688OooO0O0.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f40687OooO00o.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f40688OooO0O0, "name = ?", new String[]{it.next()});
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
        this.f40688OooO0O0.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f40687OooO00o.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f40688OooO0O0, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}

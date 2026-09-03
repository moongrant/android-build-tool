package p072o000O0oO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.exoplayer.offline.Download;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.facebook.share.internal.ShareConstants;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;
import p083o000Ooo.o00O000;
import p083o000Ooo.o00oOoo;
import p083o000Ooo.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0O0O00 implements o00000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f34354OooO0Oo = OooOOO0(3, 4);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String[] f34355OooO0o0 = {"id", "mime_type", ShareConstants.MEDIA_URI, "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0ooO f34356OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f34357OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("initializationLock")
    public boolean f34358OooO0OO;

    public static final class OooO00o implements Closeable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Cursor f34359OooO0Oo;

        public OooO00o(Cursor cursor) {
            this.f34359OooO0Oo = cursor;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f34359OooO0Oo.close();
        }
    }

    public o0O0O00(o00oOoo o00oooo2) {
        this.f34356OooO00o = o00oooo2;
    }

    public static ArrayList OooO(@Nullable String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i = o00.f34910OooO00o;
        for (String str2 : str.split(",", -1)) {
            String[] strArrSplit = str2.split("\\.", -1);
            o00Oo0.OooO0Oo(strArrSplit.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
        }
        return arrayList;
    }

    public static Download OooOO0O(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        ArrayList arrayListOooO = OooO(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequest = new DownloadRequest(string, uri, string3, arrayListOooO, blob, cursor.getString(4), cursor.getBlob(5));
        o000000O o000000o2 = new o000000O();
        o000000o2.f34350OooO00o = cursor.getLong(13);
        o000000o2.f34351OooO0O0 = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new Download(downloadRequest, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, o000000o2);
    }

    public static Download OooOO0o(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else {
            str = "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
        }
        DownloadRequest downloadRequest = new DownloadRequest(string, uri, str, OooO(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5));
        o000000O o000000o2 = new o000000O();
        o000000o2.f34350OooO00o = cursor.getLong(13);
        o000000o2.f34351OooO0O0 = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new Download(downloadRequest, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, o000000o2);
    }

    public static ArrayList OooOOO(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!o00.OoooO(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", ShareConstants.WEB_DIALOG_PARAM_TITLE, ShareConstants.MEDIA_URI, "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(OooOO0o(cursorQuery));
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static String OooOOO0(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // p072o000O0oO.o00000O
    public final void OooO00o(Download download) throws DatabaseIOException {
        OooOO0();
        try {
            OooOOOO(download, this.f34356OooO00o.getWritableDatabase());
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // p072o000O0oO.o00000O
    public final void OooO0O0(String str) throws DatabaseIOException {
        OooOO0();
        try {
            this.f34356OooO00o.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str});
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // p072o000O0oO.o00000O
    public final void OooO0OO(int i) throws DatabaseIOException {
        OooOO0();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.f34356OooO00o.getWritableDatabase().update("ExoPlayerDownloads", contentValues, f34354OooO0Oo, null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // p072o000O0oO.o00000O
    public final OooO00o OooO0Oo(int... iArr) throws DatabaseIOException {
        OooOO0();
        try {
            return new OooO00o(this.f34356OooO00o.getReadableDatabase().query("ExoPlayerDownloads", f34355OooO0o0, OooOOO0(iArr), null, null, null, "start_time_ms ASC"));
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // p072o000O0oO.o00000O
    public final void OooO0o(int i, String str) throws DatabaseIOException {
        OooOO0();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.f34356OooO00o.getWritableDatabase().update("ExoPlayerDownloads", contentValues, f34354OooO0Oo + " AND id = ?", new String[]{str});
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // p072o000O0oO.o00000O
    public final void OooO0o0() throws DatabaseIOException {
        OooOO0();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f34356OooO00o.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // p072o000O0oO.o00000O
    public final void OooO0oO() throws DatabaseIOException {
        OooOO0();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f34356OooO00o.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // p072o000O0oO.o00000O
    @Nullable
    public final Download OooO0oo(String str) throws DatabaseIOException {
        OooOO0();
        try {
            try {
                Cursor cursorQuery = this.f34356OooO00o.getReadableDatabase().query("ExoPlayerDownloads", f34355OooO0o0, "id = ?", new String[]{str}, null, null, "start_time_ms ASC");
                try {
                    if (cursorQuery.getCount() == 0) {
                        cursorQuery.close();
                        return null;
                    }
                    cursorQuery.moveToNext();
                    Download downloadOooOO0O = OooOO0O(cursorQuery);
                    cursorQuery.close();
                    return downloadOooOO0O;
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
            } catch (SQLiteException e) {
                throw new DatabaseIOException(e);
            }
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
        throw new DatabaseIOException(e2);
    }

    public final void OooOO0() throws DatabaseIOException {
        synchronized (this.f34357OooO0O0) {
            if (this.f34358OooO0OO) {
                return;
            }
            try {
                int iOooO00o = o00O000.OooO00o(this.f34356OooO00o.getReadableDatabase(), 0, "");
                if (iOooO00o != 3) {
                    SQLiteDatabase writableDatabase = this.f34356OooO00o.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        o00O000.OooO0O0(writableDatabase, 0, "", 3);
                        ArrayList arrayListOooOOO = iOooO00o == 2 ? OooOOO(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayListOooOOO.iterator();
                        while (it.hasNext()) {
                            OooOOOO((Download) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.f34358OooO0OO = true;
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }
    }

    public final void OooOOOO(Download download, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = download.f7765OooO00o.f7778OooO0oo;
        if (bArr == null) {
            bArr = o00.f34914OooO0o;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", download.f7765OooO00o.f7774OooO0Oo);
        contentValues.put("mime_type", download.f7765OooO00o.f7775OooO0o);
        contentValues.put(ShareConstants.MEDIA_URI, download.f7765OooO00o.f7776OooO0o0.toString());
        List<StreamKey> list = download.f7765OooO00o.f7777OooO0oO;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            StreamKey streamKey = list.get(i);
            sb.append(streamKey.f6727OooO0Oo);
            sb.append('.');
            sb.append(streamKey.f6729OooO0o0);
            sb.append('.');
            sb.append(streamKey.f6728OooO0o);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", download.f7765OooO00o.f7773OooO);
        contentValues.put("data", download.f7765OooO00o.f7779OooOO0);
        contentValues.put("state", Integer.valueOf(download.f7766OooO0O0));
        contentValues.put("start_time_ms", Long.valueOf(download.f7767OooO0OO));
        contentValues.put("update_time_ms", Long.valueOf(download.f7768OooO0Oo));
        contentValues.put("content_length", Long.valueOf(download.f7770OooO0o0));
        contentValues.put("stop_reason", Integer.valueOf(download.f7769OooO0o));
        contentValues.put("failure_reason", Integer.valueOf(download.f7771OooO0oO));
        contentValues.put("percent_downloaded", Float.valueOf(download.f7772OooO0oo.f34351OooO0O0));
        contentValues.put("bytes_downloaded", Long.valueOf(download.f7772OooO0oo.f34350OooO00o));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow("ExoPlayerDownloads", null, contentValues);
    }
}

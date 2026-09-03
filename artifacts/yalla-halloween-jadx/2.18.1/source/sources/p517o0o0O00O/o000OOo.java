package p517o0o0O00O;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p091o000o00o.o0000O0;
import p091o000o00o.o0O0O00;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo implements o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f42145OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p091o000o00o.o000OOo<MusicTable> f42146OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00<MusicTable> f42147OooO0OO;

    public class OooO00o extends p091o000o00o.o000OOo<MusicTable> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `MusicTable` (`id`,`mTitle`,`mTitleKey`,`mDuration`,`mArtist`,`mArtistKey`,`mComposer`,`mAlbum`,`mAlbumKey`,`mDisplayName`,`mMimeType`,`mPath`,`user`,`initialLetter`,`isSelect`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, MusicTable musicTable) {
            MusicTable musicTable2 = musicTable;
            Integer num = musicTable2.id;
            if (num == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, num.intValue());
            }
            String str = musicTable2.mTitle;
            if (str == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str);
            }
            String str2 = musicTable2.mTitleKey;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            supportSQLiteStatement.bindLong(4, musicTable2.mDuration);
            String str3 = musicTable2.mArtist;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, str3);
            }
            String str4 = musicTable2.mArtistKey;
            if (str4 == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindString(6, str4);
            }
            String str5 = musicTable2.mComposer;
            if (str5 == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindString(7, str5);
            }
            String str6 = musicTable2.mAlbum;
            if (str6 == null) {
                supportSQLiteStatement.bindNull(8);
            } else {
                supportSQLiteStatement.bindString(8, str6);
            }
            String str7 = musicTable2.mAlbumKey;
            if (str7 == null) {
                supportSQLiteStatement.bindNull(9);
            } else {
                supportSQLiteStatement.bindString(9, str7);
            }
            String str8 = musicTable2.mDisplayName;
            if (str8 == null) {
                supportSQLiteStatement.bindNull(10);
            } else {
                supportSQLiteStatement.bindString(10, str8);
            }
            String str9 = musicTable2.mMimeType;
            if (str9 == null) {
                supportSQLiteStatement.bindNull(11);
            } else {
                supportSQLiteStatement.bindString(11, str9);
            }
            String str10 = musicTable2.mPath;
            if (str10 == null) {
                supportSQLiteStatement.bindNull(12);
            } else {
                supportSQLiteStatement.bindString(12, str10);
            }
            String str11 = musicTable2.user;
            if (str11 == null) {
                supportSQLiteStatement.bindNull(13);
            } else {
                supportSQLiteStatement.bindString(13, str11);
            }
            String str12 = musicTable2.initialLetter;
            if (str12 == null) {
                supportSQLiteStatement.bindNull(14);
            } else {
                supportSQLiteStatement.bindString(14, str12);
            }
            supportSQLiteStatement.bindLong(15, musicTable2.isSelect ? 1L : 0L);
        }
    }

    public class OooO0O0 extends o0O0O00<MusicTable> {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "DELETE FROM `MusicTable` WHERE `id` = ?";
        }

        @Override // p091o000o00o.o0O0O00
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, MusicTable musicTable) {
            Integer num = musicTable.id;
            if (num == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindLong(1, num.intValue());
            }
        }
    }

    public class OooO0OO implements Callable<List<MusicTable>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f42148OooO00o;

        public OooO0OO(o0000O0 o0000o1) {
            this.f42148OooO00o = o0000o1;
        }

        @Override // java.util.concurrent.Callable
        public final List<MusicTable> call() throws Exception {
            Cursor cursorOooOOO = o000OOo.this.f42145OooO00o.OooOOO(this.f42148OooO00o);
            try {
                int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
                int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "mTitle");
                int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "mTitleKey");
                int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "mDuration");
                int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "mArtist");
                int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "mArtistKey");
                int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "mComposer");
                int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "mAlbum");
                int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "mAlbumKey");
                int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "mDisplayName");
                int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "mMimeType");
                int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "mPath");
                int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "user");
                int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "initialLetter");
                int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "isSelect");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    MusicTable musicTable = new MusicTable();
                    ArrayList arrayList2 = arrayList;
                    if (cursorOooOOO.isNull(iOooO00o)) {
                        musicTable.id = null;
                    } else {
                        musicTable.id = Integer.valueOf(cursorOooOOO.getInt(iOooO00o));
                    }
                    if (cursorOooOOO.isNull(iOooO00o2)) {
                        musicTable.mTitle = null;
                    } else {
                        musicTable.mTitle = cursorOooOOO.getString(iOooO00o2);
                    }
                    if (cursorOooOOO.isNull(iOooO00o3)) {
                        musicTable.mTitleKey = null;
                    } else {
                        musicTable.mTitleKey = cursorOooOOO.getString(iOooO00o3);
                    }
                    musicTable.mDuration = cursorOooOOO.getInt(iOooO00o4);
                    if (cursorOooOOO.isNull(iOooO00o5)) {
                        musicTable.mArtist = null;
                    } else {
                        musicTable.mArtist = cursorOooOOO.getString(iOooO00o5);
                    }
                    if (cursorOooOOO.isNull(iOooO00o6)) {
                        musicTable.mArtistKey = null;
                    } else {
                        musicTable.mArtistKey = cursorOooOOO.getString(iOooO00o6);
                    }
                    if (cursorOooOOO.isNull(iOooO00o7)) {
                        musicTable.mComposer = null;
                    } else {
                        musicTable.mComposer = cursorOooOOO.getString(iOooO00o7);
                    }
                    if (cursorOooOOO.isNull(iOooO00o8)) {
                        musicTable.mAlbum = null;
                    } else {
                        musicTable.mAlbum = cursorOooOOO.getString(iOooO00o8);
                    }
                    if (cursorOooOOO.isNull(iOooO00o9)) {
                        musicTable.mAlbumKey = null;
                    } else {
                        musicTable.mAlbumKey = cursorOooOOO.getString(iOooO00o9);
                    }
                    if (cursorOooOOO.isNull(iOooO00o10)) {
                        musicTable.mDisplayName = null;
                    } else {
                        musicTable.mDisplayName = cursorOooOOO.getString(iOooO00o10);
                    }
                    if (cursorOooOOO.isNull(iOooO00o11)) {
                        musicTable.mMimeType = null;
                    } else {
                        musicTable.mMimeType = cursorOooOOO.getString(iOooO00o11);
                    }
                    if (cursorOooOOO.isNull(iOooO00o12)) {
                        musicTable.mPath = null;
                    } else {
                        musicTable.mPath = cursorOooOOO.getString(iOooO00o12);
                    }
                    if (cursorOooOOO.isNull(iOooO00o13)) {
                        musicTable.user = null;
                    } else {
                        musicTable.user = cursorOooOOO.getString(iOooO00o13);
                    }
                    int i2 = i;
                    if (cursorOooOOO.isNull(i2)) {
                        musicTable.initialLetter = null;
                    } else {
                        musicTable.initialLetter = cursorOooOOO.getString(i2);
                    }
                    int i3 = iOooO00o15;
                    musicTable.isSelect = cursorOooOOO.getInt(i3) != 0;
                    arrayList2.add(musicTable);
                    iOooO00o15 = i3;
                    arrayList = arrayList2;
                    iOooO00o = iOooO00o;
                    i = i2;
                }
                return arrayList;
            } finally {
                cursorOooOOO.close();
            }
        }

        public final void finalize() {
            this.f42148OooO00o.release();
        }
    }

    public o000OOo(RoomDatabase roomDatabase) {
        this.f42145OooO00o = roomDatabase;
        this.f42146OooO0O0 = new OooO00o(roomDatabase);
        this.f42147OooO0OO = new OooO0O0(roomDatabase);
        new AtomicBoolean(false);
    }

    @Override // p517o0o0O00O.o0O0O00
    public final LiveData<List<MusicTable>> OooO00o(String str) {
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from MusicTable Where user = ?", 1);
        o0000o0OooO0o.bindString(1, str);
        return this.f42145OooO00o.f9295OooO0o0.OooO0OO(new String[]{"MusicTable"}, new OooO0OO(o0000o0OooO0o));
    }

    @Override // p517o0o0O00O.o0O0O00
    public final void OooO0O0(List<MusicTable> list) {
        this.f42145OooO00o.OooO0O0();
        this.f42145OooO00o.OooO0OO();
        try {
            o0O0O00<MusicTable> o0o0o00 = this.f42147OooO0OO;
            SupportSQLiteStatement supportSQLiteStatementOooO00o = o0o0o00.OooO00o();
            try {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    o0o0o00.OooO0o0(supportSQLiteStatementOooO00o, it.next());
                    supportSQLiteStatementOooO00o.executeUpdateDelete();
                }
                o0o0o00.OooO0Oo(supportSQLiteStatementOooO00o);
                this.f42145OooO00o.OooOOOO();
                this.f42145OooO00o.OooOO0O();
            } catch (Throwable th) {
                o0o0o00.OooO0Oo(supportSQLiteStatementOooO00o);
                throw th;
            }
        } catch (Throwable th2) {
            this.f42145OooO00o.OooOO0O();
            throw th2;
        }
    }

    @Override // p517o0o0O00O.o0O0O00
    public final void OooO0OO(MusicTable musicTable) {
        this.f42145OooO00o.OooO0O0();
        this.f42145OooO00o.OooO0OO();
        try {
            this.f42146OooO0O0.OooO0oO(musicTable);
            this.f42145OooO00o.OooOOOO();
        } finally {
            this.f42145OooO00o.OooOO0O();
        }
    }

    @Override // p517o0o0O00O.o0O0O00
    public final List<MusicTable> OooO0Oo(String str, String str2, String str3) throws Throwable {
        o0000O0 o0000o1;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from MusicTable  where (mTitle like ? or mArtist like ?) and user = ?", 3);
        if (str == null) {
            o0000o0OooO0o.bindNull(1);
        } else {
            o0000o0OooO0o.bindString(1, str);
        }
        if (str2 == null) {
            o0000o0OooO0o.bindNull(2);
        } else {
            o0000o0OooO0o.bindString(2, str2);
        }
        o0000o0OooO0o.bindString(3, str3);
        this.f42145OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42145OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "id");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "mTitle");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "mTitleKey");
            int iOooO00o4 = o00O0O.OooO00o(cursorOooOOO, "mDuration");
            int iOooO00o5 = o00O0O.OooO00o(cursorOooOOO, "mArtist");
            int iOooO00o6 = o00O0O.OooO00o(cursorOooOOO, "mArtistKey");
            int iOooO00o7 = o00O0O.OooO00o(cursorOooOOO, "mComposer");
            int iOooO00o8 = o00O0O.OooO00o(cursorOooOOO, "mAlbum");
            int iOooO00o9 = o00O0O.OooO00o(cursorOooOOO, "mAlbumKey");
            int iOooO00o10 = o00O0O.OooO00o(cursorOooOOO, "mDisplayName");
            int iOooO00o11 = o00O0O.OooO00o(cursorOooOOO, "mMimeType");
            int iOooO00o12 = o00O0O.OooO00o(cursorOooOOO, "mPath");
            int iOooO00o13 = o00O0O.OooO00o(cursorOooOOO, "user");
            int iOooO00o14 = o00O0O.OooO00o(cursorOooOOO, "initialLetter");
            o0000o1 = o0000o0OooO0o;
            try {
                int iOooO00o15 = o00O0O.OooO00o(cursorOooOOO, "isSelect");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooOOO.getCount());
                while (cursorOooOOO.moveToNext()) {
                    MusicTable musicTable = new MusicTable();
                    ArrayList arrayList2 = arrayList;
                    if (cursorOooOOO.isNull(iOooO00o)) {
                        musicTable.id = null;
                    } else {
                        musicTable.id = Integer.valueOf(cursorOooOOO.getInt(iOooO00o));
                    }
                    if (cursorOooOOO.isNull(iOooO00o2)) {
                        musicTable.mTitle = null;
                    } else {
                        musicTable.mTitle = cursorOooOOO.getString(iOooO00o2);
                    }
                    if (cursorOooOOO.isNull(iOooO00o3)) {
                        musicTable.mTitleKey = null;
                    } else {
                        musicTable.mTitleKey = cursorOooOOO.getString(iOooO00o3);
                    }
                    musicTable.mDuration = cursorOooOOO.getInt(iOooO00o4);
                    if (cursorOooOOO.isNull(iOooO00o5)) {
                        musicTable.mArtist = null;
                    } else {
                        musicTable.mArtist = cursorOooOOO.getString(iOooO00o5);
                    }
                    if (cursorOooOOO.isNull(iOooO00o6)) {
                        musicTable.mArtistKey = null;
                    } else {
                        musicTable.mArtistKey = cursorOooOOO.getString(iOooO00o6);
                    }
                    if (cursorOooOOO.isNull(iOooO00o7)) {
                        musicTable.mComposer = null;
                    } else {
                        musicTable.mComposer = cursorOooOOO.getString(iOooO00o7);
                    }
                    if (cursorOooOOO.isNull(iOooO00o8)) {
                        musicTable.mAlbum = null;
                    } else {
                        musicTable.mAlbum = cursorOooOOO.getString(iOooO00o8);
                    }
                    if (cursorOooOOO.isNull(iOooO00o9)) {
                        musicTable.mAlbumKey = null;
                    } else {
                        musicTable.mAlbumKey = cursorOooOOO.getString(iOooO00o9);
                    }
                    if (cursorOooOOO.isNull(iOooO00o10)) {
                        musicTable.mDisplayName = null;
                    } else {
                        musicTable.mDisplayName = cursorOooOOO.getString(iOooO00o10);
                    }
                    if (cursorOooOOO.isNull(iOooO00o11)) {
                        musicTable.mMimeType = null;
                    } else {
                        musicTable.mMimeType = cursorOooOOO.getString(iOooO00o11);
                    }
                    if (cursorOooOOO.isNull(iOooO00o12)) {
                        musicTable.mPath = null;
                    } else {
                        musicTable.mPath = cursorOooOOO.getString(iOooO00o12);
                    }
                    if (cursorOooOOO.isNull(iOooO00o13)) {
                        musicTable.user = null;
                    } else {
                        musicTable.user = cursorOooOOO.getString(iOooO00o13);
                    }
                    int i2 = i;
                    if (cursorOooOOO.isNull(i2)) {
                        musicTable.initialLetter = null;
                    } else {
                        musicTable.initialLetter = cursorOooOOO.getString(i2);
                    }
                    iOooO00o15 = iOooO00o15;
                    musicTable.isSelect = cursorOooOOO.getInt(iOooO00o15) != 0;
                    arrayList2.add(musicTable);
                    iOooO00o = iOooO00o;
                    i = i2;
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = arrayList;
                cursorOooOOO.close();
                o0000o1.release();
                return arrayList3;
            } catch (Throwable th) {
                th = th;
                cursorOooOOO.close();
                o0000o1.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o0000o1 = o0000o0OooO0o;
        }
    }
}

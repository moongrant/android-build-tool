package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import o000O.OooO00o;
import o000O.OooO0O0;
import o000O0O0.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000O0O implements oO0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f44618OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO0000Oo f44619OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0000o0 f44620OooO0OO;

    public oO000O0O(YlAppDataBase ylAppDataBase) {
        this.f44618OooO00o = ylAppDataBase;
        this.f44619OooO0O0 = new oO0000Oo(ylAppDataBase);
        this.f44620OooO0OO = new oO0000o0(ylAppDataBase);
        new oO000(ylAppDataBase);
    }

    @Override // p403o0Oo0OOo.oO0000O
    public final o0O0O00 OooO00o(String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from MusicTable Where user = ?");
        roomSQLiteQueryOooO00o.bindString(1, str);
        return this.f44618OooO00o.f7889OooO0o0.OooO0O0(new String[]{"MusicTable"}, new oO000O0(this, roomSQLiteQueryOooO00o));
    }

    @Override // p403o0Oo0OOo.oO0000O
    public final MusicTable OooO0O0(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        MusicTable musicTable;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from MusicTable Where mPath = ?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f44618OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "mTitle");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "mTitleKey");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "mDuration");
            int iOooO00o5 = OooO00o.OooO00o(cursorOooO0O0, "mArtist");
            int iOooO00o6 = OooO00o.OooO00o(cursorOooO0O0, "mArtistKey");
            int iOooO00o7 = OooO00o.OooO00o(cursorOooO0O0, "mComposer");
            int iOooO00o8 = OooO00o.OooO00o(cursorOooO0O0, "mAlbum");
            int iOooO00o9 = OooO00o.OooO00o(cursorOooO0O0, "mAlbumKey");
            int iOooO00o10 = OooO00o.OooO00o(cursorOooO0O0, "mDisplayName");
            int iOooO00o11 = OooO00o.OooO00o(cursorOooO0O0, "mMimeType");
            int iOooO00o12 = OooO00o.OooO00o(cursorOooO0O0, "mPath");
            int iOooO00o13 = OooO00o.OooO00o(cursorOooO0O0, "user");
            int iOooO00o14 = OooO00o.OooO00o(cursorOooO0O0, "initialLetter");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = OooO00o.OooO00o(cursorOooO0O0, "isSelect");
                if (cursorOooO0O0.moveToFirst()) {
                    musicTable = new MusicTable();
                    if (cursorOooO0O0.isNull(iOooO00o)) {
                        musicTable.id = null;
                    } else {
                        musicTable.id = Integer.valueOf(cursorOooO0O0.getInt(iOooO00o));
                    }
                    if (cursorOooO0O0.isNull(iOooO00o2)) {
                        musicTable.mTitle = null;
                    } else {
                        musicTable.mTitle = cursorOooO0O0.getString(iOooO00o2);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o3)) {
                        musicTable.mTitleKey = null;
                    } else {
                        musicTable.mTitleKey = cursorOooO0O0.getString(iOooO00o3);
                    }
                    musicTable.mDuration = cursorOooO0O0.getInt(iOooO00o4);
                    if (cursorOooO0O0.isNull(iOooO00o5)) {
                        musicTable.mArtist = null;
                    } else {
                        musicTable.mArtist = cursorOooO0O0.getString(iOooO00o5);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o6)) {
                        musicTable.mArtistKey = null;
                    } else {
                        musicTable.mArtistKey = cursorOooO0O0.getString(iOooO00o6);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o7)) {
                        musicTable.mComposer = null;
                    } else {
                        musicTable.mComposer = cursorOooO0O0.getString(iOooO00o7);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o8)) {
                        musicTable.mAlbum = null;
                    } else {
                        musicTable.mAlbum = cursorOooO0O0.getString(iOooO00o8);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o9)) {
                        musicTable.mAlbumKey = null;
                    } else {
                        musicTable.mAlbumKey = cursorOooO0O0.getString(iOooO00o9);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o10)) {
                        musicTable.mDisplayName = null;
                    } else {
                        musicTable.mDisplayName = cursorOooO0O0.getString(iOooO00o10);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o11)) {
                        musicTable.mMimeType = null;
                    } else {
                        musicTable.mMimeType = cursorOooO0O0.getString(iOooO00o11);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o12)) {
                        musicTable.mPath = null;
                    } else {
                        musicTable.mPath = cursorOooO0O0.getString(iOooO00o12);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o13)) {
                        musicTable.user = null;
                    } else {
                        musicTable.user = cursorOooO0O0.getString(iOooO00o13);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o14)) {
                        musicTable.initialLetter = null;
                    } else {
                        musicTable.initialLetter = cursorOooO0O0.getString(iOooO00o14);
                    }
                    musicTable.isSelect = cursorOooO0O0.getInt(iOooO00o15) != 0;
                } else {
                    musicTable = null;
                }
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return musicTable;
            } catch (Throwable th) {
                th = th;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
        }
    }

    @Override // p403o0Oo0OOo.oO0000O
    public final void OooO0OO(ArrayList arrayList) {
        RoomDatabase roomDatabase = this.f44618OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44619OooO0O0.OooO0o0(arrayList);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p403o0Oo0OOo.oO0000O
    public final ArrayList OooO0Oo(String str, String str2) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(4, "Select * from MusicTable  where (mTitle like ? or mArtist like ? or mDisplayName like ?) and user = ?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(2);
        } else {
            roomSQLiteQueryOooO00o.bindString(2, str);
        }
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(3);
        } else {
            roomSQLiteQueryOooO00o.bindString(3, str);
        }
        roomSQLiteQueryOooO00o.bindString(4, str2);
        RoomDatabase roomDatabase = this.f44618OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "mTitle");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "mTitleKey");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "mDuration");
            int iOooO00o5 = OooO00o.OooO00o(cursorOooO0O0, "mArtist");
            int iOooO00o6 = OooO00o.OooO00o(cursorOooO0O0, "mArtistKey");
            int iOooO00o7 = OooO00o.OooO00o(cursorOooO0O0, "mComposer");
            int iOooO00o8 = OooO00o.OooO00o(cursorOooO0O0, "mAlbum");
            int iOooO00o9 = OooO00o.OooO00o(cursorOooO0O0, "mAlbumKey");
            int iOooO00o10 = OooO00o.OooO00o(cursorOooO0O0, "mDisplayName");
            int iOooO00o11 = OooO00o.OooO00o(cursorOooO0O0, "mMimeType");
            int iOooO00o12 = OooO00o.OooO00o(cursorOooO0O0, "mPath");
            int iOooO00o13 = OooO00o.OooO00o(cursorOooO0O0, "user");
            int iOooO00o14 = OooO00o.OooO00o(cursorOooO0O0, "initialLetter");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = OooO00o.OooO00o(cursorOooO0O0, "isSelect");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    MusicTable musicTable = new MusicTable();
                    ArrayList arrayList2 = arrayList;
                    if (cursorOooO0O0.isNull(iOooO00o)) {
                        musicTable.id = null;
                    } else {
                        musicTable.id = Integer.valueOf(cursorOooO0O0.getInt(iOooO00o));
                    }
                    if (cursorOooO0O0.isNull(iOooO00o2)) {
                        musicTable.mTitle = null;
                    } else {
                        musicTable.mTitle = cursorOooO0O0.getString(iOooO00o2);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o3)) {
                        musicTable.mTitleKey = null;
                    } else {
                        musicTable.mTitleKey = cursorOooO0O0.getString(iOooO00o3);
                    }
                    musicTable.mDuration = cursorOooO0O0.getInt(iOooO00o4);
                    if (cursorOooO0O0.isNull(iOooO00o5)) {
                        musicTable.mArtist = null;
                    } else {
                        musicTable.mArtist = cursorOooO0O0.getString(iOooO00o5);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o6)) {
                        musicTable.mArtistKey = null;
                    } else {
                        musicTable.mArtistKey = cursorOooO0O0.getString(iOooO00o6);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o7)) {
                        musicTable.mComposer = null;
                    } else {
                        musicTable.mComposer = cursorOooO0O0.getString(iOooO00o7);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o8)) {
                        musicTable.mAlbum = null;
                    } else {
                        musicTable.mAlbum = cursorOooO0O0.getString(iOooO00o8);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o9)) {
                        musicTable.mAlbumKey = null;
                    } else {
                        musicTable.mAlbumKey = cursorOooO0O0.getString(iOooO00o9);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o10)) {
                        musicTable.mDisplayName = null;
                    } else {
                        musicTable.mDisplayName = cursorOooO0O0.getString(iOooO00o10);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o11)) {
                        musicTable.mMimeType = null;
                    } else {
                        musicTable.mMimeType = cursorOooO0O0.getString(iOooO00o11);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o12)) {
                        musicTable.mPath = null;
                    } else {
                        musicTable.mPath = cursorOooO0O0.getString(iOooO00o12);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o13)) {
                        musicTable.user = null;
                    } else {
                        musicTable.user = cursorOooO0O0.getString(iOooO00o13);
                    }
                    int i2 = i;
                    if (cursorOooO0O0.isNull(i2)) {
                        musicTable.initialLetter = null;
                    } else {
                        musicTable.initialLetter = cursorOooO0O0.getString(i2);
                    }
                    iOooO00o15 = iOooO00o15;
                    musicTable.isSelect = cursorOooO0O0.getInt(iOooO00o15) != 0;
                    arrayList2.add(musicTable);
                    iOooO00o = iOooO00o;
                    i = i2;
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = arrayList;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return arrayList3;
            } catch (Throwable th) {
                th = th;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
        }
    }

    @Override // p403o0Oo0OOo.oO0000O
    public final void OooO0o(MusicTable musicTable) {
        RoomDatabase roomDatabase = this.f44618OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f44619OooO0O0.OooO0o(musicTable);
            roomDatabase.OooOOO0();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p403o0Oo0OOo.oO0000O
    public final void OooO0o0(List<MusicTable> entities) {
        RoomDatabase roomDatabase = this.f44618OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            oO0000o0 oo0000o0 = this.f44620OooO0OO;
            oo0000o0.getClass();
            Intrinsics.checkNotNullParameter(entities, "entities");
            SupportSQLiteStatement supportSQLiteStatementOooO00o = oo0000o0.OooO00o();
            try {
                Iterator<T> it = entities.iterator();
                while (it.hasNext()) {
                    oo0000o0.OooO0Oo(supportSQLiteStatementOooO00o, it.next());
                    supportSQLiteStatementOooO00o.executeUpdateDelete();
                }
                oo0000o0.OooO0OO(supportSQLiteStatementOooO00o);
                roomDatabase.OooOOO0();
                roomDatabase.OooOO0();
            } catch (Throwable th) {
                oo0000o0.OooO0OO(supportSQLiteStatementOooO00o);
                throw th;
            }
        } catch (Throwable th2) {
            roomDatabase.OooOO0();
            throw th2;
        }
    }

    @Override // p403o0Oo0OOo.oO0000O
    public final ArrayList OooO0oO(String str, String str2, String str3) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(3, "Select * from MusicTable  where (mTitle like ? or mArtist like ?) and user = ?");
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(1);
        } else {
            roomSQLiteQueryOooO00o.bindString(1, str);
        }
        if (str2 == null) {
            roomSQLiteQueryOooO00o.bindNull(2);
        } else {
            roomSQLiteQueryOooO00o.bindString(2, str2);
        }
        roomSQLiteQueryOooO00o.bindString(3, str3);
        RoomDatabase roomDatabase = this.f44618OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "mTitle");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "mTitleKey");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "mDuration");
            int iOooO00o5 = OooO00o.OooO00o(cursorOooO0O0, "mArtist");
            int iOooO00o6 = OooO00o.OooO00o(cursorOooO0O0, "mArtistKey");
            int iOooO00o7 = OooO00o.OooO00o(cursorOooO0O0, "mComposer");
            int iOooO00o8 = OooO00o.OooO00o(cursorOooO0O0, "mAlbum");
            int iOooO00o9 = OooO00o.OooO00o(cursorOooO0O0, "mAlbumKey");
            int iOooO00o10 = OooO00o.OooO00o(cursorOooO0O0, "mDisplayName");
            int iOooO00o11 = OooO00o.OooO00o(cursorOooO0O0, "mMimeType");
            int iOooO00o12 = OooO00o.OooO00o(cursorOooO0O0, "mPath");
            int iOooO00o13 = OooO00o.OooO00o(cursorOooO0O0, "user");
            int iOooO00o14 = OooO00o.OooO00o(cursorOooO0O0, "initialLetter");
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
            try {
                int iOooO00o15 = OooO00o.OooO00o(cursorOooO0O0, "isSelect");
                int i = iOooO00o14;
                ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
                while (cursorOooO0O0.moveToNext()) {
                    MusicTable musicTable = new MusicTable();
                    ArrayList arrayList2 = arrayList;
                    if (cursorOooO0O0.isNull(iOooO00o)) {
                        musicTable.id = null;
                    } else {
                        musicTable.id = Integer.valueOf(cursorOooO0O0.getInt(iOooO00o));
                    }
                    if (cursorOooO0O0.isNull(iOooO00o2)) {
                        musicTable.mTitle = null;
                    } else {
                        musicTable.mTitle = cursorOooO0O0.getString(iOooO00o2);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o3)) {
                        musicTable.mTitleKey = null;
                    } else {
                        musicTable.mTitleKey = cursorOooO0O0.getString(iOooO00o3);
                    }
                    musicTable.mDuration = cursorOooO0O0.getInt(iOooO00o4);
                    if (cursorOooO0O0.isNull(iOooO00o5)) {
                        musicTable.mArtist = null;
                    } else {
                        musicTable.mArtist = cursorOooO0O0.getString(iOooO00o5);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o6)) {
                        musicTable.mArtistKey = null;
                    } else {
                        musicTable.mArtistKey = cursorOooO0O0.getString(iOooO00o6);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o7)) {
                        musicTable.mComposer = null;
                    } else {
                        musicTable.mComposer = cursorOooO0O0.getString(iOooO00o7);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o8)) {
                        musicTable.mAlbum = null;
                    } else {
                        musicTable.mAlbum = cursorOooO0O0.getString(iOooO00o8);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o9)) {
                        musicTable.mAlbumKey = null;
                    } else {
                        musicTable.mAlbumKey = cursorOooO0O0.getString(iOooO00o9);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o10)) {
                        musicTable.mDisplayName = null;
                    } else {
                        musicTable.mDisplayName = cursorOooO0O0.getString(iOooO00o10);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o11)) {
                        musicTable.mMimeType = null;
                    } else {
                        musicTable.mMimeType = cursorOooO0O0.getString(iOooO00o11);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o12)) {
                        musicTable.mPath = null;
                    } else {
                        musicTable.mPath = cursorOooO0O0.getString(iOooO00o12);
                    }
                    if (cursorOooO0O0.isNull(iOooO00o13)) {
                        musicTable.user = null;
                    } else {
                        musicTable.user = cursorOooO0O0.getString(iOooO00o13);
                    }
                    int i2 = i;
                    if (cursorOooO0O0.isNull(i2)) {
                        musicTable.initialLetter = null;
                    } else {
                        musicTable.initialLetter = cursorOooO0O0.getString(i2);
                    }
                    iOooO00o15 = iOooO00o15;
                    musicTable.isSelect = cursorOooO0O0.getInt(iOooO00o15) != 0;
                    arrayList2.add(musicTable);
                    iOooO00o = iOooO00o;
                    i = i2;
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = arrayList;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                return arrayList3;
            } catch (Throwable th) {
                th = th;
                cursorOooO0O0.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryOooO00o;
        }
    }
}

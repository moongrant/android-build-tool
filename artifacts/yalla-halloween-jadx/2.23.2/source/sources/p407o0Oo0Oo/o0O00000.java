package p407o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.model.MusicTable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import o00.OooO00o;
import o00.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00000 implements Callable<List<MusicTable>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomSQLiteQuery f45805OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f45806OooO0O0;

    public o0O00000(o0O0000O o0o0000o2, RoomSQLiteQuery roomSQLiteQuery) {
        this.f45806OooO0O0 = o0o0000o2;
        this.f45805OooO00o = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final List<MusicTable> call() throws Exception {
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(this.f45806OooO0O0.f45807OooO00o, this.f45805OooO00o);
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
                int i3 = iOooO00o15;
                musicTable.isSelect = cursorOooO0O0.getInt(i3) != 0;
                arrayList2.add(musicTable);
                iOooO00o15 = i3;
                arrayList = arrayList2;
                iOooO00o = iOooO00o;
                i = i2;
            }
            return arrayList;
        } finally {
            cursorOooO0O0.close();
        }
    }

    public final void finalize() {
        this.f45805OooO00o.release();
    }
}

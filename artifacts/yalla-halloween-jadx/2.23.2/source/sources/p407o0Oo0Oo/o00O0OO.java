package p407o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.table.HideContent;
import java.util.TreeMap;
import o00.OooO00o;
import o00.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO implements o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f45790OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0o0O0 f45791OooO0O0;

    public o00O0OO(YlAppDataBase ylAppDataBase) {
        this.f45790OooO00o = ylAppDataBase;
        this.f45791OooO0O0 = new oo0o0O0(ylAppDataBase);
    }

    @Override // p407o0Oo0Oo.o00O0OO0
    public final void OooO00o(HideContent hideContent) {
        RoomDatabase roomDatabase = this.f45790OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f45791OooO0O0.OooO0oO(hideContent);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p407o0Oo0Oo.o00O0OO0
    public final HideContent OooO0O0(int i, long j, String str) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(3, "Select * from HideContentTable Where userId = ? and type = ? and contentId = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        roomSQLiteQueryOooO00o.bindLong(2, i);
        if (str == null) {
            roomSQLiteQueryOooO00o.bindNull(3);
        } else {
            roomSQLiteQueryOooO00o.bindString(3, str);
        }
        RoomDatabase roomDatabase = this.f45790OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "userId");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, "contentId");
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "type");
            HideContent hideContent = null;
            String string = null;
            if (cursorOooO0O0.moveToFirst()) {
                HideContent hideContent2 = new HideContent();
                hideContent2.setUserId(cursorOooO0O0.getLong(iOooO00o));
                if (!cursorOooO0O0.isNull(iOooO00o2)) {
                    string = cursorOooO0O0.getString(iOooO00o2);
                }
                hideContent2.setContentId(string);
                hideContent2.setType(cursorOooO0O0.getInt(iOooO00o3));
                hideContent = hideContent2;
            }
            return hideContent;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }
}

package p409o0Oo0Oo;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.RoomTheme;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.TreeMap;
import o00.OooO00o;
import o00.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OO0 implements o0O0O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f45827OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O0o0 f45828OooO0O0;

    public o0O0OO0(YlAppDataBase ylAppDataBase) {
        this.f45827OooO00o = ylAppDataBase;
        this.f45828OooO0O0 = new o0O0O0o0(ylAppDataBase);
    }

    @Override // p409o0Oo0Oo.o0O0O0Oo
    public final void OooO00o(RoomTheme roomTheme) {
        RoomDatabase roomDatabase = this.f45827OooO00o;
        roomDatabase.OooO0O0();
        roomDatabase.OooO0OO();
        try {
            this.f45828OooO0O0.OooO0oO(roomTheme);
            roomDatabase.OooOOO();
        } finally {
            roomDatabase.OooOO0();
        }
    }

    @Override // p409o0Oo0Oo.o0O0O0Oo
    public final RoomTheme OooO0O0(long j) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11018OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "Select * from RoomTheme Where roomId = ?");
        roomSQLiteQueryOooO00o.bindLong(1, j);
        RoomDatabase roomDatabase = this.f45827OooO00o;
        roomDatabase.OooO0O0();
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "id");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, ContributionFragment.ARG_1);
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "roomTheme");
            RoomTheme roomTheme = null;
            if (cursorOooO0O0.moveToFirst()) {
                RoomTheme roomTheme2 = new RoomTheme();
                if (cursorOooO0O0.isNull(iOooO00o)) {
                    roomTheme2.id = null;
                } else {
                    roomTheme2.id = Integer.valueOf(cursorOooO0O0.getInt(iOooO00o));
                }
                roomTheme2.roomId = cursorOooO0O0.getLong(iOooO00o2);
                if (cursorOooO0O0.isNull(iOooO00o3)) {
                    roomTheme2.roomTheme = null;
                } else {
                    roomTheme2.roomTheme = cursorOooO0O0.getString(iOooO00o3);
                }
                roomTheme = roomTheme2;
            }
            return roomTheme;
        } finally {
            cursorOooO0O0.close();
            roomSQLiteQueryOooO00o.release();
        }
    }
}

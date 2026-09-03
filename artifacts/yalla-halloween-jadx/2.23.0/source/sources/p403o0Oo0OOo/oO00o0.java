package p403o0Oo0OOo;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import o000O.OooO00o;
import o000O.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o0 implements Callable<List<SearchHistoryTable>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomSQLiteQuery f44627OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ oOo00o0o f44628OooO0O0;

    public oO00o0(oOo00o0o ooo00o0o, RoomSQLiteQuery roomSQLiteQuery) {
        this.f44628OooO0O0 = ooo00o0o;
        this.f44627OooO00o = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final List<SearchHistoryTable> call() throws Exception {
        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(this.f44628OooO0O0.f44654OooO00o, this.f44627OooO00o);
        try {
            int iOooO00o = OooO00o.OooO00o(cursorOooO0O0, "uid");
            int iOooO00o2 = OooO00o.OooO00o(cursorOooO0O0, ViewHierarchyConstants.TAG_KEY);
            int iOooO00o3 = OooO00o.OooO00o(cursorOooO0O0, "type");
            int iOooO00o4 = OooO00o.OooO00o(cursorOooO0O0, "time");
            ArrayList arrayList = new ArrayList(cursorOooO0O0.getCount());
            while (cursorOooO0O0.moveToNext()) {
                SearchHistoryTable searchHistoryTable = new SearchHistoryTable();
                searchHistoryTable.setUid(cursorOooO0O0.getLong(iOooO00o));
                searchHistoryTable.setTag(cursorOooO0O0.isNull(iOooO00o2) ? null : cursorOooO0O0.getString(iOooO00o2));
                searchHistoryTable.setType(cursorOooO0O0.getInt(iOooO00o3));
                searchHistoryTable.setTime(cursorOooO0O0.getLong(iOooO00o4));
                arrayList.add(searchHistoryTable);
            }
            return arrayList;
        } finally {
            cursorOooO0O0.close();
        }
    }

    public final void finalize() {
        this.f44627OooO00o.release();
    }
}

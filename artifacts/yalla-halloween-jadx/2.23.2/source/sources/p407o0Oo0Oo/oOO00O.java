package p407o0Oo0Oo;

import android.database.Cursor;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import java.util.ArrayList;
import o00.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends p111o000oooO.oOO00O<FriendRequestMessage> {
    @Override // p111o000oooO.oOO00O
    public final ArrayList OooO0o0(Cursor cursor) {
        int iOooO00o = OooO00o.OooO00o(cursor, "uid");
        int iOooO00o2 = OooO00o.OooO00o(cursor, "targetUserId");
        int iOooO00o3 = OooO00o.OooO00o(cursor, "mid");
        int iOooO00o4 = OooO00o.OooO00o(cursor, "state");
        int iOooO00o5 = OooO00o.OooO00o(cursor, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        int iOooO00o6 = OooO00o.OooO00o(cursor, "time");
        int iOooO00o7 = OooO00o.OooO00o(cursor, "isRead");
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            FriendRequestMessage friendRequestMessage = new FriendRequestMessage();
            friendRequestMessage.setUid(cursor.getLong(iOooO00o));
            friendRequestMessage.setTargetUserId(cursor.getLong(iOooO00o2));
            friendRequestMessage.setMid(cursor.isNull(iOooO00o3) ? null : cursor.getString(iOooO00o3));
            friendRequestMessage.setState(cursor.getInt(iOooO00o4));
            friendRequestMessage.setMessage(cursor.isNull(iOooO00o5) ? null : cursor.getString(iOooO00o5));
            friendRequestMessage.setTime(cursor.getLong(iOooO00o6));
            friendRequestMessage.setRead(cursor.getInt(iOooO00o7) != 0);
            arrayList.add(friendRequestMessage);
        }
        return arrayList;
    }
}

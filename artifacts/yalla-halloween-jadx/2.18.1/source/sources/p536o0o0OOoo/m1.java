package p536o0o0OOoo;

import android.view.View;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Ooo0oO.o0000O0O;
import p563o0oOo0.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class m1 extends Lambda implements Function3<o0000O0O<FriendInfo>, View, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f43819Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(ShareToFriendsActivity shareToFriendsActivity) {
        super(3);
        this.f43819Oooo0o = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0000O0O<FriendInfo> o0000o0o2, View view, Integer num) {
        o00O0000 o00o0001;
        o00O0000 o00o0002;
        o0000O0O<FriendInfo> adapter = o0000o0o2;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        o00O0000 o00o0003 = this.f43819Oooo0o.f22218OoooooO;
        if (o00o0003 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o00o0003 = null;
        }
        if (o00o0003.f45071OooOOo0) {
            o00O0000 o00o0004 = this.f43819Oooo0o.f22218OoooooO;
            if (o00o0004 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                o00o0001 = null;
            } else {
                o00o0001 = o00o0004;
            }
            o00O0000.OooO(o00o0001, iIntValue, 0L, new l1(this.f43819Oooo0o), 2);
            o00O0000 o00o0005 = this.f43819Oooo0o.f22216Oooooo;
            if (o00o0005 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                o00o0002 = null;
            } else {
                o00o0002 = o00o0005;
            }
            o00O0000.OooO(o00o0002, 0, adapter.getData(iIntValue).getFriend().getFriendId(), null, 5);
            ShareToFriendsActivity.OooOooO(this.f43819Oooo0o);
        } else {
            ShareToFriendsActivity shareToFriendsActivity = this.f43819Oooo0o;
            long friendId = adapter.getData(iIntValue).getFriend().getFriendId();
            UserInfo userInfo = adapter.getData(iIntValue).getUserInfo();
            String strValueOf = String.valueOf(userInfo != null ? userInfo.getUserName() : null);
            UserInfo userInfo2 = adapter.getData(iIntValue).getUserInfo();
            shareToFriendsActivity.Oooo0(friendId, strValueOf, String.valueOf(userInfo2 != null ? userInfo2.getUserHeader() : null));
        }
        return Unit.INSTANCE;
    }
}

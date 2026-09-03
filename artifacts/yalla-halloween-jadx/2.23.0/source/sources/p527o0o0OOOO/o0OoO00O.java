package p527o0o0OOOO;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.screen.message.FriendRequestDetailScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessage f53658OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(FriendRequestMessage friendRequestMessage) {
        super(0);
        this.f53658OooO0Oo = friendRequestMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FriendRequestMessage friendRequestMessage = this.f53658OooO0Oo;
        if (friendRequestMessage.getState() == 1) {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, activityOooO0O0, String.valueOf(friendRequestMessage.getTargetUserId()), false, 12);
            }
        } else {
            o0OO000.OooO0O0("304001", MapsKt.mapOf(new Pair("state", Integer.valueOf(friendRequestMessage.getState()))));
            FriendRequestDetailScreen.INSTANCE.navigate(friendRequestMessage.getTargetUserId());
        }
        return Unit.INSTANCE;
    }
}

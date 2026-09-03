package p536o0o0OOoo;

import android.view.View;
import com.yalla.yalla.common.db.table.FriendRequestMessage;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Ooo0oO.o0000O0O;
import p563o0oOo0.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends Lambda implements Function3<o0000O0O<FriendRequestMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f43792Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(3);
        this.f43792Oooo0o = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0000O0O<FriendRequestMessage> o0000o0o2, View view, Integer num) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(o0000o0o2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        FriendRequestMessageActivity friendRequestMessageActivity = this.f43792Oooo0o;
        o000OOo o000ooo2 = friendRequestMessageActivity.f22161OooooO0;
        if (o000ooo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000ooo2 = null;
        }
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, friendRequestMessageActivity, String.valueOf(o000ooo2.getData(iIntValue).getTargetUserId()), false, 12);
        return Unit.INSTANCE;
    }
}

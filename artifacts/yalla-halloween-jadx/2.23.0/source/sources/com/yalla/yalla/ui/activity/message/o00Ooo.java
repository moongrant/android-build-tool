package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<FriendRequestMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f25913OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(3);
        this.f25913OooO0Oo = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(p400o0Oo0OO.OooOO0O<FriendRequestMessage> oooOO0O, View view, Integer num) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(oooOO0O, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        FriendRequestMessageActivity friendRequestMessageActivity = this.f25913OooO0Oo;
        com.yalla.yalla.ui.adapter.o00O0O o00o0o2 = friendRequestMessageActivity.f25654OooOo0O;
        if (o00o0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00o0o2 = null;
        }
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, friendRequestMessageActivity, String.valueOf(o00o0o2.getData(iIntValue).getTargetUserId()), false, 12);
        return Unit.INSTANCE;
    }
}

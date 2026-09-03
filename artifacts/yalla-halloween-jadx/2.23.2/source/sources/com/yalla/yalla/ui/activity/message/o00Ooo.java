package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function3<h3<FriendRequestMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f25471OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(3);
        this.f25471OooO0Oo = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(h3<FriendRequestMessage> h3Var, View view, Integer num) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(h3Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        FriendRequestMessageActivity friendRequestMessageActivity = this.f25471OooO0Oo;
        com.yalla.yalla.ui.adapter.o00O0O o00o0o2 = friendRequestMessageActivity.f25199OooOo0O;
        if (o00o0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00o0o2 = null;
        }
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, friendRequestMessageActivity, String.valueOf(o00o0o2.getData(iIntValue).getTargetUserId()), false, 12);
        return Unit.INSTANCE;
    }
}

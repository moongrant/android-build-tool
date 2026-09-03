package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends Lambda implements Function3<h3<FriendRequestMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f25541OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(3);
        this.f25541OooO0Oo = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(h3<FriendRequestMessage> h3Var, View view, Integer num) {
        h3<FriendRequestMessage> adapter = h3Var;
        View childView = view;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(childView, "childView");
        FriendRequestMessage data = adapter.getData(iIntValue);
        int id = childView.getId();
        int i = p562o0oOo000.o0OO00O.btAgree;
        FriendRequestMessageActivity friendRequestMessageActivity = this.f25541OooO0Oo;
        if (id == i) {
            FriendRequestMessageActivity.OooOo(friendRequestMessageActivity, true, data.getTargetUserId());
        } else if (id == p562o0oOo000.o0OO00O.btRefuse) {
            FriendRequestMessageActivity.OooOo(friendRequestMessageActivity, false, data.getTargetUserId());
        }
        return Unit.INSTANCE;
    }
}

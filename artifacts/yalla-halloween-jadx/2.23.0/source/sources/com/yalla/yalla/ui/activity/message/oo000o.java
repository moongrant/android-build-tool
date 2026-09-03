package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<FriendRequestMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f25986OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(3);
        this.f25986OooO0Oo = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(p400o0Oo0OO.OooOO0O<FriendRequestMessage> oooOO0O, View view, Integer num) {
        p400o0Oo0OO.OooOO0O<FriendRequestMessage> adapter = oooOO0O;
        View childView = view;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(childView, "childView");
        FriendRequestMessage data = adapter.getData(iIntValue);
        int id = childView.getId();
        int i = oO00O0oO.btAgree;
        FriendRequestMessageActivity friendRequestMessageActivity = this.f25986OooO0Oo;
        if (id == i) {
            FriendRequestMessageActivity.OooOo(friendRequestMessageActivity, true, data.getTargetUserId());
        } else if (id == oO00O0oO.btRefuse) {
            FriendRequestMessageActivity.OooOo(friendRequestMessageActivity, false, data.getTargetUserId());
        }
        return Unit.INSTANCE;
    }
}

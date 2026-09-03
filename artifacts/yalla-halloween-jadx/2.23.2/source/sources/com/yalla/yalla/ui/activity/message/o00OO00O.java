package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O extends Lambda implements Function3<h3<FriendInfo>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25446OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(ShareToFriendsActivity shareToFriendsActivity) {
        super(3);
        this.f25446OooO0Oo = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(h3<FriendInfo> h3Var, View view, Integer num) {
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1;
        h3<FriendInfo> adapter = h3Var;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        ShareToFriendsActivity shareToFriendsActivity = this.f25446OooO0Oo;
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2 = shareToFriendsActivity.f25284OooOoOO;
        if (o000ooo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000ooo2 = null;
        }
        if (o000ooo2.f27084OooOOo) {
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo3 = shareToFriendsActivity.f25284OooOoOO;
            if (o000ooo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                o000ooo3 = null;
            }
            com.yalla.yalla.ui.adapter.o000OOo0.OooO0oO(o000ooo3, iIntValue, 0L, new o00OO000(shareToFriendsActivity), 2);
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo4 = shareToFriendsActivity.f25282OooOoO;
            if (o000ooo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                o000ooo1 = null;
            } else {
                o000ooo1 = o000ooo4;
            }
            com.yalla.yalla.ui.adapter.o000OOo0.OooO0oO(o000ooo1, 0, adapter.getData(iIntValue).getFriend().getFriendId(), null, 5);
            ShareToFriendsActivity.OooOo(shareToFriendsActivity);
        } else {
            long friendId = adapter.getData(iIntValue).getFriend().getFriendId();
            UserInfo userInfo = adapter.getData(iIntValue).getUserInfo();
            String strValueOf = String.valueOf(userInfo != null ? userInfo.getUserName() : null);
            UserInfo userInfo2 = adapter.getData(iIntValue).getUserInfo();
            shareToFriendsActivity.OooOoo(friendId, strValueOf, String.valueOf(userInfo2 != null ? userInfo2.getUserHeader() : null));
        }
        return Unit.INSTANCE;
    }
}

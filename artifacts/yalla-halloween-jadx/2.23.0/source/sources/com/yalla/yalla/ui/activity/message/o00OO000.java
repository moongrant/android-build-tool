package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.db.table.UserInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO000 extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<FriendInfo>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25893OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(ShareToFriendsActivity shareToFriendsActivity) {
        super(3);
        this.f25893OooO0Oo = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(p400o0Oo0OO.OooOO0O<FriendInfo> oooOO0O, View view, Integer num) {
        com.yalla.yalla.ui.adapter.o000OO00 o000oo01;
        p400o0Oo0OO.OooOO0O<FriendInfo> adapter = oooOO0O;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        ShareToFriendsActivity shareToFriendsActivity = this.f25893OooO0Oo;
        com.yalla.yalla.ui.adapter.o000OO00 o000oo02 = shareToFriendsActivity.f25737OooOoO;
        if (o000oo02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o000oo02 = null;
        }
        if (o000oo02.f27542OooOOo) {
            com.yalla.yalla.ui.adapter.o000OO00 o000oo03 = shareToFriendsActivity.f25737OooOoO;
            if (o000oo03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                o000oo03 = null;
            }
            com.yalla.yalla.ui.adapter.o000OO00.OooO0oO(o000oo03, iIntValue, 0L, new o00O(shareToFriendsActivity), 2);
            com.yalla.yalla.ui.adapter.o000OO00 o000oo04 = shareToFriendsActivity.f25739OooOoOO;
            if (o000oo04 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                o000oo01 = null;
            } else {
                o000oo01 = o000oo04;
            }
            com.yalla.yalla.ui.adapter.o000OO00.OooO0oO(o000oo01, 0, adapter.getData(iIntValue).getFriend().getFriendId(), null, 5);
            ShareToFriendsActivity.OooOo(shareToFriendsActivity);
        } else {
            p587o0oOooo.o0OO000.OooO00o("102258");
            long friendId = adapter.getData(iIntValue).getFriend().getFriendId();
            UserInfo userInfo = adapter.getData(iIntValue).getUserInfo();
            String strValueOf = String.valueOf(userInfo != null ? userInfo.getUserName() : null);
            UserInfo userInfo2 = adapter.getData(iIntValue).getUserInfo();
            shareToFriendsActivity.OooOoo(friendId, strValueOf, String.valueOf(userInfo2 != null ? userInfo2.getUserHeader() : null));
        }
        return Unit.INSTANCE;
    }
}

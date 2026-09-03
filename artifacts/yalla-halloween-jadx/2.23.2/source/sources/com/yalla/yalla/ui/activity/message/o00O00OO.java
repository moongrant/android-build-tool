package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO extends Lambda implements Function3<View, Integer, UserInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SearchFriendActivity f25427OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(SearchFriendActivity searchFriendActivity) {
        super(3);
        this.f25427OooO0Oo = searchFriendActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(View view, Integer num, UserInfo userInfo) {
        UserInfo userInfo2 = userInfo;
        o0oo0000.OooO00o.OooO0O0("104016");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        SearchFriendActivity searchFriendActivity = this.f25427OooO0Oo;
        searchFriendActivity.getClass();
        Intrinsics.checkNotNull(userInfo2);
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, searchFriendActivity, androidx.media3.session.o0000O00.OooO00o(userInfo2.getUserId()), false, 12);
        return Unit.INSTANCE;
    }
}

package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.FriendInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<FriendInfo>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f25673OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(AtFriendsActivity atFriendsActivity) {
        super(3);
        this.f25673OooO0Oo = atFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(p400o0Oo0OO.OooOO0O<FriendInfo> oooOO0O, View view, Integer num) {
        p400o0Oo0OO.OooOO0O<FriendInfo> adapter = oooOO0O;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        AtFriendsActivity.OooOo(this.f25673OooO0Oo, adapter.getData(iIntValue), iIntValue);
        return Unit.INSTANCE;
    }
}

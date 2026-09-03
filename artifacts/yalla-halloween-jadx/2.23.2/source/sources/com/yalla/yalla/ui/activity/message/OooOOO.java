package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.FriendInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends Lambda implements Function3<h3<FriendInfo>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f25216OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(AtFriendsActivity atFriendsActivity) {
        super(3);
        this.f25216OooO0Oo = atFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(h3<FriendInfo> h3Var, View view, Integer num) {
        h3<FriendInfo> adapter = h3Var;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        AtFriendsActivity.OooOo(this.f25216OooO0Oo, adapter.getData(iIntValue), iIntValue);
        return Unit.INSTANCE;
    }
}

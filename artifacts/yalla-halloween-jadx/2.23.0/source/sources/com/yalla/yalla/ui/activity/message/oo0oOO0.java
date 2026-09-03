package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oOO0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f26008OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(ShareToFriendsActivity shareToFriendsActivity) {
        super(1);
        this.f26008OooO0Oo = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = ShareToFriendsActivity.f25730Oooo00o;
        this.f26008OooO0Oo.OooOoo0(it);
        return Unit.INSTANCE;
    }
}

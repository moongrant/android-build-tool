package com.yalla.yalla.ui.fragment.mainroom;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p382o0OOoo0o.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainRoomFragment f28499OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(MainRoomFragment mainRoomFragment) {
        super(0);
        this.f28499OooO0Oo = mainRoomFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f28499OooO0Oo.getActivity();
        String message = "TestFun \nAppInfo.isReleaseNetEnv：" + o00Ooo.OooO0o() + " \nBuildConfig.DEBUG = false";
        Intrinsics.checkNotNullParameter(message, "message");
        return Unit.INSTANCE;
    }
}

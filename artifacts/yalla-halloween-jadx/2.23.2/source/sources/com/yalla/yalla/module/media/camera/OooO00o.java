package com.yalla.yalla.module.media.camera;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.GlobalScope;
import p460o0Ooo0o.o00O0O00;
import p460o0Ooo0o.o00O0OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CameraActivity f23806OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(CameraActivity cameraActivity) {
        super(0);
        this.f23806OooO0Oo = cameraActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lazy lazy = o00O0OO0.f47783OooO00o;
        com.code.android.util.OooOOO.OooO0O0(GlobalScope.INSTANCE, new o00O0O00(0L, null));
        this.f23806OooO0Oo.finish();
        return Unit.INSTANCE;
    }
}

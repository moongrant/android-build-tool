package com.yalla.yalla.module.media.camera;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.GlobalScope;
import p468o0OoooO0.o0OO0;
import p468o0OoooO0.oo0ooO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CameraActivity f24273OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(CameraActivity cameraActivity) {
        super(0);
        this.f24273OooO0Oo = cameraActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lazy lazy = o0OO0.f46906OooO00o;
        com.code.android.util.OooOOO.OooO0O0(GlobalScope.INSTANCE, new oo0ooO(0L, null));
        this.f24273OooO0Oo.finish();
        return Unit.INSTANCE;
    }
}

package com.yy.yyeva.view;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p612o0oo0OoO.o5;
import p615o0oo0o0.o000oOoO;
import p620o0oo0oO0.o000OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 implements o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EvaAnimViewV3 f32466OooO0Oo;

    public OooO0O0(EvaAnimViewV3 evaAnimViewV3) {
        this.f32466OooO0Oo = evaAnimViewV3;
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onFailed(int i, @Nullable String str) {
        o000oOoO o000oooo2 = this.f32466OooO0Oo.evaAnimListener;
        if (o000oooo2 != null) {
            o000oooo2.onFailed(i, str);
        }
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onVideoComplete() {
        EvaAnimViewV3 evaAnimViewV3 = this.f32466OooO0Oo;
        evaAnimViewV3.hide();
        o000oOoO o000oooo2 = evaAnimViewV3.evaAnimListener;
        if (o000oooo2 != null) {
            o000oooo2.onVideoComplete();
        }
    }

    @Override // p615o0oo0o0.o000oOoO
    public final boolean onVideoConfigReady(@NotNull o5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        EvaAnimViewV3 evaAnimViewV3 = this.f32466OooO0Oo;
        o000OOo0 o000ooo1 = evaAnimViewV3.scaleTypeUtil;
        int i = config.f57421OooO00o;
        int i2 = config.f57422OooO0O0;
        o000ooo1.f57597OooO0o = i;
        o000ooo1.f57599OooO0oO = i2;
        o000oOoO o000oooo2 = evaAnimViewV3.evaAnimListener;
        if (o000oooo2 != null) {
            return o000oooo2.onVideoConfigReady(config);
        }
        Intrinsics.checkNotNullParameter(config, "config");
        return true;
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onVideoDestroy() {
        EvaAnimViewV3 evaAnimViewV3 = this.f32466OooO0Oo;
        evaAnimViewV3.hide();
        o000oOoO o000oooo2 = evaAnimViewV3.evaAnimListener;
        if (o000oooo2 != null) {
            o000oooo2.onVideoDestroy();
        }
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onVideoRender(int i, @Nullable o5 o5Var) {
        o000oOoO o000oooo2 = this.f32466OooO0Oo.evaAnimListener;
        if (o000oooo2 != null) {
            o000oooo2.onVideoRender(i, o5Var);
        }
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onVideoRestart() {
        o000oOoO o000oooo2 = this.f32466OooO0Oo.evaAnimListener;
        if (o000oooo2 != null) {
            o000oooo2.onVideoRestart();
        }
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onVideoStart() {
        o000oOoO o000oooo2 = this.f32466OooO0Oo.evaAnimListener;
        if (o000oooo2 != null) {
            o000oooo2.onVideoStart();
        }
    }
}

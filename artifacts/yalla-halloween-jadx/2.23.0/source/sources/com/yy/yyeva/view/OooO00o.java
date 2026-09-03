package com.yy.yyeva.view;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p607o0oo0OOo.k1;
import p610o0oo0Ooo.q1;
import p614o0oo0o0O.o00oOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o implements q1 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EvaAnimView f33000OooO0Oo;

    public OooO00o(EvaAnimView evaAnimView) {
        this.f33000OooO0Oo = evaAnimView;
    }

    @Override // p610o0oo0Ooo.q1
    public final void onFailed(int i, @Nullable String str) {
        q1 q1Var = this.f33000OooO0Oo.f32979OooO0oo;
        if (q1Var != null) {
            q1Var.onFailed(i, str);
        }
    }

    @Override // p610o0oo0Ooo.q1
    public final void onVideoComplete() {
        int i = EvaAnimView.f32973OooOOo;
        EvaAnimView evaAnimView = this.f33000OooO0Oo;
        evaAnimView.OooO0OO();
        q1 q1Var = evaAnimView.f32979OooO0oo;
        if (q1Var != null) {
            q1Var.onVideoComplete();
        }
    }

    @Override // p610o0oo0Ooo.q1
    public final boolean onVideoConfigReady(@NotNull k1 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        EvaAnimView evaAnimView = this.f33000OooO0Oo;
        o00oOoo o00oooo2 = evaAnimView.f32981OooOO0O;
        int i = config.f56906OooO00o;
        int i2 = config.f56907OooO0O0;
        o00oooo2.f57039OooO0o = i;
        o00oooo2.f57041OooO0oO = i2;
        q1 q1Var = evaAnimView.f32979OooO0oo;
        if (q1Var != null) {
            return q1Var.onVideoConfigReady(config);
        }
        Intrinsics.checkNotNullParameter(config, "config");
        return true;
    }

    @Override // p610o0oo0Ooo.q1
    public final void onVideoDestroy() {
        int i = EvaAnimView.f32973OooOOo;
        EvaAnimView evaAnimView = this.f33000OooO0Oo;
        evaAnimView.OooO0OO();
        q1 q1Var = evaAnimView.f32979OooO0oo;
        if (q1Var != null) {
            q1Var.onVideoDestroy();
        }
    }

    @Override // p610o0oo0Ooo.q1
    public final void onVideoRender(int i, @Nullable k1 k1Var) {
        q1 q1Var = this.f33000OooO0Oo.f32979OooO0oo;
        if (q1Var != null) {
            q1Var.onVideoRender(i, k1Var);
        }
    }

    @Override // p610o0oo0Ooo.q1
    public final void onVideoRestart() {
        q1 q1Var = this.f33000OooO0Oo.f32979OooO0oo;
        if (q1Var != null) {
            q1Var.onVideoRestart();
        }
    }

    @Override // p610o0oo0Ooo.q1
    public final void onVideoStart() {
        q1 q1Var = this.f33000OooO0Oo.f32979OooO0oo;
        if (q1Var != null) {
            q1Var.onVideoStart();
        }
    }
}

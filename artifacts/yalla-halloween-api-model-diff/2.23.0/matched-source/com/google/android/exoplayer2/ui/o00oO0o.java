package com.google.android.exoplayer2.ui;

import android.view.View;
import com.android.billingclient.api.o0000OO0;
import com.yalla.yalla.ui.view.SetLuckyNumberLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.p4;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00oO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f14131OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f14132OooO0o0;

    public /* synthetic */ o00oO0o(Object obj, int i) {
        this.f14131OooO0Oo = i;
        this.f14132OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f14131OooO0Oo;
        Object obj = this.f14132OooO0o0;
        switch (i) {
            case 0:
                StyledPlayerControlView.OooO00o((StyledPlayerControlView) obj);
                break;
            case 1:
                p4 this$0 = (p4) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0000OO0.OooO0O0().OooO0o("cancel", true);
                this$0.getClass();
                this$0.OooO0OO();
                break;
            default:
                SetLuckyNumberLayout this$1 = (SetLuckyNumberLayout) obj;
                int i2 = SetLuckyNumberLayout.f30669OooO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0(5);
                this$1.f30673OooO0oO = 5;
                Function1<? super Integer, Unit> function1 = this$1.f30670OooO0Oo;
                if (function1 != null) {
                    function1.invoke(5);
                }
                break;
        }
    }
}

package com.facebook.internal;

import com.yalla.yalla.ui.view.MomentsMessagesEditView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12816Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12817Oooo0oO;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f12816Oooo0o = i;
        this.f12817Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12816Oooo0o) {
            case 0:
                FacebookWebFallbackDialog.m178cancel$lambda0((FacebookWebFallbackDialog) this.f12817Oooo0oO);
                break;
            default:
                MomentsMessagesEditView this$0 = (MomentsMessagesEditView) this.f12817Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.setVisibility(0);
                this$0.OooO0O0(true, false);
                break;
        }
    }
}

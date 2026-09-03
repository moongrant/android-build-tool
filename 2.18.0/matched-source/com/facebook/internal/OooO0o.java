package com.facebook.internal;

import com.yalla.yalla.ui.view.MomentsMessagesEditView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12832Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12833OoooO00;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f12832Oooo = i;
        this.f12833OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12832Oooo) {
            case 0:
                FacebookWebFallbackDialog.m178cancel$lambda0((FacebookWebFallbackDialog) this.f12833OoooO00);
                break;
            default:
                MomentsMessagesEditView this$0 = (MomentsMessagesEditView) this.f12833OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.setVisibility(0);
                this$0.OooO0O0(true, false);
                break;
        }
    }
}

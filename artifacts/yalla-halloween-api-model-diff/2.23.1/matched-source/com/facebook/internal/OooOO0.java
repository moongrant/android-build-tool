package com.facebook.internal;

import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13715OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f13716OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f13715OooO0Oo = i;
        this.f13716OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13715OooO0Oo;
        Object obj = this.f13716OooO0o0;
        switch (i) {
            case 0:
                ((FetchedAppSettingsManager.FetchedAppSettingsCallback) obj).onError();
                break;
            default:
                MomentDetailCommentFragment.smoothScrollToPositionCommentMessageIndex$lambda$13((MomentDetailCommentFragment) obj);
                break;
        }
    }
}

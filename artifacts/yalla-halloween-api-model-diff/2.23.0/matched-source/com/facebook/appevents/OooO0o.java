package com.facebook.appevents;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f10583OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f10584OooO0o0;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f10583OooO0Oo = i;
        this.f10584OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10583OooO0Oo;
        Object obj = this.f10584OooO0o0;
        switch (i) {
            case 0:
                AppEventQueue.m4058flush$lambda2((FlushReason) obj);
                break;
            default:
                com.google.android.exoplayer2.source.Oooo0 oooo0 = (com.google.android.exoplayer2.source.Oooo0) obj;
                if (!oooo0.f13102Oooo0oo) {
                    com.google.android.exoplayer2.source.OooOOO.OooO00o oooO00o = oooo0.f13083OooOo00;
                    oooO00o.getClass();
                    oooO00o.OooO00o(oooo0);
                }
                break;
        }
    }
}

package com.yalla.yalla.mixedroom;

import com.yalla.yalla.ui.view.BubbleView;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23032OooO0Oo = 20;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f23033OooO0o0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BubbleView bubbleView = o000.this.f23033OooO0o0.f22966OooOoO0;
            if (bubbleView != null) {
                bubbleView.OooO00o();
            }
        }
    }

    public o000(MixedRoomActivity mixedRoomActivity) {
        this.f23033OooO0o0 = mixedRoomActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            int i2 = this.f23032OooO0Oo;
            MixedRoomActivity mixedRoomActivity = this.f23033OooO0o0;
            if (i >= i2) {
                mixedRoomActivity.f22975Oooo00O = false;
                return;
            }
            mixedRoomActivity.runOnUiThread(new OooO00o());
            try {
                Thread.sleep(250L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

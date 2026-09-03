package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f11034OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f11035OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f11036OooO0OO;

    public final class OooO00o extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final InterfaceC0196OooO0O0 f11037OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Handler f11039OooO0o0;

        public OooO00o(Handler handler, OooOOO.OooO0O0 oooO0O0) {
            this.f11039OooO0o0 = handler;
            this.f11037OooO0Oo = oooO0O0;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f11039OooO0o0.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (OooO0O0.this.f11036OooO0OO) {
                OooOOO.this.o00000OO(-1, 3, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC0196OooO0O0 {
    }

    public OooO0O0(Context context, Handler handler, OooOOO.OooO0O0 oooO0O0) {
        this.f11034OooO00o = context.getApplicationContext();
        this.f11035OooO0O0 = new OooO00o(handler, oooO0O0);
    }

    public final void OooO00o() {
        if (this.f11036OooO0OO) {
            this.f11034OooO00o.unregisterReceiver(this.f11035OooO0O0);
            this.f11036OooO0OO = false;
        }
    }
}

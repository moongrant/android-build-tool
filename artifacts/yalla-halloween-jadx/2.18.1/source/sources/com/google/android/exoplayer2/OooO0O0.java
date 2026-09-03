package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f13192OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f13193OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f13194OooO0OO;

    public final class OooO00o extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final InterfaceC0095OooO0O0 f13195Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Handler f13196Oooo0oO;

        public OooO00o(Handler handler, InterfaceC0095OooO0O0 interfaceC0095OooO0O0) {
            this.f13196Oooo0oO = handler;
            this.f13195Oooo0o = interfaceC0095OooO0O0;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f13196Oooo0oO.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (OooO0O0.this.f13194OooO0OO) {
                Oooo000.this.OooOo0O(false, -1, 3);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC0095OooO0O0 {
    }

    public OooO0O0(Context context, Handler handler, InterfaceC0095OooO0O0 interfaceC0095OooO0O0) {
        this.f13192OooO00o = context.getApplicationContext();
        this.f13193OooO0O0 = new OooO00o(handler, interfaceC0095OooO0O0);
    }

    public final void OooO00o() {
        if (this.f13194OooO0OO) {
            this.f13192OooO00o.unregisterReceiver(this.f13193OooO0O0);
            this.f13194OooO0OO = false;
        }
    }
}

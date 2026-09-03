package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f7189OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RunnableC0143OooO00o f7190OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f7191OooO0OO;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class RunnableC0143OooO00o extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0O0 f7192OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Handler f7194OooO0o0;

        public RunnableC0143OooO00o(Handler handler, OooO.OooO0O0 oooO0O0) {
            this.f7194OooO0o0 = handler;
            this.f7192OooO0Oo = oooO0O0;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f7194OooO0o0.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (OooO00o.this.f7191OooO0OO) {
                OooO.this.o000000(-1, 3, false);
            }
        }
    }

    public interface OooO0O0 {
    }

    public OooO00o(Context context, Handler handler, OooO.OooO0O0 oooO0O0) {
        this.f7189OooO00o = context.getApplicationContext();
        this.f7190OooO0O0 = new RunnableC0143OooO00o(handler, oooO0O0);
    }

    public final void OooO00o() {
        if (this.f7191OooO0OO) {
            this.f7189OooO00o.unregisterReceiver(this.f7190OooO0O0);
            this.f7191OooO0OO = false;
        }
    }
}

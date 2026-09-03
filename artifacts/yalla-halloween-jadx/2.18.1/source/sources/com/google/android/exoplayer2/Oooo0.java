package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f13411OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f13412OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f13413OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f13414OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AudioManager f13415OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f13416OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0 f13417OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f13418OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f13419OooO0oo;

    public interface OooO00o {
    }

    public final class OooO0O0 extends BroadcastReceiver {
        public OooO0O0() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Oooo0 oooo0 = Oooo0.this;
            oooo0.f13413OooO0O0.post(new o000O(oooo0, 0));
        }
    }

    public Oooo0(Context context, Handler handler, OooO00o oooO00o) {
        Context applicationContext = context.getApplicationContext();
        this.f13412OooO00o = applicationContext;
        this.f13413OooO0O0 = handler;
        this.f13414OooO0OO = oooO00o;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        o00000O0.OooO0o(audioManager);
        this.f13415OooO0Oo = audioManager;
        this.f13416OooO0o = 3;
        this.f13418OooO0oO = audioManager.getStreamVolume(3);
        this.f13419OooO0oo = OooO0O0(audioManager, this.f13416OooO0o);
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f13417OooO0o0 = oooO0O0;
        applicationContext.registerReceiver(oooO0O0, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
    }

    public static boolean OooO0O0(AudioManager audioManager, int i) {
        if (o000OOo0.f36740OooO00o >= 23) {
            return audioManager.isStreamMute(i);
        }
        return audioManager.getStreamVolume(i) == 0;
    }

    public final int OooO00o() {
        if (o000OOo0.f36740OooO00o >= 28) {
            return this.f13415OooO0Oo.getStreamMinVolume(this.f13416OooO0o);
        }
        return 0;
    }

    public final void OooO0OO() {
        int streamVolume = this.f13415OooO0Oo.getStreamVolume(this.f13416OooO0o);
        boolean zOooO0O0 = OooO0O0(this.f13415OooO0Oo, this.f13416OooO0o);
        if (this.f13418OooO0oO == streamVolume && this.f13419OooO0oo == zOooO0O0) {
            return;
        }
        this.f13418OooO0oO = streamVolume;
        this.f13419OooO0oo = zOooO0O0;
        Iterator<p291o0O0Oo.OooO0O0> it = Oooo000.this.f13421OooO.iterator();
        while (it.hasNext()) {
            it.next().OooO00o();
        }
    }
}

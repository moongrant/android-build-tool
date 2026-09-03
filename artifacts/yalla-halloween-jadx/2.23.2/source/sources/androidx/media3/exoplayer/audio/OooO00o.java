package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import o000O0Oo.o0OoOo0;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f7516OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f7517OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Handler f7518OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final OooO0O0 f7519OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final OooO0OO f7520OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final OooO0o f7521OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o000O0Oo.OooO00o f7522OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f7523OooO0oo;

    public interface OooO {
        void OooO00o(o000O0Oo.OooO00o oooO00o);
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.audio.OooO00o$OooO00o, reason: collision with other inner class name */
    @RequiresApi(23)
    public static final class C0146OooO00o {
        @DoNotInline
        public static void OooO00o(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        @DoNotInline
        public static void OooO0O0(Context context, AudioDeviceCallback audioDeviceCallback) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    @RequiresApi(23)
    public final class OooO0O0 extends AudioDeviceCallback {
        public OooO0O0() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            OooO00o oooO00o = OooO00o.this;
            OooO00o.OooO00o(oooO00o, o000O0Oo.OooO00o.OooO00o(oooO00o.f7516OooO00o));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            OooO00o oooO00o = OooO00o.this;
            OooO00o.OooO00o(oooO00o, o000O0Oo.OooO00o.OooO00o(oooO00o.f7516OooO00o));
        }
    }

    public final class OooO0OO extends ContentObserver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f7525OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Uri f7526OooO0O0;

        public OooO0OO(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f7525OooO00o = contentResolver;
            this.f7526OooO0O0 = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            OooO00o oooO00o = OooO00o.this;
            OooO00o.OooO00o(oooO00o, o000O0Oo.OooO00o.OooO00o(oooO00o.f7516OooO00o));
        }
    }

    public final class OooO0o extends BroadcastReceiver {
        public OooO0o() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            OooO00o.OooO00o(OooO00o.this, o000O0Oo.OooO00o.OooO0O0(context, intent));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    public OooO00o(Context context, o0OoOo0 o0oooo1) {
        boolean z;
        Context applicationContext = context.getApplicationContext();
        this.f7516OooO00o = applicationContext;
        this.f7517OooO0O0 = o0oooo1;
        Handler handlerOooOOO0 = o00.OooOOO0(null);
        this.f7518OooO0OO = handlerOooOOO0;
        int i = o00.f34910OooO00o;
        this.f7519OooO0Oo = i >= 23 ? new OooO0O0() : null;
        this.f7521OooO0o0 = i >= 21 ? new OooO0o() : null;
        o000O0Oo.OooO00o oooO00o = o000O0Oo.OooO00o.f34240OooO0OO;
        if (i >= 17) {
            String str = o00.f34912OooO0OO;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        Uri uriFor = z ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f7520OooO0o = uriFor != null ? new OooO0OO(handlerOooOOO0, applicationContext.getContentResolver(), uriFor) : null;
    }

    public static void OooO00o(OooO00o oooO00o, o000O0Oo.OooO00o oooO00o2) {
        if (!oooO00o.f7523OooO0oo || oooO00o2.equals(oooO00o.f7522OooO0oO)) {
            return;
        }
        oooO00o.f7522OooO0oO = oooO00o2;
        oooO00o.f7517OooO0O0.OooO00o(oooO00o2);
    }
}

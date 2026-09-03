package com.google.android.exoplayer2.audio;

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
import android.os.Looper;
import android.provider.Settings;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p205o00o0oO0.o0000Ooo;
import p205o00o0oO0.o000OO0O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f11593OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f11594OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Handler f11595OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final C0200OooO0O0 f11596OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final OooO0OO f11597OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final OooO0o f11598OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0000Ooo f11599OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f11600OooO0oo;

    public interface OooO {
        void OooO00o(o0000Ooo o0000ooo);
    }

    @RequiresApi(23)
    public static final class OooO00o {
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

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @RequiresApi(23)
    public final class C0200OooO0O0 extends AudioDeviceCallback {
        public C0200OooO0O0() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            OooO0O0 oooO0O0 = OooO0O0.this;
            OooO0O0.OooO00o(oooO0O0, o0000Ooo.OooO00o(oooO0O0.f11593OooO00o));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            OooO0O0 oooO0O0 = OooO0O0.this;
            OooO0O0.OooO00o(oooO0O0, o0000Ooo.OooO00o(oooO0O0.f11593OooO00o));
        }
    }

    public final class OooO0OO extends ContentObserver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f11602OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Uri f11603OooO0O0;

        public OooO0OO(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f11602OooO00o = contentResolver;
            this.f11603OooO0O0 = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            OooO0O0 oooO0O0 = OooO0O0.this;
            OooO0O0.OooO00o(oooO0O0, o0000Ooo.OooO00o(oooO0O0.f11593OooO00o));
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
            OooO0O0.OooO00o(OooO0O0.this, o0000Ooo.OooO0O0(context, intent));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    public OooO0O0(Context context, o000OO0O o000oo0o2) {
        boolean z;
        Context applicationContext = context.getApplicationContext();
        this.f11593OooO00o = applicationContext;
        this.f11594OooO0O0 = o000oo0o2;
        int i = o0O00.f40595OooO00o;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f11595OooO0OO = handler;
        int i2 = o0O00.f40595OooO00o;
        this.f11596OooO0Oo = i2 >= 23 ? new C0200OooO0O0() : null;
        this.f11598OooO0o0 = i2 >= 21 ? new OooO0o() : null;
        o0000Ooo o0000ooo = o0000Ooo.f39338OooO0OO;
        if (i2 >= 17) {
            String str = o0O00.f40597OooO0OO;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        Uri uriFor = z ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f11597OooO0o = uriFor != null ? new OooO0OO(handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public static void OooO00o(OooO0O0 oooO0O0, o0000Ooo o0000ooo) {
        if (!oooO0O0.f11600OooO0oo || o0000ooo.equals(oooO0O0.f11599OooO0oO)) {
            return;
        }
        oooO0O0.f11599OooO0oO = o0000ooo;
        oooO0O0.f11594OooO0O0.OooO00o(o0000ooo);
    }
}

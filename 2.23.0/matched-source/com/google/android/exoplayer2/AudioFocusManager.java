package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.audio.OooO00o;
import com.google.android.exoplayer2.util.Log;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p101o000oo.Oooo000;
import p203o00o0o0o.o0000O0;
import p203o00o0o0o.o0000O0O;
import p203o00o0o0o.o000OO;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AudioFocusManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AudioManager f10886OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f10887OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f10888OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.audio.OooO00o f10889OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f10890OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f10891OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f10892OooO0oO = 1.0f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public AudioFocusRequest f10893OooO0oo;

    public class OooO00o implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Handler f10894OooO0Oo;

        public OooO00o(Handler handler) {
            this.f10894OooO0Oo = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i) {
            this.f10894OooO0Oo.post(new Runnable() { // from class: o00o0o0o.o0000O
                @Override // java.lang.Runnable
                public final void run() {
                    AudioFocusManager audioFocusManager = AudioFocusManager.this;
                    audioFocusManager.getClass();
                    int i2 = i;
                    if (i2 == -3 || i2 == -2) {
                        if (i2 != -2) {
                            OooO00o oooO00o = audioFocusManager.f10889OooO0Oo;
                            if (!(oooO00o != null && oooO00o.f11587OooO0Oo == 1)) {
                                audioFocusManager.OooO0Oo(3);
                                return;
                            }
                        }
                        audioFocusManager.OooO0O0(0);
                        audioFocusManager.OooO0Oo(2);
                        return;
                    }
                    if (i2 == -1) {
                        audioFocusManager.OooO0O0(-1);
                        audioFocusManager.OooO00o();
                    } else if (i2 != 1) {
                        Oooo000.OooO0O0("Unknown focus change type: ", i2, "AudioFocusManager");
                    } else {
                        audioFocusManager.OooO0Oo(1);
                        audioFocusManager.OooO0O0(1);
                    }
                }
            });
        }
    }

    public interface OooO0O0 {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public AudioFocusManager(Context context, Handler handler, OooOOO.OooO0O0 oooO0O0) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f10886OooO00o = audioManager;
        this.f10888OooO0OO = oooO0O0;
        this.f10887OooO0O0 = new OooO00o(handler);
        this.f10891OooO0o0 = 0;
    }

    public final void OooO00o() {
        if (this.f10891OooO0o0 == 0) {
            return;
        }
        int i = o0O00.f40595OooO00o;
        AudioManager audioManager = this.f10886OooO00o;
        if (i >= 26) {
            AudioFocusRequest audioFocusRequest = this.f10893OooO0oo;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f10887OooO0O0);
        }
        OooO0Oo(0);
    }

    public final void OooO0O0(int i) {
        OooO0O0 oooO0O0 = this.f10888OooO0OO;
        if (oooO0O0 != null) {
            OooOOO oooOOO = OooOOO.this;
            boolean zOooOOO = oooOOO.OooOOO();
            int i2 = 1;
            if (zOooOOO && i != 1) {
                i2 = 2;
            }
            oooOOO.o00000OO(i, i2, zOooOOO);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void OooO0OO(@Nullable com.google.android.exoplayer2.audio.OooO00o oooO00o) {
        int i;
        if (o0O00.OooO00o(this.f10889OooO0Oo, oooO00o)) {
            return;
        }
        this.f10889OooO0Oo = oooO00o;
        if (oooO00o != null) {
            int i2 = oooO00o.f11588OooO0o;
            switch (i2) {
                case 0:
                    Log.OooO0o("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                    i = 1;
                    break;
                case 1:
                case 14:
                    i = 1;
                    break;
                case 2:
                case 4:
                    i = 2;
                    break;
                case 3:
                    i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                    i = 3;
                    break;
                case 11:
                    if (oooO00o.f11587OooO0Oo != 1) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    break;
                case 15:
                default:
                    p101o000oo.Oooo000.OooO0O0("Unidentified audio usage: ", i2, "AudioFocusManager");
                    i = 0;
                    break;
                case 16:
                    if (o0O00.f40595OooO00o < 19) {
                        i = 2;
                    } else {
                        i = 4;
                    }
                    break;
            }
        } else {
            i = 0;
        }
        this.f10890OooO0o = i;
        o00O000o.OooO0O0(i == 1 || i == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void OooO0Oo(int i) {
        if (this.f10891OooO0o0 == i) {
            return;
        }
        this.f10891OooO0o0 = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.f10892OooO0oO == f) {
            return;
        }
        this.f10892OooO0oO = f;
        OooO0O0 oooO0O0 = this.f10888OooO0OO;
        if (oooO0O0 != null) {
            OooOOO oooOOO = OooOOO.this;
            oooOOO.o000000(1, 2, Float.valueOf(oooOOO.f11126OoooOoO * oooOOO.f11102OooOoOO.f10892OooO0oO));
        }
    }

    public final int OooO0o0(int i, boolean z) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderOooO00o;
        int i2 = 1;
        if (i == 1 || this.f10890OooO0o != 1) {
            OooO00o();
            return z ? 1 : -1;
        }
        if (!z) {
            return -1;
        }
        if (this.f10891OooO0o0 != 1) {
            int i3 = o0O00.f40595OooO00o;
            OooO00o oooO00o = this.f10887OooO0O0;
            AudioManager audioManager = this.f10886OooO00o;
            if (i3 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f10893OooO0oo;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        o000OO.OooO00o();
                        builderOooO00o = o0000O0O.OooO00o(this.f10890OooO0o);
                    } else {
                        o000OO.OooO00o();
                        builderOooO00o = o0000O0.OooO00o(this.f10893OooO0oo);
                    }
                    com.google.android.exoplayer2.audio.OooO00o oooO00o2 = this.f10889OooO0Oo;
                    boolean z2 = oooO00o2 != null && oooO00o2.f11587OooO0Oo == 1;
                    oooO00o2.getClass();
                    this.f10893OooO0oo = builderOooO00o.setAudioAttributes(oooO00o2.OooO00o().f11592OooO00o).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(oooO00o).build();
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(this.f10893OooO0oo);
            } else {
                com.google.android.exoplayer2.audio.OooO00o oooO00o3 = this.f10889OooO0Oo;
                oooO00o3.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(oooO00o, o0O00.OooOo0o(oooO00o3.f11588OooO0o), this.f10890OooO0o);
            }
            if (iRequestAudioFocus == 1) {
                OooO0Oo(1);
            } else {
                OooO0Oo(0);
                i2 = -1;
            }
        }
        return i2;
    }
}

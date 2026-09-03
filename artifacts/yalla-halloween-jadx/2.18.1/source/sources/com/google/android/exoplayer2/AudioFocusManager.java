package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AudioFocusManager;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import o00O00O.OooO0OO;
import p293o0O0Oo0O.OooOOO0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioFocusManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AudioManager f13095OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f13096OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f13097OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public p293o0O0Oo0O.OooOOO0 f13098OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f13099OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f13100OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f13101OooO0oO = 1.0f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public AudioFocusRequest f13102OooO0oo;

    public class OooO00o implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Handler f13103OooO00o;

        public OooO00o(Handler handler) {
            this.f13103OooO00o = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i) {
            this.f13103OooO00o.post(new Runnable() { // from class: o0OooO0.o0O0O00
                @Override // java.lang.Runnable
                public final void run() {
                    AudioFocusManager.OooO00o oooO00o = this.f40571Oooo0o;
                    int i2 = i;
                    AudioFocusManager audioFocusManager = AudioFocusManager.this;
                    Objects.requireNonNull(audioFocusManager);
                    if (i2 == -3 || i2 == -2) {
                        if (i2 != -2) {
                            OooOOO0 oooOOO0 = audioFocusManager.f13098OooO0Oo;
                            if (!(oooOOO0 != null && oooOOO0.f35744OooO00o == 1)) {
                                audioFocusManager.OooO0OO(3);
                                return;
                            }
                        }
                        audioFocusManager.OooO0O0(0);
                        audioFocusManager.OooO0OO(2);
                        return;
                    }
                    if (i2 == -1) {
                        audioFocusManager.OooO0O0(-1);
                        audioFocusManager.OooO00o();
                    } else if (i2 != 1) {
                        OooO0OO.OooO0O0(38, "Unknown focus change type: ", i2, "AudioFocusManager");
                    } else {
                        audioFocusManager.OooO0OO(1);
                        audioFocusManager.OooO0O0(1);
                    }
                }
            });
        }
    }

    public interface OooO0O0 {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public AudioFocusManager(Context context, Handler handler, OooO0O0 oooO0O0) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f13095OooO00o = audioManager;
        this.f13097OooO0OO = oooO0O0;
        this.f13096OooO0O0 = new OooO00o(handler);
        this.f13100OooO0o0 = 0;
    }

    public final void OooO00o() {
        if (this.f13100OooO0o0 == 0) {
            return;
        }
        if (o000OOo0.f36740OooO00o >= 26) {
            AudioFocusRequest audioFocusRequest = this.f13102OooO0oo;
            if (audioFocusRequest != null) {
                this.f13095OooO00o.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f13095OooO00o.abandonAudioFocus(this.f13096OooO0O0);
        }
        OooO0OO(0);
    }

    public final void OooO0O0(int i) {
        OooO0O0 oooO0O0 = this.f13097OooO0OO;
        if (oooO0O0 != null) {
            Oooo000.OooO0O0 oooO0O1 = (Oooo000.OooO0O0) oooO0O0;
            boolean zOooOO0 = Oooo000.this.OooOO0();
            Oooo000.this.OooOo0O(zOooOO0, i, Oooo000.OooOO0O(zOooOO0, i));
        }
    }

    public final void OooO0OO(int i) {
        if (this.f13100OooO0o0 == i) {
            return;
        }
        this.f13100OooO0o0 = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.f13101OooO0oO == f) {
            return;
        }
        this.f13101OooO0oO = f;
        OooO0O0 oooO0O0 = this.f13097OooO0OO;
        if (oooO0O0 != null) {
            Oooo000 oooo000 = Oooo000.this;
            oooo000.OooOOOo(1, 2, Float.valueOf(oooo000.f13444OooOoO * oooo000.f13432OooOOO.f13101OooO0oO));
        }
    }

    public final int OooO0Oo(boolean z, int i) {
        int iRequestAudioFocus;
        int i2 = 1;
        if (i == 1 || this.f13099OooO0o != 1) {
            OooO00o();
            return z ? 1 : -1;
        }
        if (!z) {
            return -1;
        }
        if (this.f13100OooO0o0 != 1) {
            if (o000OOo0.f36740OooO00o >= 26) {
                AudioFocusRequest audioFocusRequest = this.f13102OooO0oo;
                if (audioFocusRequest == null) {
                    AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f13099OooO0o) : new AudioFocusRequest.Builder(this.f13102OooO0oo);
                    p293o0O0Oo0O.OooOOO0 oooOOO0 = this.f13098OooO0Oo;
                    boolean z2 = oooOOO0 != null && oooOOO0.f35744OooO00o == 1;
                    Objects.requireNonNull(oooOOO0);
                    this.f13102OooO0oo = builder.setAudioAttributes(oooOOO0.OooO00o()).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(this.f13096OooO0O0).build();
                }
                iRequestAudioFocus = this.f13095OooO00o.requestAudioFocus(this.f13102OooO0oo);
            } else {
                AudioManager audioManager = this.f13095OooO00o;
                OooO00o oooO00o = this.f13096OooO0O0;
                p293o0O0Oo0O.OooOOO0 oooOOO1 = this.f13098OooO0Oo;
                Objects.requireNonNull(oooOOO1);
                iRequestAudioFocus = audioManager.requestAudioFocus(oooO00o, o000OOo0.OooOo0(oooOOO1.f35746OooO0OO), this.f13099OooO0o);
            }
            if (iRequestAudioFocus == 1) {
                OooO0OO(1);
            } else {
                OooO0OO(0);
                i2 = -1;
            }
        }
        return i2;
    }
}

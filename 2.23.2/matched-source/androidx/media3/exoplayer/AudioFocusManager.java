package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o000O00O.OooOOOO;
import o000O00O.OooOo00;
import p070o000O0o.Oooo000;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class AudioFocusManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AudioManager f7090OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f7091OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f7092OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public androidx.media3.common.OooO00o f7093OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f7094OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f7095OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f7096OooO0oO = 1.0f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public AudioFocusRequest f7097OooO0oo;

    public class OooO00o implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Handler f7098OooO0Oo;

        public OooO00o(Handler handler) {
            this.f7098OooO0Oo = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            this.f7098OooO0Oo.post(new OooOo00(this, i, 0));
        }
    }

    public interface OooO0O0 {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public AudioFocusManager(Context context, Handler handler, OooO.OooO0O0 oooO0O0) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f7090OooO00o = audioManager;
        this.f7092OooO0OO = oooO0O0;
        this.f7091OooO0O0 = new OooO00o(handler);
        this.f7095OooO0o0 = 0;
    }

    public final void OooO00o() {
        if (this.f7095OooO0o0 == 0) {
            return;
        }
        int i = o00.f34910OooO00o;
        AudioManager audioManager = this.f7090OooO00o;
        if (i >= 26) {
            AudioFocusRequest audioFocusRequest = this.f7097OooO0oo;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f7091OooO0O0);
        }
        OooO0Oo(0);
    }

    public final void OooO0O0(int i) {
        OooO0O0 oooO0O0 = this.f7092OooO0OO;
        if (oooO0O0 != null) {
            OooO oooO = OooO.this;
            boolean zOooOoOO = oooO.OooOoOO();
            int i2 = 1;
            if (zOooOoOO && i != 1) {
                i2 = 2;
            }
            oooO.o000000(i, i2, zOooOoOO);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void OooO0OO(@Nullable androidx.media3.common.OooO00o oooO00o) {
        int i;
        if (o00.OooO00o(this.f7093OooO0Oo, oooO00o)) {
            return;
        }
        this.f7093OooO0Oo = oooO00o;
        if (oooO00o != null) {
            int i2 = oooO00o.f6350OooO0o;
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
                    if (oooO00o.f6349OooO0Oo != 1) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    break;
                case 15:
                default:
                    Oooo000.OooO00o("Unidentified audio usage: ", i2, "AudioFocusManager");
                    i = 0;
                    break;
                case 16:
                    if (o00.f34910OooO00o < 19) {
                        i = 2;
                    } else {
                        i = 4;
                    }
                    break;
            }
        } else {
            i = 0;
        }
        this.f7094OooO0o = i;
        o00Oo0.OooO0O0(i == 1 || i == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void OooO0Oo(int i) {
        if (this.f7095OooO0o0 == i) {
            return;
        }
        this.f7095OooO0o0 = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.f7096OooO0oO == f) {
            return;
        }
        this.f7096OooO0oO = f;
        OooO0O0 oooO0O0 = this.f7092OooO0OO;
        if (oooO0O0 != null) {
            OooO oooO = OooO.this;
            oooO.o00oO0O(1, 2, Float.valueOf(oooO.f7170OoooOo0 * oooO.f7147OooOoOO.f7096OooO0oO));
        }
    }

    public final int OooO0o0(int i, boolean z) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderOooO00o;
        int i2 = 1;
        if (i == 1 || this.f7094OooO0o != 1) {
            OooO00o();
            return z ? 1 : -1;
        }
        if (!z) {
            return -1;
        }
        if (this.f7095OooO0o0 != 1) {
            int i3 = o00.f34910OooO00o;
            OooO00o oooO00o = this.f7091OooO0O0;
            AudioManager audioManager = this.f7090OooO00o;
            if (i3 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f7097OooO0oo;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        OooOOOO.OooO00o();
                        builderOooO00o = o000O00O.OooOOO.OooO00o(this.f7094OooO0o);
                    } else {
                        OooOOOO.OooO00o();
                        builderOooO00o = o000O00O.OooOOO0.OooO00o(this.f7097OooO0oo);
                    }
                    androidx.media3.common.OooO00o oooO00o2 = this.f7093OooO0Oo;
                    boolean z2 = oooO00o2 != null && oooO00o2.f6349OooO0Oo == 1;
                    oooO00o2.getClass();
                    this.f7097OooO0oo = builderOooO00o.setAudioAttributes(oooO00o2.OooO0OO().f6354OooO00o).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(oooO00o).build();
                }
                iRequestAudioFocus = audioManager.requestAudioFocus(this.f7097OooO0oo);
            } else {
                androidx.media3.common.OooO00o oooO00o3 = this.f7093OooO0Oo;
                oooO00o3.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(oooO00o, o00.OooOo(oooO00o3.f6350OooO0o), this.f7094OooO0o);
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

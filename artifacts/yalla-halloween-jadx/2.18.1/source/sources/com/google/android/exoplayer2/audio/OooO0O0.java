package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.Objects;
import p293o0O0Oo0O.o00Oo0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f13554OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f13555OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f13556OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public AudioTrack f13557OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f13558OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o00Oo0 f13559OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f13560OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f13561OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f13562OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f13563OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f13564OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f13565OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Method f13566OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f13567OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f13568OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f13569OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f13570OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f13571OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f13572OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f13573OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f13574OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f13575OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f13576OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f13577OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f13578OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f13579OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f13580OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public long f13581OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f13582OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f13583OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f13584OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f13585Oooo000;

    public interface OooO00o {
        void OooO00o(long j);

        void OooO0O0(int i, long j);

        void OooO0OO(long j);

        void OooO0Oo(long j, long j2, long j3, long j4);

        void OooO0o0(long j, long j2, long j3, long j4);
    }

    public OooO0O0(OooO00o oooO00o) {
        this.f13555OooO00o = oooO00o;
        if (o000OOo0.f36740OooO00o >= 18) {
            try {
                this.f13566OooOOO = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f13556OooO0O0 = new long[10];
    }

    public final long OooO00o(long j) {
        return (j * 1000000) / ((long) this.f13561OooO0oO);
    }

    public final long OooO0O0() {
        AudioTrack audioTrack = this.f13557OooO0OO;
        Objects.requireNonNull(audioTrack);
        if (this.f13573OooOo != -9223372036854775807L) {
            return Math.min(this.f13580OooOoOO, this.f13578OooOoO + ((((SystemClock.elapsedRealtime() * 1000) - this.f13573OooOo) * ((long) this.f13561OooO0oO)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f13562OooO0oo) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f13574OooOo0 = this.f13572OooOOoo;
            }
            playbackHeadPosition += this.f13574OooOo0;
        }
        if (o000OOo0.f36740OooO00o <= 29) {
            if (playbackHeadPosition == 0 && this.f13572OooOOoo > 0 && playState == 3) {
                if (this.f13579OooOoO0 == -9223372036854775807L) {
                    this.f13579OooOoO0 = SystemClock.elapsedRealtime();
                }
                return this.f13572OooOOoo;
            }
            this.f13579OooOoO0 = -9223372036854775807L;
        }
        if (this.f13572OooOOoo > playbackHeadPosition) {
            this.f13575OooOo00++;
        }
        this.f13572OooOOoo = playbackHeadPosition;
        return playbackHeadPosition + (this.f13575OooOo00 << 32);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    public final boolean OooO0OO(long j) {
        boolean z;
        if (j <= OooO0O0()) {
            if (this.f13562OooO0oo) {
                AudioTrack audioTrack = this.f13557OooO0OO;
                Objects.requireNonNull(audioTrack);
                if (audioTrack.getPlayState() == 2 && OooO0O0() == 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void OooO0Oo() {
        this.f13565OooOO0o = 0L;
        this.f13577OooOo0o = 0;
        this.f13576OooOo0O = 0;
        this.f13567OooOOO0 = 0L;
        this.f13581OooOoo = 0L;
        this.f13585Oooo000 = 0L;
        this.f13564OooOO0O = false;
        this.f13557OooO0OO = null;
        this.f13559OooO0o = null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    public final void OooO0o0(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.f13557OooO0OO = audioTrack;
        this.f13558OooO0Oo = i2;
        this.f13560OooO0o0 = i3;
        this.f13559OooO0o = new o00Oo0(audioTrack);
        this.f13561OooO0oO = audioTrack.getSampleRate();
        if (z) {
            z2 = o000OOo0.f36740OooO00o < 23 && (i == 5 || i == 6);
        }
        this.f13562OooO0oo = z2;
        boolean zOooOoO = o000OOo0.OooOoO(i);
        this.f13571OooOOo0 = zOooOoO;
        this.f13554OooO = zOooOoO ? OooO00o(i3 / i2) : -9223372036854775807L;
        this.f13572OooOOoo = 0L;
        this.f13575OooOo00 = 0L;
        this.f13574OooOo0 = 0L;
        this.f13569OooOOOo = false;
        this.f13573OooOo = -9223372036854775807L;
        this.f13579OooOoO0 = -9223372036854775807L;
        this.f13570OooOOo = 0L;
        this.f13568OooOOOO = 0L;
        this.f13563OooOO0 = 1.0f;
    }
}

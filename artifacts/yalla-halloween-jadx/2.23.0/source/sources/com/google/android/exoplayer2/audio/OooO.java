package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import java.lang.reflect.Method;
import p205o00o0oO0.o000;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f11547OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f11548OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f11549OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public AudioTrack f11550OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f11551OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o000 f11552OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f11553OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f11554OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f11555OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f11556OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f11557OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f11558OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Method f11559OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f11560OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f11561OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f11562OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f11563OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f11564OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f11565OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f11566OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f11567OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f11568OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f11569OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f11570OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f11571OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f11572OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f11573OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public long f11574OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f11575OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f11576OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f11577OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f11578Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f11579Oooo00O;

    public interface OooO00o {
        void OooO00o(int i, long j);

        void OooO0O0(long j);

        void OooO0OO(long j);

        void OooO0Oo(long j, long j2, long j3, long j4);

        void OooO0o0(long j, long j2, long j3, long j4);
    }

    public OooO(DefaultAudioSink.OooOOOO oooOOOO) {
        this.f11548OooO00o = oooOOOO;
        if (o0O00.f40595OooO00o >= 18) {
            try {
                this.f11559OooOOO = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f11549OooO0O0 = new long[10];
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:60:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x010d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x011c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Code duplicated, block: B:68:0x013a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:71:0x015a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167  */
    /* JADX WARN: Code duplicated, block: B:74:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b5  */
    public final long OooO00o(boolean z) {
        boolean z2;
        long jOooO0O0;
        o000 o000Var;
        o000.OooO00o oooO00o;
        boolean timestamp;
        Method method;
        long j;
        long j2;
        long jOooO0O1;
        AudioTrack audioTrack = this.f11550OooO0OO;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        OooO00o oooO00o2 = this.f11548OooO00o;
        if (playState == 3) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.f11560OooOOO0 >= 30000) {
                long jOooO0O2 = (OooO0O0() * AnimationKt.MillisToNanos) / ((long) this.f11554OooO0oO);
                if (jOooO0O2 == 0) {
                    z2 = false;
                } else {
                    int i = this.f11570OooOo0o;
                    long jOooOo0O = o0O00.OooOo0O(jOooO0O2, this.f11556OooOO0) - jNanoTime;
                    long[] jArr = this.f11549OooO0O0;
                    jArr[i] = jOooOo0O;
                    this.f11570OooOo0o = (this.f11570OooOo0o + 1) % 10;
                    int i2 = this.f11566OooOo;
                    if (i2 < 10) {
                        this.f11566OooOo = i2 + 1;
                    }
                    this.f11560OooOOO0 = jNanoTime;
                    this.f11558OooOO0o = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f11566OooOo;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f11558OooOO0o = (jArr[i3] / ((long) i4)) + this.f11558OooOO0o;
                        i3++;
                    }
                    if (this.f11555OooO0oo) {
                        z2 = false;
                    } else {
                        o000Var = this.f11552OooO0o;
                        o000Var.getClass();
                        oooO00o = o000Var.f39307OooO00o;
                        if (oooO00o != null || jNanoTime - o000Var.f39312OooO0o0 < o000Var.f39310OooO0Oo) {
                            timestamp = false;
                        } else {
                            o000Var.f39312OooO0o0 = jNanoTime;
                            AudioTrack audioTrack2 = oooO00o.f39313OooO00o;
                            AudioTimestamp audioTimestamp = oooO00o.f39314OooO0O0;
                            timestamp = audioTrack2.getTimestamp(audioTimestamp);
                            if (timestamp) {
                                long j3 = audioTimestamp.framePosition;
                                if (oooO00o.f39316OooO0Oo > j3) {
                                    oooO00o.f39315OooO0OO++;
                                }
                                oooO00o.f39316OooO0Oo = j3;
                                oooO00o.f39317OooO0o0 = j3 + (oooO00o.f39315OooO0OO << 32);
                            }
                            int i5 = o000Var.f39308OooO0O0;
                            if (i5 != 0) {
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (timestamp) {
                                            o000Var.OooO00o();
                                        }
                                    } else if (!timestamp) {
                                        o000Var.OooO00o();
                                    }
                                } else if (!timestamp) {
                                    o000Var.OooO00o();
                                } else if (oooO00o.f39317OooO0o0 > o000Var.f39311OooO0o) {
                                    o000Var.OooO0O0(2);
                                }
                            } else if (timestamp) {
                                if (audioTimestamp.nanoTime / 1000 >= o000Var.f39309OooO0OO) {
                                    o000Var.f39311OooO0o = oooO00o.f39317OooO0o0;
                                    o000Var.OooO0O0(1);
                                } else {
                                    timestamp = false;
                                }
                            } else if (jNanoTime - o000Var.f39309OooO0OO > 500000) {
                                o000Var.OooO0O0(3);
                            }
                        }
                        if (timestamp) {
                            if (oooO00o != null) {
                                j = oooO00o.f39314OooO0O0.nanoTime / 1000;
                            } else {
                                j = -9223372036854775807L;
                            }
                            if (oooO00o != null) {
                                j2 = oooO00o.f39317OooO0o0;
                            } else {
                                j2 = -1;
                            }
                            jOooO0O1 = (OooO0O0() * AnimationKt.MillisToNanos) / ((long) this.f11554OooO0oO);
                            if (Math.abs(j - jNanoTime) > 5000000) {
                                this.f11548OooO00o.OooO0o0(j2, j, jNanoTime, jOooO0O1);
                                o000Var.OooO0O0(4);
                            } else if (Math.abs(((j2 * AnimationKt.MillisToNanos) / ((long) this.f11554OooO0oO)) - jOooO0O1) > 5000000) {
                                this.f11548OooO00o.OooO0Oo(j2, j, jNanoTime, jOooO0O1);
                                o000Var.OooO0O0(4);
                            } else if (o000Var.f39308OooO0O0 == 4) {
                                o000Var.OooO00o();
                            }
                        }
                        if (this.f11564OooOOo0 || (method = this.f11559OooOOO) == null || jNanoTime - this.f11563OooOOo < 500000) {
                            z2 = false;
                        } else {
                            try {
                                AudioTrack audioTrack3 = this.f11550OooO0OO;
                                audioTrack3.getClass();
                                z2 = false;
                                try {
                                    Integer num = (Integer) method.invoke(audioTrack3, new Object[0]);
                                    int i6 = o0O00.f40595OooO00o;
                                    long jIntValue = (((long) num.intValue()) * 1000) - this.f11547OooO;
                                    this.f11561OooOOOO = jIntValue;
                                    long jMax = Math.max(jIntValue, 0L);
                                    this.f11561OooOOOO = jMax;
                                    if (jMax > 5000000) {
                                        oooO00o2.OooO0O0(jMax);
                                        this.f11561OooOOOO = 0L;
                                    }
                                } catch (Exception unused) {
                                    this.f11559OooOOO = null;
                                }
                            } catch (Exception unused2) {
                                z2 = false;
                            }
                            this.f11563OooOOo = jNanoTime;
                        }
                    }
                }
            } else if (this.f11555OooO0oo) {
                z2 = false;
            } else {
                o000Var = this.f11552OooO0o;
                o000Var.getClass();
                oooO00o = o000Var.f39307OooO00o;
                if (oooO00o != null) {
                    timestamp = false;
                } else {
                    timestamp = false;
                }
                if (timestamp) {
                    if (oooO00o != null) {
                        j = oooO00o.f39314OooO0O0.nanoTime / 1000;
                    } else {
                        j = -9223372036854775807L;
                    }
                    if (oooO00o != null) {
                        j2 = oooO00o.f39317OooO0o0;
                    } else {
                        j2 = -1;
                    }
                    jOooO0O1 = (OooO0O0() * AnimationKt.MillisToNanos) / ((long) this.f11554OooO0oO);
                    if (Math.abs(j - jNanoTime) > 5000000) {
                        this.f11548OooO00o.OooO0o0(j2, j, jNanoTime, jOooO0O1);
                        o000Var.OooO0O0(4);
                    } else if (Math.abs(((j2 * AnimationKt.MillisToNanos) / ((long) this.f11554OooO0oO)) - jOooO0O1) > 5000000) {
                        this.f11548OooO00o.OooO0Oo(j2, j, jNanoTime, jOooO0O1);
                        o000Var.OooO0O0(4);
                    } else if (o000Var.f39308OooO0O0 == 4) {
                        o000Var.OooO00o();
                    }
                }
                if (this.f11564OooOOo0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        o000 o000Var2 = this.f11552OooO0o;
        o000Var2.getClass();
        boolean z3 = o000Var2.f39308OooO0O0 == 2 ? true : z2;
        if (z3) {
            o000.OooO00o oooO00o3 = o000Var2.f39307OooO00o;
            jOooO0O0 = o0O00.OooOOo(jNanoTime2 - (oooO00o3 != null ? oooO00o3.f39314OooO0O0.nanoTime / 1000 : -9223372036854775807L), this.f11556OooOO0) + (((oooO00o3 != null ? oooO00o3.f39317OooO0o0 : -1L) * AnimationKt.MillisToNanos) / ((long) this.f11554OooO0oO));
        } else {
            jOooO0O0 = this.f11566OooOo == 0 ? (OooO0O0() * AnimationKt.MillisToNanos) / ((long) this.f11554OooO0oO) : o0O00.OooOOo(this.f11558OooOO0o + jNanoTime2, this.f11556OooOO0);
            if (!z) {
                jOooO0O0 = Math.max(0L, jOooO0O0 - this.f11561OooOOOO);
            }
        }
        if (this.f11577OooOooo != z3) {
            this.f11579Oooo00O = this.f11576OooOooO;
            this.f11578Oooo000 = this.f11574OooOoo;
        }
        long j4 = jNanoTime2 - this.f11579Oooo00O;
        if (j4 < AnimationKt.MillisToNanos) {
            long jOooOOo = o0O00.OooOOo(j4, this.f11556OooOO0) + this.f11578Oooo000;
            long j5 = (j4 * 1000) / AnimationKt.MillisToNanos;
            jOooO0O0 = (((1000 - j5) * jOooOOo) + (jOooO0O0 * j5)) / 1000;
        }
        if (!this.f11557OooOO0O) {
            long j6 = this.f11574OooOoo;
            if (jOooO0O0 > j6) {
                this.f11557OooOO0O = true;
                oooO00o2.OooO0OO(System.currentTimeMillis() - o0O00.OoooOO0(o0O00.OooOo0O(o0O00.OoooOO0(jOooO0O0 - j6), this.f11556OooOO0)));
            }
        }
        this.f11576OooOooO = jNanoTime2;
        this.f11574OooOoo = jOooO0O0;
        this.f11577OooOooo = z3;
        return jOooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    public final long OooO0O0() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f11572OooOoO0;
        if (j != -9223372036854775807L) {
            return Math.min(this.f11575OooOoo0, this.f11573OooOoOO + ((o0O00.OooOOo((jElapsedRealtime * 1000) - j, this.f11556OooOO0) * ((long) this.f11554OooO0oO)) / AnimationKt.MillisToNanos));
        }
        if (jElapsedRealtime - this.f11565OooOOoo >= 5) {
            AudioTrack audioTrack = this.f11550OooO0OO;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f11555OooO0oo) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f11569OooOo0O = this.f11568OooOo00;
                    }
                    playbackHeadPosition += this.f11569OooOo0O;
                }
                if (o0O00.f40595OooO00o > 29) {
                    if (this.f11568OooOo00 > playbackHeadPosition) {
                        this.f11567OooOo0++;
                    }
                    this.f11568OooOo00 = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f11568OooOo00 <= 0 || playState != 3) {
                    this.f11571OooOoO = -9223372036854775807L;
                    if (this.f11568OooOo00 > playbackHeadPosition) {
                        this.f11567OooOo0++;
                    }
                    this.f11568OooOo00 = playbackHeadPosition;
                } else if (this.f11571OooOoO == -9223372036854775807L) {
                    this.f11571OooOoO = jElapsedRealtime;
                }
            }
            this.f11565OooOOoo = jElapsedRealtime;
        }
        return this.f11568OooOo00 + (this.f11567OooOo0 << 32);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    public final boolean OooO0OO(long j) {
        boolean z;
        if (j <= (OooO00o(false) * ((long) this.f11554OooO0oO)) / AnimationKt.MillisToNanos) {
            if (this.f11555OooO0oo) {
                AudioTrack audioTrack = this.f11550OooO0OO;
                audioTrack.getClass();
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
        this.f11558OooOO0o = 0L;
        this.f11566OooOo = 0;
        this.f11570OooOo0o = 0;
        this.f11560OooOOO0 = 0L;
        this.f11576OooOooO = 0L;
        this.f11579Oooo00O = 0L;
        this.f11557OooOO0O = false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    public final void OooO0o0(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.f11550OooO0OO = audioTrack;
        this.f11551OooO0Oo = i2;
        this.f11553OooO0o0 = i3;
        this.f11552OooO0o = new o000(audioTrack);
        this.f11554OooO0oO = audioTrack.getSampleRate();
        if (z) {
            z2 = o0O00.f40595OooO00o < 23 && (i == 5 || i == 6);
        }
        this.f11555OooO0oo = z2;
        boolean zOooo00o = o0O00.Oooo00o(i);
        this.f11564OooOOo0 = zOooo00o;
        this.f11547OooO = zOooo00o ? (((long) (i3 / i2)) * AnimationKt.MillisToNanos) / ((long) this.f11554OooO0oO) : -9223372036854775807L;
        this.f11568OooOo00 = 0L;
        this.f11567OooOo0 = 0L;
        this.f11569OooOo0O = 0L;
        this.f11562OooOOOo = false;
        this.f11572OooOoO0 = -9223372036854775807L;
        this.f11571OooOoO = -9223372036854775807L;
        this.f11563OooOOo = 0L;
        this.f11561OooOOOO = 0L;
        this.f11556OooOO0 = 1.0f;
    }
}

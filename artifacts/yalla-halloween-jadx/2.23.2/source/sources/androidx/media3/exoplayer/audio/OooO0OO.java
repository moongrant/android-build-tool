package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import java.lang.reflect.Method;
import o000O0Oo.OooOOO;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f7531OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f7532OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f7533OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public AudioTrack f7534OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f7535OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooOOO f7536OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f7537OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f7538OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f7539OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f7540OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f7541OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f7542OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Method f7543OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f7544OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f7545OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f7546OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f7547OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f7548OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f7549OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f7550OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f7551OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f7552OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f7553OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f7554OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f7555OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f7556OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f7557OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public long f7558OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f7559OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public long f7560OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f7561OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f7562Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f7563Oooo00O;

    public interface OooO00o {
        void OooO00o(int i, long j);

        void OooO0O0(long j);

        void OooO0OO(long j);

        void OooO0Oo(long j, long j2, long j3, long j4);

        void OooO0o0(long j, long j2, long j3, long j4);
    }

    public OooO0OO(DefaultAudioSink.OooOOOO oooOOOO) {
        this.f7532OooO00o = oooOOOO;
        if (o00.f34910OooO00o >= 18) {
            try {
                this.f7543OooOOO = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7533OooO0O0 = new long[10];
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0119  */
    /* JADX WARN: Code duplicated, block: B:65:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    /* JADX WARN: Code duplicated, block: B:70:0x0149  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    /* JADX WARN: Code duplicated, block: B:75:0x016e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac A[Catch: Exception -> 0x01b2, TRY_LEAVE, TryCatch #0 {Exception -> 0x01b2, blocks: (B:82:0x0184, B:84:0x01ac), top: B:121:0x0184 }] */
    public final long OooO00o(boolean z) {
        long jOooo0oo;
        OooOOO oooOOO;
        OooOOO.OooO00o oooO00o;
        boolean timestamp;
        Method method;
        long jMax;
        long j;
        long j2;
        long jOooo0oo2;
        AudioTrack audioTrack = this.f7534OooO0OO;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        OooO00o oooO00o2 = this.f7532OooO00o;
        if (playState == 3) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.f7544OooOOO0 >= 30000) {
                long jOooo0oo3 = o00.Oooo0oo(this.f7538OooO0oO, OooO0O0());
                if (jOooo0oo3 != 0) {
                    int i = this.f7554OooOo0o;
                    long jOooOo0o = o00.OooOo0o(jOooo0oo3, this.f7540OooOO0) - jNanoTime;
                    long[] jArr = this.f7533OooO0O0;
                    jArr[i] = jOooOo0o;
                    this.f7554OooOo0o = (this.f7554OooOo0o + 1) % 10;
                    int i2 = this.f7550OooOo;
                    if (i2 < 10) {
                        this.f7550OooOo = i2 + 1;
                    }
                    this.f7544OooOOO0 = jNanoTime;
                    this.f7542OooOO0o = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f7550OooOo;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f7542OooOO0o = (jArr[i3] / ((long) i4)) + this.f7542OooOO0o;
                        i3++;
                    }
                    if (!this.f7539OooO0oo) {
                        oooOOO = this.f7536OooO0o;
                        oooOOO.getClass();
                        oooO00o = oooOOO.f34258OooO00o;
                        if (oooO00o != null || jNanoTime - oooOOO.f34263OooO0o0 < oooOOO.f34261OooO0Oo) {
                            timestamp = false;
                        } else {
                            oooOOO.f34263OooO0o0 = jNanoTime;
                            AudioTrack audioTrack2 = oooO00o.f34264OooO00o;
                            AudioTimestamp audioTimestamp = oooO00o.f34265OooO0O0;
                            timestamp = audioTrack2.getTimestamp(audioTimestamp);
                            if (timestamp) {
                                long j3 = audioTimestamp.framePosition;
                                if (oooO00o.f34267OooO0Oo > j3) {
                                    oooO00o.f34266OooO0OO++;
                                }
                                oooO00o.f34267OooO0Oo = j3;
                                oooO00o.f34268OooO0o0 = j3 + (oooO00o.f34266OooO0OO << 32);
                            }
                            int i5 = oooOOO.f34259OooO0O0;
                            if (i5 != 0) {
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (timestamp) {
                                            oooOOO.OooO00o();
                                        }
                                    } else if (!timestamp) {
                                        oooOOO.OooO00o();
                                    }
                                } else if (!timestamp) {
                                    oooOOO.OooO00o();
                                } else if (oooO00o.f34268OooO0o0 > oooOOO.f34262OooO0o) {
                                    oooOOO.OooO0O0(2);
                                }
                            } else if (timestamp) {
                                if (audioTimestamp.nanoTime / 1000 >= oooOOO.f34260OooO0OO) {
                                    oooOOO.f34262OooO0o = oooO00o.f34268OooO0o0;
                                    oooOOO.OooO0O0(1);
                                } else {
                                    timestamp = false;
                                }
                            } else if (jNanoTime - oooOOO.f34260OooO0OO > 500000) {
                                oooOOO.OooO0O0(3);
                            }
                        }
                        if (timestamp) {
                            if (oooO00o != null) {
                                j = oooO00o.f34265OooO0O0.nanoTime / 1000;
                            } else {
                                j = -9223372036854775807L;
                            }
                            if (oooO00o != null) {
                                j2 = oooO00o.f34268OooO0o0;
                            } else {
                                j2 = -1;
                            }
                            jOooo0oo2 = o00.Oooo0oo(this.f7538OooO0oO, OooO0O0());
                            if (Math.abs(j - jNanoTime) > 5000000) {
                                this.f7532OooO00o.OooO0o0(j2, j, jNanoTime, jOooo0oo2);
                                oooOOO.OooO0O0(4);
                            } else if (Math.abs(o00.Oooo0oo(this.f7538OooO0oO, j2) - jOooo0oo2) > 5000000) {
                                this.f7532OooO00o.OooO0Oo(j2, j, jNanoTime, jOooo0oo2);
                                oooOOO.OooO0O0(4);
                            } else if (oooOOO.f34259OooO0O0 == 4) {
                                oooOOO.OooO00o();
                            }
                        }
                        if (this.f7548OooOOo0 && (method = this.f7543OooOOO) != null && jNanoTime - this.f7547OooOOo >= 500000) {
                            try {
                                AudioTrack audioTrack3 = this.f7534OooO0OO;
                                audioTrack3.getClass();
                                Integer num = (Integer) method.invoke(audioTrack3, new Object[0]);
                                int i6 = o00.f34910OooO00o;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.f7531OooO;
                                this.f7545OooOOOO = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                this.f7545OooOOOO = jMax;
                                if (jMax > 5000000) {
                                    oooO00o2.OooO0O0(jMax);
                                    this.f7545OooOOOO = 0L;
                                }
                            } catch (Exception unused) {
                                this.f7543OooOOO = null;
                            }
                            this.f7547OooOOo = jNanoTime;
                        }
                    }
                }
            } else if (!this.f7539OooO0oo) {
                oooOOO = this.f7536OooO0o;
                oooOOO.getClass();
                oooO00o = oooOOO.f34258OooO00o;
                if (oooO00o != null) {
                    timestamp = false;
                } else {
                    timestamp = false;
                }
                if (timestamp) {
                    if (oooO00o != null) {
                        j = oooO00o.f34265OooO0O0.nanoTime / 1000;
                    } else {
                        j = -9223372036854775807L;
                    }
                    if (oooO00o != null) {
                        j2 = oooO00o.f34268OooO0o0;
                    } else {
                        j2 = -1;
                    }
                    jOooo0oo2 = o00.Oooo0oo(this.f7538OooO0oO, OooO0O0());
                    if (Math.abs(j - jNanoTime) > 5000000) {
                        this.f7532OooO00o.OooO0o0(j2, j, jNanoTime, jOooo0oo2);
                        oooOOO.OooO0O0(4);
                    } else if (Math.abs(o00.Oooo0oo(this.f7538OooO0oO, j2) - jOooo0oo2) > 5000000) {
                        this.f7532OooO00o.OooO0Oo(j2, j, jNanoTime, jOooo0oo2);
                        oooOOO.OooO0O0(4);
                    } else if (oooOOO.f34259OooO0O0 == 4) {
                        oooOOO.OooO00o();
                    }
                }
                if (this.f7548OooOOo0) {
                    AudioTrack audioTrack4 = this.f7534OooO0OO;
                    audioTrack4.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack4, new Object[0]);
                    int i7 = o00.f34910OooO00o;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.f7531OooO;
                    this.f7545OooOOOO = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.f7545OooOOOO = jMax;
                    if (jMax > 5000000) {
                        oooO00o2.OooO0O0(jMax);
                        this.f7545OooOOOO = 0L;
                    }
                    this.f7547OooOOo = jNanoTime;
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        OooOOO oooOOO2 = this.f7536OooO0o;
        oooOOO2.getClass();
        boolean z2 = oooOOO2.f34259OooO0O0 == 2;
        if (z2) {
            OooOOO.OooO00o oooO00o3 = oooOOO2.f34258OooO00o;
            jOooo0oo = o00.OooOo00(jNanoTime2 - (oooO00o3 != null ? oooO00o3.f34265OooO0O0.nanoTime / 1000 : -9223372036854775807L), this.f7540OooOO0) + o00.Oooo0oo(this.f7538OooO0oO, oooO00o3 != null ? oooO00o3.f34268OooO0o0 : -1L);
        } else {
            jOooo0oo = this.f7550OooOo == 0 ? o00.Oooo0oo(this.f7538OooO0oO, OooO0O0()) : o00.OooOo00(this.f7542OooOO0o + jNanoTime2, this.f7540OooOO0);
            if (!z) {
                jOooo0oo = Math.max(0L, jOooo0oo - this.f7545OooOOOO);
            }
        }
        if (this.f7561OooOooo != z2) {
            this.f7563Oooo00O = this.f7560OooOooO;
            this.f7562Oooo000 = this.f7558OooOoo;
        }
        long j4 = jNanoTime2 - this.f7563Oooo00O;
        if (j4 < AnimationKt.MillisToNanos) {
            long jOooOo00 = o00.OooOo00(j4, this.f7540OooOO0) + this.f7562Oooo000;
            long j5 = (j4 * 1000) / AnimationKt.MillisToNanos;
            jOooo0oo = (((1000 - j5) * jOooOo00) + (jOooo0oo * j5)) / 1000;
        }
        if (!this.f7541OooOO0O) {
            long j6 = this.f7558OooOoo;
            if (jOooo0oo > j6) {
                this.f7541OooOO0O = true;
                oooO00o2.OooO0OO(System.currentTimeMillis() - o00.o000oOoO(o00.OooOo0o(o00.o000oOoO(jOooo0oo - j6), this.f7540OooOO0)));
            }
        }
        this.f7560OooOooO = jNanoTime2;
        this.f7558OooOoo = jOooo0oo;
        this.f7561OooOooo = z2;
        return jOooo0oo;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    public final long OooO0O0() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f7556OooOoO0;
        if (j != -9223372036854775807L) {
            return Math.min(this.f7559OooOoo0, this.f7557OooOoOO + ((((o00.OooOo00((jElapsedRealtime * 1000) - j, this.f7540OooOO0) * ((long) this.f7538OooO0oO)) + AnimationKt.MillisToNanos) - 1) / AnimationKt.MillisToNanos));
        }
        if (jElapsedRealtime - this.f7549OooOOoo >= 5) {
            AudioTrack audioTrack = this.f7534OooO0OO;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f7539OooO0oo) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f7553OooOo0O = this.f7552OooOo00;
                    }
                    playbackHeadPosition += this.f7553OooOo0O;
                }
                if (o00.f34910OooO00o > 29) {
                    if (this.f7552OooOo00 > playbackHeadPosition) {
                        this.f7551OooOo0++;
                    }
                    this.f7552OooOo00 = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f7552OooOo00 <= 0 || playState != 3) {
                    this.f7555OooOoO = -9223372036854775807L;
                    if (this.f7552OooOo00 > playbackHeadPosition) {
                        this.f7551OooOo0++;
                    }
                    this.f7552OooOo00 = playbackHeadPosition;
                } else if (this.f7555OooOoO == -9223372036854775807L) {
                    this.f7555OooOoO = jElapsedRealtime;
                }
            }
            this.f7549OooOOoo = jElapsedRealtime;
        }
        return this.f7552OooOo00 + (this.f7551OooOo0 << 32);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    public final boolean OooO0OO(long j) {
        boolean z;
        long jOooO00o = OooO00o(false);
        int i = this.f7538OooO0oO;
        int i2 = o00.f34910OooO00o;
        if (j <= (((jOooO00o * ((long) i)) + AnimationKt.MillisToNanos) - 1) / AnimationKt.MillisToNanos) {
            if (this.f7539OooO0oo) {
                AudioTrack audioTrack = this.f7534OooO0OO;
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
        this.f7542OooOO0o = 0L;
        this.f7550OooOo = 0;
        this.f7554OooOo0o = 0;
        this.f7544OooOOO0 = 0L;
        this.f7560OooOooO = 0L;
        this.f7563Oooo00O = 0L;
        this.f7541OooOO0O = false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    public final void OooO0o0(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.f7534OooO0OO = audioTrack;
        this.f7535OooO0Oo = i2;
        this.f7537OooO0o0 = i3;
        this.f7536OooO0o = new OooOOO(audioTrack);
        this.f7538OooO0oO = audioTrack.getSampleRate();
        if (z) {
            z2 = o00.f34910OooO00o < 23 && (i == 5 || i == 6);
        }
        this.f7539OooO0oo = z2;
        boolean zOooo0 = o00.Oooo0(i);
        this.f7548OooOOo0 = zOooo0;
        this.f7531OooO = zOooo0 ? o00.Oooo0oo(this.f7538OooO0oO, i3 / i2) : -9223372036854775807L;
        this.f7552OooOo00 = 0L;
        this.f7551OooOo0 = 0L;
        this.f7553OooOo0O = 0L;
        this.f7546OooOOOo = false;
        this.f7556OooOoO0 = -9223372036854775807L;
        this.f7555OooOoO = -9223372036854775807L;
        this.f7547OooOOo = 0L;
        this.f7545OooOOOO = 0L;
        this.f7540OooOO0 = 1.0f;
    }
}

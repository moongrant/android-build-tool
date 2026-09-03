package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.audio.OooO00o;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.UByte;
import p266o00ooo00.Oooo0;
import p294o0O0Oo0O.o00Oo0;
import p294o0O0Oo0O.o00Ooo;
import p294o0O0Oo0O.o0ooOOo;
import p319o0O0oOo.o00;
import p319o0O0oOo.o000;
import p319o0O0oOo.o00000O0;
import p319o0O0oOo.o0000O;
import p319o0O0oOo.o0000O0;
import p468o0OooO0.o000O00;
import p468o0OooO0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.OooO0O0 f13495OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final p294o0O0Oo0O.OooOOO f13496OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f13497OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f13498OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.OooO0o f13499OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AudioProcessor[] f13500OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOOO f13501OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AudioProcessor[] f13502OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ConditionVariable f13503OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayDeque<OooO> f13504OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f13505OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f13506OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public AudioSink.OooO00o f13507OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OooOO0O f13508OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public OooO0OO f13509OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooO0OO f13510OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public p294o0O0Oo0O.OooOOO0 f13511OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public AudioTrack f13512OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooO f13513OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f13514OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o000O00 f13515OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooO f13516OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public ByteBuffer f13517OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f13518OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f13519OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f13520OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f13521OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f13522OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f13523OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f13524OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f13525OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f13526Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @Nullable
    public ByteBuffer f13527Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f13528Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public AudioProcessor[] f13529Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public ByteBuffer[] f13530Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f13531Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public ByteBuffer f13532Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f13533Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public byte[] f13534Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f13535Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f13536Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f13537OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f13538OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f13539OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public o00Ooo f13540OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public long f13541OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f13542OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f13543o000oOoO;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    public static final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000O00 f13544OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f13545OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f13546OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f13547OooO0Oo;

        public OooO(o000O00 o000o01, boolean z, long j, long j2) {
            this.f13544OooO00o = o000o01;
            this.f13545OooO0O0 = z;
            this.f13546OooO0OO = j;
            this.f13547OooO0Oo = j2;
        }
    }

    public class OooO00o extends Thread {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ AudioTrack f13548Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f13548Oooo = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                this.f13548Oooo.flush();
                this.f13548Oooo.release();
            } finally {
                DefaultAudioSink.this.f13503OooO0oo.open();
            }
        }
    }

    public interface OooO0O0 {
        long OooO00o(long j);

        long OooO0O0();

        boolean OooO0OO(boolean z);

        o000O00 OooO0Oo(o000O00 o000o01);
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f13550OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Format f13551OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f13552OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f13553OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f13554OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f13555OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f13556OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f13557OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f13558OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final AudioProcessor[] f13559OooOO0;

        public OooO0OO(Format format, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, AudioProcessor[] audioProcessorArr) {
            int iOooO0oo;
            this.f13551OooO00o = format;
            this.f13552OooO0O0 = i;
            this.f13553OooO0OO = i2;
            this.f13554OooO0Oo = i3;
            this.f13556OooO0o0 = i4;
            this.f13555OooO0o = i5;
            this.f13557OooO0oO = i6;
            this.f13550OooO = z2;
            this.f13559OooOO0 = audioProcessorArr;
            if (i2 == 0) {
                float f = z ? 8.0f : 1.0f;
                int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
                o00000O0.OooO0Oo(minBufferSize != -2);
                long j = i4;
                iOooO0oo = o00.OooO0oo(minBufferSize * 4, ((int) ((250000 * j) / 1000000)) * i3, Math.max(minBufferSize, ((int) ((j * 750000) / 1000000)) * i3));
                if (f != 1.0f) {
                    iOooO0oo = Math.round(iOooO0oo * f);
                }
            } else if (i2 == 1) {
                iOooO0oo = OooO0o0(50000000L);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                iOooO0oo = OooO0o0(250000L);
            }
            this.f13558OooO0oo = iOooO0oo;
        }

        @RequiresApi(21)
        public static AudioAttributes OooO0Oo(p294o0O0Oo0O.OooOOO0 oooOOO0, boolean z) {
            return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : oooOOO0.OooO00o();
        }

        public final AudioTrack OooO00o(boolean z, p294o0O0Oo0O.OooOOO0 oooOOO0, int i) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackOooO0O0 = OooO0O0(z, oooOOO0, i);
                int state = audioTrackOooO0O0.getState();
                if (state == 1) {
                    return audioTrackOooO0O0;
                }
                try {
                    audioTrackOooO0O0.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f13556OooO0o0, this.f13555OooO0o, this.f13558OooO0oo);
            } catch (UnsupportedOperationException unused2) {
                throw new AudioSink.InitializationException(0, this.f13556OooO0o0, this.f13555OooO0o, this.f13558OooO0oo);
            }
        }

        public final AudioTrack OooO0O0(boolean z, p294o0O0Oo0O.OooOOO0 oooOOO0, int i) {
            int i2 = o00.f36680OooO00o;
            if (i2 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(OooO0Oo(oooOOO0, z)).setAudioFormat(DefaultAudioSink.OooOo(this.f13556OooO0o0, this.f13555OooO0o, this.f13557OooO0oO)).setTransferMode(1).setBufferSizeInBytes(this.f13558OooO0oo).setSessionId(i).setOffloadedPlayback(this.f13553OooO0OO == 1).build();
            }
            if (i2 >= 21) {
                return new AudioTrack(OooO0Oo(oooOOO0, z), DefaultAudioSink.OooOo(this.f13556OooO0o0, this.f13555OooO0o, this.f13557OooO0oO), this.f13558OooO0oo, 1, i);
            }
            int iOooOo0 = o00.OooOo0(oooOOO0.f35767OooO0OO);
            return i == 0 ? new AudioTrack(iOooOo0, this.f13556OooO0o0, this.f13555OooO0o, this.f13557OooO0oO, this.f13558OooO0oo, 1) : new AudioTrack(iOooOo0, this.f13556OooO0o0, this.f13555OooO0o, this.f13557OooO0oO, this.f13558OooO0oo, 1, i);
        }

        public final long OooO0OO(long j) {
            return (j * 1000000) / ((long) this.f13556OooO0o0);
        }

        public final int OooO0o0(long j) {
            int i;
            int i2 = this.f13557OooO0oO;
            switch (i2) {
                case 5:
                    i = 80000;
                    break;
                case 6:
                case 18:
                    i = 768000;
                    break;
                case 7:
                    i = 192000;
                    break;
                case 8:
                    i = 2250000;
                    break;
                case 9:
                    i = 40000;
                    break;
                case 10:
                    i = 100000;
                    break;
                case 11:
                    i = 16000;
                    break;
                case 12:
                    i = 7000;
                    break;
                case 13:
                default:
                    throw new IllegalArgumentException();
                case 14:
                    i = 3062500;
                    break;
                case 15:
                    i = 8000;
                    break;
                case 16:
                    i = 256000;
                    break;
                case 17:
                    i = 336000;
                    break;
            }
            if (i2 == 5) {
                i *= 2;
            }
            return (int) ((j * ((long) i)) / 1000000);
        }
    }

    public static class OooO0o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AudioProcessor[] f13560OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOOO0 f13561OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooOOO f13562OooO0OO;

        public OooO0o(AudioProcessor... audioProcessorArr) {
            OooOOO0 oooOOO0 = new OooOOO0();
            OooOOO oooOOO = new OooOOO();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f13560OooO00o = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f13561OooO0O0 = oooOOO0;
            this.f13562OooO0OO = oooOOO;
            audioProcessorArr2[audioProcessorArr.length] = oooOOO0;
            audioProcessorArr2[audioProcessorArr.length + 1] = oooOOO;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.OooO0O0
        public final long OooO00o(long j) {
            OooOOO oooOOO = this.f13562OooO0OO;
            long j2 = oooOOO.f13637OooOOOO;
            if (j2 < 1024) {
                return (long) (((double) oooOOO.f13626OooO0OO) * j);
            }
            int i = oooOOO.f13631OooO0oo.f13491OooO00o;
            int i2 = oooOOO.f13630OooO0oO.f13491OooO00o;
            return i == i2 ? o00.OooOooo(j, oooOOO.f13635OooOOO, j2) : o00.OooOooo(j, oooOOO.f13635OooOOO * ((long) i), j2 * ((long) i2));
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.OooO0O0
        public final long OooO0O0() {
            return this.f13561OooO0O0.f13650OooOo00;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.OooO0O0
        public final boolean OooO0OO(boolean z) {
            this.f13561OooO0O0.f13644OooOOO0 = z;
            return z;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.OooO0O0
        public final o000O00 OooO0Oo(o000O00 o000o01) {
            OooOOO oooOOO = this.f13562OooO0OO;
            float f = o000o01.f40550OooO00o;
            if (oooOOO.f13626OooO0OO != f) {
                oooOOO.f13626OooO0OO = f;
                oooOOO.f13624OooO = true;
            }
            float f2 = o000o01.f40551OooO0O0;
            if (oooOOO.f13627OooO0Oo != f2) {
                oooOOO.f13627OooO0Oo = f2;
                oooOOO.f13624OooO = true;
            }
            return new o000O00(f, f2);
        }
    }

    public final class OooOO0 implements com.google.android.exoplayer2.audio.OooO0O0.OooO00o {
        public OooOO0() {
        }

        @Override // com.google.android.exoplayer2.audio.OooO0O0.OooO00o
        public final void OooO00o(final long j) {
            final com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o;
            Handler handler;
            AudioSink.OooO00o oooO00o = DefaultAudioSink.this.f13507OooOOO;
            if (oooO00o == null || (handler = (c0096OooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13614o000O00).f13569OooO00o) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: o0O0Oo0O.o000oOoO
                @Override // java.lang.Runnable
                public final void run() {
                    OooO00o.C0096OooO00o c0096OooO00o2 = c0096OooO00o;
                    long j2 = j;
                    OooO00o oooO00o2 = c0096OooO00o2.f13570OooO0O0;
                    int i = o00.f36680OooO00o;
                    oooO00o2.Oooo00o(j2);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.OooO0O0.OooO00o
        public final void OooO0O0(final int i, final long j) {
            if (DefaultAudioSink.this.f13507OooOOO != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                final long j2 = jElapsedRealtime - defaultAudioSink.f13541OoooOO0;
                final com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13614o000O00;
                Handler handler = c0096OooO00o.f13569OooO00o;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: o0O0Oo0O.Oooo0
                        @Override // java.lang.Runnable
                        public final void run() {
                            OooO00o.C0096OooO00o c0096OooO00o2 = c0096OooO00o;
                            int i2 = i;
                            long j3 = j;
                            long j4 = j2;
                            OooO00o oooO00o = c0096OooO00o2.f13570OooO0O0;
                            int i3 = o00.f36680OooO00o;
                            oooO00o.OoooO00(i2, j3, j4);
                        }
                    });
                }
            }
        }

        @Override // com.google.android.exoplayer2.audio.OooO0O0.OooO00o
        public final void OooO0OO(long j) {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j);
            Log.w("AudioTrack", sb.toString());
        }

        @Override // com.google.android.exoplayer2.audio.OooO0O0.OooO00o
        public final void OooO0Oo(long j, long j2, long j3, long j4) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            OooO0OO oooO0OO = defaultAudioSink.f13510OooOOOo;
            long j5 = oooO0OO.f13553OooO0OO == 0 ? defaultAudioSink.f13514OooOo / ((long) oooO0OO.f13552OooO0O0) : defaultAudioSink.f13520OooOoO0;
            long jOooOoo = defaultAudioSink.OooOoo();
            StringBuilder sb = new StringBuilder(182);
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(j5);
            sb.append(", ");
            sb.append(jOooOoo);
            Log.w("AudioTrack", sb.toString());
        }

        @Override // com.google.android.exoplayer2.audio.OooO0O0.OooO00o
        public final void OooO0o0(long j, long j2, long j3, long j4) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            OooO0OO oooO0OO = defaultAudioSink.f13510OooOOOo;
            long j5 = oooO0OO.f13553OooO0OO == 0 ? defaultAudioSink.f13514OooOo / ((long) oooO0OO.f13552OooO0O0) : defaultAudioSink.f13520OooOoO0;
            long jOooOoo = defaultAudioSink.OooOoo();
            StringBuilder sb = new StringBuilder(180);
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(j5);
            sb.append(", ");
            sb.append(jOooOoo);
            Log.w("AudioTrack", sb.toString());
        }
    }

    @RequiresApi(29)
    public final class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Handler f13564OooO00o = new Handler();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o f13565OooO0O0 = new OooO00o();

        public class OooO00o extends AudioTrack.StreamEventCallback {
            public OooO00o() {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onDataRequest(AudioTrack audioTrack, int i) {
                Renderer.OooO00o oooO00o;
                o00000O0.OooO0Oo(audioTrack == DefaultAudioSink.this.f13512OooOOo0);
                AudioSink.OooO00o oooO00o2 = DefaultAudioSink.this.f13507OooOOO;
                if (oooO00o2 == null || (oooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13612o000O) == null) {
                    return;
                }
                oooO00o.OooO00o();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onTearDown(@NonNull AudioTrack audioTrack) {
                Renderer.OooO00o oooO00o;
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.OooO00o oooO00o2 = defaultAudioSink.f13507OooOOO;
                if (oooO00o2 == null || !defaultAudioSink.f13539OoooO00 || (oooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13612o000O) == null) {
                    return;
                }
                oooO00o.OooO00o();
            }
        }

        public OooOO0O() {
        }

        public final void OooO00o(AudioTrack audioTrack) {
            final Handler handler = this.f13564OooO00o;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: o0O0Oo0O.oo000o
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f13565OooO0O0);
        }

        public final void OooO0O0(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f13565OooO0O0);
            this.f13564OooO00o.removeCallbacksAndMessages(null);
        }
    }

    public DefaultAudioSink(@Nullable p294o0O0Oo0O.OooOOO oooOOO, OooO0O0 oooO0O0) {
        this.f13496OooO00o = oooOOO;
        this.f13497OooO0O0 = oooO0O0;
        int i = o00.f36680OooO00o;
        this.f13498OooO0OO = false;
        this.f13505OooOO0O = false;
        this.f13506OooOO0o = false;
        this.f13503OooO0oo = new ConditionVariable(true);
        this.f13495OooO = new com.google.android.exoplayer2.audio.OooO0O0(new OooOO0());
        com.google.android.exoplayer2.audio.OooO0o oooO0o = new com.google.android.exoplayer2.audio.OooO0o();
        this.f13499OooO0Oo = oooO0o;
        OooOOOO oooOOOO = new OooOOOO();
        this.f13501OooO0o0 = oooOOOO;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new com.google.android.exoplayer2.audio.OooOO0O(), oooO0o, oooOOOO);
        Collections.addAll(arrayList, ((OooO0o) oooO0O0).f13560OooO00o);
        this.f13500OooO0o = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f13502OooO0oO = new AudioProcessor[]{new com.google.android.exoplayer2.audio.OooO()};
        this.f13528Oooo000 = 1.0f;
        this.f13511OooOOo = p294o0O0Oo0O.OooOOO0.f35764OooO0o;
        this.f13538OoooO0 = 0;
        this.f13540OoooO0O = new o00Ooo();
        o000O00 o000o01 = o000O00.f40549OooO0Oo;
        this.f13516OooOo00 = new OooO(o000o01, false, 0L, 0L);
        this.f13515OooOo0 = o000o01;
        this.f13535Oooo0oO = -1;
        this.f13529Oooo00O = new AudioProcessor[0];
        this.f13530Oooo00o = new ByteBuffer[0];
        this.f13504OooOO0 = new ArrayDeque<>();
    }

    @RequiresApi(21)
    public static AudioFormat OooOo(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x004f  */
    @Nullable
    public static Pair<Integer, Integer> OooOoO(Format format, @Nullable p294o0O0Oo0O.OooOOO oooOOO) {
        if (oooOOO == null) {
            return null;
        }
        String str = format.f13148OoooOoo;
        Objects.requireNonNull(str);
        int iOooO0O0 = o0000O.OooO0O0(str, format.f13145OoooOOo);
        int i = 8;
        if (!(iOooO0O0 == 5 || iOooO0O0 == 6 || iOooO0O0 == 18 || iOooO0O0 == 17 || iOooO0O0 == 7 || iOooO0O0 == 8 || iOooO0O0 == 14)) {
            return null;
        }
        int i2 = iOooO0O0 == 18 ? 6 : format.f13160o00Oo0;
        if (i2 > oooOOO.f35763OooO0O0) {
            return null;
        }
        int i3 = o00.f36680OooO00o;
        if (i3 > 28) {
            i = i2;
        } else if (i2 != 7) {
            if (i2 == 3 || i2 == 4 || i2 == 5) {
                i = 6;
            } else {
                i = i2;
            }
        }
        if (i3 <= 26 && "fugu".equals(o00.f36681OooO0O0) && i == 1) {
            i = 2;
        }
        int iOooOOO = o00.OooOOO(i);
        if (iOooOOO == 0) {
            return null;
        }
        if (Arrays.binarySearch(oooOOO.f35762OooO00o, iOooO0O0) >= 0) {
            return Pair.create(Integer.valueOf(iOooO0O0), Integer.valueOf(iOooOOO));
        }
        if (iOooO0O0 == 18) {
            if (Arrays.binarySearch(oooOOO.f35762OooO00o, 6) >= 0) {
                return Pair.create(6, Integer.valueOf(iOooOOO));
            }
        }
        return null;
    }

    public static boolean OooOooo(AudioTrack audioTrack) {
        return o00.f36680OooO00o >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static boolean Oooo000(Format format, p294o0O0Oo0O.OooOOO0 oooOOO0) {
        int iOooOOO;
        int i = o00.f36680OooO00o;
        if (i < 29) {
            return false;
        }
        String str = format.f13148OoooOoo;
        Objects.requireNonNull(str);
        int iOooO0O0 = o0000O.OooO0O0(str, format.f13145OoooOOo);
        if (iOooO0O0 == 0 || (iOooOOO = o00.OooOOO(format.f13160o00Oo0)) == 0 || !AudioManager.isOffloadedPlaybackSupported(OooOo(format.f13161o00Ooo, iOooOOO, iOooO0O0), oooOOO0.OooO00o())) {
            return false;
        }
        if (!(format.f13165o00ooo == 0 && format.f13168oo000o == 0)) {
            if (!(i >= 30 && o00.f36683OooO0Oo.startsWith("Pixel"))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean OooO() {
        return OooOooO() && this.f13495OooO.OooO0OO(OooOoo());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO00o() {
        flush();
        for (AudioProcessor audioProcessor : this.f13500OooO0o) {
            audioProcessor.OooO00o();
        }
        for (AudioProcessor audioProcessor2 : this.f13502OooO0oO) {
            audioProcessor2.OooO00o();
        }
        this.f13538OoooO0 = 0;
        this.f13539OoooO00 = false;
        this.f13543o000oOoO = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO0O0() {
        this.f13539OoooO00 = true;
        if (OooOooO()) {
            o00Oo0 o00oo1 = this.f13495OooO.f13576OooO0o;
            Objects.requireNonNull(o00oo1);
            o00oo1.OooO00o();
            this.f13512OooOOo0.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean OooO0OO(Format format) {
        return OooOo00(format) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean OooO0Oo() {
        return !OooOooO() || (this.f13536Oooo0oo && !OooO());
    }

    public final void OooO0o(long j) {
        final com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o;
        Handler handler;
        o000O00 o000o00OooO0Oo = this.f13510OooOOOo.f13550OooO ? this.f13497OooO0O0.OooO0Oo(OooOoO0()) : o000O00.f40549OooO0Oo;
        final boolean zOooO0OO = this.f13510OooOOOo.f13550OooO ? this.f13497OooO0O0.OooO0OO(OooOoo0()) : false;
        this.f13504OooOO0.add(new OooO(o000o00OooO0Oo, zOooO0OO, Math.max(0L, j), this.f13510OooOOOo.OooO0OO(OooOoo())));
        AudioProcessor[] audioProcessorArr = this.f13510OooOOOo.f13559OooOO0;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.f13529Oooo00O = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f13530Oooo00o = new ByteBuffer[size];
        OooOo0o();
        AudioSink.OooO00o oooO00o = this.f13507OooOOO;
        if (oooO00o == null || (handler = (c0096OooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13614o000O00).f13569OooO00o) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: o0O0Oo0O.o00O0O
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o.C0096OooO00o c0096OooO00o2 = c0096OooO00o;
                boolean z = zOooO0OO;
                OooO00o oooO00o2 = c0096OooO00o2.f13570OooO0O0;
                int i = o00.f36680OooO00o;
                oooO00o2.OooO0o(z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO0o0(o000O00 o000o01) {
        o000O00 o000o02 = new o000O00(o00.OooO0oO(o000o01.f40550OooO00o, 0.1f, 8.0f), o00.OooO0oO(o000o01.f40551OooO0O0, 0.1f, 8.0f));
        if (!this.f13505OooOO0O || o00.f36680OooO00o < 23) {
            Oooo0O0(o000o02, OooOoo0());
        } else {
            Oooo0OO(o000o02);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final o000O00 OooO0oO() {
        return this.f13505OooOO0O ? this.f13515OooOo0 : OooOoO0();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO0oo() throws AudioSink.WriteException {
        if (!this.f13536Oooo0oo && OooOooO() && OooOo0O()) {
            Oooo00O();
            this.f13536Oooo0oo = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOO0(p294o0O0Oo0O.OooOOO0 oooOOO0) {
        if (this.f13511OooOOo.equals(oooOOO0)) {
            return;
        }
        this.f13511OooOOo = oooOOO0;
        if (this.f13537OoooO) {
            return;
        }
        flush();
        this.f13538OoooO0 = 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOO0O(int i) {
        if (this.f13538OoooO0 != i) {
            this.f13538OoooO0 = i;
            flush();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOO0o(Format format, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        AudioProcessor[] audioProcessorArr;
        int i;
        int iIntValue;
        int iOooO0O0;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int[] iArr2;
        if ("audio/raw".equals(format.f13148OoooOoo)) {
            o00000O0.OooO00o(o00.OooOoO(format.f13162o00o0O));
            int iOooOo00 = o00.OooOo00(format.f13162o00o0O, format.f13160o00Oo0);
            if (this.f13498OooO0OO) {
                int i5 = format.f13162o00o0O;
                if (i5 == 536870912 || i5 == 805306368 || i5 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            AudioProcessor[] audioProcessorArr2 = z2 ? this.f13502OooO0oO : this.f13500OooO0o;
            boolean z3 = !z2;
            OooOOOO oooOOOO = this.f13501OooO0o0;
            int i6 = format.f13165o00ooo;
            int i7 = format.f13168oo000o;
            oooOOOO.f13651OooO = i6;
            oooOOOO.f13652OooOO0 = i7;
            if (o00.f36680OooO00o < 21 && format.f13160o00Oo0 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.f13499OooO0Oo.f13610OooO = iArr2;
            AudioProcessor.OooO00o oooO00o = new AudioProcessor.OooO00o(format.f13161o00Ooo, format.f13160o00Oo0, format.f13162o00o0O);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.OooO00o oooO00oOooO0o0 = audioProcessor.OooO0o0(oooO00o);
                    if (audioProcessor.isActive()) {
                        oooO00o = oooO00oOooO0o0;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e) {
                    throw new AudioSink.ConfigurationException(e);
                }
            }
            int i9 = oooO00o.f13493OooO0OO;
            int i10 = oooO00o.f13491OooO00o;
            iIntValue = o00.OooOOO(oooO00o.f13492OooO0O0);
            int iOooOo01 = o00.OooOo00(i9, oooO00o.f13492OooO0O0);
            z = z3;
            audioProcessorArr = audioProcessorArr2;
            iOooO0O0 = i9;
            i3 = i10;
            i = 0;
            i4 = iOooOo01;
            i2 = iOooOo00;
        } else {
            audioProcessorArr = new AudioProcessor[0];
            int i11 = format.f13161o00Ooo;
            if (this.f13506OooOO0o && Oooo000(format, this.f13511OooOOo)) {
                String str = format.f13148OoooOoo;
                Objects.requireNonNull(str);
                iOooO0O0 = o0000O.OooO0O0(str, format.f13145OoooOOo);
                iIntValue = o00.OooOOO(format.f13160o00Oo0);
                i2 = -1;
                i = 1;
            } else {
                Pair<Integer, Integer> pairOooOoO = OooOoO(format, this.f13496OooO00o);
                if (pairOooOoO == null) {
                    String strValueOf = String.valueOf(format);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 37);
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(strValueOf);
                    throw new AudioSink.ConfigurationException(sb.toString());
                }
                int iIntValue2 = ((Integer) pairOooOoO.first).intValue();
                i = 2;
                iIntValue = ((Integer) pairOooOoO.second).intValue();
                iOooO0O0 = iIntValue2;
                i2 = -1;
            }
            z = false;
            i3 = i11;
            i4 = -1;
        }
        if (iOooO0O0 == 0) {
            String strValueOf2 = String.valueOf(format);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new AudioSink.ConfigurationException(sb2.toString());
        }
        if (iIntValue != 0) {
            this.f13543o000oOoO = false;
            OooO0OO oooO0OO = new OooO0OO(format, i2, i, i4, i3, iIntValue, iOooO0O0, this.f13505OooOO0O, z, audioProcessorArr);
            if (OooOooO()) {
                this.f13509OooOOOO = oooO0OO;
                return;
            } else {
                this.f13510OooOOOo = oooO0OO;
                return;
            }
        }
        String strValueOf3 = String.valueOf(format);
        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 54);
        sb3.append("Invalid output channel config (mode=");
        sb3.append(i);
        sb3.append(") for: ");
        sb3.append(strValueOf3);
        throw new AudioSink.ConfigurationException(sb3.toString());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOO() {
        if (this.f13537OoooO) {
            this.f13537OoooO = false;
            this.f13538OoooO0 = 0;
            flush();
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final long OooOOO0(boolean z) {
        long jOooO00o;
        boolean timestamp;
        Method method;
        if (!OooOooO() || this.f13524OooOooO) {
            return Long.MIN_VALUE;
        }
        com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13495OooO;
        AudioTrack audioTrack = oooO0O0.f13574OooO0OO;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long jOooO00o2 = oooO0O0.OooO00o(oooO0O0.OooO0O0());
            if (jOooO00o2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - oooO0O0.f13584OooOOO0 >= 30000) {
                    long[] jArr = oooO0O0.f13573OooO0O0;
                    int i = oooO0O0.f13593OooOo0O;
                    jArr[i] = jOooO00o2 - jNanoTime;
                    oooO0O0.f13593OooOo0O = (i + 1) % 10;
                    int i2 = oooO0O0.f13594OooOo0o;
                    if (i2 < 10) {
                        oooO0O0.f13594OooOo0o = i2 + 1;
                    }
                    oooO0O0.f13584OooOOO0 = jNanoTime;
                    oooO0O0.f13582OooOO0o = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = oooO0O0.f13594OooOo0o;
                        if (i3 >= i4) {
                            break;
                        }
                        oooO0O0.f13582OooOO0o = (oooO0O0.f13573OooO0O0[i3] / ((long) i4)) + oooO0O0.f13582OooOO0o;
                        i3++;
                    }
                }
                if (!oooO0O0.f13579OooO0oo) {
                    o00Oo0 o00oo1 = oooO0O0.f13576OooO0o;
                    Objects.requireNonNull(o00oo1);
                    o00Oo0.OooO00o oooO00o = o00oo1.f35786OooO00o;
                    if (oooO00o == null || jNanoTime - o00oo1.f35791OooO0o0 < o00oo1.f35789OooO0Oo) {
                        timestamp = false;
                    } else {
                        o00oo1.f35791OooO0o0 = jNanoTime;
                        timestamp = oooO00o.f35792OooO00o.getTimestamp(oooO00o.f35793OooO0O0);
                        if (timestamp) {
                            long j = oooO00o.f35793OooO0O0.framePosition;
                            if (oooO00o.f35795OooO0Oo > j) {
                                oooO00o.f35794OooO0OO++;
                            }
                            oooO00o.f35795OooO0Oo = j;
                            oooO00o.f35796OooO0o0 = j + (oooO00o.f35794OooO0OO << 32);
                        }
                        int i5 = o00oo1.f35787OooO0O0;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        if (i5 != 4) {
                                            throw new IllegalStateException();
                                        }
                                    } else if (timestamp) {
                                        o00oo1.OooO00o();
                                    }
                                } else if (!timestamp) {
                                    o00oo1.OooO00o();
                                }
                            } else if (!timestamp) {
                                o00oo1.OooO00o();
                            } else if (o00oo1.f35786OooO00o.f35796OooO0o0 > o00oo1.f35790OooO0o) {
                                o00oo1.OooO0O0(2);
                            }
                        } else if (timestamp) {
                            o00Oo0.OooO00o oooO00o2 = o00oo1.f35786OooO00o;
                            if (oooO00o2.f35793OooO0O0.nanoTime / 1000 >= o00oo1.f35788OooO0OO) {
                                o00oo1.f35790OooO0o = oooO00o2.f35796OooO0o0;
                                o00oo1.OooO0O0(1);
                            } else {
                                timestamp = false;
                            }
                        } else if (jNanoTime - o00oo1.f35788OooO0OO > 500000) {
                            o00oo1.OooO0O0(3);
                        }
                    }
                    if (timestamp) {
                        o00Oo0.OooO00o oooO00o3 = o00oo1.f35786OooO00o;
                        long j2 = oooO00o3 != null ? oooO00o3.f35793OooO0O0.nanoTime / 1000 : -9223372036854775807L;
                        long j3 = oooO00o3 != null ? oooO00o3.f35796OooO0o0 : -1L;
                        if (Math.abs(j2 - jNanoTime) > 5000000) {
                            oooO0O0.f13572OooO00o.OooO0o0(j3, j2, jNanoTime, jOooO00o2);
                            o00oo1.OooO0O0(4);
                        } else if (Math.abs(oooO0O0.OooO00o(j3) - jOooO00o2) > 5000000) {
                            oooO0O0.f13572OooO00o.OooO0Oo(j3, j2, jNanoTime, jOooO00o2);
                            o00oo1.OooO0O0(4);
                        } else if (o00oo1.f35787OooO0O0 == 4) {
                            o00oo1.OooO00o();
                        }
                    }
                    if (oooO0O0.f13588OooOOo0 && (method = oooO0O0.f13583OooOOO) != null && jNanoTime - oooO0O0.f13587OooOOo >= 500000) {
                        try {
                            AudioTrack audioTrack2 = oooO0O0.f13574OooO0OO;
                            Objects.requireNonNull(audioTrack2);
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                            int i6 = o00.f36680OooO00o;
                            long jIntValue = (((long) num.intValue()) * 1000) - oooO0O0.f13571OooO;
                            oooO0O0.f13585OooOOOO = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            oooO0O0.f13585OooOOOO = jMax;
                            if (jMax > 5000000) {
                                oooO0O0.f13572OooO00o.OooO0OO(jMax);
                                oooO0O0.f13585OooOOOO = 0L;
                            }
                        } catch (Exception unused) {
                            oooO0O0.f13583OooOOO = null;
                        }
                        oooO0O0.f13587OooOOo = jNanoTime;
                    }
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        o00Oo0 o00oo2 = oooO0O0.f13576OooO0o;
        Objects.requireNonNull(o00oo2);
        boolean z2 = o00oo2.f35787OooO0O0 == 2;
        if (z2) {
            o00Oo0.OooO00o oooO00o4 = o00oo2.f35786OooO00o;
            long jOooO00o3 = oooO0O0.OooO00o(oooO00o4 != null ? oooO00o4.f35796OooO0o0 : -1L);
            o00Oo0.OooO00o oooO00o5 = o00oo2.f35786OooO00o;
            jOooO00o = o00.OooOOo0(jNanoTime2 - (oooO00o5 != null ? oooO00o5.f35793OooO0O0.nanoTime / 1000 : -9223372036854775807L), oooO0O0.f13580OooOO0) + jOooO00o3;
        } else {
            jOooO00o = oooO0O0.f13594OooOo0o == 0 ? oooO0O0.OooO00o(oooO0O0.OooO0O0()) : oooO0O0.f13582OooOO0o + jNanoTime2;
            if (!z) {
                jOooO00o = Math.max(0L, jOooO00o - oooO0O0.f13585OooOOOO);
            }
        }
        if (oooO0O0.f13600OooOooO != z2) {
            oooO0O0.f13602Oooo000 = oooO0O0.f13598OooOoo;
            oooO0O0.f13601OooOooo = oooO0O0.f13599OooOoo0;
        }
        long j4 = jNanoTime2 - oooO0O0.f13602Oooo000;
        if (j4 < 1000000) {
            long jOooOOo0 = o00.OooOOo0(j4, oooO0O0.f13580OooOO0) + oooO0O0.f13601OooOooo;
            long j5 = (j4 * 1000) / 1000000;
            jOooO00o = (((1000 - j5) * jOooOOo0) + (jOooO00o * j5)) / 1000;
        }
        if (!oooO0O0.f13581OooOO0O) {
            long j6 = oooO0O0.f13599OooOoo0;
            if (jOooO00o > j6) {
                oooO0O0.f13581OooOO0O = true;
                long jOooO0O0 = C.OooO0O0(jOooO00o - j6);
                float f = oooO0O0.f13580OooOO0;
                int i7 = o00.f36680OooO00o;
                if (f != 1.0f) {
                    jOooO0O0 = Math.round(jOooO0O0 / ((double) f));
                }
                oooO0O0.f13572OooO00o.OooO00o(System.currentTimeMillis() - C.OooO0O0(jOooO0O0));
            }
        }
        oooO0O0.f13598OooOoo = jNanoTime2;
        oooO0O0.f13599OooOoo0 = jOooO00o;
        oooO0O0.f13600OooOooO = z2;
        long jMin = Math.min(jOooO00o, this.f13510OooOOOo.OooO0OO(OooOoo()));
        while (!this.f13504OooOO0.isEmpty() && jMin >= this.f13504OooOO0.getFirst().f13547OooO0Oo) {
            this.f13516OooOo00 = this.f13504OooOO0.remove();
        }
        OooO oooO = this.f13516OooOo00;
        long jOooO00o4 = jMin - oooO.f13547OooO0Oo;
        if (!oooO.f13544OooO00o.equals(o000O00.f40549OooO0Oo)) {
            jOooO00o4 = this.f13504OooOO0.isEmpty() ? this.f13497OooO0O0.OooO00o(jOooO00o4) : o00.OooOOo0(jOooO00o4, this.f13516OooOo00.f13544OooO00o.f40550OooO00o);
        }
        return this.f13510OooOOOo.OooO0OO(this.f13497OooO0O0.OooO0O0()) + this.f13516OooOo00.f13546OooO0OO + jOooO00o4;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOOO() {
        this.f13522OooOoo = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOOo(float f) {
        if (this.f13528Oooo000 != f) {
            this.f13528Oooo000 = f;
            Oooo0o0();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOo(o00Ooo o00ooo2) {
        if (this.f13540OoooO0O.equals(o00ooo2)) {
            return;
        }
        int i = o00ooo2.f35797OooO00o;
        float f = o00ooo2.f35798OooO0O0;
        AudioTrack audioTrack = this.f13512OooOOo0;
        if (audioTrack != null) {
            if (this.f13540OoooO0O.f35797OooO00o != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f13512OooOOo0.setAuxEffectSendLevel(f);
            }
        }
        this.f13540OoooO0O = o00ooo2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOo0(int i) {
        o00000O0.OooO0Oo(o00.f36680OooO00o >= 21);
        if (this.f13537OoooO && this.f13538OoooO0 == i) {
            return;
        }
        this.f13537OoooO = true;
        this.f13538OoooO0 = i;
        flush();
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0174  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean OooOOoo(ByteBuffer byteBuffer, long j, int i) throws AudioSink.WriteException, AudioSink.InitializationException {
        boolean z;
        boolean z2;
        int iOooO0Oo;
        int i2;
        byte b;
        int i3;
        byte b2;
        int i4;
        ByteBuffer byteBuffer2 = this.f13527Oooo0;
        o00000O0.OooO00o(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f13509OooOOOO != null) {
            if (!OooOo0O()) {
                return false;
            }
            OooO0OO oooO0OO = this.f13509OooOOOO;
            OooO0OO oooO0OO2 = this.f13510OooOOOo;
            Objects.requireNonNull(oooO0OO);
            if (oooO0OO2.f13553OooO0OO == oooO0OO.f13553OooO0OO && oooO0OO2.f13557OooO0oO == oooO0OO.f13557OooO0oO && oooO0OO2.f13556OooO0o0 == oooO0OO.f13556OooO0o0 && oooO0OO2.f13555OooO0o == oooO0OO.f13555OooO0o && oooO0OO2.f13554OooO0Oo == oooO0OO.f13554OooO0Oo) {
                this.f13510OooOOOo = this.f13509OooOOOO;
                this.f13509OooOOOO = null;
                if (OooOooo(this.f13512OooOOo0)) {
                    this.f13512OooOOo0.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f13512OooOOo0;
                    Format format = this.f13510OooOOOo.f13551OooO00o;
                    audioTrack.setOffloadDelayPadding(format.f13165o00ooo, format.f13168oo000o);
                    this.f13542OoooOOO = true;
                }
            } else {
                Oooo00O();
                if (OooO()) {
                    return false;
                }
                flush();
            }
            OooO0o(j);
        }
        if (!OooOooO()) {
            this.f13503OooO0oo.block();
            try {
                OooO0OO oooO0OO3 = this.f13510OooOOOo;
                Objects.requireNonNull(oooO0OO3);
                AudioTrack audioTrackOooO00o = oooO0OO3.OooO00o(this.f13537OoooO, this.f13511OooOOo, this.f13538OoooO0);
                this.f13512OooOOo0 = audioTrackOooO00o;
                if (OooOooo(audioTrackOooO00o)) {
                    AudioTrack audioTrack2 = this.f13512OooOOo0;
                    if (this.f13508OooOOO0 == null) {
                        this.f13508OooOOO0 = new OooOO0O();
                    }
                    this.f13508OooOOO0.OooO00o(audioTrack2);
                    AudioTrack audioTrack3 = this.f13512OooOOo0;
                    Format format2 = this.f13510OooOOOo.f13551OooO00o;
                    audioTrack3.setOffloadDelayPadding(format2.f13165o00ooo, format2.f13168oo000o);
                }
                final int audioSessionId = this.f13512OooOOo0.getAudioSessionId();
                if (this.f13538OoooO0 != audioSessionId) {
                    this.f13538OoooO0 = audioSessionId;
                    AudioSink.OooO00o oooO00o = this.f13507OooOOO;
                    if (oooO00o != null) {
                        com.google.android.exoplayer2.audio.OooOO0.OooO00o oooO00o2 = (com.google.android.exoplayer2.audio.OooOO0.OooO00o) oooO00o;
                        final com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13614o000O00;
                        Handler handler = c0096OooO00o.f13569OooO00o;
                        if (handler != null) {
                            handler.post(new Runnable() { // from class: o0O0Oo0O.Oooo000
                                @Override // java.lang.Runnable
                                public final void run() {
                                    OooO00o.C0096OooO00o c0096OooO00o2 = c0096OooO00o;
                                    int i5 = audioSessionId;
                                    OooO00o oooO00o3 = c0096OooO00o2.f13570OooO0O0;
                                    int i6 = o00.f36680OooO00o;
                                    oooO00o3.OooO0O0(i5);
                                }
                            });
                        }
                        Objects.requireNonNull(com.google.android.exoplayer2.audio.OooOO0.this);
                    }
                }
                com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13495OooO;
                AudioTrack audioTrack4 = this.f13512OooOOo0;
                OooO0OO oooO0OO4 = this.f13510OooOOOo;
                oooO0O0.OooO0o0(audioTrack4, oooO0OO4.f13553OooO0OO == 2, oooO0OO4.f13557OooO0oO, oooO0OO4.f13554OooO0Oo, oooO0OO4.f13558OooO0oo);
                Oooo0o0();
                int i5 = this.f13540OoooO0O.f35797OooO00o;
                if (i5 != 0) {
                    this.f13512OooOOo0.attachAuxEffect(i5);
                    this.f13512OooOOo0.setAuxEffectSendLevel(this.f13540OoooO0O.f35798OooO0O0);
                }
                this.f13524OooOooO = true;
            } catch (AudioSink.InitializationException e) {
                if (this.f13510OooOOOo.f13553OooO0OO == 1) {
                    this.f13543o000oOoO = true;
                }
                throw e;
            }
        }
        if (this.f13524OooOooO) {
            this.f13525OooOooo = Math.max(0L, j);
            this.f13522OooOoo = false;
            this.f13524OooOooO = false;
            if (this.f13505OooOO0O && o00.f36680OooO00o >= 23) {
                Oooo0OO(this.f13515OooOo0);
            }
            OooO0o(j);
            if (this.f13539OoooO00) {
                OooO0O0();
            }
        }
        com.google.android.exoplayer2.audio.OooO0O0 oooO0O1 = this.f13495OooO;
        long jOooOoo = OooOoo();
        AudioTrack audioTrack5 = oooO0O1.f13574OooO0OO;
        Objects.requireNonNull(audioTrack5);
        int playState = audioTrack5.getPlayState();
        if (oooO0O1.f13579OooO0oo) {
            if (playState == 2) {
                oooO0O1.f13586OooOOOo = false;
            } else if (playState != 1 || oooO0O1.OooO0O0() != 0) {
                z = oooO0O1.f13586OooOOOo;
                boolean zOooO0OO = oooO0O1.OooO0OO(jOooOoo);
                oooO0O1.f13586OooOOOo = zOooO0OO;
                if (z) {
                    oooO0O1.f13572OooO00o.OooO0O0(oooO0O1.f13577OooO0o0, C.OooO0O0(oooO0O1.f13571OooO));
                }
                z2 = true;
            }
            z2 = false;
        } else {
            z = oooO0O1.f13586OooOOOo;
            boolean zOooO0OO2 = oooO0O1.OooO0OO(jOooOoo);
            oooO0O1.f13586OooOOOo = zOooO0OO2;
            if (z && !zOooO0OO2 && playState != 1) {
                oooO0O1.f13572OooO00o.OooO0O0(oooO0O1.f13577OooO0o0, C.OooO0O0(oooO0O1.f13571OooO));
            }
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        if (this.f13527Oooo0 == null) {
            o00000O0.OooO00o(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            OooO0OO oooO0OO5 = this.f13510OooOOOo;
            if (oooO0OO5.f13553OooO0OO != 0 && this.f13523OooOoo0 == 0) {
                int i6 = oooO0OO5.f13557OooO0oO;
                switch (i6) {
                    case 5:
                    case 6:
                    case 18:
                        iOooO0Oo = !(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) ? 1536 : p294o0O0Oo0O.OooOO0.f35750OooO00o[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                        break;
                    case 7:
                    case 8:
                        int iPosition = byteBuffer.position();
                        byte b3 = byteBuffer.get(iPosition);
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i2 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                b2 = byteBuffer.get(iPosition + 7);
                            } else if (b3 != 31) {
                                i2 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                b = byteBuffer.get(iPosition + 5);
                            } else {
                                i2 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                b2 = byteBuffer.get(iPosition + 6);
                            }
                            i3 = b2 & 60;
                            iOooO0Oo = (((i3 >> 2) | i2) + 1) * 32;
                        } else {
                            i2 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                            b = byteBuffer.get(iPosition + 4);
                        }
                        i3 = b & 252;
                        iOooO0Oo = (((i3 >> 2) | i2) + 1) * 32;
                        break;
                    case 9:
                        int iPosition2 = byteBuffer.position();
                        int i7 = o00.f36680OooO00o;
                        int iReverseBytes = byteBuffer.getInt(iPosition2);
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                        }
                        iOooO0Oo = o0ooOOo.OooO0Oo(iReverseBytes);
                        if (iOooO0Oo == -1) {
                            throw new IllegalArgumentException();
                        }
                        break;
                    case 10:
                    case 16:
                        iOooO0Oo = 1024;
                        break;
                    case 11:
                    case 12:
                        iOooO0Oo = RecyclerView.oo0o0Oo.FLAG_MOVED;
                        break;
                    case 13:
                    default:
                        throw new IllegalStateException(Oooo0.OooO00o(38, "Unexpected audio encoding: ", i6));
                    case 14:
                        int iPosition3 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i8 = iPosition3;
                        while (true) {
                            if (i8 <= iLimit) {
                                int i9 = o00.f36680OooO00o;
                                int iReverseBytes2 = byteBuffer.getInt(i8 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                }
                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                    i4 = i8 - iPosition3;
                                } else {
                                    i8++;
                                }
                            } else {
                                i4 = -1;
                            }
                        }
                        if (i4 != -1) {
                            iOooO0Oo = (40 << ((byteBuffer.get((byteBuffer.position() + i4) + ((byteBuffer.get((byteBuffer.position() + i4) + 7) & UByte.MAX_VALUE) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        } else {
                            iOooO0Oo = 0;
                        }
                        break;
                    case 15:
                        iOooO0Oo = 512;
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int iPosition4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition4);
                        iOooO0Oo = p294o0O0Oo0O.OooOO0O.OooO0O0(new o000(bArr, 16)).f35759OooO0OO;
                        break;
                }
                this.f13523OooOoo0 = iOooO0Oo;
                if (iOooO0Oo == 0) {
                    return true;
                }
            }
            if (this.f13513OooOOoo != null) {
                if (!OooOo0O()) {
                    return false;
                }
                OooO0o(j);
                this.f13513OooOOoo = null;
            }
            long j2 = this.f13525OooOooo;
            OooO0OO oooO0OO6 = this.f13510OooOOOo;
            long j3 = ((((oooO0OO6.f13553OooO0OO == 0 ? this.f13514OooOo / ((long) oooO0OO6.f13552OooO0O0) : this.f13520OooOoO0) - this.f13501OooO0o0.f13657OooOOOO) * 1000000) / ((long) oooO0OO6.f13551OooO00o.f13161o00Ooo)) + j2;
            if (!this.f13522OooOoo && Math.abs(j3 - j) > 200000) {
                StringBuilder sb = new StringBuilder(80);
                sb.append("Discontinuity detected [expected ");
                sb.append(j3);
                sb.append(", got ");
                sb.append(j);
                sb.append("]");
                Log.e("AudioTrack", sb.toString());
                this.f13522OooOoo = true;
            }
            if (this.f13522OooOoo) {
                if (!OooOo0O()) {
                    return false;
                }
                long j4 = j - j3;
                this.f13525OooOooo += j4;
                this.f13522OooOoo = false;
                OooO0o(j);
                AudioSink.OooO00o oooO00o3 = this.f13507OooOOO;
                if (oooO00o3 != null && j4 != 0) {
                    com.google.android.exoplayer2.audio.OooOO0.this.f13620o000O0oo = true;
                }
            }
            if (this.f13510OooOOOo.f13553OooO0OO == 0) {
                this.f13514OooOo += (long) byteBuffer.remaining();
            } else {
                this.f13520OooOoO0 += (long) (this.f13523OooOoo0 * i);
            }
            this.f13527Oooo0 = byteBuffer;
            this.f13531Oooo0O0 = i;
        }
        Oooo00o(j);
        if (!this.f13527Oooo0.hasRemaining()) {
            this.f13527Oooo0 = null;
            this.f13531Oooo0O0 = 0;
            return true;
        }
        com.google.android.exoplayer2.audio.OooO0O0 oooO0O2 = this.f13495OooO;
        if (!(oooO0O2.f13596OooOoO0 != -9223372036854775807L && OooOoo() > 0 && SystemClock.elapsedRealtime() - oooO0O2.f13596OooOoO0 >= 200)) {
            return false;
        }
        Log.w("AudioTrack", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOo0(boolean z) {
        Oooo0O0(OooOoO0(), z);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final int OooOo00(Format format) {
        if ("audio/raw".equals(format.f13148OoooOoo)) {
            if (o00.OooOoO(format.f13162o00o0O)) {
                int i = format.f13162o00o0O;
                return (i == 2 || (this.f13498OooO0OO && i == 4)) ? 2 : 1;
            }
            o0O0O00.OooO00o(33, "Invalid PCM encoding: ", format.f13162o00o0O, "AudioTrack");
            return 0;
        }
        if (this.f13506OooOO0o && !this.f13543o000oOoO && Oooo000(format, this.f13511OooOOo)) {
            return 2;
        }
        return OooOoO(format, this.f13496OooO00o) != null ? 2 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean OooOo0O() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.f13535Oooo0oO
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.f13535Oooo0oO = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.f13535Oooo0oO
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.f13529Oooo00O
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.OooO0o()
        L1f:
            r9.Oooo00o(r7)
            boolean r0 = r4.OooO0Oo()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.f13535Oooo0oO
            int r0 = r0 + r2
            r9.f13535Oooo0oO = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f13532Oooo0OO
            if (r0 == 0) goto L3b
            r9.Oooo0o(r0, r7)
            java.nio.ByteBuffer r0 = r9.f13532Oooo0OO
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.f13535Oooo0oO = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.OooOo0O():boolean");
    }

    public final void OooOo0o() {
        int i = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.f13529Oooo00O;
            if (i >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i];
            audioProcessor.flush();
            this.f13530Oooo00o[i] = audioProcessor.OooO0O0();
            i++;
        }
    }

    public final o000O00 OooOoO0() {
        return OooOoOO().f13544OooO00o;
    }

    public final OooO OooOoOO() {
        OooO oooO = this.f13513OooOOoo;
        if (oooO != null) {
            return oooO;
        }
        return !this.f13504OooOO0.isEmpty() ? this.f13504OooOO0.getLast() : this.f13516OooOo00;
    }

    public final long OooOoo() {
        OooO0OO oooO0OO = this.f13510OooOOOo;
        return oooO0OO.f13553OooO0OO == 0 ? this.f13519OooOoO / ((long) oooO0OO.f13554OooO0Oo) : this.f13521OooOoOO;
    }

    public final boolean OooOoo0() {
        return OooOoOO().f13545OooO0O0;
    }

    public final boolean OooOooO() {
        return this.f13512OooOOo0 != null;
    }

    public final void Oooo0() {
        this.f13514OooOo = 0L;
        this.f13520OooOoO0 = 0L;
        this.f13519OooOoO = 0L;
        this.f13521OooOoOO = 0L;
        this.f13542OoooOOO = false;
        this.f13523OooOoo0 = 0;
        this.f13516OooOo00 = new OooO(OooOoO0(), OooOoo0(), 0L, 0L);
        this.f13525OooOooo = 0L;
        this.f13513OooOOoo = null;
        this.f13504OooOO0.clear();
        this.f13527Oooo0 = null;
        this.f13531Oooo0O0 = 0;
        this.f13532Oooo0OO = null;
        this.f13526Oooo = false;
        this.f13536Oooo0oo = false;
        this.f13535Oooo0oO = -1;
        this.f13517OooOo0O = null;
        this.f13518OooOo0o = 0;
        this.f13501OooO0o0.f13657OooOOOO = 0L;
        OooOo0o();
    }

    public final void Oooo00O() {
        if (this.f13526Oooo) {
            return;
        }
        this.f13526Oooo = true;
        com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13495OooO;
        long jOooOoo = OooOoo();
        oooO0O0.f13595OooOoO = oooO0O0.OooO0O0();
        oooO0O0.f13590OooOo = SystemClock.elapsedRealtime() * 1000;
        oooO0O0.f13597OooOoOO = jOooOoo;
        this.f13512OooOOo0.stop();
        this.f13518OooOo0o = 0;
    }

    public final void Oooo00o(long j) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.f13529Oooo00O.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f13530Oooo00o[i - 1];
            } else {
                byteBuffer = this.f13527Oooo0;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f13489OooO00o;
                }
            }
            if (i == length) {
                Oooo0o(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.f13529Oooo00O[i];
                audioProcessor.OooO0OO(byteBuffer);
                ByteBuffer byteBufferOooO0O0 = audioProcessor.OooO0O0();
                this.f13530Oooo00o[i] = byteBufferOooO0O0;
                if (byteBufferOooO0O0.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void Oooo0O0(o000O00 o000o01, boolean z) {
        OooO oooOOooOoOO = OooOoOO();
        if (o000o01.equals(oooOOooOoOO.f13544OooO00o) && z == oooOOooOoOO.f13545OooO0O0) {
            return;
        }
        OooO oooO = new OooO(o000o01, z, -9223372036854775807L, -9223372036854775807L);
        if (OooOooO()) {
            this.f13513OooOOoo = oooO;
        } else {
            this.f13516OooOo00 = oooO;
        }
    }

    @RequiresApi(23)
    public final void Oooo0OO(o000O00 o000o01) {
        if (OooOooO()) {
            try {
                this.f13512OooOOo0.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(o000o01.f40550OooO00o).setPitch(o000o01.f40551OooO0O0).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                o0000O0.OooO0OO("AudioTrack", "Failed to set playback params", e);
            }
            o000o01 = new o000O00(this.f13512OooOOo0.getPlaybackParams().getSpeed(), this.f13512OooOOo0.getPlaybackParams().getPitch());
            com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13495OooO;
            oooO0O0.f13580OooOO0 = o000o01.f40550OooO00o;
            o00Oo0 o00oo1 = oooO0O0.f13576OooO0o;
            if (o00oo1 != null) {
                o00oo1.OooO00o();
            }
        }
        this.f13515OooOo0 = o000o01;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    public final void Oooo0o(ByteBuffer byteBuffer, long j) throws AudioSink.WriteException {
        int iWrite;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f13532Oooo0OO;
            if (byteBuffer2 != null) {
                o00000O0.OooO00o(byteBuffer2 == byteBuffer);
            } else {
                this.f13532Oooo0OO = byteBuffer;
                if (o00.f36680OooO00o < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f13534Oooo0o0;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f13534Oooo0o0 = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f13534Oooo0o0, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f13533Oooo0o = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i = o00.f36680OooO00o;
            if (i < 21) {
                com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13495OooO;
                int iOooO0O0 = oooO0O0.f13577OooO0o0 - ((int) (this.f13519OooOoO - (oooO0O0.OooO0O0() * ((long) oooO0O0.f13575OooO0Oo))));
                if (iOooO0O0 > 0) {
                    iWrite = this.f13512OooOOo0.write(this.f13534Oooo0o0, this.f13533Oooo0o, Math.min(iRemaining2, iOooO0O0));
                    if (iWrite > 0) {
                        this.f13533Oooo0o += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (this.f13537OoooO) {
                o00000O0.OooO0Oo(j != -9223372036854775807L);
                AudioTrack audioTrack = this.f13512OooOOo0;
                if (i >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j * 1000);
                } else {
                    if (this.f13517OooOo0O == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f13517OooOo0O = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f13517OooOo0O.putInt(1431633921);
                    }
                    if (this.f13518OooOo0o == 0) {
                        this.f13517OooOo0O.putInt(4, iRemaining2);
                        this.f13517OooOo0O.putLong(8, j * 1000);
                        this.f13517OooOo0O.position(0);
                        this.f13518OooOo0o = iRemaining2;
                    }
                    int iRemaining3 = this.f13517OooOo0O.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.f13518OooOo0o = 0;
                        } else {
                            this.f13518OooOo0o -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.f13517OooOo0O, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.f13518OooOo0o = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.f13518OooOo0o = 0;
                            } else {
                                this.f13518OooOo0o -= iWrite;
                            }
                        }
                    }
                }
            } else {
                iWrite = this.f13512OooOOo0.write(byteBuffer, iRemaining2, 1);
            }
            this.f13541OoooOO0 = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                if (i >= 24 && iWrite == -6) {
                    if (this.f13510OooOOOo.f13553OooO0OO == 1) {
                        this.f13543o000oOoO = true;
                    }
                }
                throw new AudioSink.WriteException(iWrite);
            }
            if (OooOooo(this.f13512OooOOo0)) {
                long j2 = this.f13521OooOoOO;
                if (j2 > 0) {
                    this.f13542OoooOOO = false;
                }
                if (this.f13539OoooO00 && this.f13507OooOOO != null && iWrite < iRemaining2 && !this.f13542OoooOOO) {
                    com.google.android.exoplayer2.audio.OooO0O0 oooO0O1 = this.f13495OooO;
                    long jOooO0O0 = C.OooO0O0(oooO0O1.OooO00o(j2 - oooO0O1.OooO0O0()));
                    Renderer.OooO00o oooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13612o000O;
                    if (oooO00o != null) {
                        oooO00o.OooO0O0(jOooO0O0);
                    }
                }
            }
            int i2 = this.f13510OooOOOo.f13553OooO0OO;
            if (i2 == 0) {
                this.f13519OooOoO += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i2 != 0) {
                    o00000O0.OooO0Oo(byteBuffer == this.f13527Oooo0);
                    this.f13521OooOoOO += (long) (this.f13523OooOoo0 * this.f13531Oooo0O0);
                }
                this.f13532Oooo0OO = null;
            }
        }
    }

    public final void Oooo0o0() {
        if (OooOooO()) {
            if (o00.f36680OooO00o >= 21) {
                this.f13512OooOOo0.setVolume(this.f13528Oooo000);
                return;
            }
            AudioTrack audioTrack = this.f13512OooOOo0;
            float f = this.f13528Oooo000;
            audioTrack.setStereoVolume(f, f);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void flush() {
        if (OooOooO()) {
            Oooo0();
            AudioTrack audioTrack = this.f13495OooO.f13574OooO0OO;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.f13512OooOOo0.pause();
            }
            if (OooOooo(this.f13512OooOOo0)) {
                OooOO0O oooOO0O = this.f13508OooOOO0;
                Objects.requireNonNull(oooOO0O);
                oooOO0O.OooO0O0(this.f13512OooOOo0);
            }
            AudioTrack audioTrack2 = this.f13512OooOOo0;
            this.f13512OooOOo0 = null;
            OooO0OO oooO0OO = this.f13509OooOOOO;
            if (oooO0OO != null) {
                this.f13510OooOOOo = oooO0OO;
                this.f13509OooOOOO = null;
            }
            this.f13495OooO.OooO0Oo();
            this.f13503OooO0oo.close();
            new OooO00o(audioTrack2).start();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void pause() {
        boolean z = false;
        this.f13539OoooO00 = false;
        if (OooOooO()) {
            com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13495OooO;
            oooO0O0.f13582OooOO0o = 0L;
            oooO0O0.f13594OooOo0o = 0;
            oooO0O0.f13593OooOo0O = 0;
            oooO0O0.f13584OooOOO0 = 0L;
            oooO0O0.f13598OooOoo = 0L;
            oooO0O0.f13602Oooo000 = 0L;
            oooO0O0.f13581OooOO0O = false;
            if (oooO0O0.f13590OooOo == -9223372036854775807L) {
                o00Oo0 o00oo1 = oooO0O0.f13576OooO0o;
                Objects.requireNonNull(o00oo1);
                o00oo1.OooO00o();
                z = true;
            }
            if (z) {
                this.f13512OooOOo0.pause();
            }
        }
    }
}

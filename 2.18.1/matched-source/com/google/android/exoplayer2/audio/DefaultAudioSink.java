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
import p265o00ooo00.Oooo0;
import p293o0O0Oo0O.o00Oo0;
import p293o0O0Oo0O.o00Ooo;
import p293o0O0Oo0O.o0ooOOo;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000OO0;
import p318o0O0oOo.o0000oo;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.OooO0O0 f13478OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final p293o0O0Oo0O.OooOOO f13479OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f13480OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f13481OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.OooO0o f13482OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AudioProcessor[] f13483OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOOO f13484OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AudioProcessor[] f13485OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ConditionVariable f13486OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayDeque<OooO> f13487OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f13488OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f13489OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public AudioSink.OooO00o f13490OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OooOO0O f13491OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public OooO0OO f13492OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooO0OO f13493OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public p293o0O0Oo0O.OooOOO0 f13494OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public AudioTrack f13495OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooO f13496OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f13497OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o000O00 f13498OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooO f13499OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public ByteBuffer f13500OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f13501OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f13502OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f13503OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f13504OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f13505OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f13506OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f13507OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f13508OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f13509Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @Nullable
    public ByteBuffer f13510Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f13511Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public AudioProcessor[] f13512Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public ByteBuffer[] f13513Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f13514Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public ByteBuffer f13515Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f13516Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public byte[] f13517Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f13518Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f13519Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f13520OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f13521OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f13522OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public o00Ooo f13523OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public long f13524OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f13525OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f13526o000oOoO;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    public static final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000O00 f13527OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f13528OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f13529OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f13530OooO0Oo;

        public OooO(o000O00 o000o01, boolean z, long j, long j2) {
            this.f13527OooO00o = o000o01;
            this.f13528OooO0O0 = z;
            this.f13529OooO0OO = j;
            this.f13530OooO0Oo = j2;
        }
    }

    public class OooO00o extends Thread {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ AudioTrack f13531Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f13531Oooo0o = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                this.f13531Oooo0o.flush();
                this.f13531Oooo0o.release();
            } finally {
                DefaultAudioSink.this.f13486OooO0oo.open();
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
        public final boolean f13533OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Format f13534OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f13535OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f13536OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f13537OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f13538OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f13539OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f13540OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f13541OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final AudioProcessor[] f13542OooOO0;

        public OooO0OO(Format format, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, AudioProcessor[] audioProcessorArr) {
            int iOooO0oo;
            this.f13534OooO00o = format;
            this.f13535OooO0O0 = i;
            this.f13536OooO0OO = i2;
            this.f13537OooO0Oo = i3;
            this.f13539OooO0o0 = i4;
            this.f13538OooO0o = i5;
            this.f13540OooO0oO = i6;
            this.f13533OooO = z2;
            this.f13542OooOO0 = audioProcessorArr;
            if (i2 == 0) {
                float f = z ? 8.0f : 1.0f;
                int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
                o00000O0.OooO0Oo(minBufferSize != -2);
                long j = i4;
                iOooO0oo = o000OOo0.OooO0oo(minBufferSize * 4, ((int) ((250000 * j) / 1000000)) * i3, Math.max(minBufferSize, ((int) ((j * 750000) / 1000000)) * i3));
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
            this.f13541OooO0oo = iOooO0oo;
        }

        @RequiresApi(21)
        public static AudioAttributes OooO0Oo(p293o0O0Oo0O.OooOOO0 oooOOO0, boolean z) {
            return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : oooOOO0.OooO00o();
        }

        public final AudioTrack OooO00o(boolean z, p293o0O0Oo0O.OooOOO0 oooOOO0, int i) throws AudioSink.InitializationException {
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
                throw new AudioSink.InitializationException(state, this.f13539OooO0o0, this.f13538OooO0o, this.f13541OooO0oo);
            } catch (UnsupportedOperationException unused2) {
                throw new AudioSink.InitializationException(0, this.f13539OooO0o0, this.f13538OooO0o, this.f13541OooO0oo);
            }
        }

        public final AudioTrack OooO0O0(boolean z, p293o0O0Oo0O.OooOOO0 oooOOO0, int i) {
            int i2 = o000OOo0.f36740OooO00o;
            if (i2 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(OooO0Oo(oooOOO0, z)).setAudioFormat(DefaultAudioSink.OooOo(this.f13539OooO0o0, this.f13538OooO0o, this.f13540OooO0oO)).setTransferMode(1).setBufferSizeInBytes(this.f13541OooO0oo).setSessionId(i).setOffloadedPlayback(this.f13536OooO0OO == 1).build();
            }
            if (i2 >= 21) {
                return new AudioTrack(OooO0Oo(oooOOO0, z), DefaultAudioSink.OooOo(this.f13539OooO0o0, this.f13538OooO0o, this.f13540OooO0oO), this.f13541OooO0oo, 1, i);
            }
            int iOooOo0 = o000OOo0.OooOo0(oooOOO0.f35746OooO0OO);
            return i == 0 ? new AudioTrack(iOooOo0, this.f13539OooO0o0, this.f13538OooO0o, this.f13540OooO0oO, this.f13541OooO0oo, 1) : new AudioTrack(iOooOo0, this.f13539OooO0o0, this.f13538OooO0o, this.f13540OooO0oO, this.f13541OooO0oo, 1, i);
        }

        public final long OooO0OO(long j) {
            return (j * 1000000) / ((long) this.f13539OooO0o0);
        }

        public final int OooO0o0(long j) {
            int i;
            int i2 = this.f13540OooO0oO;
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
        public final AudioProcessor[] f13543OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOOO0 f13544OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooOOO f13545OooO0OO;

        public OooO0o(AudioProcessor... audioProcessorArr) {
            OooOOO0 oooOOO0 = new OooOOO0();
            OooOOO oooOOO = new OooOOO();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f13543OooO00o = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f13544OooO0O0 = oooOOO0;
            this.f13545OooO0OO = oooOOO;
            audioProcessorArr2[audioProcessorArr.length] = oooOOO0;
            audioProcessorArr2[audioProcessorArr.length + 1] = oooOOO;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.OooO0O0
        public final long OooO00o(long j) {
            OooOOO oooOOO = this.f13545OooO0OO;
            long j2 = oooOOO.f13619OooOOOO;
            if (j2 < 1024) {
                return (long) (((double) oooOOO.f13608OooO0OO) * j);
            }
            int i = oooOOO.f13613OooO0oo.f13474OooO00o;
            int i2 = oooOOO.f13612OooO0oO.f13474OooO00o;
            return i == i2 ? o000OOo0.OooOooo(j, oooOOO.f13617OooOOO, j2) : o000OOo0.OooOooo(j, oooOOO.f13617OooOOO * ((long) i), j2 * ((long) i2));
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.OooO0O0
        public final long OooO0O0() {
            return this.f13544OooO0O0.f13632OooOo00;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.OooO0O0
        public final boolean OooO0OO(boolean z) {
            this.f13544OooO0O0.f13626OooOOO0 = z;
            return z;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.OooO0O0
        public final o000O00 OooO0Oo(o000O00 o000o01) {
            OooOOO oooOOO = this.f13545OooO0OO;
            float f = o000o01.f40531OooO00o;
            if (oooOOO.f13608OooO0OO != f) {
                oooOOO.f13608OooO0OO = f;
                oooOOO.f13606OooO = true;
            }
            float f2 = o000o01.f40532OooO0O0;
            if (oooOOO.f13609OooO0Oo != f2) {
                oooOOO.f13609OooO0Oo = f2;
                oooOOO.f13606OooO = true;
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
            AudioSink.OooO00o oooO00o = DefaultAudioSink.this.f13490OooOOO;
            if (oooO00o == null || (handler = (c0096OooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13604o000Ooo).f13552OooO00o) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: o0O0Oo0O.o000oOoO
                @Override // java.lang.Runnable
                public final void run() {
                    OooO00o.C0096OooO00o c0096OooO00o2 = c0096OooO00o;
                    long j2 = j;
                    OooO00o oooO00o2 = c0096OooO00o2.f13553OooO0O0;
                    int i = o000OOo0.f36740OooO00o;
                    oooO00o2.Oooo00o(j2);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.OooO0O0.OooO00o
        public final void OooO0O0(final int i, final long j) {
            if (DefaultAudioSink.this.f13490OooOOO != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                final long j2 = jElapsedRealtime - defaultAudioSink.f13524OoooOO0;
                final com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13604o000Ooo;
                Handler handler = c0096OooO00o.f13552OooO00o;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: o0O0Oo0O.Oooo0
                        @Override // java.lang.Runnable
                        public final void run() {
                            OooO00o.C0096OooO00o c0096OooO00o2 = c0096OooO00o;
                            int i2 = i;
                            long j3 = j;
                            long j4 = j2;
                            OooO00o oooO00o = c0096OooO00o2.f13553OooO0O0;
                            int i3 = o000OOo0.f36740OooO00o;
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
            OooO0OO oooO0OO = defaultAudioSink.f13493OooOOOo;
            long j5 = oooO0OO.f13536OooO0OO == 0 ? defaultAudioSink.f13497OooOo / ((long) oooO0OO.f13535OooO0O0) : defaultAudioSink.f13503OooOoO0;
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
            OooO0OO oooO0OO = defaultAudioSink.f13493OooOOOo;
            long j5 = oooO0OO.f13536OooO0OO == 0 ? defaultAudioSink.f13497OooOo / ((long) oooO0OO.f13535OooO0O0) : defaultAudioSink.f13503OooOoO0;
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
        public final Handler f13547OooO00o = new Handler();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o f13548OooO0O0 = new OooO00o();

        public class OooO00o extends AudioTrack.StreamEventCallback {
            public OooO00o() {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onDataRequest(AudioTrack audioTrack, int i) {
                Renderer.OooO00o oooO00o;
                o00000O0.OooO0Oo(audioTrack == DefaultAudioSink.this.f13495OooOOo0);
                AudioSink.OooO00o oooO00o2 = DefaultAudioSink.this.f13490OooOOO;
                if (oooO00o2 == null || (oooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13602o000O0o0) == null) {
                    return;
                }
                oooO00o.OooO00o();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onTearDown(@NonNull AudioTrack audioTrack) {
                Renderer.OooO00o oooO00o;
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.OooO00o oooO00o2 = defaultAudioSink.f13490OooOOO;
                if (oooO00o2 == null || !defaultAudioSink.f13522OoooO00 || (oooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13602o000O0o0) == null) {
                    return;
                }
                oooO00o.OooO00o();
            }
        }

        public OooOO0O() {
        }

        public final void OooO00o(AudioTrack audioTrack) {
            final Handler handler = this.f13547OooO00o;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: o0O0Oo0O.oo000o
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f13548OooO0O0);
        }

        public final void OooO0O0(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f13548OooO0O0);
            this.f13547OooO00o.removeCallbacksAndMessages(null);
        }
    }

    public DefaultAudioSink(@Nullable p293o0O0Oo0O.OooOOO oooOOO, OooO0O0 oooO0O0) {
        this.f13479OooO00o = oooOOO;
        this.f13480OooO0O0 = oooO0O0;
        int i = o000OOo0.f36740OooO00o;
        this.f13481OooO0OO = false;
        this.f13488OooOO0O = false;
        this.f13489OooOO0o = false;
        this.f13486OooO0oo = new ConditionVariable(true);
        this.f13478OooO = new com.google.android.exoplayer2.audio.OooO0O0(new OooOO0());
        com.google.android.exoplayer2.audio.OooO0o oooO0o = new com.google.android.exoplayer2.audio.OooO0o();
        this.f13482OooO0Oo = oooO0o;
        OooOOOO oooOOOO = new OooOOOO();
        this.f13484OooO0o0 = oooOOOO;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new com.google.android.exoplayer2.audio.OooOO0O(), oooO0o, oooOOOO);
        Collections.addAll(arrayList, ((OooO0o) oooO0O0).f13543OooO00o);
        this.f13483OooO0o = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f13485OooO0oO = new AudioProcessor[]{new com.google.android.exoplayer2.audio.OooO()};
        this.f13511Oooo000 = 1.0f;
        this.f13494OooOOo = p293o0O0Oo0O.OooOOO0.f35743OooO0o;
        this.f13521OoooO0 = 0;
        this.f13523OoooO0O = new o00Ooo();
        o000O00 o000o01 = o000O00.f40530OooO0Oo;
        this.f13499OooOo00 = new OooO(o000o01, false, 0L, 0L);
        this.f13498OooOo0 = o000o01;
        this.f13518Oooo0oO = -1;
        this.f13512Oooo00O = new AudioProcessor[0];
        this.f13513Oooo00o = new ByteBuffer[0];
        this.f13487OooOO0 = new ArrayDeque<>();
    }

    @RequiresApi(21)
    public static AudioFormat OooOo(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x004f  */
    @Nullable
    public static Pair<Integer, Integer> OooOoO(Format format, @Nullable p293o0O0Oo0O.OooOOO oooOOO) {
        if (oooOOO == null) {
            return null;
        }
        String str = format.f13131OoooOOo;
        Objects.requireNonNull(str);
        int iOooO0O0 = o000OO.OooO0O0(str, format.f13129OoooOO0);
        int i = 8;
        if (!(iOooO0O0 == 5 || iOooO0O0 == 6 || iOooO0O0 == 18 || iOooO0O0 == 17 || iOooO0O0 == 7 || iOooO0O0 == 8 || iOooO0O0 == 14)) {
            return null;
        }
        int i2 = iOooO0O0 == 18 ? 6 : format.f13150o0OoOo0;
        if (i2 > oooOOO.f35742OooO0O0) {
            return null;
        }
        int i3 = o000OOo0.f36740OooO00o;
        if (i3 > 28) {
            i = i2;
        } else if (i2 != 7) {
            if (i2 == 3 || i2 == 4 || i2 == 5) {
                i = 6;
            } else {
                i = i2;
            }
        }
        if (i3 <= 26 && "fugu".equals(o000OOo0.f36741OooO0O0) && i == 1) {
            i = 2;
        }
        int iOooOOO = o000OOo0.OooOOO(i);
        if (iOooOOO == 0) {
            return null;
        }
        if (Arrays.binarySearch(oooOOO.f35741OooO00o, iOooO0O0) >= 0) {
            return Pair.create(Integer.valueOf(iOooO0O0), Integer.valueOf(iOooOOO));
        }
        if (iOooO0O0 == 18) {
            if (Arrays.binarySearch(oooOOO.f35741OooO00o, 6) >= 0) {
                return Pair.create(6, Integer.valueOf(iOooOOO));
            }
        }
        return null;
    }

    public static boolean OooOooo(AudioTrack audioTrack) {
        return o000OOo0.f36740OooO00o >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static boolean Oooo000(Format format, p293o0O0Oo0O.OooOOO0 oooOOO0) {
        int iOooOOO;
        int i = o000OOo0.f36740OooO00o;
        if (i < 29) {
            return false;
        }
        String str = format.f13131OoooOOo;
        Objects.requireNonNull(str);
        int iOooO0O0 = o000OO.OooO0O0(str, format.f13129OoooOO0);
        if (iOooO0O0 == 0 || (iOooOOO = o000OOo0.OooOOO(format.f13150o0OoOo0)) == 0 || !AudioManager.isOffloadedPlaybackSupported(OooOo(format.f13152ooOO, iOooOOO, iOooO0O0), oooOOO0.OooO00o())) {
            return false;
        }
        if (!(format.f13146o00Oo0 == 0 && format.f13147o00Ooo == 0)) {
            if (!(i >= 30 && o000OOo0.f36743OooO0Oo.startsWith("Pixel"))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean OooO() {
        return OooOooO() && this.f13478OooO.OooO0OO(OooOoo());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO00o() {
        flush();
        for (AudioProcessor audioProcessor : this.f13483OooO0o) {
            audioProcessor.OooO00o();
        }
        for (AudioProcessor audioProcessor2 : this.f13485OooO0oO) {
            audioProcessor2.OooO00o();
        }
        this.f13521OoooO0 = 0;
        this.f13522OoooO00 = false;
        this.f13526o000oOoO = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO0O0() {
        this.f13522OoooO00 = true;
        if (OooOooO()) {
            o00Oo0 o00oo1 = this.f13478OooO.f13559OooO0o;
            Objects.requireNonNull(o00oo1);
            o00oo1.OooO00o();
            this.f13495OooOOo0.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean OooO0OO(Format format) {
        return OooOo00(format) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean OooO0Oo() {
        return !OooOooO() || (this.f13519Oooo0oo && !OooO());
    }

    public final void OooO0o(long j) {
        final com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o;
        Handler handler;
        o000O00 o000o00OooO0Oo = this.f13493OooOOOo.f13533OooO ? this.f13480OooO0O0.OooO0Oo(OooOoO0()) : o000O00.f40530OooO0Oo;
        final boolean zOooO0OO = this.f13493OooOOOo.f13533OooO ? this.f13480OooO0O0.OooO0OO(OooOoo0()) : false;
        this.f13487OooOO0.add(new OooO(o000o00OooO0Oo, zOooO0OO, Math.max(0L, j), this.f13493OooOOOo.OooO0OO(OooOoo())));
        AudioProcessor[] audioProcessorArr = this.f13493OooOOOo.f13542OooOO0;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.f13512Oooo00O = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f13513Oooo00o = new ByteBuffer[size];
        OooOo0o();
        AudioSink.OooO00o oooO00o = this.f13490OooOOO;
        if (oooO00o == null || (handler = (c0096OooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13604o000Ooo).f13552OooO00o) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: o0O0Oo0O.o00O0O
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o.C0096OooO00o c0096OooO00o2 = c0096OooO00o;
                boolean z = zOooO0OO;
                OooO00o oooO00o2 = c0096OooO00o2.f13553OooO0O0;
                int i = o000OOo0.f36740OooO00o;
                oooO00o2.OooO0o(z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO0o0(o000O00 o000o01) {
        o000O00 o000o02 = new o000O00(o000OOo0.OooO0oO(o000o01.f40531OooO00o, 0.1f, 8.0f), o000OOo0.OooO0oO(o000o01.f40532OooO0O0, 0.1f, 8.0f));
        if (!this.f13488OooOO0O || o000OOo0.f36740OooO00o < 23) {
            Oooo0O0(o000o02, OooOoo0());
        } else {
            Oooo0OO(o000o02);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final o000O00 OooO0oO() {
        return this.f13488OooOO0O ? this.f13498OooOo0 : OooOoO0();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO0oo() throws AudioSink.WriteException {
        if (!this.f13519Oooo0oo && OooOooO() && OooOo0O()) {
            Oooo00O();
            this.f13519Oooo0oo = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOO0(p293o0O0Oo0O.OooOOO0 oooOOO0) {
        if (this.f13494OooOOo.equals(oooOOO0)) {
            return;
        }
        this.f13494OooOOo = oooOOO0;
        if (this.f13520OoooO) {
            return;
        }
        flush();
        this.f13521OoooO0 = 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOO0O(int i) {
        if (this.f13521OoooO0 != i) {
            this.f13521OoooO0 = i;
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
        if ("audio/raw".equals(format.f13131OoooOOo)) {
            o00000O0.OooO00o(o000OOo0.OooOoO(format.f13145o00O0O));
            int iOooOo00 = o000OOo0.OooOo00(format.f13145o00O0O, format.f13150o0OoOo0);
            if (this.f13481OooO0OO) {
                int i5 = format.f13145o00O0O;
                if (i5 == 536870912 || i5 == 805306368 || i5 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            AudioProcessor[] audioProcessorArr2 = z2 ? this.f13485OooO0oO : this.f13483OooO0o;
            boolean z3 = !z2;
            OooOOOO oooOOOO = this.f13484OooO0o0;
            int i6 = format.f13146o00Oo0;
            int i7 = format.f13147o00Ooo;
            oooOOOO.f13633OooO = i6;
            oooOOOO.f13634OooOO0 = i7;
            if (o000OOo0.f36740OooO00o < 21 && format.f13150o0OoOo0 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.f13482OooO0Oo.f13593OooO = iArr2;
            AudioProcessor.OooO00o oooO00o = new AudioProcessor.OooO00o(format.f13152ooOO, format.f13150o0OoOo0, format.f13145o00O0O);
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
            int i9 = oooO00o.f13476OooO0OO;
            int i10 = oooO00o.f13474OooO00o;
            iIntValue = o000OOo0.OooOOO(oooO00o.f13475OooO0O0);
            int iOooOo01 = o000OOo0.OooOo00(i9, oooO00o.f13475OooO0O0);
            z = z3;
            audioProcessorArr = audioProcessorArr2;
            iOooO0O0 = i9;
            i3 = i10;
            i = 0;
            i4 = iOooOo01;
            i2 = iOooOo00;
        } else {
            audioProcessorArr = new AudioProcessor[0];
            int i11 = format.f13152ooOO;
            if (this.f13489OooOO0o && Oooo000(format, this.f13494OooOOo)) {
                String str = format.f13131OoooOOo;
                Objects.requireNonNull(str);
                iOooO0O0 = o000OO.OooO0O0(str, format.f13129OoooOO0);
                iIntValue = o000OOo0.OooOOO(format.f13150o0OoOo0);
                i2 = -1;
                i = 1;
            } else {
                Pair<Integer, Integer> pairOooOoO = OooOoO(format, this.f13479OooO00o);
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
            this.f13526o000oOoO = false;
            OooO0OO oooO0OO = new OooO0OO(format, i2, i, i4, i3, iIntValue, iOooO0O0, this.f13488OooOO0O, z, audioProcessorArr);
            if (OooOooO()) {
                this.f13492OooOOOO = oooO0OO;
                return;
            } else {
                this.f13493OooOOOo = oooO0OO;
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
        if (this.f13520OoooO) {
            this.f13520OoooO = false;
            this.f13521OoooO0 = 0;
            flush();
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final long OooOOO0(boolean z) {
        long jOooO00o;
        boolean timestamp;
        Method method;
        if (!OooOooO() || this.f13507OooOooO) {
            return Long.MIN_VALUE;
        }
        com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13478OooO;
        AudioTrack audioTrack = oooO0O0.f13557OooO0OO;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long jOooO00o2 = oooO0O0.OooO00o(oooO0O0.OooO0O0());
            if (jOooO00o2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - oooO0O0.f13567OooOOO0 >= 30000) {
                    long[] jArr = oooO0O0.f13556OooO0O0;
                    int i = oooO0O0.f13576OooOo0O;
                    jArr[i] = jOooO00o2 - jNanoTime;
                    oooO0O0.f13576OooOo0O = (i + 1) % 10;
                    int i2 = oooO0O0.f13577OooOo0o;
                    if (i2 < 10) {
                        oooO0O0.f13577OooOo0o = i2 + 1;
                    }
                    oooO0O0.f13567OooOOO0 = jNanoTime;
                    oooO0O0.f13565OooOO0o = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = oooO0O0.f13577OooOo0o;
                        if (i3 >= i4) {
                            break;
                        }
                        oooO0O0.f13565OooOO0o = (oooO0O0.f13556OooO0O0[i3] / ((long) i4)) + oooO0O0.f13565OooOO0o;
                        i3++;
                    }
                }
                if (!oooO0O0.f13562OooO0oo) {
                    o00Oo0 o00oo1 = oooO0O0.f13559OooO0o;
                    Objects.requireNonNull(o00oo1);
                    o00Oo0.OooO00o oooO00o = o00oo1.f35765OooO00o;
                    if (oooO00o == null || jNanoTime - o00oo1.f35770OooO0o0 < o00oo1.f35768OooO0Oo) {
                        timestamp = false;
                    } else {
                        o00oo1.f35770OooO0o0 = jNanoTime;
                        timestamp = oooO00o.f35771OooO00o.getTimestamp(oooO00o.f35772OooO0O0);
                        if (timestamp) {
                            long j = oooO00o.f35772OooO0O0.framePosition;
                            if (oooO00o.f35774OooO0Oo > j) {
                                oooO00o.f35773OooO0OO++;
                            }
                            oooO00o.f35774OooO0Oo = j;
                            oooO00o.f35775OooO0o0 = j + (oooO00o.f35773OooO0OO << 32);
                        }
                        int i5 = o00oo1.f35766OooO0O0;
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
                            } else if (o00oo1.f35765OooO00o.f35775OooO0o0 > o00oo1.f35769OooO0o) {
                                o00oo1.OooO0O0(2);
                            }
                        } else if (timestamp) {
                            o00Oo0.OooO00o oooO00o2 = o00oo1.f35765OooO00o;
                            if (oooO00o2.f35772OooO0O0.nanoTime / 1000 >= o00oo1.f35767OooO0OO) {
                                o00oo1.f35769OooO0o = oooO00o2.f35775OooO0o0;
                                o00oo1.OooO0O0(1);
                            } else {
                                timestamp = false;
                            }
                        } else if (jNanoTime - o00oo1.f35767OooO0OO > 500000) {
                            o00oo1.OooO0O0(3);
                        }
                    }
                    if (timestamp) {
                        o00Oo0.OooO00o oooO00o3 = o00oo1.f35765OooO00o;
                        long j2 = oooO00o3 != null ? oooO00o3.f35772OooO0O0.nanoTime / 1000 : -9223372036854775807L;
                        long j3 = oooO00o3 != null ? oooO00o3.f35775OooO0o0 : -1L;
                        if (Math.abs(j2 - jNanoTime) > 5000000) {
                            oooO0O0.f13555OooO00o.OooO0o0(j3, j2, jNanoTime, jOooO00o2);
                            o00oo1.OooO0O0(4);
                        } else if (Math.abs(oooO0O0.OooO00o(j3) - jOooO00o2) > 5000000) {
                            oooO0O0.f13555OooO00o.OooO0Oo(j3, j2, jNanoTime, jOooO00o2);
                            o00oo1.OooO0O0(4);
                        } else if (o00oo1.f35766OooO0O0 == 4) {
                            o00oo1.OooO00o();
                        }
                    }
                    if (oooO0O0.f13571OooOOo0 && (method = oooO0O0.f13566OooOOO) != null && jNanoTime - oooO0O0.f13570OooOOo >= 500000) {
                        try {
                            AudioTrack audioTrack2 = oooO0O0.f13557OooO0OO;
                            Objects.requireNonNull(audioTrack2);
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                            int i6 = o000OOo0.f36740OooO00o;
                            long jIntValue = (((long) num.intValue()) * 1000) - oooO0O0.f13554OooO;
                            oooO0O0.f13568OooOOOO = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            oooO0O0.f13568OooOOOO = jMax;
                            if (jMax > 5000000) {
                                oooO0O0.f13555OooO00o.OooO0OO(jMax);
                                oooO0O0.f13568OooOOOO = 0L;
                            }
                        } catch (Exception unused) {
                            oooO0O0.f13566OooOOO = null;
                        }
                        oooO0O0.f13570OooOOo = jNanoTime;
                    }
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        o00Oo0 o00oo2 = oooO0O0.f13559OooO0o;
        Objects.requireNonNull(o00oo2);
        boolean z2 = o00oo2.f35766OooO0O0 == 2;
        if (z2) {
            o00Oo0.OooO00o oooO00o4 = o00oo2.f35765OooO00o;
            long jOooO00o3 = oooO0O0.OooO00o(oooO00o4 != null ? oooO00o4.f35775OooO0o0 : -1L);
            o00Oo0.OooO00o oooO00o5 = o00oo2.f35765OooO00o;
            jOooO00o = o000OOo0.OooOOo0(jNanoTime2 - (oooO00o5 != null ? oooO00o5.f35772OooO0O0.nanoTime / 1000 : -9223372036854775807L), oooO0O0.f13563OooOO0) + jOooO00o3;
        } else {
            jOooO00o = oooO0O0.f13577OooOo0o == 0 ? oooO0O0.OooO00o(oooO0O0.OooO0O0()) : oooO0O0.f13565OooOO0o + jNanoTime2;
            if (!z) {
                jOooO00o = Math.max(0L, jOooO00o - oooO0O0.f13568OooOOOO);
            }
        }
        if (oooO0O0.f13583OooOooO != z2) {
            oooO0O0.f13585Oooo000 = oooO0O0.f13581OooOoo;
            oooO0O0.f13584OooOooo = oooO0O0.f13582OooOoo0;
        }
        long j4 = jNanoTime2 - oooO0O0.f13585Oooo000;
        if (j4 < 1000000) {
            long jOooOOo0 = o000OOo0.OooOOo0(j4, oooO0O0.f13563OooOO0) + oooO0O0.f13584OooOooo;
            long j5 = (j4 * 1000) / 1000000;
            jOooO00o = (((1000 - j5) * jOooOOo0) + (jOooO00o * j5)) / 1000;
        }
        if (!oooO0O0.f13564OooOO0O) {
            long j6 = oooO0O0.f13582OooOoo0;
            if (jOooO00o > j6) {
                oooO0O0.f13564OooOO0O = true;
                long jOooO0O0 = C.OooO0O0(jOooO00o - j6);
                float f = oooO0O0.f13563OooOO0;
                int i7 = o000OOo0.f36740OooO00o;
                if (f != 1.0f) {
                    jOooO0O0 = Math.round(jOooO0O0 / ((double) f));
                }
                oooO0O0.f13555OooO00o.OooO00o(System.currentTimeMillis() - C.OooO0O0(jOooO0O0));
            }
        }
        oooO0O0.f13581OooOoo = jNanoTime2;
        oooO0O0.f13582OooOoo0 = jOooO00o;
        oooO0O0.f13583OooOooO = z2;
        long jMin = Math.min(jOooO00o, this.f13493OooOOOo.OooO0OO(OooOoo()));
        while (!this.f13487OooOO0.isEmpty() && jMin >= this.f13487OooOO0.getFirst().f13530OooO0Oo) {
            this.f13499OooOo00 = this.f13487OooOO0.remove();
        }
        OooO oooO = this.f13499OooOo00;
        long jOooO00o4 = jMin - oooO.f13530OooO0Oo;
        if (!oooO.f13527OooO00o.equals(o000O00.f40530OooO0Oo)) {
            jOooO00o4 = this.f13487OooOO0.isEmpty() ? this.f13480OooO0O0.OooO00o(jOooO00o4) : o000OOo0.OooOOo0(jOooO00o4, this.f13499OooOo00.f13527OooO00o.f40531OooO00o);
        }
        return this.f13493OooOOOo.OooO0OO(this.f13480OooO0O0.OooO0O0()) + this.f13499OooOo00.f13529OooO0OO + jOooO00o4;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOOO() {
        this.f13505OooOoo = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOOo(float f) {
        if (this.f13511Oooo000 != f) {
            this.f13511Oooo000 = f;
            Oooo0o0();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOo(o00Ooo o00ooo2) {
        if (this.f13523OoooO0O.equals(o00ooo2)) {
            return;
        }
        int i = o00ooo2.f35776OooO00o;
        float f = o00ooo2.f35777OooO0O0;
        AudioTrack audioTrack = this.f13495OooOOo0;
        if (audioTrack != null) {
            if (this.f13523OoooO0O.f35776OooO00o != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f13495OooOOo0.setAuxEffectSendLevel(f);
            }
        }
        this.f13523OoooO0O = o00ooo2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOo0(int i) {
        o00000O0.OooO0Oo(o000OOo0.f36740OooO00o >= 21);
        if (this.f13520OoooO && this.f13521OoooO0 == i) {
            return;
        }
        this.f13520OoooO = true;
        this.f13521OoooO0 = i;
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
        ByteBuffer byteBuffer2 = this.f13510Oooo0;
        o00000O0.OooO00o(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f13492OooOOOO != null) {
            if (!OooOo0O()) {
                return false;
            }
            OooO0OO oooO0OO = this.f13492OooOOOO;
            OooO0OO oooO0OO2 = this.f13493OooOOOo;
            Objects.requireNonNull(oooO0OO);
            if (oooO0OO2.f13536OooO0OO == oooO0OO.f13536OooO0OO && oooO0OO2.f13540OooO0oO == oooO0OO.f13540OooO0oO && oooO0OO2.f13539OooO0o0 == oooO0OO.f13539OooO0o0 && oooO0OO2.f13538OooO0o == oooO0OO.f13538OooO0o && oooO0OO2.f13537OooO0Oo == oooO0OO.f13537OooO0Oo) {
                this.f13493OooOOOo = this.f13492OooOOOO;
                this.f13492OooOOOO = null;
                if (OooOooo(this.f13495OooOOo0)) {
                    this.f13495OooOOo0.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f13495OooOOo0;
                    Format format = this.f13493OooOOOo.f13534OooO00o;
                    audioTrack.setOffloadDelayPadding(format.f13146o00Oo0, format.f13147o00Ooo);
                    this.f13525OoooOOO = true;
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
            this.f13486OooO0oo.block();
            try {
                OooO0OO oooO0OO3 = this.f13493OooOOOo;
                Objects.requireNonNull(oooO0OO3);
                AudioTrack audioTrackOooO00o = oooO0OO3.OooO00o(this.f13520OoooO, this.f13494OooOOo, this.f13521OoooO0);
                this.f13495OooOOo0 = audioTrackOooO00o;
                if (OooOooo(audioTrackOooO00o)) {
                    AudioTrack audioTrack2 = this.f13495OooOOo0;
                    if (this.f13491OooOOO0 == null) {
                        this.f13491OooOOO0 = new OooOO0O();
                    }
                    this.f13491OooOOO0.OooO00o(audioTrack2);
                    AudioTrack audioTrack3 = this.f13495OooOOo0;
                    Format format2 = this.f13493OooOOOo.f13534OooO00o;
                    audioTrack3.setOffloadDelayPadding(format2.f13146o00Oo0, format2.f13147o00Ooo);
                }
                final int audioSessionId = this.f13495OooOOo0.getAudioSessionId();
                if (this.f13521OoooO0 != audioSessionId) {
                    this.f13521OoooO0 = audioSessionId;
                    AudioSink.OooO00o oooO00o = this.f13490OooOOO;
                    if (oooO00o != null) {
                        com.google.android.exoplayer2.audio.OooOO0.OooO00o oooO00o2 = (com.google.android.exoplayer2.audio.OooOO0.OooO00o) oooO00o;
                        final com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13604o000Ooo;
                        Handler handler = c0096OooO00o.f13552OooO00o;
                        if (handler != null) {
                            handler.post(new Runnable() { // from class: o0O0Oo0O.Oooo000
                                @Override // java.lang.Runnable
                                public final void run() {
                                    OooO00o.C0096OooO00o c0096OooO00o2 = c0096OooO00o;
                                    int i5 = audioSessionId;
                                    OooO00o oooO00o3 = c0096OooO00o2.f13553OooO0O0;
                                    int i6 = o000OOo0.f36740OooO00o;
                                    oooO00o3.OooO0O0(i5);
                                }
                            });
                        }
                        Objects.requireNonNull(com.google.android.exoplayer2.audio.OooOO0.this);
                    }
                }
                com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13478OooO;
                AudioTrack audioTrack4 = this.f13495OooOOo0;
                OooO0OO oooO0OO4 = this.f13493OooOOOo;
                oooO0O0.OooO0o0(audioTrack4, oooO0OO4.f13536OooO0OO == 2, oooO0OO4.f13540OooO0oO, oooO0OO4.f13537OooO0Oo, oooO0OO4.f13541OooO0oo);
                Oooo0o0();
                int i5 = this.f13523OoooO0O.f35776OooO00o;
                if (i5 != 0) {
                    this.f13495OooOOo0.attachAuxEffect(i5);
                    this.f13495OooOOo0.setAuxEffectSendLevel(this.f13523OoooO0O.f35777OooO0O0);
                }
                this.f13507OooOooO = true;
            } catch (AudioSink.InitializationException e) {
                if (this.f13493OooOOOo.f13536OooO0OO == 1) {
                    this.f13526o000oOoO = true;
                }
                throw e;
            }
        }
        if (this.f13507OooOooO) {
            this.f13508OooOooo = Math.max(0L, j);
            this.f13505OooOoo = false;
            this.f13507OooOooO = false;
            if (this.f13488OooOO0O && o000OOo0.f36740OooO00o >= 23) {
                Oooo0OO(this.f13498OooOo0);
            }
            OooO0o(j);
            if (this.f13522OoooO00) {
                OooO0O0();
            }
        }
        com.google.android.exoplayer2.audio.OooO0O0 oooO0O1 = this.f13478OooO;
        long jOooOoo = OooOoo();
        AudioTrack audioTrack5 = oooO0O1.f13557OooO0OO;
        Objects.requireNonNull(audioTrack5);
        int playState = audioTrack5.getPlayState();
        if (oooO0O1.f13562OooO0oo) {
            if (playState == 2) {
                oooO0O1.f13569OooOOOo = false;
            } else if (playState != 1 || oooO0O1.OooO0O0() != 0) {
                z = oooO0O1.f13569OooOOOo;
                boolean zOooO0OO = oooO0O1.OooO0OO(jOooOoo);
                oooO0O1.f13569OooOOOo = zOooO0OO;
                if (z) {
                    oooO0O1.f13555OooO00o.OooO0O0(oooO0O1.f13560OooO0o0, C.OooO0O0(oooO0O1.f13554OooO));
                }
                z2 = true;
            }
            z2 = false;
        } else {
            z = oooO0O1.f13569OooOOOo;
            boolean zOooO0OO2 = oooO0O1.OooO0OO(jOooOoo);
            oooO0O1.f13569OooOOOo = zOooO0OO2;
            if (z && !zOooO0OO2 && playState != 1) {
                oooO0O1.f13555OooO00o.OooO0O0(oooO0O1.f13560OooO0o0, C.OooO0O0(oooO0O1.f13554OooO));
            }
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        if (this.f13510Oooo0 == null) {
            o00000O0.OooO00o(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            OooO0OO oooO0OO5 = this.f13493OooOOOo;
            if (oooO0OO5.f13536OooO0OO != 0 && this.f13506OooOoo0 == 0) {
                int i6 = oooO0OO5.f13540OooO0oO;
                switch (i6) {
                    case 5:
                    case 6:
                    case 18:
                        iOooO0Oo = !(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) ? 1536 : p293o0O0Oo0O.OooOO0.f35729OooO00o[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
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
                        int i7 = o000OOo0.f36740OooO00o;
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
                                int i9 = o000OOo0.f36740OooO00o;
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
                        iOooO0Oo = p293o0O0Oo0O.OooOO0O.OooO0O0(new o0000OO0(bArr, 16)).f35738OooO0OO;
                        break;
                }
                this.f13506OooOoo0 = iOooO0Oo;
                if (iOooO0Oo == 0) {
                    return true;
                }
            }
            if (this.f13496OooOOoo != null) {
                if (!OooOo0O()) {
                    return false;
                }
                OooO0o(j);
                this.f13496OooOOoo = null;
            }
            long j2 = this.f13508OooOooo;
            OooO0OO oooO0OO6 = this.f13493OooOOOo;
            long j3 = ((((oooO0OO6.f13536OooO0OO == 0 ? this.f13497OooOo / ((long) oooO0OO6.f13535OooO0O0) : this.f13503OooOoO0) - this.f13484OooO0o0.f13639OooOOOO) * 1000000) / ((long) oooO0OO6.f13534OooO00o.f13152ooOO)) + j2;
            if (!this.f13505OooOoo && Math.abs(j3 - j) > 200000) {
                StringBuilder sb = new StringBuilder(80);
                sb.append("Discontinuity detected [expected ");
                sb.append(j3);
                sb.append(", got ");
                sb.append(j);
                sb.append("]");
                Log.e("AudioTrack", sb.toString());
                this.f13505OooOoo = true;
            }
            if (this.f13505OooOoo) {
                if (!OooOo0O()) {
                    return false;
                }
                long j4 = j - j3;
                this.f13508OooOooo += j4;
                this.f13505OooOoo = false;
                OooO0o(j);
                AudioSink.OooO00o oooO00o3 = this.f13490OooOOO;
                if (oooO00o3 != null && j4 != 0) {
                    com.google.android.exoplayer2.audio.OooOO0.this.f13599o000O0O0 = true;
                }
            }
            if (this.f13493OooOOOo.f13536OooO0OO == 0) {
                this.f13497OooOo += (long) byteBuffer.remaining();
            } else {
                this.f13503OooOoO0 += (long) (this.f13506OooOoo0 * i);
            }
            this.f13510Oooo0 = byteBuffer;
            this.f13514Oooo0O0 = i;
        }
        Oooo00o(j);
        if (!this.f13510Oooo0.hasRemaining()) {
            this.f13510Oooo0 = null;
            this.f13514Oooo0O0 = 0;
            return true;
        }
        com.google.android.exoplayer2.audio.OooO0O0 oooO0O2 = this.f13478OooO;
        if (!(oooO0O2.f13579OooOoO0 != -9223372036854775807L && OooOoo() > 0 && SystemClock.elapsedRealtime() - oooO0O2.f13579OooOoO0 >= 200)) {
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
        if ("audio/raw".equals(format.f13131OoooOOo)) {
            if (o000OOo0.OooOoO(format.f13145o00O0O)) {
                int i = format.f13145o00O0O;
                return (i == 2 || (this.f13481OooO0OO && i == 4)) ? 2 : 1;
            }
            o00O00O.OooO0OO.OooO0O0(33, "Invalid PCM encoding: ", format.f13145o00O0O, "AudioTrack");
            return 0;
        }
        if (this.f13489OooOO0o && !this.f13526o000oOoO && Oooo000(format, this.f13494OooOOo)) {
            return 2;
        }
        return OooOoO(format, this.f13479OooO00o) != null ? 2 : 0;
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
            int r0 = r9.f13518Oooo0oO
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.f13518Oooo0oO = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.f13518Oooo0oO
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.f13512Oooo00O
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
            int r0 = r9.f13518Oooo0oO
            int r0 = r0 + r2
            r9.f13518Oooo0oO = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f13515Oooo0OO
            if (r0 == 0) goto L3b
            r9.Oooo0o(r0, r7)
            java.nio.ByteBuffer r0 = r9.f13515Oooo0OO
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.f13518Oooo0oO = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.OooOo0O():boolean");
    }

    public final void OooOo0o() {
        int i = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.f13512Oooo00O;
            if (i >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i];
            audioProcessor.flush();
            this.f13513Oooo00o[i] = audioProcessor.OooO0O0();
            i++;
        }
    }

    public final o000O00 OooOoO0() {
        return OooOoOO().f13527OooO00o;
    }

    public final OooO OooOoOO() {
        OooO oooO = this.f13496OooOOoo;
        if (oooO != null) {
            return oooO;
        }
        return !this.f13487OooOO0.isEmpty() ? this.f13487OooOO0.getLast() : this.f13499OooOo00;
    }

    public final long OooOoo() {
        OooO0OO oooO0OO = this.f13493OooOOOo;
        return oooO0OO.f13536OooO0OO == 0 ? this.f13502OooOoO / ((long) oooO0OO.f13537OooO0Oo) : this.f13504OooOoOO;
    }

    public final boolean OooOoo0() {
        return OooOoOO().f13528OooO0O0;
    }

    public final boolean OooOooO() {
        return this.f13495OooOOo0 != null;
    }

    public final void Oooo0() {
        this.f13497OooOo = 0L;
        this.f13503OooOoO0 = 0L;
        this.f13502OooOoO = 0L;
        this.f13504OooOoOO = 0L;
        this.f13525OoooOOO = false;
        this.f13506OooOoo0 = 0;
        this.f13499OooOo00 = new OooO(OooOoO0(), OooOoo0(), 0L, 0L);
        this.f13508OooOooo = 0L;
        this.f13496OooOOoo = null;
        this.f13487OooOO0.clear();
        this.f13510Oooo0 = null;
        this.f13514Oooo0O0 = 0;
        this.f13515Oooo0OO = null;
        this.f13509Oooo = false;
        this.f13519Oooo0oo = false;
        this.f13518Oooo0oO = -1;
        this.f13500OooOo0O = null;
        this.f13501OooOo0o = 0;
        this.f13484OooO0o0.f13639OooOOOO = 0L;
        OooOo0o();
    }

    public final void Oooo00O() {
        if (this.f13509Oooo) {
            return;
        }
        this.f13509Oooo = true;
        com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13478OooO;
        long jOooOoo = OooOoo();
        oooO0O0.f13578OooOoO = oooO0O0.OooO0O0();
        oooO0O0.f13573OooOo = SystemClock.elapsedRealtime() * 1000;
        oooO0O0.f13580OooOoOO = jOooOoo;
        this.f13495OooOOo0.stop();
        this.f13501OooOo0o = 0;
    }

    public final void Oooo00o(long j) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.f13512Oooo00O.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f13513Oooo00o[i - 1];
            } else {
                byteBuffer = this.f13510Oooo0;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f13472OooO00o;
                }
            }
            if (i == length) {
                Oooo0o(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.f13512Oooo00O[i];
                audioProcessor.OooO0OO(byteBuffer);
                ByteBuffer byteBufferOooO0O0 = audioProcessor.OooO0O0();
                this.f13513Oooo00o[i] = byteBufferOooO0O0;
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
        if (o000o01.equals(oooOOooOoOO.f13527OooO00o) && z == oooOOooOoOO.f13528OooO0O0) {
            return;
        }
        OooO oooO = new OooO(o000o01, z, -9223372036854775807L, -9223372036854775807L);
        if (OooOooO()) {
            this.f13496OooOOoo = oooO;
        } else {
            this.f13499OooOo00 = oooO;
        }
    }

    @RequiresApi(23)
    public final void Oooo0OO(o000O00 o000o01) {
        if (OooOooO()) {
            try {
                this.f13495OooOOo0.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(o000o01.f40531OooO00o).setPitch(o000o01.f40532OooO0O0).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                o0000oo.OooO0OO("AudioTrack", "Failed to set playback params", e);
            }
            o000o01 = new o000O00(this.f13495OooOOo0.getPlaybackParams().getSpeed(), this.f13495OooOOo0.getPlaybackParams().getPitch());
            com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13478OooO;
            oooO0O0.f13563OooOO0 = o000o01.f40531OooO00o;
            o00Oo0 o00oo1 = oooO0O0.f13559OooO0o;
            if (o00oo1 != null) {
                o00oo1.OooO00o();
            }
        }
        this.f13498OooOo0 = o000o01;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    public final void Oooo0o(ByteBuffer byteBuffer, long j) throws AudioSink.WriteException {
        int iWrite;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f13515Oooo0OO;
            if (byteBuffer2 != null) {
                o00000O0.OooO00o(byteBuffer2 == byteBuffer);
            } else {
                this.f13515Oooo0OO = byteBuffer;
                if (o000OOo0.f36740OooO00o < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f13517Oooo0o0;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f13517Oooo0o0 = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f13517Oooo0o0, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f13516Oooo0o = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i = o000OOo0.f36740OooO00o;
            if (i < 21) {
                com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13478OooO;
                int iOooO0O0 = oooO0O0.f13560OooO0o0 - ((int) (this.f13502OooOoO - (oooO0O0.OooO0O0() * ((long) oooO0O0.f13558OooO0Oo))));
                if (iOooO0O0 > 0) {
                    iWrite = this.f13495OooOOo0.write(this.f13517Oooo0o0, this.f13516Oooo0o, Math.min(iRemaining2, iOooO0O0));
                    if (iWrite > 0) {
                        this.f13516Oooo0o += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (this.f13520OoooO) {
                o00000O0.OooO0Oo(j != -9223372036854775807L);
                AudioTrack audioTrack = this.f13495OooOOo0;
                if (i >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j * 1000);
                } else {
                    if (this.f13500OooOo0O == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f13500OooOo0O = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f13500OooOo0O.putInt(1431633921);
                    }
                    if (this.f13501OooOo0o == 0) {
                        this.f13500OooOo0O.putInt(4, iRemaining2);
                        this.f13500OooOo0O.putLong(8, j * 1000);
                        this.f13500OooOo0O.position(0);
                        this.f13501OooOo0o = iRemaining2;
                    }
                    int iRemaining3 = this.f13500OooOo0O.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.f13501OooOo0o = 0;
                        } else {
                            this.f13501OooOo0o -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.f13500OooOo0O, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.f13501OooOo0o = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.f13501OooOo0o = 0;
                            } else {
                                this.f13501OooOo0o -= iWrite;
                            }
                        }
                    }
                }
            } else {
                iWrite = this.f13495OooOOo0.write(byteBuffer, iRemaining2, 1);
            }
            this.f13524OoooOO0 = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                if (i >= 24 && iWrite == -6) {
                    if (this.f13493OooOOOo.f13536OooO0OO == 1) {
                        this.f13526o000oOoO = true;
                    }
                }
                throw new AudioSink.WriteException(iWrite);
            }
            if (OooOooo(this.f13495OooOOo0)) {
                long j2 = this.f13504OooOoOO;
                if (j2 > 0) {
                    this.f13525OoooOOO = false;
                }
                if (this.f13522OoooO00 && this.f13490OooOOO != null && iWrite < iRemaining2 && !this.f13525OoooOOO) {
                    com.google.android.exoplayer2.audio.OooO0O0 oooO0O1 = this.f13478OooO;
                    long jOooO0O0 = C.OooO0O0(oooO0O1.OooO00o(j2 - oooO0O1.OooO0O0()));
                    Renderer.OooO00o oooO00o = com.google.android.exoplayer2.audio.OooOO0.this.f13602o000O0o0;
                    if (oooO00o != null) {
                        oooO00o.OooO0O0(jOooO0O0);
                    }
                }
            }
            int i2 = this.f13493OooOOOo.f13536OooO0OO;
            if (i2 == 0) {
                this.f13502OooOoO += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i2 != 0) {
                    o00000O0.OooO0Oo(byteBuffer == this.f13510Oooo0);
                    this.f13504OooOoOO += (long) (this.f13506OooOoo0 * this.f13514Oooo0O0);
                }
                this.f13515Oooo0OO = null;
            }
        }
    }

    public final void Oooo0o0() {
        if (OooOooO()) {
            if (o000OOo0.f36740OooO00o >= 21) {
                this.f13495OooOOo0.setVolume(this.f13511Oooo000);
                return;
            }
            AudioTrack audioTrack = this.f13495OooOOo0;
            float f = this.f13511Oooo000;
            audioTrack.setStereoVolume(f, f);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void flush() {
        if (OooOooO()) {
            Oooo0();
            AudioTrack audioTrack = this.f13478OooO.f13557OooO0OO;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.f13495OooOOo0.pause();
            }
            if (OooOooo(this.f13495OooOOo0)) {
                OooOO0O oooOO0O = this.f13491OooOOO0;
                Objects.requireNonNull(oooOO0O);
                oooOO0O.OooO0O0(this.f13495OooOOo0);
            }
            AudioTrack audioTrack2 = this.f13495OooOOo0;
            this.f13495OooOOo0 = null;
            OooO0OO oooO0OO = this.f13492OooOOOO;
            if (oooO0OO != null) {
                this.f13493OooOOOo = oooO0OO;
                this.f13492OooOOOO = null;
            }
            this.f13478OooO.OooO0Oo();
            this.f13486OooO0oo.close();
            new OooO00o(audioTrack2).start();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void pause() {
        boolean z = false;
        this.f13522OoooO00 = false;
        if (OooOooO()) {
            com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f13478OooO;
            oooO0O0.f13565OooOO0o = 0L;
            oooO0O0.f13577OooOo0o = 0;
            oooO0O0.f13576OooOo0O = 0;
            oooO0O0.f13567OooOOO0 = 0L;
            oooO0O0.f13581OooOoo = 0L;
            oooO0O0.f13585Oooo000 = 0L;
            oooO0O0.f13564OooOO0O = false;
            if (oooO0O0.f13573OooOo == -9223372036854775807L) {
                o00Oo0 o00oo1 = oooO0O0.f13559OooO0o;
                Objects.requireNonNull(o00oo1);
                o00oo1.OooO00o();
                z = true;
            }
            if (z) {
                this.f13495OooOOo0.pause();
            }
        }
    }
}

package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.OooO0o;
import com.google.android.exoplayer2.audio.OooOOO;
import com.google.android.exoplayer2.o00Ooo;
import com.google.android.exoplayer2.trackselection.OooO0O0;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0;
import com.google.common.collect.o0O00;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import p028Oooo0oO.o00O0000;
import p200o00o0o.o0O0OOO0;
import p205o00o0oO0.o000;
import p205o00o0oO0.o00000;
import p205o00o0oO0.o00000O0;
import p205o00o0oO0.o0000O00;
import p205o00o0oO0.o0000Ooo;
import p205o00o0oO0.o000O000;
import p205o00o0oO0.o00O00;
import p205o00o0oO0.o00oOoo;
import p245o00oo0o.o00O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OO0OO;
import p245o00oo0o.o00OOOOo;
import p245o00oo0o.o0O000o0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    @GuardedBy("releaseExecutorLock")
    public static ExecutorService f11454Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final Object f11455Oooooo0 = new Object();

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @GuardedBy("releaseExecutorLock")
    public static int f11456OoooooO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.OooO f11457OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Context f11458OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O00 f11459OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f11460OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.OooOO0O f11461OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O00 f11462OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo0 f11463OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O00 f11464OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00O0 f11465OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayDeque<OooOOO0> f11466OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f11467OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f11468OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooOOO<AudioSink.InitializationException> f11469OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OooOo00 f11470OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooOOO<AudioSink.WriteException> f11471OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.OooOOO0 f11472OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public AudioSink.OooO00o f11473OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o0O0OOO0 f11474OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooOO0 f11475OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public com.google.android.exoplayer2.audio.OooO0O0 f11476OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public com.google.android.exoplayer2.audio.OooO0OO f11477OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooOO0 f11478OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public AudioTrack f11479OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o0000Ooo f11480OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public OooOOO0 f11481OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public com.google.android.exoplayer2.audio.OooO00o f11482OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooOOO0 f11483OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f11484OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o00Ooo f11485OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public ByteBuffer f11486OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f11487OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f11488Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f11489Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f11490Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f11491Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f11492Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f11493Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f11494Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f11495Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f11496Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f11497Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public ByteBuffer f11498Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f11499OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public byte[] f11500OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public ByteBuffer f11501OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f11502OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f11503OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f11504OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f11505OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public o000O000 f11506OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public OooO0OO f11507OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f11508OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f11509Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public long f11510Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f11511OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f11512OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public Looper f11513OooooOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f11514o000oOoO;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public InvalidAudioTrackTimestampException() {
            throw null;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    public static final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Context f11515OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public OooOO0O f11517OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f11518OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f11520OooO0o0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0000Ooo f11516OooO0O0 = o0000Ooo.f39338OooO0OO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f11519OooO0o = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final com.google.android.exoplayer2.audio.OooOOO0 f11521OooO0oO = OooO0o.f11523OooO00o;

        public OooO(Context context) {
            this.f11515OooO00o = context;
        }
    }

    @RequiresApi(23)
    public static final class OooO00o {
        @DoNotInline
        public static void OooO00o(AudioTrack audioTrack, @Nullable OooO0OO oooO0OO) {
            audioTrack.setPreferredDevice(oooO0OO == null ? null : oooO0OO.f11522OooO00o);
        }
    }

    @RequiresApi(31)
    public static final class OooO0O0 {
        @DoNotInline
        public static void OooO00o(AudioTrack audioTrack, o0O0OOO0 o0o0ooo0) {
            o0O0OOO0.OooO00o oooO00o = o0o0ooo0.f39134OooO00o;
            oooO00o.getClass();
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = oooO00o.f39136OooO00o;
            if (logSessionId2.equals(logSessionId)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId2);
        }
    }

    @RequiresApi(23)
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AudioDeviceInfo f11522OooO00o;

        public OooO0OO(AudioDeviceInfo audioDeviceInfo) {
            this.f11522OooO00o = audioDeviceInfo;
        }
    }

    public interface OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final com.google.android.exoplayer2.audio.OooOOO0 f11523OooO00o = new com.google.android.exoplayer2.audio.OooOOO0(new com.google.android.exoplayer2.audio.OooOOO0.OooO00o());
    }

    public static final class OooOO0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final com.google.android.exoplayer2.audio.OooO0OO f11524OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.OooOo f11525OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f11526OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f11527OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f11528OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f11529OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f11530OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f11531OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f11532OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final boolean f11533OooOO0;

        public OooOO0(com.google.android.exoplayer2.OooOo oooOo, int i, int i2, int i3, int i4, int i5, int i6, int i7, com.google.android.exoplayer2.audio.OooO0OO oooO0OO, boolean z) {
            this.f11525OooO00o = oooOo;
            this.f11526OooO0O0 = i;
            this.f11527OooO0OO = i2;
            this.f11528OooO0Oo = i3;
            this.f11530OooO0o0 = i4;
            this.f11529OooO0o = i5;
            this.f11531OooO0oO = i6;
            this.f11532OooO0oo = i7;
            this.f11524OooO = oooO0OO;
            this.f11533OooOO0 = z;
        }

        @RequiresApi(21)
        public static AudioAttributes OooO0OO(com.google.android.exoplayer2.audio.OooO00o oooO00o, boolean z) {
            return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : oooO00o.OooO00o().f11592OooO00o;
        }

        public final AudioTrack OooO00o(boolean z, com.google.android.exoplayer2.audio.OooO00o oooO00o, int i) throws AudioSink.InitializationException {
            int i2 = this.f11527OooO0OO;
            try {
                AudioTrack audioTrackOooO0O0 = OooO0O0(z, oooO00o, i);
                int state = audioTrackOooO0O0.getState();
                if (state == 1) {
                    return audioTrackOooO0O0;
                }
                try {
                    audioTrackOooO0O0.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f11530OooO0o0, this.f11529OooO0o, this.f11532OooO0oo, this.f11525OooO00o, i2 == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.InitializationException(0, this.f11530OooO0o0, this.f11529OooO0o, this.f11532OooO0oo, this.f11525OooO00o, i2 == 1, e);
            }
        }

        public final AudioTrack OooO0O0(boolean z, com.google.android.exoplayer2.audio.OooO00o oooO00o, int i) {
            int i2 = p245o00oo0o.o0O00.f40595OooO00o;
            int i3 = this.f11531OooO0oO;
            int i4 = this.f11529OooO0o;
            int i5 = this.f11530OooO0o0;
            if (i2 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(OooO0OO(oooO00o, z)).setAudioFormat(DefaultAudioSink.OooOoO(i5, i4, i3)).setTransferMode(1).setBufferSizeInBytes(this.f11532OooO0oo).setSessionId(i).setOffloadedPlayback(this.f11527OooO0OO == 1).build();
            }
            if (i2 >= 21) {
                return new AudioTrack(OooO0OO(oooO00o, z), DefaultAudioSink.OooOoO(i5, i4, i3), this.f11532OooO0oo, 1, i);
            }
            int iOooOo0o = p245o00oo0o.o0O00.OooOo0o(oooO00o.f11588OooO0o);
            return i == 0 ? new AudioTrack(iOooOo0o, this.f11530OooO0o0, this.f11529OooO0o, this.f11531OooO0oO, this.f11532OooO0oo, 1) : new AudioTrack(iOooOo0o, this.f11530OooO0o0, this.f11529OooO0o, this.f11531OooO0oO, this.f11532OooO0oo, 1, i);
        }
    }

    public static class OooOO0O implements o0000O00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AudioProcessor[] f11534OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.google.android.exoplayer2.audio.OooOOOO f11535OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final com.google.android.exoplayer2.audio.OooOo00 f11536OooO0OO;

        public OooOO0O(AudioProcessor... audioProcessorArr) {
            com.google.android.exoplayer2.audio.OooOOOO oooOOOO = new com.google.android.exoplayer2.audio.OooOOOO();
            com.google.android.exoplayer2.audio.OooOo00 oooOo00 = new com.google.android.exoplayer2.audio.OooOo00();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f11534OooO00o = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f11535OooO0O0 = oooOOOO;
            this.f11536OooO0OO = oooOo00;
            audioProcessorArr2[audioProcessorArr.length] = oooOOOO;
            audioProcessorArr2[audioProcessorArr.length + 1] = oooOo00;
        }
    }

    public static final class OooOOO<T extends Exception> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public T f11537OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f11538OooO0O0;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void OooO00o(T t) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f11537OooO00o == null) {
                this.f11537OooO00o = t;
                this.f11538OooO0O0 = 100 + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f11538OooO0O0) {
                T t2 = this.f11537OooO00o;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f11537OooO00o;
                this.f11537OooO00o = null;
                throw t3;
            }
        }
    }

    public static final class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00Ooo f11539OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f11540OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f11541OooO0OO;

        public OooOOO0(o00Ooo o00ooo2, long j, long j2) {
            this.f11539OooO00o = o00ooo2;
            this.f11540OooO0O0 = j;
            this.f11541OooO0OO = j2;
        }
    }

    public final class OooOOOO implements com.google.android.exoplayer2.audio.OooO.OooO00o {
        public OooOOOO() {
        }

        @Override // com.google.android.exoplayer2.audio.OooO.OooO00o
        public final void OooO00o(final int i, final long j) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            if (defaultAudioSink.f11473OooOOo != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - defaultAudioSink.f11510Ooooo0o;
                final com.google.android.exoplayer2.audio.OooO0o.OooO00o oooO00o = com.google.android.exoplayer2.audio.OooOOO.this.f11623o00000OO;
                Handler handler = oooO00o.f11610OooO00o;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: o00o0oO0.o0000OO0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            long j2 = j;
                            long j3 = jElapsedRealtime;
                            OooO0o oooO0o = oooO00o.f11611OooO0O0;
                            int i3 = p245o00oo0o.o0O00.f40595OooO00o;
                            oooO0o.OooOo0O(i2, j2, j3);
                        }
                    });
                }
            }
        }

        @Override // com.google.android.exoplayer2.audio.OooO.OooO00o
        public final void OooO0O0(long j) {
            Log.OooO0o("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // com.google.android.exoplayer2.audio.OooO.OooO00o
        public final void OooO0OO(final long j) {
            final com.google.android.exoplayer2.audio.OooO0o.OooO00o oooO00o;
            Handler handler;
            AudioSink.OooO00o oooO00o2 = DefaultAudioSink.this.f11473OooOOo;
            if (oooO00o2 == null || (handler = (oooO00o = com.google.android.exoplayer2.audio.OooOOO.this.f11623o00000OO).f11610OooO00o) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: o00o0oO0.o0000oo
                @Override // java.lang.Runnable
                public final void run() {
                    OooO0o.OooO00o oooO00o3 = oooO00o;
                    oooO00o3.getClass();
                    int i = p245o00oo0o.o0O00.f40595OooO00o;
                    oooO00o3.f11611OooO0O0.OooO0oO(j);
                }
            });
        }

        @Override // com.google.android.exoplayer2.audio.OooO.OooO00o
        public final void OooO0Oo(long j, long j2, long j3, long j4) {
            StringBuilder sbOooO00o = o00O0000.OooO00o("Spurious audio timestamp (frame position mismatch): ", j, ", ");
            sbOooO00o.append(j2);
            o000Oo0.OooO0O0.OooO00o(sbOooO00o, ", ", j3, ", ");
            sbOooO00o.append(j4);
            sbOooO00o.append(", ");
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            sbOooO00o.append(defaultAudioSink.OooOoOO());
            sbOooO00o.append(", ");
            sbOooO00o.append(defaultAudioSink.OooOoo0());
            String string = sbOooO00o.toString();
            Object obj = DefaultAudioSink.f11455Oooooo0;
            Log.OooO0o("DefaultAudioSink", string);
        }

        @Override // com.google.android.exoplayer2.audio.OooO.OooO00o
        public final void OooO0o0(long j, long j2, long j3, long j4) {
            StringBuilder sbOooO00o = o00O0000.OooO00o("Spurious audio timestamp (system clock mismatch): ", j, ", ");
            sbOooO00o.append(j2);
            o000Oo0.OooO0O0.OooO00o(sbOooO00o, ", ", j3, ", ");
            sbOooO00o.append(j4);
            sbOooO00o.append(", ");
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            sbOooO00o.append(defaultAudioSink.OooOoOO());
            sbOooO00o.append(", ");
            sbOooO00o.append(defaultAudioSink.OooOoo0());
            String string = sbOooO00o.toString();
            Object obj = DefaultAudioSink.f11455Oooooo0;
            Log.OooO0o("DefaultAudioSink", string);
        }
    }

    @RequiresApi(29)
    public final class OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Handler f11543OooO00o = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o f11544OooO0O0 = new OooO00o();

        public class OooO00o extends AudioTrack$StreamEventCallback {
            public OooO00o() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.OooO00o oooO00o;
                Renderer.OooO00o oooO00o2;
                if (audioTrack.equals(DefaultAudioSink.this.f11479OooOo0O) && (oooO00o = (defaultAudioSink = DefaultAudioSink.this).f11473OooOOo) != null && defaultAudioSink.f11514o000oOoO && (oooO00o2 = com.google.android.exoplayer2.audio.OooOOO.this.f11628o0000O0) != null) {
                    oooO00o2.OooO0O0();
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.OooO00o oooO00o;
                Renderer.OooO00o oooO00o2;
                if (audioTrack.equals(DefaultAudioSink.this.f11479OooOo0O) && (oooO00o = (defaultAudioSink = DefaultAudioSink.this).f11473OooOOo) != null && defaultAudioSink.f11514o000oOoO && (oooO00o2 = com.google.android.exoplayer2.audio.OooOOO.this.f11628o0000O0) != null) {
                    oooO00o2.OooO0O0();
                }
            }
        }

        public OooOo00() {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    public DefaultAudioSink(OooO oooO) {
        Context context = oooO.f11515OooO00o;
        this.f11458OooO00o = context;
        this.f11480OooOo0o = context != null ? o0000Ooo.OooO00o(context) : oooO.f11516OooO0O0;
        this.f11459OooO0O0 = oooO.f11517OooO0OO;
        int i = p245o00oo0o.o0O00.f40595OooO00o;
        this.f11460OooO0OO = i >= 21 && oooO.f11518OooO0Oo;
        this.f11467OooOO0O = i >= 23 && oooO.f11520OooO0o0;
        this.f11468OooOO0o = i >= 29 ? oooO.f11519OooO0o : 0;
        this.f11472OooOOOo = oooO.f11521OooO0oO;
        o00O0 o00o1 = new o00O0(0);
        this.f11465OooO0oo = o00o1;
        o00o1.OooO0O0();
        this.f11457OooO = new com.google.android.exoplayer2.audio.OooO(new OooOOOO());
        com.google.android.exoplayer2.audio.OooOO0O oooOO0O = new com.google.android.exoplayer2.audio.OooOO0O();
        this.f11461OooO0Oo = oooOO0O;
        Oooo0 oooo0 = new Oooo0();
        this.f11463OooO0o0 = oooo0;
        Oooo000 oooo000 = new Oooo000();
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        Object[] objArr = {oooo000, oooOO0O, oooo0};
        o0.OooO00o(3, objArr);
        this.f11462OooO0o = ImmutableList.OooO(3, objArr);
        this.f11464OooO0oO = ImmutableList.OooOOOo(new OooOo());
        this.f11497Oooo0oO = 1.0f;
        this.f11482OooOoO0 = com.google.android.exoplayer2.audio.OooO00o.f11580OooOO0;
        this.f11505OoooOOo = 0;
        this.f11506OoooOo0 = new o000O000();
        o00Ooo o00ooo2 = o00Ooo.f12825OooO0oO;
        this.f11483OooOoOO = new OooOOO0(o00ooo2, 0L, 0L);
        this.f11485OooOoo0 = o00ooo2;
        this.f11484OooOoo = false;
        this.f11466OooOO0 = new ArrayDeque<>();
        this.f11469OooOOO = new OooOOO<>();
        this.f11471OooOOOO = new OooOOO<>();
    }

    @RequiresApi(21)
    public static AudioFormat OooOoO(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static boolean OooOooo(AudioTrack audioTrack) {
        return p245o00oo0o.o0O00.f40595OooO00o >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO(com.google.android.exoplayer2.OooOo oooOo, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        int i;
        boolean z;
        int iOooO0OO;
        int iOooOOO;
        com.google.android.exoplayer2.audio.OooO0OO oooO0OO;
        int i2;
        boolean z2;
        int iOooOOO2;
        int iOooOo0;
        int iOooOo1;
        int i3;
        int i4;
        int iOooO;
        boolean z3;
        int[] iArr2;
        boolean zEquals = "audio/raw".equals(oooOo.f11211OooOOOO);
        boolean z4 = this.f11467OooOO0O;
        int i5 = oooOo.f11224OooOoo;
        int i6 = oooOo.f11225OooOoo0;
        if (zEquals) {
            int i7 = oooOo.f11226OooOooO;
            o00O000o.OooO00o(p245o00oo0o.o0O00.Oooo00o(i7));
            iOooOo1 = p245o00oo0o.o0O00.OooOo0(i7, i6);
            ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
            if (!this.f11460OooO0OO) {
                z3 = false;
            } else if (i7 == 536870912 || i7 == 805306368 || i7 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                oooO00o.OooO0o(this.f11464OooO0oO);
            } else {
                oooO00o.OooO0o(this.f11462OooO0o);
                oooO00o.OooO0Oo(((OooOO0O) this.f11459OooO0O0).f11534OooO00o);
            }
            oooO0OO = new com.google.android.exoplayer2.audio.OooO0OO(oooO00o.OooO0oo());
            if (oooO0OO.equals(this.f11477OooOo0)) {
                oooO0OO = this.f11477OooOo0;
            }
            int i8 = oooOo.f11227OooOooo;
            Oooo0 oooo0 = this.f11463OooO0o0;
            oooo0.f11662OooO = i8;
            oooo0.f11663OooOO0 = oooOo.f11229Oooo000;
            if (p245o00oo0o.o0O00.f40595OooO00o < 21 && i6 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i9 = 0; i9 < 6; i9++) {
                    iArr2[i9] = i9;
                }
            } else {
                iArr2 = iArr;
            }
            this.f11461OooO0Oo.f11619OooO = iArr2;
            try {
                AudioProcessor.OooO00o OooO00o2 = oooO0OO.OooO00o(new AudioProcessor.OooO00o(i5, i6, i7));
                int i10 = OooO00o2.f11445OooO0O0;
                iOooOOO2 = p245o00oo0o.o0O00.OooOOO(i10);
                i3 = OooO00o2.f11446OooO0OO;
                iOooOo0 = p245o00oo0o.o0O00.OooOo0(i3, i10);
                i2 = OooO00o2.f11444OooO00o;
                z2 = z4;
                i4 = 0;
            } catch (AudioProcessor.UnhandledAudioFormatException e) {
                throw new AudioSink.ConfigurationException(e, oooOo);
            }
        } else {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
            com.google.android.exoplayer2.audio.OooO0OO oooO0OO2 = new com.google.android.exoplayer2.audio.OooO0OO(o0O00.f19536OooO0oo);
            if (Oooo0o(oooOo, this.f11482OooOoO0)) {
                String str = oooOo.f11211OooOOOO;
                str.getClass();
                iOooO0OO = o00OO0OO.OooO0OO(str, oooOo.f11208OooOO0o);
                i = 1;
                iOooOOO = p245o00oo0o.o0O00.OooOOO(i6);
                z = true;
            } else {
                Pair<Integer, Integer> pairOooO0OO = OooOoO0().OooO0OO(oooOo);
                if (pairOooO0OO == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + oooOo, oooOo);
                }
                int iIntValue = ((Integer) pairOooO0OO.first).intValue();
                int iIntValue2 = ((Integer) pairOooO0OO.second).intValue();
                i = 2;
                z = z4;
                iOooO0OO = iIntValue;
                iOooOOO = iIntValue2;
            }
            oooO0OO = oooO0OO2;
            i2 = i5;
            z2 = z;
            iOooOOO2 = iOooOOO;
            iOooOo0 = -1;
            iOooOo1 = -1;
            int i11 = i;
            i3 = iOooO0OO;
            i4 = i11;
        }
        if (i3 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i4 + ") for: " + oooOo, oooOo);
        }
        if (iOooOOO2 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i4 + ") for: " + oooOo, oooOo);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, iOooOOO2, i3);
        o00O000o.OooO0Oo(minBufferSize != -2);
        int i12 = iOooOo0 != -1 ? iOooOo0 : 1;
        double d = z2 ? 8.0d : 1.0d;
        this.f11472OooOOOo.getClass();
        if (i4 == 0) {
            long j = i2;
            long j2 = i12;
            iOooO = p245o00oo0o.o0O00.OooO(minBufferSize * 4, com.google.common.primitives.OooO0o.OooO00o(((((long) 250000) * j) * j2) / AnimationKt.MillisToNanos), com.google.common.primitives.OooO0o.OooO00o(((((long) 750000) * j) * j2) / AnimationKt.MillisToNanos));
        } else if (i4 == 1) {
            iOooO = com.google.common.primitives.OooO0o.OooO00o((((long) 50000000) * ((long) com.google.android.exoplayer2.audio.OooOOO0.OooO00o(i3))) / AnimationKt.MillisToNanos);
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException();
            }
            int i13 = i3 == 5 ? 500000 : 250000;
            int i14 = oooOo.f11207OooOO0O;
            iOooO = com.google.common.primitives.OooO0o.OooO00o((((long) i13) * ((long) (i14 != -1 ? com.google.common.math.OooO0O0.OooO0O0(i14, 8, RoundingMode.CEILING) : com.google.android.exoplayer2.audio.OooOOO0.OooO00o(i3)))) / AnimationKt.MillisToNanos);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iOooO) * d)) + i12) - 1) / i12) * i12;
        this.f11511OooooO0 = false;
        OooOO0 oooOO1 = new OooOO0(oooOo, iOooOo1, i4, iOooOo0, i2, iOooOOO2, i3, iMax, oooO0OO, z2);
        if (OooOooO()) {
            this.f11475OooOOoo = oooOO1;
        } else {
            this.f11478OooOo00 = oooOO1;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final o00Ooo OooO00o() {
        return this.f11485OooOoo0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO0O0() {
        this.f11514o000oOoO = true;
        if (OooOooO()) {
            o000 o000Var = this.f11457OooO.f11552OooO0o;
            o000Var.getClass();
            o000Var.OooO00o();
            this.f11479OooOo0O.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean OooO0OO(com.google.android.exoplayer2.OooOo oooOo) {
        return OooOOOO(oooOo) != 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean OooO0Oo() {
        return !OooOooO() || (this.f11499OoooO && !OooO0oO());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    @RequiresApi(23)
    public final void OooO0o(@Nullable AudioDeviceInfo audioDeviceInfo) {
        OooO0OO oooO0OO = audioDeviceInfo == null ? null : new OooO0OO(audioDeviceInfo);
        this.f11507OoooOoO = oooO0OO;
        AudioTrack audioTrack = this.f11479OooOo0O;
        if (audioTrack != null) {
            OooO00o.OooO00o(audioTrack, oooO0OO);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO0o0(o00Ooo o00ooo2) {
        this.f11485OooOoo0 = new o00Ooo(p245o00oo0o.o0O00.OooO0oo(o00ooo2.f12827OooO0Oo, 0.1f, 8.0f), p245o00oo0o.o0O00.OooO0oo(o00ooo2.f12829OooO0o0, 0.1f, 8.0f));
        if (Oooo0o0()) {
            Oooo0O0();
        } else {
            Oooo0(o00ooo2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean OooO0oO() {
        return OooOooO() && this.f11457OooO.OooO0OO(OooOoo0());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooO0oo(int i) {
        if (this.f11505OoooOOo != i) {
            this.f11505OoooOOo = i;
            this.f11504OoooOOO = i != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOO0() {
        if (this.f11508OoooOoo) {
            this.f11508OoooOoo = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOO0O(@Nullable o0O0OOO0 o0o0ooo0) {
        this.f11474OooOOo0 = o0o0ooo0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOO0o(com.google.android.exoplayer2.audio.OooO00o oooO00o) {
        if (this.f11482OooOoO0.equals(oooO00o)) {
            return;
        }
        this.f11482OooOoO0 = oooO00o;
        if (this.f11508OoooOoo) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final /* synthetic */ void OooOOO() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x029f  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean OooOOO0(ByteBuffer byteBuffer, long j, int i) throws Exception {
        boolean z;
        boolean z2;
        int iOooO0O0;
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        ByteBuffer byteBuffer2 = this.f11498Oooo0oo;
        o00O000o.OooO00o(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f11475OooOOoo != null) {
            if (!OooOo()) {
                return false;
            }
            OooOO0 oooOO1 = this.f11475OooOOoo;
            OooOO0 oooOO2 = this.f11478OooOo00;
            oooOO1.getClass();
            if (oooOO2.f11527OooO0OO == oooOO1.f11527OooO0OO && oooOO2.f11531OooO0oO == oooOO1.f11531OooO0oO && oooOO2.f11530OooO0o0 == oooOO1.f11530OooO0o0 && oooOO2.f11529OooO0o == oooOO1.f11529OooO0o && oooOO2.f11528OooO0Oo == oooOO1.f11528OooO0Oo && oooOO2.f11533OooOO0 == oooOO1.f11533OooOO0) {
                this.f11478OooOo00 = this.f11475OooOOoo;
                this.f11475OooOOoo = null;
                if (OooOooo(this.f11479OooOo0O) && this.f11468OooOO0o != 3) {
                    if (this.f11479OooOo0O.getPlayState() == 3) {
                        this.f11479OooOo0O.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f11479OooOo0O;
                    com.google.android.exoplayer2.OooOo oooOo = this.f11478OooOo00.f11525OooO00o;
                    audioTrack.setOffloadDelayPadding(oooOo.f11227OooOooo, oooOo.f11229Oooo000);
                    this.f11512OooooOO = true;
                }
            } else {
                Oooo000();
                if (OooO0oO()) {
                    return false;
                }
                flush();
            }
            OooOo0o(j);
        }
        boolean zOooOooO = OooOooO();
        OooOOO<AudioSink.InitializationException> oooOOO = this.f11469OooOOO;
        if (!zOooOooO) {
            try {
                if (!OooOoo()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e) {
                if (e.f11450OooO0o0) {
                    throw e;
                }
                oooOOO.OooO00o(e);
                return false;
            }
        }
        oooOOO.f11537OooO00o = null;
        if (this.f11496Oooo0o0) {
            this.f11495Oooo0o = Math.max(0L, j);
            this.f11494Oooo0OO = false;
            this.f11496Oooo0o0 = false;
            if (Oooo0o0()) {
                Oooo0O0();
            }
            OooOo0o(j);
            if (this.f11514o000oOoO) {
                OooO0O0();
            }
        }
        long jOooOoo0 = OooOoo0();
        com.google.android.exoplayer2.audio.OooO oooO = this.f11457OooO;
        AudioTrack audioTrack2 = oooO.f11550OooO0OO;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (oooO.f11555OooO0oo) {
            if (playState == 2) {
                oooO.f11562OooOOOo = false;
            } else if (playState != 1 || oooO.OooO0O0() != 0) {
                z = oooO.f11562OooOOOo;
                boolean zOooO0OO = oooO.OooO0OO(jOooOoo0);
                oooO.f11562OooOOOo = zOooO0OO;
                if (z) {
                    oooO.f11548OooO00o.OooO00o(oooO.f11553OooO0o0, p245o00oo0o.o0O00.OoooOO0(oooO.f11547OooO));
                }
                z2 = true;
            }
            z2 = false;
        } else {
            z = oooO.f11562OooOOOo;
            boolean zOooO0OO2 = oooO.OooO0OO(jOooOoo0);
            oooO.f11562OooOOOo = zOooO0OO2;
            if (z && !zOooO0OO2 && playState != 1) {
                oooO.f11548OooO00o.OooO00o(oooO.f11553OooO0o0, p245o00oo0o.o0O00.OoooOO0(oooO.f11547OooO));
            }
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        if (this.f11498Oooo0oo == null) {
            o00O000o.OooO00o(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            OooOO0 oooOO3 = this.f11478OooOo00;
            if (oooOO3.f11527OooO0OO != 0 && this.f11493Oooo0O0 == 0) {
                int i6 = oooOO3.f11531OooO0oO;
                switch (i6) {
                    case 5:
                    case 6:
                    case 18:
                        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                            iOooO0O0 = o00000.f39318OooO00o[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        } else {
                            iOooO0O0 = 1536;
                        }
                        this.f11493Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 7:
                    case 8:
                        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
                            iOooO0O0 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        } else if (byteBuffer.getInt(0) == 622876772) {
                            iOooO0O0 = 4096;
                        } else {
                            int iPosition = byteBuffer.position();
                            byte b3 = byteBuffer.get(iPosition);
                            if (b3 != -2) {
                                if (b3 == -1) {
                                    i3 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                    b2 = byteBuffer.get(iPosition + 7);
                                } else if (b3 != 31) {
                                    i3 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                    b = byteBuffer.get(iPosition + 5);
                                    i2 = 1;
                                } else {
                                    i3 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                    b2 = byteBuffer.get(iPosition + 6);
                                }
                                i4 = b2 & 60;
                                i2 = 1;
                                iOooO0O0 = (((i4 >> 2) | i3) + i2) * 32;
                            } else {
                                i2 = 1;
                                i3 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                                b = byteBuffer.get(iPosition + 4);
                            }
                            i4 = b & 252;
                            iOooO0O0 = (((i4 >> 2) | i3) + i2) * 32;
                        }
                        this.f11493Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 9:
                        int iPosition2 = byteBuffer.position();
                        int i7 = p245o00oo0o.o0O00.f40595OooO00o;
                        int iReverseBytes = byteBuffer.getInt(iPosition2);
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                        }
                        iOooO0O0 = o00oOoo.OooO0O0(iReverseBytes);
                        if (iOooO0O0 == -1) {
                            throw new IllegalArgumentException();
                        }
                        this.f11493Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 10:
                    case 16:
                        iOooO0O0 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        this.f11493Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 11:
                    case 12:
                        iOooO0O0 = 2048;
                        this.f11493Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 13:
                    case 19:
                    default:
                        throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Unexpected audio encoding: ", i6));
                    case 14:
                        int iPosition3 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i8 = iPosition3;
                        while (true) {
                            if (i8 <= iLimit) {
                                int i9 = p245o00oo0o.o0O00.f40595OooO00o;
                                int iReverseBytes2 = byteBuffer.getInt(i8 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                }
                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                    i5 = i8 - iPosition3;
                                } else {
                                    i8++;
                                }
                            } else {
                                i5 = -1;
                            }
                        }
                        if (i5 == -1) {
                            iOooO0O0 = 0;
                        } else {
                            iOooO0O0 = (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & UByte.MAX_VALUE) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        }
                        this.f11493Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 15:
                        iOooO0O0 = ConstantsKt.MINIMUM_BLOCK_SIZE;
                        this.f11493Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int iPosition4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition4);
                        iOooO0O0 = o00000O0.OooO0O0(new o00OOOOo(bArr, 16)).f39327OooO0OO;
                        this.f11493Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 20:
                        int i10 = byteBuffer.get(26) + 27;
                        iOooO0O0 = (int) ((p205o00o0oO0.o00O000o.OooO0O0(byteBuffer.get(i10), byteBuffer.limit() > 1 ? byteBuffer.get(i10 + 1) : (byte) 0) * 48000) / AnimationKt.MillisToNanos);
                        this.f11493Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                }
            }
            if (this.f11481OooOoO != null) {
                if (!OooOo()) {
                    return false;
                }
                OooOo0o(j);
                this.f11481OooOoO = null;
            }
            long jOooOoOO = (((OooOoOO() - this.f11463OooO0o0.f11668OooOOOO) * AnimationKt.MillisToNanos) / ((long) this.f11478OooOo00.f11525OooO00o.f11224OooOoo)) + this.f11495Oooo0o;
            if (!this.f11494Oooo0OO && Math.abs(jOooOoOO - j) > 200000) {
                AudioSink.OooO00o oooO00o = this.f11473OooOOo;
                if (oooO00o != null) {
                    ((com.google.android.exoplayer2.audio.OooOOO.OooO0O0) oooO00o).OooO00o(new AudioSink.UnexpectedDiscontinuityException(j, jOooOoOO));
                }
                this.f11494Oooo0OO = true;
            }
            if (this.f11494Oooo0OO) {
                if (!OooOo()) {
                    return false;
                }
                long j2 = j - jOooOoOO;
                this.f11495Oooo0o += j2;
                this.f11494Oooo0OO = false;
                OooOo0o(j);
                AudioSink.OooO00o oooO00o2 = this.f11473OooOOo;
                if (oooO00o2 != null && j2 != 0) {
                    com.google.android.exoplayer2.audio.OooOOO.this.f11632o0000oo = true;
                }
            }
            if (this.f11478OooOo00.f11527OooO0OO == 0) {
                this.f11490Oooo000 += (long) byteBuffer.remaining();
            } else {
                this.f11491Oooo00O = (((long) this.f11493Oooo0O0) * ((long) i)) + this.f11491Oooo00O;
            }
            this.f11498Oooo0oo = byteBuffer;
            this.f11488Oooo = i;
        }
        Oooo00O(j);
        if (!this.f11498Oooo0oo.hasRemaining()) {
            this.f11498Oooo0oo = null;
            this.f11488Oooo = 0;
            return true;
        }
        if (!(oooO.f11571OooOoO != -9223372036854775807L && OooOoo0() > 0 && SystemClock.elapsedRealtime() - oooO.f11571OooOoO >= 200)) {
            return false;
        }
        Log.OooO0o("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final int OooOOOO(com.google.android.exoplayer2.OooOo oooOo) {
        if (!"audio/raw".equals(oooOo.f11211OooOOOO)) {
            if (this.f11511OooooO0 || !Oooo0o(oooOo, this.f11482OooOoO0)) {
                return OooOoO0().OooO0OO(oooOo) != null ? 2 : 0;
            }
            return 2;
        }
        int i = oooOo.f11226OooOooO;
        if (p245o00oo0o.o0O00.Oooo00o(i)) {
            return (i == 2 || (this.f11460OooO0OO && i == 4)) ? 2 : 1;
        }
        Log.OooO0o("DefaultAudioSink", "Invalid PCM encoding: " + i);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOOo(float f) {
        if (this.f11497Oooo0oO != f) {
            this.f11497Oooo0oO = f;
            Oooo0OO();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final long OooOOo(boolean z) {
        ArrayDeque<OooOOO0> arrayDeque;
        long jOooOOo;
        long jOooo0oo;
        if (!OooOooO() || this.f11496Oooo0o0) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f11457OooO.OooO00o(z), (OooOoo0() * AnimationKt.MillisToNanos) / ((long) this.f11478OooOo00.f11530OooO0o0));
        while (true) {
            arrayDeque = this.f11466OooOO0;
            if (arrayDeque.isEmpty() || jMin < arrayDeque.getFirst().f11541OooO0OO) {
                break;
            }
            this.f11483OooOoOO = arrayDeque.remove();
        }
        OooOOO0 oooOOO0 = this.f11483OooOoOO;
        long j = jMin - oooOOO0.f11541OooO0OO;
        boolean zEquals = oooOOO0.f11539OooO00o.equals(o00Ooo.f12825OooO0oO);
        o0000O00 o0000o00 = this.f11459OooO0O0;
        if (zEquals) {
            jOooOOo = this.f11483OooOoOO.f11540OooO0O0 + j;
        } else if (arrayDeque.isEmpty()) {
            com.google.android.exoplayer2.audio.OooOo00 oooOo00 = ((OooOO0O) o0000o00).f11536OooO0OO;
            if (oooOo00.f11660OooOOOO >= 1024) {
                long j2 = oooOo00.f11658OooOOO;
                o00O00 o00o01 = oooOo00.f11655OooOO0;
                o00o01.getClass();
                long j3 = j2 - ((long) ((o00o01.f39365OooOO0O * o00o01.f39357OooO0O0) * 2));
                int i = oooOo00.f11654OooO0oo.f11444OooO00o;
                int i2 = oooOo00.f11653OooO0oO.f11444OooO00o;
                jOooo0oo = i == i2 ? p245o00oo0o.o0O00.Oooo0oo(j, j3, oooOo00.f11660OooOOOO) : p245o00oo0o.o0O00.Oooo0oo(j, j3 * ((long) i), oooOo00.f11660OooOOOO * ((long) i2));
            } else {
                jOooo0oo = (long) (((double) oooOo00.f11649OooO0OO) * j);
            }
            jOooOOo = jOooo0oo + this.f11483OooOoOO.f11540OooO0O0;
        } else {
            OooOOO0 first = arrayDeque.getFirst();
            jOooOOo = first.f11540OooO0O0 - p245o00oo0o.o0O00.OooOOo(first.f11541OooO0OO - jMin, this.f11483OooOoOO.f11539OooO00o.f12827OooO0Oo);
        }
        return ((((OooOO0O) o0000o00).f11535OooO0O0.f11645OooOo00 * AnimationKt.MillisToNanos) / ((long) this.f11478OooOo00.f11530OooO0o0)) + jOooOOo;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOo0() throws AudioSink.WriteException {
        if (!this.f11499OoooO && OooOooO() && OooOo()) {
            Oooo000();
            this.f11499OoooO = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOOoo() {
        this.f11494Oooo0OO = true;
    }

    public final boolean OooOo() throws Exception {
        if (!this.f11477OooOo0.OooO0Oo()) {
            ByteBuffer byteBuffer = this.f11501OoooO00;
            if (byteBuffer == null) {
                return true;
            }
            Oooo0oO(byteBuffer, Long.MIN_VALUE);
            return this.f11501OoooO00 == null;
        }
        com.google.android.exoplayer2.audio.OooO0OO oooO0OO = this.f11477OooOo0;
        if (oooO0OO.OooO0Oo() && !oooO0OO.f11609OooO0Oo) {
            oooO0OO.f11609OooO0Oo = true;
            ((AudioProcessor) oooO0OO.f11607OooO0O0.get(0)).OooO0o0();
        }
        Oooo00O(Long.MIN_VALUE);
        if (!this.f11477OooOo0.OooO0OO()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f11501OoooO00;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOo0(o000O000 o000o001) {
        if (this.f11506OoooOo0.equals(o000o001)) {
            return;
        }
        int i = o000o001.f39346OooO00o;
        AudioTrack audioTrack = this.f11479OooOo0O;
        if (audioTrack != null) {
            if (this.f11506OoooOo0.f39346OooO00o != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f11479OooOo0O.setAuxEffectSendLevel(o000o001.f39347OooO0O0);
            }
        }
        this.f11506OoooOo0 = o000o001;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOo00() {
        o00O000o.OooO0Oo(p245o00oo0o.o0O00.f40595OooO00o >= 21);
        o00O000o.OooO0Oo(this.f11504OoooOOO);
        if (this.f11508OoooOoo) {
            return;
        }
        this.f11508OoooOoo = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void OooOo0O(boolean z) {
        this.f11484OooOoo = z;
        Oooo0(Oooo0o0() ? o00Ooo.f12825OooO0oO : this.f11485OooOoo0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    public final void OooOo0o(long j) {
        o00Ooo o00ooo2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zOooo0o0 = Oooo0o0();
        boolean z5 = this.f11460OooO0OO;
        boolean z6 = false;
        o0000O00 o0000o00 = this.f11459OooO0O0;
        if (zOooo0o0) {
            o00ooo2 = o00Ooo.f12825OooO0oO;
        } else {
            if (this.f11508OoooOoo) {
                z3 = false;
            } else {
                OooOO0 oooOO1 = this.f11478OooOo00;
                if (oooOO1.f11527OooO0OO == 0) {
                    int i = oooOO1.f11525OooO00o.f11226OooOooO;
                    if (z5) {
                        int i2 = p245o00oo0o.o0O00.f40595OooO00o;
                        if (i == 536870912 || i == 805306368 || i == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                o00ooo2 = this.f11485OooOoo0;
                OooOO0O oooOO0O = (OooOO0O) o0000o00;
                oooOO0O.getClass();
                float f = o00ooo2.f12827OooO0Oo;
                com.google.android.exoplayer2.audio.OooOo00 oooOo00 = oooOO0O.f11536OooO0OO;
                if (oooOo00.f11649OooO0OO != f) {
                    oooOo00.f11649OooO0OO = f;
                    oooOo00.f11647OooO = true;
                }
                float f2 = oooOo00.f11650OooO0Oo;
                float f3 = o00ooo2.f12829OooO0o0;
                if (f2 != f3) {
                    oooOo00.f11650OooO0Oo = f3;
                    oooOo00.f11647OooO = true;
                }
            } else {
                o00ooo2 = o00Ooo.f12825OooO0oO;
            }
            this.f11485OooOoo0 = o00ooo2;
        }
        o00Ooo o00ooo3 = o00ooo2;
        if (!this.f11508OoooOoo) {
            OooOO0 oooOO2 = this.f11478OooOo00;
            if (oooOO2.f11527OooO0OO == 0) {
                int i3 = oooOO2.f11525OooO00o.f11226OooOooO;
                if (z5) {
                    int i4 = p245o00oo0o.o0O00.f40595OooO00o;
                    if (i3 == 536870912 || i3 == 805306368 || i3 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                z = z2 ? false : true;
            }
        }
        if (z) {
            z6 = this.f11484OooOoo;
            ((OooOO0O) o0000o00).f11535OooO0O0.f11639OooOOO0 = z6;
        }
        this.f11484OooOoo = z6;
        this.f11466OooOO0.add(new OooOOO0(o00ooo3, Math.max(0L, j), (OooOoo0() * AnimationKt.MillisToNanos) / ((long) this.f11478OooOo00.f11530OooO0o0)));
        com.google.android.exoplayer2.audio.OooO0OO oooO0OO = this.f11478OooOo00.f11524OooO;
        this.f11477OooOo0 = oooO0OO;
        oooO0OO.OooO0O0();
        AudioSink.OooO00o oooO00o = this.f11473OooOOo;
        if (oooO00o != null) {
            final boolean z7 = this.f11484OooOoo;
            final com.google.android.exoplayer2.audio.OooO0o.OooO00o oooO00o2 = com.google.android.exoplayer2.audio.OooOOO.this.f11623o00000OO;
            Handler handler = oooO00o2.f11610OooO00o;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o00o0oO0.o0000O
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooO0o.OooO00o oooO00o3 = oooO00o2;
                        oooO00o3.getClass();
                        int i5 = p245o00oo0o.o0O00.f40595OooO00o;
                        oooO00o3.f11611OooO0O0.onSkipSilenceEnabledChanged(z7);
                    }
                });
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [o00o0oO0.o000OO0O] */
    public final o0000Ooo OooOoO0() {
        Context context;
        o0000Ooo o0000oooOooO0O0;
        com.google.android.exoplayer2.audio.OooO0O0.C0200OooO0O0 c0200OooO0O0;
        if (this.f11476OooOo == null && (context = this.f11458OooO00o) != null) {
            this.f11513OooooOo = Looper.myLooper();
            com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = new com.google.android.exoplayer2.audio.OooO0O0(context, new com.google.android.exoplayer2.audio.OooO0O0.OooO() { // from class: o00o0oO0.o000OO0O
                @Override // com.google.android.exoplayer2.audio.OooO0O0.OooO
                public final void OooO00o(o0000Ooo o0000ooo) {
                    RendererCapabilities.OooO00o oooO00o;
                    DefaultAudioSink defaultAudioSink = this.f39354OooO00o;
                    o00O000o.OooO0Oo(defaultAudioSink.f11513OooooOo == Looper.myLooper());
                    if (o0000ooo.equals(defaultAudioSink.OooOoO0())) {
                        return;
                    }
                    defaultAudioSink.f11480OooOo0o = o0000ooo;
                    AudioSink.OooO00o oooO00o2 = defaultAudioSink.f11473OooOOo;
                    if (oooO00o2 != null) {
                        OooOOO oooOOO = OooOOO.this;
                        synchronized (oooOOO.f11042OooO0Oo) {
                            oooO00o = oooOOO.f11054OooOOo0;
                        }
                        if (oooO00o != null) {
                            ((OooO0O0) oooO00o).OooOOOO();
                        }
                    }
                }
            });
            this.f11476OooOo = oooO0O0;
            if (oooO0O0.f11600OooO0oo) {
                o0000oooOooO0O0 = oooO0O0.f11599OooO0oO;
                o0000oooOooO0O0.getClass();
            } else {
                oooO0O0.f11600OooO0oo = true;
                com.google.android.exoplayer2.audio.OooO0O0.OooO0OO oooO0OO = oooO0O0.f11597OooO0o;
                if (oooO0OO != null) {
                    oooO0OO.f11602OooO00o.registerContentObserver(oooO0OO.f11603OooO0O0, false, oooO0OO);
                }
                int i = p245o00oo0o.o0O00.f40595OooO00o;
                Handler handler = oooO0O0.f11595OooO0OO;
                Context context2 = oooO0O0.f11593OooO00o;
                if (i >= 23 && (c0200OooO0O0 = oooO0O0.f11596OooO0Oo) != null) {
                    com.google.android.exoplayer2.audio.OooO0O0.OooO00o.OooO00o(context2, c0200OooO0O0, handler);
                }
                com.google.android.exoplayer2.audio.OooO0O0.OooO0o oooO0o = oooO0O0.f11598OooO0o0;
                o0000oooOooO0O0 = o0000Ooo.OooO0O0(context2, oooO0o != null ? context2.registerReceiver(oooO0o, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null);
                oooO0O0.f11599OooO0oO = o0000oooOooO0O0;
            }
            this.f11480OooOo0o = o0000oooOooO0O0;
        }
        return this.f11480OooOo0o;
    }

    public final long OooOoOO() {
        OooOO0 oooOO1 = this.f11478OooOo00;
        return oooOO1.f11527OooO0OO == 0 ? this.f11490Oooo000 / ((long) oooOO1.f11526OooO0O0) : this.f11491Oooo00O;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0101  */
    /* JADX WARN: Code duplicated, block: B:64:0x0105  */
    /* JADX WARN: Code duplicated, block: B:78:? A[SYNTHETIC] */
    public final boolean OooOoo() throws AudioSink.InitializationException {
        boolean z;
        AudioTrack audioTrackOooO00o;
        o0O0OOO0 o0o0ooo0;
        o00O0 o00o1 = this.f11465OooO0oo;
        synchronized (o00o1) {
            z = o00o1.f40556OooO00o;
        }
        if (!z) {
            return false;
        }
        try {
            OooOO0 oooOO1 = this.f11478OooOo00;
            oooOO1.getClass();
            try {
                audioTrackOooO00o = oooOO1.OooO00o(this.f11508OoooOoo, this.f11482OooOoO0, this.f11505OoooOOo);
            } catch (AudioSink.InitializationException e) {
                AudioSink.OooO00o oooO00o = this.f11473OooOOo;
                if (oooO00o != null) {
                    ((com.google.android.exoplayer2.audio.OooOOO.OooO0O0) oooO00o).OooO00o(e);
                }
                throw e;
            }
        } catch (AudioSink.InitializationException e2) {
            OooOO0 oooOO2 = this.f11478OooOo00;
            if (oooOO2.f11532OooO0oo > 1000000) {
                OooOO0 oooOO3 = new OooOO0(oooOO2.f11525OooO00o, oooOO2.f11526OooO0O0, oooOO2.f11527OooO0OO, oooOO2.f11528OooO0Oo, oooOO2.f11530OooO0o0, oooOO2.f11529OooO0o, oooOO2.f11531OooO0oO, DurationKt.NANOS_IN_MILLIS, oooOO2.f11524OooO, oooOO2.f11533OooOO0);
                try {
                    try {
                        audioTrackOooO00o = oooOO3.OooO00o(this.f11508OoooOoo, this.f11482OooOoO0, this.f11505OoooOOo);
                        this.f11478OooOo00 = oooOO3;
                    } catch (AudioSink.InitializationException e3) {
                        AudioSink.OooO00o oooO00o2 = this.f11473OooOOo;
                        if (oooO00o2 != null) {
                            ((com.google.android.exoplayer2.audio.OooOOO.OooO0O0) oooO00o2).OooO00o(e3);
                        }
                        throw e3;
                    }
                } catch (AudioSink.InitializationException e4) {
                    e2.addSuppressed(e4);
                    if (!(this.f11478OooOo00.f11527OooO0OO == 1)) {
                        throw e2;
                    }
                    this.f11511OooooO0 = true;
                    throw e2;
                }
            }
            if (!(this.f11478OooOo00.f11527OooO0OO == 1)) {
                throw e2;
            }
            this.f11511OooooO0 = true;
            throw e2;
        }
        this.f11479OooOo0O = audioTrackOooO00o;
        if (OooOooo(audioTrackOooO00o)) {
            AudioTrack audioTrack = this.f11479OooOo0O;
            if (this.f11470OooOOO0 == null) {
                this.f11470OooOOO0 = new OooOo00();
            }
            OooOo00 oooOo00 = this.f11470OooOOO0;
            Handler handler = oooOo00.f11543OooO00o;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new p205o00o0oO0.o00O0000(handler), oooOo00.f11544OooO0O0);
            if (this.f11468OooOO0o != 3) {
                AudioTrack audioTrack2 = this.f11479OooOo0O;
                com.google.android.exoplayer2.OooOo oooOo = this.f11478OooOo00.f11525OooO00o;
                audioTrack2.setOffloadDelayPadding(oooOo.f11227OooOooo, oooOo.f11229Oooo000);
            }
        }
        int i = p245o00oo0o.o0O00.f40595OooO00o;
        if (i >= 31 && (o0o0ooo0 = this.f11474OooOOo0) != null) {
            OooO0O0.OooO00o(this.f11479OooOo0O, o0o0ooo0);
        }
        this.f11505OoooOOo = this.f11479OooOo0O.getAudioSessionId();
        com.google.android.exoplayer2.audio.OooO oooO = this.f11457OooO;
        AudioTrack audioTrack3 = this.f11479OooOo0O;
        OooOO0 oooOO4 = this.f11478OooOo00;
        oooO.OooO0o0(audioTrack3, oooOO4.f11527OooO0OO == 2, oooOO4.f11531OooO0oO, oooOO4.f11528OooO0Oo, oooOO4.f11532OooO0oo);
        Oooo0OO();
        int i2 = this.f11506OoooOo0.f39346OooO00o;
        if (i2 != 0) {
            this.f11479OooOo0O.attachAuxEffect(i2);
            this.f11479OooOo0O.setAuxEffectSendLevel(this.f11506OoooOo0.f39347OooO0O0);
        }
        OooO0OO oooO0OO = this.f11507OoooOoO;
        if (oooO0OO != null && i >= 23) {
            OooO00o.OooO00o(this.f11479OooOo0O, oooO0OO);
        }
        this.f11496Oooo0o0 = true;
        return true;
    }

    public final long OooOoo0() {
        OooOO0 oooOO1 = this.f11478OooOo00;
        return oooOO1.f11527OooO0OO == 0 ? this.f11492Oooo00o / ((long) oooOO1.f11528OooO0Oo) : this.f11489Oooo0;
    }

    public final boolean OooOooO() {
        return this.f11479OooOo0O != null;
    }

    public final void Oooo0(o00Ooo o00ooo2) {
        OooOOO0 oooOOO0 = new OooOOO0(o00ooo2, -9223372036854775807L, -9223372036854775807L);
        if (OooOooO()) {
            this.f11481OooOoO = oooOOO0;
        } else {
            this.f11483OooOoOO = oooOOO0;
        }
    }

    public final void Oooo000() {
        if (this.f11503OoooOO0) {
            return;
        }
        this.f11503OoooOO0 = true;
        long jOooOoo0 = OooOoo0();
        com.google.android.exoplayer2.audio.OooO oooO = this.f11457OooO;
        oooO.f11573OooOoOO = oooO.OooO0O0();
        oooO.f11572OooOoO0 = SystemClock.elapsedRealtime() * 1000;
        oooO.f11575OooOoo0 = jOooOoo0;
        this.f11479OooOo0O.stop();
        this.f11487OooOooo = 0;
    }

    public final void Oooo00O(long j) throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f11477OooOo0.OooO0Oo()) {
            ByteBuffer byteBuffer2 = this.f11498Oooo0oo;
            if (byteBuffer2 == null) {
                byteBuffer2 = AudioProcessor.f11442OooO00o;
            }
            Oooo0oO(byteBuffer2, j);
            return;
        }
        while (!this.f11477OooOo0.OooO0OO()) {
            do {
                com.google.android.exoplayer2.audio.OooO0OO oooO0OO = this.f11477OooOo0;
                if (oooO0OO.OooO0Oo()) {
                    ByteBuffer[] byteBufferArr = oooO0OO.f11608OooO0OO;
                    ByteBuffer byteBuffer3 = byteBufferArr[byteBufferArr.length - 1];
                    if (!byteBuffer3.hasRemaining()) {
                        oooO0OO.OooO0o0(AudioProcessor.f11442OooO00o);
                    }
                    byteBuffer = byteBuffer3;
                } else {
                    byteBuffer = AudioProcessor.f11442OooO00o;
                }
                if (byteBuffer.hasRemaining()) {
                    Oooo0oO(byteBuffer, j);
                } else {
                    ByteBuffer byteBuffer4 = this.f11498Oooo0oo;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    com.google.android.exoplayer2.audio.OooO0OO oooO0OO2 = this.f11477OooOo0;
                    ByteBuffer byteBuffer5 = this.f11498Oooo0oo;
                    if (oooO0OO2.OooO0Oo() && !oooO0OO2.f11609OooO0Oo) {
                        oooO0OO2.OooO0o0(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void Oooo00o() {
        this.f11490Oooo000 = 0L;
        this.f11491Oooo00O = 0L;
        this.f11492Oooo00o = 0L;
        this.f11489Oooo0 = 0L;
        this.f11512OooooOO = false;
        this.f11493Oooo0O0 = 0;
        this.f11483OooOoOO = new OooOOO0(this.f11485OooOoo0, 0L, 0L);
        this.f11495Oooo0o = 0L;
        this.f11481OooOoO = null;
        this.f11466OooOO0.clear();
        this.f11498Oooo0oo = null;
        this.f11488Oooo = 0;
        this.f11501OoooO00 = null;
        this.f11503OoooOO0 = false;
        this.f11499OoooO = false;
        this.f11486OooOooO = null;
        this.f11487OooOooo = 0;
        this.f11463OooO0o0.f11668OooOOOO = 0L;
        com.google.android.exoplayer2.audio.OooO0OO oooO0OO = this.f11478OooOo00.f11524OooO;
        this.f11477OooOo0 = oooO0OO;
        oooO0OO.OooO0O0();
    }

    @RequiresApi(23)
    public final void Oooo0O0() {
        if (OooOooO()) {
            try {
                this.f11479OooOo0O.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f11485OooOoo0.f12827OooO0Oo).setPitch(this.f11485OooOoo0.f12829OooO0o0).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                Log.OooO0oO("DefaultAudioSink", "Failed to set playback params", e);
            }
            o00Ooo o00ooo2 = new o00Ooo(this.f11479OooOo0O.getPlaybackParams().getSpeed(), this.f11479OooOo0O.getPlaybackParams().getPitch());
            this.f11485OooOoo0 = o00ooo2;
            com.google.android.exoplayer2.audio.OooO oooO = this.f11457OooO;
            oooO.f11556OooOO0 = o00ooo2.f12827OooO0Oo;
            o000 o000Var = oooO.f11552OooO0o;
            if (o000Var != null) {
                o000Var.OooO00o();
            }
            oooO.OooO0Oo();
        }
    }

    public final void Oooo0OO() {
        if (OooOooO()) {
            if (p245o00oo0o.o0O00.f40595OooO00o >= 21) {
                this.f11479OooOo0O.setVolume(this.f11497Oooo0oO);
                return;
            }
            AudioTrack audioTrack = this.f11479OooOo0O;
            float f = this.f11497Oooo0oO;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final boolean Oooo0o(com.google.android.exoplayer2.OooOo oooOo, com.google.android.exoplayer2.audio.OooO00o oooO00o) {
        int i;
        int iOooOOO;
        int playbackOffloadSupport;
        int i2 = p245o00oo0o.o0O00.f40595OooO00o;
        if (i2 < 29 || (i = this.f11468OooOO0o) == 0) {
            return false;
        }
        String str = oooOo.f11211OooOOOO;
        str.getClass();
        int iOooO0OO = o00OO0OO.OooO0OO(str, oooOo.f11208OooOO0o);
        if (iOooO0OO == 0 || (iOooOOO = p245o00oo0o.o0O00.OooOOO(oooOo.f11225OooOoo0)) == 0) {
            return false;
        }
        AudioFormat audioFormatOooOoO = OooOoO(oooOo.f11224OooOoo, iOooOOO, iOooO0OO);
        AudioAttributes audioAttributes = oooO00o.OooO00o().f11592OooO00o;
        if (i2 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatOooOoO, audioAttributes);
        } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatOooOoO, audioAttributes)) {
            playbackOffloadSupport = (i2 == 30 && p245o00oo0o.o0O00.f40598OooO0Oo.startsWith("Pixel")) ? 2 : 1;
        } else {
            playbackOffloadSupport = 0;
        }
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((oooOo.f11227OooOooo != 0 || oooOo.f11229Oooo000 != 0) && (i == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    public final boolean Oooo0o0() {
        OooOO0 oooOO1 = this.f11478OooOo00;
        return oooOO1 != null && oooOO1.f11533OooOO0 && p245o00oo0o.o0O00.f40595OooO00o >= 23;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa  */
    public final void Oooo0oO(ByteBuffer byteBuffer, long j) throws Exception {
        int iWrite;
        AudioSink.OooO00o oooO00o;
        Renderer.OooO00o oooO00o2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f11501OoooO00;
            if (byteBuffer2 != null) {
                o00O000o.OooO00o(byteBuffer2 == byteBuffer);
            } else {
                this.f11501OoooO00 = byteBuffer;
                if (p245o00oo0o.o0O00.f40595OooO00o < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f11500OoooO0;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f11500OoooO0 = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f11500OoooO0, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f11502OoooO0O = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i = p245o00oo0o.o0O00.f40595OooO00o;
            if (i < 21) {
                long j2 = this.f11492Oooo00o;
                com.google.android.exoplayer2.audio.OooO oooO = this.f11457OooO;
                int iOooO0O0 = oooO.f11553OooO0o0 - ((int) (j2 - (oooO.OooO0O0() * ((long) oooO.f11551OooO0Oo))));
                if (iOooO0O0 > 0) {
                    iWrite = this.f11479OooOo0O.write(this.f11500OoooO0, this.f11502OoooO0O, Math.min(iRemaining2, iOooO0O0));
                    if (iWrite > 0) {
                        this.f11502OoooO0O += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (this.f11508OoooOoo) {
                o00O000o.OooO0Oo(j != -9223372036854775807L);
                if (j == Long.MIN_VALUE) {
                    j = this.f11509Ooooo00;
                } else {
                    this.f11509Ooooo00 = j;
                }
                AudioTrack audioTrack = this.f11479OooOo0O;
                if (i >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j * 1000);
                } else {
                    if (this.f11486OooOooO == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f11486OooOooO = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f11486OooOooO.putInt(1431633921);
                    }
                    if (this.f11487OooOooo == 0) {
                        this.f11486OooOooO.putInt(4, iRemaining2);
                        this.f11486OooOooO.putLong(8, j * 1000);
                        this.f11486OooOooO.position(0);
                        this.f11487OooOooo = iRemaining2;
                    }
                    int iRemaining3 = this.f11486OooOooO.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.f11487OooOooo = 0;
                        } else {
                            this.f11487OooOooo -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.f11486OooOooO, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.f11487OooOooo = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.f11487OooOooo = 0;
                            } else {
                                this.f11487OooOooo -= iWrite;
                            }
                        }
                    }
                }
            } else {
                iWrite = this.f11479OooOo0O.write(byteBuffer, iRemaining2, 1);
            }
            this.f11510Ooooo0o = SystemClock.elapsedRealtime();
            OooOOO<AudioSink.WriteException> oooOOO = this.f11471OooOOOO;
            if (iWrite < 0) {
                AudioSink.WriteException writeException = new AudioSink.WriteException(iWrite, this.f11478OooOo00.f11525OooO00o, ((i >= 24 && iWrite == -6) || iWrite == -32) && this.f11489Oooo0 > 0);
                AudioSink.OooO00o oooO00o3 = this.f11473OooOOo;
                if (oooO00o3 != null) {
                    ((com.google.android.exoplayer2.audio.OooOOO.OooO0O0) oooO00o3).OooO00o(writeException);
                }
                if (writeException.f11453OooO0o0) {
                    this.f11480OooOo0o = o0000Ooo.f39338OooO0OO;
                    throw writeException;
                }
                oooOOO.OooO00o(writeException);
                return;
            }
            oooOOO.f11537OooO00o = null;
            if (OooOooo(this.f11479OooOo0O)) {
                if (this.f11489Oooo0 > 0) {
                    this.f11512OooooOO = false;
                }
                if (this.f11514o000oOoO && (oooO00o = this.f11473OooOOo) != null && iWrite < iRemaining2 && !this.f11512OooooOO && (oooO00o2 = com.google.android.exoplayer2.audio.OooOOO.this.f11628o0000O0) != null) {
                    oooO00o2.OooO00o();
                }
            }
            int i2 = this.f11478OooOo00.f11527OooO0OO;
            if (i2 == 0) {
                this.f11492Oooo00o += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i2 != 0) {
                    o00O000o.OooO0Oo(byteBuffer == this.f11498Oooo0oo);
                    this.f11489Oooo0 = (((long) this.f11493Oooo0O0) * ((long) this.f11488Oooo)) + this.f11489Oooo0;
                }
                this.f11501OoooO00 = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void flush() {
        if (OooOooO()) {
            Oooo00o();
            AudioTrack audioTrack = this.f11457OooO.f11550OooO0OO;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f11479OooOo0O.pause();
            }
            if (OooOooo(this.f11479OooOo0O)) {
                OooOo00 oooOo00 = this.f11470OooOOO0;
                oooOo00.getClass();
                this.f11479OooOo0O.unregisterStreamEventCallback(oooOo00.f11544OooO0O0);
                oooOo00.f11543OooO00o.removeCallbacksAndMessages(null);
            }
            if (p245o00oo0o.o0O00.f40595OooO00o < 21 && !this.f11504OoooOOO) {
                this.f11505OoooOOo = 0;
            }
            OooOO0 oooOO1 = this.f11475OooOOoo;
            if (oooOO1 != null) {
                this.f11478OooOo00 = oooOO1;
                this.f11475OooOOoo = null;
            }
            com.google.android.exoplayer2.audio.OooO oooO = this.f11457OooO;
            oooO.OooO0Oo();
            oooO.f11550OooO0OO = null;
            oooO.f11552OooO0o = null;
            final AudioTrack audioTrack2 = this.f11479OooOo0O;
            final o00O0 o00o1 = this.f11465OooO0oo;
            o00o1.OooO00o();
            synchronized (f11455Oooooo0) {
                try {
                    if (f11454Oooooo == null) {
                        f11454Oooooo = Executors.newSingleThreadExecutor(new o0O000o0("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f11456OoooooO++;
                    f11454Oooooo.execute(new Runnable() { // from class: o00o0oO0.o000O0Oo
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioTrack audioTrack3 = audioTrack2;
                            o00O0 o00o2 = o00o1;
                            try {
                                audioTrack3.flush();
                                audioTrack3.release();
                                o00o2.OooO0O0();
                                synchronized (DefaultAudioSink.f11455Oooooo0) {
                                    int i = DefaultAudioSink.f11456OoooooO - 1;
                                    DefaultAudioSink.f11456OoooooO = i;
                                    if (i == 0) {
                                        DefaultAudioSink.f11454Oooooo.shutdown();
                                        DefaultAudioSink.f11454Oooooo = null;
                                    }
                                }
                            } catch (Throwable th) {
                                o00o2.OooO0O0();
                                synchronized (DefaultAudioSink.f11455Oooooo0) {
                                    int i2 = DefaultAudioSink.f11456OoooooO - 1;
                                    DefaultAudioSink.f11456OoooooO = i2;
                                    if (i2 == 0) {
                                        DefaultAudioSink.f11454Oooooo.shutdown();
                                        DefaultAudioSink.f11454Oooooo = null;
                                    }
                                    throw th;
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f11479OooOo0O = null;
        }
        this.f11471OooOOOO.f11537OooO00o = null;
        this.f11469OooOOO.f11537OooO00o = null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void pause() {
        boolean z = false;
        this.f11514o000oOoO = false;
        if (OooOooO()) {
            com.google.android.exoplayer2.audio.OooO oooO = this.f11457OooO;
            oooO.OooO0Oo();
            if (oooO.f11572OooOoO0 == -9223372036854775807L) {
                o000 o000Var = oooO.f11552OooO0o;
                o000Var.getClass();
                o000Var.OooO00o();
                z = true;
            }
            if (z) {
                this.f11479OooOo0O.pause();
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void release() {
        com.google.android.exoplayer2.audio.OooO0O0.C0200OooO0O0 c0200OooO0O0;
        com.google.android.exoplayer2.audio.OooO0O0 oooO0O0 = this.f11476OooOo;
        if (oooO0O0 == null || !oooO0O0.f11600OooO0oo) {
            return;
        }
        oooO0O0.f11599OooO0oO = null;
        int i = p245o00oo0o.o0O00.f40595OooO00o;
        Context context = oooO0O0.f11593OooO00o;
        if (i >= 23 && (c0200OooO0O0 = oooO0O0.f11596OooO0Oo) != null) {
            com.google.android.exoplayer2.audio.OooO0O0.OooO00o.OooO0O0(context, c0200OooO0O0);
        }
        com.google.android.exoplayer2.audio.OooO0O0.OooO0o oooO0o = oooO0O0.f11598OooO0o0;
        if (oooO0o != null) {
            context.unregisterReceiver(oooO0o);
        }
        com.google.android.exoplayer2.audio.OooO0O0.OooO0OO oooO0OO = oooO0O0.f11597OooO0o;
        if (oooO0OO != null) {
            oooO0OO.f11602OooO00o.unregisterContentObserver(oooO0OO);
        }
        oooO0O0.f11600OooO0oo = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void reset() {
        flush();
        ImmutableList.OooO0O0 oooO0O0ListIterator = this.f11462OooO0o.listIterator(0);
        while (oooO0O0ListIterator.hasNext()) {
            ((AudioProcessor) oooO0O0ListIterator.next()).reset();
        }
        ImmutableList.OooO0O0 oooO0O0ListIterator2 = this.f11464OooO0oO.listIterator(0);
        while (oooO0O0ListIterator2.hasNext()) {
            ((AudioProcessor) oooO0O0ListIterator2.next()).reset();
        }
        com.google.android.exoplayer2.audio.OooO0OO oooO0OO = this.f11477OooOo0;
        if (oooO0OO != null) {
            oooO0OO.OooO0o();
        }
        this.f11514o000oOoO = false;
        this.f11511OooooO0 = false;
    }
}

package androidx.media3.exoplayer.audio;

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
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.google.common.collect.ImmutableList;
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
import o000O0.o0;
import o000O0Oo.OooOo;
import o000O0Oo.o00O0O;
import o000O0Oo.o0OOO0o;
import o000O0Oo.o0Oo0oo;
import o000O0Oo.o0ooOOo;
import o000O0Oo.oo000o;
import o000OOoO.o0O0O00;
import o000OOoO.oo0o0Oo;
import org.conscrypt.PSKKeyManager;
import p028Oooo0oO.o00O0000;
import p069o0000ooO.o000000O;
import p069o0000ooO.o000OO;
import p080o000OoO.o0000O;
import p080o000OoO.o000O;
import p080o000OoO.o000OO00;
import p080o000OoO.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    @GuardedBy("releaseExecutorLock")
    public static ExecutorService f7415Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final Object f7416Oooooo0 = new Object();

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @GuardedBy("releaseExecutorLock")
    public static int f7417OoooooO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.OooO0OO f7418OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Context f7419OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000.OooO00o f7420OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f7421OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0Oo.OooOOO f7422OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O00 f7423OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0Oo0oo f7424OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O00 f7425OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0OO00O f7426OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayDeque<OooOOO0> f7427OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f7428OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f7429OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooOOO<AudioSink.InitializationException> f7430OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OooOo00 f7431OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooOOO<AudioSink.WriteException> f7432OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.OooO0o f7433OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public AudioSink.OooO00o f7434OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o0 f7435OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooOO0 f7436OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public androidx.media3.exoplayer.audio.OooO00o f7437OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public androidx.media3.common.audio.OooO00o f7438OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooOO0 f7439OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public AudioTrack f7440OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o000O0Oo.OooO00o f7441OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public OooOOO0 f7442OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public androidx.media3.common.OooO00o f7443OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooOOO0 f7444OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f7445OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public androidx.media3.common.OooOOOO f7446OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public ByteBuffer f7447OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f7448OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f7449Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f7450Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public long f7451Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f7452Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f7453Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f7454Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f7455Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f7456Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f7457Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f7458Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public ByteBuffer f7459Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f7460OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public byte[] f7461OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public ByteBuffer f7462OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f7463OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f7464OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f7465OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f7466OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public o000000O f7467OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public OooO0OO f7468OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f7469OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f7470Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public long f7471Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f7472OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f7473OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public Looper f7474OooooOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f7475o000oOoO;

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
        public final Context f7476OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public OooOO0O f7478OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f7479OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f7481OooO0o0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O0Oo.OooO00o f7477OooO0O0 = o000O0Oo.OooO00o.f34236OooO0OO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f7480OooO0o = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final androidx.media3.exoplayer.audio.OooO0o f7482OooO0oO = OooO0o.f7484OooO00o;

        public OooO(Context context) {
            this.f7476OooO00o = context;
        }
    }

    @RequiresApi(23)
    public static final class OooO00o {
        @DoNotInline
        public static void OooO00o(AudioTrack audioTrack, @Nullable OooO0OO oooO0OO) {
            audioTrack.setPreferredDevice(oooO0OO == null ? null : oooO0OO.f7483OooO00o);
        }
    }

    @RequiresApi(31)
    public static final class OooO0O0 {
        @DoNotInline
        public static void OooO00o(AudioTrack audioTrack, o0 o0Var) {
            o0.OooO00o oooO00o = o0Var.f33903OooO00o;
            oooO00o.getClass();
            LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            LogSessionId logSessionId2 = oooO00o.f33905OooO00o;
            if (logSessionId2.equals(logSessionId)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId2);
        }
    }

    @RequiresApi(23)
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AudioDeviceInfo f7483OooO00o;

        public OooO0OO(AudioDeviceInfo audioDeviceInfo) {
            this.f7483OooO00o = audioDeviceInfo;
        }
    }

    public interface OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final androidx.media3.exoplayer.audio.OooO0o f7484OooO00o = new androidx.media3.exoplayer.audio.OooO0o(new androidx.media3.exoplayer.audio.OooO0o.OooO00o());
    }

    public static final class OooOO0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final androidx.media3.common.audio.OooO00o f7485OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.media3.common.OooOO0 f7486OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f7487OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f7488OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f7489OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f7490OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f7491OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f7492OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f7493OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final boolean f7494OooOO0;

        public OooOO0(androidx.media3.common.OooOO0 oooOO1, int i, int i2, int i3, int i4, int i5, int i6, int i7, androidx.media3.common.audio.OooO00o oooO00o, boolean z) {
            this.f7486OooO00o = oooOO1;
            this.f7487OooO0O0 = i;
            this.f7488OooO0OO = i2;
            this.f7489OooO0Oo = i3;
            this.f7491OooO0o0 = i4;
            this.f7490OooO0o = i5;
            this.f7492OooO0oO = i6;
            this.f7493OooO0oo = i7;
            this.f7485OooO = oooO00o;
            this.f7494OooOO0 = z;
        }

        @RequiresApi(21)
        public static AudioAttributes OooO0OO(androidx.media3.common.OooO00o oooO00o, boolean z) {
            return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : oooO00o.OooO0OO().f6359OooO00o;
        }

        public final AudioTrack OooO00o(boolean z, androidx.media3.common.OooO00o oooO00o, int i) throws AudioSink.InitializationException {
            int i2 = this.f7488OooO0OO;
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
                throw new AudioSink.InitializationException(state, this.f7491OooO0o0, this.f7490OooO0o, this.f7493OooO0oo, this.f7486OooO00o, i2 == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.InitializationException(0, this.f7491OooO0o0, this.f7490OooO0o, this.f7493OooO0oo, this.f7486OooO00o, i2 == 1, e);
            }
        }

        public final AudioTrack OooO0O0(boolean z, androidx.media3.common.OooO00o oooO00o, int i) {
            int i2 = o000OO00.f34965OooO00o;
            int i3 = this.f7492OooO0oO;
            int i4 = this.f7490OooO0o;
            int i5 = this.f7491OooO0o0;
            if (i2 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(OooO0OO(oooO00o, z)).setAudioFormat(DefaultAudioSink.OooOoO(i5, i4, i3)).setTransferMode(1).setBufferSizeInBytes(this.f7493OooO0oo).setSessionId(i).setOffloadedPlayback(this.f7488OooO0OO == 1).build();
            }
            if (i2 >= 21) {
                return new AudioTrack(OooO0OO(oooO00o, z), DefaultAudioSink.OooOoO(i5, i4, i3), this.f7493OooO0oo, 1, i);
            }
            int iOooOo = o000OO00.OooOo(oooO00o.f6355OooO0o);
            return i == 0 ? new AudioTrack(iOooOo, this.f7491OooO0o0, this.f7490OooO0o, this.f7492OooO0oO, this.f7493OooO0oo, 1) : new AudioTrack(iOooOo, this.f7491OooO0o0, this.f7490OooO0o, this.f7492OooO0oO, this.f7493OooO0oo, 1, i);
        }
    }

    public static class OooOO0O implements o000.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AudioProcessor[] f7495OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0ooOOo f7496OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final androidx.media3.common.audio.OooO0OO f7497OooO0OO;

        public OooOO0O(AudioProcessor... audioProcessorArr) {
            o0ooOOo o0ooooo = new o0ooOOo();
            androidx.media3.common.audio.OooO0OO oooO0OO = new androidx.media3.common.audio.OooO0OO();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f7495OooO00o = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f7496OooO0O0 = o0ooooo;
            this.f7497OooO0OO = oooO0OO;
            audioProcessorArr2[audioProcessorArr.length] = o0ooooo;
            audioProcessorArr2[audioProcessorArr.length + 1] = oooO0OO;
        }
    }

    public static final class OooOOO<T extends Exception> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public T f7498OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f7499OooO0O0;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void OooO00o(T t) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f7498OooO00o == null) {
                this.f7498OooO00o = t;
                this.f7499OooO0O0 = 100 + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f7499OooO0O0) {
                T t2 = this.f7498OooO00o;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f7498OooO00o;
                this.f7498OooO00o = null;
                throw t3;
            }
        }
    }

    public static final class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.media3.common.OooOOOO f7500OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f7501OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f7502OooO0OO;

        public OooOOO0(androidx.media3.common.OooOOOO oooOOOO, long j, long j2) {
            this.f7500OooO00o = oooOOOO;
            this.f7501OooO0O0 = j;
            this.f7502OooO0OO = j2;
        }
    }

    public final class OooOOOO implements androidx.media3.exoplayer.audio.OooO0OO.OooO00o {
        public OooOOOO() {
        }

        @Override // androidx.media3.exoplayer.audio.OooO0OO.OooO00o
        public final void OooO00o(final int i, final long j) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            if (defaultAudioSink.f7434OooOOo != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - defaultAudioSink.f7471Ooooo0o;
                final androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o = androidx.media3.exoplayer.audio.OooO.this.f7510o00000OO;
                Handler handler = oooO00o.f7534OooO00o;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: o000O0Oo.OooOO0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            long j2 = j;
                            long j3 = jElapsedRealtime;
                            androidx.media3.exoplayer.audio.OooO0O0 oooO0O0 = oooO00o.f7535OooO0O0;
                            int i3 = o000OO00.f34965OooO00o;
                            oooO0O0.OooOo0(i2, j2, j3);
                        }
                    });
                }
            }
        }

        @Override // androidx.media3.exoplayer.audio.OooO0OO.OooO00o
        public final void OooO0O0(long j) {
            Log.OooO0o("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0OO.OooO00o
        public final void OooO0OO(final long j) {
            final androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o;
            Handler handler;
            AudioSink.OooO00o oooO00o2 = DefaultAudioSink.this.f7434OooOOo;
            if (oooO00o2 == null || (handler = (oooO00o = androidx.media3.exoplayer.audio.OooO.this.f7510o00000OO).f7534OooO00o) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: o000O0Oo.OooO0O0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o3 = oooO00o;
                    oooO00o3.getClass();
                    int i = o000OO00.f34965OooO00o;
                    oooO00o3.f7535OooO0O0.OooO0o(j);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.OooO0OO.OooO00o
        public final void OooO0Oo(long j, long j2, long j3, long j4) {
            StringBuilder sbOooO00o = o00O0000.OooO00o("Spurious audio timestamp (frame position mismatch): ", j, ", ");
            sbOooO00o.append(j2);
            o00O0O.OooO00o(sbOooO00o, ", ", j3, ", ");
            sbOooO00o.append(j4);
            sbOooO00o.append(", ");
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            sbOooO00o.append(defaultAudioSink.OooOoOO());
            sbOooO00o.append(", ");
            sbOooO00o.append(defaultAudioSink.OooOoo0());
            String string = sbOooO00o.toString();
            Object obj = DefaultAudioSink.f7416Oooooo0;
            Log.OooO0o("DefaultAudioSink", string);
        }

        @Override // androidx.media3.exoplayer.audio.OooO0OO.OooO00o
        public final void OooO0o0(long j, long j2, long j3, long j4) {
            StringBuilder sbOooO00o = o00O0000.OooO00o("Spurious audio timestamp (system clock mismatch): ", j, ", ");
            sbOooO00o.append(j2);
            o00O0O.OooO00o(sbOooO00o, ", ", j3, ", ");
            sbOooO00o.append(j4);
            sbOooO00o.append(", ");
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            sbOooO00o.append(defaultAudioSink.OooOoOO());
            sbOooO00o.append(", ");
            sbOooO00o.append(defaultAudioSink.OooOoo0());
            String string = sbOooO00o.toString();
            Object obj = DefaultAudioSink.f7416Oooooo0;
            Log.OooO0o("DefaultAudioSink", string);
        }
    }

    @RequiresApi(29)
    public final class OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Handler f7504OooO00o = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o f7505OooO0O0 = new OooO00o();

        public class OooO00o extends AudioTrack$StreamEventCallback {
            public OooO00o() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.OooO00o oooO00o;
                Renderer.OooO00o oooO00o2;
                if (audioTrack.equals(DefaultAudioSink.this.f7440OooOo0O) && (oooO00o = (defaultAudioSink = DefaultAudioSink.this).f7434OooOOo) != null && defaultAudioSink.f7475o000oOoO && (oooO00o2 = androidx.media3.exoplayer.audio.OooO.this.f7515o0000O0) != null) {
                    oooO00o2.OooO0O0();
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                DefaultAudioSink defaultAudioSink;
                AudioSink.OooO00o oooO00o;
                Renderer.OooO00o oooO00o2;
                if (audioTrack.equals(DefaultAudioSink.this.f7440OooOo0O) && (oooO00o = (defaultAudioSink = DefaultAudioSink.this).f7434OooOOo) != null && defaultAudioSink.f7475o000oOoO && (oooO00o2 = androidx.media3.exoplayer.audio.OooO.this.f7515o0000O0) != null) {
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
        Context context = oooO.f7476OooO00o;
        this.f7419OooO00o = context;
        this.f7441OooOo0o = context != null ? o000O0Oo.OooO00o.OooO00o(context) : oooO.f7477OooO0O0;
        this.f7420OooO0O0 = oooO.f7478OooO0OO;
        int i = o000OO00.f34965OooO00o;
        this.f7421OooO0OO = i >= 21 && oooO.f7479OooO0Oo;
        this.f7428OooOO0O = i >= 23 && oooO.f7481OooO0o0;
        this.f7429OooOO0o = i >= 29 ? oooO.f7480OooO0o : 0;
        this.f7433OooOOOo = oooO.f7482OooO0oO;
        o0OO00O o0oo00o2 = new o0OO00O(0);
        this.f7426OooO0oo = o0oo00o2;
        o0oo00o2.OooO0Oo();
        this.f7418OooO = new androidx.media3.exoplayer.audio.OooO0OO(new OooOOOO());
        o000O0Oo.OooOOO oooOOO = new o000O0Oo.OooOOO();
        this.f7422OooO0Oo = oooOOO;
        o0Oo0oo o0oo0oo2 = new o0Oo0oo();
        this.f7424OooO0o0 = o0oo0oo2;
        androidx.media3.common.audio.OooO0o oooO0o = new androidx.media3.common.audio.OooO0o();
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18686OooO0o0;
        Object[] objArr = {oooO0o, oooOOO, o0oo0oo2};
        com.google.common.collect.o0.OooO00o(3, objArr);
        this.f7423OooO0o = ImmutableList.OooO(3, objArr);
        this.f7425OooO0oO = ImmutableList.OooOOOo(new o0OOO0o());
        this.f7458Oooo0oO = 1.0f;
        this.f7443OooOoO0 = androidx.media3.common.OooO00o.f6346OooOO0;
        this.f7466OoooOOo = 0;
        this.f7467OoooOo0 = new o000000O();
        androidx.media3.common.OooOOOO oooOOOO = androidx.media3.common.OooOOOO.f6621OooO0oO;
        this.f7444OooOoOO = new OooOOO0(oooOOOO, 0L, 0L);
        this.f7446OooOoo0 = oooOOOO;
        this.f7445OooOoo = false;
        this.f7427OooOO0 = new ArrayDeque<>();
        this.f7430OooOOO = new OooOOO<>();
        this.f7432OooOOOO = new OooOOO<>();
    }

    @RequiresApi(21)
    public static AudioFormat OooOoO(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static boolean OooOooo(AudioTrack audioTrack) {
        return o000OO00.f34965OooO00o >= 29 && audioTrack.isOffloadedPlayback();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooO(int i) {
        if (this.f7466OoooOOo != i) {
            this.f7466OoooOOo = i;
            this.f7465OoooOOO = i != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooO00o(androidx.media3.common.OooOOOO oooOOOO) {
        this.f7446OooOoo0 = new androidx.media3.common.OooOOOO(o000OO00.OooO0oo(oooOOOO.f6624OooO0Oo, 0.1f, 8.0f), o000OO00.OooO0oo(oooOOOO.f6626OooO0o0, 0.1f, 8.0f));
        if (Oooo0o0()) {
            Oooo0O0();
        } else {
            Oooo0(oooOOOO);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final androidx.media3.common.OooOOOO OooO0O0() {
        return this.f7446OooOoo0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final boolean OooO0OO(androidx.media3.common.OooOO0 oooOO1) {
        return OooOo00(oooOO1) != 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooO0Oo() {
        this.f7475o000oOoO = true;
        if (OooOooO()) {
            o000O0Oo.OooOOO0 oooOOO0 = this.f7418OooO.f7541OooO0o;
            oooOOO0.getClass();
            oooOOO0.OooO00o();
            this.f7440OooOo0O.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooO0o(androidx.media3.common.OooO00o oooO00o) {
        if (this.f7443OooOoO0.equals(oooO00o)) {
            return;
        }
        this.f7443OooOoO0 = oooO00o;
        if (this.f7469OoooOoo) {
            return;
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final boolean OooO0o0() {
        return !OooOooO() || (this.f7460OoooO && !OooO0oo());
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(23)
    public final void OooO0oO(@Nullable AudioDeviceInfo audioDeviceInfo) {
        OooO0OO oooO0OO = audioDeviceInfo == null ? null : new OooO0OO(audioDeviceInfo);
        this.f7468OoooOoO = oooO0OO;
        AudioTrack audioTrack = this.f7440OooOo0O;
        if (audioTrack != null) {
            OooO00o.OooO00o(audioTrack, oooO0OO);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final boolean OooO0oo() {
        return OooOooO() && this.f7418OooO.OooO0OO(OooOoo0());
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooOO0() {
        if (this.f7469OoooOoo) {
            this.f7469OoooOoo = false;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooOO0O(@Nullable o0 o0Var) {
        this.f7435OooOOo0 = o0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:162:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:176:0x0319 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7  */
    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final boolean OooOO0o(ByteBuffer byteBuffer, long j, int i) throws Exception {
        boolean z;
        boolean z2;
        int iOooO0O0;
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        ByteBuffer byteBuffer2 = this.f7459Oooo0oo;
        p080o000OoO.o00O0O.OooO00o(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f7436OooOOoo != null) {
            if (!OooOo()) {
                return false;
            }
            OooOO0 oooOO1 = this.f7436OooOOoo;
            OooOO0 oooOO2 = this.f7439OooOo00;
            oooOO1.getClass();
            if (oooOO2.f7488OooO0OO == oooOO1.f7488OooO0OO && oooOO2.f7492OooO0oO == oooOO1.f7492OooO0oO && oooOO2.f7491OooO0o0 == oooOO1.f7491OooO0o0 && oooOO2.f7490OooO0o == oooOO1.f7490OooO0o && oooOO2.f7489OooO0Oo == oooOO1.f7489OooO0Oo && oooOO2.f7494OooOO0 == oooOO1.f7494OooOO0) {
                this.f7439OooOo00 = this.f7436OooOOoo;
                this.f7436OooOOoo = null;
                if (OooOooo(this.f7440OooOo0O) && this.f7429OooOO0o != 3) {
                    if (this.f7440OooOo0O.getPlayState() == 3) {
                        this.f7440OooOo0O.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f7440OooOo0O;
                    androidx.media3.common.OooOO0 oooOO3 = this.f7439OooOo00.f7486OooO00o;
                    audioTrack.setOffloadDelayPadding(oooOO3.f6433OooOooo, oooOO3.f6435Oooo000);
                    this.f7473OooooOO = true;
                }
            } else {
                Oooo000();
                if (OooO0oo()) {
                    return false;
                }
                flush();
            }
            OooOo0o(j);
        }
        boolean zOooOooO = OooOooO();
        OooOOO<AudioSink.InitializationException> oooOOO = this.f7430OooOOO;
        if (!zOooOooO) {
            try {
                if (!OooOoo()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e) {
                if (e.f7411OooO0o0) {
                    throw e;
                }
                oooOOO.OooO00o(e);
                return false;
            }
        }
        oooOOO.f7498OooO00o = null;
        if (this.f7457Oooo0o0) {
            this.f7456Oooo0o = Math.max(0L, j);
            this.f7455Oooo0OO = false;
            this.f7457Oooo0o0 = false;
            if (Oooo0o0()) {
                Oooo0O0();
            }
            OooOo0o(j);
            if (this.f7475o000oOoO) {
                OooO0Oo();
            }
        }
        long jOooOoo0 = OooOoo0();
        androidx.media3.exoplayer.audio.OooO0OO oooO0OO = this.f7418OooO;
        AudioTrack audioTrack2 = oooO0OO.f7539OooO0OO;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (oooO0OO.f7544OooO0oo) {
            if (playState == 2) {
                oooO0OO.f7551OooOOOo = false;
            } else if (playState != 1 || oooO0OO.OooO0O0() != 0) {
                z = oooO0OO.f7551OooOOOo;
                boolean zOooO0OO = oooO0OO.OooO0OO(jOooOoo0);
                oooO0OO.f7551OooOOOo = zOooO0OO;
                if (z) {
                    oooO0OO.f7537OooO00o.OooO00o(oooO0OO.f7542OooO0o0, o000OO00.o000oOoO(oooO0OO.f7536OooO));
                }
                z2 = true;
            }
            z2 = false;
        } else {
            z = oooO0OO.f7551OooOOOo;
            boolean zOooO0OO2 = oooO0OO.OooO0OO(jOooOoo0);
            oooO0OO.f7551OooOOOo = zOooO0OO2;
            if (z && !zOooO0OO2 && playState != 1) {
                oooO0OO.f7537OooO00o.OooO00o(oooO0OO.f7542OooO0o0, o000OO00.o000oOoO(oooO0OO.f7536OooO));
            }
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        if (this.f7459Oooo0oo == null) {
            p080o000OoO.o00O0O.OooO00o(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            OooOO0 oooOO4 = this.f7439OooOo00;
            if (oooOO4.f7488OooO0OO != 0 && this.f7454Oooo0O0 == 0) {
                int i7 = oooOO4.f7492OooO0oO;
                switch (i7) {
                    case 5:
                    case 6:
                    case 18:
                        iOooO0O0 = ((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10 ? o000OOoO.OooO00o.f34623OooO00o[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * PSKKeyManager.MAX_KEY_LENGTH_BYTES : 1536;
                        this.f7454Oooo0O0 = iOooO0O0;
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
                        this.f7454Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 9:
                        int iPosition2 = byteBuffer.position();
                        int i8 = o000OO00.f34965OooO00o;
                        int iReverseBytes = byteBuffer.getInt(iPosition2);
                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                        }
                        iOooO0O0 = oo0o0Oo.OooO0O0(iReverseBytes);
                        if (iOooO0O0 == -1) {
                            throw new IllegalArgumentException();
                        }
                        this.f7454Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 10:
                    case 16:
                        iOooO0O0 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        this.f7454Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 11:
                    case 12:
                        iOooO0O0 = 2048;
                        this.f7454Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 13:
                    case 19:
                    default:
                        throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("Unexpected audio encoding: ", i7));
                    case 14:
                        int iPosition3 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i9 = iPosition3;
                        while (true) {
                            if (i9 <= iLimit) {
                                int i10 = o000OO00.f34965OooO00o;
                                int iReverseBytes2 = byteBuffer.getInt(i9 + 4);
                                if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                    iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                }
                                if ((iReverseBytes2 & (-2)) == -126718022) {
                                    i5 = i9 - iPosition3;
                                } else {
                                    i9++;
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
                        this.f7454Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 15:
                        iOooO0O0 = ConstantsKt.MINIMUM_BLOCK_SIZE;
                        this.f7454Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int iPosition4 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition4);
                        iOooO0O0 = o000OOoO.OooO0O0.OooO0O0(new o0000O(bArr, 16)).f34632OooO0OO;
                        this.f7454Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                    case 20:
                        if ((byteBuffer.get(5) & 2) == 0) {
                            i6 = 0;
                        } else {
                            byte b4 = byteBuffer.get(26);
                            int i11 = 28;
                            int i12 = 28;
                            for (int i13 = 0; i13 < b4; i13++) {
                                i12 += byteBuffer.get(i13 + 27);
                            }
                            byte b5 = byteBuffer.get(i12 + 26);
                            for (int i14 = 0; i14 < b5; i14++) {
                                i11 += byteBuffer.get(i12 + 27 + i14);
                            }
                            i6 = i12 + i11;
                        }
                        int i15 = byteBuffer.get(i6 + 26) + 27 + i6;
                        iOooO0O0 = (int) ((o0O0O00.OooO0O0(byteBuffer.get(i15), byteBuffer.limit() - i15 > 1 ? byteBuffer.get(i15 + 1) : (byte) 0) * 48000) / AnimationKt.MillisToNanos);
                        this.f7454Oooo0O0 = iOooO0O0;
                        if (iOooO0O0 == 0) {
                            return true;
                        }
                        break;
                }
            }
            if (this.f7442OooOoO != null) {
                if (!OooOo()) {
                    return false;
                }
                OooOo0o(j);
                this.f7442OooOoO = null;
            }
            long jOooo0oo = o000OO00.Oooo0oo(this.f7439OooOo00.f7486OooO00o.f6430OooOoo, OooOoOO() - this.f7424OooO0o0.f34284OooOOOO) + this.f7456Oooo0o;
            if (!this.f7455Oooo0OO && Math.abs(jOooo0oo - j) > 200000) {
                AudioSink.OooO00o oooO00o = this.f7434OooOOo;
                if (oooO00o != null) {
                    ((androidx.media3.exoplayer.audio.OooO.OooO0O0) oooO00o).OooO00o(new AudioSink.UnexpectedDiscontinuityException(j, jOooo0oo));
                }
                this.f7455Oooo0OO = true;
            }
            if (this.f7455Oooo0OO) {
                if (!OooOo()) {
                    return false;
                }
                long j2 = j - jOooo0oo;
                this.f7456Oooo0o += j2;
                this.f7455Oooo0OO = false;
                OooOo0o(j);
                AudioSink.OooO00o oooO00o2 = this.f7434OooOOo;
                if (oooO00o2 != null && j2 != 0) {
                    androidx.media3.exoplayer.audio.OooO.this.f7519o0000oo = true;
                }
            }
            if (this.f7439OooOo00.f7488OooO0OO == 0) {
                this.f7451Oooo000 += (long) byteBuffer.remaining();
            } else {
                this.f7452Oooo00O = (((long) this.f7454Oooo0O0) * ((long) i)) + this.f7452Oooo00O;
            }
            this.f7459Oooo0oo = byteBuffer;
            this.f7449Oooo = i;
        }
        Oooo00O(j);
        if (!this.f7459Oooo0oo.hasRemaining()) {
            this.f7459Oooo0oo = null;
            this.f7449Oooo = 0;
            return true;
        }
        if (!(oooO0OO.f7560OooOoO != -9223372036854775807L && OooOoo0() > 0 && SystemClock.elapsedRealtime() - oooO0OO.f7560OooOoO >= 200)) {
            return false;
        }
        Log.OooO0o("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooOOO() throws AudioSink.WriteException {
        if (!this.f7460OoooO && OooOooO() && OooOo()) {
            Oooo000();
            this.f7460OoooO = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final /* synthetic */ void OooOOO0() {
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final long OooOOOO(boolean z) {
        ArrayDeque<OooOOO0> arrayDeque;
        long jOooOo00;
        long jOooo;
        if (!OooOooO() || this.f7457Oooo0o0) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f7418OooO.OooO00o(z), o000OO00.Oooo0oo(this.f7439OooOo00.f7491OooO0o0, OooOoo0()));
        while (true) {
            arrayDeque = this.f7427OooOO0;
            if (arrayDeque.isEmpty() || jMin < arrayDeque.getFirst().f7502OooO0OO) {
                break;
            }
            this.f7444OooOoOO = arrayDeque.remove();
        }
        OooOOO0 oooOOO0 = this.f7444OooOoOO;
        long j = jMin - oooOOO0.f7502OooO0OO;
        boolean zEquals = oooOOO0.f7500OooO00o.equals(androidx.media3.common.OooOOOO.f6621OooO0oO);
        o000.OooO00o oooO00o = this.f7420OooO0O0;
        if (zEquals) {
            jOooOo00 = this.f7444OooOoOO.f7501OooO0O0 + j;
        } else if (arrayDeque.isEmpty()) {
            androidx.media3.common.audio.OooO0OO oooO0OO = ((OooOO0O) oooO00o).f7497OooO0OO;
            if (oooO0OO.f6765OooOOOO >= 1024) {
                long j2 = oooO0OO.f6763OooOOO;
                o000.OooO0O0 oooO0O0 = oooO0OO.f6760OooOO0;
                oooO0O0.getClass();
                long j3 = j2 - ((long) ((oooO0O0.f33199OooOO0O * oooO0O0.f33191OooO0O0) * 2));
                int i = oooO0OO.f6759OooO0oo.f6737OooO00o;
                int i2 = oooO0OO.f6758OooO0oO.f6737OooO00o;
                jOooo = i == i2 ? o000OO00.Oooo(j, j3, oooO0OO.f6765OooOOOO) : o000OO00.Oooo(j, j3 * ((long) i), oooO0OO.f6765OooOOOO * ((long) i2));
            } else {
                jOooo = (long) (((double) oooO0OO.f6754OooO0OO) * j);
            }
            jOooOo00 = jOooo + this.f7444OooOoOO.f7501OooO0O0;
        } else {
            OooOOO0 first = arrayDeque.getFirst();
            jOooOo00 = first.f7501OooO0O0 - o000OO00.OooOo00(first.f7502OooO0OO - jMin, this.f7444OooOoOO.f7500OooO00o.f6624OooO0Oo);
        }
        return o000OO00.Oooo0oo(this.f7439OooOo00.f7491OooO0o0, ((OooOO0O) oooO00o).f7496OooO0O0.f34296OooOo00) + jOooOo00;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooOOOo(androidx.media3.common.OooOO0 oooOO1, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        int i;
        boolean z;
        int iOooO0O0;
        int iOooOOOo;
        androidx.media3.common.audio.OooO00o oooO00o;
        int i2;
        boolean z2;
        int iOooOOOo2;
        int iOooOo0O;
        int iOooOo0O2;
        int i3;
        int i4;
        int iOooO;
        boolean z3;
        int[] iArr2;
        boolean zEquals = "audio/raw".equals(oooOO1.f6417OooOOOO);
        boolean z4 = this.f7428OooOO0O;
        int i5 = oooOO1.f6430OooOoo;
        int i6 = oooOO1.f6431OooOoo0;
        if (zEquals) {
            int i7 = oooOO1.f6432OooOooO;
            p080o000OoO.o00O0O.OooO00o(o000OO00.Oooo0(i7));
            iOooOo0O2 = o000OO00.OooOo0O(i7, i6);
            ImmutableList.OooO00o oooO00o2 = new ImmutableList.OooO00o();
            if (!this.f7421OooO0OO) {
                z3 = false;
            } else if (i7 == 536870912 || i7 == 805306368 || i7 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                oooO00o2.OooO0o(this.f7425OooO0oO);
            } else {
                oooO00o2.OooO0o(this.f7423OooO0o);
                oooO00o2.OooO0Oo(((OooOO0O) this.f7420OooO0O0).f7495OooO00o);
            }
            oooO00o = new androidx.media3.common.audio.OooO00o(oooO00o2.OooO0oo());
            if (oooO00o.equals(this.f7438OooOo0)) {
                oooO00o = this.f7438OooOo0;
            }
            int i8 = oooOO1.f6433OooOooo;
            o0Oo0oo o0oo0oo2 = this.f7424OooO0o0;
            o0oo0oo2.f34278OooO = i8;
            o0oo0oo2.f34279OooOO0 = oooOO1.f6435Oooo000;
            if (o000OO00.f34965OooO00o < 21 && i6 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i9 = 0; i9 < 6; i9++) {
                    iArr2[i9] = i9;
                }
            } else {
                iArr2 = iArr;
            }
            this.f7422OooO0Oo.f34255OooO = iArr2;
            try {
                AudioProcessor.OooO00o OooO00o2 = oooO00o.OooO00o(new AudioProcessor.OooO00o(i5, i6, i7));
                int i10 = OooO00o2.f6738OooO0O0;
                iOooOOOo2 = o000OO00.OooOOOo(i10);
                i3 = OooO00o2.f6739OooO0OO;
                iOooOo0O = o000OO00.OooOo0O(i3, i10);
                i2 = OooO00o2.f6737OooO00o;
                z2 = z4;
                i4 = 0;
            } catch (AudioProcessor.UnhandledAudioFormatException e) {
                throw new AudioSink.ConfigurationException(e, oooOO1);
            }
        } else {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18686OooO0o0;
            androidx.media3.common.audio.OooO00o oooO00o3 = new androidx.media3.common.audio.OooO00o(o0O00.f19065OooO0oo);
            if (Oooo0o(this.f7443OooOoO0, oooOO1)) {
                String str = oooOO1.f6417OooOOOO;
                str.getClass();
                iOooO0O0 = o000OO.OooO0O0(str, oooOO1.f6414OooOO0o);
                i = 1;
                iOooOOOo = o000OO00.OooOOOo(i6);
                z = true;
            } else {
                Pair<Integer, Integer> pairOooO0OO = OooOoO0().OooO0OO(oooOO1);
                if (pairOooO0OO == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + oooOO1, oooOO1);
                }
                int iIntValue = ((Integer) pairOooO0OO.first).intValue();
                int iIntValue2 = ((Integer) pairOooO0OO.second).intValue();
                i = 2;
                z = z4;
                iOooO0O0 = iIntValue;
                iOooOOOo = iIntValue2;
            }
            oooO00o = oooO00o3;
            i2 = i5;
            z2 = z;
            iOooOOOo2 = iOooOOOo;
            iOooOo0O = -1;
            iOooOo0O2 = -1;
            int i11 = i;
            i3 = iOooO0O0;
            i4 = i11;
        }
        if (i3 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i4 + ") for: " + oooOO1, oooOO1);
        }
        if (iOooOOOo2 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i4 + ") for: " + oooOO1, oooOO1);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, iOooOOOo2, i3);
        p080o000OoO.o00O0O.OooO0Oo(minBufferSize != -2);
        int i12 = iOooOo0O != -1 ? iOooOo0O : 1;
        double d = z2 ? 8.0d : 1.0d;
        this.f7433OooOOOo.getClass();
        if (i4 == 0) {
            long j = i2;
            long j2 = i12;
            iOooO = o000OO00.OooO(minBufferSize * 4, com.google.common.primitives.OooO0OO.OooO00o(((((long) 250000) * j) * j2) / AnimationKt.MillisToNanos), com.google.common.primitives.OooO0OO.OooO00o(((((long) 750000) * j) * j2) / AnimationKt.MillisToNanos));
        } else if (i4 == 1) {
            iOooO = com.google.common.primitives.OooO0OO.OooO00o((((long) 50000000) * ((long) androidx.media3.exoplayer.audio.OooO0o.OooO00o(i3))) / AnimationKt.MillisToNanos);
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException();
            }
            int i13 = i3 == 5 ? 500000 : 250000;
            int i14 = oooOO1.f6413OooOO0O;
            iOooO = com.google.common.primitives.OooO0OO.OooO00o((((long) i13) * ((long) (i14 != -1 ? com.google.common.math.OooO00o.OooO0O0(i14, 8, RoundingMode.CEILING) : androidx.media3.exoplayer.audio.OooO0o.OooO00o(i3)))) / AnimationKt.MillisToNanos);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iOooO) * d)) + i12) - 1) / i12) * i12;
        this.f7472OooooO0 = false;
        OooOO0 oooOO2 = new OooOO0(oooOO1, iOooOo0O2, i4, iOooOo0O, i2, iOooOOOo2, i3, iMax, oooO00o, z2);
        if (OooOooO()) {
            this.f7436OooOOoo = oooOO2;
        } else {
            this.f7439OooOo00 = oooOO2;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooOOo(float f) {
        if (this.f7458Oooo0oO != f) {
            this.f7458Oooo0oO = f;
            Oooo0OO();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooOOo0() {
        this.f7455Oooo0OO = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooOOoo() {
        p080o000OoO.o00O0O.OooO0Oo(o000OO00.f34965OooO00o >= 21);
        p080o000OoO.o00O0O.OooO0Oo(this.f7465OoooOOO);
        if (this.f7469OoooOoo) {
            return;
        }
        this.f7469OoooOoo = true;
        flush();
    }

    public final boolean OooOo() throws Exception {
        if (!this.f7438OooOo0.OooO0Oo()) {
            ByteBuffer byteBuffer = this.f7462OoooO00;
            if (byteBuffer == null) {
                return true;
            }
            Oooo0oO(byteBuffer, Long.MIN_VALUE);
            return this.f7462OoooO00 == null;
        }
        androidx.media3.common.audio.OooO00o oooO00o = this.f7438OooOo0;
        if (oooO00o.OooO0Oo() && !oooO00o.f6744OooO0Oo) {
            oooO00o.f6744OooO0Oo = true;
            ((AudioProcessor) oooO00o.f6742OooO0O0.get(0)).OooO0oo();
        }
        Oooo00O(Long.MIN_VALUE);
        if (!this.f7438OooOo0.OooO0OO()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f7462OoooO00;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooOo0(o000000O o000000o2) {
        if (this.f7467OoooOo0.equals(o000000o2)) {
            return;
        }
        int i = o000000o2.f33811OooO00o;
        AudioTrack audioTrack = this.f7440OooOo0O;
        if (audioTrack != null) {
            if (this.f7467OoooOo0.f33811OooO00o != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f7440OooOo0O.setAuxEffectSendLevel(o000000o2.f33812OooO0O0);
            }
        }
        this.f7467OoooOo0 = o000000o2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final int OooOo00(androidx.media3.common.OooOO0 oooOO1) {
        if (!"audio/raw".equals(oooOO1.f6417OooOOOO)) {
            if (this.f7472OooooO0 || !Oooo0o(this.f7443OooOoO0, oooOO1)) {
                return OooOoO0().OooO0OO(oooOO1) != null ? 2 : 0;
            }
            return 2;
        }
        int i = oooOO1.f6432OooOooO;
        if (o000OO00.Oooo0(i)) {
            return (i == 2 || (this.f7421OooO0OO && i == 4)) ? 2 : 1;
        }
        Log.OooO0o("DefaultAudioSink", "Invalid PCM encoding: " + i);
        return 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void OooOo0O(boolean z) {
        this.f7445OooOoo = z;
        Oooo0(Oooo0o0() ? androidx.media3.common.OooOOOO.f6621OooO0oO : this.f7446OooOoo0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    public final void OooOo0o(long j) {
        androidx.media3.common.OooOOOO oooOOOO;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zOooo0o0 = Oooo0o0();
        boolean z5 = this.f7421OooO0OO;
        boolean z6 = false;
        o000.OooO00o oooO00o = this.f7420OooO0O0;
        if (zOooo0o0) {
            oooOOOO = androidx.media3.common.OooOOOO.f6621OooO0oO;
        } else {
            if (this.f7469OoooOoo) {
                z3 = false;
            } else {
                OooOO0 oooOO1 = this.f7439OooOo00;
                if (oooOO1.f7488OooO0OO == 0) {
                    int i = oooOO1.f7486OooO00o.f6432OooOooO;
                    if (z5) {
                        int i2 = o000OO00.f34965OooO00o;
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
                oooOOOO = this.f7446OooOoo0;
                OooOO0O oooOO0O = (OooOO0O) oooO00o;
                oooOO0O.getClass();
                float f = oooOOOO.f6624OooO0Oo;
                androidx.media3.common.audio.OooO0OO oooO0OO = oooOO0O.f7497OooO0OO;
                if (oooO0OO.f6754OooO0OO != f) {
                    oooO0OO.f6754OooO0OO = f;
                    oooO0OO.f6752OooO = true;
                }
                float f2 = oooO0OO.f6755OooO0Oo;
                float f3 = oooOOOO.f6626OooO0o0;
                if (f2 != f3) {
                    oooO0OO.f6755OooO0Oo = f3;
                    oooO0OO.f6752OooO = true;
                }
            } else {
                oooOOOO = androidx.media3.common.OooOOOO.f6621OooO0oO;
            }
            this.f7446OooOoo0 = oooOOOO;
        }
        androidx.media3.common.OooOOOO oooOOOO2 = oooOOOO;
        if (!this.f7469OoooOoo) {
            OooOO0 oooOO2 = this.f7439OooOo00;
            if (oooOO2.f7488OooO0OO == 0) {
                int i3 = oooOO2.f7486OooO00o.f6432OooOooO;
                if (z5) {
                    int i4 = o000OO00.f34965OooO00o;
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
            z6 = this.f7445OooOoo;
            ((OooOO0O) oooO00o).f7496OooO0O0.f34290OooOOO0 = z6;
        }
        this.f7445OooOoo = z6;
        this.f7427OooOO0.add(new OooOOO0(oooOOOO2, Math.max(0L, j), o000OO00.Oooo0oo(this.f7439OooOo00.f7491OooO0o0, OooOoo0())));
        androidx.media3.common.audio.OooO00o oooO00o2 = this.f7439OooOo00.f7485OooO;
        this.f7438OooOo0 = oooO00o2;
        oooO00o2.OooO0O0();
        AudioSink.OooO00o oooO00o3 = this.f7434OooOOo;
        if (oooO00o3 != null) {
            final boolean z7 = this.f7445OooOoo;
            final androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o4 = androidx.media3.exoplayer.audio.OooO.this.f7510o00000OO;
            Handler handler = oooO00o4.f7534OooO00o;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o000O0Oo.OooO
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o5 = oooO00o4;
                        oooO00o5.getClass();
                        int i5 = o000OO00.f34965OooO00o;
                        oooO00o5.f7535OooO0O0.onSkipSilenceEnabledChanged(z7);
                    }
                });
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [o000O0Oo.Oooo000] */
    public final o000O0Oo.OooO00o OooOoO0() {
        Context context;
        o000O0Oo.OooO00o oooO00oOooO0O0;
        androidx.media3.exoplayer.audio.OooO00o.OooO0O0 oooO0O0;
        if (this.f7437OooOo == null && (context = this.f7419OooO00o) != null) {
            this.f7474OooooOo = Looper.myLooper();
            androidx.media3.exoplayer.audio.OooO00o oooO00o = new androidx.media3.exoplayer.audio.OooO00o(context, new androidx.media3.exoplayer.audio.OooO00o.OooO() { // from class: o000O0Oo.Oooo000
                @Override // androidx.media3.exoplayer.audio.OooO00o.OooO
                public final void OooO00o(OooO00o oooO00o2) {
                    RendererCapabilities.OooO00o oooO00o3;
                    DefaultAudioSink defaultAudioSink = this.f34271OooO00o;
                    p080o000OoO.o00O0O.OooO0Oo(defaultAudioSink.f7474OooooOo == Looper.myLooper());
                    if (oooO00o2.equals(defaultAudioSink.OooOoO0())) {
                        return;
                    }
                    defaultAudioSink.f7441OooOo0o = oooO00o2;
                    AudioSink.OooO00o oooO00o4 = defaultAudioSink.f7434OooOOo;
                    if (oooO00o4 != null) {
                        androidx.media3.exoplayer.audio.OooO oooO = androidx.media3.exoplayer.audio.OooO.this;
                        synchronized (oooO.f7201OooO0Oo) {
                            oooO00o3 = oooO.f7213OooOOo0;
                        }
                        if (oooO00o3 != null) {
                            ((androidx.media3.exoplayer.trackselection.OooO0O0) oooO00o3).OooOOOO();
                        }
                    }
                }
            });
            this.f7437OooOo = oooO00o;
            if (oooO00o.f7528OooO0oo) {
                oooO00oOooO0O0 = oooO00o.f7527OooO0oO;
                oooO00oOooO0O0.getClass();
            } else {
                oooO00o.f7528OooO0oo = true;
                androidx.media3.exoplayer.audio.OooO00o.OooO0OO oooO0OO = oooO00o.f7525OooO0o;
                if (oooO0OO != null) {
                    oooO0OO.f7530OooO00o.registerContentObserver(oooO0OO.f7531OooO0O0, false, oooO0OO);
                }
                int i = o000OO00.f34965OooO00o;
                Handler handler = oooO00o.f7523OooO0OO;
                Context context2 = oooO00o.f7521OooO00o;
                if (i >= 23 && (oooO0O0 = oooO00o.f7524OooO0Oo) != null) {
                    androidx.media3.exoplayer.audio.OooO00o.C0146OooO00o.OooO00o(context2, oooO0O0, handler);
                }
                androidx.media3.exoplayer.audio.OooO00o.OooO0o oooO0o = oooO00o.f7526OooO0o0;
                oooO00oOooO0O0 = o000O0Oo.OooO00o.OooO0O0(context2, oooO0o != null ? context2.registerReceiver(oooO0o, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null);
                oooO00o.f7527OooO0oO = oooO00oOooO0O0;
            }
            this.f7441OooOo0o = oooO00oOooO0O0;
        }
        return this.f7441OooOo0o;
    }

    public final long OooOoOO() {
        OooOO0 oooOO1 = this.f7439OooOo00;
        return oooOO1.f7488OooO0OO == 0 ? this.f7451Oooo000 / ((long) oooOO1.f7487OooO0O0) : this.f7452Oooo00O;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:? A[SYNTHETIC] */
    public final boolean OooOoo() throws AudioSink.InitializationException {
        AudioTrack audioTrackOooO00o;
        o0 o0Var;
        if (!this.f7426OooO0oo.OooO0OO()) {
            return false;
        }
        try {
            OooOO0 oooOO1 = this.f7439OooOo00;
            oooOO1.getClass();
            try {
                audioTrackOooO00o = oooOO1.OooO00o(this.f7469OoooOoo, this.f7443OooOoO0, this.f7466OoooOOo);
            } catch (AudioSink.InitializationException e) {
                AudioSink.OooO00o oooO00o = this.f7434OooOOo;
                if (oooO00o != null) {
                    ((androidx.media3.exoplayer.audio.OooO.OooO0O0) oooO00o).OooO00o(e);
                }
                throw e;
            }
        } catch (AudioSink.InitializationException e2) {
            OooOO0 oooOO2 = this.f7439OooOo00;
            if (oooOO2.f7493OooO0oo > 1000000) {
                OooOO0 oooOO3 = new OooOO0(oooOO2.f7486OooO00o, oooOO2.f7487OooO0O0, oooOO2.f7488OooO0OO, oooOO2.f7489OooO0Oo, oooOO2.f7491OooO0o0, oooOO2.f7490OooO0o, oooOO2.f7492OooO0oO, DurationKt.NANOS_IN_MILLIS, oooOO2.f7485OooO, oooOO2.f7494OooOO0);
                try {
                    try {
                        audioTrackOooO00o = oooOO3.OooO00o(this.f7469OoooOoo, this.f7443OooOoO0, this.f7466OoooOOo);
                        this.f7439OooOo00 = oooOO3;
                    } catch (AudioSink.InitializationException e3) {
                        AudioSink.OooO00o oooO00o2 = this.f7434OooOOo;
                        if (oooO00o2 != null) {
                            ((androidx.media3.exoplayer.audio.OooO.OooO0O0) oooO00o2).OooO00o(e3);
                        }
                        throw e3;
                    }
                } catch (AudioSink.InitializationException e4) {
                    e2.addSuppressed(e4);
                    if (!(this.f7439OooOo00.f7488OooO0OO == 1)) {
                        throw e2;
                    }
                    this.f7472OooooO0 = true;
                    throw e2;
                }
            }
            if (!(this.f7439OooOo00.f7488OooO0OO == 1)) {
                throw e2;
            }
            this.f7472OooooO0 = true;
            throw e2;
        }
        this.f7440OooOo0O = audioTrackOooO00o;
        if (OooOooo(audioTrackOooO00o)) {
            AudioTrack audioTrack = this.f7440OooOo0O;
            if (this.f7431OooOOO0 == null) {
                this.f7431OooOOO0 = new OooOo00();
            }
            OooOo00 oooOo00 = this.f7431OooOOO0;
            Handler handler = oooOo00.f7504OooO00o;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new oo000o(handler), oooOo00.f7505OooO0O0);
            if (this.f7429OooOO0o != 3) {
                AudioTrack audioTrack2 = this.f7440OooOo0O;
                androidx.media3.common.OooOO0 oooOO4 = this.f7439OooOo00.f7486OooO00o;
                audioTrack2.setOffloadDelayPadding(oooOO4.f6433OooOooo, oooOO4.f6435Oooo000);
            }
        }
        int i = o000OO00.f34965OooO00o;
        if (i >= 31 && (o0Var = this.f7435OooOOo0) != null) {
            OooO0O0.OooO00o(this.f7440OooOo0O, o0Var);
        }
        this.f7466OoooOOo = this.f7440OooOo0O.getAudioSessionId();
        androidx.media3.exoplayer.audio.OooO0OO oooO0OO = this.f7418OooO;
        AudioTrack audioTrack3 = this.f7440OooOo0O;
        OooOO0 oooOO5 = this.f7439OooOo00;
        oooO0OO.OooO0o0(audioTrack3, oooOO5.f7488OooO0OO == 2, oooOO5.f7492OooO0oO, oooOO5.f7489OooO0Oo, oooOO5.f7493OooO0oo);
        Oooo0OO();
        int i2 = this.f7467OoooOo0.f33811OooO00o;
        if (i2 != 0) {
            this.f7440OooOo0O.attachAuxEffect(i2);
            this.f7440OooOo0O.setAuxEffectSendLevel(this.f7467OoooOo0.f33812OooO0O0);
        }
        OooO0OO oooO0OO2 = this.f7468OoooOoO;
        if (oooO0OO2 != null && i >= 23) {
            OooO00o.OooO00o(this.f7440OooOo0O, oooO0OO2);
        }
        this.f7457Oooo0o0 = true;
        return true;
    }

    public final long OooOoo0() {
        OooOO0 oooOO1 = this.f7439OooOo00;
        return oooOO1.f7488OooO0OO == 0 ? this.f7453Oooo00o / ((long) oooOO1.f7489OooO0Oo) : this.f7450Oooo0;
    }

    public final boolean OooOooO() {
        return this.f7440OooOo0O != null;
    }

    public final void Oooo0(androidx.media3.common.OooOOOO oooOOOO) {
        OooOOO0 oooOOO0 = new OooOOO0(oooOOOO, -9223372036854775807L, -9223372036854775807L);
        if (OooOooO()) {
            this.f7442OooOoO = oooOOO0;
        } else {
            this.f7444OooOoOO = oooOOO0;
        }
    }

    public final void Oooo000() {
        if (this.f7464OoooOO0) {
            return;
        }
        this.f7464OoooOO0 = true;
        long jOooOoo0 = OooOoo0();
        androidx.media3.exoplayer.audio.OooO0OO oooO0OO = this.f7418OooO;
        oooO0OO.f7562OooOoOO = oooO0OO.OooO0O0();
        oooO0OO.f7561OooOoO0 = SystemClock.elapsedRealtime() * 1000;
        oooO0OO.f7564OooOoo0 = jOooOoo0;
        this.f7440OooOo0O.stop();
        this.f7448OooOooo = 0;
    }

    public final void Oooo00O(long j) throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f7438OooOo0.OooO0Oo()) {
            ByteBuffer byteBuffer2 = this.f7459Oooo0oo;
            if (byteBuffer2 == null) {
                byteBuffer2 = AudioProcessor.f6735OooO00o;
            }
            Oooo0oO(byteBuffer2, j);
            return;
        }
        while (!this.f7438OooOo0.OooO0OO()) {
            do {
                androidx.media3.common.audio.OooO00o oooO00o = this.f7438OooOo0;
                if (oooO00o.OooO0Oo()) {
                    ByteBuffer[] byteBufferArr = oooO00o.f6743OooO0OO;
                    ByteBuffer byteBuffer3 = byteBufferArr[byteBufferArr.length - 1];
                    if (!byteBuffer3.hasRemaining()) {
                        oooO00o.OooO0o0(AudioProcessor.f6735OooO00o);
                    }
                    byteBuffer = byteBuffer3;
                } else {
                    byteBuffer = AudioProcessor.f6735OooO00o;
                }
                if (byteBuffer.hasRemaining()) {
                    Oooo0oO(byteBuffer, j);
                } else {
                    ByteBuffer byteBuffer4 = this.f7459Oooo0oo;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    androidx.media3.common.audio.OooO00o oooO00o2 = this.f7438OooOo0;
                    ByteBuffer byteBuffer5 = this.f7459Oooo0oo;
                    if (oooO00o2.OooO0Oo() && !oooO00o2.f6744OooO0Oo) {
                        oooO00o2.OooO0o0(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void Oooo00o() {
        this.f7451Oooo000 = 0L;
        this.f7452Oooo00O = 0L;
        this.f7453Oooo00o = 0L;
        this.f7450Oooo0 = 0L;
        this.f7473OooooOO = false;
        this.f7454Oooo0O0 = 0;
        this.f7444OooOoOO = new OooOOO0(this.f7446OooOoo0, 0L, 0L);
        this.f7456Oooo0o = 0L;
        this.f7442OooOoO = null;
        this.f7427OooOO0.clear();
        this.f7459Oooo0oo = null;
        this.f7449Oooo = 0;
        this.f7462OoooO00 = null;
        this.f7464OoooOO0 = false;
        this.f7460OoooO = false;
        this.f7447OooOooO = null;
        this.f7448OooOooo = 0;
        this.f7424OooO0o0.f34284OooOOOO = 0L;
        androidx.media3.common.audio.OooO00o oooO00o = this.f7439OooOo00.f7485OooO;
        this.f7438OooOo0 = oooO00o;
        oooO00o.OooO0O0();
    }

    @RequiresApi(23)
    public final void Oooo0O0() {
        if (OooOooO()) {
            try {
                this.f7440OooOo0O.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f7446OooOoo0.f6624OooO0Oo).setPitch(this.f7446OooOoo0.f6626OooO0o0).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                Log.OooO0oO("DefaultAudioSink", "Failed to set playback params", e);
            }
            androidx.media3.common.OooOOOO oooOOOO = new androidx.media3.common.OooOOOO(this.f7440OooOo0O.getPlaybackParams().getSpeed(), this.f7440OooOo0O.getPlaybackParams().getPitch());
            this.f7446OooOoo0 = oooOOOO;
            androidx.media3.exoplayer.audio.OooO0OO oooO0OO = this.f7418OooO;
            oooO0OO.f7545OooOO0 = oooOOOO.f6624OooO0Oo;
            o000O0Oo.OooOOO0 oooOOO0 = oooO0OO.f7541OooO0o;
            if (oooOOO0 != null) {
                oooOOO0.OooO00o();
            }
            oooO0OO.OooO0Oo();
        }
    }

    public final void Oooo0OO() {
        if (OooOooO()) {
            if (o000OO00.f34965OooO00o >= 21) {
                this.f7440OooOo0O.setVolume(this.f7458Oooo0oO);
                return;
            }
            AudioTrack audioTrack = this.f7440OooOo0O;
            float f = this.f7458Oooo0oO;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final boolean Oooo0o(androidx.media3.common.OooO00o oooO00o, androidx.media3.common.OooOO0 oooOO1) {
        int i;
        int iOooOOOo;
        int playbackOffloadSupport;
        int i2 = o000OO00.f34965OooO00o;
        if (i2 < 29 || (i = this.f7429OooOO0o) == 0) {
            return false;
        }
        String str = oooOO1.f6417OooOOOO;
        str.getClass();
        int iOooO0O0 = o000OO.OooO0O0(str, oooOO1.f6414OooOO0o);
        if (iOooO0O0 == 0 || (iOooOOOo = o000OO00.OooOOOo(oooOO1.f6431OooOoo0)) == 0) {
            return false;
        }
        AudioFormat audioFormatOooOoO = OooOoO(oooOO1.f6430OooOoo, iOooOOOo, iOooO0O0);
        AudioAttributes audioAttributes = oooO00o.OooO0OO().f6359OooO00o;
        if (i2 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatOooOoO, audioAttributes);
        } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatOooOoO, audioAttributes)) {
            playbackOffloadSupport = (i2 == 30 && o000OO00.f34968OooO0Oo.startsWith("Pixel")) ? 2 : 1;
        } else {
            playbackOffloadSupport = 0;
        }
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((oooOO1.f6433OooOooo != 0 || oooOO1.f6435Oooo000 != 0) && (i == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    public final boolean Oooo0o0() {
        OooOO0 oooOO1 = this.f7439OooOo00;
        return oooOO1 != null && oooOO1.f7494OooOO0 && o000OO00.f34965OooO00o >= 23;
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
            ByteBuffer byteBuffer2 = this.f7462OoooO00;
            if (byteBuffer2 != null) {
                p080o000OoO.o00O0O.OooO00o(byteBuffer2 == byteBuffer);
            } else {
                this.f7462OoooO00 = byteBuffer;
                if (o000OO00.f34965OooO00o < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f7461OoooO0;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f7461OoooO0 = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f7461OoooO0, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f7463OoooO0O = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i = o000OO00.f34965OooO00o;
            if (i < 21) {
                long j2 = this.f7453Oooo00o;
                androidx.media3.exoplayer.audio.OooO0OO oooO0OO = this.f7418OooO;
                int iOooO0O0 = oooO0OO.f7542OooO0o0 - ((int) (j2 - (oooO0OO.OooO0O0() * ((long) oooO0OO.f7540OooO0Oo))));
                if (iOooO0O0 > 0) {
                    iWrite = this.f7440OooOo0O.write(this.f7461OoooO0, this.f7463OoooO0O, Math.min(iRemaining2, iOooO0O0));
                    if (iWrite > 0) {
                        this.f7463OoooO0O += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (this.f7469OoooOoo) {
                p080o000OoO.o00O0O.OooO0Oo(j != -9223372036854775807L);
                if (j == Long.MIN_VALUE) {
                    j = this.f7470Ooooo00;
                } else {
                    this.f7470Ooooo00 = j;
                }
                AudioTrack audioTrack = this.f7440OooOo0O;
                if (i >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j * 1000);
                } else {
                    if (this.f7447OooOooO == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f7447OooOooO = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f7447OooOooO.putInt(1431633921);
                    }
                    if (this.f7448OooOooo == 0) {
                        this.f7447OooOooO.putInt(4, iRemaining2);
                        this.f7447OooOooO.putLong(8, j * 1000);
                        this.f7447OooOooO.position(0);
                        this.f7448OooOooo = iRemaining2;
                    }
                    int iRemaining3 = this.f7447OooOooO.remaining();
                    if (iRemaining3 <= 0) {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.f7448OooOooo = 0;
                        } else {
                            this.f7448OooOooo -= iWrite;
                        }
                    } else {
                        int iWrite2 = audioTrack.write(this.f7447OooOooO, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.f7448OooOooo = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.f7448OooOooo = 0;
                            } else {
                                this.f7448OooOooo -= iWrite;
                            }
                        }
                    }
                }
            } else {
                iWrite = this.f7440OooOo0O.write(byteBuffer, iRemaining2, 1);
            }
            this.f7471Ooooo0o = SystemClock.elapsedRealtime();
            OooOOO<AudioSink.WriteException> oooOOO = this.f7432OooOOOO;
            if (iWrite < 0) {
                AudioSink.WriteException writeException = new AudioSink.WriteException(iWrite, this.f7439OooOo00.f7486OooO00o, ((i >= 24 && iWrite == -6) || iWrite == -32) && this.f7450Oooo0 > 0);
                AudioSink.OooO00o oooO00o3 = this.f7434OooOOo;
                if (oooO00o3 != null) {
                    ((androidx.media3.exoplayer.audio.OooO.OooO0O0) oooO00o3).OooO00o(writeException);
                }
                if (writeException.f7414OooO0o0) {
                    this.f7441OooOo0o = o000O0Oo.OooO00o.f34236OooO0OO;
                    throw writeException;
                }
                oooOOO.OooO00o(writeException);
                return;
            }
            oooOOO.f7498OooO00o = null;
            if (OooOooo(this.f7440OooOo0O)) {
                if (this.f7450Oooo0 > 0) {
                    this.f7473OooooOO = false;
                }
                if (this.f7475o000oOoO && (oooO00o = this.f7434OooOOo) != null && iWrite < iRemaining2 && !this.f7473OooooOO && (oooO00o2 = androidx.media3.exoplayer.audio.OooO.this.f7515o0000O0) != null) {
                    oooO00o2.OooO00o();
                }
            }
            int i2 = this.f7439OooOo00.f7488OooO0OO;
            if (i2 == 0) {
                this.f7453Oooo00o += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i2 != 0) {
                    p080o000OoO.o00O0O.OooO0Oo(byteBuffer == this.f7459Oooo0oo);
                    this.f7450Oooo0 = (((long) this.f7454Oooo0O0) * ((long) this.f7449Oooo)) + this.f7450Oooo0;
                }
                this.f7462OoooO00 = null;
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void flush() {
        if (OooOooO()) {
            Oooo00o();
            AudioTrack audioTrack = this.f7418OooO.f7539OooO0OO;
            audioTrack.getClass();
            int i = 0;
            if (audioTrack.getPlayState() == 3) {
                this.f7440OooOo0O.pause();
            }
            if (OooOooo(this.f7440OooOo0O)) {
                OooOo00 oooOo00 = this.f7431OooOOO0;
                oooOo00.getClass();
                this.f7440OooOo0O.unregisterStreamEventCallback(oooOo00.f7505OooO0O0);
                oooOo00.f7504OooO00o.removeCallbacksAndMessages(null);
            }
            if (o000OO00.f34965OooO00o < 21 && !this.f7465OoooOOO) {
                this.f7466OoooOOo = 0;
            }
            OooOO0 oooOO1 = this.f7436OooOOoo;
            if (oooOO1 != null) {
                this.f7439OooOo00 = oooOO1;
                this.f7436OooOOoo = null;
            }
            androidx.media3.exoplayer.audio.OooO0OO oooO0OO = this.f7418OooO;
            oooO0OO.OooO0Oo();
            oooO0OO.f7539OooO0OO = null;
            oooO0OO.f7541OooO0o = null;
            AudioTrack audioTrack2 = this.f7440OooOo0O;
            o0OO00O o0oo00o2 = this.f7426OooO0oo;
            o0oo00o2.OooO0O0();
            synchronized (f7416Oooooo0) {
                try {
                    if (f7415Oooooo == null) {
                        f7415Oooooo = Executors.newSingleThreadExecutor(new o000O("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f7417OoooooO++;
                    f7415Oooooo.execute(new OooOo(i, audioTrack2, o0oo00o2));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f7440OooOo0O = null;
        }
        this.f7432OooOOOO.f7498OooO00o = null;
        this.f7430OooOOO.f7498OooO00o = null;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void pause() {
        boolean z = false;
        this.f7475o000oOoO = false;
        if (OooOooO()) {
            androidx.media3.exoplayer.audio.OooO0OO oooO0OO = this.f7418OooO;
            oooO0OO.OooO0Oo();
            if (oooO0OO.f7561OooOoO0 == -9223372036854775807L) {
                o000O0Oo.OooOOO0 oooOOO0 = oooO0OO.f7541OooO0o;
                oooOOO0.getClass();
                oooOOO0.OooO00o();
                z = true;
            }
            if (z) {
                this.f7440OooOo0O.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void release() {
        androidx.media3.exoplayer.audio.OooO00o.OooO0O0 oooO0O0;
        androidx.media3.exoplayer.audio.OooO00o oooO00o = this.f7437OooOo;
        if (oooO00o == null || !oooO00o.f7528OooO0oo) {
            return;
        }
        oooO00o.f7527OooO0oO = null;
        int i = o000OO00.f34965OooO00o;
        Context context = oooO00o.f7521OooO00o;
        if (i >= 23 && (oooO0O0 = oooO00o.f7524OooO0Oo) != null) {
            androidx.media3.exoplayer.audio.OooO00o.C0146OooO00o.OooO0O0(context, oooO0O0);
        }
        androidx.media3.exoplayer.audio.OooO00o.OooO0o oooO0o = oooO00o.f7526OooO0o0;
        if (oooO0o != null) {
            context.unregisterReceiver(oooO0o);
        }
        androidx.media3.exoplayer.audio.OooO00o.OooO0OO oooO0OO = oooO00o.f7525OooO0o;
        if (oooO0OO != null) {
            oooO0OO.f7530OooO00o.unregisterContentObserver(oooO0OO);
        }
        oooO00o.f7528OooO0oo = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void reset() {
        flush();
        ImmutableList.OooO0O0 oooO0O0ListIterator = this.f7423OooO0o.listIterator(0);
        while (oooO0O0ListIterator.hasNext()) {
            ((AudioProcessor) oooO0O0ListIterator.next()).reset();
        }
        ImmutableList.OooO0O0 oooO0O0ListIterator2 = this.f7425OooO0oO.listIterator(0);
        while (oooO0O0ListIterator2.hasNext()) {
            ((AudioProcessor) oooO0O0ListIterator2.next()).reset();
        }
        androidx.media3.common.audio.OooO00o oooO00o = this.f7438OooOo0;
        if (oooO00o != null) {
            oooO00o.OooO0o();
        }
        this.f7475o000oOoO = false;
        this.f7472OooooO0 = false;
    }
}

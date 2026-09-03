package androidx.camera.video.internal.audio;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.core.impl.oo00o;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.internal.BufferProvider;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOOO0;
import p030OoooO.OooOo;
import p033OoooO0O.o0O0O00;
import p042OooooO0.o00O00o0;
import p042OooooO0.oOO00O;
import p045Oooooo.o000OO0O;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f4039OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0O00 f4040OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final androidx.camera.video.internal.audio.OooO0o f4043OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f4044OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final androidx.camera.video.internal.audio.OooO f4045OooO0o0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Executor f4048OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public OooO0o f4049OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public BufferProvider<? extends o000OO0O> f4050OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public C0018OooO00o f4051OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f4052OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f4053OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f4054OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f4055OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f4056OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public byte[] f4057OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public double f4059OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int f4060OooOo0O;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicReference<Boolean> f4041OooO0O0 = new AtomicReference<>(null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AtomicBoolean f4042OooO0OO = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public OooOO0 f4046OooO0oO = OooOO0.CONFIGURED;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public BufferProvider.State f4047OooO0oo = BufferProvider.State.INACTIVE;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f4058OooOo0 = 0;

    public class OooO implements AudioStream.OooO00o {
        public OooO() {
        }
    }

    /* JADX INFO: renamed from: androidx.camera.video.internal.audio.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0018OooO00o implements oo00o.OooO00o<BufferProvider.State> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ BufferProvider f4062OooO00o;

        public C0018OooO00o(BufferProvider bufferProvider) {
            this.f4062OooO00o = bufferProvider;
        }

        @Override // androidx.camera.core.impl.oo00o.OooO00o
        public final void OooO00o(@Nullable BufferProvider.State state) {
            BufferProvider.State state2 = state;
            Objects.requireNonNull(state2);
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.f4050OooOO0o == this.f4062OooO00o) {
                o00O0O0.OooO00o("AudioSource", "Receive BufferProvider state change: " + oooO00o.f4047OooO0oo + " to " + state2);
                if (oooO00o.f4047OooO0oo != state2) {
                    oooO00o.f4047OooO0oo = state2;
                    oooO00o.OooO0o0();
                }
            }
        }

        @Override // androidx.camera.core.impl.oo00o.OooO00o
        public final void onError(@NonNull Throwable th) {
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.f4050OooOO0o == this.f4062OooO00o) {
                Executor executor = oooO00o.f4048OooOO0;
                OooO0o oooO0o = oooO00o.f4049OooOO0O;
                if (executor == null || oooO0o == null) {
                    return;
                }
                executor.execute(new o00O00o0(0, oooO0o, th));
            }
        }
    }

    public class OooO0O0 implements OooOOO0<o000OO0O> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ BufferProvider f4064OooO00o;

        public OooO0O0(BufferProvider bufferProvider) {
            this.f4064OooO00o = bufferProvider;
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.f4050OooOO0o != this.f4064OooO00o) {
                return;
            }
            o00O0O0.OooO00o("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
            if (th instanceof IllegalStateException) {
                return;
            }
            Executor executor = oooO00o.f4048OooOO0;
            OooO0o oooO0o = oooO00o.f4049OooOO0O;
            if (executor == null || oooO0o == null) {
                return;
            }
            executor.execute(new o00O00o0(0, oooO0o, th));
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(o000OO0O o000oo0o2) {
            o000OO0O o000oo0o3 = o000oo0o2;
            final OooO00o oooO00o = OooO00o.this;
            if (!oooO00o.f4039OooO || oooO00o.f4050OooOO0o != this.f4064OooO00o) {
                o000oo0o3.cancel();
                return;
            }
            boolean z = oooO00o.f4053OooOOOO;
            AudioStream audioStream = oooO00o.f4045OooO0o0;
            androidx.camera.video.internal.audio.OooO0o oooO0o = oooO00o.f4043OooO0Oo;
            if (z) {
                o000OO.OooOOO0.OooO0o(null, oooO00o.f4054OooOOOo > 0);
                if (System.nanoTime() - oooO00o.f4054OooOOOo >= oooO00o.f4044OooO0o) {
                    o000OO.OooOOO0.OooO0o(null, oooO00o.f4053OooOOOO);
                    try {
                        oooO0o.start();
                        o00O0O0.OooO00o("AudioSource", "Retry start AudioStream succeed");
                        audioStream.stop();
                        oooO00o.f4053OooOOOO = false;
                    } catch (AudioStream.AudioStreamException e) {
                        o00O0O0.OooO("AudioSource", "Retry start AudioStream failed", e);
                        oooO00o.f4054OooOOOo = System.nanoTime();
                    }
                }
            }
            if (!oooO00o.f4053OooOOOO) {
                audioStream = oooO0o;
            }
            ByteBuffer byteBufferOooO0o = o000oo0o3.OooO0o();
            androidx.camera.video.internal.audio.OooO0OO oooO0OO = audioStream.read(byteBufferOooO0o);
            int i = oooO0OO.f4079OooO00o;
            if (i > 0) {
                if (oooO00o.f4055OooOOo) {
                    byte[] bArr = oooO00o.f4057OooOOoo;
                    if (bArr == null || bArr.length < i) {
                        oooO00o.f4057OooOOoo = new byte[i];
                    }
                    int iPosition = byteBufferOooO0o.position();
                    byteBufferOooO0o.put(oooO00o.f4057OooOOoo, 0, i);
                    byteBufferOooO0o.limit(byteBufferOooO0o.position()).position(iPosition);
                }
                Executor executor = oooO00o.f4048OooOO0;
                long j = oooO0OO.f4080OooO0O0;
                if (executor != null && j - oooO00o.f4058OooOo0 >= 200) {
                    oooO00o.f4058OooOo0 = j;
                    final OooO0o oooO0o2 = oooO00o.f4049OooOO0O;
                    if (oooO00o.f4060OooOo0O == 2) {
                        ShortBuffer shortBufferAsShortBuffer = byteBufferOooO0o.asShortBuffer();
                        double dMax = 0.0d;
                        while (shortBufferAsShortBuffer.hasRemaining()) {
                            dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
                        }
                        oooO00o.f4059OooOo00 = dMax / 32767.0d;
                        if (executor != null && oooO0o2 != null) {
                            executor.execute(new Runnable() { // from class: OooooO0.oo0o0O0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    OooOO0O.this.f3969OoooOoo = oooO00o.f4059OooOo00;
                                }
                            });
                        }
                    }
                }
                byteBufferOooO0o.limit(oooO0OO.f4079OooO00o + byteBufferOooO0o.position());
                o000oo0o3.OooO0O0(TimeUnit.NANOSECONDS.toMicros(j));
                o000oo0o3.OooO00o();
            } else {
                o00O0O0.OooO0oo("AudioSource", "Unable to read data from AudioRecord.");
                o000oo0o3.cancel();
            }
            BufferProvider<? extends o000OO0O> bufferProvider = oooO00o.f4050OooOO0o;
            Objects.requireNonNull(bufferProvider);
            o000Oo0.OooO0o oooO0oOooO0Oo = bufferProvider.OooO0Oo();
            OooO0O0 oooO0O0 = oooO00o.f4052OooOOO0;
            Objects.requireNonNull(oooO0O0);
            oooO0oOooO0Oo.OooO0oo(new OooOo.OooO0O0(oooO0oOooO0Oo, oooO0O0), oooO00o.f4040OooO00o);
        }
    }

    public static /* synthetic */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f4066OooO00o;

        static {
            int[] iArr = new int[OooOO0.values().length];
            f4066OooO00o = iArr;
            try {
                iArr[OooOO0.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4066OooO00o[OooOO0.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4066OooO00o[OooOO0.RELEASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface OooO0o {
    }

    public enum OooOO0 {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public OooO00o(@NonNull oOO00O ooo00o, @NonNull o0O0O00 o0o0o00, @Nullable Context context) throws AudioSourceAccessException {
        o0O0O00 o0o0o01 = new o0O0O00(o0o0o00);
        this.f4040OooO00o = o0o0o01;
        this.f4044OooO0o = TimeUnit.MILLISECONDS.toNanos(3000L);
        try {
            androidx.camera.video.internal.audio.OooO0o oooO0o = new androidx.camera.video.internal.audio.OooO0o(new androidx.camera.video.internal.audio.OooO0O0(ooo00o, context), ooo00o);
            this.f4043OooO0Oo = oooO0o;
            oooO0o.OooO00o(new OooO(), o0o0o01);
            this.f4045OooO0o0 = new androidx.camera.video.internal.audio.OooO(ooo00o);
            this.f4060OooOo0O = ooo00o.OooO00o();
        } catch (AudioStream.AudioStreamException | IllegalArgumentException e) {
            throw new AudioSourceAccessException(e);
        }
    }

    public final void OooO00o() {
        Executor executor = this.f4048OooOO0;
        final OooO0o oooO0o = this.f4049OooOO0O;
        if (executor == null || oooO0o == null) {
            return;
        }
        final boolean z = this.f4055OooOOo || this.f4053OooOOOO || this.f4056OooOOo0;
        if (Objects.equals(this.f4041OooO0O0.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executor.execute(new Runnable() { // from class: OooooO0.o00O0OO
            @Override // java.lang.Runnable
            public final void run() {
                OooOO0O oooOO0O = OooOO0O.this;
                boolean z2 = oooOO0O.f3964OoooOO0;
                boolean z3 = z;
                if (z2 != z3) {
                    oooOO0O.f3964OoooOO0 = z3;
                    oooOO0O.Oooo00o();
                } else {
                    o00O0O0.OooO0oo("Recorder", "Audio source silenced transitions to the same state " + z3);
                }
            }
        });
    }

    public final void OooO0O0(@Nullable BufferProvider<? extends o000OO0O> bufferProvider) {
        BufferProvider<? extends o000OO0O> bufferProvider2 = this.f4050OooOO0o;
        BufferProvider.State state = null;
        if (bufferProvider2 != null) {
            C0018OooO00o c0018OooO00o = this.f4051OooOOO;
            Objects.requireNonNull(c0018OooO00o);
            bufferProvider2.OooO0OO(c0018OooO00o);
            this.f4050OooOO0o = null;
            this.f4051OooOOO = null;
            this.f4052OooOOO0 = null;
            this.f4047OooO0oo = BufferProvider.State.INACTIVE;
            OooO0o0();
        }
        if (bufferProvider != null) {
            this.f4050OooOO0o = bufferProvider;
            this.f4051OooOOO = new C0018OooO00o(bufferProvider);
            this.f4052OooOOO0 = new OooO0O0(bufferProvider);
            try {
                com.google.common.util.concurrent.OooOO0O<? extends o000OO0O> oooOO0OOooO0O0 = bufferProvider.OooO0O0();
                if (oooOO0OOooO0O0.isDone()) {
                    state = (BufferProvider.State) oooOO0OOooO0O0.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (state != null) {
                this.f4047OooO0oo = state;
                OooO0o0();
            }
            this.f4050OooOO0o.OooO00o(this.f4051OooOOO, this.f4040OooO00o);
        }
    }

    public final void OooO0OO(OooOO0 oooOO1) {
        o00O0O0.OooO00o("AudioSource", "Transitioning internal state: " + this.f4046OooO0oO + " --> " + oooOO1);
        this.f4046OooO0oO = oooOO1;
    }

    public final void OooO0Oo() {
        if (this.f4039OooO) {
            this.f4039OooO = false;
            o00O0O0.OooO00o("AudioSource", "stopSendingAudio");
            this.f4043OooO0Oo.stop();
        }
    }

    public final void OooO0o0() {
        if (this.f4046OooO0oO != OooOO0.STARTED) {
            OooO0Oo();
            return;
        }
        boolean z = this.f4047OooO0oo == BufferProvider.State.ACTIVE;
        final boolean z2 = !z;
        Executor executor = this.f4048OooOO0;
        final OooO0o oooO0o = this.f4049OooOO0O;
        if (executor != null && oooO0o != null && this.f4042OooO0OO.getAndSet(z2) != z2) {
            executor.execute(new Runnable(z2) { // from class: OooooO0.o00O0O0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1768OooO0Oo.getClass();
                }
            });
        }
        if (!z) {
            OooO0Oo();
            return;
        }
        if (this.f4039OooO) {
            return;
        }
        try {
            o00O0O0.OooO00o("AudioSource", "startSendingAudio");
            this.f4043OooO0Oo.start();
            this.f4053OooOOOO = false;
        } catch (AudioStream.AudioStreamException e) {
            o00O0O0.OooO("AudioSource", "Failed to start AudioStream", e);
            this.f4053OooOOOO = true;
            this.f4045OooO0o0.start();
            this.f4054OooOOOo = System.nanoTime();
            OooO00o();
        }
        this.f4039OooO = true;
        BufferProvider<? extends o000OO0O> bufferProvider = this.f4050OooOO0o;
        Objects.requireNonNull(bufferProvider);
        o000Oo0.OooO0o oooO0oOooO0Oo = bufferProvider.OooO0Oo();
        OooO0O0 oooO0O0 = this.f4052OooOOO0;
        Objects.requireNonNull(oooO0O0);
        oooO0oOooO0Oo.OooO0oo(new OooOo.OooO0O0(oooO0oOooO0Oo, oooO0O0), this.f4040OooO00o);
    }
}

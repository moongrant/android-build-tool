package androidx.camera.video.internal.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.audio.OooO00o;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o000OO.OooOOO0;
import p028Oooo0oO.o00O0O0;
import p042OooooO0.o00OO000;
import p042OooooO0.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO implements AudioStream {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicBoolean f4031OooO00o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicBoolean f4032OooO0O0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f4033OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f4034OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f4035OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public byte[] f4036OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public AudioStream.OooO00o f4037OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Executor f4038OooO0oo;

    public OooO(@NonNull oOO00O ooo00o) {
        this.f4033OooO0OO = ooo00o.OooO0OO();
        this.f4034OooO0Oo = ooo00o.OooO0o0();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void OooO00o(@Nullable AudioStream.OooO00o oooO00o, @Nullable Executor executor) {
        boolean z = true;
        OooOOO0.OooO0o("AudioStream can not be started when setCallback.", !this.f4031OooO00o.get());
        OooO0O0();
        if (oooO00o != null && executor == null) {
            z = false;
        }
        OooOOO0.OooO0O0(z, "executor can't be null with non-null callback.");
        this.f4037OooO0oO = oooO00o;
        this.f4038OooO0oo = executor;
    }

    public final void OooO0O0() {
        OooOOO0.OooO0o("AudioStream has been released.", !this.f4032OooO0O0.get());
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public final OooO0OO read(@NonNull ByteBuffer byteBuffer) {
        OooO0O0();
        OooOOO0.OooO0o("AudioStream has not been started.", this.f4031OooO00o.get());
        long jRemaining = byteBuffer.remaining();
        int i = this.f4033OooO0OO;
        long jOooO0O0 = o00OO000.OooO0O0(i, jRemaining);
        long j = i;
        OooOOO0.OooO0O0(j > 0, "bytesPerFrame must be greater than 0.");
        int i2 = (int) (j * jOooO0O0);
        if (i2 <= 0) {
            return new OooO0OO(0, this.f4035OooO0o);
        }
        long jOooO00o = this.f4035OooO0o + o00OO000.OooO00o(this.f4034OooO0Oo, jOooO0O0);
        long jNanoTime = jOooO00o - System.nanoTime();
        if (jNanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
            } catch (InterruptedException e) {
                o00O0O0.OooO("SilentAudioStream", "Ignore interruption", e);
            }
        }
        OooOOO0.OooO0o(null, i2 <= byteBuffer.remaining());
        byte[] bArr = this.f4036OooO0o0;
        if (bArr == null || bArr.length < i2) {
            this.f4036OooO0o0 = new byte[i2];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put(this.f4036OooO0o0, 0, i2).limit(i2 + iPosition).position(iPosition);
        OooO0OO oooO0OO = new OooO0OO(i2, this.f4035OooO0o);
        this.f4035OooO0o = jOooO00o;
        return oooO0OO;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void release() {
        this.f4032OooO0O0.getAndSet(true);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void start() {
        OooO0O0();
        if (this.f4031OooO00o.getAndSet(true)) {
            return;
        }
        this.f4035OooO0o = System.nanoTime();
        final AudioStream.OooO00o oooO00o = this.f4037OooO0oO;
        Executor executor = this.f4038OooO0oo;
        if (oooO00o == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: OooooO0.o00OOO0O
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o2 = OooO00o.this;
                oooO00o2.f4056OooOOo0 = true;
                if (oooO00o2.f4046OooO0oO == OooO00o.OooOO0.STARTED) {
                    oooO00o2.OooO00o();
                }
            }
        });
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void stop() {
        OooO0O0();
        this.f4031OooO00o.set(false);
    }
}

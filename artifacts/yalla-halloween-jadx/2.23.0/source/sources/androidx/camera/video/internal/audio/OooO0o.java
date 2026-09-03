package androidx.camera.video.internal.audio;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.o0000O0;
import androidx.camera.video.internal.audio.OooO0o;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000OO.OooOOO0;
import p028Oooo0oO.o00O0O0;
import p028Oooo0oO.o00O0OO;
import p028Oooo0oO.o00O0OOO;
import p033OoooO0O.o0O0O00;
import p033OoooO0O.oo000o;
import p042OooooO0.o00O00o0;
import p042OooooO0.o00OO0O0;
import p042OooooO0.o00OOO0;
import p042OooooO0.o00OOO00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO0o implements AudioStream {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f4081OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicBoolean f4082OooO00o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicBoolean f4083OooO0O0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public final ConcurrentLinkedQueue f4084OooO0OO = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0O00 f4085OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public OooO00o f4086OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f4087OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AudioStream f4088OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f4089OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f4090OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicBoolean f4091OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f4092OooOO0o;

    @RequiresApi(21)
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f4093OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f4094OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ByteBuffer f4095OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f4096OooO0Oo;

        public OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull AudioStream.OooO0O0 oooO0O0, int i, int i2) {
            byteBuffer.rewind();
            int iLimit = byteBuffer.limit() - byteBuffer.position();
            if (iLimit != oooO0O0.OooO00o()) {
                StringBuilder sbOooO00o = o0000O0.OooO00o("Byte buffer size is not match with packet info: ", iLimit, " != ");
                sbOooO00o.append(oooO0O0.OooO00o());
                throw new IllegalStateException(sbOooO00o.toString());
            }
            this.f4093OooO00o = i;
            this.f4094OooO0O0 = i2;
            this.f4095OooO0OO = byteBuffer;
            this.f4096OooO0Oo = oooO0O0.OooO0O0();
        }

        public final OooO0OO OooO00o(@NonNull ByteBuffer byteBuffer) {
            int iRemaining;
            long j = this.f4096OooO0Oo;
            ByteBuffer byteBuffer2 = this.f4095OooO0OO;
            int iPosition = byteBuffer2.position();
            int iPosition2 = byteBuffer.position();
            if (byteBuffer2.remaining() > byteBuffer.remaining()) {
                iRemaining = byteBuffer.remaining();
                this.f4096OooO0Oo += o00OO0O0.OooO00o(this.f4094OooO0O0, o00OO0O0.OooO0O0(this.f4093OooO00o, iRemaining));
                ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
                byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
            } else {
                iRemaining = byteBuffer2.remaining();
                byteBuffer.put(byteBuffer2).limit(iPosition2 + iRemaining).position(iPosition2);
            }
            byteBuffer2.position(iPosition + iRemaining);
            return new OooO0OO(iRemaining, j);
        }
    }

    public OooO0o(@NonNull OooO0O0 oooO0O0, @NonNull o00O00o0 o00o00o1) {
        oo000o oo000oVar;
        if (oo000o.f1443OooO0o0 != null) {
            oo000oVar = oo000o.f1443OooO0o0;
        } else {
            synchronized (oo000o.class) {
                try {
                    if (oo000o.f1443OooO0o0 == null) {
                        oo000o.f1443OooO0o0 = new oo000o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oo000oVar = oo000o.f1443OooO0o0;
        }
        this.f4085OooO0Oo = new o0O0O00(oo000oVar);
        this.f4087OooO0o0 = new Object();
        this.f4086OooO0o = null;
        this.f4091OooOO0O = new AtomicBoolean(false);
        this.f4088OooO0oO = oooO0O0;
        int iOooO0OO = o00o00o1.OooO0OO();
        this.f4089OooO0oo = iOooO0OO;
        int iOooO0o0 = o00o00o1.OooO0o0();
        this.f4081OooO = iOooO0o0;
        OooOOO0.OooO0O0(((long) iOooO0OO) > 0, "mBytesPerFrame must be greater than 0.");
        OooOOO0.OooO0O0(((long) iOooO0o0) > 0, "mSampleRate must be greater than 0.");
        this.f4090OooOO0 = 500;
        this.f4092OooOO0o = iOooO0OO * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void OooO00o(@Nullable final AudioStream.OooO00o oooO00o, @Nullable final Executor executor) {
        boolean z = true;
        OooOOO0.OooO0o("AudioStream can not be started when setCallback.", !this.f4082OooO00o.get());
        OooO0O0();
        if (oooO00o != null && executor == null) {
            z = false;
        }
        OooOOO0.OooO0O0(z, "executor can't be null with non-null callback.");
        this.f4085OooO0Oo.execute(new Runnable() { // from class: OooooO0.oo0O
            @Override // java.lang.Runnable
            public final void run() {
                this.f1810OooO0Oo.f4088OooO0oO.OooO00o(oooO00o, executor);
            }
        });
    }

    public final void OooO0O0() {
        OooOOO0.OooO0o("AudioStream has been released.", !this.f4083OooO0O0.get());
    }

    public final void OooO0OO() {
        if (this.f4091OooOO0O.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f4092OooOO0o);
            OooO00o oooO00o = new OooO00o(byteBufferAllocateDirect, this.f4088OooO0oO.read(byteBufferAllocateDirect), this.f4089OooO0oo, this.f4081OooO);
            int i = this.f4090OooOO0;
            synchronized (this.f4087OooO0o0) {
                this.f4084OooO0OO.offer(oooO00o);
                while (this.f4084OooO0OO.size() > i) {
                    this.f4084OooO0OO.poll();
                    o00O0O0.OooO0oo("BufferedAudioStream", "Drop audio data due to full of queue.");
                }
            }
            if (this.f4091OooOO0O.get()) {
                this.f4085OooO0Oo.execute(new o00OOO0(this, 0));
            }
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public final OooO0OO read(@NonNull ByteBuffer byteBuffer) {
        OooO0O0();
        OooOOO0.OooO0o("AudioStream has not been started.", this.f4082OooO00o.get());
        final int iRemaining = byteBuffer.remaining();
        this.f4085OooO0Oo.execute(new Runnable() { // from class: OooooO0.o00OO
            @Override // java.lang.Runnable
            public final void run() {
                OooO0o oooO0o = this.f1790OooO0Oo;
                int i = oooO0o.f4092OooOO0o;
                int i2 = iRemaining;
                if (i == i2) {
                    return;
                }
                int i3 = oooO0o.f4089OooO0oo;
                oooO0o.f4092OooOO0o = (i2 / i3) * i3;
                StringBuilder sbOooO00o = o0000O0.OooO00o("Update buffer size from ", i, " to ");
                sbOooO00o.append(oooO0o.f4092OooOO0o);
                o00O0O0.OooO00o("BufferedAudioStream", sbOooO00o.toString());
            }
        });
        OooO0OO oooO0OO = new OooO0OO(0, 0L);
        synchronized (this.f4087OooO0o0) {
            OooO00o oooO00o = this.f4086OooO0o;
            this.f4086OooO0o = null;
            if (oooO00o == null) {
                oooO00o = (OooO00o) this.f4084OooO0OO.poll();
            }
            if (oooO00o != null) {
                oooO0OO = oooO00o.OooO00o(byteBuffer);
                if (oooO00o.f4095OooO0OO.remaining() > 0) {
                    this.f4086OooO0o = oooO00o;
                }
            } else {
                o00O0O0.OooO00o("BufferedAudioStream", "No data to read.");
            }
        }
        return oooO0OO;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void release() {
        int i = 1;
        if (this.f4083OooO0O0.getAndSet(true)) {
            return;
        }
        this.f4085OooO0Oo.execute(new o00O0OOO(this, i));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void start() throws IllegalStateException, AudioStream.AudioStreamException {
        OooO0O0();
        AtomicBoolean atomicBoolean = this.f4082OooO00o;
        int i = 1;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new o00O0OO(this, i), null);
        this.f4085OooO0Oo.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            atomicBoolean.set(false);
            throw new AudioStream.AudioStreamException(e);
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void stop() throws IllegalStateException {
        OooO0O0();
        int i = 0;
        if (this.f4082OooO00o.getAndSet(false)) {
            this.f4085OooO0Oo.execute(new o00OOO00(this, i));
        }
    }
}

package p045Oooooo;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.o00oOoo;
import androidx.camera.core.impl.o0O0ooO;
import androidx.camera.core.impl.oo00o;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.google.common.util.concurrent.OooOO0O;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import p022Oooo00O.o000O00;
import p022Oooo00O.o000O00O;
import p022Oooo00O.o00OOOO0;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOOO0;
import p030OoooO.OooOo;
import p030OoooO.o000oOoO;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0O0O00;
import p039OoooOoo.o0OoO00O;
import p041Ooooo0o.o00000O0;
import p044OooooOo.o0O0OO0;
import p044OooooOo.o0O0OOOo;
import p044OooooOo.o0O0oo0o;
import p044OooooOo.o0OO00o0;
import p044OooooOo.oo0OOoo;
import p048Ooooooo.o0OO0oO0;
import p048Ooooooo.o0OOooO0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0000Ooo implements o00O0O {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final Range<Long> f1885OooOooO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOO0O<Void> f1886OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f1887OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f1889OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final MediaFormat f1890OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O0O.OooO0O0 f1891OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final MediaCodec f1892OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000O0Oo f1893OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0O0O00 f1894OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000Oo0.OooO00o<Void> f1895OooOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Timebase f1901OooOOOo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooO0o f1907OooOo00;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f1888OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayDeque f1896OooOO0O = new ArrayDeque();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayDeque f1897OooOO0o = new ArrayDeque();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final HashSet f1899OooOOO0 = new HashSet();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final HashSet f1898OooOOO = new HashSet();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ArrayDeque f1900OooOOOO = new ArrayDeque();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o000OO00 f1903OooOOo0 = new o000OO00();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @GuardedBy("mLock")
    public o00Oo0 f1902OooOOo = o00Oo0.f1971OooO00o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @GuardedBy("mLock")
    public Executor f1904OooOOoo = o00oO0o.OooO00o();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public Range<Long> f1906OooOo0 = f1885OooOooO;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f1908OooOo0O = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f1909OooOo0o = false;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Long f1905OooOo = null;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ScheduledFuture f1911OooOoO0 = null;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO f1910OooOoO = null;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f1912OooOoOO = false;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f1914OooOoo0 = false;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f1913OooOoo = false;

    @RequiresApi(21)
    public class OooO extends MediaCodec.Callback {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final /* synthetic */ int f1915OooOO0O = 0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final o0OO0oO0 f1917OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f1918OooO0O0 = false;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f1919OooO0OO = false;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f1920OooO0Oo = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f1922OooO0o0 = 0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f1921OooO0o = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f1923OooO0oO = false;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f1924OooO0oo = false;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f1916OooO = false;

        public class OooO00o implements OooOOO0<Void> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ o0OoOo0 f1926OooO00o;

            public OooO00o(o0OoOo0 o0oooo1) {
                this.f1926OooO00o = o0oooo1;
            }

            @Override // p030OoooO.OooOOO0
            public final void OooO00o(@NonNull Throwable th) {
                OooO oooO = OooO.this;
                o0000Ooo.this.f1898OooOOO.remove(this.f1926OooO00o);
                boolean z = th instanceof MediaCodec.CodecException;
                o0000Ooo o0000ooo = o0000Ooo.this;
                if (!z) {
                    o0000ooo.OooO0OO(th, 0, th.getMessage());
                    return;
                }
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                o0000ooo.getClass();
                o0000ooo.OooO0OO(codecException, 1, codecException.getMessage());
            }

            @Override // p030OoooO.OooOOO0
            public final void onSuccess(@Nullable Void r2) {
                o0000Ooo.this.f1898OooOOO.remove(this.f1926OooO00o);
            }
        }

        public OooO() {
            if (o0000Ooo.this.f1889OooO0OO) {
                this.f1917OooO00o = new o0OO0oO0(o0000Ooo.this.f1903OooOOo0, o0O0OOOo.OooO00o(o0O0OO0.class) == null ? o0000Ooo.this.f1901OooOOOo : null);
            } else {
                this.f1917OooO00o = null;
            }
        }

        public final boolean OooO00o(@NonNull MediaCodec.BufferInfo bufferInfo) {
            boolean z;
            Executor executor;
            o00Oo0 o00oo1;
            long j;
            long j2;
            if (this.f1920OooO0Oo) {
                o00O0O0.OooO00o(o0000Ooo.this.f1887OooO00o, "Drop buffer by already reach end of stream.");
                return false;
            }
            if (bufferInfo.size <= 0) {
                o00O0O0.OooO00o(o0000Ooo.this.f1887OooO00o, "Drop buffer by invalid buffer size.");
                return false;
            }
            if ((bufferInfo.flags & 2) != 0) {
                o00O0O0.OooO00o(o0000Ooo.this.f1887OooO00o, "Drop buffer by codec config.");
                return false;
            }
            o0OO0oO0 o0oo0oo1 = this.f1917OooO00o;
            if (o0oo0oo1 != null) {
                long j3 = bufferInfo.presentationTimeUs;
                Timebase timebase = o0oo0oo1.f2053OooO0OO;
                o000OO00 o000oo01 = o0oo0oo1.f2051OooO00o;
                if (timebase == null) {
                    o000oo01.getClass();
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    if (Math.abs(j3 - timeUnit.toMicros(SystemClock.elapsedRealtimeNanos())) < Math.abs(j3 - timeUnit.toMicros(System.nanoTime()))) {
                        o00O0O0.OooO0oo("VideoTimebaseConverter", "Detected video buffer timestamp is close to realtime.");
                        o0oo0oo1.f2053OooO0OO = Timebase.REALTIME;
                    } else {
                        o0oo0oo1.f2053OooO0OO = Timebase.UPTIME;
                    }
                }
                int i = o0OO0oO0.OooO00o.f2054OooO00o[o0oo0oo1.f2053OooO0OO.ordinal()];
                if (i == 1) {
                    if (o0oo0oo1.f2052OooO0O0 == -1) {
                        long j4 = LongCompanionObject.MAX_VALUE;
                        int i2 = 0;
                        long j5 = 0;
                        while (i2 < 3) {
                            o000oo01.getClass();
                            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                            long micros = timeUnit2.toMicros(System.nanoTime());
                            long j6 = j3;
                            long micros2 = timeUnit2.toMicros(SystemClock.elapsedRealtimeNanos());
                            int i3 = i2;
                            long micros3 = timeUnit2.toMicros(System.nanoTime());
                            long j7 = micros3 - micros;
                            if (i3 == 0 || j7 < j4) {
                                j5 = micros2 - ((micros + micros3) >> 1);
                                j4 = j7;
                            }
                            i2 = i3 + 1;
                            j3 = j6;
                        }
                        j = j3;
                        o0oo0oo1.f2052OooO0O0 = Math.max(0L, j5);
                    } else {
                        j = j3;
                    }
                    j2 = j - o0oo0oo1.f2052OooO0O0;
                } else {
                    if (i != 2) {
                        throw new AssertionError("Unknown timebase: " + o0oo0oo1.f2053OooO0OO);
                    }
                    j2 = j3;
                }
                bufferInfo.presentationTimeUs = j2;
            }
            long j8 = bufferInfo.presentationTimeUs;
            if (j8 <= this.f1922OooO0o0) {
                o00O0O0.OooO00o(o0000Ooo.this.f1887OooO00o, "Drop buffer by out of order buffer from MediaCodec.");
                return false;
            }
            this.f1922OooO0o0 = j8;
            if (!o0000Ooo.this.f1906OooOo0.contains(Long.valueOf(j8))) {
                o00O0O0.OooO00o(o0000Ooo.this.f1887OooO00o, "Drop buffer by not in start-stop range.");
                o0000Ooo o0000ooo = o0000Ooo.this;
                if (!o0000ooo.f1909OooOo0o || bufferInfo.presentationTimeUs < ((Long) o0000ooo.f1906OooOo0.getUpper()).longValue()) {
                    return false;
                }
                ScheduledFuture scheduledFuture = o0000Ooo.this.f1911OooOoO0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                o0000Ooo.this.f1905OooOo = Long.valueOf(bufferInfo.presentationTimeUs);
                o0000Ooo.this.OooOOO0();
                o0000Ooo.this.f1909OooOo0o = false;
                return false;
            }
            o0000Ooo o0000ooo2 = o0000Ooo.this;
            long j9 = bufferInfo.presentationTimeUs;
            while (true) {
                ArrayDeque arrayDeque = o0000ooo2.f1900OooOOOO;
                if (!arrayDeque.isEmpty()) {
                    Range range = (Range) arrayDeque.getFirst();
                    if (j9 <= ((Long) range.getUpper()).longValue()) {
                        break;
                    }
                    arrayDeque.removeFirst();
                    o0000ooo2.f1908OooOo0O = (((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue()) + o0000ooo2.f1908OooOo0O;
                    o00O0O0.OooO00o(o0000ooo2.f1887OooO00o, "Total paused duration = " + o00000O0.OooO0OO(o0000ooo2.f1908OooOo0O));
                } else {
                    break;
                }
            }
            o0000Ooo o0000ooo3 = o0000Ooo.this;
            long j10 = bufferInfo.presentationTimeUs;
            Iterator it = o0000ooo3.f1900OooOOOO.iterator();
            while (true) {
                if (it.hasNext()) {
                    Range range2 = (Range) it.next();
                    if (range2.contains(Long.valueOf(j10))) {
                        z = true;
                        break;
                    }
                    if (j10 < ((Long) range2.getLower()).longValue()) {
                    }
                }
                z = false;
                break;
            }
            boolean z2 = this.f1923OooO0oO;
            if (!z2 && z) {
                o00O0O0.OooO00o(o0000Ooo.this.f1887OooO00o, "Switch to pause state");
                this.f1923OooO0oO = true;
                synchronized (o0000Ooo.this.f1888OooO0O0) {
                    o0000Ooo o0000ooo4 = o0000Ooo.this;
                    executor = o0000ooo4.f1904OooOOoo;
                    o00oo1 = o0000ooo4.f1902OooOOo;
                }
                Objects.requireNonNull(o00oo1);
                executor.execute(new o000O00(o00oo1, 0));
                o0000Ooo o0000ooo5 = o0000Ooo.this;
                if (o0000ooo5.f1907OooOo00 == OooO0o.PAUSED && ((o0000ooo5.f1889OooO0OO || o0O0OOOo.OooO00o(o0O0oo0o.class) == null) && (!o0000Ooo.this.f1889OooO0OO || o0O0OOOo.OooO00o(o0OO00o0.class) == null))) {
                    o00O0O.OooO0O0 oooO0O0 = o0000Ooo.this.f1891OooO0o;
                    if (oooO0O0 instanceof OooO0OO) {
                        ((OooO0OO) oooO0O0).OooO0o(false);
                    }
                    o0000Ooo o0000ooo6 = o0000Ooo.this;
                    o0000ooo6.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putInt("drop-input-frames", 1);
                    o0000ooo6.f1892OooO0o0.setParameters(bundle);
                }
                o0000Ooo.this.f1905OooOo = Long.valueOf(bufferInfo.presentationTimeUs);
                o0000Ooo o0000ooo7 = o0000Ooo.this;
                if (o0000ooo7.f1909OooOo0o) {
                    ScheduledFuture scheduledFuture2 = o0000ooo7.f1911OooOoO0;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(true);
                    }
                    o0000Ooo.this.OooOOO0();
                    o0000Ooo.this.f1909OooOo0o = false;
                }
            } else if (z2 && !z) {
                o00O0O0.OooO00o(o0000Ooo.this.f1887OooO00o, "Switch to resume state");
                this.f1923OooO0oO = false;
                if (o0000Ooo.this.f1889OooO0OO) {
                    if (!((bufferInfo.flags & 1) != 0)) {
                        this.f1924OooO0oo = true;
                    }
                }
            }
            if (this.f1923OooO0oO) {
                o00O0O0.OooO00o(o0000Ooo.this.f1887OooO00o, "Drop buffer by pause.");
                return false;
            }
            o0000Ooo o0000ooo8 = o0000Ooo.this;
            long j11 = o0000ooo8.f1908OooOo0O;
            if ((j11 > 0 ? bufferInfo.presentationTimeUs - j11 : bufferInfo.presentationTimeUs) <= this.f1921OooO0o) {
                o00O0O0.OooO00o(o0000ooo8.f1887OooO00o, "Drop buffer by adjusted time is less than the last sent time.");
                if (!o0000Ooo.this.f1889OooO0OO) {
                    return false;
                }
                if (!((bufferInfo.flags & 1) != 0)) {
                    return false;
                }
                this.f1924OooO0oo = true;
                return false;
            }
            if (!this.f1919OooO0OO && !this.f1924OooO0oo && o0000ooo8.f1889OooO0OO) {
                this.f1924OooO0oo = true;
            }
            if (!this.f1924OooO0oo) {
                return true;
            }
            if ((bufferInfo.flags & 1) != 0) {
                this.f1924OooO0oo = false;
                return true;
            }
            o00O0O0.OooO00o(o0000ooo8.f1887OooO00o, "Drop buffer by not a key frame.");
            o0000Ooo.this.OooO();
            return false;
        }

        public final void OooO0O0(@NonNull final o0OoOo0 o0oooo1, @NonNull final o00Oo0 o00oo1, @NonNull Executor executor) {
            o0000Ooo o0000ooo = o0000Ooo.this;
            o0000ooo.f1898OooOOO.add(o0oooo1);
            OooOO0O oooOO0OOooO0o0 = OooOo.OooO0o0(o0oooo1.f1991OooO0oo);
            oooOO0OOooO0o0.OooO0oo(new OooOo.OooO0O0(oooOO0OOooO0o0, new OooO00o(o0oooo1)), o0000ooo.f1894OooO0oo);
            try {
                executor.execute(new Runnable() { // from class: Oooooo.o000O00O
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00oo1.OooO0O0(o0oooo1);
                    }
                });
            } catch (RejectedExecutionException e) {
                o00O0O0.OooO0OO(o0000ooo.f1887OooO00o, "Unable to post to the supplied executor.", e);
                o0oooo1.close();
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(@NonNull MediaCodec mediaCodec, @NonNull final MediaCodec.CodecException codecException) {
            o0000Ooo.this.f1894OooO0oo.execute(new Runnable() { // from class: Oooooo.o0000OO0
                @Override // java.lang.Runnable
                public final void run() {
                    o0000Ooo.OooO oooO = this.f1883OooO0Oo;
                    oooO.getClass();
                    int[] iArr = o0000Ooo.OooO00o.f1928OooO00o;
                    o0000Ooo o0000ooo = o0000Ooo.this;
                    switch (iArr[o0000ooo.f1907OooOo00.ordinal()]) {
                        case 1:
                        case 8:
                        case 9:
                            return;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            MediaCodec.CodecException codecException2 = codecException;
                            o0000ooo.OooO0OO(codecException2, 1, codecException2.getMessage());
                            return;
                        default:
                            throw new IllegalStateException("Unknown state: " + o0000ooo.f1907OooOo00);
                    }
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
            o0000Ooo.this.f1894OooO0oo.execute(new Runnable() { // from class: Oooooo.o000O000
                @Override // java.lang.Runnable
                public final void run() {
                    o0000Ooo.OooO oooO = this.f1955OooO0Oo;
                    boolean z = oooO.f1916OooO;
                    o0000Ooo o0000ooo = o0000Ooo.this;
                    if (z) {
                        o00O0O0.OooO0oo(o0000ooo.f1887OooO00o, "Receives input frame after codec is reset.");
                        return;
                    }
                    switch (o0000Ooo.OooO00o.f1928OooO00o[o0000ooo.f1907OooOo00.ordinal()]) {
                        case 1:
                        case 8:
                        case 9:
                            return;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            o0000ooo.f1896OooOO0O.offer(Integer.valueOf(i));
                            o0000ooo.OooO0Oo();
                            return;
                        default:
                            throw new IllegalStateException("Unknown state: " + o0000ooo.f1907OooOo00);
                    }
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(@NonNull final MediaCodec mediaCodec, final int i, @NonNull final MediaCodec.BufferInfo bufferInfo) {
            o0000Ooo.this.f1894OooO0oo.execute(new Runnable() { // from class: Oooooo.o000
                /* JADX WARN: Code duplicated, block: B:62:0x0111  */
                @Override // java.lang.Runnable
                public final void run() {
                    final o00Oo0 o00oo1;
                    final Executor executor;
                    MediaCodec.BufferInfo bufferInfo2;
                    final o0000Ooo.OooO oooO = this.f1853OooO0Oo;
                    MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                    MediaCodec mediaCodec2 = mediaCodec;
                    int i2 = i;
                    if (oooO.f1916OooO) {
                        o00O0O0.OooO0oo(o0000Ooo.this.f1887OooO00o, "Receives frame after codec is reset.");
                        return;
                    }
                    switch (o0000Ooo.OooO00o.f1928OooO00o[o0000Ooo.this.f1907OooOo00.ordinal()]) {
                        case 1:
                        case 8:
                        case 9:
                            return;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            synchronized (o0000Ooo.this.f1888OooO0O0) {
                                o0000Ooo o0000ooo = o0000Ooo.this;
                                o00oo1 = o0000ooo.f1902OooOOo;
                                executor = o0000ooo.f1904OooOOoo;
                                break;
                            }
                            final int i3 = 0;
                            if (!oooO.f1918OooO0O0) {
                                oooO.f1918OooO0O0 = true;
                                try {
                                    Objects.requireNonNull(o00oo1);
                                    executor.execute(new Runnable() { // from class: Oooooo.o000O0o
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    ((o00Oo0) o00oo1).OooO0Oo();
                                                    return;
                                                default:
                                                    o00oOoo.OooO00o(o00oo1);
                                                    Intrinsics.checkNotNullParameter(null, "this$0");
                                                    throw null;
                                            }
                                        }
                                    });
                                } catch (RejectedExecutionException e) {
                                    o00O0O0.OooO0OO(o0000Ooo.this.f1887OooO00o, "Unable to post to the supplied executor.", e);
                                }
                                break;
                            }
                            if (!oooO.OooO00o(bufferInfo3)) {
                                if (i2 != -9999) {
                                    try {
                                        o0000Ooo.this.f1892OooO0o0.releaseOutputBuffer(i2, false);
                                    } catch (MediaCodec.CodecException e2) {
                                        o0000Ooo o0000ooo2 = o0000Ooo.this;
                                        o0000ooo2.getClass();
                                        o0000ooo2.OooO0OO(e2, 1, e2.getMessage());
                                        return;
                                    }
                                }
                                break;
                            } else {
                                if (!oooO.f1919OooO0OO) {
                                    oooO.f1919OooO0OO = true;
                                }
                                long j = o0000Ooo.this.f1908OooOo0O;
                                long j2 = j > 0 ? bufferInfo3.presentationTimeUs - j : bufferInfo3.presentationTimeUs;
                                if (bufferInfo3.presentationTimeUs == j2) {
                                    bufferInfo2 = bufferInfo3;
                                } else {
                                    o000OO.OooOOO0.OooO0o(null, j2 > oooO.f1921OooO0o);
                                    bufferInfo2 = new MediaCodec.BufferInfo();
                                    bufferInfo2.set(bufferInfo3.offset, bufferInfo3.size, j2, bufferInfo3.flags);
                                }
                                oooO.f1921OooO0o = bufferInfo2.presentationTimeUs;
                                try {
                                    oooO.OooO0O0(new o0OoOo0(mediaCodec2, i2, bufferInfo2), o00oo1, executor);
                                } catch (MediaCodec.CodecException e3) {
                                    o0000Ooo o0000ooo3 = o0000Ooo.this;
                                    o0000ooo3.getClass();
                                    o0000ooo3.OooO0OO(e3, 1, e3.getMessage());
                                    return;
                                }
                                break;
                            }
                            if (oooO.f1920OooO0Oo) {
                                return;
                            }
                            if (!((bufferInfo3.flags & 4) != 0)) {
                                o0000Ooo o0000ooo4 = o0000Ooo.this;
                                i3 = o0000ooo4.f1913OooOoo && (bufferInfo3.presentationTimeUs > ((Long) o0000ooo4.f1906OooOo0.getUpper()).longValue() ? 1 : (bufferInfo3.presentationTimeUs == ((Long) o0000ooo4.f1906OooOo0.getUpper()).longValue() ? 0 : -1)) > 0 ? 1 : 0;
                            }
                            if (i3 != 0) {
                                oooO.f1920OooO0Oo = true;
                                o0000Ooo.this.OooOOOo(new Runnable() { // from class: Oooooo.o000Oo0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        o0000Ooo.OooO oooO2 = (o0000Ooo.OooO) oooO;
                                        Executor executor2 = (Executor) executor;
                                        o00Oo0 o00oo2 = (o00Oo0) o00oo1;
                                        o0000Ooo o0000ooo5 = o0000Ooo.this;
                                        if (o0000ooo5.f1907OooOo00 == o0000Ooo.OooO0o.ERROR) {
                                            return;
                                        }
                                        try {
                                            Objects.requireNonNull(o00oo2);
                                            executor2.execute(new o00OOOO0(o00oo2, 1));
                                        } catch (RejectedExecutionException e4) {
                                            o00O0O0.OooO0OO(o0000ooo5.f1887OooO00o, "Unable to post to the supplied executor.", e4);
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        default:
                            throw new IllegalStateException("Unknown state: " + o0000Ooo.this.f1907OooOo00);
                    }
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(@NonNull MediaCodec mediaCodec, @NonNull MediaFormat mediaFormat) {
            o0000Ooo.this.f1894OooO0oo.execute(new o0O0ooO(1, this, mediaFormat));
        }
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f1928OooO00o;

        static {
            int[] iArr = new int[OooO0o.values().length];
            f1928OooO00o = iArr;
            try {
                iArr[OooO0o.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1928OooO00o[OooO0o.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1928OooO00o[OooO0o.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1928OooO00o[OooO0o.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1928OooO00o[OooO0o.PENDING_START_PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1928OooO00o[OooO0o.PENDING_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1928OooO00o[OooO0o.PENDING_RELEASE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1928OooO00o[OooO0o.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1928OooO00o[OooO0o.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @RequiresApi(23)
    public static class OooO0O0 {
        @NonNull
        @DoNotInline
        public static Surface OooO00o() {
            return MediaCodec.createPersistentInputSurface();
        }

        @DoNotInline
        public static void OooO0O0(@NonNull MediaCodec mediaCodec, @NonNull Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    public class OooO0OO implements o00O0O.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final LinkedHashMap f1929OooO00o = new LinkedHashMap();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public BufferProvider.State f1930OooO0O0 = BufferProvider.State.INACTIVE;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f1931OooO0OO = new ArrayList();

        public OooO0OO() {
        }

        @Override // androidx.camera.core.impl.oo00o
        public final void OooO00o(@NonNull final oo00o.OooO00o oooO00o, @NonNull final Executor executor) {
            o0000Ooo.this.f1894OooO0oo.execute(new Runnable() { // from class: Oooooo.o0000oo
                @Override // java.lang.Runnable
                public final void run() {
                    o0000Ooo.OooO0OO oooO0OO = this.f1939OooO0Oo;
                    LinkedHashMap linkedHashMap = oooO0OO.f1929OooO00o;
                    oo00o.OooO00o oooO00o2 = oooO00o;
                    oooO00o2.getClass();
                    Executor executor2 = executor;
                    executor2.getClass();
                    linkedHashMap.put(oooO00o2, executor2);
                    executor2.execute(new o0000O0O(0, oooO00o2, oooO0OO.f1930OooO0O0));
                }
            });
        }

        @Override // androidx.camera.core.impl.oo00o
        @NonNull
        public final OooOO0O<BufferProvider.State> OooO0O0() {
            return o000Oo0.OooO00o(new o000O00(this));
        }

        @Override // androidx.camera.core.impl.oo00o
        public final void OooO0OO(@NonNull final oo00o.OooO00o<? super BufferProvider.State> oooO00o) {
            o0000Ooo.this.f1894OooO0oo.execute(new Runnable() { // from class: Oooooo.o0000O00
                @Override // java.lang.Runnable
                public final void run() {
                    LinkedHashMap linkedHashMap = this.f1878OooO0Oo.f1929OooO00o;
                    oo00o.OooO00o oooO00o2 = oooO00o;
                    oooO00o2.getClass();
                    linkedHashMap.remove(oooO00o2);
                }
            });
        }

        @Override // androidx.camera.video.internal.BufferProvider
        @NonNull
        public final o000Oo0.OooO0o OooO0Oo() {
            return o000Oo0.OooO00o(new o000O00O(this, 2));
        }

        public final void OooO0o(boolean z) {
            BufferProvider.State state = z ? BufferProvider.State.ACTIVE : BufferProvider.State.INACTIVE;
            if (this.f1930OooO0O0 == state) {
                return;
            }
            this.f1930OooO0O0 = state;
            if (state == BufferProvider.State.INACTIVE) {
                ArrayList arrayList = this.f1931OooO0OO;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OooOO0O) it.next()).cancel(true);
                }
                arrayList.clear();
            }
            for (Map.Entry entry : this.f1929OooO00o.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new o0000(0, entry, state));
                } catch (RejectedExecutionException e) {
                    o00O0O0.OooO0OO(o0000Ooo.this.f1887OooO00o, "Unable to post to the supplied executor.", e);
                }
            }
        }
    }

    public enum OooO0o {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    @RequiresApi(21)
    public class OooOO0 implements o00O0O.OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @GuardedBy("mLock")
        public Surface f1934OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @GuardedBy("mLock")
        public o00O0O.OooO0OO.OooO00o f1936OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @GuardedBy("mLock")
        public Executor f1938OooO0o0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f1933OooO00o = new Object();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @GuardedBy("mLock")
        public final HashSet f1935OooO0OO = new HashSet();

        public OooOO0() {
        }

        @Override // Oooooo.o00O0O.OooO0OO
        public final void OooO0o0(@NonNull Executor executor, @NonNull o0OoO00O o0ooo00o2) {
            Surface surface;
            synchronized (this.f1933OooO00o) {
                this.f1936OooO0Oo = o0ooo00o2;
                executor.getClass();
                this.f1938OooO0o0 = executor;
                surface = this.f1934OooO0O0;
            }
            if (surface != null) {
                try {
                    executor.execute(new o000O0(0, o0ooo00o2, surface));
                } catch (RejectedExecutionException e) {
                    o00O0O0.OooO0OO(o0000Ooo.this.f1887OooO00o, "Unable to post to the supplied executor.", e);
                }
            }
        }
    }

    static {
        Long lValueOf = Long.valueOf(LongCompanionObject.MAX_VALUE);
        f1885OooOooO = Range.create(lValueOf, lValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0000Ooo(@NonNull Executor executor, @NonNull o00Ooo o00ooo2) throws Throwable {
        o0OOooO0 o0ooooo0 = new o0OOooO0();
        executor.getClass();
        o00ooo2.getClass();
        this.f1894OooO0oo = new o0O0O00(executor);
        int i = 1;
        if (o00ooo2 instanceof OooOO0O) {
            this.f1887OooO00o = "AudioEncoder";
            this.f1889OooO0OO = false;
            this.f1891OooO0o = new OooO0OO();
        } else {
            if (!(o00ooo2 instanceof o000OOo0)) {
                throw new InvalidConfigException();
            }
            this.f1887OooO00o = "VideoEncoder";
            this.f1889OooO0OO = true;
            this.f1891OooO0o = new OooOO0();
        }
        Timebase timebaseOooO0OO = o00ooo2.OooO0OO();
        this.f1901OooOOOo = timebaseOooO0OO;
        o00O0O0.OooO00o(this.f1887OooO00o, "mInputTimebase = " + timebaseOooO0OO);
        MediaFormat mediaFormatOooO00o = o00ooo2.OooO00o();
        this.f1890OooO0Oo = mediaFormatOooO00o;
        o00O0O0.OooO00o(this.f1887OooO00o, "mMediaFormat = " + mediaFormatOooO00o);
        MediaCodec mediaCodecOooO00o = o0ooooo0.OooO00o(mediaFormatOooO00o);
        this.f1892OooO0o0 = mediaCodecOooO00o;
        o00O0O0.OooO0Oo(this.f1887OooO00o, "Selected encoder: " + mediaCodecOooO00o.getName());
        boolean z = this.f1889OooO0OO;
        MediaCodecInfo codecInfo = mediaCodecOooO00o.getCodecInfo();
        String strOooO0O0 = o00ooo2.OooO0O0();
        o000O0Oo o0o0ooo = z ? new o0O0ooO(codecInfo, strOooO0O0) : new OooOOO0(codecInfo, strOooO0O0);
        this.f1893OooO0oO = o0o0ooo;
        boolean z2 = this.f1889OooO0OO;
        if (z2) {
            o00O0000 o00o0001 = (o00O0000) o0o0ooo;
            o000OO.OooOOO0.OooO0o(null, z2);
            if (mediaFormatOooO00o.containsKey("bitrate")) {
                int integer = mediaFormatOooO00o.getInteger("bitrate");
                int iIntValue = ((Integer) o00o0001.OooO0o0().clamp(Integer.valueOf(integer))).intValue();
                if (integer != iIntValue) {
                    mediaFormatOooO00o.setInteger("bitrate", iIntValue);
                    o00O0O0.OooO00o(this.f1887OooO00o, "updated bitrate from " + integer + " to " + iIntValue);
                }
            }
        }
        try {
            OooOO0();
            AtomicReference atomicReference = new AtomicReference();
            this.f1886OooO = OooOo.OooO0o0(o000Oo0.OooO00o(new p022Oooo00O.o0O0O00(atomicReference, i)));
            o000Oo0.OooO00o<Void> oooO00o = (o000Oo0.OooO00o) atomicReference.get();
            oooO00o.getClass();
            this.f1895OooOO0 = oooO00o;
            OooOO0o(OooO0o.CONFIGURED);
        } catch (MediaCodec.CodecException e) {
            throw new InvalidConfigException(e);
        }
    }

    public final void OooO() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f1892OooO0o0.setParameters(bundle);
    }

    @NonNull
    public final OooOO0O<o000OO0O> OooO00o() {
        switch (OooO00o.f1928OooO00o[this.f1907OooOo00.ordinal()]) {
            case 1:
                return new o000oOoO.OooO00o(new IllegalStateException("Encoder is not started yet."));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                AtomicReference atomicReference = new AtomicReference();
                o000Oo0.OooO0o oooO0oOooO00o = o000Oo0.OooO00o(new o0ooOOo(atomicReference));
                final o000Oo0.OooO00o oooO00o = (o000Oo0.OooO00o) atomicReference.get();
                oooO00o.getClass();
                this.f1897OooOO0o.offer(oooO00o);
                oooO00o.OooO00o(new Runnable() { // from class: Oooooo.o0OOO0o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1982OooO0Oo.f1897OooOO0o.remove(oooO00o);
                    }
                }, this.f1894OooO0oo);
                OooO0Oo();
                return oooO0oOooO00o;
            case 8:
                return new o000oOoO.OooO00o(new IllegalStateException("Encoder is in error state."));
            case 9:
                return new o000oOoO.OooO00o(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f1907OooOo00);
        }
    }

    public final int OooO0O0() {
        MediaFormat mediaFormat = this.f1890OooO0Oo;
        if (mediaFormat.containsKey("bitrate")) {
            return mediaFormat.getInteger("bitrate");
        }
        return 0;
    }

    public final void OooO0OO(@Nullable final Throwable th, final int i, @Nullable final String str) {
        switch (OooO00o.f1928OooO00o[this.f1907OooOo00.ordinal()]) {
            case 1:
                OooO0o0(th, i, str);
                OooOO0();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                OooOO0o(OooO0o.ERROR);
                OooOOOo(new Runnable() { // from class: Oooooo.o0OO00O
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1978OooO0Oo.OooO0o0(th, i, str);
                    }
                });
                break;
            case 8:
                o00O0O0.OooO(this.f1887OooO00o, "Get more than one error: " + str + "(" + i + ")", th);
                break;
        }
    }

    public final void OooO0Oo() {
        while (true) {
            ArrayDeque arrayDeque = this.f1897OooOO0o;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.f1896OooOO0O;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            o000Oo0.OooO00o oooO00o = (o000Oo0.OooO00o) arrayDeque.poll();
            Objects.requireNonNull(oooO00o);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                final o000O o000o = new o000O(this.f1892OooO0o0, num.intValue());
                if (oooO00o.OooO0O0(o000o)) {
                    this.f1899OooOOO0.add(o000o);
                    o000o.OooO0Oo().OooO0oo(new Runnable() { // from class: Oooooo.o000OOo
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f1965OooO0Oo.f1899OooOOO0.remove(o000o);
                        }
                    }, this.f1894OooO0oo);
                } else {
                    o000o.cancel();
                }
            } catch (MediaCodec.CodecException e) {
                OooO0OO(e, 1, e.getMessage());
                return;
            }
        }
    }

    public final void OooO0o() {
        this.f1903OooOOo0.getClass();
        final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
        this.f1894OooO0oo.execute(new Runnable() { // from class: Oooooo.oo000o
            @Override // java.lang.Runnable
            public final void run() {
                o0000Ooo o0000ooo = this.f1994OooO0Oo;
                o0000ooo.getClass();
                switch (o0000Ooo.OooO00o.f1928OooO00o[o0000ooo.f1907OooOo00.ordinal()]) {
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 8:
                        return;
                    case 2:
                        StringBuilder sb = new StringBuilder("Pause on ");
                        long j = micros;
                        sb.append(o00000O0.OooO0OO(j));
                        o00O0O0.OooO00o(o0000ooo.f1887OooO00o, sb.toString());
                        o0000ooo.f1900OooOOOO.addLast(Range.create(Long.valueOf(j), Long.valueOf(LongCompanionObject.MAX_VALUE)));
                        o0000ooo.OooOO0o(o0000Ooo.OooO0o.PAUSED);
                        return;
                    case 6:
                        o0000ooo.OooOO0o(o0000Ooo.OooO0o.PENDING_START_PAUSED);
                        return;
                    case 7:
                    case 9:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + o0000ooo.f1907OooOo00);
                }
            }
        });
    }

    public final void OooO0o0(@Nullable final Throwable th, final int i, @Nullable final String str) {
        final o00Oo0 o00oo1;
        Executor executor;
        synchronized (this.f1888OooO0O0) {
            o00oo1 = this.f1902OooOOo;
            executor = this.f1904OooOOoo;
        }
        try {
            executor.execute(new Runnable(i, str, th) { // from class: Oooooo.o00000

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ Throwable f1861OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ String f1862OooO0o0;

                {
                    this.f1862OooO0o0 = str;
                    this.f1861OooO0o = th;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f1860OooO0Oo.OooO0o0(new EncodeException(this.f1861OooO0o, this.f1862OooO0o0));
                }
            });
        } catch (RejectedExecutionException e) {
            o00O0O0.OooO0OO(this.f1887OooO00o, "Unable to post to the supplied executor.", e);
        }
    }

    public final void OooO0oO() {
        this.f1894OooO0oo.execute(new Runnable() { // from class: Oooooo.oo0o0Oo
            @Override // java.lang.Runnable
            public final void run() {
                o0000Ooo o0000ooo = this.f1996OooO0Oo;
                o0000ooo.getClass();
                switch (o0000Ooo.OooO00o.f1928OooO00o[o0000ooo.f1907OooOo00.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 8:
                        o0000ooo.OooO0oo();
                        return;
                    case 4:
                    case 5:
                    case 6:
                        o0000ooo.OooOO0o(o0000Ooo.OooO0o.PENDING_RELEASE);
                        return;
                    case 7:
                    case 9:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + o0000ooo.f1907OooOo00);
                }
            }
        });
    }

    public final void OooO0oo() {
        Surface surface;
        HashSet hashSet;
        if (this.f1912OooOoOO) {
            this.f1892OooO0o0.stop();
            this.f1912OooOoOO = false;
        }
        this.f1892OooO0o0.release();
        o00O0O.OooO0O0 oooO0O0 = this.f1891OooO0o;
        if (oooO0O0 instanceof OooOO0) {
            OooOO0 oooOO1 = (OooOO0) oooO0O0;
            synchronized (oooOO1.f1933OooO00o) {
                surface = oooOO1.f1934OooO0O0;
                oooOO1.f1934OooO0O0 = null;
                hashSet = new HashSet(oooOO1.f1935OooO0OO);
                oooOO1.f1935OooO0OO.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        OooOO0o(OooO0o.RELEASED);
        this.f1895OooOO0.OooO0O0(null);
    }

    public final void OooOO0() {
        Surface surfaceCreateInputSurface;
        int i;
        o00O0O.OooO0OO.OooO00o oooO00o;
        Executor executor;
        this.f1906OooOo0 = f1885OooOooO;
        this.f1908OooOo0O = 0L;
        this.f1900OooOOOO.clear();
        this.f1896OooOO0O.clear();
        Iterator it = this.f1897OooOO0o.iterator();
        while (true) {
            surfaceCreateInputSurface = null;
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            o000Oo0.OooO00o oooO00o2 = (o000Oo0.OooO00o) it.next();
            oooO00o2.f57739OooO0Oo = true;
            o000Oo0.OooO0o<T> oooO0o = oooO00o2.f57737OooO0O0;
            if (oooO0o != 0 && oooO0o.f57741OooO0o0.cancel(true)) {
                oooO00o2.f57736OooO00o = null;
                oooO00o2.f57737OooO0O0 = null;
                oooO00o2.f57738OooO0OO = null;
            }
        }
        this.f1897OooOO0o.clear();
        this.f1892OooO0o0.reset();
        this.f1912OooOoOO = false;
        this.f1914OooOoo0 = false;
        this.f1913OooOoo = false;
        this.f1909OooOo0o = false;
        ScheduledFuture scheduledFuture = this.f1911OooOoO0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f1911OooOoO0 = null;
        }
        OooO oooO = this.f1910OooOoO;
        if (oooO != null) {
            oooO.f1916OooO = true;
        }
        OooO oooO2 = new OooO();
        this.f1910OooOoO = oooO2;
        this.f1892OooO0o0.setCallback(oooO2);
        this.f1892OooO0o0.configure(this.f1890OooO0Oo, (Surface) null, (MediaCrypto) null, 1);
        o00O0O.OooO0O0 oooO0O0 = this.f1891OooO0o;
        if (oooO0O0 instanceof OooOO0) {
            OooOO0 oooOO1 = (OooOO0) oooO0O0;
            oooOO1.getClass();
            oo0OOoo oo0oooo = (oo0OOoo) o0O0OOOo.OooO00o(oo0OOoo.class);
            synchronized (oooOO1.f1933OooO00o) {
                try {
                    if (oo0oooo == null) {
                        if (oooOO1.f1934OooO0O0 == null) {
                            surfaceCreateInputSurface = OooO0O0.OooO00o();
                            oooOO1.f1934OooO0O0 = surfaceCreateInputSurface;
                        }
                        OooO0O0.OooO0O0(o0000Ooo.this.f1892OooO0o0, oooOO1.f1934OooO0O0);
                    } else {
                        Surface surface = oooOO1.f1934OooO0O0;
                        if (surface != null) {
                            oooOO1.f1935OooO0OO.add(surface);
                        }
                        surfaceCreateInputSurface = o0000Ooo.this.f1892OooO0o0.createInputSurface();
                        oooOO1.f1934OooO0O0 = surfaceCreateInputSurface;
                    }
                    oooO00o = oooOO1.f1936OooO0Oo;
                    executor = oooOO1.f1938OooO0o0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surfaceCreateInputSurface == null || oooO00o == null || executor == null) {
                return;
            }
            try {
                executor.execute(new o000O0(i, oooO00o, surfaceCreateInputSurface));
            } catch (RejectedExecutionException e) {
                o00O0O0.OooO0OO(o0000Ooo.this.f1887OooO00o, "Unable to post to the supplied executor.", e);
            }
        }
    }

    public final void OooOO0O(@NonNull o00Oo0 o00oo1, @NonNull Executor executor) {
        synchronized (this.f1888OooO0O0) {
            this.f1902OooOOo = o00oo1;
            this.f1904OooOOoo = executor;
        }
    }

    public final void OooOO0o(OooO0o oooO0o) {
        if (this.f1907OooOo00 == oooO0o) {
            return;
        }
        o00O0O0.OooO00o(this.f1887OooO00o, "Transitioning encoder internal state: " + this.f1907OooOo00 + " --> " + oooO0o);
        this.f1907OooOo00 = oooO0o;
    }

    public final void OooOOO() {
        this.f1903OooOOo0.getClass();
        final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
        this.f1894OooO0oo.execute(new Runnable() { // from class: Oooooo.o0Oo0oo
            @Override // java.lang.Runnable
            public final void run() {
                o0000Ooo o0000ooo = this.f1984OooO0Oo;
                o0000ooo.getClass();
                int i = o0000Ooo.OooO00o.f1928OooO00o[o0000ooo.f1907OooOo00.ordinal()];
                MediaCodec mediaCodec = o0000ooo.f1892OooO0o0;
                long j = micros;
                o00O0O.OooO0O0 oooO0O0 = o0000ooo.f1891OooO0o;
                String str = o0000ooo.f1887OooO00o;
                switch (i) {
                    case 1:
                        o0000ooo.f1905OooOo = null;
                        o00O0O0.OooO00o(str, "Start on " + o00000O0.OooO0OO(j));
                        try {
                            if (o0000ooo.f1912OooOoOO) {
                                o0000ooo.OooOO0();
                            }
                            o0000ooo.f1906OooOo0 = Range.create(Long.valueOf(j), Long.valueOf(LongCompanionObject.MAX_VALUE));
                            mediaCodec.start();
                            if (oooO0O0 instanceof o0000Ooo.OooO0OO) {
                                ((o0000Ooo.OooO0OO) oooO0O0).OooO0o(true);
                            }
                            o0000ooo.OooOO0o(o0000Ooo.OooO0o.STARTED);
                            return;
                        } catch (MediaCodec.CodecException e) {
                            o0000ooo.OooO0OO(e, 1, e.getMessage());
                            return;
                        }
                    case 2:
                    case 6:
                    case 8:
                        return;
                    case 3:
                        o0000ooo.f1905OooOo = null;
                        ArrayDeque arrayDeque = o0000ooo.f1900OooOOOO;
                        Range range = (Range) arrayDeque.removeLast();
                        o000OO.OooOOO0.OooO0o("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == LongCompanionObject.MAX_VALUE);
                        long jLongValue = ((Long) range.getLower()).longValue();
                        arrayDeque.addLast(Range.create(Long.valueOf(jLongValue), Long.valueOf(j)));
                        o00O0O0.OooO00o(str, "Resume on " + o00000O0.OooO0OO(j) + "\nPaused duration = " + o00000O0.OooO0OO(j - jLongValue));
                        boolean z = o0000ooo.f1889OooO0OO;
                        if ((z || o0O0OOOo.OooO00o(o0O0oo0o.class) == null) && (!z || o0O0OOOo.OooO00o(o0OO00o0.class) == null)) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("drop-input-frames", 0);
                            mediaCodec.setParameters(bundle);
                            if (oooO0O0 instanceof o0000Ooo.OooO0OO) {
                                ((o0000Ooo.OooO0OO) oooO0O0).OooO0o(true);
                            }
                        }
                        if (z) {
                            o0000ooo.OooO();
                        }
                        o0000ooo.OooOO0o(o0000Ooo.OooO0o.STARTED);
                        return;
                    case 4:
                    case 5:
                        o0000ooo.OooOO0o(o0000Ooo.OooO0o.PENDING_START);
                        return;
                    case 7:
                    case 9:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + o0000ooo.f1907OooOo00);
                }
            }
        });
    }

    public final void OooOOO0() {
        o00O0O.OooO0O0 oooO0O0 = this.f1891OooO0o;
        if (oooO0O0 instanceof OooO0OO) {
            int i = 0;
            ((OooO0OO) oooO0O0).OooO0o(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f1899OooOOO0.iterator();
            while (it.hasNext()) {
                arrayList.add(((o000OO0O) it.next()).OooO0Oo());
            }
            OooOo.OooO0oO(arrayList).OooO0oo(new o00000O0(this, i), this.f1894OooO0oo);
            return;
        }
        if (oooO0O0 instanceof OooOO0) {
            try {
                this.f1892OooO0o0.signalEndOfInputStream();
                this.f1913OooOoo = true;
            } catch (MediaCodec.CodecException e) {
                OooO0OO(e, 1, e.getMessage());
            }
        }
    }

    public final void OooOOOO(final long j) {
        this.f1903OooOOo0.getClass();
        final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
        this.f1894OooO0oo.execute(new Runnable() { // from class: Oooooo.o0O0O00
            @Override // java.lang.Runnable
            public final void run() {
                o0000Ooo o0000ooo = this.f1974OooO0Oo;
                o0000ooo.getClass();
                switch (o0000Ooo.OooO00o.f1928OooO00o[o0000ooo.f1907OooOo00.ordinal()]) {
                    case 1:
                    case 4:
                    case 8:
                        return;
                    case 2:
                    case 3:
                        o0000Ooo.OooO0o oooO0o = o0000ooo.f1907OooOo00;
                        o0000ooo.OooOO0o(o0000Ooo.OooO0o.STOPPING);
                        long jLongValue = ((Long) o0000ooo.f1906OooOo0.getLower()).longValue();
                        if (jLongValue == LongCompanionObject.MAX_VALUE) {
                            throw new AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        long j2 = j;
                        String str = o0000ooo.f1887OooO00o;
                        if (j2 == -1) {
                            j2 = micros;
                        } else if (j2 < jLongValue) {
                            o00O0O0.OooO0oo(str, "The expected stop time is less than the start time. Use current time as stop time.");
                            j2 = micros;
                        }
                        if (j2 < jLongValue) {
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        o0000ooo.f1906OooOo0 = Range.create(Long.valueOf(jLongValue), Long.valueOf(j2));
                        o00O0O0.OooO00o(str, "Stop on " + o00000O0.OooO0OO(j2));
                        if (oooO0o == o0000Ooo.OooO0o.PAUSED && o0000ooo.f1905OooOo != null) {
                            o0000ooo.OooOOO0();
                            return;
                        } else {
                            o0000ooo.f1909OooOo0o = true;
                            o0000ooo.f1911OooOoO0 = o00oO0o.OooO0OO().schedule(new o00oO0o(o0000ooo, 0), 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case 5:
                    case 6:
                        o0000ooo.OooOO0o(o0000Ooo.OooO0o.CONFIGURED);
                        return;
                    case 7:
                    case 9:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + o0000ooo.f1907OooOo00);
                }
            }
        });
    }

    public final void OooOOOo(@Nullable final Runnable runnable) {
        final ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.f1898OooOOO;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(OooOo.OooO0o0(((o0OoOo0) it.next()).f1991OooO0oo));
        }
        HashSet hashSet2 = this.f1899OooOOO0;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((o000OO0O) it2.next()).OooO0Oo());
        }
        if (!arrayList.isEmpty()) {
            o00O0O0.OooO00o(this.f1887OooO00o, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        OooOo.OooO0oO(arrayList).OooO0oo(new Runnable() { // from class: Oooooo.o000000
            @Override // java.lang.Runnable
            public final void run() {
                o0000Ooo o0000ooo = this.f1863OooO0Oo;
                if (o0000ooo.f1907OooOo00 != o0000Ooo.OooO0o.ERROR) {
                    if (!arrayList.isEmpty()) {
                        o00O0O0.OooO00o(o0000ooo.f1887OooO00o, "encoded data and input buffers are returned");
                    }
                    boolean z = o0000ooo.f1891OooO0o instanceof o0000Ooo.OooOO0;
                    MediaCodec mediaCodec = o0000ooo.f1892OooO0o0;
                    if (!z || o0000ooo.f1914OooOoo0) {
                        mediaCodec.stop();
                    } else {
                        mediaCodec.flush();
                        o0000ooo.f1912OooOoOO = true;
                    }
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                o0000Ooo.OooO0o oooO0o = o0000ooo.f1907OooOo00;
                if (oooO0o == o0000Ooo.OooO0o.PENDING_RELEASE) {
                    o0000ooo.OooO0oo();
                    return;
                }
                if (!o0000ooo.f1912OooOoOO) {
                    o0000ooo.OooOO0();
                }
                o0000ooo.OooOO0o(o0000Ooo.OooO0o.CONFIGURED);
                if (oooO0o == o0000Ooo.OooO0o.PENDING_START || oooO0o == o0000Ooo.OooO0o.PENDING_START_PAUSED) {
                    o0000ooo.OooOOO();
                    if (oooO0o == o0000Ooo.OooO0o.PENDING_START_PAUSED) {
                        o0000ooo.OooO0o();
                    }
                }
            }
        }, this.f1894OooO0oo);
    }
}

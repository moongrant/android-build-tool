package p045Oooooo;

import android.media.MediaCodec;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.OooO00o;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ULong;
import o000OO.OooOOO0;
import p030OoooO.OooOo00;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000O implements o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodec f1953OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1954OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ByteBuffer f1955OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O000.OooO0o f1956OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O000.OooO00o<Void> f1958OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f1957OooO0o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f1959OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f1960OooO0oo = false;

    public o000O(@NonNull MediaCodec mediaCodec, @IntRange(from = ULong.MIN_VALUE) int i) throws MediaCodec.CodecException {
        mediaCodec.getClass();
        this.f1953OooO00o = mediaCodec;
        OooOOO0.OooO0Oo(i);
        this.f1954OooO0O0 = i;
        this.f1955OooO0OO = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.f1956OooO0Oo = o00O000.OooO00o(new o000O0O0(atomicReference));
        o00O000.OooO00o<Void> oooO00o = (o00O000.OooO00o) atomicReference.get();
        oooO00o.getClass();
        this.f1958OooO0o0 = oooO00o;
    }

    @Override // p045Oooooo.o000OO0O
    public final boolean OooO00o() {
        ByteBuffer byteBuffer = this.f1955OooO0OO;
        o00O000.OooO00o<Void> oooO00o = this.f1958OooO0o0;
        if (this.f1957OooO0o.getAndSet(true)) {
            return false;
        }
        try {
            this.f1953OooO00o.queueInputBuffer(this.f1954OooO0O0, byteBuffer.position(), byteBuffer.limit(), this.f1959OooO0oO, this.f1960OooO0oo ? 4 : 0);
            oooO00o.OooO0O0(null);
            return true;
        } catch (IllegalStateException e) {
            oooO00o.OooO0OO(e);
            return false;
        }
    }

    @Override // p045Oooooo.o000OO0O
    public final void OooO0O0(long j) {
        OooO0o0();
        OooOOO0.OooO00o(j >= 0);
        this.f1959OooO0oO = j;
    }

    @Override // p045Oooooo.o000OO0O
    public final void OooO0OO() {
        OooO0o0();
        this.f1960OooO0oo = true;
    }

    @Override // p045Oooooo.o000OO0O
    @NonNull
    public final OooO00o<Void> OooO0Oo() {
        return OooOo00.OooO0o0(this.f1956OooO0Oo);
    }

    @Override // p045Oooooo.o000OO0O
    @NonNull
    public final ByteBuffer OooO0o() {
        OooO0o0();
        return this.f1955OooO0OO;
    }

    public final void OooO0o0() {
        if (this.f1957OooO0o.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // p045Oooooo.o000OO0O
    public final boolean cancel() {
        o00O000.OooO00o<Void> oooO00o = this.f1958OooO0o0;
        if (this.f1957OooO0o.getAndSet(true)) {
            return false;
        }
        try {
            this.f1953OooO00o.queueInputBuffer(this.f1954OooO0O0, 0, 0, 0L, 0);
            oooO00o.OooO0O0(null);
        } catch (IllegalStateException e) {
            oooO00o.OooO0OO(e);
        }
        return true;
    }
}

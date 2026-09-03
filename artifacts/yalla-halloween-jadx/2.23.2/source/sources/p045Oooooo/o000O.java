package p045Oooooo;

import android.media.MediaCodec;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.OooOO0O;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ULong;
import o000OO.OooOOO0;
import p030OoooO.OooOo;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000O implements o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodec f1942OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1943OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ByteBuffer f1944OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000Oo0.OooO0o f1945OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000Oo0.OooO00o<Void> f1947OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f1946OooO0o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f1948OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f1949OooO0oo = false;

    public o000O(@NonNull MediaCodec mediaCodec, @IntRange(from = ULong.MIN_VALUE) int i) throws MediaCodec.CodecException {
        mediaCodec.getClass();
        this.f1942OooO00o = mediaCodec;
        OooOOO0.OooO0Oo(i);
        this.f1943OooO0O0 = i;
        this.f1944OooO0OO = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.f1945OooO0Oo = o000Oo0.OooO00o(new o000O0O0(atomicReference));
        o000Oo0.OooO00o<Void> oooO00o = (o000Oo0.OooO00o) atomicReference.get();
        oooO00o.getClass();
        this.f1947OooO0o0 = oooO00o;
    }

    @Override // p045Oooooo.o000OO0O
    public final boolean OooO00o() {
        ByteBuffer byteBuffer = this.f1944OooO0OO;
        o000Oo0.OooO00o<Void> oooO00o = this.f1947OooO0o0;
        if (this.f1946OooO0o.getAndSet(true)) {
            return false;
        }
        try {
            this.f1942OooO00o.queueInputBuffer(this.f1943OooO0O0, byteBuffer.position(), byteBuffer.limit(), this.f1948OooO0oO, this.f1949OooO0oo ? 4 : 0);
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
        this.f1948OooO0oO = j;
    }

    @Override // p045Oooooo.o000OO0O
    public final void OooO0OO() {
        OooO0o0();
        this.f1949OooO0oo = true;
    }

    @Override // p045Oooooo.o000OO0O
    @NonNull
    public final OooOO0O<Void> OooO0Oo() {
        return OooOo.OooO0o0(this.f1945OooO0Oo);
    }

    @Override // p045Oooooo.o000OO0O
    @NonNull
    public final ByteBuffer OooO0o() {
        OooO0o0();
        return this.f1944OooO0OO;
    }

    public final void OooO0o0() {
        if (this.f1946OooO0o.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override // p045Oooooo.o000OO0O
    public final boolean cancel() {
        o000Oo0.OooO00o<Void> oooO00o = this.f1947OooO0o0;
        if (this.f1946OooO0o.getAndSet(true)) {
            return false;
        }
        try {
            this.f1942OooO00o.queueInputBuffer(this.f1943OooO0O0, 0, 0, 0L, 0);
            oooO00o.OooO0O0(null);
        } catch (IllegalStateException e) {
            oooO00o.OooO0OO(e);
        }
        return true;
    }
}

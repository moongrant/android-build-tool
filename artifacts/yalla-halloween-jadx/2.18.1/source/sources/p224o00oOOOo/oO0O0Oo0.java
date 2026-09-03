package p224o00oOOOo;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.OooO00o;
import com.bumptech.glide.load.resource.bitmap.OooO0O0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;
import p243o00oo00O.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class oO0O0Oo0 implements o00000O0<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f33811OooO00o;

    public oO0O0Oo0(OooO00o oooO00o) {
        this.f33811OooO00o = oooO00o;
    }

    @Override // p217o00oO00o.o00000O0
    public final o00OOOO0<Bitmap> OooO00o(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        AtomicReference<byte[]> atomicReference = o0000Ooo.f34168OooO00o;
        o0000Ooo.OooO00o oooO00o = new o0000Ooo.OooO00o(byteBuffer);
        OooO00o oooO00o2 = this.f33811OooO00o;
        return oooO00o2.OooO00o(new OooO0O0.OooO00o(oooO00o, oooO00o2.f12523OooO0Oo, oooO00o2.f12522OooO0OO), i, i2, o00000Var, OooO00o.f12517OooOO0O);
    }

    @Override // p217o00oO00o.o00000O0
    public final boolean OooO0O0(@NonNull ByteBuffer byteBuffer, @NonNull o00000 o00000Var) throws IOException {
        Objects.requireNonNull(this.f33811OooO00o);
        return true;
    }
}

package p238o00oOooO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import p219o00oO0O0.o0O00o0;
import p219o00oO0O0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class oOOOoo00 implements GifDecoder.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0oOOo f34082OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o0O00o0 f34083OooO0O0;

    public oOOOoo00(o0oOOo o0oooo2, @Nullable o0O00o0 o0o00o1) {
        this.f34082OooO00o = o0oooo2;
        this.f34083OooO0O0 = o0o00o1;
    }

    @NonNull
    public final byte[] OooO00o(int i) {
        o0O00o0 o0o00o1 = this.f34083OooO0O0;
        return o0o00o1 == null ? new byte[i] : (byte[]) o0o00o1.OooO0oO(i, byte[].class);
    }
}

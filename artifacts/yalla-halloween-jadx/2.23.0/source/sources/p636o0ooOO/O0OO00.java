package p636o0ooOO;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class O0OO00 implements oo000000 {
    @Override // p636o0ooOO.oo000000
    @Nullable
    public final Metadata OooO00o(O0000000 o0000000) {
        ByteBuffer byteBuffer = o0000000.f11674OooO0o;
        byteBuffer.getClass();
        o00O000o.OooO00o(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (o0000000.OooO0oO()) {
            return null;
        }
        return OooO0O0(o0000000, byteBuffer);
    }

    @Nullable
    public abstract Metadata OooO0O0(O0000000 o0000000, ByteBuffer byteBuffer);
}

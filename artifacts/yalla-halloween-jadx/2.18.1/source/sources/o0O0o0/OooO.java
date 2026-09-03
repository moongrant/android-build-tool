package o0O0o0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.Objects;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO implements OooO00o {
    @Override // o0O0o0.OooO00o
    @Nullable
    public final Metadata OooO00o(OooO0OO oooO0OO) {
        ByteBuffer byteBuffer = oooO0OO.f13642Oooo0oO;
        Objects.requireNonNull(byteBuffer);
        o00000O0.OooO00o(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (oooO0OO.isDecodeOnly()) {
            return null;
        }
        return OooO0O0(oooO0OO, byteBuffer);
    }

    @Nullable
    public abstract Metadata OooO0O0(OooO0OO oooO0OO, ByteBuffer byteBuffer);
}

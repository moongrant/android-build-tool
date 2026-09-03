package p081o000OoOO;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class o0000Ooo implements o00000O {
    @Override // p081o000OoOO.o00000O
    @Nullable
    public final Metadata OooO00o(o00000OO o00000oo2) {
        ByteBuffer byteBuffer = o00000oo2.f7084OooO0o;
        byteBuffer.getClass();
        o00Oo0.OooO00o(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (o00000oo2.OooO0oO()) {
            return null;
        }
        return OooO0O0(o00000oo2, byteBuffer);
    }

    @Nullable
    public abstract Metadata OooO0O0(o00000OO o00000oo2, ByteBuffer byteBuffer);
}

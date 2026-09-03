package p226o00oOOo0;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.OooO;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class oo00oO implements OooO<ByteBuffer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteBuffer f33876OooO00o;

    public static class OooO00o implements OooO.OooO00o<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final Class<ByteBuffer> OooO00o() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final OooO<ByteBuffer> OooO0O0(ByteBuffer byteBuffer) {
            return new oo00oO(byteBuffer);
        }
    }

    public oo00oO(ByteBuffer byteBuffer) {
        this.f33876OooO00o = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.OooO
    @NonNull
    public final ByteBuffer OooO00o() throws IOException {
        this.f33876OooO00o.position(0);
        return this.f33876OooO00o;
    }

    @Override // com.bumptech.glide.load.data.OooO
    public final void OooO0O0() {
    }
}

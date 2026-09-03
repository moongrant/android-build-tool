package o00OO0O;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.OooO;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements OooO<ByteBuffer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteBuffer f37196OooO00o;

    /* JADX INFO: renamed from: o00OO0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0432OooO00o implements OooO.OooO00o<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final Class<ByteBuffer> OooO00o() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final OooO<ByteBuffer> build(ByteBuffer byteBuffer) {
            return new OooO00o(byteBuffer);
        }
    }

    public OooO00o(ByteBuffer byteBuffer) {
        this.f37196OooO00o = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.OooO
    @NonNull
    public final ByteBuffer OooO00o() throws IOException {
        ByteBuffer byteBuffer = this.f37196OooO00o;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.OooO
    public final void OooO0O0() {
    }
}

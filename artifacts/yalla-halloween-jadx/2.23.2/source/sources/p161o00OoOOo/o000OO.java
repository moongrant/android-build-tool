package p161o00OoOOo;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.OooO;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO implements OooO<ByteBuffer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteBuffer f38097OooO00o;

    public static class OooO00o implements OooO.OooO00o<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final Class<ByteBuffer> OooO00o() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final OooO<ByteBuffer> build(ByteBuffer byteBuffer) {
            return new o000OO(byteBuffer);
        }
    }

    public o000OO(ByteBuffer byteBuffer) {
        this.f38097OooO00o = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.OooO
    @NonNull
    public final ByteBuffer OooO00o() throws IOException {
        ByteBuffer byteBuffer = this.f38097OooO00o;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.OooO
    public final void OooO0O0() {
    }
}

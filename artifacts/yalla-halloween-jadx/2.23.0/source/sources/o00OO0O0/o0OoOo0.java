package o00OO0O0;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p129o00O0ooo.o0000;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(27)
public final class o0OoOo0 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO00o(@NonNull InputStream inputStream, @NonNull o0000 o0000Var) throws IOException {
        int iOooO0o0 = new ExifInterface(inputStream).OooO0o0(1, "Orientation");
        if (iOooO0o0 == 0) {
            return -1;
        }
        return iOooO0o0;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType OooO0O0(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType OooO0OO(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO0Oo(@NonNull ByteBuffer byteBuffer, @NonNull o0000 o0000Var) throws IOException {
        AtomicReference<byte[]> atomicReference = p532o0o0Oo.oo0o0Oo.f54578OooO00o;
        return OooO00o(new o0o0Oo.oo0o0Oo.OooO00o(byteBuffer), o0000Var);
    }
}

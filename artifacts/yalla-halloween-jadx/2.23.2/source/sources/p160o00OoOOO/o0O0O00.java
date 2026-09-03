package p160o00OoOOO;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p156o00OoO00.OooO0o;
import p174o00OooOo.o00O0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(27)
public final class o0O0O00 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType OooO00o(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO0O0(@NonNull ByteBuffer byteBuffer, @NonNull OooO0o oooO0o) throws IOException {
        AtomicReference<byte[]> atomicReference = o00O0.f38332OooO00o;
        return OooO0Oo(new o00O0.OooO00o(byteBuffer), oooO0o);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType OooO0OO(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO0Oo(@NonNull InputStream inputStream, @NonNull OooO0o oooO0o) throws IOException {
        int iOooO0o0 = new ExifInterface(inputStream).OooO0o0(1, "Orientation");
        if (iOooO0o0 == 0) {
            return -1;
        }
        return iOooO0o0;
    }
}

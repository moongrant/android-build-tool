package p224o00oOOOo;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p219o00oO0O0.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(27)
public final class oO0OO0O implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType OooO00o(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int OooO0O0(@NonNull InputStream inputStream, @NonNull o0O00o0 o0o00o1) throws IOException {
        int iOooO0o0 = new ExifInterface(inputStream).OooO0o0();
        if (iOooO0o0 == 0) {
            return -1;
        }
        return iOooO0o0;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType OooO0OO(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

package p238o00oOooO;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.OooO0OO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;
import p219o00oO0O0.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
public final class O0O0 implements o00000O0<InputStream, oOOOOo0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<ImageHeaderParser> f34059OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O0<ByteBuffer, oOOOOo0O> f34060OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O00o0 f34061OooO0OO;

    public O0O0(List<ImageHeaderParser> list, o00000O0<ByteBuffer, oOOOOo0O> o00000o1, o0O00o0 o0o00o1) {
        this.f34059OooO00o = list;
        this.f34060OooO0O0 = o00000o1;
        this.f34061OooO0OO = o0o00o1;
    }

    @Override // p217o00oO00o.o00000O0
    public final o00OOOO0<oOOOOo0O> OooO00o(@NonNull InputStream inputStream, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream2.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f34060OooO0O0.OooO00o(ByteBuffer.wrap(byteArray), i, i2, o00000Var);
    }

    @Override // p217o00oO00o.o00000O0
    public final boolean OooO0O0(@NonNull InputStream inputStream, @NonNull o00000 o00000Var) throws IOException {
        return !((Boolean) o00000Var.OooO0OO(O0000000.f34058OooO0O0)).booleanValue() && OooO0OO.OooO0OO(this.f34059OooO00o, inputStream, this.f34061OooO0OO) == ImageHeaderParser.ImageType.GIF;
    }
}

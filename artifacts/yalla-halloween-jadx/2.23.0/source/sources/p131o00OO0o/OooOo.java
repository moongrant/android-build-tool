package p131o00OO0o;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.OooO00o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O0;
import p129o00O0ooo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements o00000O0<InputStream, OooO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<ImageHeaderParser> f37309OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O0<ByteBuffer, OooO> f37310OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000 f37311OooO0OO;

    public OooOo(ArrayList arrayList, OooO0OO oooO0OO, o0000 o0000Var) {
        this.f37309OooO00o = arrayList;
        this.f37310OooO0O0 = oooO0OO;
        this.f37311OooO0OO = o0000Var;
    }

    @Override // p126o00O0oOo.o00000O0
    public final p127o00O0oo.o0000<OooO> OooO00o(@NonNull InputStream inputStream, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
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
        return this.f37310OooO0O0.OooO00o(ByteBuffer.wrap(byteArray), i, i2, o00000Var);
    }

    @Override // p126o00O0oOo.o00000O0
    public final boolean OooO0O0(@NonNull InputStream inputStream, @NonNull o00000 o00000Var) throws IOException {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) o00000Var.OooO0OO(OooOo00.f37313OooO0O0)).booleanValue()) {
            if (OooO00o.OooO0OO(this.f37311OooO0OO, inputStream2, this.f37309OooO00o) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}

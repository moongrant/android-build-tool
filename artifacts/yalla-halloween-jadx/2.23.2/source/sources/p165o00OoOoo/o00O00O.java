package p165o00OoOoo;

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
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O implements o0O0O00<InputStream, o00> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<ImageHeaderParser> f38203OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O00<ByteBuffer, o00> f38204OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o f38205OooO0OO;

    public o00O00O(ArrayList arrayList, o000OO00 o000oo01, OooO0o oooO0o) {
        this.f38203OooO00o = arrayList;
        this.f38204OooO0O0 = o000oo01;
        this.f38205OooO0OO = oooO0o;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final boolean OooO00o(@NonNull InputStream inputStream, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) oo0o0oo.OooO0OO(o00O00.f38179OooO0O0)).booleanValue()) {
            if (OooO00o.OooO0OO(this.f38205OooO0OO, inputStream2, this.f38203OooO00o) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final o00oOoo<o00> OooO0O0(@NonNull InputStream inputStream, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
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
        return this.f38204OooO0O0.OooO0O0(ByteBuffer.wrap(byteArray), i, i2, oo0o0oo);
    }
}

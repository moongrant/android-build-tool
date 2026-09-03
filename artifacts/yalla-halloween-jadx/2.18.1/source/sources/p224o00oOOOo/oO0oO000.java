package p224o00oOOOo;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;
import p243o00oo00O.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 28)
public final class oO0oO000 implements o00000O0<InputStream, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0O0O00 f33826OooO00o = new oO0O0O00();

    @Override // p217o00oO00o.o00000O0
    @Nullable
    public final o00OOOO0<Bitmap> OooO00o(@NonNull InputStream inputStream, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        InputStream inputStream2 = inputStream;
        AtomicReference<byte[]> atomicReference = o0000Ooo.f34168OooO00o;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = o0000Ooo.f34168OooO00o.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i3 = inputStream2.read(andSet);
            if (i3 < 0) {
                o0000Ooo.f34168OooO00o.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.f33826OooO00o.OooO00o(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i, i2, o00000Var);
            }
            byteArrayOutputStream.write(andSet, 0, i3);
        }
    }

    @Override // p217o00oO00o.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO0O0(@NonNull InputStream inputStream, @NonNull o00000 o00000Var) throws IOException {
        return true;
    }
}

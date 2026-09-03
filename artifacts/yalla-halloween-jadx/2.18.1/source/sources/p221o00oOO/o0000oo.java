package p221o00oOO;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p217o00oO00o.o00000;
import p217o00oO00o.o000OOo;
import p219o00oO0O0.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo implements o000OOo<InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O00o0 f33724OooO00o;

    public o0000oo(o0O00o0 o0o00o1) {
        this.f33724OooO00o = o0o00o1;
    }

    @Override // p217o00oO00o.o000OOo
    public final boolean OooO0O0(@NonNull InputStream inputStream, @NonNull File file, @NonNull o00000 o00000Var) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream2 = inputStream;
        byte[] bArr = (byte[]) this.f33724OooO00o.OooO0oO(65536, byte[].class);
        boolean z = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            int i = inputStream2.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        } catch (IOException e) {
                            e = e;
                            fileOutputStream2 = fileOutputStream;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            this.f33724OooO00o.OooO0o(bArr);
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f33724OooO00o.OooO0o(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                    z = true;
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
            } catch (IOException e2) {
                e = e2;
            }
            this.f33724OooO00o.OooO0o(bArr);
            return z;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}

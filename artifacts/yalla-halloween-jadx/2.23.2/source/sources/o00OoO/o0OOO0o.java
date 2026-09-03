package o00OoO;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements p154o00Oo0oo.o0ooOOo<InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p156o00OoO00.OooO0o f37910OooO00o;

    public o0OOO0o(p156o00OoO00.OooO0o oooO0o) {
        this.f37910OooO00o = oooO0o;
    }

    @Override // p154o00Oo0oo.o0ooOOo
    public final boolean OooO0O0(@NonNull InputStream inputStream, @NonNull File file, @NonNull p154o00Oo0oo.oo0o0Oo oo0o0oo) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream2 = inputStream;
        p156o00OoO00.OooO0o oooO0o = this.f37910OooO00o;
        byte[] bArr = (byte[]) oooO0o.OooO0OO(65536, byte[].class);
        FileOutputStream fileOutputStream2 = null;
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
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        oooO0o.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        oooO0o.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                oooO0o.put(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }
}

package o00OO00O;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p126o00O0oOo.o00000;
import p129o00O0ooo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements p126o00O0oOo.o0O0O00<InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000 f37148OooO00o;

    public o0OOO0o(o0000 o0000Var) {
        this.f37148OooO00o = o0000Var;
    }

    @Override // p126o00O0oOo.o0O0O00
    public final boolean OooO00o(@NonNull InputStream inputStream, @NonNull File file, @NonNull o00000 o00000Var) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream2 = inputStream;
        o0000 o0000Var = this.f37148OooO00o;
        byte[] bArr = (byte[]) o0000Var.OooO0OO(65536, byte[].class);
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
                        o0000Var.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        o0000Var.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                o0000Var.put(bArr);
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

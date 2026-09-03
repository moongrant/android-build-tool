package o00OO00O;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements p126o00O0oOo.o0O0O00<ByteBuffer> {
    @Override // p126o00O0oOo.o0O0O00
    public final boolean OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull o00000 o00000Var) throws Throwable {
        try {
            p532o0o0Oo.oo0o0Oo.OooO0Oo(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}

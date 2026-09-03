package p221o00oOO;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p217o00oO00o.o00000;
import p217o00oO00o.o000OOo;
import p243o00oo00O.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o implements o000OOo<ByteBuffer> {
    @Override // p217o00oO00o.o000OOo
    public final boolean OooO0O0(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull o00000 o00000Var) throws Throwable {
        try {
            o0000Ooo.OooO0O0(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}

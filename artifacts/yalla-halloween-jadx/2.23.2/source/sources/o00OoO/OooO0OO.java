package o00OoO;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p174o00OooOo.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements p154o00Oo0oo.o0ooOOo<ByteBuffer> {
    @Override // p154o00Oo0oo.o0ooOOo
    public final boolean OooO0O0(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull p154o00Oo0oo.oo0o0Oo oo0o0oo) throws Throwable {
        try {
            o00O0.OooO0Oo(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}

package p131o00OO0o;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O;
import p127o00O0oo.o0000;
import p532o0o0Oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements o00000O<OooO> {
    @Override // p126o00O0oOo.o0O0O00
    public final boolean OooO00o(@NonNull Object obj, @NonNull File file, @NonNull o00000 o00000Var) throws Throwable {
        try {
            oo0o0Oo.OooO0Oo(((OooO) ((o0000) obj).get()).f37264OooO0Oo.f37274OooO00o.f37286OooO00o.getData().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // p126o00O0oOo.o00000O
    @NonNull
    public final EncodeStrategy OooO0O0(@NonNull o00000 o00000Var) {
        return EncodeStrategy.SOURCE;
    }
}

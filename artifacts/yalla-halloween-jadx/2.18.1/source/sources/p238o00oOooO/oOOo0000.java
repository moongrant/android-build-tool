package p238o00oOooO;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O;
import p243o00oo00O.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class oOOo0000 implements o00000O<oOOOOo0O> {
    @Override // p217o00oO00o.o00000O
    @NonNull
    public final EncodeStrategy OooO00o(@NonNull o00000 o00000Var) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p217o00oO00o.o000OOo
    public final boolean OooO0O0(@NonNull Object obj, @NonNull File file, @NonNull o00000 o00000Var) throws Throwable {
        try {
            o0000Ooo.OooO0O0(((oOOOOo0O) ((o00OOOO0) obj).get()).f34071Oooo0o.f34081OooO00o.f34087OooO00o.OooO0o0().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}

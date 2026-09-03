package p165o00OoOoo;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o000OOo;
import p154o00Oo0oo.oo0o0Oo;
import p174o00OooOo.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0000 implements o000OOo<o00> {
    @Override // p154o00Oo0oo.o000OOo
    @NonNull
    public final EncodeStrategy OooO00o(@NonNull oo0o0Oo oo0o0oo) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p154o00Oo0oo.o0ooOOo
    public final boolean OooO0O0(@NonNull Object obj, @NonNull File file, @NonNull oo0o0Oo oo0o0oo) throws Throwable {
        try {
            o00O0.OooO0Oo(((o00) ((o00oOoo) obj).get()).f38157OooO0Oo.f38167OooO00o.f38181OooO00o.getData().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}

package p207o00o0oOo;

import android.media.MediaDrm;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(21)
public final class o0O00OO {
    @DoNotInline
    public static boolean OooO00o(@Nullable Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    @DoNotInline
    public static int OooO0O0(Throwable th) {
        return o0O00.OooOOOo(o0O00.OooOOo0(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}

package o000OO0O;

import android.media.MediaDrm;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class OooOOO {
    @DoNotInline
    public static boolean OooO00o(@Nullable Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    @DoNotInline
    public static int OooO0O0(Throwable th) {
        return o00.OooOOo(o00.OooOOoo(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}

package p207o00o0oOo;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
public final class o0O00O {
    @DoNotInline
    public static boolean OooO00o(@Nullable Throwable th) {
        return th instanceof DeniedByServerException;
    }

    @DoNotInline
    public static boolean OooO0O0(@Nullable Throwable th) {
        return th instanceof NotProvisionedException;
    }
}

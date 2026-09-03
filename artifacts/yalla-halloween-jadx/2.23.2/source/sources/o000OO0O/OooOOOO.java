package o000OO0O;

import android.media.MediaDrmResetException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public final class OooOOOO {
    @DoNotInline
    public static boolean OooO00o(@Nullable Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}

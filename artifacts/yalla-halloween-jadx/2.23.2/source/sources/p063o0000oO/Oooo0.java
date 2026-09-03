package p063o0000oO;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public final class Oooo0 {
    @DoNotInline
    public static IBinder OooO00o(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    @DoNotInline
    public static void OooO0O0(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}

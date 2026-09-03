package p070o0000ooO;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public final class o0OO00O {
    @DoNotInline
    public static IBinder OooO00o(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    @DoNotInline
    public static void OooO0O0(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}

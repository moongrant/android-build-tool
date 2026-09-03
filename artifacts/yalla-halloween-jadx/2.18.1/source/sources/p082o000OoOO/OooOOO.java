package p082o000OoOO;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO {
    @NonNull
    public static <T extends LifecycleOwner & ViewModelStoreOwner> OooOOO OooO0O0(@NonNull T t) {
        return new OooOOOO(t, t.getViewModelStore());
    }

    @Deprecated
    public abstract void OooO00o(String str, PrintWriter printWriter);
}

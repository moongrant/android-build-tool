package p065o0000oOO;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0ooOOo {
    @NonNull
    public static o0OOO0o OooO00o(@NonNull LifecycleOwner lifecycleOwner) {
        return new o0OOO0o(lifecycleOwner, ((ViewModelStoreOwner) lifecycleOwner).getViewModelStore());
    }
}

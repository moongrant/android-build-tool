package o00OO0O;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 {
    public static ViewModelStore OooO00o(Lazy lazy, String str) {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) lazy.getValue()).getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, str);
        return viewModelStore;
    }
}

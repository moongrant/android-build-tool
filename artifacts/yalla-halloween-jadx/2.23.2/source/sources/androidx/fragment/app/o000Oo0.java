package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0 {
    public static final ViewModelStoreOwner OooO00o(Lazy lazy) {
        return (ViewModelStoreOwner) lazy.getValue();
    }

    @MainThread
    @NotNull
    public static final ViewModelLazy OooO0O0(@NotNull Fragment fragment, @NotNull KClass viewModelClass, @NotNull Function0 storeProducer, @NotNull Function0 extrasProducer, @Nullable Function0 function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        return new ViewModelLazy(viewModelClass, storeProducer, function0, extrasProducer);
    }
}

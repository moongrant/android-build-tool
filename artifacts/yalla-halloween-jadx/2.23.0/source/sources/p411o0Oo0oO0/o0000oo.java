package p411o0Oo0oO0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.didichuxing.doraemonkit.kit.core.BaseFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000oo extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return oOo00OO0.dk_weak_network;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return oO00OOo0.didi_kit_leak_network;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final boolean onClickWithReturn(@NotNull Activity activity) throws IllegalAccessException, InstantiationException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object objNewInstance = Class.forName("com.didichuxing.doraemonkit.kit.weaknetwork.WeakNetworkFragment").newInstance();
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.didichuxing.doraemonkit.kit.core.BaseFragment");
        startUniversalActivity(((BaseFragment) objNewInstance).getClass(), activity, null, true);
        return true;
    }
}

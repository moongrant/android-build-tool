package p519o0o0O0O;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.didichuxing.doraemonkit.kit.core.BaseFragment;
import com.weieyu.yalla.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00000O extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return R.drawable.dk_weak_network;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return R.string.didi_kit_leak_network;
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

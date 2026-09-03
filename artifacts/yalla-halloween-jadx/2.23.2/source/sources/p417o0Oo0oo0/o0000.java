package p417o0Oo0oo0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.didichuxing.doraemonkit.kit.core.BaseFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000 extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return o0Oo0oo.dk_weak_network;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return o000000.didi_kit_leak_network;
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

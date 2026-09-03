package p417o0OoO0;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO {
    public static final boolean OooO00o(@Nullable FragmentActivity fragmentActivity, @Nullable Function1<? super FragmentActivity, Unit> function1) {
        if (fragmentActivity == null || fragmentActivity.isDestroyed() || fragmentActivity.isFinishing()) {
            return false;
        }
        if (function1 == null) {
            return true;
        }
        function1.invoke(fragmentActivity);
        return true;
    }
}

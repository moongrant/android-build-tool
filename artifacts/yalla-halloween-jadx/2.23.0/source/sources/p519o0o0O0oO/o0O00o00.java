package p519o0o0O0oO;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O00o00 {
    public static void OooO00o(BaseFragmentActivity activity, String str, String str2, String str3, Function1 onConfirmClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(1904070225, true, new o0oO0Ooo(str, onConfirmClick, str3, str2, 60)));
    }
}

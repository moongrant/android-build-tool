package p176o00OoooO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.base.activity.BaseFragmentActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p043OooooO0.o00O0000;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class ooo0Oo0 {
    public static void OooO00o(BaseFragmentActivity activity, String str, String str2, String str3, Function1 onConfirmClick) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        activity.showDialog((String) null, o00O0000.OooO0O0(-1091963432, true, new o0oo0000(str, onConfirmClick, str3, str2, 60)));
    }
}

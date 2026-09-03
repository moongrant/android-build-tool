package p375o0OOoOO;

import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.SharedFlow;
import p417o0OoO0.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo {
    public static void OooO00o(SharedFlow sharedFlow, LifecycleOwner lifecycleOwner, Function1 result) {
        Intrinsics.checkNotNullParameter(sharedFlow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
        Intrinsics.checkNotNullParameter(result, "result");
        o0000 o0000Var = new o0000();
        result.invoke(o0000Var);
        o00000OO collector = new o00000OO(o0000Var, false);
        Intrinsics.checkNotNullParameter(sharedFlow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(collector, "collector");
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle()), null, null, new o000000O(sharedFlow, collector, null), 3, null);
    }
}

package p381o0OOoOo0;

import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.SharedFlow;
import p423o0OoO0OO.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 {
    public static void OooO00o(SharedFlow sharedFlow, LifecycleOwner lifecycleOwner, Function1 result) {
        Intrinsics.checkNotNullParameter(sharedFlow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
        Intrinsics.checkNotNullParameter(result, "result");
        o00O0O o00o0o2 = new o00O0O();
        result.invoke(o00o0o2);
        o000oOoO collector = new o000oOoO(o00o0o2, false);
        Intrinsics.checkNotNullParameter(sharedFlow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(collector, "collector");
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle()), null, null, new o000O(sharedFlow, collector, null), 3, null);
    }
}

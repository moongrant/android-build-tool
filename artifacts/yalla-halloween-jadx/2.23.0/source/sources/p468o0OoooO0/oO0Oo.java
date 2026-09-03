package p468o0OoooO0;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo {
    public static Job OooO00o(Function2 block) {
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        CoroutineStart start = CoroutineStart.DEFAULT;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt.launch(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), context, start, block);
    }
}

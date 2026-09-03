package p460o0Ooo0o;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O {
    public static Job OooO00o(Function2 block) {
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        CoroutineStart start = CoroutineStart.DEFAULT;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt.launch(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), context, start, block);
    }
}

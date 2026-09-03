package p254o00ooO0O;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 {
    public static Job OooO00o(CoroutineScope coroutineScope, Function2 block) {
        CoroutineStart start = CoroutineStart.DEFAULT;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt.launch(coroutineScope, Dispatchers.getIO(), start, block);
    }

    public static Job OooO0O0(CoroutineScope coroutineScope, Function2 block) {
        CoroutineStart start = CoroutineStart.DEFAULT;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt.launch(coroutineScope, Dispatchers.getMain(), start, block);
    }

    @Nullable
    public static final <T> Object OooO0OO(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), function2, continuation);
    }

    @Nullable
    public static final <T> Object OooO0Oo(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), function2, continuation);
    }
}

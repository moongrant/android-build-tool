package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Size;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    public static long OooO00o(AwaitPointerEventScope awaitPointerEventScope) {
        return Size.INSTANCE.m1514getZeroNHjbRc();
    }

    @Nullable
    public static Object OooO0O0(AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Function2 function2, @NotNull Continuation continuation) {
        return OooOo0(awaitPointerEventScope, j, function2, continuation);
    }

    @Nullable
    public static Object OooO0OO(AwaitPointerEventScope awaitPointerEventScope, long j, @NotNull Function2 function2, @NotNull Continuation continuation) {
        return OooOo0O(awaitPointerEventScope, j, function2, continuation);
    }

    public static /* synthetic */ <T> Object OooOo0(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }

    public static /* synthetic */ Object OooOo00(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
    }

    public static /* synthetic */ <T> Object OooOo0O(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }
}

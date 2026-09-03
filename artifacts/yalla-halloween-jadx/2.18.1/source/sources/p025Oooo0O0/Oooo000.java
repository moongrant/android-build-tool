package p025Oooo0O0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {754}, m = "awaitLongPressOrCancellation", n = {"initialDown", "longPress"}, s = {"L$0", "L$1"})
public final class Oooo000 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f1472Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o0Oo0oo f1473Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Ref.ObjectRef f1474Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f1475Oooo0oo;

    public Oooo000(Continuation<? super Oooo000> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f1475Oooo0oo = obj;
        this.f1472Oooo |= Integer.MIN_VALUE;
        return OooOo.OooO00o(null, null, this);
    }
}

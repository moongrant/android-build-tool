package p025Oooo0O0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p418o0Oo0oo.OooOOO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {174}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
public final class o00O0000 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooOOO f1653Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f1654Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f1655Oooo0oo;

    public o00O0000(Continuation<? super o00O0000> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f1654Oooo0oO = obj;
        this.f1655Oooo0oo |= Integer.MIN_VALUE;
        return o000OOo0.OooO00o(null, this);
    }
}

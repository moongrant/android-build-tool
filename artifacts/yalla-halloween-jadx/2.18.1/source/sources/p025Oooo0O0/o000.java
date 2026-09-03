package p025Oooo0O0;

import androidx.compose.foundation.gestures.ScrollableKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p418o0Oo0oo.OooOOO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", i = {0}, l = {293}, m = "awaitScrollEvent", n = {"$this$awaitScrollEvent"}, s = {"L$0"})
public final class o000 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooOOO f1480Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f1481Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f1482Oooo0oo;

    public o000(Continuation<? super o000> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f1481Oooo0oO = obj;
        this.f1482Oooo0oo |= Integer.MIN_VALUE;
        return ScrollableKt.OooO00o(null, this);
    }
}

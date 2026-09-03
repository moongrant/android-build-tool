package p025Oooo0O0;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import o0OO00O.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 3}, l = {315, 324, 333, 335}, m = "awaitDownAndSlop", n = {"$this$awaitDownAndSlop", "canDrag", "startDragImmediately", "velocityTracker", "orientation", "$this$awaitDownAndSlop", "velocityTracker", "orientation", "initialDelta", "initialDelta"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$0"})
public final class o00Ooo extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooO0O0 f1678Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Object f1679Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object f1680Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Object f1681Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public /* synthetic */ Object f1682OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Orientation f1683OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f1684OoooO0O;

    public o00Ooo(Continuation<? super o00Ooo> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f1682OoooO0 = obj;
        this.f1684OoooO0O |= Integer.MIN_VALUE;
        return DraggableKt.OooO00o(null, null, null, null, null, this);
    }
}

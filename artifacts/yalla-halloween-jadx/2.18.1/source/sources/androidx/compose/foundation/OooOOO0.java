package androidx.compose.foundation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026Oooo0OO.o0000O0;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", i = {0, 0}, l = {62}, m = "invoke$emitEnter", n = {"hoverInteraction$delegate", "interaction"}, s = {"L$0", "L$1"})
public final class OooOOO0 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f5654Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o0O00OO f5655Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o0000O0 f5656Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f5657Oooo0oo;

    public OooOOO0(Continuation<? super OooOOO0> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f5657Oooo0oo = obj;
        this.f5654Oooo |= Integer.MIN_VALUE;
        return HoverableKt.OooO00o.OooO00o(null, null, this);
    }
}

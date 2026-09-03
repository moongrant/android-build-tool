package o00O00;

import androidx.paging.compose.OooO0OO;
import code.easy.contentstate.ContentState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o000000;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "code.easy.contentstate.ContentStateKt$observerAsContentState$1", f = "ContentState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<Object> f30111Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f30112Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<ContentState> f30113Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO0OO<Object> oooO0OO, boolean z, o0O00OO<ContentState> o0o00oo2, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f30111Oooo0o = oooO0OO;
        this.f30112Oooo0oO = z;
        this.f30113Oooo0oo = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO0O0(this.f30111Oooo0o, this.f30112Oooo0oO, this.f30113Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f30111Oooo0o.OooO0o0().f28682OooO00o instanceof o000000.OooO00o) {
            this.f30113Oooo0oo.setValue(ContentState.Error);
        } else if (this.f30111Oooo0o.OooO0o0().f28682OooO00o instanceof o000000.OooO0OO) {
            this.f30113Oooo0oo.setValue((this.f30111Oooo0o.OooO0o0().f28684OooO0OO.f28695OooO00o && this.f30111Oooo0o.OooO0OO() == 0) ? ContentState.Empty : ContentState.Content);
        } else if ((this.f30111Oooo0o.OooO0o0().f28682OooO00o instanceof o000000.OooO0O0) && !this.f30112Oooo0oO && this.f30111Oooo0o.OooO0OO() == 0) {
            this.f30113Oooo0oo.setValue(ContentState.Loading);
        }
        return Unit.INSTANCE;
    }
}

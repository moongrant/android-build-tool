package p519o0o0O0oO;

import androidx.compose.runtime.MutableState;
import com.code.android.uikit.contentstate.ContentState;
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
import p187o00o00oo.o00O0O0O;
import p187o00o00oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.RoomWebDialog$OnDialog$3$1$2$1", f = "RoomWebDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class s2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f53136OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<ContentState> f53137OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(MutableState mutableState, o00OO0O0 o00oo0o1, Continuation continuation) {
        super(2, continuation);
        this.f53136OooO0Oo = o00oo0o1;
        this.f53137OooO0o0 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new s2(this.f53137OooO0o0, this.f53136OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((s2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (!(this.f53136OooO0Oo.OooO00o() instanceof o00O0O0O.OooO0OO)) {
            this.f53137OooO0o0.setValue(ContentState.Content);
        }
        return Unit.INSTANCE;
    }
}

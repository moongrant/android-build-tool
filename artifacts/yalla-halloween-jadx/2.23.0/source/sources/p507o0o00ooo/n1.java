package p507o0o00ooo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.common.SearchComp$SearchView$4$1$5$1", f = "SearchComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class n1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f50043OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f50044OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f50045OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n1(Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, MutableState<TextFieldValue> mutableState, Continuation<? super n1> continuation) {
        super(2, continuation);
        this.f50043OooO0Oo = function1;
        this.f50045OooO0o0 = function2;
        this.f50044OooO0o = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new n1(this.f50043OooO0Oo, this.f50045OooO0o0, this.f50044OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((n1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MutableState<TextFieldValue> mutableState = this.f50044OooO0o;
        Function1<String, Unit> function1 = this.f50043OooO0Oo;
        if (function1 != null) {
            function1.invoke(j1.OooO0O0(mutableState).getText());
        }
        Function1<String, Unit> function2 = this.f50045OooO0o0;
        if (function2 != null) {
            function2.invoke(j1.OooO0O0(mutableState).getText());
        }
        return Unit.INSTANCE;
    }
}

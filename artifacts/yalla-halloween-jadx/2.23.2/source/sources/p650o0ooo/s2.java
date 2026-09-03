package p650o0ooo;

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
import p231o00oOoO.o00000;
import p231o00oOoO.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.RoomWebDialog$OnDialog$3$1$2$1", f = "RoomWebDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class s2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f59153OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<ContentState> f59154OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(MutableState mutableState, o0000O0O o0000o0o2, Continuation continuation) {
        super(2, continuation);
        this.f59153OooO0Oo = o0000o0o2;
        this.f59154OooO0o0 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new s2(this.f59154OooO0o0, this.f59153OooO0Oo, continuation);
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
        if (!(this.f59153OooO0Oo.OooO00o() instanceof o00000.OooO0OO)) {
            this.f59154OooO0o0.setValue(ContentState.Content);
        }
        return Unit.INSTANCE;
    }
}

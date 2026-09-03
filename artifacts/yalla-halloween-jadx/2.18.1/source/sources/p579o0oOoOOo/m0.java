package p579o0oOoOOo;

import come.code.android.easyrefreshcontentstatus.ContentState;
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
import p100o000oOoO.o0O00OO;
import p325o0O0oo0o.o000O0O0;
import p325o0O0oo0o.o000O0o;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.RoomWebDialog$OnDialog$3$1$2$1", f = "RoomWebDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class m0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f46018Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<ContentState> f46019Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o000O0O0 o000o0o1, o0O00OO<ContentState> o0o00oo2, Continuation<? super m0> continuation) {
        super(2, continuation);
        this.f46018Oooo0o = o000o0o1;
        this.f46019Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new m0(this.f46018Oooo0o, this.f46019Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((m0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (!(this.f46018Oooo0o.OooO0O0() instanceof o000O0o.OooO0OO)) {
            this.f46019Oooo0oO.setValue(ContentState.Content);
        }
        return Unit.INSTANCE;
    }
}

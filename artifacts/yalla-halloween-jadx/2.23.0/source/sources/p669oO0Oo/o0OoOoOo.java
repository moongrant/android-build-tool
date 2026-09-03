package p669oO0Oo;

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
import p184o00o00o.Oooo000;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog$onDialog$2$2$3$1$1", f = "LiveRoomMemberUserRankDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0OoOoOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f60746OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(Oooo000 oooo000, Continuation<? super o0OoOoOo> continuation) {
        super(2, continuation);
        this.f60746OooO0Oo = oooo000;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OoOoOo(this.f60746OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OoOoOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f60746OooO0Oo.OooO0oO() == 0) {
            o0OO000.OooO00o("302001");
        } else {
            o0OO000.OooO00o("302002");
        }
        return Unit.INSTANCE;
    }
}

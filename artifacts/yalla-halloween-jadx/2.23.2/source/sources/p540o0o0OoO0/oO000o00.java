package p540o0o0OoO0;

import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.vm.RoomMemberVM;
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

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomMenuDialogKt$LiveRoomMenuContent$1", f = "LiveRoomMenuDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO000o00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMemberVM f54942OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000o00(RoomMemberVM roomMemberVM, Continuation<? super oO000o00> continuation) {
        super(2, continuation);
        this.f54942OooO0Oo = roomMemberVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO000o00(this.f54942OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO000o00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Long value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
        if (oooO00o.OooO00o().OooOOO() && (value = oooO00o.OooO00o().f24539OooO0Oo.getValue()) != null) {
            RoomMemberVM.checkConveneMemberStatus$default(this.f54942OooO0Oo, value.longValue(), null, 2, null);
        }
        return Unit.INSTANCE;
    }
}

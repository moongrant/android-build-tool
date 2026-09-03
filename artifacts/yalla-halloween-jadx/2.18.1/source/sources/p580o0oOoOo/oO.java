package p580o0oOoOo;

import com.yalla.yalla.common.vm.RoomMemberVM;
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
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomMenuDialogKt$LiveRoomMenuContent$1", f = "LiveRoomMenuDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberVM f46436Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO(RoomMemberVM roomMemberVM, Continuation<? super oO> continuation) {
        super(2, continuation);
        this.f46436Oooo0o = roomMemberVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO(this.f46436Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Long value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        if (oooO00o.OooO00o().OooOOo0() && (value = oooO00o.OooO00o().f43319OooO0Oo.getValue()) != null) {
            RoomMemberVM.checkConveneMemberStatus$default(this.f46436Oooo0o, value.longValue(), null, 2, null);
        }
        return Unit.INSTANCE;
    }
}

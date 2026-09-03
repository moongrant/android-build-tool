package p580o0oOoOo;

import androidx.paging.compose.OooO0OO;
import com.yalla.yalla.model.RoomMemberTaskHostInfoModel;
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

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomMemberTaskHostDialogKt$lambda-3$1$2", f = "LiveRoomMemberTaskHostDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<RoomMemberTaskHostInfoModel> f46640Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(OooO0OO<RoomMemberTaskHostInfoModel> oooO0OO, Continuation<? super oO0Oo> continuation) {
        super(2, continuation);
        this.f46640Oooo0o = oooO0OO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0Oo(this.f46640Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f46640Oooo0o.OooO0OO() > 0) {
            this.f46640Oooo0o.OooO0o();
        }
        return Unit.INSTANCE;
    }
}

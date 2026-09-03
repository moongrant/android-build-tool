package p495o0o00Oo;

import androidx.compose.ui.platform.ComposeView;
import com.code.android.util.o000O;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p504o0o00oO0.x;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.RoomQueueFeatureManager$launchPlayJob$2", f = "RoomQueueFeatureManager.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f49630OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f49631OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(OooOOO<Object> oooOOO, Continuation<? super OooOOO0> continuation) {
        super(2, continuation);
        this.f49631OooO0o0 = oooOOO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOO0(this.f49631OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f49630OooO0Oo;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            OooOOO<Object> oooOOO = this.f49631OooO0o0;
            if (!(!oooOOO.OooO0OO().isEmpty())) {
                ComposeView roomEnterComposeView = ((x) oooOOO).f50297OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(roomEnterComposeView, "roomEnterComposeView");
                o000O.OooO0O0(roomEnterComposeView);
                oooOOO.f49627OooO0O0 = null;
                return Unit.INSTANCE;
            }
            Object objRemove = oooOOO.OooO0OO().remove(0);
            this.f49630OooO0Oo = 1;
            x xVar = (x) oooOOO;
            xVar.getClass();
            ComposeView roomEnterComposeView2 = xVar.f50297OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(roomEnterComposeView2, "roomEnterComposeView");
            o000O.OooOOOO(roomEnterComposeView2);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            xVar.f50299OooO0o0.setValue((RoomUserInfoModel) objRemove);
            xVar.f50298OooO0o.setValue(cancellableContinuationImpl);
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                result = Unit.INSTANCE;
            }
        } while (result != coroutine_suspended);
        return coroutine_suspended;
    }
}

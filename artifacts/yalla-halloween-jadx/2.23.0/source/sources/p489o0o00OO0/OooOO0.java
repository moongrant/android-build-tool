package p489o0o00OO0;

import androidx.compose.ui.platform.ComposeView;
import com.code.android.util.o000OO00;
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
import p498o0o00o00.o0O0o00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.RoomQueueFeatureManager$launchPlayJob$2", f = "RoomQueueFeatureManager.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
public final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f48483OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O<Object> f48484OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooOO0O<Object> oooOO0O, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f48484OooO0o0 = oooOO0O;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOO0(this.f48484OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48483OooO0Oo;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            OooOO0O<Object> oooOO0O = this.f48484OooO0o0;
            if (!(!oooOO0O.OooO0OO().isEmpty())) {
                ComposeView roomEnterComposeView = ((o0O0o00O) oooOO0O).f49329OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(roomEnterComposeView, "roomEnterComposeView");
                o000OO00.OooO0O0(roomEnterComposeView);
                oooOO0O.f48485OooO0O0 = null;
                return Unit.INSTANCE;
            }
            Object objRemove = oooOO0O.OooO0OO().remove(0);
            this.f48483OooO0Oo = 1;
            o0O0o00O o0o0o00o = (o0O0o00O) oooOO0O;
            o0o0o00o.getClass();
            ComposeView roomEnterComposeView2 = o0o0o00o.f49329OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(roomEnterComposeView2, "roomEnterComposeView");
            o000OO00.OooOOOO(roomEnterComposeView2);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            o0o0o00o.f49331OooO0o0.setValue((RoomUserInfoModel) objRemove);
            o0o0o00o.f49330OooO0o.setValue(cancellableContinuationImpl);
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

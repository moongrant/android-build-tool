package p477o0o000O;

import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.ThrowMicModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;
import p475o0o000.o000000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseDownMicMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ThrowMicModel f47614OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(ThrowMicModel throwMicModel, Continuation<? super Oooo0> continuation) {
        super(2, continuation);
        this.f47614OooO0Oo = throwMicModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Oooo0(this.f47614OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o000000 o000000Var = OooO00o.f24979OooO0oO;
        ThrowMicModel throwMicModel = this.f47614OooO0Oo;
        o000000Var.OooO0Oo(throwMicModel.micorder - 1);
        ArrayList arrayList = OooO00o.f24973OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(Boxing.boxLong(throwMicModel.userid));
        MutableStateFlow<Boolean> hasMic = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getHasMic() : null;
        if (hasMic != null) {
            hasMic.setValue(Boxing.boxBoolean(false));
        }
        long j = throwMicModel.userid;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null && j == l.longValue()) {
            o000000Var.f47371OooO00o.setValue(Boxing.boxBoolean(false));
            o000000Var.f47372OooO0O0.setValue(Boxing.boxBoolean(false));
            if (throwMicModel.reason == 1) {
                o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.go_down_mic));
            }
        }
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooOO0O();
        }
        OooO0O0.f24995OoooOOO.OooO00o().f25042OoooO0O.postValue(Boxing.boxLong(throwMicModel.userid));
        return Unit.INSTANCE;
    }
}

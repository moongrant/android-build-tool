package p485o0o000oO;

import com.code.android.util.o0000;
import com.code.android.util.o000O00;
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
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseDownMicMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ThrowMicModel f48674OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(ThrowMicModel throwMicModel, Continuation<? super o000O0O0> continuation) {
        super(2, continuation);
        this.f48674OooO0Oo = throwMicModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O0O0(this.f48674OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
        ThrowMicModel throwMicModel = this.f48674OooO0Oo;
        o0000ooVar.OooO0Oo(throwMicModel.micorder - 1);
        ArrayList arrayList = OooO00o.f24511OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(Boxing.boxLong(throwMicModel.userid));
        MutableStateFlow<Boolean> hasMic = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getHasMic() : null;
        if (hasMic != null) {
            hasMic.setValue(Boxing.boxBoolean(false));
        }
        long j = throwMicModel.userid;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l != null && j == l.longValue()) {
            o0000ooVar.f48576OooO00o.setValue(Boxing.boxBoolean(false));
            o0000ooVar.f48577OooO0O0.setValue(Boxing.boxBoolean(false));
            if (throwMicModel.reason == 1) {
                o000O00.OooO0O0(o0000.OooO0OO(o000000.go_down_mic));
            }
        }
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooOO0O();
        }
        OooO0O0.f24533OoooOOO.OooO00o().f24580OoooO0O.postValue(Boxing.boxLong(throwMicModel.userid));
        return Unit.INSTANCE;
    }
}

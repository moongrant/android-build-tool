package p485o0o000oO;

import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00;
import com.yalla.yalla.model.room.GetMicModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000oo;
import p541o0o0OoOO.oo00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseUpMicMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00O000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GetMicModel f48684OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(GetMicModel getMicModel, Continuation<? super o00O000> continuation) {
        super(2, continuation);
        this.f48684OooO0Oo = getMicModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O000(this.f48684OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = OooO00o.f24511OooO00o;
        GetMicModel getMicModel = this.f48684OooO0Oo;
        OooO00o.OooO0o(getMicModel.getNewUser());
        o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
        int micorder = getMicModel.getMicorder() - 1;
        RoomUserInfoModel newUser = getMicModel.getNewUser();
        Intrinsics.checkNotNull(newUser);
        long jLongValue = newUser.getUserId().getValue().longValue();
        oo00 oo00Var = (oo00) CollectionsKt.getOrNull(o0000ooVar.f48585OooOO0O, micorder);
        if (oo00Var != null) {
            oo00Var.f55307OooO0OO.setValue(Long.valueOf(jLongValue));
            Boolean bool = Boolean.FALSE;
            oo00Var.f55306OooO0O0.setValue(bool);
            oo00Var.f55308OooO0Oo.setValue(bool);
        }
        RoomUserInfoModel newUser2 = getMicModel.getNewUser();
        Intrinsics.checkNotNull(newUser2);
        long jLongValue2 = newUser2.getUserId().getValue().longValue();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l != null && jLongValue2 == l.longValue()) {
            o0000ooVar.f48587OooOOO.setValue(Boolean.FALSE);
            o0000ooVar.f48589OooOOOO.setValue(Boxing.boxBoolean(false));
            o0000ooVar.f48576OooO00o.setValue(Boxing.boxBoolean(true));
            RoomUserInfoModel newUser3 = getMicModel.getNewUser();
            Intrinsics.checkNotNull(newUser3);
            o0000ooVar.f48575OooO.setValue(newUser3.getVoiceChangerId().getValue());
            if (o000000.OooO00o(Boxing.boxInt(getMicModel.getScene()))) {
                o000O00.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(p562o0oOo000.o000000.apply_mic_to_xxx_position), String.valueOf(getMicModel.getMicorder())));
            } else {
                o0oo0000.OooO00o.OooO0O0("202032");
            }
        }
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooOO0O();
        }
        return Unit.INSTANCE;
    }
}

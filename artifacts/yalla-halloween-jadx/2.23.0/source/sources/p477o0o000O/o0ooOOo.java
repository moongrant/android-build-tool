package p477o0o000O;

import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
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
import p464o0Oooo.o000000O;
import p475o0o000.o000000;
import p533o0o0Oo0.oo0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseUpMicMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GetMicModel f47626OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(GetMicModel getMicModel, Continuation<? super o0ooOOo> continuation) {
        super(2, continuation);
        this.f47626OooO0Oo = getMicModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0ooOOo(this.f47626OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0ooOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = OooO00o.f24973OooO00o;
        GetMicModel getMicModel = this.f47626OooO0Oo;
        OooO00o.OooO0o(getMicModel.getNewUser());
        o000000 o000000Var = OooO00o.f24979OooO0oO;
        int micorder = getMicModel.getMicorder() - 1;
        RoomUserInfoModel newUser = getMicModel.getNewUser();
        Intrinsics.checkNotNull(newUser);
        long jLongValue = newUser.getUserId().getValue().longValue();
        oo0O oo0o = (oo0O) CollectionsKt.getOrNull(o000000Var.f47380OooOO0O, micorder);
        if (oo0o != null) {
            oo0o.f54838OooO0OO.setValue(Long.valueOf(jLongValue));
            Boolean bool = Boolean.FALSE;
            oo0o.f54837OooO0O0.setValue(bool);
            oo0o.f54839OooO0Oo.setValue(bool);
        }
        RoomUserInfoModel newUser2 = getMicModel.getNewUser();
        Intrinsics.checkNotNull(newUser2);
        long jLongValue2 = newUser2.getUserId().getValue().longValue();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null && jLongValue2 == l.longValue()) {
            o000000Var.f47382OooOOO.setValue(Boolean.FALSE);
            o000000Var.f47384OooOOOO.setValue(Boxing.boxBoolean(false));
            o000000Var.f47371OooO00o.setValue(Boxing.boxBoolean(true));
            RoomUserInfoModel newUser3 = getMicModel.getNewUser();
            Intrinsics.checkNotNull(newUser3);
            o000000Var.f47370OooO.setValue(newUser3.getVoiceChangerId().getValue());
            if (com.code.android.util.o000000.OooO00o(Boxing.boxInt(getMicModel.getScene()))) {
                o000O00O.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.apply_mic_to_xxx_position), String.valueOf(getMicModel.getMicorder())));
            } else {
                o0OO000.OooO00o("202032");
            }
        }
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooOO0O();
        }
        return Unit.INSTANCE;
    }
}

package p533o0o0OOOo;

import com.app.base.model.GetMicModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000Oo0;
import p254o00ooO0O.o00oOoo;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseUpMicMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO000Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GetMicModel f43479Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo(GetMicModel getMicModel, Continuation<? super oO000Oo> continuation) {
        super(2, continuation);
        this.f43479Oooo0o = getMicModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO000Oo(this.f43479Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO000Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RoomUserInfoModel roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(this.f43479Oooo0o.user.getUserId());
        if (roomUserInfoModelOooOO0 != null) {
            roomUserInfoModelOooOO0.setHasMic(true);
        }
        long userId = this.f43479Oooo0o.user.getUserId();
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        if (value != null && userId == value.longValue()) {
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            o00O.OooO0o.f43215OooO.setValue(Boxing.boxBoolean(false));
            oooO0o.OooOO0(true);
            oooO0o.OooO(false);
            if (o000Oo0.OooO00o(Boxing.boxInt(this.f43479Oooo0o.scene))) {
                o00oOoo.OooO0O0(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.apply_mic_to_xxx_position), String.valueOf(this.f43479Oooo0o.micorder)));
            }
        }
        return Unit.INSTANCE;
    }
}

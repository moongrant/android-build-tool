package p533o0o0OOOo;

import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.List;
import kotlin.Pair;
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
import p047Oooooo0.o00OO0OO;
import p254o00ooO0O.o000Oo0;
import p254o00ooO0O.o00oOoo;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseApplyUpMicMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ List<Long> f43502Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Room.MicApplyReply f43503Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oO000o00 f43504Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0oo(List<Long> list, Room.MicApplyReply micApplyReply, oO000o00 oo000o00, Continuation<? super oO0Oo0oo> continuation) {
        super(2, continuation);
        this.f43502Oooo0o = list;
        this.f43503Oooo0oO = micApplyReply;
        this.f43504Oooo0oo = oo000o00;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0Oo0oo(this.f43502Oooo0o, this.f43503Oooo0oO, this.f43504Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0Oo0oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String userHeader;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
        o00OO0OO<Long> o00oo0oo = o00O.OooO0o.f43226OooOO0o;
        o00oo0oo.clear();
        o00oo0oo.addAll(this.f43502Oooo0o);
        String str = "";
        if (this.f43503Oooo0oO.getApplyListEmpty()) {
            oooO0o.OooO0oO(-1);
            oooO0o.OooO0oo("");
            oO000o00.OooO0O0(this.f43504Oooo0oo);
        } else {
            oooO0o.OooO0oO(this.f43502Oooo0o.size());
            if (!this.f43502Oooo0o.isEmpty()) {
                RoomUserInfoModel roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(o00oo0oo.get(o00oo0oo.size() - 1).longValue());
                if (roomUserInfoModelOooOO0 != null && (userHeader = roomUserInfoModelOooOO0.getUserHeader()) != null) {
                    str = userHeader;
                }
                oooO0o.OooO0oo(str);
            } else {
                oooO0o.OooO0oo("");
            }
        }
        long userId = this.f43503Oooo0oO.getUserId();
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        Long value = oooOOO.OooOo().getValue();
        if (value != null && userId == value.longValue()) {
            oooO0o.OooO(this.f43503Oooo0oO.getOp() == 1);
            if (oooO0o.OooO0o0()) {
                o00oOoo.OooO00o(R.string.Success);
            } else {
                o00oOoo.OooO00o(R.string.Canceled);
            }
        }
        Observable<Object> observable = LiveEventBus.get("HAVE_NEW_APPLY_MIC");
        long userId2 = this.f43503Oooo0oO.getUserId();
        Long value2 = oooOOO.OooOo().getValue();
        observable.postDelay(new Pair(Boxing.boxBoolean(value2 != null && userId2 == value2.longValue()), Boxing.boxBoolean(o000Oo0.OooO00o(Boxing.boxInt(this.f43503Oooo0oO.getOp())))), 200L);
        return Unit.INSTANCE;
    }
}

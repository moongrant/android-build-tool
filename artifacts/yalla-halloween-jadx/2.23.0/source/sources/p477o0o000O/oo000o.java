package p477o0o000O;

import com.app.base.protobuf.room.Room;
import com.squareup.okhttp.OooOo;
import com.yalla.yalla.model.ThrowMicModel;
import com.yalla.yalla.service.room.OooO00o;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p475o0o000.o000000;
import p533o0o0Oo0.oo0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseMicTypeModifyMsg$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRoomMicMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMicMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomMicMsgProcessor$parseMicTypeModifyMsg$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,451:1\n1864#2,3:452\n*S KotlinDebug\n*F\n+ 1 RoomMicMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomMicMsgProcessor$parseMicTypeModifyMsg$1\n*L\n427#1:452,3\n*E\n"})
public final class oo000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Room.MicNumChangeReply f47627OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(Room.MicNumChangeReply micNumChangeReply, Continuation<? super oo000o> continuation) {
        super(2, continuation);
        this.f47627OooO0Oo = micNumChangeReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oo000o(this.f47627OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oo000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Room.MicNumChangeReply micNumChangeReply = this.f47627OooO0Oo;
        if (micNumChangeReply.getMictype() == 1) {
            OooO00o.f24979OooO0oO.f47379OooOO0.setValue(Boolean.TRUE);
        } else {
            o000000 o000000Var = OooO00o.f24979OooO0oO;
            o000000Var.f47379OooOO0.setValue(Boolean.FALSE);
            int i = 0;
            for (Object obj2 : o000000Var.f47380OooOO0O) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                oo0O oo0o = (oo0O) obj2;
                if (i >= 5 && oo0o.f54838OooO0OO.getValue().longValue() > 0) {
                    ThrowMicModel model = new ThrowMicModel();
                    model.userid = oo0o.f54838OooO0OO.getValue().longValue();
                    model.micorder = i2;
                    Intrinsics.checkNotNullParameter(model, "model");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo0(model, null), 3, null);
                    OooO00o.f24979OooO0oO.OooO0Oo(i);
                }
                i = i2;
            }
        }
        OooOo.OooO0OO(177, Boxing.boxInt(micNumChangeReply.getMictype()));
        return Unit.INSTANCE;
    }
}

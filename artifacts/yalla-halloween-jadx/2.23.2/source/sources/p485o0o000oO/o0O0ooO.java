package p485o0o000oO;

import com.app.base.protobuf.room.Room;
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
import p483o0o000Oo.o0000oo;
import p541o0o0OoOO.oo00;
import p545o0oO0O00.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseMicTypeModifyMsg$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRoomMicMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMicMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomMicMsgProcessor$parseMicTypeModifyMsg$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,451:1\n1864#2,3:452\n*S KotlinDebug\n*F\n+ 1 RoomMicMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomMicMsgProcessor$parseMicTypeModifyMsg$1\n*L\n427#1:452,3\n*E\n"})
public final class o0O0ooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Room.MicNumChangeReply f48689OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(Room.MicNumChangeReply micNumChangeReply, Continuation<? super o0O0ooO> continuation) {
        super(2, continuation);
        this.f48689OooO0Oo = micNumChangeReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0ooO(this.f48689OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0ooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Room.MicNumChangeReply micNumChangeReply = this.f48689OooO0Oo;
        if (micNumChangeReply.getMictype() == 1) {
            OooO00o.f24517OooO0oO.f48584OooOO0.setValue(Boolean.TRUE);
        } else {
            o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
            o0000ooVar.f48584OooOO0.setValue(Boolean.FALSE);
            int i = 0;
            for (Object obj2 : o0000ooVar.f48585OooOO0O) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                oo00 oo00Var = (oo00) obj2;
                if (i >= 5 && oo00Var.f55307OooO0OO.getValue().longValue() > 0) {
                    ThrowMicModel model = new ThrowMicModel();
                    model.userid = oo00Var.f55307OooO0OO.getValue().longValue();
                    model.micorder = i2;
                    Intrinsics.checkNotNullParameter(model, "model");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O0O0(model, null), 3, null);
                    OooO00o.f24517OooO0oO.OooO0Oo(i);
                }
                i = i2;
            }
        }
        OooOo00.OooO0O0(177, Boxing.boxInt(micNumChangeReply.getMictype()));
        return Unit.INSTANCE;
    }
}

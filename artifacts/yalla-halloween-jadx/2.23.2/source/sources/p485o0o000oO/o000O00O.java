package p485o0o000oO;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.app.base.protobuf.room.RoomMike;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import java.util.List;
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
import p483o0o000Oo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseApplyMicListMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<Long> f48672OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomMike.MicApplyListReply f48673OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(List<Long> list, RoomMike.MicApplyListReply micApplyListReply, Continuation<? super o000O00O> continuation) {
        super(2, continuation);
        this.f48672OooO0Oo = list;
        this.f48673OooO0o0 = micApplyListReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O00O(this.f48672OooO0Oo, this.f48673OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String value;
        MutableStateFlow<String> userHeader;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
        o0000ooVar.f48591OooOOo.clear();
        SnapshotStateList<Long> snapshotStateList = o0000ooVar.f48591OooOOo;
        List<Long> list = this.f48672OooO0Oo;
        snapshotStateList.addAll(list);
        RoomMike.MicApplyListReply micApplyListReply = this.f48673OooO0o0;
        if (micApplyListReply.getListEmpty()) {
            o0000ooVar.OooOOO(0);
        } else {
            o0000ooVar.OooOOO(micApplyListReply.getUsersCount());
            ArrayList arrayList = OooO00o.f24511OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(list.get(list.size() - 1));
            if (roomUserInfoModelOooO0o0 == null || (userHeader = roomUserInfoModelOooO0o0.getUserHeader()) == null || (value = userHeader.getValue()) == null) {
                value = "";
            }
            o0000ooVar.OooOOOO(value);
        }
        LiveEventBus.get("REFRESH_APPLY_MIC_LIST").post(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}

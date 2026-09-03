package p485o0o000oO;

import com.app.base.protobuf.room.Room;
import com.yalla.yalla.service.room.OooO00o;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p483o0o000Oo.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomSofaListMsgProcessor$parseGetOnlineListMessage$1$1", f = "RoomSofaListMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00O000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<Long> f48686OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Room.UserStaticListReply f48687OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(List<Long> list, Room.UserStaticListReply userStaticListReply, Continuation<? super o00O000o> continuation) {
        super(2, continuation);
        this.f48686OooO0Oo = list;
        this.f48687OooO0o0 = userStaticListReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O000o(this.f48686OooO0Oo, this.f48687OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0000O0 o0000o1 = OooO00o.f24519OooOO0;
        o0000o1.f48495OooO0OO.clear();
        o0000o1.f48495OooO0OO.addAll(this.f48686OooO0Oo);
        o0000o1.f48494OooO0O0.setValue(Boxing.boxInt(this.f48687OooO0o0.getOnlinenum()));
        return Unit.INSTANCE;
    }
}

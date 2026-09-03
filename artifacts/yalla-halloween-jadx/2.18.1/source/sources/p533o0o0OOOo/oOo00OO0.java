package p533o0o0OOOo;

import com.app.base.protobuf.room.Room;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o00OO0OO;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomSofaListMsgProcessor$parseGetSofaListMessage$1$2", f = "RoomSofaListMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oOo00OO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ List<Long> f43510Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Room.UserListReply f43511Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00OO0(List<Long> list, Room.UserListReply userListReply, Continuation<? super oOo00OO0> continuation) {
        super(2, continuation);
        this.f43510Oooo0o = list;
        this.f43511Oooo0oO = userListReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOo00OO0(this.f43510Oooo0o, this.f43511Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOo00OO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
        o00OO0OO<Long> o00oo0oo = o00O.OooOO0.f43246OooO0Oo;
        o00oo0oo.clear();
        o00oo0oo.addAll(this.f43510Oooo0o);
        oooOO1.OooO0O0(this.f43511Oooo0oO.getOnline());
        return Unit.INSTANCE;
    }
}

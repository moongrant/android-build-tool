package p580o0oOoOo;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p530o0o0OOO.o00OO00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog$onDialog$2$1", f = "LiveRoomMemberUserRankDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oOo0oooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public oOo0oooO(Continuation<? super oOo0oooO> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOo0oooO(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new oOo0oooO(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        OooOo.OooO0OO("102046", MapsKt.hashMapOf(new Pair("userType", Boxing.boxInt(o00OO00O.f43313OooooOo.OooO00o().OooOOo0() ? 1 : 2))));
        return Unit.INSTANCE;
    }
}

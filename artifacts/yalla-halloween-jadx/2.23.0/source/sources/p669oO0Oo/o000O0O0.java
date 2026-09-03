package p669oO0Oo;

import com.yalla.yalla.service.room.OooO0O0;
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
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog$OnDialog$2$1", f = "LiveRoomMemberTaskDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public o000O0O0(Continuation<? super o000O0O0> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O0O0(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o000O0O0(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0OO000.OooO0O0("202002", MapsKt.hashMapOf(new Pair("userType", Boxing.boxInt(OooO0O0.f24995OoooOOO.OooO00o().OooOOO() ? 1 : 2))));
        return Unit.INSTANCE;
    }
}

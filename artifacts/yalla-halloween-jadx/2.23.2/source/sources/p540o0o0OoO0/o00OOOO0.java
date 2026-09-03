package p540o0o0OoO0;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.db.model.RoomJoinHistory;
import com.yalla.yalla.service.room.OooO0O0;
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
import p004OooO0oO.o0OoOo0;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomJoinMemberDialogKt$lambda-1$1$1", f = "LiveRoomJoinMemberDialog.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class o00OOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f54718OooO0Oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomJoinMemberDialogKt$lambda-1$1$1$1", f = "LiveRoomJoinMemberDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.OooO0oO(false);
            RoomJoinHistory roomJoinHistory = new RoomJoinHistory();
            Long value = OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            roomJoinHistory.barid = String.valueOf(value);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            roomJoinHistory.uid = o0OoOo0.OooO00o();
            roomJoinHistory.repeat = roomJoinHistory.barid + o0O00oO0.OooOOo0().getValue();
            o00Oo0.OooO00o().OooOoo().OooO00o(roomJoinHistory);
            return Unit.INSTANCE;
        }
    }

    public o00OOOO0(Continuation<? super o00OOOO0> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OOOO0(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o00OOOO0(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f54718OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0oo0000.OooO00o.OooO0O0("202001");
            OooO00o oooO00o = new OooO00o(null);
            this.f54718OooO0Oo = 1;
            if (OooOOO.OooO0Oo(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

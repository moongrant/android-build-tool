package p540o0o0OoO0;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.FollowAndJoinRoomModel;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.vm.room.RoomFollowAndJoinCheckVM;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.RoomLiveEnterPasswordDialog$OnDialog$4$1", f = "RoomLiveEnterPasswordDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0Oo0o0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomFollowAndJoinCheckVM f54986OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54987OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54988OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<FollowAndJoinRoomModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54989OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState) {
            super(1);
            this.f54989OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FollowAndJoinRoomModel followAndJoinRoomModel) {
            FollowAndJoinRoomModel followAndJoinRoomModel2 = followAndJoinRoomModel;
            OooO0O0.f24533OoooOOO.OooO00o().f24545OooOO0O.setValue(Boolean.valueOf(followAndJoinRoomModel2 != null && followAndJoinRoomModel2.getIsFollowing()));
            this.f54989OooO0Oo.setValue(Boolean.valueOf(followAndJoinRoomModel2 != null && followAndJoinRoomModel2.getIsJoined()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0o0(RoomFollowAndJoinCheckVM roomFollowAndJoinCheckVM, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState, Continuation<? super oO0Oo0o0> continuation) {
        super(2, continuation);
        this.f54986OooO0Oo = roomFollowAndJoinCheckVM;
        this.f54988OooO0o0 = lifecycleOwner;
        this.f54987OooO0o = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0Oo0o0(this.f54986OooO0Oo, this.f54988OooO0o0, this.f54987OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0Oo0o0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00O0O.OooO0Oo(this.f54986OooO0Oo.check(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0()), this.f54988OooO0o0, false, null, null, new OooO00o(this.f54987OooO0o), 14);
        return Unit.INSTANCE;
    }
}

package p580o0oOoOo;

import come.code.android.easyrefreshcontentstatus.RefreshState;
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
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomMemberUserRankDialog$onDialog$2$2$3$2$1$1$1", f = "LiveRoomMemberUserRankDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ooOOO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RefreshState f46738Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f46739Oooo0oO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.State.values().length];
            iArr[RefreshState.State.Null.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO00O(RefreshState refreshState, o0O00OO<Boolean> o0o00oo2, Continuation<? super ooOOO00O> continuation) {
        super(2, continuation);
        this.f46738Oooo0o = refreshState;
        this.f46739Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ooOOO00O(this.f46738Oooo0o, this.f46739Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ooOOO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (OooO00o.$EnumSwitchMapping$0[this.f46738Oooo0o.OooO0OO().ordinal()] == 1) {
            this.f46739Oooo0oO.setValue(Boxing.boxBoolean(true));
        } else {
            this.f46739Oooo0oO.setValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}

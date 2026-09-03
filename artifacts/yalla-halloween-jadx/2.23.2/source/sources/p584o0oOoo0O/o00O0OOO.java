package p584o0oOoo0O;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.data.db.model.MusicTable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0Oo0.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentMusicVM$findMusic$1", f = "MomentMusicVM.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0OOO extends SuspendLambda implements Function2<LiveDataScope<MusicTable>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56694OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f56695OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56696OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(String str, Continuation<? super o00O0OOO> continuation) {
        super(2, continuation);
        this.f56695OooO0o = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00O0OOO o00o0ooo2 = new o00O0OOO(this.f56695OooO0o, continuation);
        o00o0ooo2.f56696OooO0o0 = obj;
        return o00o0ooo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<MusicTable> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o00O0OOO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56694OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LiveDataScope liveDataScope = (LiveDataScope) this.f56696OooO0o0;
            String path = this.f56695OooO0o;
            Intrinsics.checkNotNullParameter(path, "path");
            MusicTable musicTableOooO0O0 = o00Oo0.OooO00o().OooOoO0().OooO0O0(path);
            this.f56694OooO0Oo = 1;
            if (liveDataScope.emit(musicTableOooO0O0, this) == coroutine_suspended) {
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

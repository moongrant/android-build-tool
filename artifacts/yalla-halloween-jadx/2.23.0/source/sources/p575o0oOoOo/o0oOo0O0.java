package p575o0oOoOo;

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
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentMusicVM$findMusic$1", f = "MomentMusicVM.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
public final class o0oOo0O0 extends SuspendLambda implements Function2<LiveDataScope<MusicTable>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56335OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f56336OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56337OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(String str, Continuation<? super o0oOo0O0> continuation) {
        super(2, continuation);
        this.f56336OooO0o = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0oOo0O0 o0ooo0o1 = new o0oOo0O0(this.f56336OooO0o, continuation);
        o0ooo0o1.f56337OooO0o0 = obj;
        return o0ooo0o1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<MusicTable> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o0oOo0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56335OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LiveDataScope liveDataScope = (LiveDataScope) this.f56337OooO0o0;
            String path = this.f56336OooO0o;
            Intrinsics.checkNotNullParameter(path, "path");
            MusicTable musicTableOooO0O0 = o000OOo.OooO00o().OooOo().OooO0O0(path);
            this.f56335OooO0Oo = 1;
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

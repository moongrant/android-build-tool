package p154o00OoO00;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.base.loadcache.LoadLogic;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.svga.SharedSvgaManager$loadSvga$1", f = "SharedSvgaManager.kt", i = {0}, l = {55, 56}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
public final class o00Ooo extends SuspendLambda implements Function2<LiveDataScope<oo000o>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38192OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f38193OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f38194OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(String str, Continuation<? super o00Ooo> continuation) {
        super(2, continuation);
        this.f38193OooO0o = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00Ooo o00ooo2 = new o00Ooo(this.f38193OooO0o, continuation);
        o00ooo2.f38194OooO0o0 = obj;
        return o00ooo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<oo000o> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o00Ooo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f38192OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f38194OooO0o0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        liveDataScope = (LiveDataScope) this.f38194OooO0o0;
        o00Oo0.OooO00o oooO00o = o00Oo0.f38190OooO0Oo;
        this.f38194OooO0o0 = liveDataScope;
        this.f38192OooO0Oo = 1;
        obj = oooO00o.OooO0O0(this.f38193OooO0o, LoadLogic.LoadLevel.ALL, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f38194OooO0o0 = null;
        this.f38192OooO0Oo = 2;
        if (liveDataScope.emit((oo000o) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}

package p200o00o0OoO;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.base.loadcache.LoadLogic;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.svga.SharedSvgaManager$loadSvga$1", f = "SharedSvgaManager.kt", i = {0}, l = {55, 56}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
public final class o0o0Oo extends SuspendLambda implements Function2<LiveDataScope<o00Ooo>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39313OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f39314OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f39315OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(String str, Continuation<? super o0o0Oo> continuation) {
        super(2, continuation);
        this.f39314OooO0o = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0o0Oo o0o0oo = new o0o0Oo(this.f39314OooO0o, continuation);
        o0o0oo.f39315OooO0o0 = obj;
        return o0o0oo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<o00Ooo> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o0o0Oo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f39313OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f39315OooO0o0;
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
        liveDataScope = (LiveDataScope) this.f39315OooO0o0;
        o00OOO0O.OooO00o oooO00o = o00OOO0O.f39299OooO0Oo;
        this.f39315OooO0o0 = liveDataScope;
        this.f39313OooO0Oo = 1;
        obj = oooO00o.OooO0O0(this.f39314OooO0o, LoadLogic.LoadLevel.ALL, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f39315OooO0o0 = null;
        this.f39313OooO0Oo = 2;
        if (liveDataScope.emit((o00Ooo) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}

package p097o000o0oO;

import android.graphics.Bitmap;
import coil.request.OooO00o;
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
import p101o000oo.o0ooOOo;
import p109o000ooo.o00oO0o;
import p111o000oooO.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class o000O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o00oO0o>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Bitmap f35423OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35424OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000Oo0 f35425OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f35426OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00O00 f35427OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f35428OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(OooO00o oooO00o, o000Oo0 o000oo1, o00O00 o00o01, o0000O0O o0000o0o2, Bitmap bitmap, Continuation<? super o000O00O> continuation) {
        super(2, continuation);
        this.f35426OooO0o0 = oooO00o;
        this.f35425OooO0o = o000oo1;
        this.f35427OooO0oO = o00o01;
        this.f35428OooO0oo = o0000o0o2;
        this.f35423OooO = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O00O(this.f35426OooO0o0, this.f35425OooO0o, this.f35427OooO0oO, this.f35428OooO0oo, this.f35423OooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o00oO0o> continuation) {
        return ((o000O00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f35424OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO00o oooO00o = this.f35426OooO0o0;
            o0ooOOo o0ooooo = new o0ooOOo(oooO00o, this.f35425OooO0o.f35439OooOO0O, 0, oooO00o, this.f35427OooO0oO, this.f35428OooO0oo, this.f35423OooO != null);
            this.f35424OooO0Oo = 1;
            obj = o0ooooo.OooO0OO(oooO00o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}

package p118o00O0Oo;

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
import p126o00O0o0o.o0000Ooo;
import p130o00O0oo.o000O0Oo;
import p131o00O0oo0.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class o0000O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o0Oo0oo>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Bitmap f36374OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36375OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f36376OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f36377OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f36378OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f36379OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(OooO00o oooO00o, o0000Ooo o0000ooo, o000O0Oo o000o0oo2, o000000 o000000Var, Bitmap bitmap, Continuation<? super o0000O00> continuation) {
        super(2, continuation);
        this.f36377OooO0o0 = oooO00o;
        this.f36376OooO0o = o0000ooo;
        this.f36378OooO0oO = o000o0oo2;
        this.f36379OooO0oo = o000000Var;
        this.f36374OooO = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000O00(this.f36377OooO0o0, this.f36376OooO0o, this.f36378OooO0oO, this.f36379OooO0oo, this.f36374OooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o0Oo0oo> continuation) {
        return ((o0000O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f36375OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooO00o oooO00o = this.f36377OooO0o0;
            o0000Ooo o0000ooo = new o0000Ooo(oooO00o, this.f36376OooO0o.f36390OooOO0O, 0, oooO00o, this.f36378OooO0oO, this.f36379OooO0oo, this.f36374OooO != null);
            this.f36375OooO0Oo = 1;
            obj = o0000ooo.OooO0OO(oooO00o, this);
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

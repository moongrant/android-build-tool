package p101o000oo;

import androidx.paging.LoadType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0O0 extends SuspendLambda implements Function3<o00000OO, o00000OO, Continuation<? super o00000OO>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ o00000OO f35459OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LoadType f35460OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ o00000OO f35461OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(LoadType loadType, Continuation<? super o000O0O0> continuation) {
        super(3, continuation);
        this.f35460OooO0o = loadType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(o00000OO o00000oo2, o00000OO o00000oo3, Continuation<? super o00000OO> continuation) {
        o000O0O0 o000o0o1 = new o000O0O0(this.f35460OooO0o, continuation);
        o000o0o1.f35459OooO0Oo = o00000oo2;
        o000o0o1.f35461OooO0o0 = o00000oo3;
        return o000o0o1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean zOooO00o;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00000OO previous = this.f35459OooO0Oo;
        o00000OO o00000oo2 = this.f35461OooO0o0;
        Intrinsics.checkNotNullParameter(o00000oo2, "<this>");
        Intrinsics.checkNotNullParameter(previous, "previous");
        LoadType loadType = this.f35460OooO0o;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = o00000oo2.f35420OooO00o;
        int i2 = previous.f35420OooO00o;
        if (i > i2) {
            zOooO00o = true;
        } else {
            zOooO00o = i < i2 ? false : o0000Ooo.OooO00o(o00000oo2.f35421OooO0O0, previous.f35421OooO0O0, loadType);
        }
        return zOooO00o ? o00000oo2 : previous;
    }
}

package o000O00O;

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

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0000O0 extends SuspendLambda implements Function3<oo000o, oo000o, Continuation<? super oo000o>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ oo000o f34505OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LoadType f34506OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ oo000o f34507OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(LoadType loadType, Continuation<? super o0000O0> continuation) {
        super(3, continuation);
        this.f34506OooO0o = loadType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(oo000o oo000oVar, oo000o oo000oVar2, Continuation<? super oo000o> continuation) {
        o0000O0 o0000o1 = new o0000O0(this.f34506OooO0o, continuation);
        o0000o1.f34505OooO0Oo = oo000oVar;
        o0000o1.f34507OooO0o0 = oo000oVar2;
        return o0000o1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean zOooO00o;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        oo000o previous = this.f34505OooO0Oo;
        oo000o oo000oVar = this.f34507OooO0o0;
        Intrinsics.checkNotNullParameter(oo000oVar, "<this>");
        Intrinsics.checkNotNullParameter(previous, "previous");
        LoadType loadType = this.f34506OooO0o;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = oo000oVar.f34664OooO00o;
        int i2 = previous.f34664OooO00o;
        if (i > i2) {
            zOooO00o = true;
        } else {
            zOooO00o = i < i2 ? false : o00oO0o.OooO00o(oo000oVar.f34665OooO0O0, previous.f34665OooO0O0, loadType);
        }
        return zOooO00o ? oo000oVar : previous;
    }
}

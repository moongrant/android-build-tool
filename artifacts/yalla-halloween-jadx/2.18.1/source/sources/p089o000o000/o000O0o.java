package p089o000o000;

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
public final class o000O0o extends SuspendLambda implements Function3<o00oO0o, o00oO0o, Continuation<? super o00oO0o>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public /* synthetic */ o00oO0o f28870Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ o00oO0o f28871Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ LoadType f28872Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(LoadType loadType, Continuation<? super o000O0o> continuation) {
        super(3, continuation);
        this.f28872Oooo0oo = loadType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(o00oO0o o00oo0o2, o00oO0o o00oo0o3, Continuation<? super o00oO0o> continuation) {
        o000O0o o000o0o2 = new o000O0o(this.f28872Oooo0oo, continuation);
        o000o0o2.f28870Oooo0o = o00oo0o2;
        o000o0o2.f28871Oooo0oO = o00oo0o3;
        return o000o0o2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean zOooO00o;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00oO0o previous = this.f28870Oooo0o;
        o00oO0o o00oo0o2 = this.f28871Oooo0oO;
        LoadType loadType = this.f28872Oooo0oo;
        Intrinsics.checkNotNullParameter(o00oo0o2, "<this>");
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i = o00oo0o2.f29058OooO00o;
        int i2 = previous.f29058OooO00o;
        if (i > i2) {
            zOooO00o = true;
        } else {
            zOooO00o = i < i2 ? false : o0OO00O.OooO00o(o00oo0o2.f29059OooO0O0, previous.f29059OooO0O0, loadType);
        }
        return zOooO00o ? o00oo0o2 : previous;
    }
}

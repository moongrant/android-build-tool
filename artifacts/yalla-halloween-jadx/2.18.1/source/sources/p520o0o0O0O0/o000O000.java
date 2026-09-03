package p520o0o0O0O0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.MemberRepo", f = "MemberRepo.kt", i = {}, l = {33}, m = "getSingleBarSearch", n = {}, s = {})
public final class o000O000 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public /* synthetic */ Object f42467Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000 f42468Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f42469Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(o000 o000Var, Continuation<? super o000O000> continuation) {
        super(continuation);
        this.f42468Oooo0oO = o000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f42467Oooo0o = obj;
        this.f42469Oooo0oo |= Integer.MIN_VALUE;
        return this.f42468Oooo0oO.OooO0o(0L, null, 0, this);
    }
}

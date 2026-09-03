package p154o00OoO00;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.svga.SharedSvgaManager", f = "SharedSvgaManager.kt", i = {0, 0}, l = {60, 61}, m = "loadSvgaFromNet", n = {"this", "key"}, s = {"L$0", "L$1"})
public final class o0ooOOo extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00Oo0 f38202OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f38203OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f38204OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f38205OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f38206OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(o00Oo0 o00oo1, Continuation<? super o0ooOOo> continuation) {
        super(continuation);
        this.f38205OooO0oO = o00oo1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f38203OooO0o = obj;
        this.f38206OooO0oo |= Integer.MIN_VALUE;
        return o00Oo0.OooO00o(this.f38205OooO0oO, null, this);
    }
}

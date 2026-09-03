package p200o00o0OoO;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.svga.SharedSvgaManager", f = "SharedSvgaManager.kt", i = {0, 0}, l = {60, 61}, m = "loadSvgaFromNet", n = {"this", "key"}, s = {"L$0", "L$1"})
public final class o00Oo00 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00OOO0O f39308OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f39309OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f39310OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00OOO0O f39311OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f39312OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(o00OOO0O o00ooo0o2, Continuation<? super o00Oo00> continuation) {
        super(continuation);
        this.f39311OooO0oO = o00ooo0o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f39309OooO0o = obj;
        this.f39312OooO0oo |= Integer.MIN_VALUE;
        return o00OOO0O.OooO00o(this.f39311OooO0oO, null, this);
    }
}

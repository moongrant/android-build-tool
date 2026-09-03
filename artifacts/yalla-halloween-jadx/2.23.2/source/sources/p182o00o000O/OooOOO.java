package p182o00o000O;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import oo00oO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.cloudfilemanager.CloudFileManager", f = "CloudFileManager.kt", i = {0, 0}, l = {146, 148, 149}, m = "upload", n = {"this", "uploadRequest"}, s = {"L$0", "L$1"})
public final class OooOOO extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOO0O f38425OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f38426OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f38427OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O<Object> f38428OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f38429OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(OooOO0O<Object> oooOO0O, Continuation<? super OooOOO> continuation) {
        super(continuation);
        this.f38428OooO0oO = oooOO0O;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f38426OooO0o = obj;
        this.f38429OooO0oo |= Integer.MIN_VALUE;
        return OooOO0O.OooO00o(this.f38428OooO0oO, null, null, this);
    }
}

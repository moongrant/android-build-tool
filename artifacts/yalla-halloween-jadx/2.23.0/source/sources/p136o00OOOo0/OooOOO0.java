package p136o00OOOo0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137o00OOOoO.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.cloudfilemanager.CloudFileManager", f = "CloudFileManager.kt", i = {0, 0}, l = {146, 148, 149}, m = "upload", n = {"this", "uploadRequest"}, s = {"L$0", "L$1"})
public final class OooOOO0 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOO0 f37383OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f37384OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0OO f37385OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0<Object> f37386OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f37387OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(OooOO0<Object> oooOO1, Continuation<? super OooOOO0> continuation) {
        super(continuation);
        this.f37386OooO0oO = oooOO1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f37384OooO0o = obj;
        this.f37387OooO0oo |= Integer.MIN_VALUE;
        return OooOO0.OooO00o(this.f37386OooO0oO, null, null, this);
    }
}

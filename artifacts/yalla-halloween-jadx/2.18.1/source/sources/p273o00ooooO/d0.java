package p273o00ooooO;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.common.support.apm.uploader.XLogFileUploader", f = "XLogFileUploader.kt", i = {0, 0, 0, 1, 1}, l = {69, 77, 78}, m = "upload", n = {"this", "part", "clientVersionBody", "part", "clientVersionBody"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
public final class d0 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public /* synthetic */ Object f34981Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Object f34982Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object f34983Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o0o0Oo f34984Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f34985OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ e0 f34986OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, Continuation<? super d0> continuation) {
        super(continuation);
        this.f34986OoooO00 = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f34981Oooo = obj;
        this.f34985OoooO0 |= Integer.MIN_VALUE;
        return e0.OooO00o(this.f34986OoooO00, null, this);
    }
}

package p412o0Oo0o0O;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.LoginRepo", f = "LoginRepo.kt", i = {}, l = {134}, m = "checkVerCodeSendType", n = {}, s = {})
public final class o00O0OOO extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f46148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f46149OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O0OO f46150OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(o00O0OO o00o0oo2, Continuation<? super o00O0OOO> continuation) {
        super(continuation);
        this.f46150OooO0o0 = o00o0oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f46148OooO0Oo = obj;
        this.f46149OooO0o |= Integer.MIN_VALUE;
        return this.f46150OooO0o0.OooO0O0(0, null, this);
    }
}

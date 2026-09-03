package p480o0o000O;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketMessageHandler", f = "IMSocketMessageHandler.kt", i = {}, l = {147}, m = "confirmMessage", n = {}, s = {})
public final class Oooo0 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f48404OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f48405OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000oOoO f48406OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(o000oOoO o000oooo2, Continuation<? super Oooo0> continuation) {
        super(continuation);
        this.f48406OooO0o0 = o000oooo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f48404OooO0Oo = obj;
        this.f48405OooO0o |= Integer.MIN_VALUE;
        return o000oOoO.OooO0O0(this.f48406OooO0o0, null, this);
    }
}

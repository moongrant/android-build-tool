package p481o0o000o0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.statistical.WebEventUtil", f = "WebEventUtil.kt", i = {}, l = {75}, m = "uploadRoomVoiceStatistical", n = {}, s = {})
public final class Oooo0 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f47697OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f47698OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f47699OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(OooOo00 oooOo00, Continuation<? super Oooo0> continuation) {
        super(continuation);
        this.f47699OooO0o0 = oooOo00;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f47697OooO0Oo = obj;
        this.f47698OooO0o |= Integer.MIN_VALUE;
        return OooOo00.OooO00o(this.f47699OooO0o0, this);
    }
}

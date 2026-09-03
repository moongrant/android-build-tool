package p500o0o00Ooo;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.common.statistical.WebEventUtil", f = "WebEventUtil.kt", i = {}, l = {75}, m = "uploadRoomVoiceStatistical", n = {}, s = {})
public final class o0000oo extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public /* synthetic */ Object f41388Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f41389Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f41390Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(o0000Ooo o0000ooo, Continuation<? super o0000oo> continuation) {
        super(continuation);
        this.f41389Oooo0oO = o0000ooo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f41388Oooo0o = obj;
        this.f41390Oooo0oo |= Integer.MIN_VALUE;
        return o0000Ooo.OooO00o(this.f41389Oooo0oO, this);
    }
}

package p460o0Ooo0o;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.utils.FFmpegCmdUtils", f = "FFmpegCmdUtils.kt", i = {0, 0}, l = {56}, m = "cutUpAudioByReturnAAC", n = {"cutUpAACPath", "startTime"}, s = {"L$0", "J$0"})
public final class o00OO00O extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f47792OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f47793OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f47794OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oo0O f47795OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f47796OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(oo0O oo0o, Continuation<? super o00OO00O> continuation) {
        super(continuation);
        this.f47795OooO0oO = oo0o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f47793OooO0o = obj;
        this.f47796OooO0oo |= Integer.MIN_VALUE;
        return this.f47795OooO0oO.OooO0O0(null, null, null, this);
    }
}

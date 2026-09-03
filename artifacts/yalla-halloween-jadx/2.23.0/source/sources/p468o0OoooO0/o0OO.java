package p468o0OoooO0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.utils.FFmpegCmdUtils", f = "FFmpegCmdUtils.kt", i = {0, 0}, l = {185}, m = "compressVideo", n = {"dstFilePath", "startTime"}, s = {"L$0", "J$0"})
public final class o0OO extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f46901OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f46902OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f46903OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0OOOO00 f46904OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f46905OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO(o0OOOO00 o0oooo01, Continuation<? super o0OO> continuation) {
        super(continuation);
        this.f46904OooO0oO = o0oooo01;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f46902OooO0o = obj;
        this.f46905OooO0oo |= Integer.MIN_VALUE;
        return this.f46904OooO0oO.OooO00o(null, null, 0L, null, 0.0f, 0.0f, null, this);
    }
}

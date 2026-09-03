package p617o0oo0o;

import com.yalla.yalla.model.MomentSendModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendEditUtil", f = "MomentSendEditUtil.kt", i = {0}, l = {61}, m = "changePic", n = {"sendPostModel"}, s = {"L$0"})
public final class o000O00O extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f48504Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public MomentSendModel f48505Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f48506Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000O00 f48507Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(o000O00 o000o01, Continuation<? super o000O00O> continuation) {
        super(continuation);
        this.f48507Oooo0oo = o000o01;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f48506Oooo0oO = obj;
        this.f48504Oooo |= Integer.MIN_VALUE;
        return o000O00.OooO00o(this.f48507Oooo0oo, null, this);
    }
}

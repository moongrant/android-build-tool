package p617o0oo0o;

import com.yalla.yalla.model.MomentSendModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendEditUtil", f = "MomentSendEditUtil.kt", i = {0}, l = {82}, m = "sendEdit", n = {"sendPostModel"}, s = {"L$0"})
public final class o000OO0O extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f48528Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public MomentSendModel f48529Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f48530Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000O00 f48531Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(o000O00 o000o01, Continuation<? super o000OO0O> continuation) {
        super(continuation);
        this.f48531Oooo0oo = o000o01;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f48530Oooo0oO = obj;
        this.f48528Oooo |= Integer.MIN_VALUE;
        return o000O00.OooO0O0(this.f48531Oooo0oo, null, this);
    }
}

package p590o0oOooo0;

import com.yalla.yalla.model.moment.MomentSendModel;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendEditUtil", f = "MomentSendEditUtil.kt", i = {0, 0, 0}, l = {186}, m = "uploadImage", n = {"this", "uploadPostModel", "allUploadFiles"}, s = {"L$0", "L$1", "L$2"})
public final class u extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f57289OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public p f57290OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList f57291OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public MomentSendModel f57292OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public /* synthetic */ Object f57293OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ p f57294OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p pVar, Continuation<? super u> continuation) {
        super(continuation);
        this.f57294OooO0oo = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f57293OooO0oO = obj;
        this.f57289OooO |= Integer.MIN_VALUE;
        return p.OooO0OO(this.f57294OooO0oo, null, this);
    }
}

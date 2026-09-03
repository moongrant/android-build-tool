package p579o0oOoo;

import com.yalla.yalla.model.moment.MomentSendModel;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendEditUtil", f = "MomentSendEditUtil.kt", i = {0, 0, 0}, l = {186}, m = "uploadImage", n = {"this", "uploadPostModel", "allUploadFiles"}, s = {"L$0", "L$1", "L$2"})
public final class oO0OO00 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f56598OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oO0O0Oo0 f56599OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList f56600OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public MomentSendModel f56601OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public /* synthetic */ Object f56602OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ oO0O0Oo0 f56603OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00(oO0O0Oo0 oo0o0oo0, Continuation<? super oO0OO00> continuation) {
        super(continuation);
        this.f56603OooO0oo = oo0o0oo0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f56602OooO0oO = obj;
        this.f56598OooO |= Integer.MIN_VALUE;
        return oO0O0Oo0.OooO0OO(this.f56603OooO0oo, null, this);
    }
}

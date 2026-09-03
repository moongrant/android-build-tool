package p475o0Ooooo0;

import com.facebook.share.internal.ShareInternalUtility;
import com.yalla.yalla.repository.CloudFileRepo;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.repository.CloudFileRepo", f = "CloudFileRepo.kt", i = {0}, l = {35}, m = "uploadFileResult", n = {ShareInternalUtility.STAGING_PARAM}, s = {"L$0"})
public final class oO0O00oO extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List f48101OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ CloudFileRepo f48102OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f48103OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f48104OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00oO(CloudFileRepo cloudFileRepo, Continuation<? super oO0O00oO> continuation) {
        super(continuation);
        this.f48102OooO0o = cloudFileRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f48103OooO0o0 = obj;
        this.f48104OooO0oO |= Integer.MIN_VALUE;
        return this.f48102OooO0o.OooO0o(null, null, null, false, null, this);
    }
}

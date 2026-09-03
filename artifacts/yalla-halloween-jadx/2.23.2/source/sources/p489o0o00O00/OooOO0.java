package p489o0o00O00;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.statistical.WebEventUtil", f = "WebEventUtil.kt", i = {}, l = {75}, m = "uploadRoomVoiceStatistical", n = {}, s = {})
public final class OooOO0 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f48925OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f48926OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f48927OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooO0OO oooO0OO, Continuation<? super OooOO0> continuation) {
        super(continuation);
        this.f48927OooO0o0 = oooO0OO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f48925OooO0Oo = obj;
        this.f48926OooO0o |= Integer.MIN_VALUE;
        return OooO0OO.OooO00o(this.f48927OooO0o0, this);
    }
}

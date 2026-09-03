package p617o0oo0o;

import com.yalla.yalla.model.MomentSendModel;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.util.MomentSendEditUtil", f = "MomentSendEditUtil.kt", i = {0, 0, 0}, l = {144}, m = "uploadImage", n = {"this", "sendPostModel", "allUploadFiles"}, s = {"L$0", "L$1", "L$2"})
public final class o000O0O0 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public /* synthetic */ Object f48508Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o000O00 f48509Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public MomentSendModel f48510Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ArrayList f48511Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f48512OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o000O00 f48513OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(o000O00 o000o01, Continuation<? super o000O0O0> continuation) {
        super(continuation);
        this.f48513OoooO00 = o000o01;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f48508Oooo = obj;
        this.f48512OoooO0 |= Integer.MIN_VALUE;
        return o000O00.OooO0OO(this.f48513OoooO00, null, this);
    }
}

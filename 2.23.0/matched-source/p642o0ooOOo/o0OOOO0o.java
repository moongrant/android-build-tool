package p642o0ooOOo;

import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OOOO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f59571OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f59572OooO0o0;

    public /* synthetic */ o0OOOO0o(Object obj, int i) {
        this.f59571OooO0Oo = i;
        this.f59572OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f59571OooO0Oo;
        Object obj = this.f59572OooO0o0;
        switch (i) {
            case 0:
                Function0 tmp0 = (Function0) obj;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            default:
                MomentDetailCommentFragment.smoothScrollToPositionCommentMessageIndex$lambda$6((MomentDetailCommentFragment) obj);
                break;
        }
    }
}

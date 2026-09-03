package o0O0OOO;

import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p192o00o0O0.o0000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Oooo0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f35591Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f35592Oooo0oO;

    public /* synthetic */ Oooo0(Object obj, int i) {
        this.f35591Oooo0o = i;
        this.f35592Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35591Oooo0o) {
            case 0:
                o000oOoO o000oooo2 = (o000oOoO) this.f35592Oooo0oO;
                o000oooo2.f35605OooO0Oo.OooO0O0(new o0000(o000oooo2));
                break;
            default:
                PostDetailActivity this$0 = (PostDetailActivity) this.f35592Oooo0oO;
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooO().f50594OooOo00.setCurrentItem(this$0.f22436o0OOO0o);
                break;
        }
    }
}

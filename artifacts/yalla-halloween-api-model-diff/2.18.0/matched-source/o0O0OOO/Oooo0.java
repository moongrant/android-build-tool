package o0O0OOO;

import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p193o00o0O0.o0000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Oooo0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f35612Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f35613OoooO00;

    public /* synthetic */ Oooo0(Object obj, int i) {
        this.f35612Oooo = i;
        this.f35613OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35612Oooo) {
            case 0:
                o000oOoO o000oooo2 = (o000oOoO) this.f35613OoooO00;
                o000oooo2.f35626OooO0Oo.OooO0O0(new o0000(o000oooo2));
                break;
            default:
                PostDetailActivity this$0 = (PostDetailActivity) this.f35613OoooO00;
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooO().f50531OooOo00.setCurrentItem(this$0.f22462oo0o0Oo);
                break;
        }
    }
}

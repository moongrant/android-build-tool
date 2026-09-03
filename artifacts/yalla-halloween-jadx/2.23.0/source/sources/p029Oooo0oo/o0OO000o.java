package p029Oooo0oo;

import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo0O.o000oOoO;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OO000o implements o00O000.OooO0OO, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1293OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1294OooO0o0;

    public /* synthetic */ o0OO000o(Object obj, int i) {
        this.f1293OooO0Oo = i;
        this.f1294OooO0o0 = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        int i = this.f1293OooO0Oo;
        Object obj = this.f1294OooO0o0;
        switch (i) {
            case 1:
                SearchFriendActivity this$0 = (SearchFriendActivity) obj;
                int i2 = SearchFriendActivity.f25719OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOo0(false);
                break;
            default:
                MainMomentsTopicAddMoreFragment.initView$lambda$1((MainMomentsTopicAddMoreFragment) obj);
                break;
        }
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        ((o0OO00OO) this.f1294OooO0o0).f1300OooO0o0 = oooO00o;
        return "CaptureCompleteFuture";
    }
}

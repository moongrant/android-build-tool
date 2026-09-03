package p540o0o0Oo0;

import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import kotlin.jvm.internal.Intrinsics;
import p187o00o00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O000O implements o0ooOOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f44008Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ BaseActivityK f44009OoooO00;

    public /* synthetic */ o0O000O(BaseActivityK baseActivityK, int i) {
        this.f44008Oooo = i;
        this.f44009OoooO00 = baseActivityK;
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f44008Oooo) {
            case 0:
                TopicBlackListActivity this$0 = (TopicBlackListActivity) this.f44009OoooO00;
                int i = TopicBlackListActivity.f22558OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooo(true);
                break;
            default:
                UserPostListActivity this$1 = (UserPostListActivity) this.f44009OoooO00;
                UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22693o00O0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.Oooo00O(false);
                break;
        }
    }
}

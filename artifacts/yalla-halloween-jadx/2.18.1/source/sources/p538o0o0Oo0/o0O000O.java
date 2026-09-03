package p538o0o0Oo0;

import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import kotlin.jvm.internal.Intrinsics;
import p186o00o00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O000O implements o0ooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f43993OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseActivityK f43994OooO0o0;

    public /* synthetic */ o0O000O(BaseActivityK baseActivityK, int i) {
        this.f43993OooO0Oo = i;
        this.f43994OooO0o0 = baseActivityK;
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f43993OooO0Oo) {
            case 0:
                TopicBlackListActivity this$0 = (TopicBlackListActivity) this.f43994OooO0o0;
                int i = TopicBlackListActivity.f22539OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooo(true);
                break;
            default:
                UserPostListActivity this$1 = (UserPostListActivity) this.f43994OooO0o0;
                UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22674Ooooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.Oooo00O(false);
                break;
        }
    }
}

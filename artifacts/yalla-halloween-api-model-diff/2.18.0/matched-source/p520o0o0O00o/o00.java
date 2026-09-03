package p520o0o0O00o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00 implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ o00 f42189OooO0O0 = new o00(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ o00 f42190OooO0OO = new o00(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f42191OooO00o;

    public /* synthetic */ o00(int i) {
        this.f42191OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f42191OooO00o) {
            case 0:
                SharedMessageVM.m295_get_unreadMessageCount_$lambda6$lambda1((Integer) obj);
                break;
            default:
                TopicDetailActivity.OooO00o oooO00o = TopicDetailActivity.f22586o00Oo0;
                break;
        }
    }
}

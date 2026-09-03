package o000O00O;

import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Player;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment;
import com.yalla.yalla.ui.vm.user.SupportTopVM;
import io.opentelemetry.compat.Predicate;
import kotlin.jvm.internal.Intrinsics;
import p506o0o00oOo.oO0O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO0O implements o000OoO.o00000O0.OooO00o, p338o0OO0oOo.Oooo0, p559o0oOo.o00O0O, Predicate {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34037OooO0Oo;

    public /* synthetic */ o000OO0O(Object obj) {
        this.f34037OooO0Oo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p338o0OO0oOo.Oooo0
    public final void OooO00o(SmartRefreshLayout it) {
        SupportTopActivity this$0 = (SupportTopActivity) this.f34037OooO0Oo;
        int i = SupportTopActivity.f26727OooOo0O;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((SupportTopVM) this$0.f26730OooOo00.getValue()).loadSupportInfo().observe(this$0, new oO0O000(this$0, 0));
    }

    @Override // io.opentelemetry.compat.Predicate
    public final boolean OooO0O0(Object obj) {
        return ((String) this.f34037OooO0Oo).equals((String) obj);
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        MainMomentsTopicFollowingFragment.initView$lambda$3((MainMomentsTopicFollowingFragment) this.f34037OooO0Oo);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onDeviceInfoChanged((DeviceInfo) this.f34037OooO0Oo);
    }
}

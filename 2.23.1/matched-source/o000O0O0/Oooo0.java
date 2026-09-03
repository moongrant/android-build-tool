package o000O0O0;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment;
import kotlin.jvm.internal.Intrinsics;
import p426o0OoO0Oo.oo0oOO0;
import p492o0o00O0O.o000OOo;
import p492o0o00O0O.o0O0O00;
import p569o0oOo0Oo.o0O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oooo0 implements MediaCodecUtil.OooO, o0O0OO0, BaseQuickAdapter.OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34229OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34230OooO0o0;

    public /* synthetic */ Oooo0(Object obj, int i) {
        this.f34229OooO0Oo = i;
        this.f34230OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        ExploreCountryRoomListFragment.initView$lambda$1((ExploreCountryRoomListFragment) this.f34230OooO0o0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO
    public final int OooO0OO(Object obj) {
        androidx.media3.common.OooOO0 oooOO1 = (androidx.media3.common.OooOO0) this.f34230OooO0o0;
        androidx.media3.exoplayer.mediacodec.OooO0o oooO0o = (androidx.media3.exoplayer.mediacodec.OooO0o) obj;
        oooO0o.getClass();
        String str = oooOO1.f6417OooOOOO;
        String str2 = oooO0o.f7760OooO0O0;
        return ((str2.equals(str) || str2.equals(MediaCodecUtil.OooO0O0(oooOO1))) && oooO0o.OooO0OO(oooOO1, false)) ? 1 : 0;
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        int i = this.f34229OooO0Oo;
        Object obj = this.f34230OooO0o0;
        switch (i) {
            case 1:
                BlackListActivity this$0 = (BlackListActivity) obj;
                int i2 = BlackListActivity.f24915OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f24917OooOOo0 = 1;
                oo0oOO0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this$0), new o0O0O00(this$0, null)).observe(this$0, new BlackListActivity.OooO00o(new o000OOo(this$0, true)));
                break;
            default:
                BanEnterRoomListActivity this$1 = (BanEnterRoomListActivity) obj;
                int i3 = BanEnterRoomListActivity.f26015OooOooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!this$1.f26026OooOoOO) {
                    this$1.f26017OooOOo0 = "";
                    this$1.OooOo0O(true);
                } else {
                    this$1.OooOo0o(this$1.f26027OooOoo, true);
                }
                break;
        }
    }
}

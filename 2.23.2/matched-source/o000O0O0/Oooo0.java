package o000O0O0;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment;
import kotlin.jvm.internal.Intrinsics;
import p424o0OoO0Oo.o00O;
import p487o0o00O.o0OO00O;
import p487o0o00O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oooo0 implements MediaCodecUtil.OooO, p559o0oOo.o00O0O, BaseQuickAdapter.OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34232OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34233OooO0o0;

    public /* synthetic */ Oooo0(Object obj, int i) {
        this.f34232OooO0Oo = i;
        this.f34233OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        ExploreCountryRoomListFragment.initView$lambda$1((ExploreCountryRoomListFragment) this.f34233OooO0o0);
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        int i = this.f34232OooO0Oo;
        Object obj = this.f34233OooO0o0;
        switch (i) {
            case 1:
                BlackListActivity this$0 = (BlackListActivity) obj;
                int i2 = BlackListActivity.f24914OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                o00O.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this$0), new o0Oo0oo(this$0, null)).observe(this$0, new BlackListActivity.OooO00o(new o0OO00O(this$0, false)));
                break;
            default:
                BanEnterRoomListActivity this$1 = (BanEnterRoomListActivity) obj;
                int i3 = BanEnterRoomListActivity.f26013OooOooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!this$1.f26024OooOoOO) {
                    this$1.OooOo0O(false);
                } else {
                    this$1.OooOo0o(this$1.f26025OooOoo, false);
                }
                break;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO
    public final int OooO0o0(Object obj) {
        androidx.media3.common.OooOO0 oooOO1 = (androidx.media3.common.OooOO0) this.f34233OooO0o0;
        androidx.media3.exoplayer.mediacodec.OooO0o oooO0o = (androidx.media3.exoplayer.mediacodec.OooO0o) obj;
        oooO0o.getClass();
        String str = oooOO1.f6412OooOOOO;
        String str2 = oooO0o.f7755OooO0O0;
        return ((str2.equals(str) || str2.equals(MediaCodecUtil.OooO0O0(oooOO1))) && oooO0o.OooO0OO(oooOO1, false)) ? 1 : 0;
    }
}

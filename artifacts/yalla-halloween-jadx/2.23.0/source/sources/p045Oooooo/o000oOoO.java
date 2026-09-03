package p045Oooooo;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.OooO0o;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.adapter.o000OOo;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import p466o0Oooo0o.o00O00OO;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements o00O000.OooO0OO, BaseQuickAdapter.OooO0o, MediaCodecUtil.OooO, o00O00OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1983OooO0Oo;

    public /* synthetic */ o000oOoO(Object obj) {
        this.f1983OooO0Oo = obj;
    }

    @Override // p466o0Oooo0o.o00O00OO
    public void OooO00o(RoomIndexModel roomIndexModel) {
        MainRoomPopularFragment.initView$lambda$3$lambda$1((MainRoomPopularFragment) this.f1983OooO0Oo, roomIndexModel);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO
    public int OooO0O0(Object obj) {
        OooOo oooOo = (OooOo) this.f1983OooO0Oo;
        OooO0o oooO0o = (OooO0o) obj;
        oooO0o.getClass();
        String str = oooOo.f11211OooOOOO;
        String str2 = oooO0o.f12520OooO0O0;
        return ((str2.equals(str) || str2.equals(MediaCodecUtil.OooO0O0(oooOo))) && oooO0o.OooO0OO(oooOo, false)) ? 1 : 0;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        o000OOo this$0 = (o000OOo) this.f1983OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i2 = this$0.f27547OooOooO;
        if (i2 == i) {
            this$0.f27547OooOooO = -1;
            baseQuickAdapter.notifyItemChanged(i2);
        } else {
            this$0.f27547OooOooO = i;
            if (i2 >= 0) {
                baseQuickAdapter.notifyItemChanged(i2);
            }
            baseQuickAdapter.notifyItemChanged(this$0.f27547OooOooO);
        }
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public Object OooO0o0(o00O000.OooO00o oooO00o) {
        ((AtomicReference) this.f1983OooO0Oo).set(oooO00o);
        return "Data closed";
    }
}

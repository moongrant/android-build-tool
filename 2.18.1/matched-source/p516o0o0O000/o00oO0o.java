package p516o0o0O000;

import androidx.lifecycle.Observer;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p405o0Oo0OO0.OooOo;
import p616o0oo0Ooo.oO0O00;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00oO0o implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f42109OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f42110OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f42111OooO0OO;

    public /* synthetic */ o00oO0o(Object obj, Object obj2, int i) {
        this.f42109OooO00o = i;
        this.f42110OooO0O0 = obj;
        this.f42111OooO0OO = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String url;
        switch (this.f42109OooO00o) {
            case 0:
                Function0 function0 = (Function0) this.f42110OooO0O0;
                SVGAView svgaImageView = (SVGAView) this.f42111OooO0OO;
                OooOo oooOo = (OooOo) obj;
                Intrinsics.checkNotNullParameter(svgaImageView, "$svgaImageView");
                if (function0 != null) {
                    function0.invoke();
                }
                svgaImageView.setVideoItem(oooOo);
                svgaImageView.OooO0OO();
                break;
            default:
                o000O o000o = (o000O) this.f42110OooO0O0;
                CreateRoomActivity this$0 = (CreateRoomActivity) this.f42111OooO0OO;
                CloudFileInfo cloudFileInfo = (CloudFileInfo) obj;
                CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22774Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o000o.OooO00o();
                if (cloudFileInfo != null && (url = cloudFileInfo.getUrl()) != null) {
                    this$0.f22785OoooooO = url;
                    oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this$0);
                    NetImageView netImageView = null;
                    oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize$default(url, OooOo00.OooO00o(110), false, 2, null);
                    oooO00o2.f48427OooO00o = 0;
                    oooO00o2.OooO0oO(OooOo00.OooO00o(6));
                    NetImageView netImageView2 = this$0.f22775OoooOo0;
                    if (netImageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
                    } else {
                        netImageView = netImageView2;
                    }
                    oooO00o2.OooO0o(netImageView);
                    break;
                }
                break;
        }
    }
}

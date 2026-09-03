package p518o0o0O000;

import androidx.lifecycle.Observer;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p408o0Oo0OO0.OooOo;
import p618o0oo0Ooo.oO0O000o;
import p709oOooo0o.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00oO0o implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f42128OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f42129OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f42130OooO0OO;

    public /* synthetic */ o00oO0o(Object obj, Object obj2, int i) {
        this.f42128OooO00o = i;
        this.f42129OooO0O0 = obj;
        this.f42130OooO0OO = obj2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String url;
        switch (this.f42128OooO00o) {
            case 0:
                Function0 function0 = (Function0) this.f42129OooO0O0;
                SVGAView svgaImageView = (SVGAView) this.f42130OooO0OO;
                OooOo oooOo = (OooOo) obj;
                Intrinsics.checkNotNullParameter(svgaImageView, "$svgaImageView");
                if (function0 != null) {
                    function0.invoke();
                }
                svgaImageView.setVideoItem(oooOo);
                svgaImageView.OooO0OO();
                break;
            default:
                o000O o000o = (o000O) this.f42129OooO0O0;
                CreateRoomActivity this$0 = (CreateRoomActivity) this.f42130OooO0OO;
                CloudFileInfo cloudFileInfo = (CloudFileInfo) obj;
                CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22793o00O0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o000o.OooO00o();
                if (cloudFileInfo != null && (url = cloudFileInfo.getUrl()) != null) {
                    this$0.f22804ooOO = url;
                    oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this$0);
                    NetImageView netImageView = null;
                    oooO00o2.f48447OooO0OO = CloudImageUtilKt.imgSize$default(url, OooOo00.OooO00o(110), false, 2, null);
                    oooO00o2.f48445OooO00o = 0;
                    oooO00o2.OooO0oO(OooOo00.OooO00o(6));
                    NetImageView netImageView2 = this$0.f22794Ooooo00;
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

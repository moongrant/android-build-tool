package p182o00o0000;

import android.app.Activity;
import android.widget.TextView;
import com.app.base.view.imageMore.ImageMoreItemView;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.NetworkUtil;
import java.util.ArrayList;
import java.util.Objects;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public class o0Oo0oo<ItemView> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Activity f32962OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ArrayList<ItemView> f32964OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o<ItemView> f32965OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public oO0O00.OooO00o f32966OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0OOO0o f32968OooO0oO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f32963OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f32967OooO0o0 = false;

    public interface OooO00o<ItemView> {
    }

    public o0Oo0oo(Activity activity) {
        this.f32962OooO00o = activity;
    }

    public final void OooO00o() {
        if (this.f32964OooO0OO == null) {
            this.f32964OooO0OO = new ArrayList<>();
        }
        ArrayList<ItemView> arrayList = this.f32964OooO0OO;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.f32967OooO0o0 = false;
        int i = this.f32963OooO0O0 + 1;
        this.f32963OooO0O0 = i;
        if (i < 0 || i >= this.f32964OooO0OO.size()) {
            this.f32963OooO0O0 = 0;
        }
        ItemView itemview = this.f32964OooO0OO.get(this.f32963OooO0O0);
        OooO00o<ItemView> oooO00o = this.f32965OooO0Oo;
        if (oooO00o != null) {
            this.f32964OooO0OO.size();
            o0OO00O o0oo00o2 = (o0OO00O) oooO00o;
            Objects.requireNonNull(o0oo00o2);
            ImageMoreItemView imageMoreItemView = (ImageMoreItemView) itemview;
            if (NetworkUtil.f20498OooO00o.OooO0OO() == NetworkUtil.NetworkType.NETWORK_WIFI) {
                oO0O00.OooO00o oooO00o2 = o0oo00o2.f32959OooO00o.f32966OooO0o;
                Objects.requireNonNull(imageMoreItemView);
                if (oooO00o2 == null) {
                    return;
                }
                TextView textView = imageMoreItemView.f12182Oooo0oO;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                String strImgSize = CloudImageUtilKt.imgSize(imageMoreItemView.getData().getUrl(), imageMoreItemView.getData().getWidth(), imageMoreItemView.getData().getHeight());
                oooO00o2.f48454OooOoo0 = 2;
                oooO00o2.OooO0oO(4);
                oooO00o2.f48441OooOOOo = 0;
                oooO00o2.f48443OooOOo0 = imageMoreItemView.getImageIv().getDrawable();
                oooO00o2.f48442OooOOo = imageMoreItemView.getImageIv().getDrawable();
                oooO00o2.f48429OooO0OO = strImgSize;
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.OooO0o(imageMoreItemView.getImageIv());
            }
        }
    }
}

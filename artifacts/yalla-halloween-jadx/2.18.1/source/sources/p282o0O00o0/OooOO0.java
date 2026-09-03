package p282o0O00o0;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.oo000o;
import com.app.base.view.banner.BannerView;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends LinearLayoutManager {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BannerView f35206Oooo0o;

    public class OooO00o extends oo000o {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.oo000o
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            BannerView bannerView = OooOO0.this.f35206Oooo0o;
            return (bannerView.f12152Oooo / bannerView.getHeight()) / displayMetrics.scaledDensity;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(BannerView bannerView, Context context) {
        super(context);
        this.f35206Oooo0o = bannerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2, int i) {
        OooO00o oooO00o = new OooO00o(recyclerView.getContext());
        oooO00o.setTargetPosition(i);
        startSmoothScroll(oooO00o);
    }
}

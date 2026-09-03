package p563o0oOo0;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.BarBannerModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import com.youth.banner.adapter.BannerAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 extends BannerAdapter<BarBannerModel.BarBannerItem, OooO00o> {

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends RecyclerView.oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final NetImageView f44957OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull NetImageView iv) {
            super(iv);
            Intrinsics.checkNotNullParameter(iv, "iv");
            this.f44957OooO00o = iv;
        }
    }

    public Oooo000(@Nullable List<BarBannerModel.BarBannerItem> list) {
        super(list);
    }

    @Override // com.youth.banner.adapter.IViewHolder
    public final void onBindView(Object obj, Object obj2, int i, int i2) {
        OooO00o oooO00o = (OooO00o) obj;
        BarBannerModel.BarBannerItem data = (BarBannerModel.BarBannerItem) obj2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNull(oooO00o);
        if (oooO00o.f44957OooO00o.getContext() instanceof Activity) {
            Context context = oooO00o.f44957OooO00o.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(oooO00o.f44957OooO00o.getContext());
        oooO00o2.f48429OooO0OO = data.getImageUrl();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.f48441OooOOOo = R.drawable.icon_picture_default_banner;
        oooO00o2.f48431OooO0o = R.drawable.icon_picture_default_banner;
        oooO00o2.f48432OooO0o0 = true;
        oooO00o2.OooO0oO(15);
        oooO00o2.OooO0o(oooO00o.f44957OooO00o);
    }

    @Override // com.youth.banner.adapter.IViewHolder
    public final Object onCreateHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNull(viewGroup);
        NetImageView netImageView = new NetImageView(viewGroup.getContext());
        netImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        netImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new OooO00o(netImageView);
    }
}

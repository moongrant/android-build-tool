package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class kd implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f49858OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f49859OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49860OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f49861OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f49862OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f49863OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49864OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49865OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49866OooO0oo;

    public kd(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull NetImageView netImageView3, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f49859OooO00o = relativeLayout;
        this.f49860OooO0O0 = imageView;
        this.f49861OooO0OO = netImageView;
        this.f49862OooO0Oo = netImageView2;
        this.f49864OooO0o0 = netImageView3;
        this.f49863OooO0o = relativeLayout2;
        this.f49865OooO0oO = textView;
        this.f49866OooO0oo = textView2;
        this.f49858OooO = textView3;
    }

    @NonNull
    public static kd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49859OooO00o;
    }

    @NonNull
    public static kd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_detail_gift_giver_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivArrow;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivArrow);
        if (imageView != null) {
            i = R.id.ivGiftGiver0;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftGiver0);
            if (netImageView != null) {
                i = R.id.ivGiftGiver1;
                NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftGiver1);
                if (netImageView2 != null) {
                    i = R.id.ivGiftGiver2;
                    NetImageView netImageView3 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftGiver2);
                    if (netImageView3 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                        i = R.id.tvGiftTotalProp;
                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvGiftTotalProp);
                        if (textView != null) {
                            i = R.id.tvGifters;
                            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvGifters);
                            if (textView2 != null) {
                                i = R.id.tvNoGifters;
                                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvNoGifters);
                                if (textView3 != null) {
                                    return new kd(relativeLayout, imageView, netImageView, netImageView2, netImageView3, relativeLayout, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

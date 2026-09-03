package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class xb implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final SVGAView f59347OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59348OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f59349OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f59350OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f59351OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f59352OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f59353OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59354OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59355OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f59356OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f59357OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f59358OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f59359OooOOO0;

    public xb(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull Group group, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull SVGAView sVGAView, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull SVGAView sVGAView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView2) {
        this.f59348OooO00o = constraintLayout;
        this.f59349OooO0O0 = imageView;
        this.f59350OooO0OO = group;
        this.f59351OooO0Oo = netImageView;
        this.f59353OooO0o0 = netImageView2;
        this.f59352OooO0o = sVGAView;
        this.f59354OooO0oO = constraintLayout2;
        this.f59355OooO0oo = linearLayout;
        this.f59347OooO = sVGAView2;
        this.f59356OooOO0 = textView;
        this.f59357OooOO0O = textView2;
        this.f59358OooOO0o = textView3;
        this.f59359OooOOO0 = imageView2;
    }

    @NonNull
    public static xb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59348OooO00o;
    }

    @NonNull
    public static xb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_room_run_way_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.contentBg;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.contentGroup;
            Group group = (Group) OooOO0.OooO00o(i, viewInflate);
            if (group != null) {
                i = oO00O0oO.ivArrow;
                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.ivBigBg;
                    if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.ivFromHead;
                        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                        if (netImageView != null) {
                            i = oO00O0oO.ivFromHeadClick;
                            NetImageView netImageView2 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                            if (netImageView2 != null) {
                                i = oO00O0oO.ivGift;
                                SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                if (sVGAView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i = oO00O0oO.layoutCount;
                                    LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                    if (linearLayout != null) {
                                        i = oO00O0oO.svgaBg;
                                        SVGAView sVGAView2 = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                        if (sVGAView2 != null) {
                                            i = oO00O0oO.tvContentTips;
                                            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView != null) {
                                                i = oO00O0oO.tvFromUser;
                                                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView2 != null) {
                                                    i = oO00O0oO.tvToUser;
                                                    TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = oO00O0oO.xTv;
                                                        ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                                        if (imageView2 != null) {
                                                            return new xb(constraintLayout, imageView, group, netImageView, netImageView2, sVGAView, constraintLayout, linearLayout, sVGAView2, textView, textView2, textView3, imageView2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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

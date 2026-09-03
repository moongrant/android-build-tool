package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class m3 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final SVGAView f44165OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44166OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44167OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f44168OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f44169OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f44170OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f44171OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44172OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44173OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44174OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f44175OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44176OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f44177OooOOO0;

    public m3(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull Group group, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull SVGAView sVGAView, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull SVGAView sVGAView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView2) {
        this.f44166OooO00o = constraintLayout;
        this.f44167OooO0O0 = imageView;
        this.f44168OooO0OO = group;
        this.f44169OooO0Oo = netImageView;
        this.f44171OooO0o0 = netImageView2;
        this.f44170OooO0o = sVGAView;
        this.f44172OooO0oO = constraintLayout2;
        this.f44173OooO0oo = linearLayout;
        this.f44165OooO = sVGAView2;
        this.f44174OooOO0 = textView;
        this.f44175OooOO0O = textView2;
        this.f44176OooOO0o = textView3;
        this.f44177OooOOO0 = imageView2;
    }

    @NonNull
    public static m3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44166OooO00o;
    }

    @NonNull
    public static m3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_room_run_way_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.contentBg;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.contentGroup;
            Group group = (Group) OooO0O0.OooO00o(i, viewInflate);
            if (group != null) {
                i = o0OO00O.ivArrow;
                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.ivBigBg;
                    if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.ivFromHead;
                        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (netImageView != null) {
                            i = o0OO00O.ivFromHeadClick;
                            NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (netImageView2 != null) {
                                i = o0OO00O.ivGift;
                                SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                if (sVGAView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    i = o0OO00O.layoutCount;
                                    LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                    if (linearLayout != null) {
                                        i = o0OO00O.svgaBg;
                                        SVGAView sVGAView2 = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                        if (sVGAView2 != null) {
                                            i = o0OO00O.tvContentTips;
                                            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView != null) {
                                                i = o0OO00O.tvFromUser;
                                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView2 != null) {
                                                    i = o0OO00O.tvToUser;
                                                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = o0OO00O.xTv;
                                                        ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (imageView2 != null) {
                                                            return new m3(constraintLayout, imageView, group, netImageView, netImageView2, sVGAView, constraintLayout, linearLayout, sVGAView2, textView, textView2, textView3, imageView2);
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

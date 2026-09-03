package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.DotView;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserMedalView;
import com.yalla.yalla.common.ui.view.UserNameView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.UserPrettyIdView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class wa implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f50870OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50871OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final DotView f50872OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f50873OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50874OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final xa f50875OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final UserPrettyIdView f50876OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final UserMedalView f50877OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final SVGAView f50878OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final UserNameView f50879OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final View f50880OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f50881OooOO0o;

    public wa(@NonNull ConstraintLayout constraintLayout, @NonNull DotView dotView, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull UserPrettyIdView userPrettyIdView, @NonNull xa xaVar, @NonNull UserMedalView userMedalView, @NonNull SVGAView sVGAView, @NonNull TextView textView, @NonNull UserNameView userNameView, @NonNull View view, @NonNull UserPremiumView userPremiumView) {
        this.f50871OooO00o = constraintLayout;
        this.f50872OooO0O0 = dotView;
        this.f50873OooO0OO = netImageView;
        this.f50874OooO0Oo = imageView;
        this.f50876OooO0o0 = userPrettyIdView;
        this.f50875OooO0o = xaVar;
        this.f50877OooO0oO = userMedalView;
        this.f50878OooO0oo = sVGAView;
        this.f50870OooO = textView;
        this.f50879OooOO0 = userNameView;
        this.f50880OooOO0O = view;
        this.f50881OooOO0o = userPremiumView;
    }

    @NonNull
    public static wa OooO00o(@NonNull View view) {
        int i = R.id.dotView;
        DotView dotView = (DotView) o00Oo0.OooO00o(view, R.id.dotView);
        if (dotView != null) {
            i = R.id.idLayout;
            if (((LinearLayout) o00Oo0.OooO00o(view, R.id.idLayout)) != null) {
                i = R.id.ivHeader;
                NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(view, R.id.ivHeader);
                if (netImageView != null) {
                    i = R.id.ivKaVip;
                    ImageView imageView = (ImageView) o00Oo0.OooO00o(view, R.id.ivKaVip);
                    if (imageView != null) {
                        i = R.id.iv_prettyid;
                        UserPrettyIdView userPrettyIdView = (UserPrettyIdView) o00Oo0.OooO00o(view, R.id.iv_prettyid);
                        if (userPrettyIdView != null) {
                            i = R.id.list;
                            View viewOooO00o = o00Oo0.OooO00o(view, R.id.list);
                            if (viewOooO00o != null) {
                                xa xaVarOooO00o = xa.OooO00o(viewOooO00o);
                                i = R.id.medalView;
                                UserMedalView userMedalView = (UserMedalView) o00Oo0.OooO00o(view, R.id.medalView);
                                if (userMedalView != null) {
                                    i = R.id.sivHeaderFrame;
                                    SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(view, R.id.sivHeaderFrame);
                                    if (sVGAView != null) {
                                        i = R.id.tvIdx;
                                        TextView textView = (TextView) o00Oo0.OooO00o(view, R.id.tvIdx);
                                        if (textView != null) {
                                            i = R.id.tvName;
                                            UserNameView userNameView = (UserNameView) o00Oo0.OooO00o(view, R.id.tvName);
                                            if (userNameView != null) {
                                                i = R.id.vTopBg;
                                                View viewOooO00o2 = o00Oo0.OooO00o(view, R.id.vTopBg);
                                                if (viewOooO00o2 != null) {
                                                    i = R.id.vipView;
                                                    UserPremiumView userPremiumView = (UserPremiumView) o00Oo0.OooO00o(view, R.id.vipView);
                                                    if (userPremiumView != null) {
                                                        return new wa((ConstraintLayout) view, dotView, netImageView, imageView, userPrettyIdView, xaVarOooO00o, userMedalView, sVGAView, textView, userNameView, viewOooO00o2, userPremiumView);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static wa inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50871OooO00o;
    }

    @NonNull
    public static wa inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_drawer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}

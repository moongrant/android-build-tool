package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserMedalView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class pd implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f50286OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f50287OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50288OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f50289OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50290OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f50291OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f50292OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f50293OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50294OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f50295OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final SVGAView f50296OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50297OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f50298OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50299OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f50300OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f50301OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final UserMedalView f50302OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f50303OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f50304OooOOoo;

    public pd(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull RelativeLayout relativeLayout2, @NonNull SVGAView sVGAView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull UserMedalView userMedalView, @NonNull UserPremiumView userPremiumView) {
        this.f50287OooO00o = relativeLayout;
        this.f50288OooO0O0 = imageView;
        this.f50289OooO0OO = netImageView;
        this.f50290OooO0Oo = imageView2;
        this.f50292OooO0o0 = imageView3;
        this.f50291OooO0o = imageView4;
        this.f50293OooO0oO = imageView5;
        this.f50294OooO0oo = imageView6;
        this.f50286OooO = imageView7;
        this.f50295OooOO0 = relativeLayout2;
        this.f50296OooOO0O = sVGAView;
        this.f50297OooOO0o = textView;
        this.f50299OooOOO0 = textView2;
        this.f50298OooOOO = textView3;
        this.f50300OooOOOO = textView4;
        this.f50301OooOOOo = textView5;
        this.f50303OooOOo0 = textView6;
        this.f50302OooOOo = userMedalView;
        this.f50304OooOOoo = userPremiumView;
    }

    @NonNull
    public static pd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50287OooO00o;
    }

    @NonNull
    public static pd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_detail_user_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivFeaturedItem;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivFeaturedItem);
        if (imageView != null) {
            i = R.id.ivHeadItem;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHeadItem);
            if (netImageView != null) {
                i = R.id.ivKaVipItem;
                ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivKaVipItem);
                if (imageView2 != null) {
                    i = R.id.ivMemberItem;
                    ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivMemberItem);
                    if (imageView3 != null) {
                        i = R.id.ivMoveItem;
                        ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivMoveItem);
                        if (imageView4 != null) {
                            i = R.id.ivPowerItem;
                            ImageView imageView5 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPowerItem);
                            if (imageView5 != null) {
                                i = R.id.ivRoleItem;
                                ImageView imageView6 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivRoleItem);
                                if (imageView6 != null) {
                                    i = R.id.ivTopItem;
                                    ImageView imageView7 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivTopItem);
                                    if (imageView7 != null) {
                                        i = R.id.layoutHeadItem;
                                        RelativeLayout relativeLayout = (RelativeLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutHeadItem);
                                        if (relativeLayout != null) {
                                            i = R.id.layoutNameItem;
                                            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutNameItem)) != null) {
                                                RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                                                i = R.id.svgaInRoomItem;
                                                SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaInRoomItem);
                                                if (sVGAView != null) {
                                                    i = R.id.tvEdited;
                                                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvEdited);
                                                    if (textView != null) {
                                                        i = R.id.tvFollowItem;
                                                        TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvFollowItem);
                                                        if (textView2 != null) {
                                                            i = R.id.tvFriendItem;
                                                            TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvFriendItem);
                                                            if (textView3 != null) {
                                                                i = R.id.tvNameItem;
                                                                TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvNameItem);
                                                                if (textView4 != null) {
                                                                    i = R.id.tvTimeItem;
                                                                    TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTimeItem);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tvYallaTeamItem;
                                                                        TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvYallaTeamItem);
                                                                        if (textView6 != null) {
                                                                            i = R.id.userMedalViewItem;
                                                                            UserMedalView userMedalView = (UserMedalView) o00Oo0.OooO00o(viewInflate, R.id.userMedalViewItem);
                                                                            if (userMedalView != null) {
                                                                                i = R.id.userVipViewItem;
                                                                                UserPremiumView userPremiumView = (UserPremiumView) o00Oo0.OooO00o(viewInflate, R.id.userVipViewItem);
                                                                                if (userPremiumView != null) {
                                                                                    return new pd(relativeLayout2, imageView, netImageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, relativeLayout, sVGAView, textView, textView2, textView3, textView4, textView5, textView6, userMedalView, userPremiumView);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

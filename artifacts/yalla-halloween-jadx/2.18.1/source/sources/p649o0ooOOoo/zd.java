package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserMedalView;
import com.yalla.yalla.common.ui.view.UserNameView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.UserVipView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class zd implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f51083OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f51084OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f51085OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f51086OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f51087OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f51088OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f51089OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final UserNameView f51090OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f51091OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final UserVipView f51092OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final UserMedalView f51093OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f51094OooOO0o;

    public zd(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ConstraintLayout constraintLayout2, @NonNull UserNameView userNameView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull UserVipView userVipView, @NonNull UserMedalView userMedalView, @NonNull UserPremiumView userPremiumView) {
        this.f51084OooO00o = constraintLayout;
        this.f51085OooO0O0 = imageView;
        this.f51086OooO0OO = netImageView;
        this.f51087OooO0Oo = imageView2;
        this.f51089OooO0o0 = imageView3;
        this.f51088OooO0o = constraintLayout2;
        this.f51090OooO0oO = userNameView;
        this.f51091OooO0oo = textView;
        this.f51083OooO = textView2;
        this.f51092OooOO0 = userVipView;
        this.f51093OooOO0O = userMedalView;
        this.f51094OooOO0o = userPremiumView;
    }

    @NonNull
    public static zd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51084OooO00o;
    }

    @NonNull
    public static zd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_send_title_task, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivDel;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivDel);
        if (imageView != null) {
            i = R.id.ivHead;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHead);
            if (netImageView != null) {
                i = R.id.ivPower;
                ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPower);
                if (imageView2 != null) {
                    i = R.id.ivRole;
                    ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivRole);
                    if (imageView3 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = R.id.tvName;
                        UserNameView userNameView = (UserNameView) o00Oo0.OooO00o(viewInflate, R.id.tvName);
                        if (userNameView != null) {
                            i = R.id.tvTag;
                            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTag);
                            if (textView != null) {
                                i = R.id.tvTry;
                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTry);
                                if (textView2 != null) {
                                    i = R.id.userKaVipView;
                                    UserVipView userVipView = (UserVipView) o00Oo0.OooO00o(viewInflate, R.id.userKaVipView);
                                    if (userVipView != null) {
                                        i = R.id.userMedalViewItem;
                                        UserMedalView userMedalView = (UserMedalView) o00Oo0.OooO00o(viewInflate, R.id.userMedalViewItem);
                                        if (userMedalView != null) {
                                            i = R.id.userVipView;
                                            UserPremiumView userPremiumView = (UserPremiumView) o00Oo0.OooO00o(viewInflate, R.id.userVipView);
                                            if (userPremiumView != null) {
                                                return new zd(constraintLayout, imageView, netImageView, imageView2, imageView3, constraintLayout, userNameView, textView, textView2, userVipView, userMedalView, userPremiumView);
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

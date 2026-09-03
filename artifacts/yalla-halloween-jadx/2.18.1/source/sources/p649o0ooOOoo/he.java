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
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.ImageMoreView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class he implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageMoreView f49561OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49562OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f49563OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49564OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49565OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f49566OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49567OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f49568OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f49569OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49570OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final View f49571OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49572OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ImageView f49573OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f49574OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49575OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f49576OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f49577OooOOo0;

    public he(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull UserPremiumView userPremiumView, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull ImageMoreView imageMoreView, @NonNull LinearLayout linearLayout3, @NonNull View view, @NonNull TextView textView4, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f49562OooO00o = linearLayout;
        this.f49563OooO0O0 = textView;
        this.f49564OooO0OO = textView2;
        this.f49565OooO0Oo = linearLayout2;
        this.f49567OooO0o0 = textView3;
        this.f49566OooO0o = userPremiumView;
        this.f49568OooO0oO = imageView;
        this.f49569OooO0oo = netImageView;
        this.f49561OooO = imageMoreView;
        this.f49570OooOO0 = linearLayout3;
        this.f49571OooOO0O = view;
        this.f49572OooOO0o = textView4;
        this.f49574OooOOO0 = imageView2;
        this.f49573OooOOO = imageView3;
        this.f49575OooOOOO = textView5;
        this.f49576OooOOOo = textView6;
        this.f49577OooOOo0 = textView7;
    }

    @NonNull
    public static he inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49562OooO00o;
    }

    @NonNull
    public static he inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_view_post_task, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.edit_content;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.edit_content);
        if (textView != null) {
            i = R.id.edit_content_more;
            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.edit_content_more);
            if (textView2 != null) {
                i = R.id.edit_topic_layout;
                LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.edit_topic_layout);
                if (linearLayout != null) {
                    i = R.id.edit_topic_name;
                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.edit_topic_name);
                    if (textView3 != null) {
                        i = R.id.head_aristocracy_iv;
                        UserPremiumView userPremiumView = (UserPremiumView) o00Oo0.OooO00o(viewInflate, R.id.head_aristocracy_iv);
                        if (userPremiumView != null) {
                            i = R.id.head_del_iv;
                            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.head_del_iv);
                            if (imageView != null) {
                                i = R.id.head_iv;
                                NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.head_iv);
                                if (netImageView != null) {
                                    i = R.id.imageMoreView;
                                    ImageMoreView imageMoreView = (ImageMoreView) o00Oo0.OooO00o(viewInflate, R.id.imageMoreView);
                                    if (imageMoreView != null) {
                                        i = R.id.iv_sharePost;
                                        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_sharePost)) != null) {
                                            LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                            i = R.id.layout_sharePost;
                                            if (((RelativeLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_sharePost)) != null) {
                                                i = R.id.line_parent_bottom;
                                                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.line_parent_bottom);
                                                if (viewOooO00o != null) {
                                                    i = R.id.name_tv;
                                                    TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.name_tv);
                                                    if (textView4 != null) {
                                                        i = R.id.role_iv;
                                                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.role_iv);
                                                        if (imageView2 != null) {
                                                            i = R.id.send_power_iv;
                                                            ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.send_power_iv);
                                                            if (imageView3 != null) {
                                                                i = R.id.send_tag_tv;
                                                                TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.send_tag_tv);
                                                                if (textView5 != null) {
                                                                    i = R.id.send_try_tv;
                                                                    TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.send_try_tv);
                                                                    if (textView6 != null) {
                                                                        i = R.id.tv_address;
                                                                        TextView textView7 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_address);
                                                                        if (textView7 != null) {
                                                                            i = R.id.tv_comments;
                                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_comments)) != null) {
                                                                                i = R.id.tv_gifts;
                                                                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_gifts)) != null) {
                                                                                    i = R.id.tv_praise_count;
                                                                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_praise_count)) != null) {
                                                                                        return new he(linearLayout2, textView, textView2, linearLayout, textView3, userPremiumView, imageView, netImageView, imageMoreView, linearLayout2, viewOooO00o, textView4, imageView2, imageView3, textView5, textView6, textView7);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

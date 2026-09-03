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
import com.app.base.view.FixTextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserMedalView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.ImageMoreView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ge implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49463OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49464OooO0O0;

    public ge(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f49463OooO00o = linearLayout;
        this.f49464OooO0O0 = linearLayout2;
    }

    @NonNull
    public static ge inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49463OooO00o;
    }

    @NonNull
    public static ge inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_view_post, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = R.id.content;
        if (((FixTextView) o00Oo0.OooO00o(viewInflate, R.id.content)) != null) {
            i = R.id.content_forward;
            if (((FixTextView) o00Oo0.OooO00o(viewInflate, R.id.content_forward)) != null) {
                i = R.id.content_forward_more;
                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.content_forward_more)) != null) {
                    i = R.id.content_more;
                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.content_more)) != null) {
                        i = R.id.follow_tv;
                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.follow_tv)) != null) {
                            i = R.id.friend_tv;
                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.friend_tv)) != null) {
                                i = R.id.head_featured_iv;
                                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.head_featured_iv)) != null) {
                                    i = R.id.head_iv;
                                    if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.head_iv)) != null) {
                                        i = R.id.head_top_iv;
                                        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.head_top_iv)) != null) {
                                            i = R.id.head_vip_iv;
                                            if (((UserPremiumView) o00Oo0.OooO00o(viewInflate, R.id.head_vip_iv)) != null) {
                                                i = R.id.imageMoreView;
                                                if (((ImageMoreView) o00Oo0.OooO00o(viewInflate, R.id.imageMoreView)) != null) {
                                                    i = R.id.imageMoreView_forward;
                                                    if (((com.app.base.view.imageMore.ImageMoreView) o00Oo0.OooO00o(viewInflate, R.id.imageMoreView_forward)) != null) {
                                                        i = R.id.item_post_detail_comment_role_iv;
                                                        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.item_post_detail_comment_role_iv)) != null) {
                                                            i = R.id.iv_image_share;
                                                            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_image_share)) != null) {
                                                                i = R.id.layout_share_bg;
                                                                if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_share_bg)) != null) {
                                                                    i = R.id.medal_layout;
                                                                    if (((UserMedalView) o00Oo0.OooO00o(viewInflate, R.id.medal_layout)) != null) {
                                                                        i = R.id.member_iv;
                                                                        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.member_iv)) != null) {
                                                                            i = R.id.move_iv;
                                                                            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.move_iv)) != null) {
                                                                                i = R.id.name_tv;
                                                                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.name_tv)) != null) {
                                                                                    i = R.id.power_iv;
                                                                                    if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.power_iv)) != null) {
                                                                                        i = R.id.time_tv;
                                                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.time_tv)) != null) {
                                                                                            i = R.id.topic_layout;
                                                                                            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.topic_layout)) != null) {
                                                                                                i = R.id.topic_name;
                                                                                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.topic_name)) != null) {
                                                                                                    i = R.id.tv_address;
                                                                                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_address)) != null) {
                                                                                                        i = R.id.tv_share_content;
                                                                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_share_content)) != null) {
                                                                                                            i = R.id.tv_share_forward_deleted;
                                                                                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_share_forward_deleted)) != null) {
                                                                                                                i = R.id.tv_share_title;
                                                                                                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_share_title)) != null) {
                                                                                                                    i = R.id.yalla_team_tv;
                                                                                                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.yalla_team_tv)) != null) {
                                                                                                                        return new ge(linearLayout, linearLayout);
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

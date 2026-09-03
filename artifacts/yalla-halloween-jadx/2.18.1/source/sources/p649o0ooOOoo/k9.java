package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.view.FixTextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class k9 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f49836OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49837OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f49838OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f49839OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f49840OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f49841OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49842OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TopicFollowPostNumberView f49843OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final FixTextView f49844OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49845OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final FixTextView f49846OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final FixTextView f49847OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49848OooOOO0;

    public k9(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull View view, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull TopicFollowPostNumberView topicFollowPostNumberView, @NonNull FixTextView fixTextView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull FixTextView fixTextView2, @NonNull FixTextView fixTextView3, @NonNull TextView textView3) {
        this.f49837OooO00o = constraintLayout;
        this.f49838OooO0O0 = button;
        this.f49839OooO0OO = view;
        this.f49840OooO0Oo = linearLayoutCompat;
        this.f49842OooO0o0 = netImageView;
        this.f49841OooO0o = netImageView2;
        this.f49843OooO0oO = topicFollowPostNumberView;
        this.f49844OooO0oo = fixTextView;
        this.f49836OooO = textView;
        this.f49845OooOO0 = textView2;
        this.f49846OooOO0O = fixTextView2;
        this.f49847OooOO0o = fixTextView3;
        this.f49848OooOOO0 = textView3;
    }

    @NonNull
    public static k9 OooO00o(@NonNull View view) {
        int i = R.id.btJoin;
        Button button = (Button) o00Oo0.OooO00o(view, R.id.btJoin);
        if (button != null) {
            i = R.id.headBottom;
            View viewOooO00o = o00Oo0.OooO00o(view, R.id.headBottom);
            if (viewOooO00o != null) {
                i = R.id.ivMore;
                if (((ImageView) o00Oo0.OooO00o(view, R.id.ivMore)) != null) {
                    i = R.id.layoutFans;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) o00Oo0.OooO00o(view, R.id.layoutFans);
                    if (linearLayoutCompat != null) {
                        i = R.id.nivBackground;
                        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(view, R.id.nivBackground);
                        if (netImageView != null) {
                            i = R.id.nivHeader;
                            NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(view, R.id.nivHeader);
                            if (netImageView2 != null) {
                                i = R.id.topicNumberView;
                                TopicFollowPostNumberView topicFollowPostNumberView = (TopicFollowPostNumberView) o00Oo0.OooO00o(view, R.id.topicNumberView);
                                if (topicFollowPostNumberView != null) {
                                    i = R.id.tvDescribe;
                                    FixTextView fixTextView = (FixTextView) o00Oo0.OooO00o(view, R.id.tvDescribe);
                                    if (fixTextView != null) {
                                        i = R.id.tvFans;
                                        TextView textView = (TextView) o00Oo0.OooO00o(view, R.id.tvFans);
                                        if (textView != null) {
                                            i = R.id.tvName;
                                            TextView textView2 = (TextView) o00Oo0.OooO00o(view, R.id.tvName);
                                            if (textView2 != null) {
                                                i = R.id.tvNotice1;
                                                FixTextView fixTextView2 = (FixTextView) o00Oo0.OooO00o(view, R.id.tvNotice1);
                                                if (fixTextView2 != null) {
                                                    i = R.id.tvNotice2;
                                                    FixTextView fixTextView3 = (FixTextView) o00Oo0.OooO00o(view, R.id.tvNotice2);
                                                    if (fixTextView3 != null) {
                                                        i = R.id.tvNotice3;
                                                        TextView textView3 = (TextView) o00Oo0.OooO00o(view, R.id.tvNotice3);
                                                        if (textView3 != null) {
                                                            return new k9((ConstraintLayout) view, button, viewOooO00o, linearLayoutCompat, netImageView, netImageView2, topicFollowPostNumberView, fixTextView, textView, textView2, fixTextView2, fixTextView3, textView3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static k9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49837OooO00o;
    }

    @NonNull
    public static k9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.include_topic_detail_header_info_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}

package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.TopicFollowPostNumberView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0ooO implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f45281OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45282OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f45283OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45284OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f45285OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TopicFollowPostNumberView f45286OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45287OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final FixTextView f45288OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f45289OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final FixTextView f45290OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final FixTextView f45291OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f45292OooOO0o;

    public oo0ooO(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull TopicFollowPostNumberView topicFollowPostNumberView, @NonNull FixTextView fixTextView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FixTextView fixTextView2, @NonNull FixTextView fixTextView3, @NonNull TextView textView4) {
        this.f45282OooO00o = constraintLayout;
        this.f45283OooO0O0 = textView;
        this.f45284OooO0OO = linearLayoutCompat;
        this.f45285OooO0Oo = netImageView;
        this.f45287OooO0o0 = netImageView2;
        this.f45286OooO0o = topicFollowPostNumberView;
        this.f45288OooO0oO = fixTextView;
        this.f45289OooO0oo = textView2;
        this.f45281OooO = textView3;
        this.f45290OooOO0 = fixTextView2;
        this.f45291OooOO0O = fixTextView3;
        this.f45292OooOO0o = textView4;
    }

    @NonNull
    public static oo0ooO OooO00o(@NonNull View view) {
        int i = o0OO00O.btJoin;
        TextView textView = (TextView) OooO0O0.OooO00o(i, view);
        if (textView != null) {
            i = o0OO00O.ivMore;
            if (((ImageView) OooO0O0.OooO00o(i, view)) != null) {
                i = o0OO00O.layoutFans;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooO0O0.OooO00o(i, view);
                if (linearLayoutCompat != null) {
                    i = o0OO00O.layoutNotice;
                    if (((LinearLayout) OooO0O0.OooO00o(i, view)) != null) {
                        i = o0OO00O.nivBackground;
                        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, view);
                        if (netImageView != null) {
                            i = o0OO00O.nivHeader;
                            NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, view);
                            if (netImageView2 != null) {
                                i = o0OO00O.topicNumberView;
                                TopicFollowPostNumberView topicFollowPostNumberView = (TopicFollowPostNumberView) OooO0O0.OooO00o(i, view);
                                if (topicFollowPostNumberView != null) {
                                    i = o0OO00O.tvDescribe;
                                    FixTextView fixTextView = (FixTextView) OooO0O0.OooO00o(i, view);
                                    if (fixTextView != null) {
                                        i = o0OO00O.tvFans;
                                        TextView textView2 = (TextView) OooO0O0.OooO00o(i, view);
                                        if (textView2 != null) {
                                            i = o0OO00O.tvName;
                                            TextView textView3 = (TextView) OooO0O0.OooO00o(i, view);
                                            if (textView3 != null) {
                                                i = o0OO00O.tvNotice1;
                                                FixTextView fixTextView2 = (FixTextView) OooO0O0.OooO00o(i, view);
                                                if (fixTextView2 != null) {
                                                    i = o0OO00O.tvNotice2;
                                                    FixTextView fixTextView3 = (FixTextView) OooO0O0.OooO00o(i, view);
                                                    if (fixTextView3 != null) {
                                                        i = o0OO00O.tvNotice3;
                                                        TextView textView4 = (TextView) OooO0O0.OooO00o(i, view);
                                                        if (textView4 != null) {
                                                            return new oo0ooO((ConstraintLayout) view, textView, linearLayoutCompat, netImageView, netImageView2, topicFollowPostNumberView, fixTextView, textView2, textView3, fixTextView2, fixTextView3, textView4);
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
    public static oo0ooO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45282OooO00o;
    }

    @NonNull
    public static oo0ooO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.include_topic_detail_header_info_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}

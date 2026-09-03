package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class s2 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f58781OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58782OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f58783OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58784OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f58785OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TopicFollowPostNumberView f58786OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f58787OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final FixTextView f58788OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f58789OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final FixTextView f58790OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final FixTextView f58791OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58792OooOO0o;

    public s2(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull TopicFollowPostNumberView topicFollowPostNumberView, @NonNull FixTextView fixTextView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FixTextView fixTextView2, @NonNull FixTextView fixTextView3, @NonNull TextView textView4) {
        this.f58782OooO00o = constraintLayout;
        this.f58783OooO0O0 = textView;
        this.f58784OooO0OO = linearLayoutCompat;
        this.f58785OooO0Oo = netImageView;
        this.f58787OooO0o0 = netImageView2;
        this.f58786OooO0o = topicFollowPostNumberView;
        this.f58788OooO0oO = fixTextView;
        this.f58789OooO0oo = textView2;
        this.f58781OooO = textView3;
        this.f58790OooOO0 = fixTextView2;
        this.f58791OooOO0O = fixTextView3;
        this.f58792OooOO0o = textView4;
    }

    @NonNull
    public static s2 OooO00o(@NonNull View view) {
        int i = oO00O0oO.btJoin;
        TextView textView = (TextView) OooOO0.OooO00o(i, view);
        if (textView != null) {
            i = oO00O0oO.ivMore;
            if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
                i = oO00O0oO.layoutFans;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooOO0.OooO00o(i, view);
                if (linearLayoutCompat != null) {
                    i = oO00O0oO.layoutNotice;
                    if (((LinearLayout) OooOO0.OooO00o(i, view)) != null) {
                        i = oO00O0oO.nivBackground;
                        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, view);
                        if (netImageView != null) {
                            i = oO00O0oO.nivHeader;
                            NetImageView netImageView2 = (NetImageView) OooOO0.OooO00o(i, view);
                            if (netImageView2 != null) {
                                i = oO00O0oO.topicNumberView;
                                TopicFollowPostNumberView topicFollowPostNumberView = (TopicFollowPostNumberView) OooOO0.OooO00o(i, view);
                                if (topicFollowPostNumberView != null) {
                                    i = oO00O0oO.tvDescribe;
                                    FixTextView fixTextView = (FixTextView) OooOO0.OooO00o(i, view);
                                    if (fixTextView != null) {
                                        i = oO00O0oO.tvFans;
                                        TextView textView2 = (TextView) OooOO0.OooO00o(i, view);
                                        if (textView2 != null) {
                                            i = oO00O0oO.tvName;
                                            TextView textView3 = (TextView) OooOO0.OooO00o(i, view);
                                            if (textView3 != null) {
                                                i = oO00O0oO.tvNotice1;
                                                FixTextView fixTextView2 = (FixTextView) OooOO0.OooO00o(i, view);
                                                if (fixTextView2 != null) {
                                                    i = oO00O0oO.tvNotice2;
                                                    FixTextView fixTextView3 = (FixTextView) OooOO0.OooO00o(i, view);
                                                    if (fixTextView3 != null) {
                                                        i = oO00O0oO.tvNotice3;
                                                        TextView textView4 = (TextView) OooOO0.OooO00o(i, view);
                                                        if (textView4 != null) {
                                                            return new s2((ConstraintLayout) view, textView, linearLayoutCompat, netImageView, netImageView2, topicFollowPostNumberView, fixTextView, textView2, textView3, fixTextView2, fixTextView3, textView4);
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
    public static s2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58782OooO00o;
    }

    @NonNull
    public static s2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.include_topic_detail_header_info_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}

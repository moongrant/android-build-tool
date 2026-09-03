package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.framework.view.marqueeText.MarqueeText;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class sf implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f50606OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50607OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50608OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50609OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50610OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50611OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50612OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SVGAView f50613OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f50614OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50615OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final MarqueeText f50616OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50617OooOO0o;

    public sf(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull RecyclerView recyclerView, @NonNull SVGAView sVGAView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull MarqueeText marqueeText, @NonNull TextView textView4) {
        this.f50607OooO00o = constraintLayout;
        this.f50608OooO0O0 = imageView;
        this.f50609OooO0OO = imageView2;
        this.f50610OooO0Oo = linearLayoutCompat;
        this.f50612OooO0o0 = linearLayoutCompat2;
        this.f50611OooO0o = recyclerView;
        this.f50613OooO0oO = sVGAView;
        this.f50614OooO0oo = textView;
        this.f50606OooO = textView2;
        this.f50615OooOO0 = textView3;
        this.f50616OooOO0O = marqueeText;
        this.f50617OooOO0o = textView4;
    }

    @NonNull
    public static sf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50607OooO00o;
    }

    @NonNull
    public static sf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_vote_game, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivBackground;
        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBackground)) != null) {
            i = R.id.ivVotPackUp;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivVotPackUp);
            if (imageView != null) {
                i = R.id.ivVoteRules;
                ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivVoteRules);
                if (imageView2 != null) {
                    i = R.id.llBody;
                    if (((LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.llBody)) != null) {
                        i = R.id.llBottom1;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.llBottom1);
                        if (linearLayoutCompat != null) {
                            i = R.id.llBottom2;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.llBottom2);
                            if (linearLayoutCompat2 != null) {
                                i = R.id.rvRanking;
                                RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvRanking);
                                if (recyclerView != null) {
                                    i = R.id.svgaView;
                                    SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaView);
                                    if (sVGAView != null) {
                                        i = R.id.tvEndVote;
                                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvEndVote);
                                        if (textView != null) {
                                            i = R.id.tvEndedTime;
                                            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvEndedTime);
                                            if (textView2 != null) {
                                                i = R.id.tvEndedTip;
                                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvEndedTip)) != null) {
                                                    i = R.id.tvMyVote;
                                                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMyVote);
                                                    if (textView3 != null) {
                                                        i = R.id.tvTitle;
                                                        MarqueeText marqueeText = (MarqueeText) o00Oo0.OooO00o(viewInflate, R.id.tvTitle);
                                                        if (marqueeText != null) {
                                                            i = R.id.tvVoteTime;
                                                            TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvVoteTime);
                                                            if (textView4 != null) {
                                                                return new sf((ConstraintLayout) viewInflate, imageView, imageView2, linearLayoutCompat, linearLayoutCompat2, recyclerView, sVGAView, textView, textView2, textView3, marqueeText, textView4);
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

package p405o0Oo0OOO;

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
import com.code.android.uikit.marquee.MarqueeText;
import com.code.android.uikit.svga.SVGAView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f45641OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45642OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f45643OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f45644OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45645OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final RecyclerView f45646OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45647OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SVGAView f45648OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f45649OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45650OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final MarqueeText f45651OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f45652OooOO0o;

    public w(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull RecyclerView recyclerView, @NonNull SVGAView sVGAView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull MarqueeText marqueeText, @NonNull TextView textView4) {
        this.f45642OooO00o = constraintLayout;
        this.f45643OooO0O0 = imageView;
        this.f45644OooO0OO = imageView2;
        this.f45645OooO0Oo = linearLayoutCompat;
        this.f45647OooO0o0 = linearLayoutCompat2;
        this.f45646OooO0o = recyclerView;
        this.f45648OooO0oO = sVGAView;
        this.f45649OooO0oo = textView;
        this.f45641OooO = textView2;
        this.f45650OooOO0 = textView3;
        this.f45651OooOO0O = marqueeText;
        this.f45652OooOO0o = textView4;
    }

    @NonNull
    public static w inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45642OooO00o;
    }

    @NonNull
    public static w inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_dialog_vote_game, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivBackground;
        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.ivVotPackUp;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0OO00O.ivVoteRules;
                ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = o0OO00O.llBody;
                    if (((LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.llBottom1;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                        if (linearLayoutCompat != null) {
                            i = o0OO00O.llBottom2;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                            if (linearLayoutCompat2 != null) {
                                i = o0OO00O.rvRanking;
                                RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                                if (recyclerView != null) {
                                    i = o0OO00O.svgaView;
                                    SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                    if (sVGAView != null) {
                                        i = o0OO00O.tvEndVote;
                                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView != null) {
                                            i = o0OO00O.tvEndedTime;
                                            TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView2 != null) {
                                                i = o0OO00O.tvEndedTip;
                                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                    i = o0OO00O.tvMyVote;
                                                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = o0OO00O.tvTitle;
                                                        MarqueeText marqueeText = (MarqueeText) OooO0O0.OooO00o(i, viewInflate);
                                                        if (marqueeText != null) {
                                                            i = o0OO00O.tvVoteTime;
                                                            TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (textView4 != null) {
                                                                return new w((ConstraintLayout) viewInflate, imageView, imageView2, linearLayoutCompat, linearLayoutCompat2, recyclerView, sVGAView, textView, textView2, textView3, marqueeText, textView4);
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

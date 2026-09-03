package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class i8 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f58129OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58130OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58131OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58132OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58133OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58134OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58135OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SVGAView f58136OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f58137OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58138OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final MarqueeText f58139OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58140OooOO0o;

    public i8(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull RecyclerView recyclerView, @NonNull SVGAView sVGAView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull MarqueeText marqueeText, @NonNull TextView textView4) {
        this.f58130OooO00o = constraintLayout;
        this.f58131OooO0O0 = imageView;
        this.f58132OooO0OO = imageView2;
        this.f58133OooO0Oo = linearLayoutCompat;
        this.f58135OooO0o0 = linearLayoutCompat2;
        this.f58134OooO0o = recyclerView;
        this.f58136OooO0oO = sVGAView;
        this.f58137OooO0oo = textView;
        this.f58129OooO = textView2;
        this.f58138OooOO0 = textView3;
        this.f58139OooOO0O = marqueeText;
        this.f58140OooOO0o = textView4;
    }

    @NonNull
    public static i8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58130OooO00o;
    }

    @NonNull
    public static i8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_dialog_vote_game, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivBackground;
        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.ivVotPackUp;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oO00O0oO.ivVoteRules;
                ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = oO00O0oO.llBody;
                    if (((LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.llBottom1;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                        if (linearLayoutCompat != null) {
                            i = oO00O0oO.llBottom2;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                            if (linearLayoutCompat2 != null) {
                                i = oO00O0oO.rvRanking;
                                RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                                if (recyclerView != null) {
                                    i = oO00O0oO.svgaView;
                                    SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                    if (sVGAView != null) {
                                        i = oO00O0oO.tvEndVote;
                                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView != null) {
                                            i = oO00O0oO.tvEndedTime;
                                            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView2 != null) {
                                                i = oO00O0oO.tvEndedTip;
                                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                    i = oO00O0oO.tvMyVote;
                                                    TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = oO00O0oO.tvTitle;
                                                        MarqueeText marqueeText = (MarqueeText) OooOO0.OooO00o(i, viewInflate);
                                                        if (marqueeText != null) {
                                                            i = oO00O0oO.tvVoteTime;
                                                            TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (textView4 != null) {
                                                                return new i8((ConstraintLayout) viewInflate, imageView, imageView2, linearLayoutCompat, linearLayoutCompat2, recyclerView, sVGAView, textView, textView2, textView3, marqueeText, textView4);
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

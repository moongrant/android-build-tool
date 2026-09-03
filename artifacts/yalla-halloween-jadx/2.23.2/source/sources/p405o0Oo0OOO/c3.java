package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yalla.yalla.ui.view.gift.GiftBlindTipsView;
import com.yalla.yalla.ui.view.gift.GiftCustomMadeTipsView;
import com.yalla.yalla.ui.view.gift.GiftNewTipsView;
import com.yalla.yalla.ui.view.gift.GiftTipsViewMerge;
import com.yalla.yalla.ui.view.gift.GiftTypeNotUpTipsView;
import com.yalla.yalla.ui.view.gift.GiftWeekStarTipsView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class c3 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f43761OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final GiftBlindTipsView f43762OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final GiftCustomMadeTipsView f43763OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final GiftTipsViewMerge f43764OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final GiftTypeNotUpTipsView f43765OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final GiftNewTipsView f43766OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final GiftWeekStarTipsView f43767OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f43768OooO0oo;

    public c3(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull GiftBlindTipsView giftBlindTipsView, @NonNull GiftCustomMadeTipsView giftCustomMadeTipsView, @NonNull GiftTipsViewMerge giftTipsViewMerge, @NonNull GiftNewTipsView giftNewTipsView, @NonNull GiftTypeNotUpTipsView giftTypeNotUpTipsView, @NonNull GiftWeekStarTipsView giftWeekStarTipsView, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.f43761OooO00o = linearLayoutCompat;
        this.f43762OooO0O0 = giftBlindTipsView;
        this.f43763OooO0OO = giftCustomMadeTipsView;
        this.f43764OooO0Oo = giftTipsViewMerge;
        this.f43766OooO0o0 = giftNewTipsView;
        this.f43765OooO0o = giftTypeNotUpTipsView;
        this.f43767OooO0oO = giftWeekStarTipsView;
        this.f43768OooO0oo = linearLayoutCompat2;
    }

    @NonNull
    public static c3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43761OooO00o;
    }

    @NonNull
    public static c3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_gift_top_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.giftBlind;
        GiftBlindTipsView giftBlindTipsView = (GiftBlindTipsView) OooO0O0.OooO00o(i, viewInflate);
        if (giftBlindTipsView != null) {
            i = o0OO00O.giftCustomMade;
            GiftCustomMadeTipsView giftCustomMadeTipsView = (GiftCustomMadeTipsView) OooO0O0.OooO00o(i, viewInflate);
            if (giftCustomMadeTipsView != null) {
                i = o0OO00O.giftMerge;
                GiftTipsViewMerge giftTipsViewMerge = (GiftTipsViewMerge) OooO0O0.OooO00o(i, viewInflate);
                if (giftTipsViewMerge != null) {
                    i = o0OO00O.giftNew;
                    GiftNewTipsView giftNewTipsView = (GiftNewTipsView) OooO0O0.OooO00o(i, viewInflate);
                    if (giftNewTipsView != null) {
                        i = o0OO00O.giftTypeNotUp;
                        GiftTypeNotUpTipsView giftTypeNotUpTipsView = (GiftTypeNotUpTipsView) OooO0O0.OooO00o(i, viewInflate);
                        if (giftTypeNotUpTipsView != null) {
                            i = o0OO00O.giftWeekStar;
                            GiftWeekStarTipsView giftWeekStarTipsView = (GiftWeekStarTipsView) OooO0O0.OooO00o(i, viewInflate);
                            if (giftWeekStarTipsView != null) {
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                return new c3(linearLayoutCompat, giftBlindTipsView, giftCustomMadeTipsView, giftTipsViewMerge, giftNewTipsView, giftTypeNotUpTipsView, giftWeekStarTipsView, linearLayoutCompat);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

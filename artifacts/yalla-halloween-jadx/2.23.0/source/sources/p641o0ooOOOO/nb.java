package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class nb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58471OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final GiftBlindTipsView f58472OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final GiftCustomMadeTipsView f58473OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final GiftTipsViewMerge f58474OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final GiftTypeNotUpTipsView f58475OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final GiftNewTipsView f58476OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final GiftWeekStarTipsView f58477OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58478OooO0oo;

    public nb(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull GiftBlindTipsView giftBlindTipsView, @NonNull GiftCustomMadeTipsView giftCustomMadeTipsView, @NonNull GiftTipsViewMerge giftTipsViewMerge, @NonNull GiftNewTipsView giftNewTipsView, @NonNull GiftTypeNotUpTipsView giftTypeNotUpTipsView, @NonNull GiftWeekStarTipsView giftWeekStarTipsView, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.f58471OooO00o = linearLayoutCompat;
        this.f58472OooO0O0 = giftBlindTipsView;
        this.f58473OooO0OO = giftCustomMadeTipsView;
        this.f58474OooO0Oo = giftTipsViewMerge;
        this.f58476OooO0o0 = giftNewTipsView;
        this.f58475OooO0o = giftTypeNotUpTipsView;
        this.f58477OooO0oO = giftWeekStarTipsView;
        this.f58478OooO0oo = linearLayoutCompat2;
    }

    @NonNull
    public static nb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58471OooO00o;
    }

    @NonNull
    public static nb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_gift_top_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.giftBlind;
        GiftBlindTipsView giftBlindTipsView = (GiftBlindTipsView) OooOO0.OooO00o(i, viewInflate);
        if (giftBlindTipsView != null) {
            i = oO00O0oO.giftCustomMade;
            GiftCustomMadeTipsView giftCustomMadeTipsView = (GiftCustomMadeTipsView) OooOO0.OooO00o(i, viewInflate);
            if (giftCustomMadeTipsView != null) {
                i = oO00O0oO.giftMerge;
                GiftTipsViewMerge giftTipsViewMerge = (GiftTipsViewMerge) OooOO0.OooO00o(i, viewInflate);
                if (giftTipsViewMerge != null) {
                    i = oO00O0oO.giftNew;
                    GiftNewTipsView giftNewTipsView = (GiftNewTipsView) OooOO0.OooO00o(i, viewInflate);
                    if (giftNewTipsView != null) {
                        i = oO00O0oO.giftTypeNotUp;
                        GiftTypeNotUpTipsView giftTypeNotUpTipsView = (GiftTypeNotUpTipsView) OooOO0.OooO00o(i, viewInflate);
                        if (giftTypeNotUpTipsView != null) {
                            i = oO00O0oO.giftWeekStar;
                            GiftWeekStarTipsView giftWeekStarTipsView = (GiftWeekStarTipsView) OooOO0.OooO00o(i, viewInflate);
                            if (giftWeekStarTipsView != null) {
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                return new nb(linearLayoutCompat, giftBlindTipsView, giftCustomMadeTipsView, giftTipsViewMerge, giftNewTipsView, giftTypeNotUpTipsView, giftWeekStarTipsView, linearLayoutCompat);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.support.statebutton.StateButton;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o7 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f58522OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58523OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f58524OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58525OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58526OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58527OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58528OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58529OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f58530OooO0oo;

    public o7(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull StateButton stateButton, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f58523OooO00o = linearLayoutCompat;
        this.f58524OooO0O0 = stateButton;
        this.f58525OooO0OO = imageView;
        this.f58526OooO0Oo = linearLayoutCompat2;
        this.f58528OooO0o0 = linearLayoutCompat3;
        this.f58527OooO0o = linearLayoutCompat4;
        this.f58529OooO0oO = recyclerView;
        this.f58530OooO0oo = textView;
        this.f58522OooO = textView2;
    }

    @NonNull
    public static o7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58523OooO00o;
    }

    @NonNull
    public static o7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_activity_vote_game_create, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.btStartVoteGame;
        StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = oO00O0oO.ivChooseGift;
            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.ivChooseGiftDetail;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.ivSelectionPeriod;
                    if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.ivVoteTitle;
                        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                            i = oO00O0oO.llChooseGift;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                            if (linearLayoutCompat != null) {
                                i = oO00O0oO.llSelectionPeriod;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                                if (linearLayoutCompat2 != null) {
                                    i = oO00O0oO.llVoteGameTitle;
                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                                    if (linearLayoutCompat3 != null) {
                                        i = oO00O0oO.rvSelectVote;
                                        RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                                        if (recyclerView != null) {
                                            i = oO00O0oO.tvChooseGift;
                                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                i = oO00O0oO.tvSelectionPeriod;
                                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                    i = oO00O0oO.tvSelectionPeriodDetail;
                                                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView != null) {
                                                        i = oO00O0oO.tvVoteTitle;
                                                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                            i = oO00O0oO.tvVoteTitleDetail;
                                                            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (textView2 != null) {
                                                                return new o7((LinearLayoutCompat) viewInflate, stateButton, imageView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, recyclerView, textView, textView2);
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

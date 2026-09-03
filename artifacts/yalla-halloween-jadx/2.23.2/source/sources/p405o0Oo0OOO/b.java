package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f43725OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f43726OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f43727OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f43728OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f43729OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f43730OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f43731OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43732OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f43733OooO0oo;

    public b(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull StateButton stateButton, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f43726OooO00o = linearLayoutCompat;
        this.f43727OooO0O0 = stateButton;
        this.f43728OooO0OO = imageView;
        this.f43729OooO0Oo = linearLayoutCompat2;
        this.f43731OooO0o0 = linearLayoutCompat3;
        this.f43730OooO0o = linearLayoutCompat4;
        this.f43732OooO0oO = recyclerView;
        this.f43733OooO0oo = textView;
        this.f43725OooO = textView2;
    }

    @NonNull
    public static b inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43726OooO00o;
    }

    @NonNull
    public static b inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_activity_vote_game_create, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btStartVoteGame;
        StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
        if (stateButton != null) {
            i = o0OO00O.ivChooseGift;
            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.ivChooseGiftDetail;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.ivSelectionPeriod;
                    if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.ivVoteTitle;
                        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.llChooseGift;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                            if (linearLayoutCompat != null) {
                                i = o0OO00O.llSelectionPeriod;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                                if (linearLayoutCompat2 != null) {
                                    i = o0OO00O.llVoteGameTitle;
                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                                    if (linearLayoutCompat3 != null) {
                                        i = o0OO00O.rvSelectVote;
                                        RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                                        if (recyclerView != null) {
                                            i = o0OO00O.tvChooseGift;
                                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                i = o0OO00O.tvSelectionPeriod;
                                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                    i = o0OO00O.tvSelectionPeriodDetail;
                                                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView != null) {
                                                        i = o0OO00O.tvVoteTitle;
                                                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                            i = o0OO00O.tvVoteTitleDetail;
                                                            TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (textView2 != null) {
                                                                return new b((LinearLayoutCompat) viewInflate, stateButton, imageView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, recyclerView, textView, textView2);
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

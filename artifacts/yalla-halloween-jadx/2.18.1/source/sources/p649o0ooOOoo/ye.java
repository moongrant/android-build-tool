package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ye implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f51027OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f51028OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f51029OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f51030OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f51031OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f51032OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f51033OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f51034OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f51035OooO0oo;

    public ye(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull StateButton stateButton, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f51028OooO00o = linearLayoutCompat;
        this.f51029OooO0O0 = stateButton;
        this.f51030OooO0OO = imageView;
        this.f51031OooO0Oo = linearLayoutCompat2;
        this.f51033OooO0o0 = linearLayoutCompat3;
        this.f51032OooO0o = linearLayoutCompat4;
        this.f51034OooO0oO = recyclerView;
        this.f51035OooO0oo = textView;
        this.f51027OooO = textView2;
    }

    @NonNull
    public static ye inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51028OooO00o;
    }

    @NonNull
    public static ye inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_vote_game_create, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btStartVoteGame;
        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btStartVoteGame);
        if (stateButton != null) {
            i = R.id.ivChooseGift;
            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivChooseGift)) != null) {
                i = R.id.ivChooseGiftDetail;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivChooseGiftDetail);
                if (imageView != null) {
                    i = R.id.ivSelectionPeriod;
                    if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSelectionPeriod)) != null) {
                        i = R.id.ivVoteTitle;
                        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivVoteTitle)) != null) {
                            i = R.id.llChooseGift;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.llChooseGift);
                            if (linearLayoutCompat != null) {
                                i = R.id.llSelectionPeriod;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.llSelectionPeriod);
                                if (linearLayoutCompat2 != null) {
                                    i = R.id.llVoteGameTitle;
                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.llVoteGameTitle);
                                    if (linearLayoutCompat3 != null) {
                                        i = R.id.rvSelectVote;
                                        RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvSelectVote);
                                        if (recyclerView != null) {
                                            i = R.id.tvChooseGift;
                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvChooseGift)) != null) {
                                                i = R.id.tvSelectionPeriod;
                                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSelectionPeriod)) != null) {
                                                    i = R.id.tvSelectionPeriodDetail;
                                                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSelectionPeriodDetail);
                                                    if (textView != null) {
                                                        i = R.id.tvVoteTitle;
                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvVoteTitle)) != null) {
                                                            i = R.id.tvVoteTitleDetail;
                                                            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvVoteTitleDetail);
                                                            if (textView2 != null) {
                                                                return new ye((LinearLayoutCompat) viewInflate, stateButton, imageView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, recyclerView, textView, textView2);
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

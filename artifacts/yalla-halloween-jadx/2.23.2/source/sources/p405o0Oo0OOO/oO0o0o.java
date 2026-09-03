package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.ui.view.UserTagView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0o0o implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f44980OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44981OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44982OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44983OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44984OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f44985OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44986OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f44987OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f44988OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44989OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final StateButton f44990OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final StateButton f44991OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final StateButton f44992OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final StateButton f44993OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final SVGAView f44994OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final NetImageView f44995OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final UserTagView f44996OooOOo0;

    public oO0o0o(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull FragmentContainerView fragmentContainerView, @NonNull View view, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull StateButton stateButton, @NonNull StateButton stateButton2, @NonNull StateButton stateButton3, @NonNull StateButton stateButton4, @NonNull SVGAView sVGAView, @NonNull NetImageView netImageView, @NonNull UserTagView userTagView) {
        this.f44981OooO00o = constraintLayout;
        this.f44982OooO0O0 = imageView;
        this.f44983OooO0OO = imageView2;
        this.f44984OooO0Oo = constraintLayout2;
        this.f44986OooO0o0 = constraintLayout3;
        this.f44985OooO0o = fragmentContainerView;
        this.f44987OooO0oO = view;
        this.f44988OooO0oo = view2;
        this.f44980OooO = textView;
        this.f44989OooOO0 = textView2;
        this.f44990OooOO0O = stateButton;
        this.f44991OooOO0o = stateButton2;
        this.f44993OooOOO0 = stateButton3;
        this.f44992OooOOO = stateButton4;
        this.f44994OooOOOO = sVGAView;
        this.f44995OooOOOo = netImageView;
        this.f44996OooOOo0 = userTagView;
    }

    @NonNull
    public static oO0o0o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44981OooO00o;
    }

    @NonNull
    public static oO0o0o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_activity_top, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bgLeft;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.bgRight;
            ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                i = o0OO00O.clBottom;
                ConstraintLayout constraintLayout = (ConstraintLayout) OooO0O0.OooO00o(i, viewInflate);
                if (constraintLayout != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                    i = o0OO00O.flCenter;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) OooO0O0.OooO00o(i, viewInflate);
                    if (fragmentContainerView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.lineBg), viewInflate)) != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o0OO00O.shape), viewInflate)) != null) {
                        i = o0OO00O.tvCoin;
                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            i = o0OO00O.tvRanking;
                            TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView2 != null) {
                                i = o0OO00O.tvReceiveGift;
                                StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
                                if (stateButton != null) {
                                    i = o0OO00O.tvSentGift;
                                    StateButton stateButton2 = (StateButton) OooO0O0.OooO00o(i, viewInflate);
                                    if (stateButton2 != null) {
                                        i = o0OO00O.tvTopRoom;
                                        StateButton stateButton3 = (StateButton) OooO0O0.OooO00o(i, viewInflate);
                                        if (stateButton3 != null) {
                                            i = o0OO00O.tvYallaBillion;
                                            StateButton stateButton4 = (StateButton) OooO0O0.OooO00o(i, viewInflate);
                                            if (stateButton4 != null) {
                                                i = o0OO00O.userHeadFrame;
                                                SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                                if (sVGAView != null) {
                                                    i = o0OO00O.userPhoto;
                                                    NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (netImageView != null) {
                                                        i = o0OO00O.userTagView;
                                                        UserTagView userTagView = (UserTagView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (userTagView != null) {
                                                            return new oO0o0o(constraintLayout2, imageView, imageView2, constraintLayout, constraintLayout2, fragmentContainerView, viewOooO00o, viewOooO00o2, textView, textView2, stateButton, stateButton2, stateButton3, stateButton4, sVGAView, netImageView, userTagView);
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

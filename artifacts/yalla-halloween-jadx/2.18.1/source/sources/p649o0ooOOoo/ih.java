package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ih implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49681OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f49682OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f49683OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FragmentContainerView f49684OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final View f49685OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ni f49686OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f49687OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f49688OooO0oo;

    public ih(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton, @NonNull StateButton stateButton2, @NonNull FragmentContainerView fragmentContainerView, @NonNull ni niVar, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f49681OooO00o = constraintLayout;
        this.f49682OooO0O0 = stateButton;
        this.f49683OooO0OO = stateButton2;
        this.f49684OooO0Oo = fragmentContainerView;
        this.f49686OooO0o0 = niVar;
        this.f49685OooO0o = view;
        this.f49687OooO0oO = view2;
        this.f49688OooO0oo = view3;
    }

    @NonNull
    public static ih inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49681OooO00o;
    }

    @NonNull
    public static ih inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_badge_rank, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btFriendType;
        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btFriendType);
        if (stateButton != null) {
            i = R.id.btGlobType;
            StateButton stateButton2 = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btGlobType);
            if (stateButton2 != null) {
                i = R.id.fgBadgeRank;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) o00Oo0.OooO00o(viewInflate, R.id.fgBadgeRank);
                if (fragmentContainerView != null) {
                    i = R.id.headerLayout;
                    View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.headerLayout);
                    if (viewOooO00o != null) {
                        f7.OooO00o(viewOooO00o);
                        i = R.id.ilBottom;
                        View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.ilBottom);
                        if (viewOooO00o2 != null) {
                            ni niVarOooO00o = ni.OooO00o(viewOooO00o2);
                            i = R.id.lineBg;
                            View viewOooO00o3 = o00Oo0.OooO00o(viewInflate, R.id.lineBg);
                            if (viewOooO00o3 != null) {
                                i = R.id.shape;
                                View viewOooO00o4 = o00Oo0.OooO00o(viewInflate, R.id.shape);
                                if (viewOooO00o4 != null) {
                                    i = R.id.vBg;
                                    View viewOooO00o5 = o00Oo0.OooO00o(viewInflate, R.id.vBg);
                                    if (viewOooO00o5 != null) {
                                        return new ih((ConstraintLayout) viewInflate, stateButton, stateButton2, fragmentContainerView, niVarOooO00o, viewOooO00o3, viewOooO00o4, viewOooO00o5);
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

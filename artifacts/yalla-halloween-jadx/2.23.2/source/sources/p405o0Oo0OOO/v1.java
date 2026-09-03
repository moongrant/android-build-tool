package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45617OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45618OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f45619OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final r1 f45620OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final q2 f45621OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45622OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f45623OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45624OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45625OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45626OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final Toolbar f45627OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f45628OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f45629OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45630OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f45631OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45632OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f45633OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final View f45634OooOOo0;

    public v1(@NonNull ConstraintLayout constraintLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull r1 r1Var, @NonNull q2 q2Var, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull Toolbar toolbar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout6, @NonNull View view, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f45618OooO00o = constraintLayout;
        this.f45619OooO0O0 = coordinatorLayout;
        this.f45620OooO0OO = r1Var;
        this.f45621OooO0Oo = q2Var;
        this.f45623OooO0o0 = imageView;
        this.f45622OooO0o = linearLayout;
        this.f45624OooO0oO = linearLayout2;
        this.f45625OooO0oo = linearLayout3;
        this.f45617OooO = linearLayout4;
        this.f45626OooOO0 = linearLayout5;
        this.f45627OooOO0O = toolbar;
        this.f45628OooOO0o = textView;
        this.f45630OooOOO0 = textView2;
        this.f45629OooOOO = textView3;
        this.f45631OooOOOO = textView4;
        this.f45632OooOOOo = linearLayout6;
        this.f45634OooOOo0 = view;
        this.f45633OooOOo = viewPagerFixed;
    }

    @NonNull
    public static v1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45618OooO00o;
    }

    @NonNull
    public static v1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_user_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.clUserInfo;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) OooO0O0.OooO00o(i, viewInflate);
        if (coordinatorLayout != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.delete_account), viewInflate)) != null) {
            r1 r1VarOooO00o = r1.OooO00o(viewOooO00o);
            i = o0OO00O.head;
            View viewOooO00o3 = OooO0O0.OooO00o(i, viewInflate);
            if (viewOooO00o3 != null) {
                q2 q2VarOooO00o = q2.OooO00o(viewOooO00o3);
                i = o0OO00O.iv_more;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.ll_bottom;
                    LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (linearLayout != null) {
                        i = o0OO00O.ll_follow;
                        LinearLayout linearLayout2 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (linearLayout2 != null) {
                            i = o0OO00O.ll_friend;
                            LinearLayout linearLayout3 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (linearLayout3 != null) {
                                i = o0OO00O.ll_inroom;
                                LinearLayout linearLayout4 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                if (linearLayout4 != null) {
                                    i = o0OO00O.ll_message;
                                    LinearLayout linearLayout5 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                    if (linearLayout5 != null) {
                                        i = o0OO00O.toolbar;
                                        Toolbar toolbar = (Toolbar) OooO0O0.OooO00o(i, viewInflate);
                                        if (toolbar != null) {
                                            i = o0OO00O.tv_follow;
                                            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView != null) {
                                                i = o0OO00O.tv_friend;
                                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView2 != null) {
                                                    i = o0OO00O.tv_inroom;
                                                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = o0OO00O.tv_title;
                                                        TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (textView4 != null) {
                                                            i = o0OO00O.user_edit_container;
                                                            LinearLayout linearLayout6 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                                            if (linearLayout6 != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o0OO00O.v_line), viewInflate)) != null) {
                                                                i = o0OO00O.vp_userinfo;
                                                                ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooO0O0.OooO00o(i, viewInflate);
                                                                if (viewPagerFixed != null) {
                                                                    return new v1((ConstraintLayout) viewInflate, coordinatorLayout, r1VarOooO00o, q2VarOooO00o, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, toolbar, textView, textView2, textView3, textView4, linearLayout6, viewOooO00o2, viewPagerFixed);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

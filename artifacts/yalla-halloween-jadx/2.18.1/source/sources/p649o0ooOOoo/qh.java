package p649o0ooOOoo;

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
import com.app.base.view.ViewPagerFixed;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class qh implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50395OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50396OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f50397OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final mh f50398OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final li f50399OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50400OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f50401OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50402OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50403OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50404OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final Toolbar f50405OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50406OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f50407OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50408OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f50409OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50410OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f50411OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final View f50412OooOOo0;

    public qh(@NonNull ConstraintLayout constraintLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull mh mhVar, @NonNull li liVar, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull Toolbar toolbar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout6, @NonNull View view, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f50396OooO00o = constraintLayout;
        this.f50397OooO0O0 = coordinatorLayout;
        this.f50398OooO0OO = mhVar;
        this.f50399OooO0Oo = liVar;
        this.f50401OooO0o0 = imageView;
        this.f50400OooO0o = linearLayout;
        this.f50402OooO0oO = linearLayout2;
        this.f50403OooO0oo = linearLayout3;
        this.f50395OooO = linearLayout4;
        this.f50404OooOO0 = linearLayout5;
        this.f50405OooOO0O = toolbar;
        this.f50406OooOO0o = textView;
        this.f50408OooOOO0 = textView2;
        this.f50407OooOOO = textView3;
        this.f50409OooOOOO = textView4;
        this.f50410OooOOOo = linearLayout6;
        this.f50412OooOOo0 = view;
        this.f50411OooOOo = viewPagerFixed;
    }

    @NonNull
    public static qh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50396OooO00o;
    }

    @NonNull
    public static qh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_user_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.clUserInfo;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) o00Oo0.OooO00o(viewInflate, R.id.clUserInfo);
        if (coordinatorLayout != null) {
            i = R.id.delete_account;
            View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.delete_account);
            if (viewOooO00o != null) {
                mh mhVarOooO00o = mh.OooO00o(viewOooO00o);
                i = R.id.head;
                View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.head);
                if (viewOooO00o2 != null) {
                    li liVarOooO00o = li.OooO00o(viewOooO00o2);
                    i = R.id.iv_more;
                    ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_more);
                    if (imageView != null) {
                        i = R.id.ll_bottom;
                        LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_bottom);
                        if (linearLayout != null) {
                            i = R.id.ll_follow;
                            LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_follow);
                            if (linearLayout2 != null) {
                                i = R.id.ll_friend;
                                LinearLayout linearLayout3 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_friend);
                                if (linearLayout3 != null) {
                                    i = R.id.ll_inroom;
                                    LinearLayout linearLayout4 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_inroom);
                                    if (linearLayout4 != null) {
                                        i = R.id.ll_message;
                                        LinearLayout linearLayout5 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.ll_message);
                                        if (linearLayout5 != null) {
                                            i = R.id.toolbar;
                                            Toolbar toolbar = (Toolbar) o00Oo0.OooO00o(viewInflate, R.id.toolbar);
                                            if (toolbar != null) {
                                                i = R.id.tv_follow;
                                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_follow);
                                                if (textView != null) {
                                                    i = R.id.tv_friend;
                                                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_friend);
                                                    if (textView2 != null) {
                                                        i = R.id.tv_inroom;
                                                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_inroom);
                                                        if (textView3 != null) {
                                                            i = R.id.tv_title;
                                                            TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_title);
                                                            if (textView4 != null) {
                                                                i = R.id.user_edit_container;
                                                                LinearLayout linearLayout6 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.user_edit_container);
                                                                if (linearLayout6 != null) {
                                                                    i = R.id.v_line;
                                                                    View viewOooO00o3 = o00Oo0.OooO00o(viewInflate, R.id.v_line);
                                                                    if (viewOooO00o3 != null) {
                                                                        i = R.id.vp_userinfo;
                                                                        ViewPagerFixed viewPagerFixed = (ViewPagerFixed) o00Oo0.OooO00o(viewInflate, R.id.vp_userinfo);
                                                                        if (viewPagerFixed != null) {
                                                                            return new qh((ConstraintLayout) viewInflate, coordinatorLayout, mhVarOooO00o, liVarOooO00o, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, toolbar, textView, textView2, textView3, textView4, linearLayout6, viewOooO00o3, viewPagerFixed);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

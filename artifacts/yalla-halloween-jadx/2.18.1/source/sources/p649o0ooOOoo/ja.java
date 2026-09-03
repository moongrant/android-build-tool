package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.view.ViewPagerFixed;
import com.google.android.material.tabs.TabLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ja implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49733OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f49734OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49735OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TabLayout f49736OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49737OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49738OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f49739OooO0oO;

    public ja(@NonNull ConstraintLayout constraintLayout, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f49733OooO00o = constraintLayout;
        this.f49734OooO0O0 = editText;
        this.f49735OooO0OO = imageView;
        this.f49736OooO0Oo = tabLayout;
        this.f49738OooO0o0 = textView;
        this.f49737OooO0o = constraintLayout2;
        this.f49739OooO0oO = viewPagerFixed;
    }

    @NonNull
    public static ja inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49733OooO00o;
    }

    @NonNull
    public static ja inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_activity_main_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.etSearch;
        EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.etSearch);
        if (editText != null) {
            i = R.id.ivDelete;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivDelete);
            if (imageView != null) {
                i = R.id.llSearch;
                if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llSearch)) != null) {
                    i = R.id.tabLayout;
                    TabLayout tabLayout = (TabLayout) o00Oo0.OooO00o(viewInflate, R.id.tabLayout);
                    if (tabLayout != null) {
                        i = R.id.tvSearch;
                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSearch);
                        if (textView != null) {
                            i = R.id.vSearch;
                            ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.vSearch);
                            if (constraintLayout != null) {
                                i = R.id.vpSearch;
                                ViewPagerFixed viewPagerFixed = (ViewPagerFixed) o00Oo0.OooO00o(viewInflate, R.id.vpSearch);
                                if (viewPagerFixed != null) {
                                    return new ja((ConstraintLayout) viewInflate, editText, imageView, tabLayout, textView, constraintLayout, viewPagerFixed);
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

package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.flexbox.FlexboxLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class kb implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49853OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49854OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FlexboxLayout f49855OooO0OO;

    public kb(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FlexboxLayout flexboxLayout) {
        this.f49853OooO00o = frameLayout;
        this.f49854OooO0O0 = imageView;
        this.f49855OooO0OO = flexboxLayout;
    }

    @NonNull
    public static kb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49853OooO00o;
    }

    @NonNull
    public static kb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_search_adapter_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.delete_search_history;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.delete_search_history);
        if (imageView != null) {
            i = R.id.history_search_layout;
            FlexboxLayout flexboxLayout = (FlexboxLayout) o00Oo0.OooO00o(viewInflate, R.id.history_search_layout);
            if (flexboxLayout != null) {
                i = R.id.tvSearch;
                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSearch)) != null) {
                    return new kb((FrameLayout) viewInflate, imageView, flexboxLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

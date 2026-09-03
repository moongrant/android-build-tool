package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ua implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50693OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50694OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50695OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50696OooO0Oo;

    public ua(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView) {
        this.f50693OooO00o = linearLayout;
        this.f50694OooO0O0 = imageView;
        this.f50695OooO0OO = linearLayout2;
        this.f50696OooO0Oo = recyclerView;
    }

    @NonNull
    public static ua OooO00o(@NonNull View view) {
        int i = R.id.ivCountryClose;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(view, R.id.ivCountryClose);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(view, R.id.rvCountry);
            if (recyclerView != null) {
                return new ua(linearLayout, imageView, linearLayout, recyclerView);
            }
            i = R.id.rvCountry;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ua inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50693OooO00o;
    }

    @NonNull
    public static ua inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_dialog_explore_country_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}

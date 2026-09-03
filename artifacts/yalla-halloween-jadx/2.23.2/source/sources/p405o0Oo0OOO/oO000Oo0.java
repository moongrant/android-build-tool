package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44778OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44779OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44780OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44781OooO0Oo;

    public oO000Oo0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView) {
        this.f44778OooO00o = linearLayout;
        this.f44779OooO0O0 = imageView;
        this.f44780OooO0OO = linearLayout2;
        this.f44781OooO0Oo = recyclerView;
    }

    @NonNull
    public static oO000Oo0 OooO00o(@NonNull View view) {
        int i = o0OO00O.ivCountryClose;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, view);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = o0OO00O.rvCountry;
            RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i2, view);
            if (recyclerView != null) {
                return new oO000Oo0(linearLayout, imageView, linearLayout, recyclerView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static oO000Oo0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44778OooO00o;
    }

    @NonNull
    public static oO000Oo0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_dialog_explore_country_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}

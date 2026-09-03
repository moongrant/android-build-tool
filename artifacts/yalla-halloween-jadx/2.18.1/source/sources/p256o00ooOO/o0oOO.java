package p256o00ooOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;
import p255o00ooO0o.o00O0O0O;
import p255o00ooO0o.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0oOO implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f34403OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f34404OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f34405OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f34406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f34407OooO0o0;

    public o0oOO(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull View view, @NonNull View view2) {
        this.f34403OooO00o = linearLayout;
        this.f34404OooO0O0 = recyclerView;
        this.f34405OooO0OO = textView;
        this.f34406OooO0Oo = view;
        this.f34407OooO0o0 = view2;
    }

    @NonNull
    public static o0oOO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f34403OooO00o;
    }

    @NonNull
    public static o0oOO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(o00O0OO0.yl_dialog_bottom_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o00O0O0O.recycler_view;
        RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, i);
        if (recyclerView != null) {
            i = o00O0O0O.tvCancel;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, i);
            if (textView != null) {
                i = o00O0O0O.tvTitle;
                if (((TextView) o00Oo0.OooO00o(viewInflate, i)) != null && (viewOooO00o = o00Oo0.OooO00o(viewInflate, (i = o00O0O0O.vLineCancel))) != null && (viewOooO00o2 = o00Oo0.OooO00o(viewInflate, (i = o00O0O0O.vLineTitle))) != null) {
                    return new o0oOO((LinearLayout) viewInflate, recyclerView, textView, viewOooO00o, viewOooO00o2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

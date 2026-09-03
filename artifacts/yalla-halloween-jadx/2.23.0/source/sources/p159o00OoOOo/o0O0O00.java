package p159o00OoOOo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p157o00OoOO0.o00oO0o;
import p157o00OoOO0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f38479OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f38480OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f38481OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f38482OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f38483OooO0o0;

    public o0O0O00(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull View view, @NonNull View view2) {
        this.f38479OooO00o = linearLayout;
        this.f38480OooO0O0 = recyclerView;
        this.f38481OooO0OO = textView;
        this.f38482OooO0Oo = view;
        this.f38483OooO0o0 = view2;
    }

    @NonNull
    public static o0O0O00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f38479OooO00o;
    }

    @NonNull
    public static o0O0O00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(o00oO0o.yl_dialog_bottom_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oo000o.recycler_view;
        RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
        if (recyclerView != null) {
            i = oo000o.tvCancel;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = oo000o.tvTitle;
                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooOO0.OooO00o((i = oo000o.vLineCancel), viewInflate)) != null && (viewOooO00o2 = OooOO0.OooO00o((i = oo000o.vLineTitle), viewInflate)) != null) {
                    return new o0O0O00((LinearLayout) viewInflate, recyclerView, textView, viewOooO00o, viewOooO00o2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

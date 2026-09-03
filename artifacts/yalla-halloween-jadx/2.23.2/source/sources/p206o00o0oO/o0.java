package p206o00o0oO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p205o00o0o0o.o000O0;
import p205o00o0o0o.o000O00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f39382OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f39383OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f39384OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f39385OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f39386OooO0o0;

    public o0(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull View view, @NonNull View view2) {
        this.f39382OooO00o = linearLayout;
        this.f39383OooO0O0 = recyclerView;
        this.f39384OooO0OO = textView;
        this.f39385OooO0Oo = view;
        this.f39386OooO0o0 = view2;
    }

    @NonNull
    public static o0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f39382OooO00o;
    }

    @NonNull
    public static o0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewInflate = layoutInflater.inflate(o000O0.yl_dialog_bottom_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o000O00O.recycler_view;
        RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
        if (recyclerView != null) {
            i = o000O00O.tvCancel;
            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = o000O00O.tvTitle;
                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooO0O0.OooO00o((i = o000O00O.vLineCancel), viewInflate)) != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o000O00O.vLineTitle), viewInflate)) != null) {
                    return new o0((LinearLayout) viewInflate, recyclerView, textView, viewOooO00o, viewOooO00o2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

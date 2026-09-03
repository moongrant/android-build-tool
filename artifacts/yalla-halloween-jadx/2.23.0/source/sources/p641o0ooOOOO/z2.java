package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.recyclerview.NoScrollRecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class z2 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59435OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f59436OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NoScrollRecyclerView f59437OooO0OO;

    public z2(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull NoScrollRecyclerView noScrollRecyclerView) {
        this.f59435OooO00o = linearLayout;
        this.f59436OooO0O0 = textView;
        this.f59437OooO0OO = noScrollRecyclerView;
    }

    @NonNull
    public static z2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59435OooO00o;
    }

    @NonNull
    public static z2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.layout_moment_task_poll, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ballots;
        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = oO00O0oO.recyclerView;
            NoScrollRecyclerView noScrollRecyclerView = (NoScrollRecyclerView) OooOO0.OooO00o(i, viewInflate);
            if (noScrollRecyclerView != null) {
                return new z2((LinearLayout) viewInflate, textView, noScrollRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

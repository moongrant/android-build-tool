package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class y4 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59384OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f59385OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f59386OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f59387OooO0Oo;

    public y4(@NonNull LinearLayout linearLayout, @NonNull ComposeView composeView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f59384OooO00o = linearLayout;
        this.f59385OooO0O0 = composeView;
        this.f59386OooO0OO = recyclerView;
        this.f59387OooO0Oo = recyclerView2;
    }

    @NonNull
    public static y4 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59384OooO00o;
    }

    @NonNull
    public static y4 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_activity_yalla_team, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bottomComposeView;
        ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = oO00O0oO.rvMessage;
            RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
            if (recyclerView != null) {
                i = oO00O0oO.rvType;
                RecyclerView recyclerView2 = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                if (recyclerView2 != null) {
                    return new y4((LinearLayout) viewInflate, composeView, recyclerView, recyclerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

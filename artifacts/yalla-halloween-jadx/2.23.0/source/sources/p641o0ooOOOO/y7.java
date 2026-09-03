package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.CrossRecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class y7 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f59397OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CrossRecyclerView f59398OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f59399OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f59400OooO0Oo;

    public y7(@NonNull FrameLayout frameLayout, @NonNull CrossRecyclerView crossRecyclerView, @NonNull RecyclerView recyclerView, @NonNull View view) {
        this.f59397OooO00o = frameLayout;
        this.f59398OooO0O0 = crossRecyclerView;
        this.f59399OooO0OO = recyclerView;
        this.f59400OooO0Oo = view;
    }

    @NonNull
    public static y7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59397OooO00o;
    }

    @NonNull
    public static y7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_dialog_mic_emoji_panel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.rvEmojiPanelContent;
        CrossRecyclerView crossRecyclerView = (CrossRecyclerView) OooOO0.OooO00o(i, viewInflate);
        if (crossRecyclerView != null) {
            i = oO00O0oO.rvEmojiPanelTable;
            RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
            if (recyclerView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.vSplitLine), viewInflate)) != null) {
                return new y7((FrameLayout) viewInflate, crossRecyclerView, recyclerView, viewOooO00o);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

package p363o0OOo0O0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p081o000OoOO.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43948OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43949OooO0O0;

    public OooO0o(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f43948OooO00o = recyclerView;
        this.f43949OooO0O0 = recyclerView2;
    }

    @NonNull
    public static OooO0o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f43948OooO00o;
    }

    @NonNull
    public static OooO0o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(p360o0OOo00O.OooO.custom_list_up_down_popup_window, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate;
        return new OooO0o(recyclerView, recyclerView);
    }
}

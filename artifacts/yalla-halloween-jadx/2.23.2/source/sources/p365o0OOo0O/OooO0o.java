package p365o0OOo0O;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import o00O00o0.OooO00o;
import p366o0OOo0O0.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43074OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43075OooO0O0;

    public OooO0o(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f43074OooO00o = recyclerView;
        this.f43075OooO0O0 = recyclerView2;
    }

    @NonNull
    public static OooO0o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43074OooO00o;
    }

    @NonNull
    public static OooO0o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(OooOOO0.custom_list_up_down_popup_window, viewGroup, false);
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

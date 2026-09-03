package p473o0OoooO0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import p104o000oo0O.o00O0O;
import p459o0Ooo0O.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40653OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f40654OooO0O0;

    public o00O(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f40653OooO00o = recyclerView;
        this.f40654OooO0O0 = recyclerView2;
    }

    @NonNull
    public static o00O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f40653OooO00o;
    }

    @NonNull
    public static o00O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o00000OO.custom_list_up_down_popup_window, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        Objects.requireNonNull(viewInflate, "rootView");
        RecyclerView recyclerView = (RecyclerView) viewInflate;
        return new o00O(recyclerView, recyclerView);
    }
}

package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import java.util.Objects;
import p104o000oo0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class gi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49499OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49500OooO0O0;

    public gi(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f49499OooO00o = recyclerView;
        this.f49500OooO0O0 = recyclerView2;
    }

    @NonNull
    public static gi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49499OooO00o;
    }

    @NonNull
    public static gi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_fragment_badge_news, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        Objects.requireNonNull(viewInflate, "rootView");
        RecyclerView recyclerView = (RecyclerView) viewInflate;
        return new gi(recyclerView, recyclerView);
    }
}

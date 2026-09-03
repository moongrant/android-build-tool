package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.StateLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class mc implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50020OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50021OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateLayout f50022OooO0OO;

    public mc(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout) {
        this.f50020OooO00o = linearLayout;
        this.f50021OooO0O0 = recyclerView;
        this.f50022OooO0OO = stateLayout;
    }

    @NonNull
    public static mc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50020OooO00o;
    }

    @NonNull
    public static mc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_activity_add_topic_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
        if (recyclerView != null) {
            i = R.id.search;
            View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.search);
            if (viewOooO00o != null) {
                j9.OooO00o(viewOooO00o);
                StateLayout stateLayout = (StateLayout) o00Oo0.OooO00o(viewInflate, R.id.stateLayout);
                if (stateLayout != null) {
                    return new mc((LinearLayout) viewInflate, recyclerView, stateLayout);
                }
                i = R.id.stateLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

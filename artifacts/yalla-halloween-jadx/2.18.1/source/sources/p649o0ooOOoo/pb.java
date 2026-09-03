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
public final class pb implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50280OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50281OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateLayout f50282OooO0OO;

    public pb(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout) {
        this.f50280OooO00o = linearLayout;
        this.f50281OooO0O0 = recyclerView;
        this.f50282OooO0OO = stateLayout;
    }

    @NonNull
    public static pb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50280OooO00o;
    }

    @NonNull
    public static pb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_activity_share_to_friends, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.rv_share_to_friends;
        RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rv_share_to_friends);
        if (recyclerView != null) {
            i = R.id.ylState;
            StateLayout stateLayout = (StateLayout) o00Oo0.OooO00o(viewInflate, R.id.ylState);
            if (stateLayout != null) {
                return new pb((LinearLayout) viewInflate, recyclerView, stateLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.common.statuslayout.StatusLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class lh implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49981OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49982OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49983OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StatusLayout f49984OooO0Oo;

    public lh(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull RecyclerView recyclerView, @NonNull StatusLayout statusLayout) {
        this.f49981OooO00o = constraintLayout;
        this.f49982OooO0O0 = netImageView;
        this.f49983OooO0OO = recyclerView;
        this.f49984OooO0Oo = statusLayout;
    }

    @NonNull
    public static lh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49981OooO00o;
    }

    @NonNull
    public static lh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_default_head, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.head_image;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.head_image);
        if (netImageView != null) {
            i = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
            if (recyclerView != null) {
                i = R.id.status;
                StatusLayout statusLayout = (StatusLayout) o00Oo0.OooO00o(viewInflate, R.id.status);
                if (statusLayout != null) {
                    return new lh((ConstraintLayout) viewInflate, netImageView, recyclerView, statusLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

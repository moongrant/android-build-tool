package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class qd implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50375OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50376OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Group f50377OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f50378OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50379OooO0o0;

    public qd(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull Group group, @NonNull View view, @NonNull RecyclerView recyclerView) {
        this.f50375OooO00o = constraintLayout;
        this.f50376OooO0O0 = linearLayout;
        this.f50377OooO0OO = group;
        this.f50378OooO0Oo = view;
        this.f50379OooO0o0 = recyclerView;
    }

    @NonNull
    public static qd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50375OooO00o;
    }

    @NonNull
    public static qd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_follow_recomment_head_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.reComment_head;
        LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.reComment_head);
        if (linearLayout != null) {
            i = R.id.user_head;
            Group group = (Group) o00Oo0.OooO00o(viewInflate, R.id.user_head);
            if (group != null) {
                i = R.id.user_line;
                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.user_line);
                if (viewOooO00o != null) {
                    i = R.id.user_recycler;
                    RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.user_recycler);
                    if (recyclerView != null) {
                        return new qd((ConstraintLayout) viewInflate, linearLayout, group, viewOooO00o, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

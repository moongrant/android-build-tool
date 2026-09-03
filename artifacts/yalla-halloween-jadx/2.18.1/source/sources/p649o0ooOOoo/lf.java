package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.StateLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class lf implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49970OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49971OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49972OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f49973OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final StateLayout f49974OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49975OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49976OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49977OooO0oo;

    public lf(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f49970OooO00o = constraintLayout;
        this.f49971OooO0O0 = imageView;
        this.f49972OooO0OO = textView;
        this.f49973OooO0Oo = view;
        this.f49975OooO0o0 = recyclerView;
        this.f49974OooO0o = stateLayout;
        this.f49976OooO0oO = textView2;
        this.f49977OooO0oo = textView3;
    }

    @NonNull
    public static lf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49970OooO00o;
    }

    @NonNull
    public static lf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_quick_recharge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.close;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.close);
        if (imageView != null) {
            i = R.id.coin;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.coin);
            if (textView != null) {
                i = R.id.line;
                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.line);
                if (viewOooO00o != null) {
                    i = R.id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
                    if (recyclerView != null) {
                        i = R.id.stateLayout;
                        StateLayout stateLayout = (StateLayout) o00Oo0.OooO00o(viewInflate, R.id.stateLayout);
                        if (stateLayout != null) {
                            i = R.id.tempText;
                            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tempText);
                            if (textView2 != null) {
                                i = R.id.tvHelp;
                                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvHelp);
                                if (textView3 != null) {
                                    return new lf((ConstraintLayout) viewInflate, imageView, textView, viewOooO00o, recyclerView, stateLayout, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

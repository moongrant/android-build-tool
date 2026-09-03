package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.StateLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class b8 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57593OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f57594OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f57595OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f57596OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final StateLayout f57597OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57598OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f57599OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f57600OooO0oo;

    public b8(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f57593OooO00o = constraintLayout;
        this.f57594OooO0O0 = imageView;
        this.f57595OooO0OO = textView;
        this.f57596OooO0Oo = view;
        this.f57598OooO0o0 = recyclerView;
        this.f57597OooO0o = stateLayout;
        this.f57599OooO0oO = textView2;
        this.f57600OooO0oo = textView3;
    }

    @NonNull
    public static b8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57593OooO00o;
    }

    @NonNull
    public static b8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_dialog_quick_recharge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.close;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.coin;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.line), viewInflate)) != null) {
                i = oO00O0oO.recyclerView;
                RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = oO00O0oO.stateLayout;
                    StateLayout stateLayout = (StateLayout) OooOO0.OooO00o(i, viewInflate);
                    if (stateLayout != null) {
                        i = oO00O0oO.tempText;
                        TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView2 != null) {
                            i = oO00O0oO.tvHelp;
                            TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView3 != null) {
                                return new b8((ConstraintLayout) viewInflate, imageView, textView, viewOooO00o, recyclerView, stateLayout, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

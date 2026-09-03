package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.recyclerview.NoScrollRecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class d3 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57715OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f57716OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57717OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NoScrollRecyclerView f57718OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final View f57719OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f57720OooO0o0;

    public d3(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull NoScrollRecyclerView noScrollRecyclerView, @NonNull TextView textView, @NonNull View view) {
        this.f57715OooO00o = constraintLayout;
        this.f57716OooO0O0 = imageView;
        this.f57717OooO0OO = linearLayout;
        this.f57718OooO0Oo = noScrollRecyclerView;
        this.f57720OooO0o0 = textView;
        this.f57719OooO0o = view;
    }

    @NonNull
    public static d3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57715OooO00o;
    }

    @NonNull
    public static d3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.layout_send_moment_poll, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.close;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.layoutAdd;
            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
            if (linearLayout != null) {
                i = oO00O0oO.pollLength;
                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.recyclerView;
                    NoScrollRecyclerView noScrollRecyclerView = (NoScrollRecyclerView) OooOO0.OooO00o(i, viewInflate);
                    if (noScrollRecyclerView != null) {
                        i = oO00O0oO.timeLong;
                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            i = oO00O0oO.title;
                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.titleLine), viewInflate)) != null) {
                                i = oO00O0oO.tvAdd;
                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                    return new d3((ConstraintLayout) viewInflate, imageView, linearLayout, noScrollRecyclerView, textView, viewOooO00o);
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

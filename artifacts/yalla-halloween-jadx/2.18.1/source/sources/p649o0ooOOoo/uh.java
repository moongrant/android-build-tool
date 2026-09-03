package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.FlowLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class uh implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50746OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FlowLayout f50747OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50748OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50749OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50750OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50751OooO0o0;

    public uh(@NonNull LinearLayout linearLayout, @NonNull FlowLayout flowLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f50746OooO00o = linearLayout;
        this.f50747OooO0O0 = flowLayout;
        this.f50748OooO0OO = recyclerView;
        this.f50749OooO0Oo = textView;
        this.f50751OooO0o0 = textView2;
        this.f50750OooO0o = textView3;
    }

    @NonNull
    public static uh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50746OooO00o;
    }

    @NonNull
    public static uh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_userinfo_edit_tag, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.flTagSelected;
        FlowLayout flowLayout = (FlowLayout) o00Oo0.OooO00o(viewInflate, R.id.flTagSelected);
        if (flowLayout != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recycler_view);
            if (recyclerView != null) {
                i = R.id.tvAllTag;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvAllTag);
                if (textView != null) {
                    i = R.id.tvHintTag;
                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvHintTag);
                    if (textView2 != null) {
                        i = R.id.tvSelected;
                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSelected);
                        if (textView3 != null) {
                            return new uh((LinearLayout) viewInflate, flowLayout, recyclerView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

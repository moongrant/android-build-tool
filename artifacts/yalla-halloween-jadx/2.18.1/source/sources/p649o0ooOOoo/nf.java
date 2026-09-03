package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class nf implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50112OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50113OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50114OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50115OooO0Oo;

    public nf(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RecyclerView recyclerView) {
        this.f50112OooO00o = constraintLayout;
        this.f50113OooO0O0 = imageView;
        this.f50114OooO0OO = imageView2;
        this.f50115OooO0Oo = recyclerView;
    }

    @NonNull
    public static nf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50112OooO00o;
    }

    @NonNull
    public static nf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_theme_buy, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivLeftPreview;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLeftPreview);
        if (imageView != null) {
            i = R.id.ivRightPreview;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivRightPreview);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvImagePreview);
                if (recyclerView != null) {
                    return new nf(constraintLayout, imageView, imageView2, recyclerView);
                }
                i = R.id.rvImagePreview;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

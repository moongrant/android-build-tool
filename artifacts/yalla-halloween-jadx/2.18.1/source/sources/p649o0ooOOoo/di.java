package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class di implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49201OooO00o;

    public di(@NonNull LinearLayout linearLayout) {
        this.f49201OooO00o = linearLayout;
    }

    @NonNull
    public static di inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49201OooO00o;
    }

    @NonNull
    public static di inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_dialog_moment_post_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivBadge;
        if (((AppCompatImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBadge)) != null) {
            i = R.id.tvBadgeNum;
            if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvBadgeNum)) != null) {
                return new di((LinearLayout) viewInflate);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

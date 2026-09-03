package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class mh implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50035OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50036OooO0O0;

    public mh(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f50035OooO00o = linearLayout;
        this.f50036OooO0O0 = linearLayout2;
    }

    @NonNull
    public static mh OooO00o(@NonNull View view) {
        if (((TextView) o00Oo0.OooO00o(view, R.id.delete_account_layout_content)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.delete_account_layout_content)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new mh(linearLayout, linearLayout);
    }

    @NonNull
    public static mh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50035OooO00o;
    }

    @NonNull
    public static mh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_delete_account_layout_user_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}

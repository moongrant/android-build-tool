package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.flexbox.FlexboxLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class t7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50632OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FlexboxLayout f50633OooO0O0;

    public t7(@NonNull LinearLayout linearLayout, @NonNull FlexboxLayout flexboxLayout) {
        this.f50632OooO00o = linearLayout;
        this.f50633OooO0O0 = flexboxLayout;
    }

    @NonNull
    public static t7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50632OooO00o;
    }

    @NonNull
    public static t7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_event_tag, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.info;
        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.info)) != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            FlexboxLayout flexboxLayout = (FlexboxLayout) o00Oo0.OooO00o(viewInflate, R.id.tags);
            if (flexboxLayout == null) {
                i = R.id.tags;
            } else {
                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.title)) != null) {
                    return new t7(linearLayout, flexboxLayout);
                }
                i = R.id.title;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

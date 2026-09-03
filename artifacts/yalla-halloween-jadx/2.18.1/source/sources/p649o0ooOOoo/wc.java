package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class wc implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50887OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f50888OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final xd f50889OooO0OO;

    public wc(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull xd xdVar) {
        this.f50887OooO00o = linearLayout;
        this.f50888OooO0O0 = button;
        this.f50889OooO0OO = xdVar;
    }

    @NonNull
    public static wc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50887OooO00o;
    }

    @NonNull
    public static wc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_activity_topic_create, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btSubmit;
        Button button = (Button) o00Oo0.OooO00o(viewInflate, R.id.btSubmit);
        if (button != null) {
            i = R.id.head;
            View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.head);
            if (viewOooO00o != null) {
                return new wc((LinearLayout) viewInflate, button, xd.OooO00o(viewOooO00o));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

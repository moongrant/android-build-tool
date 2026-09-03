package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class xc implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50963OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f50964OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50965OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50966OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50967OooO0o0;

    public xc(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f50963OooO00o = linearLayout;
        this.f50964OooO0O0 = button;
        this.f50965OooO0OO = textView;
        this.f50966OooO0Oo = textView2;
        this.f50967OooO0o0 = textView3;
    }

    @NonNull
    public static xc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50963OooO00o;
    }

    @NonNull
    public static xc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_activity_topic_create_check, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btCreateTopic;
        Button button = (Button) o00Oo0.OooO00o(viewInflate, R.id.btCreateTopic);
        if (button != null) {
            i = R.id.tvJoin;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvJoin);
            if (textView != null) {
                i = R.id.tvLevel;
                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvLevel);
                if (textView2 != null) {
                    i = R.id.tvViolation;
                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvViolation);
                    if (textView3 != null) {
                        return new xc((LinearLayout) viewInflate, button, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

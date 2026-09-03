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
public final class w6 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50830OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f50831OooO0O0;

    public w6(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f50830OooO00o = linearLayout;
        this.f50831OooO0O0 = textView;
    }

    @NonNull
    public static w6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50830OooO00o;
    }

    @NonNull
    public static w6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_aristocracy_presentation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.add_subscriptions);
        if (textView != null) {
            return new w6((LinearLayout) viewInflate, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.add_subscriptions)));
    }
}

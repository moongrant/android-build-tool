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
public final class ed implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49244OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f49245OooO0O0;

    public ed(@NonNull LinearLayout linearLayout, @NonNull Button button) {
        this.f49244OooO00o = linearLayout;
        this.f49245OooO0O0 = button;
    }

    @NonNull
    public static ed inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49244OooO00o;
    }

    @NonNull
    public static ed inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_activity_topic_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        Button button = (Button) o00Oo0.OooO00o(viewInflate, R.id.btDone);
        if (button != null) {
            return new ed((LinearLayout) viewInflate, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.btDone)));
    }
}

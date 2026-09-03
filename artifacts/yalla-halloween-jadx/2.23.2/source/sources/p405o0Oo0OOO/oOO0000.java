package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45025OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f45026OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final oOO f45027OooO0OO;

    public oOO0000(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull oOO ooo) {
        this.f45025OooO00o = linearLayout;
        this.f45026OooO0O0 = button;
        this.f45027OooO0OO = ooo;
    }

    @NonNull
    public static oOO0000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45025OooO00o;
    }

    @NonNull
    public static oOO0000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_activity_topic_create, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btSubmit;
        Button button = (Button) OooO0O0.OooO00o(i, viewInflate);
        if (button == null || (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.head), viewInflate)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
        return new oOO0000((LinearLayout) viewInflate, button, oOO.OooO00o(viewOooO00o));
    }
}

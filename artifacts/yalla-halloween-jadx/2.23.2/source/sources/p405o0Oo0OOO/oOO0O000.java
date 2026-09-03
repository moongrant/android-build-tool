package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45078OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f45079OooO0O0;

    public oOO0O000(@NonNull ConstraintLayout constraintLayout, @NonNull Button button) {
        this.f45078OooO00o = constraintLayout;
        this.f45079OooO0O0 = button;
    }

    @NonNull
    public static oOO0O000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45078OooO00o;
    }

    @NonNull
    public static oOO0O000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_activity_topic_review, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btDone;
        Button button = (Button) OooO0O0.OooO00o(i, viewInflate);
        if (button != null) {
            i = o0OO00O.content;
            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.head;
                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.headBg;
                    if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        return new oOO0O000((ConstraintLayout) viewInflate, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

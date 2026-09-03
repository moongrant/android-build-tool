package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.FixTextView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class nd implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50106OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixTextView f50107OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50108OooO0OO;

    public nd(@NonNull LinearLayout linearLayout, @NonNull FixTextView fixTextView, @NonNull TextView textView) {
        this.f50106OooO00o = linearLayout;
        this.f50107OooO0O0 = fixTextView;
        this.f50108OooO0OO = textView;
    }

    @NonNull
    public static nd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50106OooO00o;
    }

    @NonNull
    public static nd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_detail_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.mEditForwardContent;
        FixTextView fixTextView = (FixTextView) o00Oo0.OooO00o(viewInflate, R.id.mEditForwardContent);
        if (fixTextView != null) {
            i = R.id.mEditForwardContentMore;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.mEditForwardContentMore);
            if (textView != null) {
                return new nd((LinearLayout) viewInflate, fixTextView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

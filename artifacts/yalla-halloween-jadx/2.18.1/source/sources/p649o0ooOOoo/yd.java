package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.FixTextView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class yd implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f51025OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixTextView f51026OooO0O0;

    public yd(@NonNull LinearLayout linearLayout, @NonNull FixTextView fixTextView) {
        this.f51025OooO00o = linearLayout;
        this.f51026OooO0O0 = fixTextView;
    }

    @NonNull
    public static yd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51025OooO00o;
    }

    @NonNull
    public static yd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_layout_topic_manager_list_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        FixTextView fixTextView = (FixTextView) o00Oo0.OooO00o(viewInflate, R.id.tvTopicMember);
        if (fixTextView != null) {
            return new yd((LinearLayout) viewInflate, fixTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvTopicMember)));
    }
}

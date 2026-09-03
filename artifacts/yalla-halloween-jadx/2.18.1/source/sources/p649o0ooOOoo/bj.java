package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class bj implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49068OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f49069OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49070OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49071OooO0Oo;

    public bj(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout2) {
        this.f49068OooO00o = constraintLayout;
        this.f49069OooO0O0 = textView;
        this.f49070OooO0OO = textView2;
        this.f49071OooO0Oo = constraintLayout2;
    }

    @NonNull
    public static bj inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49068OooO00o;
    }

    @NonNull
    public static bj inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_room_at, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.atEveryOne;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.atEveryOne);
        if (textView != null) {
            i = R.id.atMember;
            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.atMember);
            if (textView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                return new bj(constraintLayout, textView, textView2, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

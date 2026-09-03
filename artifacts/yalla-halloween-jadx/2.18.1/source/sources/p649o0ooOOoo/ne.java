package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ne implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50109OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50110OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50111OooO0OO;

    public ne(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView) {
        this.f50109OooO00o = constraintLayout;
        this.f50110OooO0O0 = constraintLayout2;
        this.f50111OooO0OO = appCompatTextView;
    }

    @NonNull
    public static ne inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50109OooO00o;
    }

    @NonNull
    public static ne inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_lucky_packet_detail_item_head, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvCount);
        if (appCompatTextView != null) {
            return new ne(constraintLayout, constraintLayout, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tvCount)));
    }
}

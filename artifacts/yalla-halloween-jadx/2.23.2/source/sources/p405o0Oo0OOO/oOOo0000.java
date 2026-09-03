package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOo0000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45185OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45186OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f45187OooO0OO;

    public oOOo0000(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView) {
        this.f45185OooO00o = constraintLayout;
        this.f45186OooO0O0 = constraintLayout2;
        this.f45187OooO0OO = appCompatTextView;
    }

    @NonNull
    public static oOOo0000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45185OooO00o;
    }

    @NonNull
    public static oOOo0000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_activity_lucky_packet_detail_item_head, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = o0OO00O.tvCount;
        AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
        if (appCompatTextView != null) {
            return new oOOo0000(constraintLayout, constraintLayout, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

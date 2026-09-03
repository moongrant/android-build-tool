package p650o0ooo;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OOO.h2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0oOo0O0 extends o0O0ooO {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public h2 f58755OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p650o0ooo.o0O0ooO
    public final void OooO0O0(@NotNull LinearLayout rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        h2 h2VarInflate = h2.inflate(getLayoutInflater(), rootView, true);
        Intrinsics.checkNotNullExpressionValue(h2VarInflate, "inflate(...)");
        this.f58755OooOOO0 = h2VarInflate;
        if (h2VarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            h2VarInflate = null;
        }
        h2VarInflate.f43913OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.o0O0o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0oOo0O0 this$0 = this.f58658OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
            }
        });
    }

    public final void OooO0Oo(int i) {
        h2 h2Var = this.f58755OooOOO0;
        if (h2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            h2Var = null;
        }
        AppCompatImageView appCompatImageView = h2Var.f43910OooO0OO;
        appCompatImageView.setImageResource(i > 0 ? i : 0);
        Intrinsics.checkNotNull(appCompatImageView);
        if (i > 0) {
            o000O.OooOOOO(appCompatImageView);
        } else {
            o000O.OooO0OO(appCompatImageView);
        }
    }

    public final void OooO0o0(int i, int i2) {
        h2 h2Var = this.f58755OooOOO0;
        if (h2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            h2Var = null;
        }
        AppCompatTextView appCompatTextView = h2Var.f43915OooO0oo;
        appCompatTextView.setText(i > 0 ? String.valueOf(i) : null);
        if (i <= 0) {
            Intrinsics.checkNotNull(appCompatTextView);
            o000O.OooO0OO(appCompatTextView);
        } else {
            Intrinsics.checkNotNull(appCompatTextView);
            o000O.OooOOOO(appCompatTextView);
            appCompatTextView.setTextColor(o0000.OooO00o(i2));
        }
    }
}

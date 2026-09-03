package p579o0oOoOOo;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.o00O0O;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p502o0o00o0.o0000oo;
import p649o0ooOOoo.ci;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOO0OOO extends o0000oo {

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ci f46097o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OOO(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p502o0o00o0.o0000oo
    public final void OooO0O0(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        ci ciVarInflate = ci.inflate(getLayoutInflater(), rootView, true);
        Intrinsics.checkNotNullExpressionValue(ciVarInflate, "inflate(layoutInflater, rootView, true)");
        this.f46097o000oOoO = ciVarInflate;
        if (ciVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ciVarInflate = null;
        }
        ciVarInflate.f49117OooO0o0.setOnClickListener(new oOO0OO(this, 0));
    }

    public final void OooO0Oo(int i) {
        ci ciVar = this.f46097o000oOoO;
        if (ciVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ciVar = null;
        }
        AppCompatImageView appCompatImageView = ciVar.f49114OooO0OO;
        appCompatImageView.setImageResource(i > 0 ? i : 0);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        if (i > 0) {
            o00O0O.OooO(appCompatImageView);
        } else {
            o00O0O.OooO0O0(appCompatImageView);
        }
    }

    public final void OooO0o0(int i, int i2) {
        ci ciVar = this.f46097o000oOoO;
        if (ciVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ciVar = null;
        }
        AppCompatTextView appCompatTextView = ciVar.f49119OooO0oo;
        appCompatTextView.setText(i > 0 ? String.valueOf(i) : null);
        if (i <= 0) {
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            o00O0O.OooO0O0(appCompatTextView);
        } else {
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            o00O0O.OooO(appCompatTextView);
            appCompatTextView.setTextColor(OooOOO.OooO00o(i2));
        }
    }
}

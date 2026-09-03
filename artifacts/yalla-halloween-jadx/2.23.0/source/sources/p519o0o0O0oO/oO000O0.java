package p519o0o0O0oO;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOOOO.sa;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO000O0 extends o00O0O00 {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public sa f52800OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p519o0o0O0oO.o00O0O00
    public final void OooO0O0(@NotNull LinearLayout rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        sa saVarInflate = sa.inflate(getLayoutInflater(), rootView, true);
        Intrinsics.checkNotNullExpressionValue(saVarInflate, "inflate(layoutInflater, rootView, true)");
        this.f52800OooOOO0 = saVarInflate;
        if (saVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            saVarInflate = null;
        }
        saVarInflate.f58819OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.oO000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oO000O0 this$0 = this.f52792OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
            }
        });
    }

    public final void OooO0Oo(int i) {
        sa saVar = this.f52800OooOOO0;
        if (saVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            saVar = null;
        }
        AppCompatImageView setBadgeBackGround$lambda$1 = saVar.f58816OooO0OO;
        setBadgeBackGround$lambda$1.setImageResource(i > 0 ? i : 0);
        Intrinsics.checkNotNullExpressionValue(setBadgeBackGround$lambda$1, "setBadgeBackGround$lambda$1");
        if (i > 0) {
            o000OO00.OooOOOO(setBadgeBackGround$lambda$1);
        } else {
            o000OO00.OooO0OO(setBadgeBackGround$lambda$1);
        }
    }

    public final void OooO0o0(int i, int i2) {
        sa saVar = this.f52800OooOOO0;
        if (saVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            saVar = null;
        }
        AppCompatTextView setBadgeNum$lambda$2 = saVar.f58821OooO0oo;
        setBadgeNum$lambda$2.setText(i > 0 ? String.valueOf(i) : null);
        if (i <= 0) {
            Intrinsics.checkNotNullExpressionValue(setBadgeNum$lambda$2, "setBadgeNum$lambda$2");
            o000OO00.OooO0OO(setBadgeNum$lambda$2);
        } else {
            Intrinsics.checkNotNullExpressionValue(setBadgeNum$lambda$2, "setBadgeNum$lambda$2");
            o000OO00.OooOOOO(setBadgeNum$lambda$2);
            setBadgeNum$lambda$2.setTextColor(o0000.OooO00o(i2));
        }
    }
}

package o0000OO0;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends AbstractComposeView implements o00Oo0 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Window f27503OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f27504OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f27505OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f27506o000oOoO;

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f27508Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f27508Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0OoOo0.this.OooO00o(ooo00o, this.f27508Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(@NotNull Context context, @NotNull Window window) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(window, "window");
        this.f27503OoooO = window;
        Oooo0 oooo0 = Oooo0.f27487OooO00o;
        this.f27504OoooOO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Oooo0.f27488OooO0O0);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1735448596);
        ((Function2) this.f27504OoooOO0.getValue()).invoke(ooo00oOooOOo, 0);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(i));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void OooO0o(boolean z, int i, int i2, int i3, int i4) {
        super.OooO0o(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.f27503OoooO.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void OooO0oO(int i, int i2) {
        if (this.f27506o000oOoO) {
            super.OooO0oO(i, i2);
            return;
        }
        super.OooO0oO(View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f27505OoooOOO;
    }

    @Override // o0000OO0.o00Oo0
    @NotNull
    public final Window getWindow() {
        return this.f27503OoooO;
    }
}

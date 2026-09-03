package p035OoooOO0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.o0O0O00;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026Oooo0OO.o0000OO0;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class oo0o0Oo extends o000OOo {
    public oo0o0Oo(boolean z, float f, oO0Oo oo0oo, DefaultConstructorMarker defaultConstructorMarker) {
        super(z, f, oo0oo, null);
    }

    @Override // p035OoooOO0.o000OOo
    @Composable
    @NotNull
    public final o0000 OooO0O0(@NotNull o0000OO0 interactionSource, boolean z, float f, @NotNull oO0Oo color, @NotNull oO0Oo rippleAlpha, @Nullable oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        ooo00o.OooO0o0(331259447);
        ooo00o.OooO0o0(-1737891121);
        Object objOooOO0o = ooo00o.OooOO0o(o0O0O00.f6594OooO0o);
        while (!(objOooOO0o instanceof ViewGroup)) {
            ViewParent parent = ((View) objOooOO0o).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + objOooOO0o + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            Intrinsics.checkNotNullExpressionValue(parent, "parent");
            objOooOO0o = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objOooOO0o;
        ooo00o.Oooo0o0();
        ooo00o.OooO0o0(1643267286);
        if (viewGroup.isInEditMode()) {
            ooo00o.OooO0o0(-3686552);
            boolean zOooo0oo = ooo00o.Oooo0oo(interactionSource) | ooo00o.Oooo0oo(this);
            Object objOooO0o = ooo00o.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new o0Oo0oo(z, f, color, rippleAlpha, null);
                ooo00o.Oooo00o(objOooO0o);
            }
            ooo00o.Oooo0o0();
            o0Oo0oo o0oo0oo2 = (o0Oo0oo) objOooO0o;
            ooo00o.Oooo0o0();
            ooo00o.Oooo0o0();
            return o0oo0oo2;
        }
        ooo00o.Oooo0o0();
        View rippleContainer = null;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RippleContainer) {
                rippleContainer = childAt;
                break;
            }
        }
        if (rippleContainer == null) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            rippleContainer = new RippleContainer(context);
            viewGroup.addView(rippleContainer);
        }
        ooo00o.OooO0o0(-3686095);
        boolean zOooo0oo2 = ooo00o.Oooo0oo(interactionSource) | ooo00o.Oooo0oo(this) | ooo00o.Oooo0oo(rippleContainer);
        Object objOooO0o2 = ooo00o.OooO0o();
        if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o2 = new o0OOO0o(z, f, color, rippleAlpha, (RippleContainer) rippleContainer, null);
            ooo00o.Oooo00o(objOooO0o2);
        }
        ooo00o.Oooo0o0();
        o0OOO0o o0ooo0o2 = (o0OOO0o) objOooO0o2;
        ooo00o.Oooo0o0();
        return o0ooo0o2;
    }
}

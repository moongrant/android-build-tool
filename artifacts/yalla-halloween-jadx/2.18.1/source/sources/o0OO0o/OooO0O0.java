package o0OO0o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.o00Ooo;
import p071o000O0o.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements o00Ooo.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f37913OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f37914OooO0O0;

    public OooO0O0(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f37914OooO0O0 = bottomSheetBehavior;
        this.f37913OooO00o = z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    @Override // com.google.android.material.internal.o00Ooo.OooO0OO
    public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat, o00Ooo.OooO0o oooO0o) {
        boolean z;
        OooO oooOOooO0Oo = windowInsetsCompat.OooO0Oo(7);
        OooO oooOOooO0Oo2 = windowInsetsCompat.OooO0Oo(32);
        this.f37914OooO0O0.f16616OooOo0O = oooOOooO0Oo.f28163OooO0O0;
        boolean zOooO0o = o00Ooo.OooO0o(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = this.f37914OooO0O0;
        if (bottomSheetBehavior.f16606OooOOO) {
            bottomSheetBehavior.f16614OooOo0 = windowInsetsCompat.OooO0o();
            paddingBottom = oooO0o.f17364OooO0Oo + this.f37914OooO0O0.f16614OooOo0;
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.f37914OooO0O0;
        if (bottomSheetBehavior2.f16608OooOOOO) {
            paddingLeft = (zOooO0o ? oooO0o.f17363OooO0OO : oooO0o.f17361OooO00o) + oooOOooO0Oo.f28162OooO00o;
        }
        if (bottomSheetBehavior2.f16609OooOOOo) {
            paddingRight = (zOooO0o ? oooO0o.f17361OooO00o : oooO0o.f17363OooO0OO) + oooOOooO0Oo.f28164OooO0OO;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior3 = this.f37914OooO0O0;
        boolean z2 = true;
        if (bottomSheetBehavior3.f16610OooOOo) {
            int i = marginLayoutParams.leftMargin;
            int i2 = oooOOooO0Oo.f28162OooO00o;
            if (i != i2) {
                marginLayoutParams.leftMargin = i2;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (bottomSheetBehavior3.f16612OooOOoo) {
            int i3 = marginLayoutParams.rightMargin;
            int i4 = oooOOooO0Oo.f28164OooO0OO;
            if (i3 != i4) {
                marginLayoutParams.rightMargin = i4;
                z = true;
            }
        }
        if (bottomSheetBehavior3.f16615OooOo00) {
            int i5 = marginLayoutParams.topMargin;
            int i6 = oooOOooO0Oo.f28163OooO0O0;
            if (i5 != i6) {
                marginLayoutParams.topMargin = i6;
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z3 = this.f37913OooO00o;
        if (z3) {
            this.f37914OooO0O0.f16605OooOO0o = oooOOooO0Oo2.f28165OooO0Oo;
        }
        BottomSheetBehavior bottomSheetBehavior4 = this.f37914OooO0O0;
        if (bottomSheetBehavior4.f16606OooOOO || z3) {
            bottomSheetBehavior4.Oooo0oO();
        }
        return windowInsetsCompat;
    }
}

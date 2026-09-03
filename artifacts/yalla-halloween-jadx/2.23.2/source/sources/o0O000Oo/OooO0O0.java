package o0O000Oo;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements oo0o0Oo.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f40962OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f40963OooO0O0;

    public OooO0O0(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f40963OooO0O0 = bottomSheetBehavior;
        this.f40962OooO00o = z;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    @Override // com.google.android.material.internal.oo0o0Oo.OooO0O0
    public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat, oo0o0Oo.OooO0OO oooO0OO) {
        boolean z;
        p052o00000oO.OooOO0O oooOO0OOooO00o = windowInsetsCompat.OooO00o(7);
        p052o00000oO.OooOO0O oooOO0OOooO00o2 = windowInsetsCompat.OooO00o(32);
        int i = oooOO0OOooO00o.f33478OooO0O0;
        BottomSheetBehavior bottomSheetBehavior = this.f40963OooO0O0;
        bottomSheetBehavior.f15981OooOo0o = i;
        boolean zOooO0o = oo0o0Oo.OooO0o(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z2 = bottomSheetBehavior.f15972OooOOOO;
        if (z2) {
            int iOooO0OO = windowInsetsCompat.OooO0OO();
            bottomSheetBehavior.f15980OooOo0O = iOooO0OO;
            paddingBottom = iOooO0OO + oooO0OO.f16866OooO0Oo;
        }
        boolean z3 = bottomSheetBehavior.f15973OooOOOo;
        int i2 = oooOO0OOooO00o.f33477OooO00o;
        if (z3) {
            paddingLeft = (zOooO0o ? oooO0OO.f16865OooO0OO : oooO0OO.f16863OooO00o) + i2;
        }
        boolean z4 = bottomSheetBehavior.f15975OooOOo0;
        int i3 = oooOO0OOooO00o.f33479OooO0OO;
        if (z4) {
            paddingRight = (zOooO0o ? oooO0OO.f16863OooO00o : oooO0OO.f16865OooO0OO) + i3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z5 = true;
        if (!bottomSheetBehavior.f15976OooOOoo || marginLayoutParams.leftMargin == i2) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior.f15979OooOo00 && marginLayoutParams.rightMargin != i3) {
            marginLayoutParams.rightMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior.f15978OooOo0) {
            int i4 = marginLayoutParams.topMargin;
            int i5 = oooOO0OOooO00o.f33478OooO0O0;
            if (i4 != i5) {
                marginLayoutParams.topMargin = i5;
            } else {
                z5 = z;
            }
        } else {
            z5 = z;
        }
        if (z5) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z6 = this.f40962OooO00o;
        if (z6) {
            bottomSheetBehavior.f15971OooOOO0 = oooOO0OOooO00o2.f33480OooO0Oo;
        }
        if (z2 || z6) {
            bottomSheetBehavior.OoooO0();
        }
        return windowInsetsCompat;
    }
}

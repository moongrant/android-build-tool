package p370o0OOoO;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O implements o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f44031OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f44032OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f44033OooO0o0;

    public OooOO0O(View view, boolean z, boolean z2) {
        this.f44031OooO0Oo = view;
        this.f44033OooO0o0 = z;
        this.f44032OooO0o = z2;
    }

    @Override // androidx.core.view.o000000O
    public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        int i = OooO.window_inset_manager_inset_top;
        View view = this.f44031OooO0Oo;
        Integer num = (Integer) view.getTag(i);
        int iIntValue = num != null ? num.intValue() : 0;
        Intrinsics.checkNotNullExpressionValue(insets, "insets");
        if (iIntValue == insets.OooO0o()) {
            return insets;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int iOooO0o = insets.OooO0o() - iIntValue;
        if (this.f44033OooO0o0) {
            int i2 = marginLayoutParams.height;
            if (i2 >= 0) {
                marginLayoutParams.height = i2 + iOooO0o;
            }
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + iOooO0o, view.getPaddingRight(), view.getPaddingBottom());
        } else {
            marginLayoutParams.topMargin += iOooO0o;
        }
        Intrinsics.checkNotNullExpressionValue(v, "v");
        v.setLayoutParams(marginLayoutParams);
        view.requestLayout();
        view.setTag(i, Integer.valueOf(insets.OooO0o()));
        return this.f44032OooO0o ? insets.OooO0oo(insets.OooO0Oo(), 0, insets.OooO0o0(), insets.OooO0OO()) : insets;
    }
}

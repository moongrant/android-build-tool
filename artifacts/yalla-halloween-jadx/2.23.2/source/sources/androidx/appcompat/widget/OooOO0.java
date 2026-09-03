package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CheckedTextView f2965OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f2969OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ColorStateList f2966OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PorterDuff.Mode f2967OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f2968OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f2970OooO0o0 = false;

    public OooOO0(@NonNull CheckedTextView checkedTextView) {
        this.f2965OooO00o = checkedTextView;
    }

    public final void OooO00o() {
        CheckedTextView checkedTextView = this.f2965OooO00o;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f2968OooO0Oo || this.f2970OooO0o0) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f2968OooO0Oo) {
                    o00000oo.o00Ooo.OooO0O0.OooO0oo(drawableMutate, this.f2966OooO0O0);
                }
                if (this.f2970OooO0o0) {
                    o00000oo.o00Ooo.OooO0O0.OooO(drawableMutate, this.f2967OooO0OO);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}

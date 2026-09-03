package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CheckedTextView f5056OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f5060OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ColorStateList f5057OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PorterDuff.Mode f5058OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f5059OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f5061OooO0o0 = false;

    public OooO(@NonNull CheckedTextView checkedTextView) {
        this.f5056OooO00o = checkedTextView;
    }

    public final void OooO00o() {
        Drawable checkMarkDrawable = this.f5056OooO00o.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f5059OooO0Oo || this.f5061OooO0o0) {
                Drawable drawableMutate = p084o000Ooo.o0OOO0o.OooO0o0(checkMarkDrawable).mutate();
                if (this.f5059OooO0Oo) {
                    o000Ooo.o0OOO0o.OooO0O0.OooO0oo(drawableMutate, this.f5057OooO0O0);
                }
                if (this.f5061OooO0o0) {
                    o000Ooo.o0OOO0o.OooO0O0.OooO(drawableMutate, this.f5058OooO0OO);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f5056OooO00o.getDrawableState());
                }
                this.f5056OooO00o.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}

package p201o00o0OoO;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p193o00o0O00.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO00 extends o00O0000 {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f33220OoooOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(@NotNull AppCompatActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // p201o00o0OoO.o00O0000
    public final void OooO0O0() {
        o0OoOo0 o0oooo1 = this.f33229OoooOo0;
        int i = o0oooo1.f33147OooO0Oo;
        int i2 = o0oooo1.f33146OooO0OO;
        if (i2 != -1 || i != -1) {
            OooO0Oo(i != -1 ? this.f33221Oooo.getString(i) : "", i2);
            this.f33223OoooO0.setVisibility(0);
        }
        o0OoOo0 o0oooo2 = this.f33229OoooOo0;
        int i3 = o0oooo2.f33148OooO0o;
        int i4 = o0oooo2.f33149OooO0o0;
        if (i4 != -1 || i3 != -1) {
            OooO0o(i3 != -1 ? this.f33221Oooo.getString(i3) : "", i4);
            this.f33225OoooO0O.setVisibility(0);
        }
        OooO0OO();
        boolean z = this.f33229OoooOo0.f33150OooO0oO == -1;
        this.f33220OoooOoo = z;
        if (z) {
            this.f33222OoooO.setVisibility(0);
            this.f33222OoooO.setOnClickListener(this);
        } else {
            this.f33226OoooOO0.setOnClickListener(this);
            this.f33226OoooOO0.setVisibility(8);
            this.f33227OoooOOO.setText(this.f33221Oooo.getString(this.f33229OoooOo0.f33150OooO0oO));
        }
        OooO0oO(false);
        int i5 = this.f33229OoooOo0.f33168OooOoO0;
        this.f33222OoooO.setTextColor(i5);
        this.f33231o000oOoO.setTextColor(i5);
        this.f33227OoooOOO.setTextColor(i5);
        this.f33223OoooO0.setTextColor(i5);
        this.f33225OoooO0O.setTextColor(i5);
    }

    public final void OooO0oO(boolean z) {
        TextView textView;
        Drawable drawable = z ? this.f33229OoooOo0.f33151OooO0oo : this.f33229OoooOo0.f33143OooO;
        if (drawable == null) {
            return;
        }
        if (this.f33220OoooOoo) {
            textView = this.f33222OoooO;
            Intrinsics.checkNotNullExpressionValue(textView, "{\n            nameTv\n        }");
        } else {
            textView = this.f33227OoooOOO;
            Intrinsics.checkNotNullExpressionValue(textView, "{\n            middleBottomTv\n        }");
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }
}

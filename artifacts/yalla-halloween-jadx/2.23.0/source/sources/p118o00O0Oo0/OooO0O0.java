package p118o00O0Oo0;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooOO0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends OooO0o {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f36576OooOOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(@NotNull AppCompatActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // p118o00O0Oo0.OooO0o
    public final void OooO0O0() {
        OooOO0 oooOO1 = this.f36586OooOOOo;
        int i = oooOO1.f36546OooO0Oo;
        int i2 = oooOO1.f36545OooO0OO;
        Activity activity = this.f36578OooO0oO;
        if (i2 != -1 || i != -1) {
            OooO0Oo(i2, i != -1 ? activity.getString(i) : "");
            this.f36577OooO.setVisibility(0);
        }
        int i3 = oooOO1.f36547OooO0o;
        int i4 = oooOO1.f36548OooO0o0;
        if (i4 != -1 || i3 != -1) {
            OooO0o0(i4, i3 != -1 ? activity.getString(i3) : "");
            this.f36580OooOO0.setVisibility(0);
        }
        OooO0OO();
        boolean z = oooOO1.f36549OooO0oO == -1;
        this.f36576OooOOo = z;
        if (z) {
            this.f36581OooOO0O.setVisibility(0);
            this.f36581OooOO0O.setOnClickListener(this);
        } else {
            this.f36582OooOO0o.setOnClickListener(this);
            this.f36582OooOO0o.setVisibility(8);
            this.f36583OooOOO.setText(activity.getString(oooOO1.f36549OooO0oO));
        }
        OooO0o(false);
        int i5 = oooOO1.f36556OooOOOO;
        this.f36581OooOO0O.setTextColor(i5);
        this.f36584OooOOO0.setTextColor(i5);
        this.f36583OooOOO.setTextColor(i5);
        this.f36577OooO.setTextColor(i5);
        this.f36580OooOO0.setTextColor(i5);
    }

    public final void OooO0o(boolean z) {
        TextView textView;
        OooOO0 oooOO1 = this.f36586OooOOOo;
        Drawable drawable = z ? oooOO1.f36550OooO0oo : oooOO1.f36542OooO;
        if (drawable == null) {
            return;
        }
        if (this.f36576OooOOo) {
            textView = this.f36581OooOO0O;
            Intrinsics.checkNotNullExpressionValue(textView, "{\n            nameTv\n        }");
        } else {
            textView = this.f36583OooOOO;
            Intrinsics.checkNotNullExpressionValue(textView, "{\n            middleBottomTv\n        }");
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }
}

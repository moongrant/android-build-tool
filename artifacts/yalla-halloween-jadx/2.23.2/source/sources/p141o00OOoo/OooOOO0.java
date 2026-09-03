package p141o00OOoo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p139o00OOOo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends OooOOOO {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f37513OooOOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(@NotNull AppCompatActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // p141o00OOoo.OooOOOO
    public final void OooO0O0() {
        OooOOO oooOOO = this.f37523OooOOOo;
        int i = oooOOO.f37483OooO0Oo;
        int i2 = oooOOO.f37482OooO0OO;
        Activity activity = this.f37515OooO0oO;
        if (i2 != -1 || i != -1) {
            OooO0Oo(i2, i != -1 ? activity.getString(i) : "");
            this.f37514OooO.setVisibility(0);
        }
        int i3 = oooOOO.f37484OooO0o;
        int i4 = oooOOO.f37485OooO0o0;
        if (i4 != -1 || i3 != -1) {
            OooO0o0(i4, i3 != -1 ? activity.getString(i3) : "");
            this.f37517OooOO0.setVisibility(0);
        }
        OooO0OO();
        boolean z = oooOOO.f37486OooO0oO == -1;
        this.f37513OooOOo = z;
        if (z) {
            this.f37518OooOO0O.setVisibility(0);
            this.f37518OooOO0O.setOnClickListener(this);
        } else {
            this.f37519OooOO0o.setOnClickListener(this);
            this.f37519OooOO0o.setVisibility(8);
            this.f37520OooOOO.setText(activity.getString(oooOOO.f37486OooO0oO));
        }
        OooO0o(false);
        int i5 = oooOOO.f37493OooOOOO;
        this.f37518OooOO0O.setTextColor(i5);
        this.f37521OooOOO0.setTextColor(i5);
        this.f37520OooOOO.setTextColor(i5);
        this.f37514OooO.setTextColor(i5);
        this.f37517OooOO0.setTextColor(i5);
    }

    public final void OooO0o(boolean z) {
        TextView textView;
        OooOOO oooOOO = this.f37523OooOOOo;
        Drawable drawable = z ? oooOOO.f37487OooO0oo : oooOOO.f37479OooO;
        if (drawable == null) {
            return;
        }
        if (this.f37513OooOOo) {
            textView = this.f37518OooOO0O;
            Intrinsics.checkNotNull(textView);
        } else {
            textView = this.f37520OooOOO;
            Intrinsics.checkNotNull(textView);
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }
}

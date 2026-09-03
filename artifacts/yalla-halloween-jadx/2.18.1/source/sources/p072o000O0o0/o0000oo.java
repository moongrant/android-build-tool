package p072o000O0o0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo extends ClickableSpan {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f28219Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o0000OO0 f28220Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f28221Oooo0oo;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public o0000oo(int i, @NonNull o0000OO0 o0000oo1, int i2) {
        this.f28219Oooo0o = i;
        this.f28220Oooo0oO = o0000oo1;
        this.f28221Oooo0oo = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f28219Oooo0o);
        o0000OO0 o0000oo1 = this.f28220Oooo0oO;
        o0000oo1.f28194OooO00o.performAction(this.f28221Oooo0oo, bundle);
    }
}

package o0000O;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends ClickableSpan {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f34016OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f34017OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0Oo0oo f34018OooO0o0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public OooO00o(int i, @NonNull o0Oo0oo o0oo0oo2, int i2) {
        this.f34016OooO0Oo = i;
        this.f34018OooO0o0 = o0oo0oo2;
        this.f34017OooO0o = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f34016OooO0Oo);
        this.f34018OooO0o0.f34022OooO00o.performAction(this.f34017OooO0o, bundle);
    }
}

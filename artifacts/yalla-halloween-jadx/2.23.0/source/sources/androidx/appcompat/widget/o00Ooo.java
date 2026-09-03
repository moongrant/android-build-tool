package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TextView f3354OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f3355OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Typeface f3356OooO0o0;

    public o00Ooo(TextView textView, Typeface typeface, int i) {
        this.f3354OooO0Oo = textView;
        this.f3356OooO0o0 = typeface;
        this.f3355OooO0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3354OooO0Oo.setTypeface(this.f3356OooO0o0, this.f3355OooO0o);
    }
}

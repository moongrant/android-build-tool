package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TextView f5429Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Typeface f5430Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f5431Oooo0oo;

    public o00Oo0(TextView textView, Typeface typeface, int i) {
        this.f5429Oooo0o = textView;
        this.f5430Oooo0oO = typeface;
        this.f5431Oooo0oo = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5429Oooo0o.setTypeface(this.f5430Oooo0oO, this.f5431Oooo0oo);
    }
}

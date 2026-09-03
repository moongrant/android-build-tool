package p545o0oO0Ooo;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends f1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f55828OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ TextPaint f55829OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ f1 f55830OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ d1 f55831OooO0Oo;

    public e1(d1 d1Var, Context context, TextPaint textPaint, f1 f1Var) {
        this.f55831OooO0Oo = d1Var;
        this.f55828OooO00o = context;
        this.f55829OooO0O0 = textPaint;
        this.f55830OooO0OO = f1Var;
    }

    @Override // p545o0oO0Ooo.f1
    public final void OooO00o(int i) {
        this.f55830OooO0OO.OooO00o(i);
    }

    @Override // p545o0oO0Ooo.f1
    public final void OooO0O0(@NonNull Typeface typeface, boolean z) {
        this.f55831OooO0Oo.OooO0oO(this.f55828OooO00o, this.f55829OooO0O0, typeface);
        this.f55830OooO0OO.OooO0O0(typeface, z);
    }
}

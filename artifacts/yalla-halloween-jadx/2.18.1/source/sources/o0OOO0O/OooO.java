package o0OOO0O;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f38028OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ TextPaint f38029OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f38030OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f38031OooO0Oo;

    public OooO(OooO0o oooO0o, Context context, TextPaint textPaint, OooOO0 oooOO1) {
        this.f38031OooO0Oo = oooO0o;
        this.f38028OooO00o = context;
        this.f38029OooO0O0 = textPaint;
        this.f38030OooO0OO = oooOO1;
    }

    @Override // o0OOO0O.OooOO0
    public final void OooO00o(int i) {
        this.f38030OooO0OO.OooO00o(i);
    }

    @Override // o0OOO0O.OooOO0
    public final void OooO0O0(@NonNull Typeface typeface, boolean z) {
        this.f38031OooO0Oo.OooO0oO(this.f38028OooO00o, this.f38029OooO0O0, typeface);
        this.f38030OooO0OO.OooO0O0(typeface, z);
    }
}

package p276o0O00OoO;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f41027OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ TextPaint f41028OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f41029OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO f41030OooO0Oo;

    public OooOO0(OooO oooO, Context context, TextPaint textPaint, OooOO0O oooOO0O) {
        this.f41030OooO0Oo = oooO;
        this.f41027OooO00o = context;
        this.f41028OooO0O0 = textPaint;
        this.f41029OooO0OO = oooOO0O;
    }

    @Override // p276o0O00OoO.OooOO0O
    public final void OooO00o(int i) {
        this.f41029OooO0OO.OooO00o(i);
    }

    @Override // p276o0O00OoO.OooOO0O
    public final void OooO0O0(@NonNull Typeface typeface, boolean z) {
        this.f41030OooO0Oo.OooO0oO(this.f41027OooO00o, this.f41028OooO0O0, typeface);
        this.f41029OooO0OO.OooO0O0(typeface, z);
    }
}

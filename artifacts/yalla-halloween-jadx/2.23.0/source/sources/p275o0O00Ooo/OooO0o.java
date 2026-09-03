package p275o0O00Ooo;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p052o00000oO.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int[] f41782OooO = new int[3];

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final float[] f41783OooOO0 = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int[] f41784OooOO0O = new int[4];

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final float[] f41785OooOO0o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Paint f41786OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Paint f41787OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Paint f41788OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f41789OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f41790OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f41791OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Path f41792OooO0oO = new Path();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Paint f41793OooO0oo;

    public OooO0o() {
        Paint paint = new Paint();
        this.f41793OooO0oo = paint;
        this.f41786OooO00o = new Paint();
        OooO00o(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f41787OooO0O0 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f41788OooO0OO = new Paint(paint2);
    }

    public final void OooO00o(int i) {
        this.f41789OooO0Oo = OooOO0.OooO0Oo(i, 68);
        this.f41791OooO0o0 = OooOO0.OooO0Oo(i, 20);
        this.f41790OooO0o = OooOO0.OooO0Oo(i, 0);
        this.f41786OooO00o.setColor(this.f41789OooO0Oo);
    }
}

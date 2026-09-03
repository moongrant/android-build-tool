package o00OO0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import p133o00OO00o.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends OooO00o {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO00o f37042OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final String f37043OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o00OO0O0.OooO0O0 f37044OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final boolean f37045OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public o00OO0O0.o00O0O f37046OooOo0O;

    /* JADX WARN: Illegal instructions before constructor call */
    public o00Oo0(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, ShapeStroke shapeStroke) {
        ShapeStroke.LineCapType lineCapType = shapeStroke.f11898OooO0oO;
        lineCapType.getClass();
        int i = ShapeStroke.OooO00o.f11901OooO00o[lineCapType.ordinal()];
        Paint.Cap cap = i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        ShapeStroke.LineJoinType lineJoinType = shapeStroke.f11899OooO0oo;
        lineJoinType.getClass();
        int i2 = ShapeStroke.OooO00o.f11902OooO0O0[lineJoinType.ordinal()];
        super(lottieDrawable, oooO00o, cap, i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, shapeStroke.f11891OooO, shapeStroke.f11897OooO0o0, shapeStroke.f11896OooO0o, shapeStroke.f11894OooO0OO, shapeStroke.f11893OooO0O0);
        this.f37042OooOOo = oooO00o;
        this.f37043OooOOoo = shapeStroke.f11892OooO00o;
        this.f37045OooOo00 = shapeStroke.f11900OooOO0;
        o00OO0O0.OooO00o<Integer, Integer> OooO00o2 = shapeStroke.f11895OooO0Oo.OooO00o();
        this.f37044OooOo0 = (o00OO0O0.OooO0O0) OooO00o2;
        OooO00o2.OooO00o(this);
        oooO00o.OooO0oO(OooO00o2);
    }

    @Override // o00OO0.OooO00o, p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        super.OooO0Oo(oooO0OO, obj);
        Integer num = com.airbnb.lottie.o00Oo0.f11972OooO0O0;
        o00OO0O0.OooO0O0 oooO0O0 = this.f37044OooOo0;
        if (obj == num) {
            oooO0O0.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f12006Oooo0OO) {
            o00OO0O0.o00O0O o00o0o2 = this.f37046OooOo0O;
            com.airbnb.lottie.model.layer.OooO00o oooO00o = this.f37042OooOOo;
            if (o00o0o2 != null) {
                oooO00o.OooOOOo(o00o0o2);
            }
            if (oooO0OO == null) {
                this.f37046OooOo0O = null;
                return;
            }
            o00OO0O0.o00O0O o00o0o3 = new o00OO0O0.o00O0O(oooO0OO, null);
            this.f37046OooOo0O = o00o0o3;
            o00o0o3.OooO00o(this);
            oooO00o.OooO0oO(oooO0O0);
        }
    }

    @Override // o00OO0.OooO00o, o00OO0.OooO
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        if (this.f37045OooOo00) {
            return;
        }
        o00OO0O0.OooO0O0 oooO0O0 = this.f37044OooOo0;
        int iOooOO0o = oooO0O0.OooOO0o(oooO0O0.OooO0O0(), oooO0O0.OooO0Oo());
        o0ooOOo o0ooooo = this.f36921OooO;
        o0ooooo.setColor(iOooOO0o);
        o00OO0O0.o00O0O o00o0o2 = this.f37046OooOo0O;
        if (o00o0o2 != null) {
            o0ooooo.setColorFilter((ColorFilter) o00o0o2.OooO0o());
        }
        super.OooO0oo(canvas, matrix, i);
    }

    @Override // o00OO0.OooO0OO
    public final String getName() {
        return this.f37043OooOOoo;
    }
}

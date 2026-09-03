package o00O000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import p233o00oOoo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends OooO00o {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO00o f36242OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final String f36243OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o00O000o.OooO0O0 f36244OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final boolean f36245OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public o00O000o.o00O0O f36246OooOo0O;

    /* JADX WARN: Illegal instructions before constructor call */
    public o00Oo0(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, ShapeStroke shapeStroke) {
        ShapeStroke.LineCapType lineCapType = shapeStroke.f8808OooO0oO;
        lineCapType.getClass();
        int i = ShapeStroke.OooO00o.f8811OooO00o[lineCapType.ordinal()];
        Paint.Cap cap = i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        ShapeStroke.LineJoinType lineJoinType = shapeStroke.f8809OooO0oo;
        lineJoinType.getClass();
        int i2 = ShapeStroke.OooO00o.f8812OooO0O0[lineJoinType.ordinal()];
        super(lottieDrawable, oooO00o, cap, i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Paint.Join.ROUND : Paint.Join.MITER : Paint.Join.BEVEL, shapeStroke.f8801OooO, shapeStroke.f8807OooO0o0, shapeStroke.f8806OooO0o, shapeStroke.f8804OooO0OO, shapeStroke.f8803OooO0O0);
        this.f36242OooOOo = oooO00o;
        this.f36243OooOOoo = shapeStroke.f8802OooO00o;
        this.f36245OooOo00 = shapeStroke.f8810OooOO0;
        o00O000o.OooO00o<Integer, Integer> OooO00o2 = shapeStroke.f8805OooO0Oo.OooO00o();
        this.f36244OooOo0 = (o00O000o.OooO0O0) OooO00o2;
        OooO00o2.OooO00o(this);
        oooO00o.OooO0oO(OooO00o2);
    }

    @Override // o00O000.OooO00o, oOO00O.OooO
    public final void OooO0o0(@Nullable o00O0O00.OooO0OO oooO0OO, Object obj) {
        super.OooO0o0(oooO0OO, obj);
        Integer num = com.airbnb.lottie.o00Oo0.f8882OooO0O0;
        o00O000o.OooO0O0 oooO0O0 = this.f36244OooOo0;
        if (obj == num) {
            oooO0O0.OooOO0O(oooO0OO);
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f8916Oooo0OO) {
            o00O000o.o00O0O o00o0o2 = this.f36246OooOo0O;
            com.airbnb.lottie.model.layer.OooO00o oooO00o = this.f36242OooOOo;
            if (o00o0o2 != null) {
                oooO00o.OooOOOo(o00o0o2);
            }
            if (oooO0OO == null) {
                this.f36246OooOo0O = null;
                return;
            }
            o00O000o.o00O0O o00o0o3 = new o00O000o.o00O0O(oooO0OO, null);
            this.f36246OooOo0O = o00o0o3;
            o00o0o3.OooO00o(this);
            oooO00o.OooO0oO(oooO0O0);
        }
    }

    @Override // o00O000.OooO00o, o00O000.OooO
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        if (this.f36245OooOo00) {
            return;
        }
        o00O000o.OooO0O0 oooO0O0 = this.f36244OooOo0;
        int iOooOO0o = oooO0O0.OooOO0o(oooO0O0.OooO0O0(), oooO0O0.OooO0Oo());
        o0ooOOo o0ooooo = this.f36121OooO;
        o0ooooo.setColor(iOooOO0o);
        o00O000o.o00O0O o00o0o2 = this.f36246OooOo0O;
        if (o00o0o2 != null) {
            o0ooooo.setColorFilter((ColorFilter) o00o0o2.OooO0o());
        }
        super.OooO0oo(canvas, matrix, i);
    }

    @Override // o00O000.OooO0OO
    public final String getName() {
        return this.f36243OooOOoo;
    }
}

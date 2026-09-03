package p031OoooO0;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Comparator;
import o000OO.OooOOO0;
import p036OoooOOo.o0000oo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Rational f1359OooO00o = new Rational(4, 3);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Rational f1360OooO0O0 = new Rational(3, 4);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Rational f1361OooO0OO = new Rational(16, 9);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Rational f1362OooO0Oo = new Rational(9, 16);

    @RequiresApi(21)
    public static final class OooO00o implements Comparator<Rational> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final RectF f1363OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Rational f1364OooO0o0;

        public OooO00o(@NonNull Rational rational, @Nullable Rational rational2) {
            this.f1364OooO0o0 = rational2 == null ? new Rational(4, 3) : rational2;
            this.f1363OooO0Oo = OooO0O0(rational);
        }

        public static float OooO00o(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        public final RectF OooO0O0(Rational rational) {
            float fFloatValue = rational.floatValue();
            Rational rational2 = this.f1364OooO0o0;
            if (fFloatValue == rational2.floatValue()) {
                return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
            }
            return rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
        }

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational;
            Rational rational4 = rational2;
            boolean z = false;
            if (rational3.equals(rational4)) {
                return 0;
            }
            RectF rectFOooO0O0 = OooO0O0(rational3);
            RectF rectFOooO0O1 = OooO0O0(rational4);
            RectF rectF = this.f1363OooO0Oo;
            boolean z2 = rectFOooO0O0.width() >= rectF.width() && rectFOooO0O0.height() >= rectF.height();
            if (rectFOooO0O1.width() >= rectF.width() && rectFOooO0O1.height() >= rectF.height()) {
                z = true;
            }
            if (z2 && z) {
                return (int) Math.signum((rectFOooO0O0.height() * rectFOooO0O0.width()) - (rectFOooO0O1.height() * rectFOooO0O1.width()));
            }
            if (z2) {
                return -1;
            }
            if (z) {
                return 1;
            }
            return -((int) Math.signum(OooO00o(rectFOooO0O0, rectF) - OooO00o(rectFOooO0O1, rectF)));
        }
    }

    public static boolean OooO00o(@NonNull Size size, @Nullable Rational rational, @NonNull Size size2) {
        boolean zOooO0O0;
        if (rational == null) {
            return false;
        }
        if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            Size size3 = o0000oo.f1445OooO00o;
            if (size.getHeight() * size.getWidth() < size2.getHeight() * size2.getWidth()) {
                return false;
            }
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i != 0 || height % 16 != 0) {
                if (i == 0) {
                    zOooO0O0 = OooO0O0(height, width, rational);
                } else {
                    if (height % 16 != 0) {
                        return false;
                    }
                    zOooO0O0 = OooO0O0(width, height, rational2);
                }
                return zOooO0O0;
            }
            if (!OooO0O0(Math.max(0, height - 16), width, rational) && !OooO0O0(Math.max(0, width - 16), height, rational2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO0O0(int i, int i2, Rational rational) {
        OooOOO0.OooO00o(i2 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}

package p404o0Oo0OO;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OO0.OooOO0;
import p405o0Oo0OO0.OooOo;
import p647o0ooOOOO.e6;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends p404o0Oo0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f39026OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap<String, Bitmap> f39027OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float[] f39028OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f39029OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooOO0 f39030OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f39031OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f39032OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashMap<SVGAVideoShapeEntity, Path> f39033OooO0OO = new HashMap<>();
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Paint f39034OooO00o = new Paint();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Path f39035OooO0O0 = new Path();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Path f39036OooO0OO = new Path();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Matrix f39037OooO0Oo = new Matrix();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Matrix f39038OooO0o0 = new Matrix();

        @NotNull
        public final Paint OooO00o() {
            this.f39034OooO00o.reset();
            return this.f39034OooO00o;
        }

        @NotNull
        public final Path OooO0O0() {
            this.f39035OooO0O0.reset();
            return this.f39035OooO0O0;
        }
    }

    public OooO0OO(@NotNull OooOo oooOo, @NotNull OooOO0 oooOO1) {
        super(oooOo);
        this.f39030OooO0oO = oooOO1;
        this.f39026OooO0OO = new OooO0O0();
        this.f39027OooO0Oo = new HashMap<>();
        this.f39029OooO0o0 = new OooO00o();
        this.f39028OooO0o = new float[16];
    }

    public final Matrix OooO00o(Matrix matrix) {
        OooO0O0 oooO0O0 = this.f39026OooO0OO;
        oooO0O0.f39037OooO0Oo.reset();
        Matrix matrix2 = oooO0O0.f39037OooO0Oo;
        e6 e6Var = this.f39022OooO00o;
        matrix2.postScale(e6Var.f48895OooO0OO, e6Var.f48896OooO0Oo);
        e6 e6Var2 = this.f39022OooO00o;
        matrix2.postTranslate(e6Var2.f48893OooO00o, e6Var2.f48894OooO0O0);
        matrix2.preConcat(matrix);
        return matrix2;
    }
}

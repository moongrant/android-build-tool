package p022Oooo00O;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.SurfaceConfig;
import java.util.Locale;
import p024Oooo0O0.o0000OO0;
import p024Oooo0O0.o0O0ooO;
import p025Oooo0OO.o0000Ooo;
import p025Oooo0OO.o0O0O00;
import p036OoooOOo.o0000oo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0oOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static volatile o0oOO f877OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final DisplayManager f882OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile Size f883OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000Ooo f884OooO0OO = new o0000Ooo();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0O00 f885OooO0Oo = new o0O0O00();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Size f879OooO0o0 = new Size(1920, 1080);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Size f878OooO0o = new Size(320, 240);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Size f880OooO0oO = new Size(640, 480);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Object f881OooO0oo = new Object();

    public o0oOO(@NonNull Context context) {
        this.f882OooO00o = (DisplayManager) context.getSystemService("display");
    }

    @NonNull
    public static o0oOO OooO0O0(@NonNull Context context) {
        if (f877OooO == null) {
            synchronized (f881OooO0oo) {
                if (f877OooO == null) {
                    f877OooO = new o0oOO(context);
                }
            }
        }
        return f877OooO;
    }

    @Nullable
    public static Display OooO0Oo(@NonNull Display[] displayArr, boolean z) {
        Display display = null;
        int i = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x * point.y;
                if (i2 > i) {
                    display = display2;
                    i = i2;
                }
            }
        }
        return display;
    }

    public final Size OooO00o() {
        Size sizeOooO0Oo;
        Point point = new Point();
        OooO0OO(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = o0000oo.f1445OooO00o;
        int height = size.getHeight() * size.getWidth();
        Size size3 = f878OooO0o;
        if (height < size3.getHeight() * size3.getWidth()) {
            size = this.f885OooO0Oo.f1057OooO00o != null ? (Size) o0O0ooO.f1025OooO00o.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f880OooO0oO;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height2 = size.getHeight() * size.getWidth();
        Size size4 = f879OooO0o0;
        if (height2 > size4.getHeight() * size4.getWidth()) {
            size = size4;
        }
        if (this.f884OooO0OO.f1043OooO00o == null || (sizeOooO0Oo = o0000OO0.OooO0Oo(SurfaceConfig.ConfigType.PRIV)) == null) {
            return size;
        }
        return sizeOooO0Oo.getHeight() * sizeOooO0Oo.getWidth() > size.getHeight() * size.getWidth() ? sizeOooO0Oo : size;
    }

    @NonNull
    public final Display OooO0OO(boolean z) {
        Display[] displays = this.f882OooO00o.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayOooO0Oo = OooO0Oo(displays, z);
        if (displayOooO0Oo == null && z) {
            displayOooO0Oo = OooO0Oo(displays, false);
        }
        if (displayOooO0Oo != null) {
            return displayOooO0Oo;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    @NonNull
    public final Size OooO0o0() {
        if (this.f883OooO0O0 != null) {
            return this.f883OooO0O0;
        }
        this.f883OooO0O0 = OooO00o();
        return this.f883OooO0O0;
    }
}

package o00000OO;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f27055OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Constructor<StaticLayout> f27056OooO0O0;

    @Override // o00000OO.OooOo
    @DoNotInline
    @NotNull
    public StaticLayout OooO00o(@NotNull Oooo0 params) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Constructor<StaticLayout> constructor;
        Intrinsics.checkNotNullParameter(params, "params");
        StaticLayout staticLayoutNewInstance = null;
        if (f27055OooO00o) {
            constructor = f27056OooO0O0;
        } else {
            f27055OooO00o = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                f27056OooO0O0 = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                f27056OooO0O0 = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            constructor = f27056OooO0O0;
        }
        if (constructor != null) {
            try {
                staticLayoutNewInstance = constructor.newInstance(params.f27037OooO00o, Integer.valueOf(params.f27038OooO0O0), Integer.valueOf(params.f27039OooO0OO), params.f27040OooO0Oo, Integer.valueOf(params.f27042OooO0o0), params.f27043OooO0oO, params.f27041OooO0o, Float.valueOf(params.f27046OooOO0O), Float.valueOf(params.f27047OooOO0o), Boolean.valueOf(params.f27048OooOOO), params.f27036OooO, Integer.valueOf(params.f27045OooOO0), Integer.valueOf(params.f27044OooO0oo));
            } catch (IllegalAccessException unused2) {
                f27056OooO0O0 = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused3) {
                f27056OooO0O0 = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused4) {
                f27056OooO0O0 = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        return staticLayoutNewInstance != null ? staticLayoutNewInstance : new StaticLayout(params.f27037OooO00o, params.f27038OooO0O0, params.f27039OooO0OO, params.f27040OooO0Oo, params.f27042OooO0o0, params.f27043OooO0oO, params.f27046OooOO0O, params.f27047OooOO0o, params.f27048OooOOO, params.f27036OooO, params.f27045OooOO0);
    }
}

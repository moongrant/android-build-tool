package p519o0o0O0O;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.didichuxing.doraemonkit.DoKit;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.util.ReflectUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p031OoooO.o0000O;
import p487o0o000oO.o0OOO0o;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000000 f42208OooO00o;

    static {
        o000O0O0.OooO00o(-40449173855760L);
        o000O0O0.OooO00o(-40505008430608L);
        f42208OooO00o = new o000000();
    }

    @JvmStatic
    public static final void OooO00o() {
        if (o0OOO0o.OooO0OO()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o00oO0o());
        arrayList.add(new o000000O());
        arrayList.add(new o0ooOOo());
        arrayList.add(new o0OO00O());
        arrayList.add(new o00000());
        arrayList.add(new o00000O0());
        arrayList.add(new o000OOo());
        arrayList.add(new o00000O());
        arrayList.add(new o0000Ooo());
        arrayList.add(new o00000OO());
        Context context = o0000O.f2657OooO00o;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, o000O0O0.OooO00o(-39259467914768L));
        new DoKit.Builder((Application) applicationContext).customKits(arrayList).productId(o000O0O0.OooO00o(-39521460919824L)).build();
        try {
            Result.Companion companion = Result.INSTANCE;
            ReflectUtils reflectUtils = new ReflectUtils(Class.forName(o000O0O0.OooO00o(-39663194840592L)));
            String strOooO00o = o000O0O0.OooO00o(-39877943205392L);
            Boolean bool = Boolean.TRUE;
            reflectUtils.OooO0O0(strOooO00o, bool);
            reflectUtils.OooO0O0(o000O0O0.OooO00o(-39963842551312L), bool);
            Result.m502constructorimpl(reflectUtils);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m502constructorimpl(ResultKt.createFailure(th));
        }
        Context context3 = o0000O.f2657OooO00o;
        if (context3 != null) {
            context2 = context3;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
        }
        o000000 o000000Var = f42208OooO00o;
        if (context2.getSharedPreferences(o000O0O0.OooO00o(-40028267060752L), 0).getBoolean(o000O0O0.OooO00o(-40084101635600L), false)) {
            o000000Var.OooO0O0(true);
        } else {
            o000000Var.OooO0O0(false);
        }
    }

    public final void OooO0O0(boolean z) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = Class.forName(o000O0O0.OooO00o(-40243015425552L));
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod(z ? o000O0O0.OooO00o(-40406224182800L) : o000O0O0.OooO00o(-40427699019280L), new Class[0]);
            declaredMethod.setAccessible(true);
            Result.m502constructorimpl(declaredMethod.invoke(objNewInstance, new Object[0]));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m502constructorimpl(ResultKt.createFailure(th));
        }
    }
}

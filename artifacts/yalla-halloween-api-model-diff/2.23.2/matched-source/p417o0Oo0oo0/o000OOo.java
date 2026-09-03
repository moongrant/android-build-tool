package p417o0Oo0oo0;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.didichuxing.doraemonkit.DoKit;
import com.yalla.yalla.util.ReflectUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p386o0OOooO.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo {
    @JvmStatic
    public static final void OooO00o() {
        if (oo0o0Oo.OooO0o0()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new oo000o());
        arrayList.add(new o000000());
        arrayList.add(new o00oO0o());
        arrayList.add(new o00000O0());
        arrayList.add(new o00000O());
        arrayList.add(new o00000OO());
        arrayList.add(new o0O0O00());
        arrayList.add(new o0000());
        arrayList.add(new o000000O());
        arrayList.add(new o0000O0O());
        arrayList.add(new o0000O0());
        arrayList.add(new o0000Ooo());
        arrayList.add(new o00000());
        Context applicationContext = o000O00O.OooO00o().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        new DoKit.Builder((Application) applicationContext).disableUpload().customKits(arrayList).productId("5db9e871e81d17e94aae14e2746634a0").build();
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = Class.forName("com.didichuxing.doraemonkit.aop.DokitPluginConfig");
            ReflectUtils reflectUtils = new ReflectUtils(cls, cls);
            Boolean bool = Boolean.TRUE;
            reflectUtils.OooO0O0(bool, "SWITCH_DOKIT_PLUGIN");
            reflectUtils.OooO0O0(bool, "SWITCH_NETWORK");
            Result.m4215constructorimpl(reflectUtils);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
        if (o000O00O.OooO00o().getSharedPreferences("DoraemonKits", 0).getBoolean("dokit_state", false)) {
            OooO0O0(true);
        } else {
            OooO0O0(false);
        }
    }

    public static void OooO0O0(boolean z) {
        try {
            Result.Companion companion = Result.INSTANCE;
            Class<?> cls = Class.forName("com.didichuxing.doraemonkit.DoKitReal");
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod(z ? "show" : "hide", new Class[0]);
            declaredMethod.setAccessible(true);
            Result.m4215constructorimpl(declaredMethod.invoke(objNewInstance, new Object[0]));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
    }
}

package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.core.os.BuildCompat;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.bolts.CancellationTokenSource;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2399OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f2400OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f2399OooO0Oo = i;
        this.f2400OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        p063o0000oO.o00oO0o o00oo0o2;
        Context contextOooO0oO;
        Object systemService = null;
        switch (this.f2399OooO0Oo) {
            case 0:
                Context context = (Context) this.f2400OooO0o0;
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (BuildCompat.OooO0O0()) {
                            p190o00o0O.OooOO0O<WeakReference<AppCompatDelegate>> oooOO0O = AppCompatDelegate.f2295OooOO0;
                            oooOO0O.getClass();
                            o00o0O.OooOO0O.OooO00o oooO00o = new o00o0O.OooOO0O.OooO00o();
                            while (oooO00o.hasNext()) {
                                AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) oooO00o.next()).get();
                                if (appCompatDelegate != null && (contextOooO0oO = appCompatDelegate.OooO0oO()) != null) {
                                    systemService = contextOooO0oO.getSystemService("locale");
                                    if (systemService != null) {
                                        o00oo0o2 = new p063o0000oO.o00oO0o(new p063o0000oO.o0O0O00(AppCompatDelegate.OooO0O0.OooO00o(systemService)));
                                    } else {
                                        o00oo0o2 = p063o0000oO.o00oO0o.f33776OooO0O0;
                                    }
                                }
                            }
                            if (systemService != null) {
                                o00oo0o2 = new p063o0000oO.o00oO0o(new p063o0000oO.o0O0O00(AppCompatDelegate.OooO0O0.OooO00o(systemService)));
                            } else {
                                o00oo0o2 = p063o0000oO.o00oO0o.f33776OooO0O0;
                            }
                        } else {
                            o00oo0o2 = AppCompatDelegate.f2291OooO0o;
                            if (o00oo0o2 == null) {
                                o00oo0o2 = p063o0000oO.o00oO0o.f33776OooO0O0;
                            }
                        }
                        if (o00oo0o2.OooO0Oo()) {
                            String strOooO0O0 = o000000O.OooO0O0(context);
                            Object systemService2 = context.getSystemService("locale");
                            if (systemService2 != null) {
                                AppCompatDelegate.OooO0O0.OooO0O0(systemService2, AppCompatDelegate.OooO00o.OooO00o(strOooO0O0));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AppCompatDelegate.f2289OooO = true;
                return;
            case 1:
                Function0 tmp0 = (Function0) this.f2400OooO0o0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                return;
            case 2:
                androidx.work.impl.background.systemalarm.OooO0OO oooO0OO = (androidx.work.impl.background.systemalarm.OooO0OO) this.f2400OooO0o0;
                if (oooO0OO.f11535OooOO0 != 0) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(androidx.work.impl.background.systemalarm.OooO0OO.f11528OooOOOo, "Already started work for " + oooO0OO.f11531OooO0o);
                    return;
                }
                oooO0OO.f11535OooOO0 = 1;
                p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(androidx.work.impl.background.systemalarm.OooO0OO.f11528OooOOOo, "onAllConstraintsMet for " + oooO0OO.f11531OooO0o);
                if (!oooO0OO.f11533OooO0oO.f11546OooO0oO.OooOO0(oooO0OO.f11540OooOOOO, null)) {
                    oooO0OO.OooO0Oo();
                    return;
                }
                o00O0OOO.o00000 o00000Var = oooO0OO.f11533OooO0oO.f11544OooO0o;
                o00O0OO.OooOo oooOo = oooO0OO.f11531OooO0o;
                synchronized (o00000Var.f36287OooO0Oo) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(o00O0OOO.o00000.f36283OooO0o0, "Starting timer for " + oooOo);
                    o00000Var.OooO00o(oooOo);
                    o00O0OOO.o00000.OooO0O0 oooO0O0 = new o00O0OOO.o00000.OooO0O0(o00000Var, oooOo);
                    o00000Var.f36285OooO0O0.put(oooOo, oooO0O0);
                    o00000Var.f36286OooO0OO.put(oooOo, oooO0OO);
                    ((oo00o.OooO0o) o00000Var.f36284OooO00o).f60167OooO00o.postDelayed(oooO0O0, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
                    break;
                }
                return;
            default:
                CancellationTokenSource.m4108cancelAfter$lambda6$lambda5((CancellationTokenSource) this.f2400OooO0o0);
                return;
        }
    }
}

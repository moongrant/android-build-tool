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
    public final /* synthetic */ int f2396OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f2397OooO0o0;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f2396OooO0Oo = i;
        this.f2397OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        p063o0000oO.o00oO0o o00oo0o2;
        Context contextOooO0oO;
        Object systemService = null;
        switch (this.f2396OooO0Oo) {
            case 0:
                Context context = (Context) this.f2397OooO0o0;
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (BuildCompat.OooO0O0()) {
                            p190o00o0O.OooOO0O<WeakReference<AppCompatDelegate>> oooOO0O = AppCompatDelegate.f2292OooOO0;
                            oooOO0O.getClass();
                            o00o0O.OooOO0O.OooO00o oooO00o = new o00o0O.OooOO0O.OooO00o();
                            while (oooO00o.hasNext()) {
                                AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) oooO00o.next()).get();
                                if (appCompatDelegate != null && (contextOooO0oO = appCompatDelegate.OooO0oO()) != null) {
                                    systemService = contextOooO0oO.getSystemService("locale");
                                    if (systemService != null) {
                                        o00oo0o2 = new p063o0000oO.o00oO0o(new p063o0000oO.o0O0O00(AppCompatDelegate.OooO0O0.OooO00o(systemService)));
                                    } else {
                                        o00oo0o2 = p063o0000oO.o00oO0o.f33779OooO0O0;
                                    }
                                }
                            }
                            if (systemService != null) {
                                o00oo0o2 = new p063o0000oO.o00oO0o(new p063o0000oO.o0O0O00(AppCompatDelegate.OooO0O0.OooO00o(systemService)));
                            } else {
                                o00oo0o2 = p063o0000oO.o00oO0o.f33779OooO0O0;
                            }
                        } else {
                            o00oo0o2 = AppCompatDelegate.f2288OooO0o;
                            if (o00oo0o2 == null) {
                                o00oo0o2 = p063o0000oO.o00oO0o.f33779OooO0O0;
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
                AppCompatDelegate.f2286OooO = true;
                return;
            case 1:
                Function0 tmp0 = (Function0) this.f2397OooO0o0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                return;
            case 2:
                androidx.work.impl.background.systemalarm.OooO0OO oooO0OO = (androidx.work.impl.background.systemalarm.OooO0OO) this.f2397OooO0o0;
                if (oooO0OO.f11524OooOO0 != 0) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(androidx.work.impl.background.systemalarm.OooO0OO.f11517OooOOOo, "Already started work for " + oooO0OO.f11520OooO0o);
                    return;
                }
                oooO0OO.f11524OooOO0 = 1;
                p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(androidx.work.impl.background.systemalarm.OooO0OO.f11517OooOOOo, "onAllConstraintsMet for " + oooO0OO.f11520OooO0o);
                if (!oooO0OO.f11522OooO0oO.f11535OooO0oO.OooOO0(oooO0OO.f11529OooOOOO, null)) {
                    oooO0OO.OooO0Oo();
                    return;
                }
                o00O0OOO.o000000O o000000o2 = oooO0OO.f11522OooO0oO.f11533OooO0o;
                o00O0OO.OooOo oooOo = oooO0OO.f11520OooO0o;
                synchronized (o000000o2.f36291OooO0Oo) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(o00O0OOO.o000000O.f36287OooO0o0, "Starting timer for " + oooOo);
                    o000000o2.OooO00o(oooOo);
                    o00O0OOO.o000000O.OooO0O0 oooO0O0 = new o00O0OOO.o000000O.OooO0O0(o000000o2, oooOo);
                    o000000o2.f36289OooO0O0.put(oooOo, oooO0O0);
                    o000000o2.f36290OooO0OO.put(oooOo, oooO0OO);
                    ((oo00o.OooO0o) o000000o2.f36288OooO00o).f60201OooO00o.postDelayed(oooO0O0, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
                    break;
                }
                return;
            default:
                CancellationTokenSource.m4108cancelAfter$lambda6$lambda5((CancellationTokenSource) this.f2397OooO0o0);
                return;
        }
    }
}

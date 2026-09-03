package p193o00o0OO0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
public final class o00Ooo implements Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f38964OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O f38965OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f38966OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f38967OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Map<String, String> f38968OooO0O0 = null;

        public OooO00o(Context context) {
            this.f38967OooO00o = context;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003a  */
        /* JADX WARN: Code duplicated, block: B:17:0x0044  */
        /* JADX WARN: Code duplicated, block: B:20:0x0057  */
        @Nullable
        public final OooOo OooO00o(String str) {
            Bundle bundle;
            Map<String, String> mapEmptyMap;
            Object obj;
            if (this.f38968OooO0O0 == null) {
                Context context = this.f38967OooO00o;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        Log.w("BackendRegistry", "Context has no PackageManager.");
                    } else {
                        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                        if (serviceInfo == null) {
                            Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        } else {
                            bundle = serviceInfo.metaData;
                        }
                        if (bundle == null) {
                            Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                            mapEmptyMap = Collections.emptyMap();
                        } else {
                            HashMap map = new HashMap();
                            for (String str2 : bundle.keySet()) {
                                obj = bundle.get(str2);
                                if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                    for (String str3 : ((String) obj).split(",", -1)) {
                                        String strTrim = str3.trim();
                                        if (!strTrim.isEmpty()) {
                                            map.put(strTrim, str2.substring(8));
                                        }
                                    }
                                }
                            }
                            mapEmptyMap = map;
                        }
                        this.f38968OooO0O0 = mapEmptyMap;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("BackendRegistry", "Application info not found.");
                }
                bundle = null;
                if (bundle == null) {
                    Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map2 = new HashMap();
                    while (r7.hasNext()) {
                        obj = bundle.get(str2);
                        if (!(obj instanceof String)) {
                        }
                    }
                    mapEmptyMap = map2;
                }
                this.f38968OooO0O0 = mapEmptyMap;
            }
            String str4 = this.f38968OooO0O0.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (OooOo) Class.forName(str4).asSubclass(OooOo.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str4), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e5);
                return null;
            }
        }
    }

    @Inject
    public o00Ooo(Context context, o00O0O o00o0o2) {
        OooO00o oooO00o = new OooO00o(context);
        this.f38966OooO0OO = new HashMap();
        this.f38964OooO00o = oooO00o;
        this.f38965OooO0O0 = o00o0o2;
    }

    @Override // p193o00o0OO0.Oooo000
    @Nullable
    public final synchronized o00oO0o get(String str) {
        if (this.f38966OooO0OO.containsKey(str)) {
            return (o00oO0o) this.f38966OooO0OO.get(str);
        }
        OooOo oooOoOooO00o = this.f38964OooO00o.OooO00o(str);
        if (oooOoOooO00o == null) {
            return null;
        }
        o00O0O o00o0o2 = this.f38965OooO0O0;
        o00oO0o o00oo0oCreate = oooOoOooO00o.create(new OooOo00(o00o0o2.f38958OooO00o, o00o0o2.f38959OooO0O0, o00o0o2.f38960OooO0OO, str));
        this.f38966OooO0OO.put(str, o00oo0oCreate);
        return o00oo0oCreate;
    }
}

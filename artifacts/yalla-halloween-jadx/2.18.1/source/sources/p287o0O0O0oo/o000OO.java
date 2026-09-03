package p287o0O0O0oo;

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

/* JADX INFO: loaded from: classes2.dex */
@Singleton
public final class o000OO implements o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f35529OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O0 f35530OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, o0000OO0> f35531OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f35532OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Map<String, String> f35533OooO0O0 = null;

        public OooO00o(Context context) {
            this.f35532OooO00o = context;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003a  */
        /* JADX WARN: Code duplicated, block: B:17:0x0044  */
        /* JADX WARN: Code duplicated, block: B:20:0x0057  */
        @Nullable
        public final o00000OO OooO00o(String str) {
            Bundle bundle;
            Map<String, String> mapEmptyMap;
            Object obj;
            if (this.f35533OooO0O0 == null) {
                Context context = this.f35532OooO00o;
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
                        this.f35533OooO0O0 = mapEmptyMap;
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
                this.f35533OooO0O0 = mapEmptyMap;
            }
            String str4 = this.f35533OooO0O0.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (o00000OO) Class.forName(str4).asSubclass(o00000OO.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
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
    public o000OO(Context context, o0000O0 o0000o1) {
        OooO00o oooO00o = new OooO00o(context);
        this.f35531OooO0OO = new HashMap();
        this.f35529OooO00o = oooO00o;
        this.f35530OooO0O0 = o0000o1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, o0O0O0oo.o0000OO0>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.HashMap, java.util.Map<java.lang.String, o0O0O0oo.o0000OO0>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, o0O0O0oo.o0000OO0>] */
    @Override // p287o0O0O0oo.o0000Ooo
    @Nullable
    public final synchronized o0000OO0 get(String str) {
        if (this.f35531OooO0OO.containsKey(str)) {
            return (o0000OO0) this.f35531OooO0OO.get(str);
        }
        o00000OO o00000ooOooO00o = this.f35529OooO00o.OooO00o(str);
        if (o00000ooOooO00o == null) {
            return null;
        }
        o0000O0 o0000o1 = this.f35530OooO0O0;
        o0000OO0 o0000oo0Create = o00000ooOooO00o.create(new o00000O(o0000o1.f35523OooO00o, o0000o1.f35524OooO0O0, o0000o1.f35525OooO0OO, str));
        this.f35531OooO0OO.put(str, o0000oo0Create);
        return o0000oo0Create;
    }
}

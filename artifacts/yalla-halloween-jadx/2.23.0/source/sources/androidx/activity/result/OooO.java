package androidx.activity.result;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Random f2210OooO00o = new Random();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f2211OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f2212OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f2213OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList<String> f2215OooO0o0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient HashMap f2214OooO0o = new HashMap();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f2216OooO0oO = new HashMap();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Bundle f2217OooO0oo = new Bundle();

    public static class OooO00o<O> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.activity.result.OooO00o<O> f2218OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final p011OooOo0.OooOO0<?, O> f2219OooO0O0;

        public OooO00o(p011OooOo0.OooOO0 oooOO1, androidx.activity.result.OooO00o oooO00o) {
            this.f2218OooO00o = oooO00o;
            this.f2219OooO0O0 = oooOO1;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Lifecycle f2220OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<LifecycleEventObserver> f2221OooO0O0 = new ArrayList<>();

        public OooO0O0(@NonNull Lifecycle lifecycle) {
            this.f2220OooO00o = lifecycle;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v4 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @androidx.annotation.MainThread
    public final boolean OooO00o(int r4, int r5, @androidx.annotation.Nullable android.content.Intent r6) {
        /*
            r3 = this;
            java.util.HashMap r0 = r3.f2211OooO0O0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r4 = 0
            return r4
        L10:
            java.util.HashMap r0 = r3.f2214OooO0o
            java.lang.Object r0 = r0.get(r4)
            androidx.activity.result.OooO$OooO00o r0 = (androidx.activity.result.OooO.OooO00o) r0
            if (r0 == 0) goto L35
            androidx.activity.result.OooO00o<O> r1 = r0.f2218OooO00o
            if (r1 == 0) goto L35
            java.util.ArrayList<java.lang.String> r2 = r3.f2215OooO0o0
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L35
            OooOo0.OooOO0<?, O> r0 = r0.f2219OooO0O0
            java.lang.Object r5 = r0.parseResult(r5, r6)
            r1.onActivityResult(r5)
            java.util.ArrayList<java.lang.String> r5 = r3.f2215OooO0o0
            r5.remove(r4)
            goto L44
        L35:
            java.util.HashMap r0 = r3.f2216OooO0oO
            r0.remove(r4)
            androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
            r0.<init>(r5, r6)
            android.os.Bundle r5 = r3.f2217OooO0oo
            r5.putParcelable(r4, r0)
        L44:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.OooO.OooO00o(int, int, android.content.Intent):boolean");
    }

    @MainThread
    public abstract void OooO0O0(int i, @NonNull p011OooOo0.OooOO0 oooOO1, @SuppressLint({"UnknownNullness"}) Object obj);

    @NonNull
    public final OooO0OO OooO0OO(@NonNull final String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull final p011OooOo0.OooOO0 oooOO1, @NonNull final androidx.activity.result.OooO00o oooO00o) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
        }
        OooO0o0(str);
        HashMap map = this.f2213OooO0Oo;
        OooO0O0 oooO0O0 = (OooO0O0) map.get(str);
        if (oooO0O0 == null) {
            oooO0O0 = new OooO0O0(lifecycle);
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner2, @NonNull Lifecycle.Event event) {
                boolean zEquals = Lifecycle.Event.ON_START.equals(event);
                String str2 = str;
                OooO oooO = this.f2205OooO0oO;
                if (!zEquals) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        oooO.f2214OooO0o.remove(str2);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            oooO.OooO0o(str2);
                            return;
                        }
                        return;
                    }
                }
                HashMap map2 = oooO.f2214OooO0o;
                p011OooOo0.OooOO0 oooOO2 = oooOO1;
                OooO00o oooO00o2 = oooO00o;
                map2.put(str2, new OooO.OooO00o(oooOO2, oooO00o2));
                HashMap map3 = oooO.f2216OooO0oO;
                if (map3.containsKey(str2)) {
                    Object obj = map3.get(str2);
                    map3.remove(str2);
                    oooO00o2.onActivityResult(obj);
                }
                Bundle bundle = oooO.f2217OooO0oo;
                ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str2);
                if (activityResult != null) {
                    bundle.remove(str2);
                    oooO00o2.onActivityResult(oooOO2.parseResult(activityResult.f2200OooO0Oo, activityResult.f2201OooO0o0));
                }
            }
        };
        oooO0O0.f2220OooO00o.addObserver(lifecycleEventObserver);
        oooO0O0.f2221OooO0O0.add(lifecycleEventObserver);
        map.put(str, oooO0O0);
        return new OooO0OO(this, str, oooOO1);
    }

    @NonNull
    public final OooO0o OooO0Oo(@NonNull String str, @NonNull p011OooOo0.OooOO0 oooOO1, @NonNull androidx.activity.result.OooO00o oooO00o) {
        OooO0o0(str);
        this.f2214OooO0o.put(str, new OooO00o(oooOO1, oooO00o));
        HashMap map = this.f2216OooO0oO;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            oooO00o.onActivityResult(obj);
        }
        Bundle bundle = this.f2217OooO0oo;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            oooO00o.onActivityResult(oooOO1.parseResult(activityResult.f2200OooO0Oo, activityResult.f2201OooO0o0));
        }
        return new OooO0o(this, str, oooOO1);
    }

    @MainThread
    public final void OooO0o(@NonNull String str) {
        Integer num;
        if (!this.f2215OooO0o0.contains(str) && (num = (Integer) this.f2212OooO0OO.remove(str)) != null) {
            this.f2211OooO0O0.remove(num);
        }
        this.f2214OooO0o.remove(str);
        HashMap map = this.f2216OooO0oO;
        if (map.containsKey(str)) {
            StringBuilder sbOooO00o = o0OoOo0.OooO00o("Dropping pending result for request ", str, ": ");
            sbOooO00o.append(map.get(str));
            Log.w("ActivityResultRegistry", sbOooO00o.toString());
            map.remove(str);
        }
        Bundle bundle = this.f2217OooO0oo;
        if (bundle.containsKey(str)) {
            StringBuilder sbOooO00o2 = o0OoOo0.OooO00o("Dropping pending result for request ", str, ": ");
            sbOooO00o2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbOooO00o2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f2213OooO0Oo;
        OooO0O0 oooO0O0 = (OooO0O0) map2.get(str);
        if (oooO0O0 != null) {
            ArrayList<LifecycleEventObserver> arrayList = oooO0O0.f2221OooO0O0;
            Iterator<LifecycleEventObserver> it = arrayList.iterator();
            while (it.hasNext()) {
                oooO0O0.f2220OooO00o.removeObserver(it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }

    public final void OooO0o0(String str) {
        HashMap map = this.f2212OooO0OO;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iNextInt = this.f2210OooO00o.nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            HashMap map2 = this.f2211OooO0O0;
            if (!map2.containsKey(Integer.valueOf(i))) {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            }
            iNextInt = this.f2210OooO00o.nextInt(2147418112);
        }
    }
}

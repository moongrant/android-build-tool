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
import java.util.Map;
import java.util.Random;
import p011OooOOoo.OooO;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Random f4335OooO00o = new Random();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Integer, String> f4336OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, Integer> f4337OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, OooO0o> f4338OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList<String> f4340OooO0o0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient Map<String, OooO0OO<?>> f4339OooO0o = new HashMap();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Map<String, Object> f4341OooO0oO = new HashMap();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Bundle f4342OooO0oo = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class OooO00o<I> extends androidx.activity.result.OooO0O0<I> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f4347OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ OooO f4348OooO0O0;

        public OooO00o(String str, OooO oooO) {
            this.f4347OooO00o = str;
            this.f4348OooO0O0 = oooO;
        }

        @Override // androidx.activity.result.OooO0O0
        @NonNull
        public final OooO<I, ?> OooO00o() {
            return this.f4348OooO0O0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        @Override // androidx.activity.result.OooO0O0
        public final void OooO0O0(Object obj) throws Exception {
            Integer num = (Integer) ActivityResultRegistry.this.f4337OooO0OO.get(this.f4347OooO00o);
            if (num != null) {
                ActivityResultRegistry.this.f4340OooO0o0.add(this.f4347OooO00o);
                try {
                    ActivityResultRegistry.this.OooO0OO(num.intValue(), this.f4348OooO0O0, obj);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f4340OooO0o0.remove(this.f4347OooO00o);
                    throw e;
                }
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            sbOooO0o0.append(this.f4348OooO0O0);
            sbOooO0o0.append(" and input ");
            sbOooO0o0.append(obj);
            sbOooO0o0.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(sbOooO0o0.toString());
        }

        @Override // androidx.activity.result.OooO0O0
        public final void OooO0OO() {
            ActivityResultRegistry.this.OooO0oO(this.f4347OooO00o);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class OooO0O0<I> extends androidx.activity.result.OooO0O0<I> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f4350OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ OooO f4351OooO0O0;

        public OooO0O0(String str, OooO oooO) {
            this.f4350OooO00o = str;
            this.f4351OooO0O0 = oooO;
        }

        @Override // androidx.activity.result.OooO0O0
        @NonNull
        public final OooO<I, ?> OooO00o() {
            return this.f4351OooO0O0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        @Override // androidx.activity.result.OooO0O0
        public final void OooO0O0(Object obj) {
            Integer num = (Integer) ActivityResultRegistry.this.f4337OooO0OO.get(this.f4350OooO00o);
            if (num != null) {
                ActivityResultRegistry.this.f4340OooO0o0.add(this.f4350OooO00o);
                try {
                    ActivityResultRegistry.this.OooO0OO(num.intValue(), this.f4351OooO0O0, obj);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f4340OooO0o0.remove(this.f4350OooO00o);
                    throw e;
                }
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            sbOooO0o0.append(this.f4351OooO0O0);
            sbOooO0o0.append(" and input ");
            sbOooO0o0.append(obj);
            sbOooO0o0.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(sbOooO0o0.toString());
        }

        @Override // androidx.activity.result.OooO0O0
        public final void OooO0OO() {
            ActivityResultRegistry.this.OooO0oO(this.f4350OooO00o);
        }
    }

    public static class OooO0OO<O> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.activity.result.OooO00o<O> f4353OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO<?, O> f4354OooO0O0;

        public OooO0OO(androidx.activity.result.OooO00o<O> oooO00o, OooO<?, O> oooO) {
            this.f4353OooO00o = oooO00o;
            this.f4354OooO0O0 = oooO;
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Lifecycle f4355OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<LifecycleEventObserver> f4356OooO0O0 = new ArrayList<>();

        public OooO0o(@NonNull Lifecycle lifecycle) {
            this.f4355OooO00o = lifecycle;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public final void OooO00o(int i, String str) {
        this.f4336OooO0O0.put(Integer.valueOf(i), str);
        this.f4337OooO0OO.put(str, Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$OooO0OO<?>>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v3 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @androidx.annotation.MainThread
    public final boolean OooO0O0(int r3, int r4, @androidx.annotation.Nullable android.content.Intent r5) {
        /*
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r2.f4336OooO0O0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L10
            r3 = 0
            return r3
        L10:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$OooO0OO<?>> r0 = r2.f4339OooO0o
            java.lang.Object r0 = r0.get(r3)
            androidx.activity.result.ActivityResultRegistry$OooO0OO r0 = (androidx.activity.result.ActivityResultRegistry.OooO0OO) r0
            if (r0 == 0) goto L37
            androidx.activity.result.OooO00o<O> r1 = r0.f4353OooO00o
            if (r1 == 0) goto L37
            java.util.ArrayList<java.lang.String> r1 = r2.f4340OooO0o0
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L37
            androidx.activity.result.OooO00o<O> r1 = r0.f4353OooO00o
            OooOOoo.OooO<?, O> r0 = r0.f4354OooO0O0
            java.lang.Object r4 = r0.parseResult(r4, r5)
            r1.onActivityResult(r4)
            java.util.ArrayList<java.lang.String> r4 = r2.f4340OooO0o0
            r4.remove(r3)
            goto L46
        L37:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f4341OooO0oO
            r0.remove(r3)
            android.os.Bundle r0 = r2.f4342OooO0oo
            androidx.activity.result.ActivityResult r1 = new androidx.activity.result.ActivityResult
            r1.<init>(r4, r5)
            r0.putParcelable(r3, r1)
        L46:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.ActivityResultRegistry.OooO0O0(int, int, android.content.Intent):boolean");
    }

    @MainThread
    public abstract void OooO0OO(int i, @NonNull OooO oooO, @SuppressLint({"UnknownNullness"}) Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final <I, O> androidx.activity.result.OooO0O0<I> OooO0Oo(@NonNull String str, @NonNull OooO<I, O> oooO, @NonNull androidx.activity.result.OooO00o<O> oooO00o) {
        OooO0o(str);
        this.f4339OooO0o.put(str, new OooO0OO<>(oooO00o, oooO));
        if (this.f4341OooO0oO.containsKey(str)) {
            Object obj = this.f4341OooO0oO.get(str);
            this.f4341OooO0oO.remove(str);
            oooO00o.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f4342OooO0oo.getParcelable(str);
        if (activityResult != null) {
            this.f4342OooO0oo.remove(str);
            oooO00o.onActivityResult(oooO.parseResult(activityResult.f4333Oooo0o, activityResult.f4334Oooo0oO));
        }
        return new OooO0O0(str, oooO);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    public final void OooO0o(String str) {
        if (((Integer) this.f4337OooO0OO.get(str)) != null) {
            return;
        }
        int iNextInt = this.f4335OooO00o.nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            if (!this.f4336OooO0O0.containsKey(Integer.valueOf(i))) {
                OooO00o(i, str);
                return;
            }
            iNextInt = this.f4335OooO00o.nextInt(2147418112);
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.HashMap, java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$OooO0o>] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.HashMap, java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$OooO0o>] */
    @NonNull
    public final <I, O> androidx.activity.result.OooO0O0<I> OooO0o0(@NonNull final String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull final OooO<I, O> oooO, @NonNull final androidx.activity.result.OooO00o<O> oooO00o) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
        }
        OooO0o(str);
        OooO0o oooO0o = (OooO0o) this.f4338OooO0Oo.get(str);
        if (oooO0o == null) {
            oooO0o = new OooO0o(lifecycle);
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner2, @NonNull Lifecycle.Event event) {
                if (!Lifecycle.Event.ON_START.equals(event)) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f4339OooO0o.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            ActivityResultRegistry.this.OooO0oO(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f4339OooO0o.put(str, new OooO0OO<>(oooO00o, oooO));
                if (ActivityResultRegistry.this.f4341OooO0oO.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f4341OooO0oO.get(str);
                    ActivityResultRegistry.this.f4341OooO0oO.remove(str);
                    oooO00o.onActivityResult(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f4342OooO0oo.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f4342OooO0oo.remove(str);
                    oooO00o.onActivityResult(oooO.parseResult(activityResult.f4333Oooo0o, activityResult.f4334Oooo0oO));
                }
            }
        };
        oooO0o.f4355OooO00o.addObserver(lifecycleEventObserver);
        oooO0o.f4356OooO0O0.add(lifecycleEventObserver);
        this.f4338OooO0Oo.put(str, oooO0o);
        return new OooO00o(str, oooO);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.HashMap, java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$OooO0o>] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$OooO0OO<?>>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashMap, java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$OooO0o>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @MainThread
    public final void OooO0oO(@NonNull String str) {
        Integer num;
        if (!this.f4340OooO0o0.contains(str) && (num = (Integer) this.f4337OooO0OO.remove(str)) != null) {
            this.f4336OooO0O0.remove(num);
        }
        this.f4339OooO0o.remove(str);
        if (this.f4341OooO0oO.containsKey(str)) {
            StringBuilder sbOooO0OO = OooO0o.OooO0o.OooO0OO("Dropping pending result for request ", str, ": ");
            sbOooO0OO.append(this.f4341OooO0oO.get(str));
            Log.w("ActivityResultRegistry", sbOooO0OO.toString());
            this.f4341OooO0oO.remove(str);
        }
        if (this.f4342OooO0oo.containsKey(str)) {
            StringBuilder sbOooO0OO2 = OooO0o.OooO0o.OooO0OO("Dropping pending result for request ", str, ": ");
            sbOooO0OO2.append(this.f4342OooO0oo.getParcelable(str));
            Log.w("ActivityResultRegistry", sbOooO0OO2.toString());
            this.f4342OooO0oo.remove(str);
        }
        OooO0o oooO0o = (OooO0o) this.f4338OooO0Oo.get(str);
        if (oooO0o != null) {
            Iterator<LifecycleEventObserver> it = oooO0o.f4356OooO0O0.iterator();
            while (it.hasNext()) {
                oooO0o.f4355OooO00o.removeObserver(it.next());
            }
            oooO0o.f4356OooO0O0.clear();
            this.f4338OooO0Oo.remove(str);
        }
    }
}

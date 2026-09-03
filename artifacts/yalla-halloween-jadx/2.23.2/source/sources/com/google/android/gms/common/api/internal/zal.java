package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zal {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14450OooO0Oo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p190o00o0O.OooO<ApiKey<?>, String> f14448OooO0O0 = new p190o00o0O.OooO<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TaskCompletionSource<Map<ApiKey<?>, String>> f14449OooO0OO = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f14451OooO0o0 = false;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p190o00o0O.OooO<ApiKey<?>, ConnectionResult> f14447OooO00o = new p190o00o0O.OooO<>();

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public zal(Iterable<? extends HasApiKey<?>> iterable) {
        Iterator<? extends HasApiKey<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.f14447OooO00o.put(it.next().getApiKey(), null);
        }
        this.f14450OooO0Oo = p190o00o0O.OooO.this.f38568OooO0o;
    }

    public final Task<Map<ApiKey<?>, String>> zaa() {
        return this.f14449OooO0OO.getTask();
    }

    public final Set<ApiKey<?>> zab() {
        return this.f14447OooO00o.keySet();
    }

    public final void zac(ApiKey<?> apiKey, ConnectionResult connectionResult, @Nullable String str) {
        p190o00o0O.OooO<ApiKey<?>, ConnectionResult> oooO = this.f14447OooO00o;
        oooO.put(apiKey, connectionResult);
        p190o00o0O.OooO<ApiKey<?>, String> oooO2 = this.f14448OooO0O0;
        oooO2.put(apiKey, str);
        this.f14450OooO0Oo--;
        if (!connectionResult.isSuccess()) {
            this.f14451OooO0o0 = true;
        }
        if (this.f14450OooO0Oo == 0) {
            boolean z = this.f14451OooO0o0;
            TaskCompletionSource<Map<ApiKey<?>, String>> taskCompletionSource = this.f14449OooO0OO;
            if (z) {
                taskCompletionSource.setException(new AvailabilityException(oooO));
            } else {
                taskCompletionSource.setResult(oooO2);
            }
        }
    }
}

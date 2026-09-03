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
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class zal {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15428OooO0Oo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo0<ApiKey<?>, String> f15426OooO0O0 = new Oooo0<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TaskCompletionSource<Map<ApiKey<?>, String>> f15427OooO0OO = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f15429OooO0o0 = false;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo0<ApiKey<?>, ConnectionResult> f15425OooO00o = new Oooo0<>();

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
            this.f15425OooO00o.put(it.next().getApiKey(), null);
        }
        this.f15428OooO0Oo = Oooo0.this.f421Oooo0oo;
    }

    public final Task<Map<ApiKey<?>, String>> zaa() {
        return this.f15427OooO0OO.getTask();
    }

    public final Set<ApiKey<?>> zab() {
        return this.f15425OooO00o.keySet();
    }

    public final void zac(ApiKey<?> apiKey, ConnectionResult connectionResult, @Nullable String str) {
        this.f15425OooO00o.put(apiKey, connectionResult);
        this.f15426OooO0O0.put(apiKey, str);
        this.f15428OooO0Oo--;
        if (!connectionResult.isSuccess()) {
            this.f15429OooO0o0 = true;
        }
        if (this.f15428OooO0Oo == 0) {
            if (!this.f15429OooO0o0) {
                this.f15427OooO0OO.setResult(this.f15426OooO0O0);
            } else {
                this.f15427OooO0OO.setException(new AvailabilityException(this.f15425OooO00o));
            }
        }
    }
}

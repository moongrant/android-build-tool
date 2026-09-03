package androidx.lifecycle;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lo000OOo0/OooO0O0;", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "context", "create", "", "Ljava/lang/Class;", "dependencies", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class ProcessLifecycleInitializer implements o000OOo0.OooO0O0<LifecycleOwner> {
    @Override // o000OOo0.OooO0O0
    @NotNull
    public List<Class<? extends o000OOo0.OooO0O0<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o000OOo0.OooO0O0
    @NotNull
    public LifecycleOwner create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        o000OOo0.OooO00o oooO00oOooO0OO = o000OOo0.OooO00o.OooO0OO(context);
        Intrinsics.checkNotNullExpressionValue(oooO00oOooO0OO, "getInstance(context)");
        if (!oooO00oOooO0OO.f34895OooO0O0.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        LifecycleDispatcher.init(context);
        ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
        companion.init$lifecycle_process_release(context);
        return companion.get();
    }
}

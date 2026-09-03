package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<Configuration> f6395Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00000.OooO00o f6396Oooo0oO;

    public o00000(Ref.ObjectRef<Configuration> objectRef, o00000.OooO00o oooO00o) {
        this.f6395Oooo0o = objectRef;
        this.f6396Oooo0oO = oooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Configuration configuration2 = this.f6395Oooo0o.element;
        int iUpdateFrom = configuration2 != null ? configuration2.updateFrom(configuration) : -1;
        Iterator<Map.Entry<o00000.OooO00o.OooO0O0, WeakReference<o00000.OooO00o.C0278OooO00o>>> it = this.f6396Oooo0oO.f26570OooO00o.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<o00000.OooO00o.OooO0O0, WeakReference<o00000.OooO00o.C0278OooO00o>> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "it.next()");
            o00000.OooO00o.C0278OooO00o c0278OooO00o = next.getValue().get();
            if (c0278OooO00o == null || Configuration.needNewResources(iUpdateFrom, c0278OooO00o.f26572OooO0O0)) {
                it.remove();
            }
        }
        this.f6395Oooo0o.element = configuration;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f6396Oooo0oO.f26570OooO00o.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.f6396Oooo0oO.f26570OooO00o.clear();
    }
}

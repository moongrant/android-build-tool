package p591o0oOooOo;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class z4 extends Lambda implements Function1<Context, SVGAView> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Context f47416Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(Context context) {
        super(1);
        this.f47416Oooo0o = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SVGAView invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        SVGAView sVGAView = new SVGAView(it, null, 0, 6, null);
        sVGAView.OooO0oo("svga/event_ongoing.svga", (LifecycleOwner) this.f47416Oooo0o);
        sVGAView.OooO();
        return sVGAView;
    }
}

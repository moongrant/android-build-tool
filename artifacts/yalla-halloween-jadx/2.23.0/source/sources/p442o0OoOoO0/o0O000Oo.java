package p442o0OoOoO0;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends Lambda implements Function1<Context, SVGAView> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f46229OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(Context context) {
        super(1);
        this.f46229OooO0Oo = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SVGAView invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        SVGAView sVGAView = new SVGAView(it, null, 6, 0);
        sVGAView.OooOO0O("svga/event_ongoing.svga", (LifecycleOwner) this.f46229OooO0Oo);
        sVGAView.OooOO0o();
        return sVGAView;
    }
}

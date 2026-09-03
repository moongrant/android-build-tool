package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000Oo0 extends FunctionReferenceImpl implements Function1<ViewParent, ViewParent> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000Oo0 f5436OooO0Oo = new o000Oo0();

    public o000Oo0() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ViewParent invoke(ViewParent viewParent) {
        ViewParent p0 = viewParent;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getParent();
    }
}

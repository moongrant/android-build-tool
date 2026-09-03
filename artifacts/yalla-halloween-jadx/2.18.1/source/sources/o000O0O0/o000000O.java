package o000O0O0;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000O extends FunctionReferenceImpl implements Function1<ViewParent, ViewParent> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o000000O f28116Oooo0o = new o000000O();

    public o000000O() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ViewParent invoke(ViewParent viewParent) {
        ViewParent p0 = viewParent;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getParent();
    }
}

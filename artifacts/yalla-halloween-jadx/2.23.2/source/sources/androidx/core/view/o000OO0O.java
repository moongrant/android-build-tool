package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO0O extends FunctionReferenceImpl implements Function1<ViewParent, ViewParent> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000OO0O f5453OooO0Oo = new o000OO0O();

    public o000OO0O() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}

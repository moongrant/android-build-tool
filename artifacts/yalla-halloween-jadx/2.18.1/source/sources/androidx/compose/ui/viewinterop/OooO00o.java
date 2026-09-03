package androidx.compose.ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000000.o0000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Lambda implements Function0<SparseArray<Parcelable>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000<ViewFactoryHolder<View>> f6731Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(o0000<ViewFactoryHolder<View>> o0000Var) {
        super(0);
        this.f6731Oooo0o = o0000Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SparseArray<Parcelable> invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ViewFactoryHolder<View> viewFactoryHolder = this.f6731Oooo0o.f26623OooO00o;
        Intrinsics.checkNotNull(viewFactoryHolder);
        View typedView$ui_release = viewFactoryHolder.getTypedView$ui_release();
        if (typedView$ui_release != null) {
            typedView$ui_release.saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }
}

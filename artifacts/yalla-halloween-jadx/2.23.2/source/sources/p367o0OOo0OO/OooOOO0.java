package p367o0OOo0OO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.android.ylpopupwindow.utils.VBViewHolder;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import o00O00o0.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public abstract class OooOOO0<VB extends OooO00o, T> extends BaseQuickAdapter<T, VBViewHolder<VB>> {
    public OooOOO0(int i) {
        super(0, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final BaseViewHolder OooOOo0(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(this, "root");
        Intrinsics.checkNotNullParameter(parent, "parent");
        OooO00o oooO00o = null;
        try {
            for (T t : SequencesKt.flatMap(SequencesKt.filter(SequencesKt.sequence(new OooOOO(this, null)), OooOOOO.f43082OooO0Oo), OooOo00.f43083OooO0Oo)) {
                if ((t instanceof Class) && OooO00o.class.isAssignableFrom((Class) t)) {
                    Intrinsics.checkNotNull(t, "null cannot be cast to non-null type java.lang.Class<*>");
                    Object objInvoke = ((Class) t).getDeclaredMethod("inflate", LayoutInflater.class, ViewGroup.class, Boolean.TYPE).invoke(null, LayoutInflater.from(parent.getContext()), parent, Boolean.FALSE);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type Binding of com.yalla.android.ylpopupwindow.utils.ViewBindingCreateUtils.createAdapterItemBinding$lambda$3");
                    oooO00o = (OooO00o) objInvoke;
                    Intrinsics.checkNotNull(oooO00o);
                    View root = oooO00o.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                    return new VBViewHolder(oooO00o, root);
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        } catch (Exception unused) {
        }
    }
}

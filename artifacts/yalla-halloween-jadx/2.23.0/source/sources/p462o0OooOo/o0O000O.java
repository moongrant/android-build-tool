package p462o0OooOo;

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
import p081o000OoOO.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public abstract class o0O000O<VB extends OooO, T> extends BaseQuickAdapter<T, VBViewHolder<VB>> {
    public o0O000O(int i) {
        super(0, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final BaseViewHolder OooOOo0(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(this, "root");
        Intrinsics.checkNotNullParameter(parent, "parent");
        OooO oooO = null;
        try {
            for (T t : SequencesKt.flatMap(SequencesKt.filter(SequencesKt.sequence(new o0OoOoOo(this, null)), o0O000Oo.f46660OooO0Oo), o0O000o0.f46661OooO0Oo)) {
                if ((t instanceof Class) && OooO.class.isAssignableFrom((Class) t)) {
                    Intrinsics.checkNotNull(t, "null cannot be cast to non-null type java.lang.Class<*>");
                    Object objInvoke = ((Class) t).getDeclaredMethod("inflate", LayoutInflater.class, ViewGroup.class, Boolean.TYPE).invoke(null, LayoutInflater.from(parent.getContext()), parent, Boolean.FALSE);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type Binding of com.yalla.android.ylpopupwindow.utils.ViewBindingCreateUtils.createAdapterItemBinding$lambda$3");
                    oooO = (OooO) objInvoke;
                    Intrinsics.checkNotNull(oooO);
                    View root = oooO.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                    return new VBViewHolder(oooO, root);
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        } catch (Exception unused) {
        }
    }
}

package p553o0oOOO0o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.OooO00o;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import p104o000oo0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public abstract class o0O0o0<VB extends o00O0O, T> extends BaseQuickAdapter<T, o0O0oo00<VB>> {
    public o0O0o0() {
        super(0, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final OooO00o onCreateDefViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(this, "root");
        Intrinsics.checkNotNullParameter(parent, "parent");
        o00O0O o00o0o2 = null;
        try {
            for (T t : SequencesKt.flatMap(SequencesKt.filter(SequencesKt.sequence(new o0O(this, null)), o0OO000.f44624Oooo0o), o0OO000o.f44625Oooo0o)) {
                if ((t instanceof Class) && o00O0O.class.isAssignableFrom((Class) t)) {
                    Intrinsics.checkNotNull(t, "null cannot be cast to non-null type java.lang.Class<*>");
                    Object objInvoke = ((Class) t).getDeclaredMethod("inflate", LayoutInflater.class, ViewGroup.class, Boolean.TYPE).invoke(null, LayoutInflater.from(parent.getContext()), parent, Boolean.FALSE);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type Binding of com.yalla.android.ylpopupwindow.utils.ViewBindingCreateUtils.createAdapterItemBinding$lambda-3");
                    o00o0o2 = (o00O0O) objInvoke;
                    Intrinsics.checkNotNull(o00o0o2);
                    View viewOooO0O0 = o00o0o2.OooO0O0();
                    Intrinsics.checkNotNullExpressionValue(viewOooO0O0, "binding.root");
                    return new o0O0oo00(o00o0o2, viewOooO0O0);
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        } catch (Exception unused) {
        }
    }
}

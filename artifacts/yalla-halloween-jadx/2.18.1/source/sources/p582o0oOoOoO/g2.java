package p582o0oOoOoO;

import androidx.lifecycle.Observer;
import com.app.base.adapter.message.MessageModelHeadType;
import com.yalla.yalla.ui.fragment.MessageBoxFragment;
import kotlin.jvm.internal.Intrinsics;
import p563o0oOo0.o0OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class g2<T> implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MessageBoxFragment f46854OooO00o;

    public g2(MessageBoxFragment messageBoxFragment) {
        this.f46854OooO00o = messageBoxFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        int iIntValue = ((Number) t).intValue();
        o0OO00O o0oo00o2 = this.f46854OooO00o.f24013OoooOOO;
        if (o0oo00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            o0oo00o2 = null;
        }
        o0oo00o2.OooO0O0(MessageModelHeadType.TypeYallaTeam, iIntValue);
    }
}

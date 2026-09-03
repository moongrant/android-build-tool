package p522o0o0OO0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.adapter.message.MessageModelHeadType;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 implements Observer<Integer> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MessageBoxFragment f53431OooO0Oo;

    public Oooo000(MessageBoxFragment messageBoxFragment) {
        this.f53431OooO0Oo = messageBoxFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Integer num) {
        Integer num2 = num;
        com.yalla.yalla.ui.adapter.Oooo000 oooo000 = this.f53431OooO0Oo.f28503OooOOOo;
        if (oooo000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo000 = null;
        }
        oooo000.Oooo0o(MessageModelHeadType.TypeSystem, num2 != null ? num2.intValue() : 0);
    }
}

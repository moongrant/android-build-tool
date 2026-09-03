package p539o0o0OoOO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.view.EmojiFaceView;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import p365o0OOo0Oo.OooOo;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nEmojiFaceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiFaceView.kt\ncom/yalla/yalla/ui/view/EmojiFaceView$initEmojiFaceList$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class n0 implements Observer<List<? extends OooOo>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EmojiFaceView f55600OooO0Oo;

    public n0(EmojiFaceView emojiFaceView) {
        this.f55600OooO0Oo = emojiFaceView;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<? extends OooOo> list) {
        List<? extends OooOo> list2 = list;
        if (list2 != null) {
            this.f55600OooO0Oo.f30387OooO0Oo.OooOoO0(list2);
        }
    }
}

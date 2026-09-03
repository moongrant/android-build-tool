package p601o0oo00Oo;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.app.base.util.spannableStringUtils.SpannableStringModel;
import com.yalla.yalla.ui.view.MomentDetailText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p174o00OooOO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0O extends o0O00OO<String> {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailText f48265Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(MomentDetailText momentDetailText, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f48265Oooo0oo = momentDetailText;
    }

    @Override // p174o00OooOO.o0O00OO
    public final void OooO00o(@NotNull View view, @NotNull SpannableStringModel<String> model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        Function0<Unit> function0 = this.f48265Oooo0oo.f24916Oooo0oo;
        if (function0 != null) {
            function0.invoke();
        }
    }
}

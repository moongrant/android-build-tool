package p601o0oo00Oo;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.app.base.util.spannableStringUtils.SpannableStringModel;
import com.yalla.yalla.ui.view.MomentDetailText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p174o00OooOO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO extends o0O00OO<String> {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailText f48144Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(MomentDetailText momentDetailText, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f48144Oooo0oo = momentDetailText;
    }

    @Override // p174o00OooOO.o0O00OO
    public final void OooO00o(@NotNull View view, @Nullable SpannableStringModel<String> spannableStringModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        Function0<Unit> function0 = this.f48144Oooo0oo.f24916Oooo0oo;
        if (function0 != null) {
            function0.invoke();
        }
    }
}

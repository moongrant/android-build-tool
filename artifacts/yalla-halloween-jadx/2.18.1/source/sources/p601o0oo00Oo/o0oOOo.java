package p601o0oo00Oo;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.app.base.util.spannableStringUtils.SpannableStringModel;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p174o00OooOO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOOo extends o0O00OO<String> {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48235Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(MomentDetailView momentDetailView, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f48235Oooo0oo = momentDetailView;
    }

    @Override // p174o00OooOO.o0O00OO
    public final void OooO00o(@NotNull View view, @NotNull SpannableStringModel<String> model) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        MomentDetailView momentDetailView = this.f48235Oooo0oo;
        int i = MomentDetailView.f24937OoooooO;
        momentDetailView.OooOo00();
    }
}

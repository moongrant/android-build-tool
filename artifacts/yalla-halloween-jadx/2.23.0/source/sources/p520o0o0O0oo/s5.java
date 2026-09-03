package p520o0o0O0oo;

import android.view.View;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class s5 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f53334OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(GiftCustomMadeWebManager giftCustomMadeWebManager) {
        super(1);
        this.f53334OooO0Oo = giftCustomMadeWebManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f53334OooO0Oo.OooO0O0();
        return Unit.INSTANCE;
    }
}

package p501o0o00o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GiftBlindWebManager f41488Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(GiftBlindWebManager giftBlindWebManager) {
        super(1);
        this.f41488Oooo0o = giftBlindWebManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        GiftBlindWebManager giftBlindWebManager = this.f41488Oooo0o;
        o0000O0.OooO0O0(LifecycleOwnerKt.getLifecycleScope(giftBlindWebManager.f20886OooO00o), new o00oO0o(giftBlindWebManager, null));
        return Unit.INSTANCE;
    }
}

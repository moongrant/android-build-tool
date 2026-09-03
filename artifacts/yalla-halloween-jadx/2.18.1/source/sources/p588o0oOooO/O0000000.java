package p588o0oOooO;

import com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p029Oooo0oO.o00OO;
import p029Oooo0oO.o00OOO00;
import p043OooooO0.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
public final class O0000000 extends Lambda implements Function1<o00OOO00, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountReasonChooseVM f47094Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000000(DeleteAccountReasonChooseVM deleteAccountReasonChooseVM) {
        super(1);
        this.f47094Oooo0o = deleteAccountReasonChooseVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00OOO00 o00ooo01) {
        o00OOO00 LazyVerticalGrid = o00ooo01;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyVerticalGrid.OooO0O0(this.f47094Oooo0o.getCancelReasonList().size(), (14 & 2) != 0 ? null : null, null, (14 & 8) != 0 ? o00OO.OooO00o.f2338Oooo0o : null, o00O0000.OooO0O0(1722304235, true, new oo00(this.f47094Oooo0o)));
        return Unit.INSTANCE;
    }
}

package p588o0oOooO;

import com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class O0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOo0o00 f47095Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountReasonChooseVM f47096Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f47097Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0O0(oOo0o00 ooo0o00, DeleteAccountReasonChooseVM deleteAccountReasonChooseVM, int i) {
        super(2);
        this.f47095Oooo0o = ooo0o00;
        this.f47096Oooo0oO = deleteAccountReasonChooseVM;
        this.f47097Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oOo0o00.OooO0o(this.f47095Oooo0o, this.f47096Oooo0oO, ooo00o, this.f47097Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}

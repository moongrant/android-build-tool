package p650o0ooo;

import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.share.ShareChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p526o0o0OO0O.o000Oo0;
import p577o0oOoOo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class l3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OO000 f58374OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f58375OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(o0OO000 o0oo000, BaseFragmentActivity baseFragmentActivity) {
        super(0);
        this.f58374OooO0Oo = o0oo000;
        this.f58375OooO0o0 = baseFragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000 o0oo000 = this.f58374OooO0Oo;
        o0oo000.f56514OooO00o.setValue(Boolean.FALSE);
        OooO00o.OooO0O0("102256");
        o000Oo0.OooO00o.OooO00o(this.f58375OooO0o0, ShareChannel.WhatsApp, o0oo000.OooO0OO());
        return Unit.INSTANCE;
    }
}

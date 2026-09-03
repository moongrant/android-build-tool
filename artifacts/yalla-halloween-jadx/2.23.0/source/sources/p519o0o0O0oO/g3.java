package p519o0o0O0oO;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.share.ShareChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p571o0oOoOO.o0O0o000;
import p587o0oOooo.o0OO000;
import p648o0ooo.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class g3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0o000 f52292OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f52293OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(o0O0o000 o0o0o000, FragmentActivity fragmentActivity) {
        super(0);
        this.f52292OooO0Oo = o0o0o000;
        this.f52293OooO0o0 = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O0o000 o0o0o000 = this.f52292OooO0Oo;
        o0o0o000.f56247OooO00o.setValue(Boolean.FALSE);
        o0OO000.OooO00o("102251");
        o0O0O00.OooO00o.OooO00o(this.f52293OooO0o0, ShareChannel.Friends, o0o0o000.OooO0OO());
        return Unit.INSTANCE;
    }
}

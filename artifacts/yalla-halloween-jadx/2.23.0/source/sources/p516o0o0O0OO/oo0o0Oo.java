package p516o0o0O0OO;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oOo0o00;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oo0o0Oo f51969OooO0Oo = new oo0o0Oo();

    public oo0o0Oo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
        String strOooO0O0 = oOo0o00.OooO0O0(oOo0o00.OooO0O0(it, "RoomId", String.valueOf(oooO00o.OooO00o().f25001OooO0Oo.getValue())), "IsOwner", String.valueOf(oooO00o.OooO00o().OooOOO()));
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
        webPageInfo.OooO0o0(strOooO0O0);
        webPageInfo.f32821OooO0oo = false;
        OooO00o.f24977OooO0o.OooO0Oo(webPageInfo);
        return Unit.INSTANCE;
    }
}

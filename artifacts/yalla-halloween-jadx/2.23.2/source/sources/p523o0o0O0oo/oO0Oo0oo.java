package p523o0o0O0oo;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p590o0oOooo0.c1;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0oo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO0Oo0oo f53183OooO0Oo = new oO0Oo0oo();

    public oO0Oo0oo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        Intrinsics.checkNotNull(str2);
        OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
        String strOooO0O0 = c1.OooO0O0(c1.OooO0O0(str2, "RoomId", String.valueOf(oooO00o.OooO00o().f24539OooO0Oo.getValue())), "IsOwner", String.valueOf(oooO00o.OooO00o().OooOOO()));
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
        webPageInfo.OooO0o0(strOooO0O0);
        webPageInfo.f32285OooO0oo = false;
        OooO00o.f24515OooO0o.OooO0Oo(webPageInfo);
        return Unit.INSTANCE;
    }
}

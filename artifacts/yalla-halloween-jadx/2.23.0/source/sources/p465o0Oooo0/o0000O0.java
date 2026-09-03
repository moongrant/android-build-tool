package p465o0Oooo0;

import com.yalla.yalla.model.InstagramTokenModel;
import com.yalla.yalla.open_auth.InstagramOAuth;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ InstagramOAuth f46868OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(InstagramOAuth instagramOAuth) {
        super(1);
        this.f46868OooO0Oo = instagramOAuth;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z = !StringsKt.isBlank(it);
        InstagramOAuth instagramOAuth = this.f46868OooO0Oo;
        if (z) {
            InstagramTokenModel instagramTokenModel = (InstagramTokenModel) oOo00OO0.OooO00o(it, InstagramTokenModel.class);
            Function2<? super String, ? super String, Unit> function2 = instagramOAuth.f24720OooO0O0;
            if (function2 != null) {
                function2.invoke(instagramTokenModel.getAccess_token(), instagramTokenModel.getUser_id());
            }
        } else {
            Function0<Unit> function0 = instagramOAuth.f24721OooO0OO;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}

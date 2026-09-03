package oO0OO;

import com.android.billingclient.api.o0Oo0oo;
import com.yalla.yalla.common.model.InstagramTokenModel;
import com.yalla.yalla.open_auth.InstagramOAuth;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ InstagramOAuth f52729Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(InstagramOAuth instagramOAuth) {
        super(1);
        this.f52729Oooo0o = instagramOAuth;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!StringsKt.isBlank(it)) {
            InstagramTokenModel instagramTokenModel = (InstagramTokenModel) o0Oo0oo.OooO0O0(it, InstagramTokenModel.class);
            Function2<? super String, ? super String, Unit> function2 = this.f52729Oooo0o.f21642OooO0O0;
            if (function2 != null) {
                function2.invoke(instagramTokenModel.getAccess_token(), instagramTokenModel.getUser_id());
            }
        } else {
            Function0<Unit> function0 = this.f52729Oooo0o.f21643OooO0OO;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}

package p491o0o00O0o;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p205o00o0o0o.o000O;
import p381o0OOoOo0.Oooo000;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f48999OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f48999OooO0Oo = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        if (error.getCode() == 3008) {
            PhoneNumberActivity phoneNumberActivity = this.f48999OooO0Oo;
            o000O o000o = new o000O(phoneNumberActivity);
            String string = phoneNumberActivity.getString(o000000.not_support_resgister_tip);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            o000o.OooOo00(string);
            String string2 = phoneNumberActivity.getString(o000000.other_login_options);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            o000o.OooOOOo(string2);
            o000o.OooOo0(new o0O0000O(phoneNumberActivity));
            o000o.OooOo(true);
            o000o.OooOO0o();
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}

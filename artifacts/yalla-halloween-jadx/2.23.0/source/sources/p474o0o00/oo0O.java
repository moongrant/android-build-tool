package p474o0o00;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p157o00OoOO0.o0OO00O;
import p375o0OOoOO.o00000O0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0O extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f47353OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f47353OooO0Oo = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        if (error.getCode() == 3008) {
            PhoneNumberActivity phoneNumberActivity = this.f47353OooO0Oo;
            o0OO00O o0oo00o2 = new o0OO00O(phoneNumberActivity);
            String string = phoneNumberActivity.getString(oO00OOo0.not_support_resgister_tip);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.not_support_resgister_tip)");
            o0oo00o2.OooOo00(string);
            String string2 = phoneNumberActivity.getString(oO00OOo0.other_login_options);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.other_login_options)");
            o0oo00o2.OooOOOo(string2);
            o0oo00o2.OooOo0(new o00OO0OO(phoneNumberActivity));
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOO0o();
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}

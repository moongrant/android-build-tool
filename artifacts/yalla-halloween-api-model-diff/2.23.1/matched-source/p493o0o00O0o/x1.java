package p493o0o00O0o;

import com.code.android.util.o0000;
import com.yalla.yalla.model.http.ApiError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p383o0OOoOo0.Oooo000;
import p565o0oOo000.o000OOo;
import p675oO0Oo.oO00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00Oo0 f49512OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(oO00Oo0 oo00oo0) {
        super(1);
        this.f49512OooO0Oo = oo00oo0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        String errorText;
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        int code = it.getCode();
        if (code != 1092) {
            switch (code) {
                case 4015:
                    errorText = o0000.OooO0OO(o000OOo.topic_info_manage_err_code_4015);
                    break;
                case 4016:
                    errorText = o0000.OooO0OO(o000OOo.topic_info_manage_err_code_4016);
                    break;
                case 4017:
                    errorText = o0000.OooO0OO(o000OOo.topic_info_manage_err_code_4017);
                    break;
                default:
                    ApiError error = new ApiError(it.getCode(), it.getMessage(), null, 4, null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
                    errorText = "";
                    break;
            }
        } else {
            errorText = o0000.OooO0OO(o000OOo.topic_info_manage_err_code_4015);
        }
        oO00Oo0 oo00oo0 = this.f49512OooO0Oo;
        oo00oo0.getClass();
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        oo00oo0.f59652OooO0O0.setValue(errorText);
        oo00oo0.f59653OooO0OO.setValue(Boolean.TRUE);
        oo00oo0.f59651OooO00o.setValue(Boolean.FALSE);
        oo00oo0.f59654OooO0Oo.setValue("");
        return Unit.INSTANCE;
    }
}

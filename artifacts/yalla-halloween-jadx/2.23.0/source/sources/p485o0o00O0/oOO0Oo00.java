package p485o0o00O0;

import com.code.android.util.o0000;
import com.yalla.yalla.model.http.ApiError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p375o0OOoOO.o00000O0;
import p519o0o0O0oO.oO000O0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0Oo00 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO000O0O f48158OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0Oo00(oO000O0O oo000o0o) {
        super(1);
        this.f48158OooO0Oo = oo000o0o;
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
                    errorText = o0000.OooO0OO(oO00OOo0.topic_info_manage_err_code_4015);
                    break;
                case 4016:
                    errorText = o0000.OooO0OO(oO00OOo0.topic_info_manage_err_code_4016);
                    break;
                case 4017:
                    errorText = o0000.OooO0OO(oO00OOo0.topic_info_manage_err_code_4017);
                    break;
                default:
                    ApiError error = new ApiError(it.getCode(), it.getMessage(), null, 4, null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
                    errorText = "";
                    break;
            }
        } else {
            errorText = o0000.OooO0OO(oO00OOo0.topic_info_manage_err_code_4015);
        }
        oO000O0O oo000o0o = this.f48158OooO0Oo;
        oo000o0o.getClass();
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        oo000o0o.f52802OooO0O0.setValue(errorText);
        oo000o0o.f52803OooO0OO.setValue(Boolean.TRUE);
        oo000o0o.f52801OooO00o.setValue(Boolean.FALSE);
        oo000o0o.f52804OooO0Oo.setValue("");
        return Unit.INSTANCE;
    }
}

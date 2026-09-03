package p492o0o00OO0;

import com.code.android.util.o0000;
import com.yalla.yalla.model.http.ApiError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p381o0OOoOo0.Oooo000;
import p562o0oOo000.o000000;
import p650o0ooo.o0O0oo00;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0o0000 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0oo00 f49458OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0000(o0O0oo00 o0o0oo00) {
        super(1);
        this.f49458OooO0Oo = o0o0oo00;
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
                    errorText = o0000.OooO0OO(o000000.topic_info_manage_err_code_4015);
                    break;
                case 4016:
                    errorText = o0000.OooO0OO(o000000.topic_info_manage_err_code_4016);
                    break;
                case 4017:
                    errorText = o0000.OooO0OO(o000000.topic_info_manage_err_code_4017);
                    break;
                default:
                    ApiError error = new ApiError(it.getCode(), it.getMessage(), null, 4, null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
                    errorText = "";
                    break;
            }
        } else {
            errorText = o0000.OooO0OO(o000000.topic_info_manage_err_code_4015);
        }
        o0O0oo00 o0o0oo00 = this.f49458OooO0Oo;
        o0o0oo00.getClass();
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        o0o0oo00.f58663OooO0O0.setValue(errorText);
        o0o0oo00.f58664OooO0OO.setValue(Boolean.TRUE);
        o0o0oo00.f58662OooO00o.setValue(Boolean.FALSE);
        o0o0oo00.f58665OooO0Oo.setValue("");
        return Unit.INSTANCE;
    }
}

package p540o0o0Oo0;

import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import p140o00OOOo0.o00000O;
import p255o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00000O f44041Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO(o00000O o00000o) {
        super(1);
        this.f44041Oooo = o00000o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        String errorText;
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        int code2 = it.getCode();
        if (code2 != 1092) {
            switch (code2) {
                case 4015:
                    errorText = o000O0O0.OooO0OO(R.string.topic_info_manage_err_code_4015);
                    break;
                case 4016:
                    errorText = o000O0O0.OooO0OO(R.string.topic_info_manage_err_code_4016);
                    break;
                case 4017:
                    errorText = o000O0O0.OooO0OO(R.string.topic_info_manage_err_code_4017);
                    break;
                default:
                    ApiError error = new ApiError(it.getCode(), it.getMessage());
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                    errorText = "";
                    break;
            }
        } else {
            errorText = o000O0O0.OooO0OO(R.string.topic_info_manage_err_code_4015);
        }
        o00000O o00000o = this.f44041Oooo;
        Objects.requireNonNull(o00000o);
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        o00000o.f31771OooO0O0.setValue(errorText);
        o00000o.f31772OooO0OO.setValue(Boolean.TRUE);
        o00000o.f31770OooO00o.setValue(Boolean.FALSE);
        o00000o.f31773OooO0Oo.setValue("");
        return Unit.INSTANCE;
    }
}

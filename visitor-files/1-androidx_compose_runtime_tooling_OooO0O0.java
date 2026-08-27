package androidx.compose.runtime.tooling;

import androidx.camera.video.o0000oo;
import com.yalla.yalla.api.result.ApiResult;
import com.yalla.yalla.api.result.ApiResultCollectKt;
import com.yalla.yalla.ext.o00Oo0;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.module.account.ui.acitivity.LoginActivity;
import com.yalla.yalla.module.account.ui.acitivity.o00O00;
import com.yalla.yalla.ui.composable.common.o00OOOOo;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p590o0oo00o.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Function0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Object f15042OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f15043OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Object f15044OooO0oo;

    public /* synthetic */ OooO0O0(int i, Object obj, Object obj2) {
        this.f15043OooO0oO = i;
        this.f15044OooO0oo = obj;
        this.f15042OooO = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15043OooO0oO;
        Object obj = this.f15042OooO;
        Object obj2 = this.f15044OooO0oo;
        switch (i) {
            case 0:
                return CompositionErrorContextImpl.attachComposeStackTrace$lambda$0((CompositionErrorContextImpl) obj2, obj);
            case 1:
                LoginActivity this$0 = (LoginActivity) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
                com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("107051", MapsKt.mapOf(TuplesKt.to("pagename", "visit_login")));
                int i2 = LoginActivity.f50306OooOoo0;
                o00Oo0<ApiResult<LoginModel>> o00oo0LoginByVisitor = this$0.Oooo00O().loginByVisitor();
                o00OOOOo.OooO0OO(o00oo0LoginByVisitor, this$0.OooOOOo(), null, 6);
                ApiResultCollectKt.OooO0OO(o00oo0LoginByVisitor, coroutineScope).OooO00o(new o00O00());
                return Unit.INSTANCE;
            default:
                String sceneKey = (String) obj2;
                o0OO00O result = (o0OO00O) obj;
                Intrinsics.checkNotNullParameter(sceneKey, "$sceneKey");
                Intrinsics.checkNotNullParameter(result, "$result");
                int i3 = (int) result.f97391OooO0O0;
                boolean z = result.f97390OooO00o;
                StringBuilder sbOooO0O0 = o0000oo.OooO0O0(i3, "LZY Metric: ", sceneKey, ", Value: ", " ms, Success: ");
                sbOooO0O0.append(z);
                return sbOooO0O0.toString();
        }
    }
}

package p429o0OoOO;

import com.geetest.captcha.GTCaptcha4Client;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O0O implements GTCaptcha4Client.OnFailureListener, OnSuccessListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function f46797OooO0Oo;

    @Override // com.geetest.captcha.GTCaptcha4Client.OnFailureListener
    public final void onFailure(String str) {
        Function0 callNetFailure = (Function0) this.f46797OooO0Oo;
        Intrinsics.checkNotNullParameter(callNetFailure, "$callNetFailure");
        callNetFailure.invoke();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Function1 tmp0 = (Function1) this.f46797OooO0Oo;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}

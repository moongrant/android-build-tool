package p487o0o00O;

import com.yalla.yalla.ui.activity.main.PrivacyActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivacyActivity f48802OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(PrivacyActivity privacyActivity) {
        super(0);
        this.f48802OooO0Oo = privacyActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        this.f48802OooO0Oo.finish();
        return null;
    }
}

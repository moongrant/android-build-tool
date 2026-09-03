package com.yalla.yalla.common.manager.googlepay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.manager.PackManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.OooO00o;
import org.jetbrains.annotations.NotNull;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/GooglePaySubscriptions;", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "isHaveGooglePlay", "", "()Z", "payManager", "Lcom/yalla/yalla/common/manager/googlepay/GooglePayManager;", "getPayManager", "()Lcom/yalla/yalla/common/manager/googlepay/GooglePayManager;", "payManager$delegate", "Lkotlin/Lazy;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GooglePaySubscriptions {
    public static final int $stable = 8;
    private final boolean isHaveGooglePlay;

    /* JADX INFO: renamed from: payManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy payManager;

    public GooglePaySubscriptions(@NotNull final AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.payManager = LazyKt.lazy(new Function0<GooglePayManager>() { // from class: com.yalla.yalla.common.manager.googlepay.GooglePaySubscriptions$payManager$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GooglePayManager invoke() {
                return new GooglePayManager(activity, ((Number) OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
            }
        });
        this.isHaveGooglePlay = PackManager.INSTANCE.isHaveGooglePlay(activity);
    }

    @NotNull
    public final GooglePayManager getPayManager() {
        return (GooglePayManager) this.payManager.getValue();
    }

    /* JADX INFO: renamed from: isHaveGooglePlay, reason: from getter */
    public final boolean getIsHaveGooglePlay() {
        return this.isHaveGooglePlay;
    }
}

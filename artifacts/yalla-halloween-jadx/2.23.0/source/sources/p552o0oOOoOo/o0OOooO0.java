package p552o0oOOoOo;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO000o00;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class o0OOooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f55991OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f55992OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f55993OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<Animation> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f55994OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(0);
            this.f55994OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Animation invoke() {
            return AnimationUtils.loadAnimation(this.f55994OooO0Oo, OooO.OooO0o0() ? oO000o00.room_run_way_in_layout_ar : oO000o00.room_run_way_in_layout);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Animation> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f55995OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context) {
            super(0);
            this.f55995OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Animation invoke() {
            return AnimationUtils.loadAnimation(this.f55995OooO0Oo, OooO.OooO0o0() ? oO000o00.room_run_way_out_layout_ar : oO000o00.room_run_way_out_layout);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Animation> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f55996OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context) {
            super(0);
            this.f55996OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Animation invoke() {
            return AnimationUtils.loadAnimation(this.f55996OooO0Oo, OooO.OooO0o0() ? oO000o00.room_run_way_scale_number_ar : oO000o00.room_run_way_scale_number);
        }
    }

    public o0OOooO0(@NotNull Context activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f55991OooO00o = LazyKt.lazy(new OooO00o(activity));
        this.f55992OooO0O0 = LazyKt.lazy(new OooO0O0(activity));
        this.f55993OooO0OO = LazyKt.lazy(new OooO0OO(activity));
    }
}

package p558o0oOOooo;

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
import p562o0oOo000.oo000o;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0O00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f56214OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f56215OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f56216OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<Animation> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f56217OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(0);
            this.f56217OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Animation invoke() {
            return AnimationUtils.loadAnimation(this.f56217OooO0Oo, OooOo00.OooO0o0() ? oo000o.room_run_way_in_layout_ar : oo000o.room_run_way_in_layout);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Animation> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f56218OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context) {
            super(0);
            this.f56218OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Animation invoke() {
            return AnimationUtils.loadAnimation(this.f56218OooO0Oo, OooOo00.OooO0o0() ? oo000o.room_run_way_out_layout_ar : oo000o.room_run_way_out_layout);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Animation> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f56219OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context) {
            super(0);
            this.f56219OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Animation invoke() {
            return AnimationUtils.loadAnimation(this.f56219OooO0Oo, OooOo00.OooO0o0() ? oo000o.room_run_way_scale_number_ar : oo000o.room_run_way_scale_number);
        }
    }

    public oO0O00oO(@NotNull Context activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f56214OooO00o = LazyKt.lazy(new OooO00o(activity));
        this.f56215OooO0O0 = LazyKt.lazy(new OooO0O0(activity));
        this.f56216OooO0OO = LazyKt.lazy(new OooO0OO(activity));
    }
}

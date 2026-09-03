package p579o0oOoOOo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.support.common.util.o00O0O;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p502o0o00o0.o00000O;
import p649o0ooOOoo.kf;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class a extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Lazy f45898OoooO;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            a.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<kf> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f45900Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ a f45901Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, a aVar) {
            super(0);
            this.f45900Oooo0o = context;
            this.f45901Oooo0oO = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final kf invoke() {
            kf kfVarInflate = kf.inflate(LayoutInflater.from(this.f45900Oooo0o), this.f45901Oooo0oO.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(kfVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return kfVarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Lazy lazy = LazyKt.lazy(new OooO0O0(context, this));
        this.f45898OoooO = lazy;
        FrameLayout frameLayout = ((kf) lazy.getValue()).f49870OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.root");
        OooO0oO(frameLayout);
        AppCompatButton appCompatButton = ((kf) lazy.getValue()).f49871OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatButton, "binding.ok");
        o00O0O.OooO0Oo(appCompatButton, new OooO00o());
    }
}

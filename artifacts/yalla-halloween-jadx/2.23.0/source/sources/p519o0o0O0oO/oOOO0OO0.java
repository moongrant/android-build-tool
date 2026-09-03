package p519o0o0O0oO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000OO00;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p641o0ooOOOO.a8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOOO0OO0 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f52990OooOO0O;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOO0OO0.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<a8> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f52992OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oOOO0OO0 f52993OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, oOOO0OO0 oooo0oo0) {
            super(0);
            this.f52992OooO0Oo = context;
            this.f52993OooO0o0 = oooo0oo0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final a8 invoke() {
            a8 a8VarInflate = a8.inflate(LayoutInflater.from(this.f52992OooO0Oo), this.f52993OooO0o0.f52533OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(a8VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return a8VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OO0(@NotNull Context context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Lazy lazy = LazyKt.lazy(new OooO0O0(context, this));
        this.f52990OooOO0O = lazy;
        FrameLayout frameLayout = ((a8) lazy.getValue()).f57491OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.root");
        OooO0oO(frameLayout);
        AppCompatButton appCompatButton = ((a8) lazy.getValue()).f57492OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatButton, "binding.ok");
        o000OO00.OooO0oo(appCompatButton, new OooO00o());
    }
}

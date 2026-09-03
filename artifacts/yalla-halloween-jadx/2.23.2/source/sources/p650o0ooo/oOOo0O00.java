package p650o0ooo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OOO.n;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOOo0O00 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f59016OooOO0O;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOOo0O00.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<n> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f59018OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oOOo0O00 f59019OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context, oOOo0O00 oooo0o00) {
            super(0);
            this.f59018OooO0Oo = context;
            this.f59019OooO0o0 = oooo0o00;
        }

        @Override // kotlin.jvm.functions.Function0
        public final n invoke() {
            n nVarInflate = n.inflate(LayoutInflater.from(this.f59018OooO0Oo), this.f59019OooO0o0.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(nVarInflate, "inflate(...)");
            return nVarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOo0O00(@NotNull Context context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Lazy lazy = LazyKt.lazy(new OooO0O0(context, this));
        this.f59016OooOO0O = lazy;
        FrameLayout frameLayout = ((n) lazy.getValue()).f44178OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        OooO0oO(frameLayout);
        AppCompatButton ok = ((n) lazy.getValue()).f44179OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ok, "ok");
        o000O.OooO0oo(ok, new OooO00o());
    }
}

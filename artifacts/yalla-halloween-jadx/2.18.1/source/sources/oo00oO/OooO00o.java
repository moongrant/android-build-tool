package oo00oO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o000000;
import p649o0ooOOoo.f8;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO00o extends PopupWindow {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f53312OooO0OO = new OooO0OO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f53313OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f53314OooO0O0;

    /* JADX INFO: renamed from: oo00oO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0438OooO00o extends Lambda implements Function1<View, Unit> {
        public C0438OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            OooO00o.this.dismiss();
            Objects.requireNonNull(OooO00o.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            OooO00o.this.dismiss();
            Objects.requireNonNull(OooO00o.this);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO {
        public final void OooO00o(@NotNull Context context, @NotNull View viewParent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(viewParent, "viewParent");
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            o000000 o000000VarOooO = OooOOO0.OooO();
            Objects.requireNonNull(o000000VarOooO);
            if (o000000VarOooO.OooO00o("momentCommentRewardHintView" + OooOOO.f41216OooO00o.OooOo().getValue(), false)) {
                return;
            }
            new OooO00o(context, viewParent);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<f8> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f53317Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Context context) {
            super(0);
            this.f53317Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final f8 invoke() {
            f8 f8VarInflate = f8.inflate(LayoutInflater.from(this.f53317Oooo0o));
            Intrinsics.checkNotNullExpressionValue(f8VarInflate, "inflate(LayoutInflater.from(context))");
            return f8VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(@NotNull Context context, @NotNull View viewParent) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewParent, "viewParent");
        this.f53313OooO00o = LazyKt.lazy(new OooO0o(context));
        setContentView(OooO00o().f49336OooO00o);
        OooO00o().f49338OooO0OO.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f53314OooO0O0 = OooO00o().f49338OooO0OO.getMeasuredHeight();
        ConstraintLayout constraintLayout = OooO00o().f49337OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.bg");
        o00O0O.OooO0Oo(constraintLayout, new C0438OooO00o());
        AppCompatTextView appCompatTextView = OooO00o().f49338OooO0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.content");
        o00O0O.OooO0Oo(appCompatTextView, new OooO0O0());
        int[] iArr = new int[2];
        viewParent.getLocationOnScreen(iArr);
        setBackgroundDrawable(null);
        setWidth(-1);
        setAnimationStyle(R.style.BaseTheme);
        setFocusable(true);
        setOutsideTouchable(true);
        showAtLocation(viewParent, 48, iArr[0], iArr[1] - this.f53314OooO0O0);
    }

    public final f8 OooO00o() {
        return (f8) this.f53313OooO00o.getValue();
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o000000 o000000VarOooO = OooOOO0.OooO();
        Objects.requireNonNull(o000000VarOooO);
        o000000VarOooO.OooO0o("momentCommentRewardHintView" + OooOOO.f41216OooO00o.OooOo().getValue(), true);
        super.dismiss();
    }
}

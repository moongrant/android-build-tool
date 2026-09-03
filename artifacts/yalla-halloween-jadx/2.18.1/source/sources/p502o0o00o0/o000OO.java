package p502o0o00o0;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.EventTagModel;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.t7;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000OO extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Activity f41588OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f41589OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public OooO00o f41590o000oOoO;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f41591OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public EventTagModel f41592OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Lazy f41593OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final Lazy f41594OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final Lazy f41595OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final Lazy f41596OooO0o0;

        /* JADX INFO: renamed from: o0o00o0.o000OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0396OooO00o extends Lambda implements Function0<NetImageView> {
            public C0396OooO00o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final NetImageView invoke() {
                return (NetImageView) OooO00o.this.OooO0O0().findViewById(R.id.image);
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<View> {
            public OooO0O0() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return View.inflate(OooO00o.this.f41591OooO00o, R.layout.item_event_keywrod_dialog, null);
            }
        }

        public static final class OooO0OO extends Lambda implements Function0<LinearLayout> {
            public OooO0OO() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final LinearLayout invoke() {
                return (LinearLayout) OooO00o.this.OooO0O0().findViewById(R.id.bg);
            }
        }

        public static final class OooO0o extends Lambda implements Function0<TextView> {
            public OooO0o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) OooO00o.this.OooO0O0().findViewById(R.id.text);
            }
        }

        public OooO00o(@NotNull Context context, @NotNull EventTagModel itemModel) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(itemModel, "itemModel");
            this.f41591OooO00o = context;
            this.f41592OooO0O0 = itemModel;
            this.f41593OooO0OO = LazyKt.lazy(new OooO0O0());
            this.f41594OooO0Oo = LazyKt.lazy(new OooO0OO());
            this.f41596OooO0o0 = LazyKt.lazy(new C0396OooO00o());
            this.f41595OooO0o = LazyKt.lazy(new OooO0o());
        }

        @NotNull
        public final NetImageView OooO00o() {
            Object value = this.f41596OooO0o0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-image>(...)");
            return (NetImageView) value;
        }

        @NotNull
        public final View OooO0O0() {
            Object value = this.f41593OooO0OO.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-itemRoot>(...)");
            return (View) value;
        }

        @NotNull
        public final TextView OooO0OO() {
            Object value = this.f41595OooO0o.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-text>(...)");
            return (TextView) value;
        }

        public final void OooO0Oo(boolean z) {
            if (z) {
                Object value = this.f41594OooO0Oo.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-layout>(...)");
                ((LinearLayout) value).setBackgroundResource(R.drawable.shape_round_green_0dc_r16_stroke1);
            } else {
                Object value2 = this.f41594OooO0Oo.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "<get-layout>(...)");
                ((LinearLayout) value2).setBackgroundResource(R.drawable.shape_round_gray_f7f7f7_r16);
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<t7> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final t7 invoke() {
            t7 t7VarInflate = t7.inflate(LayoutInflater.from(o000OO.this.f41588OoooO), o000OO.this.f41545Oooo0oo, true);
            Intrinsics.checkNotNullExpressionValue(t7VarInflate, "inflate(LayoutInflater.f…ty), getRootView(), true)");
            return t7VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(@NotNull Activity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f41588OoooO = activity;
        this.f41589OoooOO0 = LazyKt.lazy(new OooO0O0());
        LinearLayout linearLayout = OooOO0O().f50632OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        OooO0oo(80);
        Window window = this.f41542Oooo;
        if (window != null) {
            window.setWindowAnimations(R.style.animation_bottom_in_bottom_out);
        }
    }

    public final t7 OooOO0O() {
        return (t7) this.f41589OoooOO0.getValue();
    }
}

package p650o0ooo;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.event.EventTagModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oo00oO;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEventTagDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventTagDialog.kt\ncom/yalla/yalla/ui/dialog/EventTagDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
public final class o00Oo00 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Activity f58578OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f58579OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooO00o f58580OooOOO0;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f58581OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final EventTagModel f58582OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Lazy f58583OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final Lazy f58584OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final Lazy f58585OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final Lazy f58586OooO0o0;

        /* JADX INFO: renamed from: o0ooo.o00Oo00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0494OooO00o extends Lambda implements Function0<NetImageView> {
            public C0494OooO00o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final NetImageView invoke() {
                return (NetImageView) OooO00o.this.OooO00o().findViewById(o0OO00O.image);
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<View> {
            public OooO0O0() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return View.inflate(OooO00o.this.f58581OooO00o, oo0o0Oo.item_event_keywrod_dialog, null);
            }
        }

        public static final class OooO0OO extends Lambda implements Function0<LinearLayout> {
            public OooO0OO() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final LinearLayout invoke() {
                return (LinearLayout) OooO00o.this.OooO00o().findViewById(o0OO00O.bg);
            }
        }

        public static final class OooO0o extends Lambda implements Function0<TextView> {
            public OooO0o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) OooO00o.this.OooO00o().findViewById(o0OO00O.text);
            }
        }

        public OooO00o(@NotNull Context context, @NotNull EventTagModel itemModel) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(itemModel, "itemModel");
            this.f58581OooO00o = context;
            this.f58582OooO0O0 = itemModel;
            this.f58583OooO0OO = LazyKt.lazy(new OooO0O0());
            this.f58584OooO0Oo = LazyKt.lazy(new OooO0OO());
            this.f58586OooO0o0 = LazyKt.lazy(new C0494OooO00o());
            this.f58585OooO0o = LazyKt.lazy(new OooO0o());
        }

        @NotNull
        public final View OooO00o() {
            Object value = this.f58583OooO0OO.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (View) value;
        }

        public final void OooO0O0(boolean z) {
            Lazy lazy = this.f58584OooO0Oo;
            if (z) {
                Object value = lazy.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((LinearLayout) value).setBackgroundResource(o0Oo0oo.shape_round_green_0dc_r16_stroke1);
            } else {
                Object value2 = lazy.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((LinearLayout) value2).setBackgroundResource(o0Oo0oo.shape_round_gray_f7f7f7_r16);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f58578OooOO0O = activity;
        Lazy lazy = LazyKt.lazy(new o0oOO(this));
        this.f58579OooOO0o = lazy;
        LinearLayout linearLayout = ((oo00oO) lazy.getValue()).f45261OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        OooO0oO(linearLayout);
        OooO0oo(80);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setWindowAnimations(o000000O.animation_bottom_in_bottom_out);
        }
    }
}

package p519o0o0O0oO;

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
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.i1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEventTagDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventTagDialog.kt\ncom/yalla/yalla/ui/dialog/EventTagDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
public final class o0O0o0 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Activity f52672OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f52673OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooO00o f52674OooOOO0;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f52675OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final EventTagModel f52676OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Lazy f52677OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final Lazy f52678OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final Lazy f52679OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final Lazy f52680OooO0o0;

        /* JADX INFO: renamed from: o0o0O0oO.o0O0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0500OooO00o extends Lambda implements Function0<NetImageView> {
            public C0500OooO00o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final NetImageView invoke() {
                return (NetImageView) OooO00o.this.OooO00o().findViewById(oO00O0oO.image);
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<View> {
            public OooO0O0() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return View.inflate(OooO00o.this.f52675OooO00o, oO00OO0O.item_event_keywrod_dialog, null);
            }
        }

        public static final class OooO0OO extends Lambda implements Function0<LinearLayout> {
            public OooO0OO() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final LinearLayout invoke() {
                return (LinearLayout) OooO00o.this.OooO00o().findViewById(oO00O0oO.bg);
            }
        }

        public static final class OooO0o extends Lambda implements Function0<TextView> {
            public OooO0o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final TextView invoke() {
                return (TextView) OooO00o.this.OooO00o().findViewById(oO00O0oO.text);
            }
        }

        public OooO00o(@NotNull Context context, @NotNull EventTagModel itemModel) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(itemModel, "itemModel");
            this.f52675OooO00o = context;
            this.f52676OooO0O0 = itemModel;
            this.f52677OooO0OO = LazyKt.lazy(new OooO0O0());
            this.f52678OooO0Oo = LazyKt.lazy(new OooO0OO());
            this.f52680OooO0o0 = LazyKt.lazy(new C0500OooO00o());
            this.f52679OooO0o = LazyKt.lazy(new OooO0o());
        }

        @NotNull
        public final View OooO00o() {
            Object value = this.f52677OooO0OO.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-itemRoot>(...)");
            return (View) value;
        }

        public final void OooO0O0(boolean z) {
            Lazy lazy = this.f52678OooO0Oo;
            if (z) {
                Object value = lazy.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-layout>(...)");
                ((LinearLayout) value).setBackgroundResource(oOo00OO0.shape_round_green_0dc_r16_stroke1);
            } else {
                Object value2 = lazy.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "<get-layout>(...)");
                ((LinearLayout) value2).setBackgroundResource(oOo00OO0.shape_round_gray_f7f7f7_r16);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(@NotNull FragmentActivity activity) {
        super(activity, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f52672OooOO0O = activity;
        Lazy lazy = LazyKt.lazy(new o0oOo0O0(this));
        this.f52673OooOO0o = lazy;
        LinearLayout linearLayout = ((i1) lazy.getValue()).f58097OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        OooO0oO(linearLayout);
        OooO0oo(80);
        Window window = this.f52535OooO0oO;
        if (window != null) {
            window.setWindowAnimations(oO00Oo00.animation_bottom_in_bottom_out);
        }
    }
}

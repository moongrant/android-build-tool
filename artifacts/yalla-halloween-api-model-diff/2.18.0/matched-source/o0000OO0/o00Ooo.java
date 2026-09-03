package o0000OO0;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Outline;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o0oOO;
import p048OoooooO.oo00oO;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo extends Dialog {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f27518Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final View f27519OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public o00O0O f27520OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f27521OoooO0O;

    public static final class OooO00o extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@NotNull View view, @NotNull Outline result) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(result, "result");
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(@NotNull Function0<Unit> onDismissRequest, @NotNull o00O0O properties, @NotNull View composeView, @NotNull LayoutDirection layoutDirection, @NotNull o0000O0O.OooO density, @NotNull UUID dialogId) {
        super(new ContextThemeWrapper(composeView.getContext(), oo00oO.DialogWindowTheme));
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        this.f27518Oooo = onDismissRequest;
        this.f27520OoooO00 = properties;
        this.f27519OoooO0 = composeView;
        float f = 30;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        o0OoOo0 o0oooo1 = new o0OoOo0(context, window);
        o0oooo1.setTag(o0oOO.compose_view_saveable_id_tag, "Dialog:" + dialogId);
        o0oooo1.setClipChildren(false);
        o0oooo1.setElevation(density.OoooOoo(f));
        o0oooo1.setOutlineProvider(new OooO00o());
        this.f27521OoooO0O = o0oooo1;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            OooO00o(viewGroup);
        }
        setContentView(o0oooo1);
        ViewTreeLifecycleOwner.set(o0oooo1, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(o0oooo1, ViewTreeViewModelStoreOwner.get(composeView));
        p094o000o0OO.o00Ooo.OooO0O0(o0oooo1, p094o000o0OO.o00Ooo.OooO00o(composeView));
        OooO0O0(this.f27518Oooo, this.f27520OoooO00, layoutDirection);
    }

    public static final void OooO00o(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof o0OoOo0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                OooO00o(viewGroup2);
            }
        }
    }

    public final void OooO0O0(@NotNull Function0<Unit> onDismissRequest, @NotNull o00O0O properties, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f27518Oooo = onDismissRequest;
        this.f27520OoooO00 = properties;
        boolean zOooO00o = o0O0O00.OooO00o(properties.f27516OooO0OO, OooOOO0.OooO0OO(this.f27519OoooO0));
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setFlags(zOooO00o ? 8192 : -8193, 8192);
        o0OoOo0 o0oooo1 = this.f27521OoooO0O;
        int i = OooO0O0.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        o0oooo1.setLayoutDirection(i2);
        this.f27521OoooO0O.f27525OoooOo0 = properties.f27517OooO0Oo;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.f27520OoooO00.f27514OooO00o) {
            this.f27518Oooo.invoke();
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (zOnTouchEvent && this.f27520OoooO00.f27515OooO0O0) {
            this.f27518Oooo.invoke();
        }
        return zOnTouchEvent;
    }
}

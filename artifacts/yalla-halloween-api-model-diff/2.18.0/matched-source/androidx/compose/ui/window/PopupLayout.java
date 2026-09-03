package androidx.compose.ui.window;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.facebook.internal.NativeProtocol;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import o0000O0O.OooO;
import o0000O0O.OooOo;
import o0000O0O.Oooo0;
import o0000O0O.Oooo000;
import o0000O0O.o0OoOo0;
import o0000OO0.OooOOO0;
import o0000OO0.o000oOoO;
import o0000OO0.o00oO0o;
import o0000OO0.o0O0O00;
import o0000OO0.o0OO00O;
import o0000OO0.o0OOO0o;
import o0000OO0.o0Oo0oo;
import o0000OO0.o0ooOOo;
import o0000OO0.oo000o;
import o0000OO0.oo0o0Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o0O00o0;
import p048OoooooO.o0oOO;
import p094o000o0OO.o00Ooo;
import p100o000oOoO.o00O0OOO;
import p100o000oOoO.o00OOO00;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u001e\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010,\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00038\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R/\u00104\u001a\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010-8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103RA\u0010<\u001a\r\u0012\u0004\u0012\u00020\u000505¢\u0006\u0002\b62\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u000505¢\u0006\u0002\b68B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>R\"\u0010C\u001a\u00020B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR8\u0010O\u001a\u0004\u0018\u00010I2\b\u0010'\u001a\u0004\u0018\u00010I8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bJ\u0010/\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001b\u0010S\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010+R\u0014\u0010V\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "", "isFocusable", "", "setIsFocusable", "Landroidx/compose/ui/window/SecureFlagPolicy;", "securePolicy", "setSecurePolicy", "clippingEnabled", "setClippingEnabled", "", "layoutDirection", "setLayoutDirection", "", "OoooOo0", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "testTag", "Landroid/view/WindowManager$LayoutParams;", "Ooooo0o", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "()V", NativeProtocol.WEB_DIALOG_PARAMS, "Landroidx/compose/ui/unit/LayoutDirection;", "OooooOO", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "parentLayoutDirection", "<set-?>", "ooOO", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "shouldCreateCompositionOnAttachedToWindow", "Lo0O0O00/Oooo0;", "parentLayoutCoordinates$delegate", "Lo000oOoO/o0O00O;", "getParentLayoutCoordinates", "()Lo0O0O00/Oooo0;", "setParentLayoutCoordinates", "(Lo0O0O00/Oooo0;)V", "parentLayoutCoordinates", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content$delegate", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "content", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "Lo0000OO0/o0OO00O;", "positionProvider", "Lo0000OO0/o0OO00O;", "getPositionProvider", "()Lo0000OO0/o0OO00O;", "setPositionProvider", "(Lo0000OO0/o0OO00O;)V", "Lo0000O0O/o000oOoO;", "popupContentSize$delegate", "getPopupContentSize-bOM6tXw", "()Lo0000O0O/o000oOoO;", "setPopupContentSize-fhxjrPA", "(Lo0000O0O/o000oOoO;)V", "popupContentSize", "canCalculatePosition$delegate", "Lo000oOoO/oO0Oo;", "getCanCalculatePosition", "canCalculatePosition", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "ui_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"ViewConstructor"})
public final class PopupLayout extends AbstractComposeView {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f6755OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public oo0o0Oo f6756OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String testTag;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final View f6758OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o0ooOOo f6759OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final WindowManager f6760Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WindowManager.LayoutParams params;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public o0OO00O f6762OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LayoutDirection parentLayoutDirection;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f6764OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public Oooo0 f6765Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f6766Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f6767OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public final Rect f6768Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @NotNull
    public final int[] f6769o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f6770o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f6773OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f6773OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            PopupLayout.this.OooO00o(ooo00o, this.f6773OoooO00 | 1);
            return Unit.INSTANCE;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupLayout(Function0 function0, oo0o0Oo properties, String testTag, View composeView, OooO density, o0OO00O initialPositionProvider, UUID popupId) {
        o0ooOOo popupLayoutHelper = Build.VERSION.SDK_INT >= 29 ? new o0OOO0o() : new o0Oo0oo();
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(initialPositionProvider, "initialPositionProvider");
        Intrinsics.checkNotNullParameter(popupId, "popupId");
        Intrinsics.checkNotNullParameter(popupLayoutHelper, "popupLayoutHelper");
        Context context = composeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "composeView.context");
        super(context, null, 0, 6, null);
        this.f6755OoooOOO = function0;
        this.f6756OoooOOo = properties;
        this.testTag = testTag;
        this.f6758OoooOoO = composeView;
        this.f6759OoooOoo = popupLayoutHelper;
        Object systemService = composeView.getContext().getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f6760Ooooo00 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(composeView.getContext().getResources().getString(o0O00o0.default_popup_window_title));
        this.params = layoutParams;
        this.f6762OooooO0 = initialPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.f6764OooooOo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f6766Oooooo0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f6767OoooooO = (o00OOO00) o0OOO00.OooO0O0(new o00oO0o(this));
        this.f6768Ooooooo = new Rect();
        setId(R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(composeView));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(composeView));
        o00Ooo.OooO0O0(this, o00Ooo.OooO00o(composeView));
        setTag(o0oOO.compose_view_saveable_id_tag, "Popup:" + popupId);
        setClipChildren(false);
        setElevation(density.OoooOoo((float) 30));
        setOutlineProvider(new oo000o());
        o000oOoO o000oooo2 = o000oOoO.f27511OooO00o;
        this.f6770o0OoOo0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(o000oOoO.f27512OooO0O0);
        this.f6769o00O0O = new int[2];
    }

    private final Function2<oOO00O, Integer, Unit> getContent() {
        return (Function2) this.f6770o0OoOo0.getValue();
    }

    private final int getDisplayHeight() {
        return MathKt.roundToInt(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return MathKt.roundToInt(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0O0O00.Oooo0 getParentLayoutCoordinates() {
        return (o0O0O00.Oooo0) this.f6766Oooooo0.getValue();
    }

    private final void setClippingEnabled(boolean clippingEnabled) {
        OooOO0O(clippingEnabled ? this.params.flags & (-513) : this.params.flags | 512);
    }

    private final void setContent(Function2<? super oOO00O, ? super Integer, Unit> function2) {
        this.f6770o0OoOo0.setValue(function2);
    }

    private final void setIsFocusable(boolean isFocusable) {
        OooOO0O(!isFocusable ? this.params.flags | 8 : this.params.flags & (-9));
    }

    private final void setParentLayoutCoordinates(o0O0O00.Oooo0 oooo0) {
        this.f6766Oooooo0.setValue(oooo0);
    }

    private final void setSecurePolicy(SecureFlagPolicy securePolicy) {
        OooOO0O(o0O0O00.OooO00o(securePolicy, OooOOO0.OooO0OO(this.f6758OoooOoO)) ? this.params.flags | 8192 : this.params.flags & (-8193));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    @UiComposable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-857613600);
        getContent().invoke(ooo00oOooOOo, 0);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(i));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void OooO0o(boolean z, int i, int i2, int i3, int i4) {
        super.OooO0o(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.f6759OoooOoo.OooO00o(this.f6760Ooooo00, this, this.params);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void OooO0oO(int i, int i2) {
        if (this.f6756OoooOOo.f27535OooO0oO) {
            super.OooO0oO(i, i2);
        } else {
            super.OooO0oO(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void OooOO0O(int i) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = i;
        this.f6759OoooOoo.OooO00o(this.f6760Ooooo00, this, layoutParams);
    }

    public final void OooOO0o(@NotNull o00O0OOO parent, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @VisibleForTesting(otherwise = 2)
    public final void OooOOO() {
        o0O0O00.Oooo0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long jOooO00o = parentLayoutCoordinates.OooO00o();
        long jOooO0o = o0O0O00.o000oOoO.OooO0o(parentLayoutCoordinates);
        long jOooO00o2 = Oooo000.OooO00o(MathKt.roundToInt(o00O0O.OooO.OooO0OO(jOooO0o)), MathKt.roundToInt(o00O0O.OooO.OooO0Oo(jOooO0o)));
        OooOo.OooO00o oooO00o = OooOo.f27330OooO0O0;
        int i = (int) (jOooO00o2 >> 32);
        Oooo0 oooo0 = new Oooo0(i, OooOo.OooO0OO(jOooO00o2), ((int) (jOooO00o >> 32)) + i, o0000O0O.o000oOoO.OooO0O0(jOooO00o) + OooOo.OooO0OO(jOooO00o2));
        if (Intrinsics.areEqual(oooo0, this.f6765Oooooo)) {
            return;
        }
        this.f6765Oooooo = oooo0;
        OooOOOo();
    }

    public final void OooOOO0(@Nullable Function0<Unit> function0, @NotNull oo0o0Oo properties, @NotNull String testTag, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f6755OoooOOO = function0;
        this.f6756OoooOOo = properties;
        this.testTag = testTag;
        setIsFocusable(properties.f27529OooO00o);
        setSecurePolicy(properties.f27532OooO0Oo);
        setClippingEnabled(properties.f27533OooO0o);
        int i = OooO0O0.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    public final void OooOOOO(@NotNull o0O0O00.Oooo0 parentLayoutCoordinates) {
        Intrinsics.checkNotNullParameter(parentLayoutCoordinates, "parentLayoutCoordinates");
        setParentLayoutCoordinates(parentLayoutCoordinates);
        OooOOO();
    }

    public final void OooOOOo() {
        o0000O0O.o000oOoO o000ooooM2getPopupContentSizebOM6tXw;
        Oooo0 oooo0 = this.f6765Oooooo;
        if (oooo0 == null || (o000ooooM2getPopupContentSizebOM6tXw = m2getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = o000ooooM2getPopupContentSizebOM6tXw.f27342OooO00o;
        Rect rect = this.f6768Ooooooo;
        this.f6759OoooOoo.OooO0OO(this.f6758OoooOoO, rect);
        o0O0O0o0<String> o0o0o0o0 = OooOOO0.f27467OooO00o;
        long jOooO00o = o0OoOo0.OooO00o(rect.right - rect.left, rect.bottom - rect.top);
        long jOooO00o2 = this.f6762OooooO0.OooO00o(oooo0, this.parentLayoutDirection, j);
        WindowManager.LayoutParams layoutParams = this.params;
        OooOo.OooO00o oooO00o = OooOo.f27330OooO0O0;
        layoutParams.x = (int) (jOooO00o2 >> 32);
        layoutParams.y = OooOo.OooO0OO(jOooO00o2);
        if (this.f6756OoooOOo.f27534OooO0o0) {
            this.f6759OoooOoo.OooO0O0(this, (int) (jOooO00o >> 32), o0000O0O.o000oOoO.OooO0O0(jOooO00o));
        }
        this.f6759OoooOoo.OooO00o(this.f6760Ooooo00, this, this.params);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getKeyCode() == 4 && this.f6756OoooOOo.f27530OooO0O0) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                Function0<Unit> function0 = this.f6755OoooOOO;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f6767OoooooO.getValue()).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    @NotNull
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final o0000O0O.o000oOoO m2getPopupContentSizebOM6tXw() {
        return (o0000O0O.o000oOoO) this.f6764OooooOo.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getPositionProvider, reason: from getter */
    public final o0OO00O getF6762OooooO0() {
        return this.f6762OooooO0;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @NotNull
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @NotNull
    public final String getTestTag() {
        return this.testTag;
    }

    @Nullable
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (!this.f6756OoooOOo.f27531OooO0OO) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = false;
        if ((motionEvent != null && motionEvent.getAction() == 0) && (motionEvent.getX() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || motionEvent.getX() >= getWidth() || motionEvent.getY() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || motionEvent.getY() >= getHeight())) {
            Function0<Unit> function0 = this.f6755OoooOOO;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent != null && motionEvent.getAction() == 4) {
            z = true;
        }
        if (!z) {
            return super.onTouchEvent(motionEvent);
        }
        Function0<Unit> function1 = this.f6755OoooOOO;
        if (function1 != null) {
            function1.invoke();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void setParentLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.parentLayoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m3setPopupContentSizefhxjrPA(@Nullable o0000O0O.o000oOoO o000oooo2) {
        this.f6764OooooOo.setValue(o000oooo2);
    }

    public final void setPositionProvider(@NotNull o0OO00O o0oo00o2) {
        Intrinsics.checkNotNullParameter(o0oo00o2, "<set-?>");
        this.f6762OooooO0 = o0oo00o2;
    }

    public final void setTestTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.testTag = str;
    }
}

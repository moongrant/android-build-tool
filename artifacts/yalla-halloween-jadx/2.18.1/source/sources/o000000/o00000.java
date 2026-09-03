package o000000;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.InternalCoreApi;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.o0000O;
import androidx.compose.ui.platform.o00OO0OO;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.oo00oO;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p049Ooooooo.o0O00000;
import p049Ooooooo.o0O000Oo;
import p054o00000oo.o00OO000;
import p643o0ooOO0.o00O0;

/* JADX INFO: loaded from: classes.dex */
public interface o00000 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f26624OooO0o0 = 0;

    public interface OooO00o {
        void OooO00o();
    }

    void OooO(@NotNull LayoutNode layoutNode, boolean z);

    void OooO00o(boolean z);

    void OooO0O0(@NotNull LayoutNode layoutNode, long j);

    void OooO0OO(@NotNull OooO00o oooO00o);

    long OooO0Oo(long j);

    void OooO0o(@NotNull LayoutNode layoutNode);

    long OooO0o0(long j);

    void OooO0oO(@NotNull LayoutNode layoutNode);

    void OooO0oo(@NotNull LayoutNode layoutNode);

    @NotNull
    o000000 OooOO0O(@NotNull Function1<? super p145o00Oo0.o0O0O00, Unit> function1, @NotNull Function0<Unit> function0);

    void OooOO0o(@NotNull Function0<Unit> function0);

    void OooOOO();

    void OooOOO0();

    void OooOOOo(@NotNull LayoutNode layoutNode, boolean z);

    void OooOOo0(@NotNull LayoutNode layoutNode);

    @NotNull
    androidx.compose.ui.platform.OooOOO0 getAccessibilityManager();

    @ExperimentalComposeUiApi
    @Nullable
    o0O00000 getAutofill();

    @ExperimentalComposeUiApi
    @NotNull
    o0O000Oo getAutofillTree();

    @NotNull
    o0000O getClipboardManager();

    @NotNull
    o0000O0O.OooO getDensity();

    @NotNull
    p710ooOO.o0ooOOo getFocusManager();

    @NotNull
    o00000oO.o000OOo.OooO0O0 getFontFamilyResolver();

    @NotNull
    o00000oO.o0O0O00.OooO00o getFontLoader();

    @NotNull
    p218o00oO0O.oo000o getHapticFeedBack();

    @NotNull
    o00O0 getInputModeManager();

    @NotNull
    LayoutDirection getLayoutDirection();

    @NotNull
    p418o0Oo0oo.o0ooOOo getPointerIconService();

    @NotNull
    o00O0O getSharedDrawScope();

    boolean getShowLayoutBounds();

    @NotNull
    o00000OO getSnapshotObserver();

    @NotNull
    o00OO000 getTextInputService();

    @NotNull
    o00OO0OO getTextToolbar();

    @NotNull
    o00OOOOo getViewConfiguration();

    @NotNull
    oo00oO getWindowInfo();

    boolean requestFocus();

    @InternalCoreApi
    void setShowLayoutBounds(boolean z);
}

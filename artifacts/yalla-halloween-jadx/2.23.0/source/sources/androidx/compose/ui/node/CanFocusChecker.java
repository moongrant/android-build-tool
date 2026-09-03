package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u000eR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/CanFocusChecker;", "Landroidx/compose/ui/focus/FocusProperties;", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "canFocus", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "canFocusValue", "Ljava/lang/Boolean;", "isCanFocusSet", "reset", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class CanFocusChecker implements FocusProperties {

    @NotNull
    public static final CanFocusChecker INSTANCE = new CanFocusChecker();

    @Nullable
    private static Boolean canFocusValue;

    private CanFocusChecker() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getDown() {
        return FocusProperties.CC.OooO00o(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getEnd() {
        return FocusProperties.CC.OooO0O0(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ Function1 getEnter() {
        return FocusProperties.CC.OooO0OO(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ Function1 getExit() {
        return FocusProperties.CC.OooO0Oo(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getLeft() {
        return FocusProperties.CC.OooO0o0(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getNext() {
        return FocusProperties.CC.OooO0o(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getPrevious() {
        return FocusProperties.CC.OooO0oO(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getRight() {
        return FocusProperties.CC.OooO0oo(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getStart() {
        return FocusProperties.CC.OooO(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getUp() {
        return FocusProperties.CC.OooOO0(this);
    }

    public final boolean isCanFocusSet() {
        return canFocusValue != null;
    }

    public final void reset() {
        canFocusValue = null;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z) {
        canFocusValue = Boolean.valueOf(z);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setDown(FocusRequester focusRequester) {
        FocusProperties.CC.OooOO0O(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setEnd(FocusRequester focusRequester) {
        FocusProperties.CC.OooOO0o(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setEnter(Function1 function1) {
        FocusProperties.CC.OooOOO0(this, function1);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setExit(Function1 function1) {
        FocusProperties.CC.OooOOO(this, function1);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setLeft(FocusRequester focusRequester) {
        FocusProperties.CC.OooOOOO(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setNext(FocusRequester focusRequester) {
        FocusProperties.CC.OooOOOo(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setPrevious(FocusRequester focusRequester) {
        FocusProperties.CC.OooOOo0(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setRight(FocusRequester focusRequester) {
        FocusProperties.CC.OooOOo(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setStart(FocusRequester focusRequester) {
        FocusProperties.CC.OooOOoo(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setUp(FocusRequester focusRequester) {
        FocusProperties.CC.OooOo00(this, focusRequester);
    }
}

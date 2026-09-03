package p492o0o00OO0;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.ui.view.moment.MomentsMessagesEditView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p371o0OOo0oO.o0OOO0o;
import p371o0OOo0oO.oo000o;
import p497o0o00OoO.o0000oo;
import p562o0oOo000.o000000;
import p587o0oOooOO.t;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o0000oo f49177OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final AppCompatActivity f49178OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final View f49179OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f49180OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f49181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<oo000o> f49182OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f49183OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f49184OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f49185OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final t f49186OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Function1<o00OOO0, Unit> f49187OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Function3<? super o00OOO0, ? super Boolean, ? super Integer, Unit> f49188OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f49189OooOOO0;

    public o00OOO0() {
        throw null;
    }

    public o00OOO0(AppCompatActivity activity, View vShade, MomentsMessagesEditView.OooO0O0 oooO0O0, MomentsMessagesEditView.OooO0OO oooO0OO) {
        MutableState<Boolean> isEditTextEmpty = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        Boolean bool = Boolean.FALSE;
        MutableState<Boolean> isToAt = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<String> editTextHint = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(o000000.please_chat_friendly), null, 2, null);
        MutableState<oo000o> keyBoardPanelHelper = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        MutableState<Boolean> isKeyBoardShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<Boolean> isSendEnable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        o0000oo panelLayoutState = new o0000oo(activity);
        t facePanelState = new t(true, 287);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(vShade, "vShade");
        Intrinsics.checkNotNullParameter(isEditTextEmpty, "isEditTextEmpty");
        Intrinsics.checkNotNullParameter(isToAt, "isToAt");
        Intrinsics.checkNotNullParameter(editTextHint, "editTextHint");
        Intrinsics.checkNotNullParameter(keyBoardPanelHelper, "keyBoardPanelHelper");
        Intrinsics.checkNotNullParameter(isKeyBoardShow, "isKeyBoardShow");
        Intrinsics.checkNotNullParameter(isSendEnable, "isSendEnable");
        Intrinsics.checkNotNullParameter(panelLayoutState, "panelLayoutState");
        Intrinsics.checkNotNullParameter(facePanelState, "facePanelState");
        this.f49178OooO00o = activity;
        this.f49179OooO0O0 = vShade;
        this.f49180OooO0OO = isEditTextEmpty;
        this.f49181OooO0Oo = isToAt;
        this.f49183OooO0o0 = editTextHint;
        this.f49182OooO0o = keyBoardPanelHelper;
        this.f49184OooO0oO = isKeyBoardShow;
        this.f49185OooO0oo = isSendEnable;
        this.f49177OooO = panelLayoutState;
        this.f49186OooOO0 = facePanelState;
        this.f49187OooOO0O = oooO0O0;
        this.f49188OooOO0o = oooO0OO;
        this.f49189OooOOO0 = LazyKt.lazy(new o00OOO00(this));
    }

    @NotNull
    public final EditTextSpan OooO00o() {
        return (EditTextSpan) this.f49189OooOOO0.getValue();
    }

    public final void OooO0O0(boolean z) {
        if (!z) {
            oo000o value = this.f49182OooO0o.getValue();
            if (value != null) {
                value.OooO00o();
                return;
            }
            return;
        }
        EditTextSpan view = OooO00o();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputMethodManager inputMethodManagerOooO00o = o0OOO0o.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00OOO0)) {
            return false;
        }
        o00OOO0 o00ooo1 = (o00OOO0) obj;
        return Intrinsics.areEqual(this.f49178OooO00o, o00ooo1.f49178OooO00o) && Intrinsics.areEqual(this.f49179OooO0O0, o00ooo1.f49179OooO0O0) && Intrinsics.areEqual(this.f49180OooO0OO, o00ooo1.f49180OooO0OO) && Intrinsics.areEqual(this.f49181OooO0Oo, o00ooo1.f49181OooO0Oo) && Intrinsics.areEqual(this.f49183OooO0o0, o00ooo1.f49183OooO0o0) && Intrinsics.areEqual(this.f49182OooO0o, o00ooo1.f49182OooO0o) && Intrinsics.areEqual(this.f49184OooO0oO, o00ooo1.f49184OooO0oO) && Intrinsics.areEqual(this.f49185OooO0oo, o00ooo1.f49185OooO0oo) && Intrinsics.areEqual(this.f49177OooO, o00ooo1.f49177OooO) && Intrinsics.areEqual(this.f49186OooOO0, o00ooo1.f49186OooOO0) && Intrinsics.areEqual(this.f49187OooOO0O, o00ooo1.f49187OooOO0O) && Intrinsics.areEqual(this.f49188OooOO0o, o00ooo1.f49188OooOO0o);
    }

    public final int hashCode() {
        int iHashCode = (this.f49186OooOO0.hashCode() + ((this.f49177OooO.hashCode() + ((this.f49185OooO0oo.hashCode() + ((this.f49184OooO0oO.hashCode() + ((this.f49182OooO0o.hashCode() + ((this.f49183OooO0o0.hashCode() + ((this.f49181OooO0Oo.hashCode() + ((this.f49180OooO0OO.hashCode() + ((this.f49179OooO0O0.hashCode() + (this.f49178OooO00o.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Function1<o00OOO0, Unit> function1 = this.f49187OooOO0O;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function3<? super o00OOO0, ? super Boolean, ? super Integer, Unit> function3 = this.f49188OooOO0o;
        return iHashCode2 + (function3 != null ? function3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "MomentReplyActivityBottomState(activity=" + this.f49178OooO00o + ", vShade=" + this.f49179OooO0O0 + ", isEditTextEmpty=" + this.f49180OooO0OO + ", isToAt=" + this.f49181OooO0Oo + ", editTextHint=" + this.f49183OooO0o0 + ", keyBoardPanelHelper=" + this.f49182OooO0o + ", isKeyBoardShow=" + this.f49184OooO0oO + ", isSendEnable=" + this.f49185OooO0oo + ", panelLayoutState=" + this.f49177OooO + ", facePanelState=" + this.f49186OooOO0 + ", onSendClick=" + this.f49187OooOO0O + ", onKeyBoardPanelShowListener=" + this.f49188OooOO0o + ")";
    }
}

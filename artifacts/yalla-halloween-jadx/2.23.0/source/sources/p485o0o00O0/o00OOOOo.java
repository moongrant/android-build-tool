package p485o0o00O0;

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
import p367o0OOo0o0.OooOOOO;
import p367o0OOo0o0.Oooo000;
import p490o0o00OOO.OooOo;
import p539o0o0OoOO.y0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooOo f47860OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final AppCompatActivity f47861OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final View f47862OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47863OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47864OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState<OooOOOO> f47865OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f47866OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47867OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47868OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final y0 f47869OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Function1<o00OOOOo, Unit> f47870OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Function3<? super o00OOOOo, ? super Boolean, ? super Integer, Unit> f47871OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f47872OooOOO0;

    public o00OOOOo() {
        throw null;
    }

    public o00OOOOo(AppCompatActivity activity, View vShade, MomentsMessagesEditView.OooO0O0 oooO0O0, MomentsMessagesEditView.OooO0OO oooO0OO) {
        MutableState<Boolean> isEditTextEmpty = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        Boolean bool = Boolean.FALSE;
        MutableState<Boolean> isToAt = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<String> editTextHint = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(o0000.OooO0OO(oO00OOo0.please_chat_friendly), null, 2, null);
        MutableState<OooOOOO> keyBoardPanelHelper = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        MutableState<Boolean> isKeyBoardShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        MutableState<Boolean> isSendEnable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        OooOo panelLayoutState = new OooOo(activity);
        y0 facePanelState = new y0(true, 287);
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
        this.f47861OooO00o = activity;
        this.f47862OooO0O0 = vShade;
        this.f47863OooO0OO = isEditTextEmpty;
        this.f47864OooO0Oo = isToAt;
        this.f47866OooO0o0 = editTextHint;
        this.f47865OooO0o = keyBoardPanelHelper;
        this.f47867OooO0oO = isKeyBoardShow;
        this.f47868OooO0oo = isSendEnable;
        this.f47860OooO = panelLayoutState;
        this.f47869OooOO0 = facePanelState;
        this.f47870OooOO0O = oooO0O0;
        this.f47871OooOO0o = oooO0OO;
        this.f47872OooOOO0 = LazyKt.lazy(new o00OOOO0(this));
    }

    @NotNull
    public final EditTextSpan OooO00o() {
        return (EditTextSpan) this.f47872OooOOO0.getValue();
    }

    public final void OooO0O0(boolean z) {
        if (!z) {
            OooOOOO value = this.f47865OooO0o.getValue();
            if (value != null) {
                value.OooO00o();
                return;
            }
            return;
        }
        EditTextSpan view = OooO00o();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = Oooo000.OooO00o(context);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00OOOOo)) {
            return false;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) obj;
        return Intrinsics.areEqual(this.f47861OooO00o, o00ooooo2.f47861OooO00o) && Intrinsics.areEqual(this.f47862OooO0O0, o00ooooo2.f47862OooO0O0) && Intrinsics.areEqual(this.f47863OooO0OO, o00ooooo2.f47863OooO0OO) && Intrinsics.areEqual(this.f47864OooO0Oo, o00ooooo2.f47864OooO0Oo) && Intrinsics.areEqual(this.f47866OooO0o0, o00ooooo2.f47866OooO0o0) && Intrinsics.areEqual(this.f47865OooO0o, o00ooooo2.f47865OooO0o) && Intrinsics.areEqual(this.f47867OooO0oO, o00ooooo2.f47867OooO0oO) && Intrinsics.areEqual(this.f47868OooO0oo, o00ooooo2.f47868OooO0oo) && Intrinsics.areEqual(this.f47860OooO, o00ooooo2.f47860OooO) && Intrinsics.areEqual(this.f47869OooOO0, o00ooooo2.f47869OooOO0) && Intrinsics.areEqual(this.f47870OooOO0O, o00ooooo2.f47870OooOO0O) && Intrinsics.areEqual(this.f47871OooOO0o, o00ooooo2.f47871OooOO0o);
    }

    public final int hashCode() {
        int iHashCode = (this.f47869OooOO0.hashCode() + ((this.f47860OooO.hashCode() + ((this.f47868OooO0oo.hashCode() + ((this.f47867OooO0oO.hashCode() + ((this.f47865OooO0o.hashCode() + ((this.f47866OooO0o0.hashCode() + ((this.f47864OooO0Oo.hashCode() + ((this.f47863OooO0OO.hashCode() + ((this.f47862OooO0O0.hashCode() + (this.f47861OooO00o.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Function1<o00OOOOo, Unit> function1 = this.f47870OooOO0O;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function3<? super o00OOOOo, ? super Boolean, ? super Integer, Unit> function3 = this.f47871OooOO0o;
        return iHashCode2 + (function3 != null ? function3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "MomentReplyActivityBottomState(activity=" + this.f47861OooO00o + ", vShade=" + this.f47862OooO0O0 + ", isEditTextEmpty=" + this.f47863OooO0OO + ", isToAt=" + this.f47864OooO0Oo + ", editTextHint=" + this.f47866OooO0o0 + ", keyBoardPanelHelper=" + this.f47865OooO0o + ", isKeyBoardShow=" + this.f47867OooO0oO + ", isSendEnable=" + this.f47868OooO0oo + ", panelLayoutState=" + this.f47860OooO + ", facePanelState=" + this.f47869OooOO0 + ", onSendClick=" + this.f47870OooOO0O + ", onKeyBoardPanelShowListener=" + this.f47871OooOO0o + ")";
    }
}

package p490o0o00OOO;

import android.text.Editable;
import android.text.TextWatcher;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/MessageInputState$etMessageInput$2\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n525#2,14:98\n71#3:112\n77#4:113\n*E\n"})
public final class OooOO0O implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f48490OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f48491OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f48492OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MessageEditText f48493OooO0oO;

    public OooOO0O(Ref.ObjectRef objectRef, OooOOOO oooOOOO, Ref.IntRef intRef, MessageEditText messageEditText) {
        this.f48490OooO0Oo = objectRef;
        this.f48492OooO0o0 = oooOOOO;
        this.f48491OooO0o = intRef;
        this.f48493OooO0oO = messageEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        Ref.ObjectRef objectRef = this.f48490OooO0Oo;
        if (Intrinsics.areEqual(objectRef.element, String.valueOf(this.f48492OooO0o0.OooO00o().getText()))) {
            return;
        }
        Ref.IntRef intRef = this.f48491OooO0o;
        OooOOO0.OooO0O0("doAfterTextChanged indexReply = " + intRef.element);
        if (intRef.element != -1) {
            CharSequence charSequence = (CharSequence) objectRef.element;
            MessageEditText messageEditText = this.f48493OooO0oO;
            messageEditText.setText(charSequence);
            try {
                Result.Companion companion = Result.INSTANCE;
                messageEditText.setSelection(intRef.element);
                intRef.element = -1;
                Result.m4213constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m4213constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}

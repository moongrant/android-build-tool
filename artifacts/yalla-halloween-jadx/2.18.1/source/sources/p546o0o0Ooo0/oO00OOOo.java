package p546o0o0Ooo0;

import OooO00o.OooO00o;
import android.text.Editable;
import android.text.TextWatcher;
import com.app.base.framework.view.editTextSpan.MessageEditText;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00OOOo implements TextWatcher {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MessageEditText f44424Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f44425Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO00Oo00 f44426Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f44427Oooo0oo;

    public oO00OOOo(Ref.ObjectRef objectRef, oO00Oo00 oo00oo00, Ref.IntRef intRef, MessageEditText messageEditText) {
        this.f44425Oooo0o = objectRef;
        this.f44426Oooo0oO = oo00oo00;
        this.f44427Oooo0oo = intRef;
        this.f44424Oooo = messageEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        if (Intrinsics.areEqual(this.f44425Oooo0o.element, String.valueOf(this.f44426Oooo0oO.OooO0OO().getText()))) {
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("doAfterTextChanged indexReply = ");
        sbOooO0o0.append(this.f44427Oooo0oo.element);
        o00O00.OooO0O0(sbOooO0o0.toString());
        if (this.f44427Oooo0oo.element != -1) {
            this.f44424Oooo.setText((CharSequence) this.f44425Oooo0o.element);
            this.f44424Oooo.setSelection(this.f44427Oooo0oo.element);
            this.f44427Oooo0oo.element = -1;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}

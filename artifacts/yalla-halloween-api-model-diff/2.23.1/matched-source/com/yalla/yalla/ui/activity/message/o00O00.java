package com.yalla.yalla.ui.activity.message;

import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;
import p675oO0Oo.oOO0Oo00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f25378OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f25379OooO0o0;

    public /* synthetic */ o00O00(Object obj, int i) {
        this.f25378OooO0Oo = i;
        this.f25379OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f25378OooO0Oo;
        Object obj = this.f25379OooO0o0;
        switch (i) {
            case 0:
                SearchFriendActivity this$0 = (SearchFriendActivity) obj;
                int i2 = SearchFriendActivity.f25265OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText = this$0.f25267OooOOo0;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchEdit");
                    editText = null;
                }
                editText.setText("");
                break;
            default:
                oOO0Oo00 ooo0oo00 = (oOO0Oo00) obj;
                ooo0oo00.f59768OooO0Oo.isSelectedForSendHats().setValue(Boolean.valueOf(!ooo0oo00.f59768OooO0Oo.isSelectedForSendHats().getValue().booleanValue()));
                if (ooo0oo00.f59768OooO0Oo.isSelectedForSendHats().getValue().booleanValue()) {
                    ooo0oo00.f59781OooOOo0.setBorderColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_00d8c9));
                } else {
                    ooo0oo00.f59781OooOOo0.setBorderColor(com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.transparent));
                }
                ooo0oo00.OooO0OO();
                break;
        }
    }
}

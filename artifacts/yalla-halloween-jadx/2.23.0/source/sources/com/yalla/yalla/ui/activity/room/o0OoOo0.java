package com.yalla.yalla.ui.activity.room;

import android.view.View;
import android.widget.EditText;
import com.yalla.yalla.ui.view.SetLuckyNumberLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.l4;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OoOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f26945OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f26946OooO0o0;

    public /* synthetic */ o0OoOo0(Object obj, int i) {
        this.f26945OooO0Oo = i;
        this.f26946OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f26945OooO0Oo;
        Object obj = this.f26946OooO0o0;
        switch (i) {
            case 0:
                CreateRoomActivity this$0 = (CreateRoomActivity) obj;
                int i2 = CreateRoomActivity.f26502OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText = this$0.f26503OooOOo;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
                    editText = null;
                }
                editText.setText((CharSequence) null);
                break;
            case 1:
                l4 this$1 = (l4) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
            default:
                SetLuckyNumberLayout this$2 = (SetLuckyNumberLayout) obj;
                int i3 = SetLuckyNumberLayout.f30669OooO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooO0O0(0);
                this$2.f30673OooO0oO = 0;
                Function1<? super Integer, Unit> function1 = this$2.f30670OooO0Oo;
                if (function1 != null) {
                    function1.invoke(0);
                }
                break;
        }
    }
}

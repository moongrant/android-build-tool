package com.google.android.exoplayer2.ui;

import android.view.View;
import android.widget.EditText;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.view.SetLuckyNumberLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.p4;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo000o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f14142OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f14143OooO0o0;

    public /* synthetic */ oo000o(Object obj, int i) {
        this.f14142OooO0Oo = i;
        this.f14143OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f14142OooO0Oo;
        Object obj = this.f14143OooO0o0;
        switch (i) {
            case 0:
                StyledPlayerControlView.OooO00o((StyledPlayerControlView) obj);
                break;
            case 1:
                CreateRoomActivity this$0 = (CreateRoomActivity) obj;
                int i2 = CreateRoomActivity.f26502OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText = this$0.f26507OooOo0;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                    editText = null;
                }
                editText.setText((CharSequence) null);
                break;
            case 2:
                p4 this$1 = (p4) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (this$1.f53088OooO0oo) {
                    this$1.OooO0OO();
                }
                break;
            default:
                SetLuckyNumberLayout this$2 = (SetLuckyNumberLayout) obj;
                int i3 = SetLuckyNumberLayout.f30669OooO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooO0O0(2);
                this$2.f30673OooO0oO = 2;
                Function1<? super Integer, Unit> function1 = this$2.f30670OooO0Oo;
                if (function1 != null) {
                    function1.invoke(2);
                }
                break;
        }
    }
}

package com.google.android.material.textfield;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p675oO0Oo.o0O00O;
import p675oO0Oo.o0OoO00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f17486OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f17487OooO0o0;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f17486OooO0Oo = i;
        this.f17487OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17486OooO0Oo;
        Object obj = this.f17487OooO0o0;
        switch (i) {
            case 0:
                OooOO0O oooOO0O = (OooOO0O) obj;
                EditText editText = oooOO0O.f17490OooO;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    oooOO0O.OooOOo0();
                    break;
                }
                break;
            case 1:
                ExploreTagRoomListActivity this$0 = (ExploreTagRoomListActivity) obj;
                int i2 = ExploreTagRoomListActivity.f26096OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                LinearLayout llTagRoot = this$0.OooOo().f44748OooO0OO.f44783OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(llTagRoot, "llTagRoot");
                o000O.OooO0O0(llTagRoot);
                break;
            default:
                o0O00O this$1 = (o0O00O) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (StringsKt.trim((CharSequence) this$1.f59452OooOO0o.f44688OooO0OO.getText().toString()).toString().length() >= 10) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o0OoO00O(this$1, null), 2, null);
                    break;
                }
                break;
        }
    }
}

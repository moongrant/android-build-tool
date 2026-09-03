package com.yalla.yalla.ui.activity.room;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.yalla.yalla.ui.view.SearchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Oooo0 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f26602OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f26603OooO0O0;

    public /* synthetic */ Oooo0(KeyEvent.Callback callback, int i) {
        this.f26602OooO00o = i;
        this.f26603OooO0O0 = callback;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.f26602OooO00o;
        EditText editText = null;
        KeyEvent.Callback callback = this.f26603OooO0O0;
        switch (i2) {
            case 0:
                CreateRoomActivity this$0 = (CreateRoomActivity) callback;
                int i3 = CreateRoomActivity.f26502OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i != 5) {
                    return false;
                }
                EditText editText2 = this$0.f26507OooOo0;
                if (editText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                } else {
                    editText = editText2;
                }
                editText.requestFocus();
                return true;
            default:
                SearchView this$1 = (SearchView) callback;
                int i4 = SearchView.f30645OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function2<? super Integer, ? super String, Unit> function2 = this$1.searchClickListener;
                if (function2 != null) {
                    Integer numValueOf = Integer.valueOf(i);
                    EditText editText3 = this$1.f30647OooO0Oo;
                    if (editText3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("editSearch");
                    } else {
                        editText = editText3;
                    }
                    function2.invoke(numValueOf, StringsKt.trim((CharSequence) editText.getText().toString()).toString());
                }
                return true;
        }
    }
}

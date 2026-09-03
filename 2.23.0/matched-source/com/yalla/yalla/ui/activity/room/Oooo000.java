package com.yalla.yalla.ui.activity.room;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yalla.yalla.ui.view.SearchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Oooo000 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f26604OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f26605OooO0O0;

    public /* synthetic */ Oooo000(KeyEvent.Callback callback, int i) {
        this.f26604OooO00o = i;
        this.f26605OooO0O0 = callback;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        Function1<? super Boolean, Unit> function1;
        int i = this.f26604OooO00o;
        KeyEvent.Callback callback = this.f26605OooO0O0;
        switch (i) {
            case 0:
                CreateRoomActivity this$0 = (CreateRoomActivity) callback;
                int i2 = CreateRoomActivity.f26502OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ImageView imageView = null;
                if (!z) {
                    TextView textView = this$0.f26509OooOo0O;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvRoomAnnoNum");
                        textView = null;
                    }
                    com.code.android.util.o000OO00.OooO0O0(textView);
                    ImageView imageView2 = this$0.f26510OooOo0o;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivRoomAnnoClear");
                    } else {
                        imageView = imageView2;
                    }
                    com.code.android.util.o000OO00.OooO0O0(imageView);
                } else {
                    TextView textView2 = this$0.f26509OooOo0O;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvRoomAnnoNum");
                        textView2 = null;
                    }
                    com.code.android.util.o000OO00.OooOOOO(textView2);
                    ImageView imageView3 = this$0.f26510OooOo0o;
                    if (imageView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivRoomAnnoClear");
                    } else {
                        imageView = imageView3;
                    }
                    com.code.android.util.o000OO00.OooOOOO(imageView);
                }
                break;
            default:
                SearchView this$1 = (SearchView) callback;
                int i3 = SearchView.f30645OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (z && (function1 = this$1.f30661OooOOoo) != null) {
                    function1.invoke(Boolean.valueOf(z));
                    break;
                }
                break;
        }
    }
}

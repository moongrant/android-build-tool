package com.yalla.support.keyboardpanel;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p470o0Oooo0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yalla/support/keyboardpanel/KeyBoardUtil$hideKeyboard$1", "Landroid/os/ResultReceiver;", "KeyboardPanel_release"}, k = 1, mv = {1, 4, 0})
public final class KeyBoardUtil$hideKeyboard$1 extends ResultReceiver {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Context f20522Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyBoardUtil$hideKeyboard$1(Context context, Handler handler) {
        super(handler);
        this.f20522Oooo0o = context;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, @Nullable Bundle bundle) {
        if (i == 0 || i == 2) {
            Context context = this.f20522Oooo0o;
            Intrinsics.checkNotNullExpressionValue(context, "applicationContext");
            Intrinsics.checkNotNullParameter(context, "context");
            o00O000.OooO00o(context).toggleSoftInput(0, 0);
        }
    }
}

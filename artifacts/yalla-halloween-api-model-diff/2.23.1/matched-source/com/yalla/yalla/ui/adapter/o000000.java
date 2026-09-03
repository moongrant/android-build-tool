package com.yalla.yalla.ui.adapter;

import android.view.View;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000000 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f27002OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f27003OooO0o0;

    public /* synthetic */ o000000(Object obj, int i) {
        this.f27002OooO0Oo = i;
        this.f27003OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f27002OooO0Oo;
        Object obj = this.f27003OooO0o0;
        switch (i) {
            case 0:
                PrivateChatAdapter this$0 = (PrivateChatAdapter) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Unit> function0 = this$0.f26972OooOo;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                BadgeFragment.showPopupWindow$lambda$9((BadgeFragment) obj, view);
                break;
        }
    }
}

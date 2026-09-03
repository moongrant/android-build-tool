package com.facebook.internal;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p509o0o00ooO.p1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00Oo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13721OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f13722OooO0o0;

    public /* synthetic */ o00Oo0(Object obj, int i) {
        this.f13721OooO0Oo = i;
        this.f13722OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f13721OooO0Oo;
        Object obj = this.f13722OooO0o0;
        switch (i) {
            case 0:
                WebDialog.m4142createCrossImage$lambda5((WebDialog) obj, view);
                break;
            case 1:
                TopicSearchActivity this$0 = (TopicSearchActivity) obj;
                int i2 = TopicSearchActivity.f25947OooOoo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (view instanceof RelativeLayout) {
                    View childAt = ((RelativeLayout) view).getChildAt(0);
                    Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
                    CharSequence text = ((TextView) childAt).getText();
                    Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) text;
                    Function1<? super String, Unit> function1 = this$0.f25956OooOoOO;
                    if (function1 != null) {
                        function1.invoke(str);
                    }
                }
                break;
            case 2:
                p1 this$1 = (p1) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function0<Unit> function0 = this$1.f50752OooO0OO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                RoomInfoMemberListFragment.initView$lambda$1((RoomInfoMemberListFragment) obj, view);
                break;
        }
    }
}

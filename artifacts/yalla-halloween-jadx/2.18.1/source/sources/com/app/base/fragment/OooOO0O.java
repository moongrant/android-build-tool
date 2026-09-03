package com.app.base.fragment;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainMomentFragment f11616Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(MainMomentFragment mainMomentFragment) {
        super(0);
        this.f11616Oooo0o = mainMomentFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Moments_post");
        FragmentActivity activity = this.f11616Oooo0o.getActivity();
        if (activity == null) {
            return null;
        }
        MomentSendActivity.f22367o00oO0o.OooO00o(activity);
        return Unit.INSTANCE;
    }
}

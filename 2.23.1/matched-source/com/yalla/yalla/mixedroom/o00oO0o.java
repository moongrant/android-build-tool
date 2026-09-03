package com.yalla.yalla.mixedroom;

import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentType;
import kotlin.jvm.functions.Function1;
import p675oO0Oo.c2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00oO0o implements Function1 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23076OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f23077OooO0o0;

    public /* synthetic */ o00oO0o(Object obj, int i) {
        this.f23076OooO0Oo = i;
        this.f23077OooO0o0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f23076OooO0Oo;
        Object obj2 = this.f23077OooO0o0;
        switch (i) {
            case 0:
                ((MixedRoomActivity) obj2).f22989OoooO00 = (c2) obj;
                break;
            default:
                ((MomentSendModel) obj2).setType(((MomentType) obj).getValue());
                break;
        }
        return null;
    }
}

package com.yalla.yalla.common.manager.data;

import androidx.lifecycle.Observer;
import com.yalla.yalla.service.im.IMMessageService;
import p531o0o0OO0o.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oooo000 implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ Oooo000 f20645OooO0O0 = new Oooo000(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ Oooo000 f20646OooO0OO = new Oooo000(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f20647OooO00o;

    public /* synthetic */ Oooo000(int i) {
        this.f20647OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f20647OooO00o) {
            case 0:
                SharedMainMessageManager.m267_get_storeDot_$lambda22$lambda20((Boolean) obj);
                break;
            default:
                int i = IMMessageService.f21681OoooO0O;
                if (obj instanceof String) {
                    o000OO00.OooO00o((String) obj, true);
                }
                break;
        }
    }
}

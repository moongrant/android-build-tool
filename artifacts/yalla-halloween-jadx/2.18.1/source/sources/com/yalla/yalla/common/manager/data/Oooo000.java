package com.yalla.yalla.common.manager.data;

import androidx.lifecycle.Observer;
import com.yalla.yalla.service.im.IMMessageService;
import p529o0o0OO0o.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oooo000 implements Observer {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ Oooo000 f20625OooO0O0 = new Oooo000(0);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ Oooo000 f20626OooO0OO = new Oooo000(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f20627OooO00o;

    public /* synthetic */ Oooo000(int i) {
        this.f20627OooO00o = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f20627OooO00o) {
            case 0:
                SharedMainMessageManager.m267_get_storeDot_$lambda22$lambda20((Boolean) obj);
                break;
            default:
                int i = IMMessageService.f21662Oooo;
                if (obj instanceof String) {
                    o000OOo0.OooO00o((String) obj, true);
                }
                break;
        }
    }
}

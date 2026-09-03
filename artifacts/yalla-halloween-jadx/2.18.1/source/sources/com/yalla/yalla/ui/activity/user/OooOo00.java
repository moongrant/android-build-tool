package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import com.yalla.yalla.model.VipModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOoo.o000O;
import p593o0oOooo0.o0O000O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VipActivity f23356Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(VipActivity vipActivity) {
        super(0);
        this.f23356Oooo0o = vipActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ArrayList<String> list = new ArrayList<>();
        VipActivity vipActivity = this.f23356Oooo0o;
        VipActivity.OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
        int i = 0;
        for (Object obj : vipActivity.Oooo000().getKaVipModels()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            list.add(String.valueOf(((VipModel) obj).getExperience()));
            i = i2;
        }
        o0O000O o0o000o = o0O000O.f47429OooO00o;
        Intrinsics.checkNotNullParameter(list, "list");
        Bundle bundleOooO00o = o000O00O.OooO0OO.OooO00o();
        bundleOooO00o.putStringArrayList("key", list);
        o000O.OooO00o(o0o000o, bundleOooO00o);
        return Unit.INSTANCE;
    }
}

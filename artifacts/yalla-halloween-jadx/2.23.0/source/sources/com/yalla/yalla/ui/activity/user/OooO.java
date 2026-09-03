package com.yalla.yalla.ui.activity.user;

import com.yalla.yalla.model.CountryModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO implements com.yalla.yalla.app.golbalData.OooO00o.InterfaceC0285OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserCountrySelectActivity f27121OooO00o;

    public OooO(UserCountrySelectActivity userCountrySelectActivity) {
        this.f27121OooO00o = userCountrySelectActivity;
    }

    @Override // com.yalla.yalla.app.golbalData.OooO00o.InterfaceC0285OooO00o
    public final void OooO00o(@NotNull ArrayList<CountryModel> countryModelList) {
        Intrinsics.checkNotNullParameter(countryModelList, "countryModelList");
        int i = UserCountrySelectActivity.f27200OooOoOO;
        UserCountrySelectActivity userCountrySelectActivity = this.f27121OooO00o;
        ((List) userCountrySelectActivity.f27206OooOo0o.getValue()).addAll(countryModelList);
        userCountrySelectActivity.OooOo().OooOoO0((List) userCountrySelectActivity.f27206OooOo0o.getValue());
        userCountrySelectActivity.OooOoO0();
    }
}

package com.yalla.yalla.ui.activity.user;

import com.yalla.yalla.model.CountryModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO implements com.yalla.yalla.app.golbalData.OooO00o.InterfaceC0284OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserCountrySelectActivity f26654OooO00o;

    public OooO(UserCountrySelectActivity userCountrySelectActivity) {
        this.f26654OooO00o = userCountrySelectActivity;
    }

    @Override // com.yalla.yalla.app.golbalData.OooO00o.InterfaceC0284OooO00o
    public final void OooO00o(@NotNull ArrayList<CountryModel> countryModelList) {
        Intrinsics.checkNotNullParameter(countryModelList, "countryModelList");
        int i = UserCountrySelectActivity.f26735OooOoOO;
        UserCountrySelectActivity userCountrySelectActivity = this.f26654OooO00o;
        ((List) userCountrySelectActivity.f26741OooOo0o.getValue()).addAll(countryModelList);
        userCountrySelectActivity.OooOo().OooOoO0((List) userCountrySelectActivity.f26741OooOo0o.getValue());
        userCountrySelectActivity.OooOoO0();
    }
}

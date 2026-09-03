package com.yalla.yalla.module.event.ui.screen;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.yalla.module.event.vm.EventCreateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventCreateViewModel f23874OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(EventCreateViewModel eventCreateViewModel) {
        super(1);
        this.f23874OooO0Oo = eventCreateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        EventCreateViewModel eventCreateViewModel = this.f23874OooO0Oo;
        eventCreateViewModel.setShowPermission(false);
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            String string = uriOooO0O0.toString();
            Intrinsics.checkNotNullExpressionValue(string, "it.toString()");
            eventCreateViewModel.setHeadPath(string);
            eventCreateViewModel.setHeadUrl("");
        }
        return Unit.INSTANCE;
    }
}

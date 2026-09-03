package com.yalla.yalla.ui.activity.main;

import com.app.base.dialog.baseDialog.SelectDialogModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p153o00Oo0oO.o000000O;
import p535o0o0OOoO.oOO000;
import p535o0o0OOoO.oOO0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends Lambda implements Function2<Integer, SelectDialogModel<String>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f22042Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PrivacyActivity f22043Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList<SelectDialogModel<String>> f22044Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(boolean z, PrivacyActivity privacyActivity, ArrayList<SelectDialogModel<String>> arrayList) {
        super(2);
        this.f22042Oooo0o = z;
        this.f22043Oooo0oO = privacyActivity;
        this.f22044Oooo0oo = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, SelectDialogModel<String> selectDialogModel) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(selectDialogModel, "<anonymous parameter 1>");
        if (this.f22042Oooo0o) {
            PrivacyActivity privacyActivity = this.f22043Oooo0oO;
            int tag = this.f22044Oooo0oo.get(iIntValue).getTag();
            String text = this.f22044Oooo0oo.get(iIntValue).getText();
            Intrinsics.checkNotNullExpressionValue(text, "arrayList[index].getShowText()");
            o000000O.OooO0Oo(privacyActivity.f22053OooooOO, tag + "", new oOO0000(privacyActivity, tag, text));
        } else {
            PrivacyActivity privacyActivity2 = this.f22043Oooo0oO;
            int tag2 = this.f22044Oooo0oo.get(iIntValue).getTag();
            String text2 = this.f22044Oooo0oo.get(iIntValue).getText();
            Intrinsics.checkNotNullExpressionValue(text2, "arrayList[index].getShowText()");
            o000000O.OooO0Oo(privacyActivity2.f22054OooooOo, tag2 + "", new oOO000(privacyActivity2, tag2, text2));
        }
        return Unit.INSTANCE;
    }
}

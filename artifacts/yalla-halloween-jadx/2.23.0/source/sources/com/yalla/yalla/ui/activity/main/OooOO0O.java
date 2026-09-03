package com.yalla.yalla.ui.activity.main;

import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.model.PrivacySetModel;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p420o0OoO0OO.o0Oo0oo;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function2<Integer, SelectDialogModel<String>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f25448OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList<SelectDialogModel<String>> f25449OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PrivacyActivity f25450OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(PrivacyActivity privacyActivity, ArrayList arrayList, boolean z) {
        super(2);
        this.f25448OooO0Oo = z;
        this.f25450OooO0o0 = privacyActivity;
        this.f25449OooO0o = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, SelectDialogModel<String> selectDialogModel) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(selectDialogModel, "<anonymous parameter 1>");
        boolean z = this.f25448OooO0Oo;
        final PrivacyActivity privacyActivity = this.f25450OooO0o0;
        ArrayList<SelectDialogModel<String>> arrayList = this.f25449OooO0o;
        if (z) {
            final int tag = arrayList.get(iIntValue).getTag();
            final String text = arrayList.get(iIntValue).getText();
            Intrinsics.checkNotNullExpressionValue(text, "arrayList[index].getShowText()");
            int i = PrivacyActivity.f25458OooOoO;
            privacyActivity.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(tag);
            o0Oo0oo.OooO0O0(privacyActivity.f25466OooOo0o, sb.toString(), new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(tag, text) { // from class: com.yalla.yalla.ui.activity.main.PrivacyActivity$userPrivacyInRoom$1

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ int f25474OooO0o;

                /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                public final /* synthetic */ String f25476OooO0oO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this.f25475OooO0o0);
                    this.f25474OooO0o = tag;
                    this.f25476OooO0oO = text;
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@NotNull String response) {
                    PrivacyActivity privacyActivity2;
                    PrivacySetModel privacySetModel;
                    Intrinsics.checkNotNullParameter(response, "response");
                    AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) oOo00OO0.OooO0O0(response, new TypeToken<AbsJavaBeanApi<String>>() { // from class: com.yalla.yalla.ui.activity.main.PrivacyActivity$userPrivacyInRoom$1$onFinish$result$1
                    }.getType());
                    if ((absJavaBeanApi != null ? (String) absJavaBeanApi.getData() : null) == null || (privacySetModel = (privacyActivity2 = this.f25475OooO0o0).f25463OooOo0) == null) {
                        return;
                    }
                    Intrinsics.checkNotNull(privacySetModel);
                    privacySetModel.setSeeinroom(this.f25474OooO0o);
                    TextView textView = privacyActivity2.f25459OooOOo;
                    Intrinsics.checkNotNull(textView);
                    textView.setText(this.f25476OooO0oO);
                }
            });
        } else {
            final int tag2 = arrayList.get(iIntValue).getTag();
            final String text2 = arrayList.get(iIntValue).getText();
            Intrinsics.checkNotNullExpressionValue(text2, "arrayList[index].getShowText()");
            int i2 = PrivacyActivity.f25458OooOoO;
            privacyActivity.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tag2);
            o0Oo0oo.OooO0O0(privacyActivity.f25462OooOo, sb2.toString(), new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(tag2, text2) { // from class: com.yalla.yalla.ui.activity.main.PrivacyActivity$userPrivacyRelatedRoom$1

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ int f25477OooO0o;

                /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                public final /* synthetic */ String f25479OooO0oO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this.f25478OooO0o0);
                    this.f25477OooO0o = tag2;
                    this.f25479OooO0oO = text2;
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@NotNull String response) {
                    PrivacyActivity privacyActivity2;
                    PrivacySetModel privacySetModel;
                    Intrinsics.checkNotNullParameter(response, "response");
                    AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) oOo00OO0.OooO0O0(response, new TypeToken<AbsJavaBeanApi<String>>() { // from class: com.yalla.yalla.ui.activity.main.PrivacyActivity$userPrivacyRelatedRoom$1$onFinish$result$1
                    }.getType());
                    if ((absJavaBeanApi != null ? (String) absJavaBeanApi.getData() : null) == null || (privacySetModel = (privacyActivity2 = this.f25478OooO0o0).f25463OooOo0) == null) {
                        return;
                    }
                    Intrinsics.checkNotNull(privacySetModel);
                    privacySetModel.setSeeroom(this.f25477OooO0o);
                    TextView textView = privacyActivity2.f25461OooOOoo;
                    Intrinsics.checkNotNull(textView);
                    textView.setText(this.f25479OooO0oO);
                }
            });
        }
        return Unit.INSTANCE;
    }
}

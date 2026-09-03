package com.yalla.yalla.ui.activity.main;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.PrivacySetModel;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p196o00o0Oo.o000O00O;
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00O00O;
import p420o0OoO0OO.o0Oo0oo;
import p426o0OoOO.o0OOO0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/PrivacyActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class PrivacyActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f25458OooOoO = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public TextView f25459OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public ImageView f25460OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public TextView f25461OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public PrivacySetModel f25463OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ImageView f25464OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final String f25465OooOo0O = "isverify";

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final String f25466OooOo0o = "seeinroom";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final String f25462OooOo = "seeroom";

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final String f25467OooOoO0 = "isWaterMark";

    public static final class OooO00o extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList<SelectDialogModel<String>> f25468OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PrivacyActivity f25469OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f25470OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PrivacyActivity privacyActivity, ArrayList arrayList, boolean z) {
            super(3);
            this.f25468OooO0Oo = arrayList;
            this.f25470OooO0o0 = z;
            this.f25469OooO0o = privacyActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
            MutableState<Boolean> it = mutableState;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(it) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(346455773, i, -1, "com.yalla.yalla.ui.activity.main.PrivacyActivity.showOptionsRoom.<anonymous> (PrivacyActivity.kt:116)");
                }
                ArrayList<SelectDialogModel<String>> arrayList = this.f25468OooO0Oo;
                p158o00OoOOO.o00Oo0.OooO0O0(it, null, arrayList, null, false, new OooOO0O(this.f25469OooO0o, arrayList, this.f25470OooO0o0), null, null, 0L, null, null, OooOOO0.f25452OooO0Oo, composer2, (i & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE, 48, 2010);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooOo0(PrivacyActivity privacyActivity, PrivacySetModel privacySetModel) {
        int i;
        int i2;
        privacyActivity.f25463OooOo0 = privacySetModel;
        if (privacySetModel == null) {
            o00O00O.OooO00o("100", new o000O00O(privacyActivity));
            return;
        }
        ImageView imageView = privacyActivity.f25460OooOOo0;
        Intrinsics.checkNotNull(imageView);
        PrivacySetModel privacySetModel2 = privacyActivity.f25463OooOo0;
        Intrinsics.checkNotNull(privacySetModel2);
        imageView.setImageResource(privacySetModel2.getIsverify() == 1 ? oOo00OO0.setting_right_sound_on : oOo00OO0.setting_right_sound_off);
        TextView textView = privacyActivity.f25459OooOOo;
        Intrinsics.checkNotNull(textView);
        PrivacySetModel privacySetModel3 = privacyActivity.f25463OooOo0;
        Intrinsics.checkNotNull(privacySetModel3);
        if (privacySetModel3.getSeeinroom() == 0) {
            i = oO00OOo0.everyone;
        } else {
            PrivacySetModel privacySetModel4 = privacyActivity.f25463OooOo0;
            Intrinsics.checkNotNull(privacySetModel4);
            i = privacySetModel4.getSeeinroom() == 1 ? oO00OOo0.onlyfriends : oO00OOo0.friends_and_fans;
        }
        textView.setText(privacyActivity.getString(i));
        TextView textView2 = privacyActivity.f25461OooOOoo;
        Intrinsics.checkNotNull(textView2);
        PrivacySetModel privacySetModel5 = privacyActivity.f25463OooOo0;
        Intrinsics.checkNotNull(privacySetModel5);
        if (privacySetModel5.getSeeroom() == 0) {
            i2 = oO00OOo0.everyone;
        } else {
            PrivacySetModel privacySetModel6 = privacyActivity.f25463OooOo0;
            Intrinsics.checkNotNull(privacySetModel6);
            i2 = privacySetModel6.getSeeroom() == 1 ? oO00OOo0.onlyfriends : oO00OOo0.friends_and_fans;
        }
        textView2.setText(privacyActivity.getString(i2));
        ImageView imageView2 = privacyActivity.f25464OooOo00;
        Intrinsics.checkNotNull(imageView2);
        PrivacySetModel privacySetModel7 = privacyActivity.f25463OooOo0;
        Intrinsics.checkNotNull(privacySetModel7);
        imageView2.setImageResource(privacySetModel7.getIsWaterMark() == 1 ? oOo00OO0.setting_right_sound_on : oOo00OO0.setting_right_sound_off);
    }

    public final void OooOo0O(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SelectDialogModel().setContent(1, getString(oO00OOo0.onlyfriends)));
        arrayList.add(new SelectDialogModel().setContent(2, getString(oO00OOo0.friends_and_fans)));
        arrayList.add(new SelectDialogModel().setContent(0, getString(oO00OOo0.everyone)));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(346455773, true, new OooO00o(this, arrayList, z)));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p629o0ooO0O0.o00000OO
    public void onClickNotDouble(@NotNull View view) {
        PrivacySetModel privacySetModel;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        int id = view.getId();
        if (id == oO00O0oO.rl_privacy_friend) {
            PrivacySetModel privacySetModel2 = this.f25463OooOo0;
            if (privacySetModel2 == null) {
                return;
            }
            Intrinsics.checkNotNull(privacySetModel2);
            o0Oo0oo.OooO0O0(this.f25465OooOo0O, o0OOO0o.OooO00o(privacySetModel2.getIsverify() != 1 ? 1 : 0), new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.main.PrivacyActivity$optionsFriend$1
                {
                    super(this.f25472OooO0o0);
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@NotNull String response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) p579o0oOoo.oOo00OO0.OooO0O0(response, new TypeToken<AbsJavaBeanApi<String>>() { // from class: com.yalla.yalla.ui.activity.main.PrivacyActivity$optionsFriend$1$onFinish$result$1
                    }.getType());
                    if ((absJavaBeanApi != null ? (String) absJavaBeanApi.getData() : null) != null) {
                        PrivacyActivity privacyActivity = this.f25472OooO0o0;
                        PrivacySetModel privacySetModel3 = privacyActivity.f25463OooOo0;
                        Intrinsics.checkNotNull(privacySetModel3);
                        PrivacySetModel privacySetModel4 = privacyActivity.f25463OooOo0;
                        Intrinsics.checkNotNull(privacySetModel4);
                        privacySetModel3.setIsverify(privacySetModel4.getIsverify() == 1 ? 0 : 1);
                        ImageView imageView = privacyActivity.f25460OooOOo0;
                        Intrinsics.checkNotNull(imageView);
                        PrivacySetModel privacySetModel5 = privacyActivity.f25463OooOo0;
                        Intrinsics.checkNotNull(privacySetModel5);
                        imageView.setImageResource(privacySetModel5.getIsverify() == 1 ? oOo00OO0.setting_right_sound_on : oOo00OO0.setting_right_sound_off);
                    }
                }
            });
            return;
        }
        if (id == oO00O0oO.rl_room_in) {
            OooOo0O(true);
            return;
        }
        if (id == oO00O0oO.rl_room_related) {
            OooOo0O(false);
        } else {
            if (id != oO00O0oO.rl_privacy_isWaterMark || (privacySetModel = this.f25463OooOo0) == null) {
                return;
            }
            Intrinsics.checkNotNull(privacySetModel);
            o0Oo0oo.OooO0O0(this.f25467OooOoO0, o0OOO0o.OooO00o(privacySetModel.getIsWaterMark() != 1 ? 1 : 0), new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.main.PrivacyActivity$optionsIsWaterMark$1
                {
                    super(this.f25473OooO0o0);
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@NotNull String response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) p579o0oOoo.oOo00OO0.OooO0O0(response, new TypeToken<AbsJavaBeanApi<String>>() { // from class: com.yalla.yalla.ui.activity.main.PrivacyActivity$optionsIsWaterMark$1$onFinish$result$1
                    }.getType());
                    if ((absJavaBeanApi != null ? (String) absJavaBeanApi.getData() : null) != null) {
                        PrivacyActivity privacyActivity = this.f25473OooO0o0;
                        PrivacySetModel privacySetModel3 = privacyActivity.f25463OooOo0;
                        Intrinsics.checkNotNull(privacySetModel3);
                        PrivacySetModel privacySetModel4 = privacyActivity.f25463OooOo0;
                        Intrinsics.checkNotNull(privacySetModel4);
                        privacySetModel3.setIsWaterMark(privacySetModel4.getIsWaterMark() == 1 ? 0 : 1);
                        ImageView imageView = privacyActivity.f25464OooOo00;
                        Intrinsics.checkNotNull(imageView);
                        PrivacySetModel privacySetModel5 = privacyActivity.f25463OooOo0;
                        Intrinsics.checkNotNull(privacySetModel5);
                        imageView.setImageResource(privacySetModel5.getIsWaterMark() == 1 ? oOo00OO0.setting_right_sound_on : oOo00OO0.setting_right_sound_off);
                    }
                }
            });
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_privacy);
        OooOOoo(oO00OOo0.my_privacy);
        OooOOo0(1);
        OooOOOO(oO00O0oO.rl_privacy_friend);
        this.f25460OooOOo0 = (ImageView) findViewById(oO00O0oO.iv_privacy_friend);
        OooOOOO(oO00O0oO.rl_room_in);
        this.f25459OooOOo = (TextView) findViewById(oO00O0oO.tv_room_in);
        OooOOOO(oO00O0oO.rl_room_related);
        this.f25461OooOOoo = (TextView) findViewById(oO00O0oO.tv_room_related);
        OooOOOO(oO00O0oO.rl_privacy_isWaterMark);
        this.f25464OooOo00 = (ImageView) findViewById(oO00O0oO.iv_privacy_isWaterMark);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.main.PrivacyActivity$initData$1
            {
                super(this.f25471OooO0o0);
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@NotNull String code, @NotNull String message) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.OooO0O0(code, message);
                PrivacyActivity.OooOo0(this.f25471OooO0o0, null);
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@NotNull String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) p579o0oOoo.oOo00OO0.OooO0O0(response, new TypeToken<AbsJavaBeanApi<PrivacySetModel>>() { // from class: com.yalla.yalla.ui.activity.main.PrivacyActivity$initData$1$onFinish$result$1
                }.getType());
                PrivacyActivity privacyActivity = this.f25471OooO0o0;
                if (absJavaBeanApi == null || absJavaBeanApi.getData() == null) {
                    PrivacyActivity.OooOo0(privacyActivity, null);
                } else {
                    PrivacyActivity.OooOo0(privacyActivity, (PrivacySetModel) absJavaBeanApi.getData());
                }
            }
        };
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44129OooooOo, oO00o000.OooO00o(), oooO0O0);
    }
}

package com.yalla.yalla.ui.activity.main;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.base.activity.BaseActivity;
import com.app.base.dialog.baseDialog.SelectDialogModel;
import com.app.base.model.PrivacySetModel;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p154o00Oo0oO.o000000O;
import p154o00Oo0oO.o0ooOOo;
import p161o00OoOO0.o00OO0OO;
import p258o00ooOO0.o0O0oo0o;
import p537o0o0OOoO.oO;
import p537o0o0OOoO.oO0Oo0o0;
import p537o0o0OOoO.oO0o0000;
import p537o0o0OOoO.oOo00o00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/PrivacyActivity;", "Lcom/app/base/base/activity/BaseActivity;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PrivacyActivity extends BaseActivity {

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final /* synthetic */ int f22065o0OoOo0 = 0;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public ImageView f22066Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public TextView f22067Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public TextView f22068OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public ImageView f22069OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public PrivacySetModel f22070OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final String f22072Oooooo0 = "isverify";

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final String f22071Oooooo = "seeinroom";

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public final String f22073OoooooO = "seeroom";

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public final String f22074Ooooooo = "isWaterMark";

    public static final class OooO00o extends Lambda implements Function3<o0O00O<Boolean>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ ArrayList<SelectDialogModel<String>> f22075Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ PrivacyActivity f22076OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f22077OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ArrayList<SelectDialogModel<String>> arrayList, boolean z, PrivacyActivity privacyActivity) {
            super(3);
            this.f22075Oooo = arrayList;
            this.f22077OoooO00 = z;
            this.f22076OoooO0 = privacyActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0O00O<Boolean> o0o00o2, oOO00O ooo00o, Integer num) {
            o0O00O<Boolean> it = o0o00o2;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o2.Oooo0oo(it) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
                ArrayList<SelectDialogModel<String>> arrayList = this.f22075Oooo;
                o0O0oo0o.OooO0O0(it, null, arrayList, null, false, new OooO0o(this.f22077OoooO00, this.f22076OoooO0, arrayList), null, null, 0L, null, null, OooO.f22055Oooo, ooo00o2, (i & 14) | 512, 48, 2010);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooOoO(PrivacyActivity privacyActivity, PrivacySetModel privacySetModel) {
        int i;
        privacyActivity.f22070OooooOo = privacySetModel;
        if (privacySetModel == null) {
            new p137o00OO0oO.OooO0OO().OooO00o("100", new oO0Oo0o0(privacyActivity, 0));
            return;
        }
        ImageView imageView = privacyActivity.f22066Ooooo00;
        Intrinsics.checkNotNull(imageView);
        PrivacySetModel privacySetModel2 = privacyActivity.f22070OooooOo;
        Intrinsics.checkNotNull(privacySetModel2);
        int isverify = privacySetModel2.getIsverify();
        int i2 = R.drawable.setting_right_sound_off;
        imageView.setImageResource(isverify == 1 ? R.drawable.setting_right_sound_on : R.drawable.setting_right_sound_off);
        TextView textView = privacyActivity.f22067Ooooo0o;
        Intrinsics.checkNotNull(textView);
        PrivacySetModel privacySetModel3 = privacyActivity.f22070OooooOo;
        Intrinsics.checkNotNull(privacySetModel3);
        int seeinroom = privacySetModel3.getSeeinroom();
        int i3 = R.string.friends_and_fans;
        if (seeinroom == 0) {
            i = R.string.everyone;
        } else {
            PrivacySetModel privacySetModel4 = privacyActivity.f22070OooooOo;
            Intrinsics.checkNotNull(privacySetModel4);
            i = privacySetModel4.getSeeinroom() == 1 ? R.string.onlyfriends : R.string.friends_and_fans;
        }
        textView.setText(privacyActivity.getString(i));
        TextView textView2 = privacyActivity.f22068OooooO0;
        Intrinsics.checkNotNull(textView2);
        PrivacySetModel privacySetModel5 = privacyActivity.f22070OooooOo;
        Intrinsics.checkNotNull(privacySetModel5);
        if (privacySetModel5.getSeeroom() == 0) {
            i3 = R.string.everyone;
        } else {
            PrivacySetModel privacySetModel6 = privacyActivity.f22070OooooOo;
            Intrinsics.checkNotNull(privacySetModel6);
            if (privacySetModel6.getSeeroom() == 1) {
                i3 = R.string.onlyfriends;
            }
        }
        textView2.setText(privacyActivity.getString(i3));
        ImageView imageView2 = privacyActivity.f22069OooooOO;
        Intrinsics.checkNotNull(imageView2);
        PrivacySetModel privacySetModel7 = privacyActivity.f22070OooooOo;
        Intrinsics.checkNotNull(privacySetModel7);
        if (privacySetModel7.getIsWaterMark() == 1) {
            i2 = R.drawable.setting_right_sound_on;
        }
        imageView2.setImageResource(i2);
    }

    public final void OooOoOO(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SelectDialogModel().setContent(1, getString(R.string.onlyfriends)));
        arrayList.add(new SelectDialogModel().setContent(2, getString(R.string.friends_and_fans)));
        arrayList.add(new SelectDialogModel().setContent(0, getString(R.string.everyone)));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.app.base.base.activity.IComposeDialog");
        showDialog((String) null, o00O0000.OooO0O0(346455773, true, new OooO00o(arrayList, z, this)));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        switch (view.getId()) {
            case R.id.rl_privacy_friend /* 2131298871 */:
                if (this.f22070OooooOo != null) {
                    String str = this.f22072Oooooo0;
                    StringBuilder sb = new StringBuilder();
                    PrivacySetModel privacySetModel = this.f22070OooooOo;
                    Intrinsics.checkNotNull(privacySetModel);
                    o000000O.OooO0Oo(str, OooO0o.OooO0OO.OooO0O0(sb, privacySetModel.getIsverify() != 1 ? 1 : 0, ""), new oOo00o00(this));
                    break;
                }
                break;
            case R.id.rl_privacy_isWaterMark /* 2131298872 */:
                if (this.f22070OooooOo != null) {
                    String str2 = this.f22074Ooooooo;
                    StringBuilder sb2 = new StringBuilder();
                    PrivacySetModel privacySetModel2 = this.f22070OooooOo;
                    Intrinsics.checkNotNull(privacySetModel2);
                    o000000O.OooO0Oo(str2, OooO0o.OooO0OO.OooO0O0(sb2, privacySetModel2.getIsWaterMark() != 1 ? 1 : 0, ""), new oO(this));
                    break;
                }
                break;
            case R.id.rl_room_in /* 2131298874 */:
                OooOoOO(true);
                break;
            case R.id.rl_room_related /* 2131298875 */:
                OooOoOO(false);
                break;
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_privacy);
        OooOo(R.string.my_privacy);
        OooOo0O(1);
        OooOOo(R.id.rl_privacy_friend);
        this.f22066Ooooo00 = (ImageView) findViewById(R.id.iv_privacy_friend);
        OooOOo(R.id.rl_room_in);
        this.f22067Ooooo0o = (TextView) findViewById(R.id.tv_room_in);
        OooOOo(R.id.rl_room_related);
        this.f22068OooooO0 = (TextView) findViewById(R.id.tv_room_related);
        OooOOo(R.id.rl_privacy_isWaterMark);
        this.f22069OooooOO = (ImageView) findViewById(R.id.iv_privacy_isWaterMark);
        oO0o0000 oo0o0000 = new oO0o0000(this);
        Map<String, String> mapOooO0O0 = o00OO0OO.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
        o00OO0OO.OooO0OO(null, o0ooOOo.f32265OooOoo, o0ooOOo.f32294OooooOo, mapOooO0O0, oo0o0000);
    }
}

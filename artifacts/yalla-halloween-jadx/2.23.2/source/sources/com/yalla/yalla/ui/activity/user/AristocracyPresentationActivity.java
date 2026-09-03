package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o00O00o0;
import p423o0OoO0OO.o00O0O0O;
import p492o0o00OO0.o0O0oo00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/AristocracyPresentationActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAristocracyPresentationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AristocracyPresentationActivity.kt\ncom/yalla/yalla/ui/activity/user/AristocracyPresentationActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,34:1\n22#2,2:35\n*S KotlinDebug\n*F\n+ 1 AristocracyPresentationActivity.kt\ncom/yalla/yalla/ui/activity/user/AristocracyPresentationActivity\n*L\n19#1:35,2\n*E\n"})
public final class AristocracyPresentationActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f26602OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26603OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o00O00o0.class), this, null);

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o000O0 o000o0 = this.f26603OooOOoo;
        setContentView(((o00O00o0) o000o0.getValue()).f44306OooO00o);
        String strOooO0OO = o0000.OooO0OO(o000000.aristocracy_desc_add_subscriptions_tag);
        ((o00O00o0) o000o0.getValue()).f44307OooO0O0.setText(o0000.OooO0OO(o000000.aristocracy_desc_add_subscriptions));
        ((o00O00o0) o000o0.getValue()).f44307OooO0O0.setOnClickListener(new o0O0oo00(1, this));
        TextView addSubscriptions = ((o00O00o0) o000o0.getValue()).f44307OooO0O0;
        Intrinsics.checkNotNullExpressionValue(addSubscriptions, "addSubscriptions");
        o00O0O0O.OooO0Oo(addSubscriptions, o0000.OooO00o(o0OOO0o.color_00d8c9), strOooO0OO);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(o000000.Aristocracy_FAQ);
        }
    }
}

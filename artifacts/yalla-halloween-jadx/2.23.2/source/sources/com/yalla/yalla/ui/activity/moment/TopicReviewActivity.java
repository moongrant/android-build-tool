package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p379o0OOoOOO.oOO00O;
import p405o0Oo0OOO.oOO0O000;
import p492o0o00OO0.oOO00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicReviewActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopicReviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicReviewActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicReviewActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,42:1\n22#2,2:43\n*S KotlinDebug\n*F\n+ 1 TopicReviewActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicReviewActivity\n*L\n15#1:43,2\n*E\n"})
public final class TopicReviewActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f25945OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25946OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oOO0O000.class), this, null);

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o000O0 o000o0 = this.f25946OooOOoo;
        setContentView(((oOO0O000) o000o0.getValue()).f45078OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        oOO00O.OooO0OO(window, 0);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setNavigationIcon(p562o0oOo000.o0Oo0oo.btn_return_black);
            headerLayout.setTitleTextColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.color_alpha_87));
            headerLayout.setTitle(p562o0oOo000.o000000.Create_Topic);
            headerLayout.setBackgroundColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.transparent));
        }
        Button btDone = ((oOO0O000) o000o0.getValue()).f45079OooO0O0;
        Intrinsics.checkNotNullExpressionValue(btDone, "btDone");
        o000O.OooO(btDone, new oOO00OO(this));
    }
}
